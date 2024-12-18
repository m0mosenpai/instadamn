/*
This frida script just instruemnts the specific classes that i identified in the static analysis 
section of the readme that seem to do some kind of root detection. 

When a method that belongs to a target class is called in runtime, this script will log the class name,
method name, timestamp, the arguments passed to the method, and the return values.

TO RUN:

frida -U -f com.instagram.android -l dump_root_detection_functions.js

*/



Java.perform(() => {
    // Define the target classes/methods to hook

    // NOT FOUND!
    // print out test and dev keys
    //try {
    //    androidOSBuild = Java.use('android.os.Build');
    //    console.log("==================================");
    //    console.log("   output from android.os.Build   ");
    //    console.log("==================================");
    //
    //    console.log("Build.TYPE: " + androidOSBuild.TYPE.value);
    //    console.log("Build.TAGS: " + androidOSBuild.TAGS.value);
    //    console.log("Build.VERSION.RELEASE: " + androidOSBuild.VERSION.RELEASE.value);    } catch (err) {
    //    console.log("Error reading android.os.Build: " + err);
    //}

    const targetClassMethods = {
        // class": ["method1", "method2", ...]
        // NOT FOUND (not a function)!
        //"X.AGo": ["report"],
        // NOT FOUND (not a function)!
        //"X.03v": ["E4x"],
        "X.Tdh": [],  // detection done in constructor, instrumented by default
        "X.A5o": [],  // ^ 
        "X.Riu": [],  // ^
        // NOT FOUND (not a function)!
        //"X.XON": ["A00"]
    };



    Object.keys(targetClassMethods).forEach(className => {
        try {
            const targetClass = Java.use(className);

            // Iterate through constructors
            const constructors = targetClass.class.getDeclaredConstructors();
            constructors.forEach(constructor => {
                const parameterTypes = constructor.getParameterTypes().map(type => type.getName()).join(', ');
                console.log(`Hooking constructor of ${className} with parameters: ${parameterTypes}`);
                constructor.implementation = function(...args) {
                    console.log(`\n======================`);
                    console.log(`Class: ${className}`);

                    console.log(`Constructor called with arguments:`);
                    constructor.getParameterTypes().forEach((argType, index) => {
                        const argValue = args[index]?.toString() || "null";
                        console.log(`  ${argType.getName()}: ${argValue}`);
                    });

                    return this.$init(...args);
                };
            });


            // Iterate through specific root detection methods we identified in static analysis
            // const methods = targetClass.class.getDeclaredMethods();
            const methods = targetClassMethods[className];

            methods.forEach(method => {
                const methodName = method.getName();

                targetClass[methodName].overloads.forEach(overload => {
                    // Override the method's implementation
                    overload.implementation = function (...args) {
                        console.log(`\n======================`);
                        console.log(`Class: ${className}`);
                        console.log(`Method: ${methodName}`);
                        
                        // Log function parameters with their types and values
                        console.log(`Parameters:`);
                        overload.argumentTypes.forEach((argType, index) => {
                            const argValue = args[index]?.toString() || "null";
                            console.log(`  ${argType.className}: ${argValue}`);
                        });

                        // Call the original method and capture the result
                        const result = overload.apply(this, args);

                        // Log the return type and value
                        console.log(`Return:`);
                        console.log(`  ${overload.returnType.className}: ${result?.toString() || "null"}`);

                        return result;
                    };
                });
            });
        } catch (err) {
            console.log("\n======================")
            console.error(`Error hooking class ${className}: ${err.message}`);
        }
    });
});
