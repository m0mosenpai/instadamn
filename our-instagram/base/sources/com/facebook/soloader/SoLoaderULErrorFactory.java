package com.facebook.soloader;

import X.AnonymousClass001;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class SoLoaderULErrorFactory {
    public static boolean corruptedLibName(String str) {
        Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
        if (matcher.find()) {
            Log.w("SoLoader", AnonymousClass001.A0R("Library name is corrupted, contains non-ASCII characters ", matcher.group()));
            return true;
        }
        return false;
    }

    public static SoLoaderULError create(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        SoLoaderULError soLoaderULError;
        if (unsatisfiedLinkError.getMessage() != null && unsatisfiedLinkError.getMessage().contains("ELF")) {
            Log.isLoggable("SoLoader", 3);
            soLoaderULError = new SoLoaderULError(str, unsatisfiedLinkError.toString());
        } else if (corruptedLibName(str)) {
            Log.isLoggable("SoLoader", 3);
            soLoaderULError = new SoLoaderULError(str, AnonymousClass001.A0R("corrupted lib name: ", unsatisfiedLinkError.toString()));
        } else {
            soLoaderULError = new SoLoaderULError(str, unsatisfiedLinkError.toString());
        }
        soLoaderULError.initCause(unsatisfiedLinkError);
        return soLoaderULError;
    }
}
