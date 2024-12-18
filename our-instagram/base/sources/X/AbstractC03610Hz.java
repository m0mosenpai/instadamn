package X;

import dalvik.system.DexFile;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03610Hz {
    public static List A00(String str, DexFile[] dexFileArr) {
        String str2;
        if (str == null) {
            str2 = "Cannot get pgo methods since no profile was given";
        } else {
            if (dexFileArr != null && dexFileArr.length != 0) {
                File file = new File(str);
                if (!file.exists() || file.length() <= 0) {
                    android.util.Log.w("PgoUtils", String.format("Cannot get pgo methods since the given profile doesn't exist yet. Profile Path: %s", str));
                }
                return Collections.emptyList();
            }
            str2 = "Cannot get pgo methods since no dex files were given";
        }
        android.util.Log.e("PgoUtils", str2);
        return Collections.emptyList();
    }
}
