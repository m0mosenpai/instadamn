package X;

import android.graphics.Bitmap;
import android.provider.MediaStore;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.8ne, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197098ne {
    public static final SimpleDateFormat A02;
    public static final SimpleDateFormat A03;
    public static final C197098ne A01 = new Object();
    public static final android.net.Uri A00 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;

    public static final int A00(C60782q2 c60782q2) {
        int A0M = c60782q2.A0M("Orientation", 0);
        if (A0M != 3) {
            if (A0M != 6) {
                if (A0M != 8) {
                    return 0;
                }
                return 270;
            }
            return 90;
        }
        return 180;
    }

    public static final int A01(String str) {
        C14360o3.A0B(str, 0);
        try {
            return A00(new C60782q2(str));
        } catch (IOException e) {
            C0K8.A0F("ImageManager", "cannot read exif", e);
            return 0;
        }
    }

    public static final File A04(Bitmap bitmap, UserSession userSession, String str, String str2, byte[] bArr) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str, str2);
        A08(bitmap, userSession, file2, bArr);
        return file2;
    }

    public static final String A06(String str) {
        C14360o3.A0B(str, 0);
        try {
            String A0N = new C60782q2(str).A0N("MakerNote");
            if (A0N == null) {
                return "";
            }
            return A0N;
        } catch (IOException e) {
            C0K8.A0F("ImageManager", "cannot read exif", e);
            return "";
        }
    }

    public static final String A07(String str) {
        C14360o3.A0B(str, 0);
        try {
            String A0N = new C60782q2(str).A0N("Model");
            if (A0N == null) {
                return "";
            }
            return A0N;
        } catch (IOException e) {
            C0K8.A0F("ImageManager", "cannot read exif", e);
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8ne, java.lang.Object] */
    static {
        Locale locale = Locale.US;
        A02 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        A03 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A02(X.C60782q2 r4) {
        /*
            java.lang.String r0 = "GPSDateStamp"
            java.lang.String r3 = r4.A0N(r0)     // Catch: java.text.ParseException -> L1e
            java.lang.String r0 = "GPSTimeStamp"
            java.lang.String r2 = r4.A0N(r0)     // Catch: java.text.ParseException -> L1e
            if (r3 == 0) goto L1e
            if (r2 == 0) goto L1e
            java.text.SimpleDateFormat r1 = X.C197098ne.A03     // Catch: java.text.ParseException -> L1e
            r0 = 32
            java.lang.String r0 = X.AnonymousClass001.A0T(r3, r2, r0)     // Catch: java.text.ParseException -> L1e
            java.util.Date r0 = r1.parse(r0)     // Catch: java.text.ParseException -> L1e
            if (r0 != 0) goto L2e
        L1e:
            java.lang.String r0 = "DateTime"
            java.lang.String r1 = r4.A0N(r0)     // Catch: java.text.ParseException -> L33
            if (r1 == 0) goto L33
            java.text.SimpleDateFormat r0 = X.C197098ne.A02     // Catch: java.text.ParseException -> L33
            java.util.Date r0 = r0.parse(r1)     // Catch: java.text.ParseException -> L33
            if (r0 == 0) goto L33
        L2e:
            long r0 = r0.getTime()
            return r0
        L33:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197098ne.A02(X.2q2):long");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:27|(2:97|(2:34|35))|39|40|(1:42)|43|(1:45)|46|47|35|25) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (X.AbstractC43591JPw.A00(425).equals(r1) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
    
        X.C0K8.A0F("ImageList", "Caught exception while deactivating cursor.", r2);
     */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.Ao0, X.BCF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.BCF, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BCF A03(android.content.ContentResolver r9, com.instagram.util.gallery.ImageManager$ImageListParam r10) {
        /*
            java.lang.Integer r8 = r10.A03
            int r4 = r10.A00
            int r3 = r10.A01
            java.lang.String r2 = r10.A04
            android.net.Uri r5 = r10.A02
            boolean r0 = r10.A05
            if (r0 == 0) goto L14
            X.Ao1 r1 = new X.Ao1
            r1.<init>()
            return r1
        L14:
            if (r5 == 0) goto L26
            X.Ao0 r1 = new X.Ao0
            r1.<init>()
            r1.A00 = r5
            r2 = 0
            X.8nm r0 = new X.8nm
            r0.<init>(r9, r5, r2)
            r1.A01 = r0
            return r1
        L26:
            r7 = 0
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            r0 = 176(0xb0, float:2.47E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            r0 = 425(0x1a9, float:5.96E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L45
        L44:
            r0 = 1
        L45:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r0 == 0) goto L61
            java.lang.Integer r0 = X.C05F.A01
            if (r8 == r0) goto L61
            r0 = r4 & 1
            if (r0 == 0) goto L61
            android.net.Uri r1 = X.C197098ne.A00
            X.C14360o3.A08(r1)
            X.Ao3 r0 = new X.Ao3
            r0.<init>(r9, r1, r2, r3)
            r6.add(r0)
        L61:
            java.lang.Integer r0 = X.C05F.A01
            r5 = 1
            if (r8 == r0) goto L6a
            java.lang.Integer r0 = X.C05F.A0N
            if (r8 != r0) goto L7b
        L6a:
            r0 = r4 & 1
            if (r0 == 0) goto L7b
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            X.C14360o3.A08(r1)
            X.Ao3 r0 = new X.Ao3
            r0.<init>(r9, r1, r2, r3)
            r6.add(r0)
        L7b:
            java.util.Iterator r4 = r6.iterator()
            X.C14360o3.A07(r4)
        L82:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc8
            java.lang.Object r3 = r4.next()
            X.C14360o3.A07(r3)
            X.Ao3 r3 = (X.C24180Ao3) r3
            android.database.Cursor r0 = X.C24180Ao3.A00(r3)
            if (r0 == 0) goto L9f
            monitor-enter(r3)
            int r0 = r0.getCount()     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r3)
            if (r0 != 0) goto L82
        L9f:
            android.database.Cursor r0 = X.C24180Ao3.A00(r3)     // Catch: java.lang.IllegalStateException -> Lab
            if (r0 == 0) goto Lb3
            r0.deactivate()     // Catch: java.lang.IllegalStateException -> Lab
            r3.A02 = r5     // Catch: java.lang.IllegalStateException -> Lab
            goto Lb3
        Lab:
            r2 = move-exception
            java.lang.String r1 = "ImageList"
            java.lang.String r0 = "Caught exception while deactivating cursor."
            X.C0K8.A0F(r1, r0, r2)
        Lb3:
            r1 = 0
            r3.A00 = r1
            android.database.Cursor r0 = X.C24180Ao3.A00(r3)
            if (r0 == 0) goto Lbf
            r0.close()
        Lbf:
            r3.A01 = r1
            r4.remove()
            goto L82
        Lc5:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        Lc8:
            int r0 = r6.size()
            if (r0 != r5) goto Ld8
            java.lang.Object r1 = r6.get(r7)
            X.C14360o3.A0A(r1)
        Ld5:
            X.BCF r1 = (X.BCF) r1
            return r1
        Ld8:
            X.BCF[] r0 = new X.BCF[r7]
            java.lang.Object[] r0 = r6.toArray(r0)
            X.BCF[] r0 = (X.BCF[]) r0
            X.Ao2 r1 = new X.Ao2
            r1.<init>(r0)
            goto Ld5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197098ne.A03(android.content.ContentResolver, com.instagram.util.gallery.ImageManager$ImageListParam):X.BCF");
    }

    public static final String A05(String str) {
        try {
            String A0N = new C60782q2(str).A0N("ImageUniqueID");
            if (A0N == null) {
                return "";
            }
            return A0N;
        } catch (IOException e) {
            C0K8.A0F("ImageManager", "cannot read exif", e);
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (r4 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(android.graphics.Bitmap r7, com.instagram.common.session.UserSession r8, java.io.File r9, byte[] r10) {
        /*
            java.lang.String r3 = "ImageManager"
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            r0 = 1
            X.C14360o3.A0B(r9, r0)
            r4 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L7b java.lang.Throwable -> L8d
            r2.<init>(r9)     // Catch: java.io.IOException -> L7b java.lang.Throwable -> L8d
            if (r7 == 0) goto L13
            goto L19
        L13:
            if (r10 == 0) goto L6d
            r2.write(r10)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            goto L4d
        L19:
            X.0Tz r4 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            r0 = 36314807481142077(0x81042000000b3d, double:3.028968706842345E-306)
            boolean r0 = X.C18U.A06(r4, r8, r0)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            if (r0 == 0) goto L54
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            r0 = 36596282457917828(0x82042000010984, double:3.206974615564088E-306)
            long r4 = X.C18U.A01(r4, r8, r0)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            int r0 = (int) r4     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
        L32:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            android.util.Pair r1 = new android.util.Pair     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            java.lang.Object r0 = r1.second     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            java.lang.Object r1 = r1.first     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            X.C14360o3.A06(r0)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            X.C0fK.A02(r1, r7, r2, r0)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
        L4d:
            r9.length()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            r9.getName()     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            goto L69
        L54:
            r0 = 36314807481273150(0x81042000020b3e, double:3.0289687069252363E-306)
            boolean r0 = X.C18U.A06(r4, r8, r0)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            if (r0 == 0) goto L64
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            r0 = 100
            goto L32
        L64:
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            r0 = 75
            goto L32
        L69:
            r2.close()     // Catch: java.lang.Throwable -> L8c
            return
        L6d:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
            throw r0     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L78
        L75:
            r0 = move-exception
            r4 = r2
            goto L91
        L78:
            r1 = move-exception
            r4 = r2
            goto L7c
        L7b:
            r1 = move-exception
        L7c:
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L84
            java.lang.String r0 = ""
        L84:
            X.C0K8.A0I(r3, r0, r1)     // Catch: java.lang.Throwable -> L8d
            if (r4 == 0) goto L8c
            r4.close()     // Catch: java.lang.Throwable -> L8c
        L8c:
            return
        L8d:
            r0 = move-exception
            if (r4 != 0) goto L91
        L90:
            throw r0
        L91:
            r4.close()     // Catch: java.lang.Throwable -> L90
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197098ne.A08(android.graphics.Bitmap, com.instagram.common.session.UserSession, java.io.File, byte[]):void");
    }
}
