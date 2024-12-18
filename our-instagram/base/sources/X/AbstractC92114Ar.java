package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Ar, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC92114Ar {
    public static C92244Be A00(C4BB c4bb, List list, int i, int i2) {
        int i3;
        if (c4bb == null || list == null) {
            return null;
        }
        C4B6 c4b6 = c4bb.A02;
        C4B6[] c4b6Arr = new C4B6[list.size()];
        Iterator it = list.iterator();
        C4B6 c4b62 = null;
        C4B6 c4b63 = null;
        C4B6 c4b64 = null;
        C4B6 c4b65 = null;
        C4B6 c4b66 = null;
        int i4 = 0;
        while (it.hasNext()) {
            C4B6 c4b67 = ((C4BB) it.next()).A02;
            int i5 = i4 + 1;
            c4b6Arr[i4] = c4b67;
            if (c4b62 == null || c4b62.A05 < c4b67.A05) {
                c4b62 = c4b67;
            }
            if (c4b63 == null || c4b63.A05 > c4b67.A05) {
                c4b63 = c4b67;
            }
            int i6 = c4b67.A05;
            int i7 = c4b6.A05;
            if (i6 > i7 && (c4b64 == null || c4b64.A05 > i6)) {
                c4b64 = c4b67;
            }
            if (i6 < i7 && (c4b65 == null || c4b65.A05 < i6)) {
                c4b65 = c4b67;
            }
            if (i2 > 0 && (i3 = c4b67.A0L) < i2 && (c4b66 == null || i3 > c4b66.A0L)) {
                c4b66 = c4b67;
            }
            i4 = i5;
        }
        if (c4b64 == null) {
            c4b64 = null;
        }
        if (c4b65 == null) {
            c4b65 = null;
        }
        if (c4b66 == null) {
            c4b66 = null;
        }
        list.size();
        return new C92244Be(c4b6, c4b64, c4b65, c4b62, c4b66, c4b63, c4bb, c4b6Arr, i);
    }

    public static C92124As A02(android.net.Uri uri, AbstractC92084Ao abstractC92084Ao, String str) {
        String A0R;
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes(ReactWebViewManager.HTML_ENCODING));
            try {
                try {
                    C92124As E3N = abstractC92084Ao.E3N(uri, byteArrayInputStream);
                    try {
                        byteArrayInputStream.close();
                        return E3N;
                    } catch (IOException e) {
                        android.util.Log.e("DashManifestHelper2", String.format("Failed to close manifest input stream", new Object[0]), e);
                        return E3N;
                    }
                } finally {
                }
            } catch (C93194Fv | RuntimeException e2) {
                e = e2;
                android.util.Log.e("DashManifestHelper2", String.format("Failed to parse manifest: %s", uri), e);
                if (uri == null) {
                    A0R = "URL: Unknown";
                } else {
                    A0R = AnonymousClass001.A0R("URL: ", uri.toString());
                }
                if (!(e instanceof C93194Fv)) {
                    e = new IOException(e);
                }
                throw new Exception(A0R, e);
            } catch (IOException e3) {
                android.util.Log.e("DashManifestHelper2", String.format("I/O Error when parsing manifest: %s", uri), e3);
                throw e3;
            }
        } catch (C40L e4) {
            throw e4;
        } catch (IOException unused) {
            return null;
        }
    }

    public static long[] A03(C92124As c92124As) {
        long[] jArr = {-1, -1, -1};
        if (c92124As != null) {
            try {
                int size = c92124As.A0Q.size();
                if (size != 0) {
                    C4BI A02 = c92124As.A02(0);
                    int i = size - 1;
                    C4BI A022 = c92124As.A02(i);
                    int A00 = A02.A00(2);
                    int A002 = A022.A00(2);
                    if (A00 >= 0 && A002 >= 0) {
                        List list = A02.A03;
                        if (!((C4BF) list.get(A00)).A07.isEmpty()) {
                            List list2 = A022.A03;
                            if (!((C4BF) list2.get(A002)).A07.isEmpty()) {
                                C4BB c4bb = (C4BB) ((C4BF) list.get(A00)).A07.get(0);
                                C4BB c4bb2 = (C4BB) ((C4BF) list2.get(A002)).A07.get(0);
                                if ((c4bb instanceof C97814aM) && (c4bb2 instanceof C97814aM)) {
                                    C4BE c4be = ((C97814aM) c4bb).A00;
                                    long j = c4be.A05;
                                    long A003 = c92124As.A00(i);
                                    C4BE c4be2 = ((C97814aM) c4bb2).A00;
                                    long A01 = (c4be2.A01(A003) + j) - 1;
                                    return new long[]{c4be.A02(j) / 1000, (c4be2.A02(A01) + c4be2.A04(A01, -9223372036854775807L)) / 1000, (A01 - j) + 1};
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                android.util.Log.e("DashManifestHelper2", "Could not get segment range from manifest", e);
                return jArr;
            }
        }
        return jArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x015d, code lost:
    
        r0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x015e, code lost:
    
        r17 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0164, code lost:
    
        if (r2.A0A(r5) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0166, code lost:
    
        r17 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0168, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x016c, code lost:
    
        if (r2.A05 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x016e, code lost:
    
        r16 = 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0176, code lost:
    
        if (X.C2C5.A02(X.C2C1.A17) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0178, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x017a, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x017b, code lost:
    
        if (r18 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x017d, code lost:
    
        r3 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0187, code lost:
    
        if ("video/dolby-vision".equals(r0) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x018d, code lost:
    
        if (X.S2J.A00(r33) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x018f, code lost:
    
        r3 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0197, code lost:
    
        if (X.C2C5.A02(X.C2C1.A19) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0199, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x019a, code lost:
    
        if (r19 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x019c, code lost:
    
        r2 = X.RF6.A00(r33, r5, r36, r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01a4, code lost:
    
        if (r2.isEmpty() != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01a6, code lost:
    
        r2 = (X.C2IG) X.C46762Co.A04(r5, r2).get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01b4, code lost:
    
        if (r2.A09(r5) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01ba, code lost:
    
        if (r2.A0A(r5) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01bc, code lost:
    
        r20 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01be, code lost:
    
        r0 = (((r0 | r17) | r20) | r16) | r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x015b, code lost:
    
        if (r19 != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0304, code lost:
    
        if (r1 > 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0306, code lost:
    
        r2.add(r9.get(r3[r10]));
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0311, code lost:
    
        if (r10 >= r1) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0314, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0301, code lost:
    
        if (r3 != null) goto L182;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2, types: [X.4BO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C4BR A01(android.content.Context r33, X.C4BQ r34, X.C4BO r35, X.C4BL r36, X.C92124As r37, boolean r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC92114Ar.A01(android.content.Context, X.4BQ, X.4BO, X.4BL, X.4As, boolean, boolean, boolean):X.4BR");
    }
}
