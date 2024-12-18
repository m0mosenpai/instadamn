package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.1Ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C23191Ay {
    public static C23191Ay A03;
    public String A00;
    public final Context A01;
    public final File A02;

    public File A01(Pair pair) {
        File externalCacheDir;
        String str;
        switch (((Number) pair.first).intValue()) {
            case -1:
                throw new IllegalStateException("Invalid source path");
            case 0:
            case 1:
                externalCacheDir = this.A02;
                break;
            case 2:
                externalCacheDir = this.A01.getFilesDir();
                break;
            case 3:
                externalCacheDir = this.A01.getCacheDir();
                break;
            case 4:
                externalCacheDir = this.A01.getExternalFilesDir(null);
                break;
            case 5:
                externalCacheDir = this.A01.getExternalCacheDir();
                break;
            default:
                throw new IllegalArgumentException("Cask path factory cannot handle this location");
        }
        if (externalCacheDir == null) {
            C0I2.A08("PathFactory", "createRootPathFromType returned null for location=%d path=%s", pair.first, pair.second);
            String str2 = this.A00;
            if (str2 == null) {
                str2 = UUID.randomUUID().toString();
            }
            this.A00 = str2;
            externalCacheDir = new File(this.A02, AnonymousClass001.A0R("cache/tmp_invalid_path/", str2));
        }
        int intValue = ((Number) pair.first).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2 && intValue != 3 && intValue != 4 && intValue != 5) {
                    throw new IllegalArgumentException(AnonymousClass001.A0R("Cask path factory cannot handle this location = ", (String) pair.second));
                }
            } else {
                externalCacheDir = this.A02;
                str = AnonymousClass001.A0R("app_", (String) pair.second);
                return new File(externalCacheDir, str);
            }
        }
        str = (String) pair.second;
        return new File(externalCacheDir, str);
    }

    public C23191Ay(Context context) {
        this.A01 = context.getApplicationContext();
        this.A02 = A00(context);
    }

    public static File A00(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && !TextUtils.isEmpty(applicationInfo.dataDir)) {
            return new File(applicationInfo.dataDir);
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getParentFile();
        }
        throw new IllegalStateException("Path Factory initialised without a valid path");
    }

    public final Map A02(String str, int i) {
        int length;
        Object value;
        File A01 = A01(C1B3.A00(i));
        if (!A01.isDirectory()) {
            return Collections.emptyMap();
        }
        String A032 = AbstractC23201Az.A03(i);
        if (TextUtils.isEmpty(A032)) {
            return Collections.singletonMap(A01, null);
        }
        String[] split = A032.split("/");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put(A01, null);
        for (String str2 : split) {
            boolean equals = str2.equals(str);
            for (Map.Entry entry : hashMap.entrySet()) {
                File[] listFiles = ((File) entry.getKey()).listFiles();
                if (listFiles != null && (length = listFiles.length) != 0) {
                    int i2 = 0;
                    do {
                        File file = listFiles[i2];
                        if (file.isDirectory()) {
                            if (equals) {
                                value = file.getName();
                            } else {
                                value = entry.getValue();
                            }
                            hashMap2.put(file, value);
                        }
                        i2++;
                    } while (i2 < length);
                }
            }
            hashMap.clear();
            hashMap.putAll(hashMap2);
            hashMap2.clear();
        }
        return hashMap;
    }
}
