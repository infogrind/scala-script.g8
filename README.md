# scala-script.g8

`scala-script.g8` is a Giter8 template for a simple Scala application enabled for the Conscript distribution system.

## Short Introduction to Giter8 and Conscript

This project demonstrates the use of both [Giter8](http://www.foundweekends.org/giter8/) and [Conscript](http://www.foundweekends.org/conscript/), two separate yet complementary tools that enable the easy creation of Scala-based command-line applications.

Giter8 is a templating system that uses Github for easy distribution of and access to templates. Templates can contain variables such as `name` or `version`; upon instantiation of a template, Giter8 prompts for concrete values for these variables. Alternatively, the variable values can be passed directly via command line (see `run.sh` for an example).

Conscript is a distribution and execution mechanism for command-line Scala application. It is what allows you to install Giter8 using the command

    cs foundweekends/giter8

and then running it as

    g8 <template>

The tool in the present repository is the reversion of these steps, so to speak: it is a Giter8 template for a Scala application that has been enabled for Conscript. This means you can instantiate the template using

    g8 infogrind/scala-script.g8

and name it according to your taste during the set-up process, say `myscript`. Once you upload it to your Github account, say `github.com/mygithub`, anyone will be able to install your application using

    cs mygithub/myscript


## Usage

To instantiate the application template, use the command

    g8 infogrind/scala-script.g8

This downloads the template files from Github and instantiates the template locally, asking you to provide the values for the placeholders (name, version, etc.).

After instantiation, the default class is called `HelloWorld`. Rename this as you like, but you’ll need to adapt also the line starting with `class:` in the file `src/main/g8/src/main/conscript/$name$/launchconfig`. The actual application code goes into the function `run` in the default class.

## Testing (for Developers)

To test this template during development, the repository contains a script that automatically instantiates it and runs it as a Consript application. Use the following command:
    ./run.sh "arg1 arg2 arg3 ..."

This runs the 'g8' command to instatiate the template from the file system into the 'target' directory and then runs 'sbt "csRun ..."' in that directory.

(It is currently needed to put the arguments in quotes. If anyone knows how to fix the run script such that multiple arguments are correctly passed to sbt, feel free to fix.)