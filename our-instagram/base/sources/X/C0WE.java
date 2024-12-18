package X;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/* renamed from: X.0WE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0WE {
    public static final Object A01 = new Object();
    public final File A00;

    public final String A01(String str) {
        File file = this.A00;
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        try {
            return AnonymousClass001.A0g(file.getCanonicalPath(), File.separator, str);
        } catch (IOException unused) {
            return null;
        }
    }

    public final File[] A02(String str) {
        File file = this.A00;
        if (!file.isDirectory() || !file.exists()) {
            file = null;
        }
        if (file != null) {
            final String A0R = AnonymousClass001.A0R(A00(str), ".buff");
            File[] listFiles = file.listFiles(new FilenameFilter() { // from class: X.0WD
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return str2.contains(A0R);
                }
            });
            if (listFiles != null) {
                return listFiles;
            }
        }
        return null;
    }

    public C0WE(File file) {
        this.A00 = file;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r1 <= r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r0 = "_";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r1 != '.') goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(java.lang.String r5) {
        /*
            int r4 = r5.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r2 = 0
        La:
            if (r2 >= r4) goto L3f
            char r1 = r5.charAt(r2)
            r0 = 65
            if (r1 < r0) goto L2b
            r0 = 90
            if (r1 <= r0) goto L3a
            r0 = 97
            if (r1 < r0) goto L28
            r0 = 122(0x7a, float:1.71E-43)
        L1e:
            if (r1 <= r0) goto L3a
        L20:
            java.lang.String r0 = "_"
        L22:
            r3.append(r0)
            int r2 = r2 + 1
            goto La
        L28:
            r0 = 95
            goto L34
        L2b:
            r0 = 48
            if (r1 < r0) goto L32
            r0 = 57
            goto L1e
        L32:
            r0 = 45
        L34:
            if (r1 == r0) goto L3a
            r0 = 46
            if (r1 != r0) goto L20
        L3a:
            java.lang.Character r0 = java.lang.Character.valueOf(r1)
            goto L22
        L3f:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WE.A00(java.lang.String):java.lang.String");
    }
}
