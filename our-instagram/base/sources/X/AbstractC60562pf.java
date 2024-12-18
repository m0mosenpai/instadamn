package X;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.2pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60562pf {
    public static final String[] A00 = {"Copyright"};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        if (r4 == null) goto L38;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a3: IF  (r4 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:47:0x00a8 (LINE:163), block:B:45:0x00a3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C206409Bx A00(android.content.Context r6, byte[] r7) {
        /*
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            r0 = 1
            X.C14360o3.A0B(r7, r0)
            r3 = 0
            java.io.File r4 = X.AbstractC13530mf.A04(r6)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            if (r4 == 0) goto L98
            boolean r0 = r4.exists()     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La2
            if (r0 == 0) goto L95
            r0 = 0
            com.google.common.io.FileWriteMode[] r0 = new com.google.common.io.FileWriteMode[r0]     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La2
            com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.A04(r0)     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La2
            X.2pw r6 = X.AbstractC60692pt.A00     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La2
            r0 = 4
            java.util.ArrayDeque r5 = new java.util.ArrayDeque     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La2
            r5.<init>(r0)     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La2
            com.google.common.io.FileWriteMode r0 = com.google.common.io.FileWriteMode.A01     // Catch: java.lang.Throwable -> L60
            boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L60
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L60
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L60
            r5.addFirst(r0)     // Catch: java.lang.Throwable -> L60
            r0.write(r7)     // Catch: java.lang.Throwable -> L60
            r0.flush()     // Catch: java.lang.Throwable -> L60
            X.AbstractC60692pt.A00(r6, r3, r5)     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La2
            boolean r0 = X.C60782q2.A0N     // Catch: java.io.IOException -> L4b java.io.IOException -> L86 java.lang.Throwable -> La2
            java.lang.String r1 = r4.getPath()     // Catch: java.io.IOException -> L4b java.io.IOException -> L86 java.lang.Throwable -> La2
            X.2q2 r0 = new X.2q2     // Catch: java.io.IOException -> L4b java.io.IOException -> L86 java.lang.Throwable -> La2
            r0.<init>(r1)     // Catch: java.io.IOException -> L4b java.io.IOException -> L86 java.lang.Throwable -> La2
            X.9Bx r1 = A01(r0)     // Catch: java.io.IOException -> L4b java.io.IOException -> L86 java.lang.Throwable -> La2
            goto L5c
        L4b:
            r2 = move-exception
            java.lang.String r1 = "ImageMetadataUtil"
            java.lang.String r0 = "Failed to get image metadata"
            X.C0K8.A0F(r1, r0, r2)     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La2
            X.0sk r0 = X.AbstractC06930Yk.A0E()     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La2
            X.9Bx r1 = new X.9Bx     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La2
            r1.<init>(r3, r0)     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La2
        L5c:
            r4.delete()
            return r1
        L60:
            r2 = move-exception
            java.lang.Class<java.io.IOException> r1 = java.io.IOException.class
            java.lang.Object r0 = X.AbstractC63327Shb.A00     // Catch: java.lang.Throwable -> L81
            boolean r0 = r1.isInstance(r2)     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L79
            boolean r0 = r2 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L80
            boolean r0 = r2 instanceof java.lang.Error     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L80
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L81
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L81
        L78:
            throw r0     // Catch: java.lang.Throwable -> L81
        L79:
            java.lang.Object r0 = r1.cast(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L81
            goto L78
        L80:
            throw r2     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            X.AbstractC60692pt.A00(r6, r2, r5)     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La2
            throw r0     // Catch: java.io.IOException -> L86 java.lang.Throwable -> La2
        L86:
            r2 = move-exception
            goto L8c
        L88:
            r0 = move-exception
            throw r0
        L8a:
            r2 = move-exception
            r4 = r3
        L8c:
            java.lang.String r1 = "ImageMetadataUtil"
            java.lang.String r0 = "Failed to get image metadata"
            X.C0K8.A0F(r1, r0, r2)     // Catch: java.lang.Throwable -> La2
            if (r4 == 0) goto L98
        L95:
            r4.delete()
        L98:
            X.0sk r0 = X.AbstractC06930Yk.A0E()
            X.9Bx r1 = new X.9Bx
            r1.<init>(r3, r0)
            return r1
        La2:
            r0 = move-exception
            if (r4 == 0) goto La8
            r4.delete()
        La8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC60562pf.A00(android.content.Context, byte[]):X.9Bx");
    }

    public static final C206409Bx A01(C60782q2 c60782q2) {
        String str;
        byte[] bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = null;
        try {
            String str3 = A00[0];
            String A0N = c60782q2.A0N(str3);
            if (A0N != null) {
                linkedHashMap.put(str3, A0N);
            }
            C61012qP A02 = C60782q2.A02(c60782q2, "Xmp");
            if (A02 != null && (bArr = A02.A03) != null) {
                str2 = new String(bArr, C15W.A05);
            }
        } catch (IOException e) {
            e = e;
            str = "Failed to extract image metadata";
            C0K8.A0F("ImageMetadataUtil", str, e);
            return new C206409Bx(str2, (Map) linkedHashMap);
        } catch (XmlPullParserException e2) {
            e = e2;
            str = "Failed to parse image XMP data";
            C0K8.A0F("ImageMetadataUtil", str, e);
            return new C206409Bx(str2, (Map) linkedHashMap);
        }
        return new C206409Bx(str2, (Map) linkedHashMap);
    }

    public static final void A02(C206409Bx c206409Bx, File file) {
        try {
            boolean z = C60782q2.A0N;
            C60782q2 c60782q2 = new C60782q2(file.getPath());
            for (Map.Entry entry : ((Map) c206409Bx.A00).entrySet()) {
                c60782q2.A0P((String) entry.getKey(), (String) entry.getValue());
            }
            c60782q2.A0P("Xmp", c206409Bx.A01);
            c60782q2.A0O();
        } catch (IOException e) {
            C0K8.A0F("ImageMetadataUtil", "Failed to add image metadata", e);
        }
    }
}
