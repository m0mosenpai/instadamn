package com.facebook.soloader;

import X.AbstractC09180dS;
import android.content.Context;

/* loaded from: classes.dex */
public class SoLoaderDSONotFoundError extends SoLoaderULError {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.soloader.SoLoaderULError, com.facebook.soloader.SoLoaderDSONotFoundError] */
    public static SoLoaderDSONotFoundError create(String str, Context context, AbstractC09180dS[] abstractC09180dSArr) {
        StringBuilder sb = new StringBuilder("couldn't find DSO to load: ");
        sb.append(str);
        sb.append("\n\texisting SO sources: ");
        for (int i = 0; i < abstractC09180dSArr.length; i++) {
            sb.append("\n\t\tSoSource ");
            sb.append(i);
            sb.append(": ");
            sb.append(abstractC09180dSArr[i].toString());
        }
        if (context != null) {
            sb.append("\n\tNative lib dir: ");
            sb.append(context.getApplicationInfo().nativeLibraryDir);
            sb.append("\n");
        }
        return new SoLoaderULError(str, sb.toString());
    }

    public SoLoaderDSONotFoundError(String str) {
        super(str);
    }

    public SoLoaderDSONotFoundError(String str, String str2) {
        super(str, str2);
    }
}
