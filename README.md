Note: The current version is not a real plugin, is an experimental product.
---------------------------------------------------------------------------

Use the winsw.gradle script steps:

### apply

Apply script like apply java plugin

```groovy
//java plugin
apply plugin: 'java'
//winsw script from directory
apply from: "${rootProject.rootDir}/gradle/winsw.gradle"
```

### modify info

You must provide some information to generate deployment files, winsw version, batch startup scripting language, build path, and Spring Profile.
You can find the default configuration of the information at the top of the winsw file.
_Note: The batch scripting language is set to 'zh_CN', change this will not be able to download the script file from batch language files , because there is only one file._


### use task to repackage

After refresh gradle,
you will be able to find an ’winswRepackage‘ task in group ’winsw‘.
just run it, will generate some files in "${project.buildDir}/windows-service/",
run the batch script on windows system, Enter the number and run the command:

1. install
2. uninstall
3. start
4. stop
5. restart
6. status
