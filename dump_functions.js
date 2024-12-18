/*
This frida script just instruemnts the specific classes that i identified in the static analysis 
section of the README that have something to do with concept scores or 'xray' stuff. 

When a method that belongs to a target class is called in runtime, this script will log the class name,
method name, timestamp, the arguments passed to the method, and the return values.

TO RUN:

frida -U -f com.instagram.android -l dump_functions.js

*/

function parse(value) {
    if (value === null || value === undefined) return "null";

    try {
        // Check for Java objects and call their toString() method
        if (Java.available) {
            if (value.getClass) {
                return value.toString();
            }
        }

        // Handle primitive types or native objects
        if (typeof value === "object") {
            if (value.constructor && value.constructor.name) {
                const keys = Object.keys(value).join(", ");
                return `{ Object of ${value.constructor.name}: ${keys} }`;
            }
            return JSON.stringify(value);
        }

        // Default for strings, numbers, etc.
        return String(value);
    } catch (e) {
        // Fallback for unhandled cases
        return `[Error parsing value: ${e.message}]`;
    }
}


Java.perform(() => {
    // Define the target classes to hook
    const targetClasses = [
        'X.Mrz', // MediaScanner 
        'X.Njm', // SceneunderstandingScanner
        'X.Njn', // VideoSceneunderstandingScanner
        'X.4Ov',  // xray thing
        // NOT FOUND!
        //'com.instagram.creation.p056ml.VisualFeatureStore', // similar to file above
        'X.AIU', // processes bitmaps
        'X.8Pu', // another xray/conceptscore thing
        'X.5MI', // enum for concept scores
        'X.IiM', // SceneRecognizerOutputModel thing
        'X.Lsp', // SceneUnderstandingOutputModel thing
        'X.6En', // SceneUnderstandingResourceLoader
        'X.7Xn', // canned SQL queries for `gallery_media_metadata` table
        'X.ENM', // similar to X.4Ov

        // files with 'xray' somewhere
        // YOU MAY WANT TO COMMENT SOME OF THESE OUT 
        // NOT FOUND!
        //'com.facebook.cameracore.ardelivery.model.VersionedCapability', // this is used everywhere so think about commenting this out
        // NOT FOUND!
        //'com.facebook.cameracore.ardelivery.model.XplatAssetType',
        'com.facebook.graphql.enums.GraphQLAREffectMLModelAssetTypeSet', 
        'com.facebook.graphql.enums.GraphQLAREffectMLModelTypeSet', 
        'com.facebook.graphql.enums.GraphQLVersionedCapabilityTypeSet', // i don't think this and the 2 above are used
        'X.FcN', // ABSTRACT CLASS
        'X.8Gd', // ^^
        'X.4QZ', 
        'X.5MI', // some enum thing
        'X.9JE',
        'X.Kdd', // enum of scores
        'X.5Kb', // ^
        'X.8Qb', // ^
        'X.8Qj', // ^
        'X.GK5', // enum-like thing
        'X.GOH', // ^

        // other potentially relevant classes
        'X.AIR', // 'AiInputBitmap' class equivalent to Jack's X.EAY symbol
        'X.7Xu', //glorified vector that has a curious hashmap (could this store our scores???) as member A00. Used in many of the above classes
        'com.aiplatform.processors.segmentanything.SegmentAnythingOnDeviceProcessorV2'

    ];

    targetClasses.forEach(className => {
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
                    
                    console.log(`Constructor called with arguments ->`);
                    console.log(Object.getOwnPropertyNames(args).join(', '));
                    //console.log(Object.getOwnPropertyNames(args.__proto__).join(', '));
                    constructor.getParameterTypes().forEach((argType, index) => {
                        const argValue = args[index]?.toString() || "null";
                        console.log(`Name: ${argType.getName()}, Value: ${argValue}`);
                    });

                    return this.$init(...args);
                };
            });


            // Iterate through all declared methods in the class
            const methods = targetClass.class.getDeclaredMethods();


            methods.forEach(method => {
                const methodName = method.getName();

                targetClass[methodName].overloads.forEach(overload => {
                    // Override the method's implementation
                    overload.implementation = function (...args) {
                        console.log(`\n======================`);
                        console.log(`Class: ${className}`);
                        console.log(`Method: ${methodName}`);
                        
                        // Log function parameters with their types and values
                        console.log(`Parameters ->`);
                        console.log(Object.getOwnPropertyNames(args).join(', '));
                        //console.log(Object.getOwnPropertyNames(args.__proto__).join(', '));
                        overload.argumentTypes.forEach((argType, index) => {
                            const argValue = args[index]?.toString() || "null";
                            console.log(`Name: ${argType.className}, Value: ${argValue}`);
                        });

                        // Call the original method and capture the result
                        const result = overload.apply(this, args);

                        // Log the return type and value
                        console.log(`Return: ${overload.returnType.className}: ${result?.toString() || "null"}`);

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
