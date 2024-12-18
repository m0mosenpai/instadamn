package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Queue;

/* renamed from: X.SiJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63360SiJ {
    public static final C62997SaL A05;
    public static final C62997SaL A06;

    @Deprecated
    public static final C62997SaL A07;
    public static final C62997SaL A08;
    public static final C62997SaL A09;
    public static final InterfaceC65478Tkv A0A;
    public static final Queue A0B;
    public static final java.util.Set A0C;
    public static final java.util.Set A0D;
    public final DisplayMetrics A00;
    public final InterfaceC65571Tn4 A01;
    public final C63361SiK A02;
    public final C63171SeW A03 = C63171SeW.A00();
    public final List A04;

    public static void A03(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    static {
        EnumC61099RfD enumC61099RfD = EnumC61099RfD.A00;
        InterfaceC65320Thz interfaceC65320Thz = C62997SaL.A04;
        A06 = new C62997SaL(interfaceC65320Thz, enumC61099RfD, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
        A09 = new C62997SaL(interfaceC65320Thz, null, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
        A07 = SNC.A00;
        A08 = new C62997SaL(interfaceC65320Thz, false, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        A05 = new C62997SaL(interfaceC65320Thz, false, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        A0C = Collections.unmodifiableSet(AbstractC58319PtB.A13(new String[]{"image/vnd.wap.wbmp", "image/x-ico"}));
        A0A = new C63851Suj();
        A0D = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        A0B = new ArrayDeque(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap A00(android.graphics.BitmapFactory.Options r8, X.InterfaceC65571Tn4 r9, X.InterfaceC65478Tkv r10, X.InterfaceC65561Tmh r11) {
        /*
            java.lang.String r3 = "Downsampler"
            boolean r0 = r8.inJustDecodeBounds
            if (r0 != 0) goto Lc
            r10.DWP()
            r11.EoZ()
        Lc:
            int r7 = r8.outWidth
            int r6 = r8.outHeight
            java.lang.String r5 = r8.outMimeType
            java.util.concurrent.locks.Lock r4 = X.AbstractC63265SgP.A02
            r4.lock()
            android.graphics.Bitmap r0 = r11.ANq(r8)     // Catch: java.lang.IllegalArgumentException -> L1c java.lang.Throwable -> L65
            goto L5f
        L1c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = "Exception decoding bitmap, outWidth: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L65
            r1.append(r7)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = ", outHeight: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L65
            r1.append(r6)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = ", outMimeType: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L65
            r1.append(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = ", inBitmap: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L65
            android.graphics.Bitmap r0 = r8.inBitmap     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = A02(r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = X.AbstractC166997dE.A0x(r0, r1)     // Catch: java.lang.Throwable -> L65
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L65
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L65
            r0 = 3
            android.util.Log.isLoggable(r3, r0)     // Catch: java.lang.Throwable -> L65
            android.graphics.Bitmap r0 = r8.inBitmap     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L64
            r9.E6v(r0)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L65
            r0 = 0
            r8.inBitmap = r0     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L65
            android.graphics.Bitmap r0 = A00(r8, r9, r10, r11)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L65
        L5f:
            r4.unlock()
            return r0
        L63:
            throw r1     // Catch: java.lang.Throwable -> L65
        L64:
            throw r1     // Catch: java.lang.Throwable -> L65
        L65:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63360SiJ.A00(android.graphics.BitmapFactory$Options, X.Tn4, X.Tkv, X.Tmh):android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (X.AbstractC166987dD.A1a(r35.A00(r1)) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
    
        if (r1 == 270) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        if (r1 == 270) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
    
        if (r1 == 270) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0284 A[Catch: all -> 0x03c9, TryCatch #3 {all -> 0x03c9, blocks: (B:17:0x006a, B:21:0x00a1, B:22:0x00a5, B:24:0x00b2, B:25:0x00b4, B:41:0x00db, B:48:0x00fa, B:50:0x0103, B:52:0x0109, B:54:0x0125, B:55:0x0129, B:58:0x013d, B:60:0x0145, B:61:0x0147, B:63:0x014d, B:65:0x0166, B:66:0x0168, B:69:0x01c4, B:70:0x01c6, B:72:0x01e9, B:73:0x01eb, B:78:0x0241, B:79:0x0245, B:80:0x024c, B:82:0x025a, B:89:0x02d1, B:91:0x02d7, B:94:0x02dc, B:96:0x02e4, B:98:0x02ea, B:100:0x02ee, B:102:0x02f4, B:103:0x02f6, B:104:0x031d, B:105:0x02fc, B:107:0x0311, B:109:0x0322, B:112:0x0384, B:114:0x038a, B:115:0x038d, B:128:0x032f, B:129:0x033d, B:130:0x0340, B:132:0x0369, B:133:0x036d, B:134:0x0393, B:135:0x0396, B:136:0x039a, B:137:0x039e, B:138:0x03ad, B:139:0x03a2, B:140:0x03a6, B:141:0x03aa, B:142:0x03b1, B:144:0x0298, B:146:0x029c, B:149:0x02a2, B:150:0x02a8, B:152:0x0263, B:156:0x0269, B:158:0x0273, B:159:0x027e, B:161:0x0284, B:162:0x027c, B:154:0x0289, B:164:0x0276, B:165:0x01ff, B:166:0x0175, B:168:0x0179, B:170:0x017d, B:172:0x0183, B:173:0x018f, B:175:0x0193, B:177:0x0197, B:178:0x019a, B:179:0x01b4, B:180:0x0138, B:181:0x0206, B:184:0x0239, B:183:0x020d, B:186:0x023a), top: B:16:0x006a, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C63791Stl A01(X.C63729Ssj r35, X.InterfaceC65478Tkv r36, X.C63360SiJ r37, X.InterfaceC65561Tmh r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63360SiJ.A01(X.Ssj, X.Tkv, X.SiJ, X.Tmh, int, int):X.Stl");
    }

    public static String A02(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String A0c = AnonymousClass001.A0c(" (", ")", bitmap.getAllocationByteCount());
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[");
        A1C.append(bitmap.getWidth());
        A1C.append("x");
        A1C.append(bitmap.getHeight());
        A1C.append("] ");
        A1C.append(bitmap.getConfig());
        return AbstractC166997dE.A0x(A0c, A1C);
    }

    public C63360SiJ(DisplayMetrics displayMetrics, InterfaceC65571Tn4 interfaceC65571Tn4, C63361SiK c63361SiK, List list) {
        this.A04 = list;
        Rs8.A00(displayMetrics);
        this.A00 = displayMetrics;
        Rs8.A00(interfaceC65571Tn4);
        this.A01 = interfaceC65571Tn4;
        Rs8.A00(c63361SiK);
        this.A02 = c63361SiK;
    }
}
