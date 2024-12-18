package com.facebook.voltron.runtime;

import X.AnonymousClass001;
import android.content.Context;

/* loaded from: classes.dex */
public class ModuleApkUtil$ModuleResolver {
    public static String A00(Context context, String str) {
        String[] strArr = context.getApplicationInfo().splitSourceDirs;
        if (strArr != null) {
            String A0g = AnonymousClass001.A0g("split_", str, ".apk");
            for (String str2 : strArr) {
                if (str2.endsWith(A0g)) {
                    return str2;
                }
            }
        }
        return null;
    }
}
