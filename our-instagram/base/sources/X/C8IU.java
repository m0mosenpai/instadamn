package X;

import com.instagram.common.gallery.Medium;
import java.io.File;
import java.util.UUID;

/* renamed from: X.8IU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8IU {
    /* JADX WARN: Can't wrap try/catch for region: R(5:44|(3:(2:46|(1:48)(0))|50|51)(0)|49|50|51) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:8|(6:(2:10|(1:12)(0))|14|(1:16)(1:33)|18|19|(3:21|22|23))(0)|13|14|(0)(0)|18|19|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        X.C0K8.A0L("Medium", "Failed to extract duration from %s", r3, r11.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[Catch: IOException -> 0x0060, all -> 0x00b8, TryCatch #2 {all -> 0x00b8, blocks: (B:8:0x001c, B:10:0x0039, B:12:0x003f, B:14:0x0043, B:16:0x0053, B:19:0x005a, B:23:0x0076, B:32:0x0062, B:44:0x0084, B:46:0x00a1, B:48:0x00a7, B:51:0x00ae), top: B:4:0x0017, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.common.gallery.Medium A00(android.app.Activity r10, android.net.Uri r11, int r12) {
        /*
            r8 = 0
            X.C14360o3.A0B(r10, r8)
            r0 = 2
            X.C14360o3.A0B(r11, r0)
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r0]
            r4 = 0
            r6 = 1
            android.content.ContentResolver r0 = r10.getContentResolver()     // Catch: java.io.IOException -> Lbf
            java.io.InputStream r5 = r0.openInputStream(r11)     // Catch: java.io.IOException -> Lbf
            r3 = -1
            if (r12 == r6) goto L84
            r0 = 3
            if (r12 != r0) goto L7b
            java.lang.String r6 = "tmp_video_"
            java.lang.String r2 = ".mp4"
            X.1B4 r1 = X.AbstractC23881Ey.A00()     // Catch: java.lang.Throwable -> Lb8
            r0 = 1532730990(0x5b5b9e6e, float:6.1817215E16)
            java.io.File r0 = r1.AXd(r4, r0)     // Catch: java.lang.Throwable -> Lb8
            java.io.File r9 = java.io.File.createTempFile(r6, r2, r0)     // Catch: java.lang.Throwable -> Lb8
            r9.getClass()     // Catch: java.lang.Throwable -> Lb8
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb8
            r6.<init>(r9)     // Catch: java.lang.Throwable -> Lb8
            if (r5 == 0) goto L43
        L39:
            int r0 = r5.read(r7)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == r3) goto L43
            r6.write(r7, r8, r0)     // Catch: java.lang.Throwable -> Lb8
            goto L39
        L43:
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch: java.io.IOException -> L60 java.lang.Throwable -> Lb8
            r2.<init>()     // Catch: java.io.IOException -> L60 java.lang.Throwable -> Lb8
            r2.setDataSource(r10, r11)     // Catch: java.io.IOException -> L60 java.lang.Throwable -> Lb8
            r0 = 9
            java.lang.String r0 = r2.extractMetadata(r0)     // Catch: java.io.IOException -> L60 java.lang.Throwable -> Lb8
            if (r0 == 0) goto L59
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.io.IOException -> L60 java.lang.Throwable -> Lb8
            int r7 = (int) r0     // Catch: java.io.IOException -> L60 java.lang.Throwable -> Lb8
            goto L5a
        L59:
            r7 = 0
        L5a:
            r2.release()     // Catch: java.io.IOException -> L5e java.lang.Throwable -> Lb8
            goto L71
        L5e:
            r3 = move-exception
            goto L62
        L60:
            r3 = move-exception
            r7 = 0
        L62:
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object[] r2 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = "Medium"
            java.lang.String r0 = "Failed to extract duration from %s"
            X.C0K8.A0L(r1, r0, r3, r2)     // Catch: java.lang.Throwable -> Lb8
        L71:
            if (r7 == 0) goto L7b
            r6.close()     // Catch: java.lang.Throwable -> L76
        L76:
            com.instagram.common.gallery.Medium r0 = A03(r9, r12, r7)     // Catch: java.lang.Throwable -> Lb8
            goto Lb2
        L7b:
            if (r5 == 0) goto Lcf
            r5.close()     // Catch: java.lang.Throwable -> L80
        L80:
            r5.close()     // Catch: java.io.IOException -> Lbf
            return r4
        L84:
            java.lang.String r9 = "tmp_photo_"
            java.lang.String r2 = ".jpg"
            X.1B4 r1 = X.AbstractC23881Ey.A00()     // Catch: java.lang.Throwable -> Lb8
            r0 = 1532730990(0x5b5b9e6e, float:6.1817215E16)
            java.io.File r0 = r1.AXd(r4, r0)     // Catch: java.lang.Throwable -> Lb8
            java.io.File r2 = java.io.File.createTempFile(r9, r2, r0)     // Catch: java.lang.Throwable -> Lb8
            r2.getClass()     // Catch: java.lang.Throwable -> Lb8
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb8
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb8
            if (r5 == 0) goto Lab
        La1:
            int r0 = r5.read(r7)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == r3) goto Lab
            r1.write(r7, r8, r0)     // Catch: java.lang.Throwable -> Lb8
            goto La1
        Lab:
            r1.close()     // Catch: java.lang.Throwable -> Lae
        Lae:
            com.instagram.common.gallery.Medium r0 = A03(r2, r6, r8)     // Catch: java.lang.Throwable -> Lb8
        Lb2:
            if (r5 == 0) goto Lb7
            r5.close()     // Catch: java.io.IOException -> Lbf
        Lb7:
            return r0
        Lb8:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> Lba
        Lba:
            r0 = move-exception
            X.C20I.A00(r5, r1)     // Catch: java.io.IOException -> Lbf
            throw r0     // Catch: java.io.IOException -> Lbf
        Lbf:
            r3 = move-exception
            java.lang.String r0 = r11.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Medium"
            java.lang.String r0 = "File not found while opening input stream for %s"
            X.C0K8.A0L(r1, r0, r3, r2)
        Lcf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8IU.A00(android.app.Activity, android.net.Uri, int):com.instagram.common.gallery.Medium");
    }

    public static final Medium A03(File file, int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        String absolutePath = file.getAbsolutePath();
        C14360o3.A07(absolutePath);
        return new Medium(android.net.Uri.fromFile(file), absolutePath, 0, i, 0, i2, currentTimeMillis / 1000, currentTimeMillis);
    }

    public final Medium A05(File file) {
        C14360o3.A0B(file, 0);
        return A03(file, 1, 0);
    }

    public static final Medium A01(Medium medium) {
        int i = medium.A05;
        int i2 = medium.A08;
        String str = medium.A0X;
        int i3 = medium.A02;
        Medium medium2 = new Medium(medium.A02(), str, medium.A0O, i, i2, i3, medium.A07, medium.A03, medium.A0C, medium.A0D, medium.A0f);
        medium2.A0e = medium.A0e;
        medium2.A0a = medium.A0a;
        medium2.A06 = medium.A06;
        medium2.A0G = medium.A0G;
        medium2.A0H = medium.A0H;
        medium2.A0N = medium.A0N;
        medium2.A0g = medium.A0g;
        medium2.A09 = medium.A09;
        medium2.A0A = medium.A0A;
        medium2.A0I = medium.A0I;
        medium2.A0E = medium.A0E;
        return medium2;
    }

    public static final Medium A02(Medium medium, File file) {
        int i = medium.A05;
        int i2 = medium.A08;
        String absolutePath = file.getAbsolutePath();
        C14360o3.A07(absolutePath);
        int i3 = medium.A02;
        Medium medium2 = new Medium(medium.A02(), absolutePath, medium.A0O, i, i2, i3, medium.A07, medium.A03, medium.A0C, medium.A0D, medium.A0f);
        medium2.A0e = medium.A0e;
        medium2.A0a = medium.A0a;
        medium2.A06 = medium.A06;
        medium2.A0G = medium.A0G;
        medium2.A0H = medium.A0H;
        medium2.A0N = medium.A0N;
        medium2.A0g = medium.A0g;
        medium2.A09 = medium.A09;
        medium2.A0A = medium.A0A;
        medium2.A0I = medium.A0I;
        medium2.A0E = medium.A0E;
        return medium2;
    }

    public static final Medium A04(String str, String str2, int i, int i2, int i3, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        int i4 = Medium.A0h;
        Medium.A0h = i4 + 1;
        int i5 = 1;
        if (z) {
            i5 = 3;
        }
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        Medium medium = new Medium(null, obj, i4, i5, 0, i3, currentTimeMillis / 1000, currentTimeMillis);
        medium.A0B = i;
        medium.A04 = i2;
        medium.A0Y = str;
        medium.A0a = str2;
        return medium;
    }
}
