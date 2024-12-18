package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.072, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass072 extends AbstractC09180dS implements InterfaceC09120dK {
    public final java.util.Set A02;
    public final Map A01 = new HashMap();
    public final Map A00 = new HashMap();

    @Override // X.AbstractC09180dS
    public final String A06() {
        return "DirectApkSoSource";
    }

    private void A01() {
        int indexOf;
        int i;
        for (String str : this.A02) {
            String str2 = null;
            if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf(33)) >= 0 && (i = indexOf + 2) < str.length()) {
                str2 = str.substring(i);
            }
            if (!TextUtils.isEmpty(str2)) {
                ZipFile zipFile = new ZipFile(str.substring(0, str.indexOf(33)));
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        if (nextElement != null && nextElement.getMethod() == 0 && nextElement.getName().startsWith(str2) && nextElement.getName().endsWith(".so")) {
                            String substring = nextElement.getName().substring(str2.length() + 1);
                            Map map = this.A01;
                            synchronized (map) {
                                if (!map.containsKey(str)) {
                                    map.put(str, new HashSet());
                                }
                                ((java.util.Set) map.get(str)).add(substring);
                            }
                        }
                    }
                    zipFile.close();
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                        throw th;
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        if (r0 != null) goto L39;
     */
    @Override // X.AbstractC09180dS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A04(android.os.StrictMode.ThreadPolicy r16, java.lang.String r17, int r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass072.A04(android.os.StrictMode$ThreadPolicy, java.lang.String, int):int");
    }

    @Override // X.AbstractC09180dS
    public final File A05(String str) {
        throw new UnsupportedOperationException("DirectAPKSoSource doesn't support unpackLibrary");
    }

    @Override // X.AbstractC09180dS
    public final String A07(String str) {
        for (String str2 : this.A02) {
            java.util.Set set = (java.util.Set) this.A01.get(str2);
            if (!TextUtils.isEmpty(str2) && set != null && set.contains(str)) {
                return AnonymousClass001.A0g(str2, File.separator, str);
            }
        }
        return null;
    }

    @Override // X.InterfaceC09120dK
    public final AbstractC09180dS ECf(Context context) {
        AnonymousClass072 anonymousClass072 = new AnonymousClass072(context);
        try {
            anonymousClass072.A01();
            return anonymousClass072;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.AbstractC09180dS
    public final String toString() {
        return AnonymousClass001.A0h("DirectApkSoSource", "[root = ", this.A02.toString(), ']');
    }

    public AnonymousClass072(Context context) {
        HashSet hashSet = new HashSet();
        String A00 = A00(context.getApplicationInfo().sourceDir);
        if (A00 != null) {
            hashSet.add(A00);
        }
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                String A002 = A00(str);
                if (A002 != null) {
                    hashSet.add(A002);
                }
            }
        }
        this.A02 = hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r4 = "empty";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r1.append(r4);
        android.util.Log.w("SoLoader", r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r7 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(java.lang.String r7) {
        /*
            java.lang.String[] r6 = X.AbstractC09190dU.A01()
            r5 = 0
            java.lang.String r4 = "null"
            java.lang.String r3 = "empty"
            java.lang.String r2 = "SoLoader"
            if (r7 == 0) goto L24
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L24
            if (r6 == 0) goto L33
            int r0 = r6.length
            if (r0 == 0) goto L33
            java.lang.String r1 = "!/lib/"
            r0 = 0
            r0 = r6[r0]
            java.lang.String r5 = X.AnonymousClass001.A0g(r7, r1, r0)
            return r5
        L24:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Cannot compute fallback path, apk path is "
            r1.append(r0)
            if (r7 != 0) goto L31
            goto L3f
        L31:
            r4 = r3
            goto L3f
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Cannot compute fallback path, supportedAbis is "
            r1.append(r0)
            if (r6 != 0) goto L31
        L3f:
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r2, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass072.A00(java.lang.String):java.lang.String");
    }

    @Override // X.AbstractC09180dS
    public final void A08(int i) {
        A01();
    }
}
