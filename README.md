A [Giter8](https://www.foundweekends.org/giter8/) template for [indigo](https://indigoengine.io/) using sbt and vite. 

# Getting started

Pull the template in locally using `sbt` or `scala-cli`:

```sh
sbt new zetashift/indigo-vite.g8
```

Then install Vite using:

```sh
npm install
```

Then run `sbt fastLinkJS` directly from shell or just `~fastLinkJS` from SBT shell instance.
The next step is to start the development server. To do this run the following in your terminal: 

```sh
# Don't forget to have run sbt fastLinkJS atleast once!
npm run dev
```


# Build for release

To build for release, run the following command:

```sh
npm run build
```

The optimized assets will be saved into `./dist`.

Template license
----------------
Written in 2023 by zetashift

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <https://creativecommons.org/publicdomain/zero/1.0/>.
 
