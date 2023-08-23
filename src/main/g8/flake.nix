{
  inputs.nixpkgs.url = "github:nixos/nixpkgs";
  inputs.flake-utils.url = "github:numtide/flake-utils";

  outputs = { nixpkgs, flake-utils, ... }:
    flake-utils.lib.eachDefaultSystem (system:
      let
        pkgs = import nixpkgs { inherit system; };
        jdk = pkgs.jdk17;
        sbtWithJRE = pkgs.sbt.override { jre = jdk; };
        node = pkgs.nodejs;
      in
      {
        devShells.default = pkgs.mkShell {
          packages = [
            jdk
            sbtWithJRE
            node
          ];
        };
      }
    );
}