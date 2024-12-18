package X;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes10.dex */
public abstract class SUT {
    public static Bitmap A00;
    public static Q5A A01;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[Catch: IOException -> 0x008d, all -> 0x0095, TRY_LEAVE, TryCatch #1 {IOException -> 0x008d, blocks: (B:11:0x0076, B:13:0x0082), top: B:10:0x0076, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.content.Context r10, android.graphics.Bitmap r11) {
        /*
            X.Seg r5 = X.C63181Seg.A06
            android.net.Uri r0 = r5.A00
            r4 = 0
            if (r0 == 0) goto L9f
            android.graphics.Bitmap r9 = X.C63181Seg.A00(r10, r0)
            if (r9 == 0) goto L9f
            int r1 = r9.getWidth()
            int r0 = r9.getHeight()
            int r0 = java.lang.Math.min(r1, r0)
            r2 = 0
            android.graphics.Bitmap r7 = X.C0fK.A00(r11, r0, r0, r2)
            int r3 = r9.getWidth()
            int r1 = r9.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r1, r0)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r3)
            r6.drawARGB(r2, r2, r2, r2)
            r0 = 0
            r6.drawBitmap(r9, r0, r0, r4)
            r9.recycle()
            int r8 = r9.getWidth()
            int r0 = r9.getHeight()
            int r1 = r9.getWidth()
            if (r8 <= r0) goto L64
            int r0 = r9.getHeight()
            int r1 = r1 - r0
            int r2 = r1 / 2
        L50:
            r0 = 0
        L51:
            float r1 = (float) r2
            float r0 = (float) r0
            r6.drawBitmap(r7, r1, r0, r4)
            r7.recycle()
            X.Ndz r0 = X.AbstractC58321PtD.A0d(r10, r4)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r5.A01 = r0
            goto L76
        L64:
            int r0 = r9.getHeight()
            if (r1 >= r0) goto L50
            int r1 = r9.getHeight()
            int r0 = r9.getWidth()
            int r1 = r1 - r0
            int r0 = r1 / 2
            goto L51
        L76:
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch: java.io.IOException -> L8d java.lang.Throwable -> L95
            android.net.Uri r0 = r5.A01     // Catch: java.io.IOException -> L8d java.lang.Throwable -> L95
            java.io.OutputStream r2 = r1.openOutputStream(r0)     // Catch: java.io.IOException -> L8d java.lang.Throwable -> L95
            if (r2 == 0) goto L9a
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.io.IOException -> L8d java.lang.Throwable -> L95
            r0 = 100
            X.C0fK.A02(r1, r3, r2, r0)     // Catch: java.io.IOException -> L8d java.lang.Throwable -> L95
            r2.close()     // Catch: java.io.IOException -> L8d java.lang.Throwable -> L95
            goto L9a
        L8d:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L95
            r3.recycle()
            goto L9f
        L95:
            r0 = move-exception
            r3.recycle()
            throw r0
        L9a:
            r3.recycle()
            android.net.Uri r4 = r5.A01
        L9f:
            X.Q5A r0 = X.SUT.A01
            if (r0 == 0) goto Lad
            if (r4 == 0) goto Lad
            r0.setImageURI(r4)
            X.Q5A r0 = X.SUT.A01
            r0.invalidate()
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUT.A00(android.content.Context, android.graphics.Bitmap):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.Tl2] */
    public static void A01(Context context, String str) {
        String A002;
        boolean z;
        if ("LOAD_PROPIC_FOR_PREVIEW".equals(str)) {
            SUY.A01("ON_LOCAL_MEDIA_FETCH_INITIATED");
            A002 = AbstractC63326Sha.A00(35);
            z = true;
        } else {
            if (!"LOAD_FRAME".equals(str)) {
                return;
            }
            A002 = AbstractC63326Sha.A00(49);
            if (A002 == null || A002.isEmpty()) {
                A00 = null;
                C63181Seg c63181Seg = C63181Seg.A06;
                c63181Seg.A01 = null;
                android.net.Uri uri = c63181Seg.A00;
                Q5A q5a = A01;
                if (q5a != null && uri != null) {
                    q5a.setImageURI(uri);
                    A01.invalidate();
                }
            }
            z = false;
        }
        if (A002 != null && !A002.isEmpty()) {
            C63181Seg.A06.A01(context, AbstractC08820cl.A03(A002), new Object(), str, true, z);
        }
    }
}
