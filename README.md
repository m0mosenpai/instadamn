# instagram-re

## Rooting

[Reference](https://xdaforums.com/t/guide-december-6-2023-root-pixel-5-unlock-bootloader-pass-safetynet-both-slots-bootable-more.4187609/)
1. Unlock the Bootloader (System -> Advanced -> Developer Settings -> Enable OEM Unlock and USB Debugging)
2. Boot in Fastboot Mode (Shutdown -> Switch On while holding "Vol Down")
3. Connect the phone to PC
4. Install `fastboot` and run `fastboot flashing unlock` on PC Terminal. Use Volume Keys to confirm on the phone
5. Once completed, run `fastboot reboot` to restart device ("Bootloader is unlocked" warning should be visible on boot now)
6. Download the latest factory image on the device from [here](https://developers.google.com/android/images)
7. Install the latest Magisk app on the device from [here](https://github.com/topjohnwu/magisk/releases)
8. Open Magisk and set the Update Channel in Settings to "Beta"/ "Canary"/ "Stable" as per the installed app version
9. Tap Install next to Magisk
10. Select the factory image .zip file
11. Tap the check mark -> "Let's Go" -> (Optionally save the log by tapping the disk icon) -> Reboot
12. Once rebooted, there should be a new "magisk_patched_xxxx" file in the Downloads folder
13. Connect phone to PC and copy the file to the PC via `adb push /path/to/file/on/device`
14. Open a terminal on the PC and run `fastboot flash boot /path/to/magisk_patched_xxxx` and reboot via `fastboot reboot`
15. Device should now be rooted! Verify by running `adb shell`-> `su`-> `whoami` on the PC terminal
16. To pass SafetyNet and install apps normally from the PlayStore, download the [latest Play Integrity](https://github.com/chiteroman/PlayIntegrityFix/releases)
17. Open Magisk and goto Modules -> Install from Storage -> Play Integrity zip file -> Reboot
18. Once rebooted, open Magisk again -> Settings -> Enable Zygisk -> Enable Denylist -> Configure Denylist -> Tap 3 Dots -> Check System Apps -> Google Play Store, Play Services -> Reboot
19. Once rebooted, run the Play Integrity Module in Magisk -> Airplane mode -> Apps & Notifications -> See all -> Show System -> Clear Google Play Store, Play Services Cache & Data -> Airplane Mode Off -> Reboot
20. To verify Device Certification (Play Integrity is working correctly), open Google Play Store -> Profile Icon -> Settings -> About -> Tap Play Store version 7 times to unlock Developer Mode
21. Go back -> Tap Profile Icon -> Settings -> General Menu -> Developer Options -> Check Integrity
22. If it shows "Basic Integrity" or "Device Integrity", then all is good!

## Set-up

1. On client computer, install `adb` and Frida CLI tools
2. Connect client computer to phone. Ensure phone `USB Debugging` is on
3. Make sure `frida-server` is running on phone
    - Check processes: `ps -e | grep frida`
    - Check netstat: `netstat -tunlp | grep frida`
    - If these don't return anything, run `frida-server` binary: `data/local/tmp/frida-server &`
4. Check if frida connection is successful:
    - On client (outside of adb shell):`frida-ps -U`
    - Open Chrome on device and run: `frida-trace -U -i open -N com.android.chrome`
---
---

&nbsp;

## Static Analysis
### Decompiling/Deobfuscating the apk

jadx base-354_2_0_47_100.apk (latest version 11-29)

Command:
```
jadx -d base-354_2_0_47_100 -j 2 --show-bad-code --deobf base-354_2_0_47_100.apk
```

Argument info:
```
-d                  output directory name
-j 2                2 threads used (default = 4)
--show-bad-code     show inconsistent code (incorrectly decompiled)
--deobf             activate deobfuscation (i truly do not think this changes anything)
```

&nbsp;

## Root Detection

I literally searched for the regex "\bsu\b". In most of the found files, "su" is shorthand for suggested users, but in at least 3 files, **some sort of root detection happens**, usually in the form of: 
```java 
if (!file2.getName().equals("su")) { ...  

// and 

if (new File(".../su").exists()) { ...
```

The offenders are listed below:

#### (A) Class `C26429AGo` (actual name = `X.AGo`)

Class implements `InterfaceC26452AHl`, which does nothing.

Lines 442-462 and 865-877, in method `C26429AGo.report()`

App thinks if device is jailbroken if any of the following apply:
1. `android.os.Build.TAGS` is null or contains `'test-keys'`
2. if creating a new file at `"/system/app/Superuser.apk"`throws a specific error 
3. while iterating through path vars, if creating a new file at `"[path]/su"` throws a specific error

(some of these decompiled sort of badly, for example, the try-catch blocks are off. but it's still clear what the code aims to do)

This class also **extracts a TON of other device information**: for instance, `"app_device_id"`, `"serial_number"`, `"sim_carrier_name"`, network type, and so many more.


Then the device stores the results in some key-value pair  `{"jailbroken": True/False}` in a object of type `C92813cu` (aka `X.3cu`), which is just a map-like object which eventually stores all this information in a `AnalyticsEventDebugInfo` object. Interestingly, one of the errors raised in this class contains `ACRA`, likely the 'Application Crash Reports for Android' library, as a prefix. 


#### (B)  Class `C062003v` (actual name = `X.03v`)

Class implements InterfaceC17570eq, which also basically does nothing.

Lines 25-50, in method`C062003v.E4x(C0FA, EnumC18660gb)`

Detects jailbroken-ness in the exact same way that (A) does. 

If any of the conditions occur, it adds the KV pair {"jail_broken": "yes"/"no"} to the C0FA object, which is a glorified hashmap of errors to the best of my knowledge. When conditions 2 or 3 occur, it logs the error at `AbstractC22400md.A00().DEs(...)`  
I believe this feeds

#### (C) Class `C67222Tdh` (actual name = `X.Tdh`)

Lines 132-146 289-290, in class constructor

Detects jailbroken-ness mostly in the same way that (B) does. Adds KV pair `{"MobileDeviceJailBroken": true/false}` to a hashmap that, in practice, is fetched in the classes that call it as a JSON string.
A great deal of other device data, including whether the devices is detected to be an emulator, is included in this.

Interestingly, this resulting string is labeled as a 'risk_feature' in several classses processsing payments, including `C167996as`, `C167986ar`, 


#### (D) Class `C26143A5o` (actual name = `X.A5o`)

Line 55. Just checks for `'test-keys'` and `'dev-keys'`, also verifies app package signatures. 


#### (E) Class `C65744Riu` (actual name = `X.Riu`)

Line 40. Just checks for `'test-keys'` and `'dev-keys'`, also verifies app package signatures. Detects if Google Play Store is non-existent or self-built and logs result.


#### (F) Class `XON` (actual name = `X.XON`)

Line 92. I believe this sets up some kind of dev environment. It checks for `'test-keys'` and `'dev-keys'` as build type, then changes around some stuff with `StrictMode` and thread reads.


> [!IMPORTANT]
>
> #### Is our root detectable??? 
>
> We should try to instrument the above classes, as well as the classes in `com.instagram.security.attestation.playintegrity` to see if they're called when we use the application. We could also try to dump `android.os.Build.TAGS` and `android.os.Build.TYPE`.
>
> #### If so, does this change any of the activity?

&nbsp;

---

&nbsp;

## Concept Scores

This [Miro Board](https://miro.com/app/board/uXjVL-l3MYQ=/?share_link_id=480922910927) has a diagram of one set of classes that seems to both have to do with the MediaScanner classes and the SceneUnderstandingModel that dumps some concept scores into a SQLite Database.
The classes we should instrument and dump here are:
- `X.Mrz` (in src code, `C54969Mrz`)
    - "MediaScanner" that calls SceneUnderstandingModel and dumps concept scores into database
- `X.Njm` (in src code, `C56919Njm`)
    - "SceneUnderstandingScanner" which actually processes everything
- `X.Njn` (`C56920Njn`)
    - Similar to above, except "VideoSceneUnderstandingScanner"

#### Classes that contain the string 'concept' somewhere:

- **X.4Ov (`C113584Ov`)**
    - this is obviously processing videos and reducing them to concept scores. high priority to instrument
    - very similar to `VisualFeatureStore.java` which we should also instrument
- `X.AIU`
    - an enumeration that contains "CONCEPT_MAP_READY" and "PROCESSING_BITMAP"
- `X.8Pu`
    - another video processing-like function creating data structures with labels like "CONCEPT_SCORES" and "XRAY"
- `X.5MI` (`C5MI`)
    - Some enumeration thing holding variables for loading the model, i.e.
    - ```new C5MI("SCENE_UNDERSTANDING", "SceneUnderstanding", "PYTORCH_MODEL", AbstractC78652vA.A1R("xray_vocab.json", "concept_vocab.json"), 2, 10020L);```
- `X.IiM` (`C44721IiM`)
    - Something that has to do with the SceneRecognizerOutputModel with a concept & score
- `X.Lsp` (`C52556Lsp`)
    - the equivalent of the above but for the SceneUnderstanding model
- `X.NUs` (`C56181NUs`) and `X.PFZ`
    - this has to do with music so we can probably ignore it
- `X.6En` (`C161866En`) --> **in miro diagram!!**
    - SceneUnderstandingResourceLoader, reads concept lists at "assets/concept_list.classes" and additioal local file if exists
- `X.7Xn`  (`C192287Xn`) 
    - Canned SQL queries for `gallery_media_metadata` table
- `X.ENM` 
    - some massive, crazy video processing code processing concepts and concept scores. ** Similar to X.4Ov, high priority to instrument**

#### Classes that contain 'xray' somewhere

- `com.facebook.cameracore.ardelivery.model.VersionedCapability` // this is used everywhere so think about commenting this out
- `com.facebook.cameracore.ardelivery.model.XplatAssetType`
- `com.facebook.graphql.enums.GraphQLAREffectMLModelAssetTypeSet` 
- `com.facebook.graphql.enums.GraphQLAREffectMLModelTypeSet`
- `com.facebook.graphql.enums.GraphQLVersionedCapabilityTypeSet` // i don't think this and the 2 above are used
- `X.FcN` // ABSTRACT CLASS
- `X.8Gd` // ^^
- `X.4QZ`
- `X.5MI` // some enum thing
- `X.9JE`
- `X.Kdd` // enum of scores
- `X.5Kb` // ^
- `X.8Qb` // ^
- `X.8Qj` // ^
- `X.GK5` // enum-like thing
- `X.GOH` // ^


#### Other Relevant Classes???
- `X.AIR`
    - 'AiInputBitmap' class equivalent to Jack's X.EAY symbol
-  `X.7Xu` (`C192357Xu`)
    - glorified vector that has a curious hashmap (could this store our scores???) as member A00. Used in many of the above
- `SegmentAnythingOnDeviceProcessorV2`
    - this is some sort of clip processing module (uses/calls an ML model too?) that Jack's symbols utilize

---
---

&nbsp;

# Dynamic Analysis

##  Initial experimentation

The following frida script `dump_functions.js` just instruemnts the specific classes that I identified in the static analysis section of this README that have something to do with concept scores or 'xray' stuff. 

When a method that belongs to a target class is called in runtime, this script will log the class name,
method name, timestamp, the arguments passed to the method, and the return values.

```
frida -U -n com.instagram.android -s dump_functions.js


# BONUS: instrument functions that might contain root detection
frida -U -n com.instagram.android -s dump_root_detection_functions.js
```


