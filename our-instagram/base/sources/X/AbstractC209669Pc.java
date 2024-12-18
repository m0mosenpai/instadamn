package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.util.jpeg.JpegBridge;
import java.io.File;

/* renamed from: X.9Pc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209669Pc {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r14, 36322744580712901L) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap A00(com.instagram.common.session.UserSession r14, java.lang.String r15, int r16, int r17, long r18) {
        /*
            r5 = r15
            java.lang.String r3 = "Exception calling MediaMetadataRetriever#release"
            java.lang.String r10 = ""
            java.lang.String r4 = "file_path"
            android.media.MediaMetadataRetriever r12 = new android.media.MediaMetadataRetriever
            r12.<init>()
            r2 = 0
            r12.setDataSource(r15)     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            r9 = 1
            r8 = 30
            if (r6 < r8) goto L2d
            r0 = 35
            java.lang.String r0 = r12.extractMetadata(r0)     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            if (r0 == 0) goto L2d
            java.lang.Integer r0 = X.AbstractC003100w.A0i(r0)     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            r1 = 6
            if (r0 == 0) goto L2d
            int r0 = r0.intValue()     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            if (r0 != r1) goto L2d
            goto L2e
        L2d:
            r9 = 0
        L2e:
            if (r9 == 0) goto L3e
            X.0Tz r7 = X.C06090Tz.A05     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            r0 = 36322744580712901(0x810b58000029c5, double:3.033988160571069E-306)
            boolean r0 = X.C18U.A06(r7, r14, r0)     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            r7 = 1
            if (r0 != 0) goto L3f
        L3e:
            r7 = 0
        L3f:
            r13 = r18
            if (r16 <= 0) goto L68
            if (r17 <= 0) goto L68
            if (r6 < r8) goto L68
            android.media.MediaMetadataRetriever$BitmapParams r1 = new android.media.MediaMetadataRetriever$BitmapParams     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            r1.<init>()     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            if (r9 == 0) goto L55
            r0 = 33
            if (r6 < r0) goto L55
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_1010102     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            goto L5d
        L55:
            if (r9 == 0) goto L58
            goto L5b
        L58:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            goto L5d
        L5b:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
        L5d:
            r1.setPreferredConfig(r0)     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            r15 = 2
            r18 = r1
            android.graphics.Bitmap r2 = r12.getScaledFrameAtTime(r13, r15, r16, r17, r18)     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            goto L6d
        L68:
            r15 = 2
            android.graphics.Bitmap r2 = r12.getScaledFrameAtTime(r13, r15, r16, r17)     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
        L6d:
            if (r9 == 0) goto L7e
            r0 = 29
            if (r6 < r0) goto L7e
            if (r2 == 0) goto L7e
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.BT2020     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            r2.setColorSpace(r0)     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
        L7e:
            if (r7 == 0) goto Lb4
            if (r2 == 0) goto Lb4
            android.graphics.Picture r7 = new android.graphics.Picture     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            r7.<init>()     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            android.graphics.Paint r6 = X.AbstractC166987dD.A0R()     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            int r1 = r2.getWidth()     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            int r0 = r2.getHeight()     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            android.graphics.Canvas r1 = r7.beginRecording(r1, r0)     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            X.C14360o3.A07(r1)     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            r0 = 0
            r1.drawBitmap(r2, r0, r0, r6)     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            r7.endRecording()     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r7)     // Catch: java.lang.RuntimeException -> La6 java.lang.Throwable -> Lc5
            goto Lb4
        La6:
            r6 = move-exception
            java.lang.String r1 = "Exception calling MediaMetadataRetriever#getScaledFrameAtTime"
            r0 = r5
            if (r5 != 0) goto Lad
            r0 = r10
        Lad:
            java.util.Map r0 = X.AbstractC167007dF.A0n(r4, r0)     // Catch: java.lang.Throwable -> Lc5
            X.AbstractC12120kG.A0I(r1, r6, r0)     // Catch: java.lang.Throwable -> Lc5
        Lb4:
            r12.release()     // Catch: java.lang.Exception -> Lb8
            goto Lc4
        Lb8:
            r1 = move-exception
            if (r5 != 0) goto Lbc
            r5 = r10
        Lbc:
            java.util.Map r0 = X.AbstractC167007dF.A0n(r4, r5)
            X.AbstractC12120kG.A0I(r3, r1, r0)
            return r2
        Lc4:
            return r2
        Lc5:
            r2 = move-exception
            r12.release()     // Catch: java.lang.Exception -> Lca
            throw r2
        Lca:
            r1 = move-exception
            if (r5 != 0) goto Lce
            r5 = r10
        Lce:
            java.util.Map r0 = X.AbstractC167007dF.A0n(r4, r5)
            X.AbstractC12120kG.A0I(r3, r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC209669Pc.A00(com.instagram.common.session.UserSession, java.lang.String, int, int, long):android.graphics.Bitmap");
    }

    public static final Bitmap A01(String str, long j) {
        Bitmap bitmap;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            bitmap = mediaMetadataRetriever.getFrameAtTime(j, 2);
        } catch (RuntimeException unused) {
            bitmap = null;
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused2) {
            }
            throw th;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Exception unused3) {
        }
        return bitmap;
    }

    public static final C183978Ee A03(Bitmap bitmap, C206409Bx c206409Bx, UserSession userSession, String str, String str2, int i, boolean z) {
        File A04;
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A13(bitmap, str, str2);
        Matrix A0Q = AbstractC166987dD.A0Q();
        A0Q.setRotate(i, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        float f = 1.0f;
        if (z) {
            f = -1.0f;
        }
        A0Q.postScale(f, 1.0f, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        C0fK.A03(bitmap);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, A0Q, false);
        C14360o3.A07(createBitmap);
        if (C18U.A06(C06090Tz.A05, userSession, 36329053887676407L)) {
            File A11 = AbstractC166987dD.A11(str);
            if (!A11.exists()) {
                A11.mkdirs();
            }
            String A0T = AnonymousClass001.A0T(str, str2, '/');
            if (JpegBridge.A01()) {
                JpegBridge.compressBitmapToFileNative(createBitmap, A0T, 75, true, false, false);
            }
            A04 = AbstractC166987dD.A11(A0T);
        } else {
            A04 = C197098ne.A04(createBitmap, userSession, str, str2, null);
        }
        if (c206409Bx != null) {
            AbstractC60562pf.A02(c206409Bx, A04);
        }
        long currentTimeMillis = System.currentTimeMillis();
        C183978Ee c183978Ee = new C183978Ee(A04, createBitmap.getWidth(), createBitmap.getHeight(), currentTimeMillis, currentTimeMillis, false);
        c183978Ee.A0I = AbstractC14620oa.A01(AbstractC14570oV.A01(bitmap, C05F.A00), i);
        return c183978Ee;
    }

    public static final C195868lW A04(Y1s y1s, File file) {
        String str;
        boolean z;
        int i;
        Integer A00 = y1s.A00(Y1s.A0J);
        if (A00 != null && 1 == A00.intValue()) {
            str = "front";
            z = true;
        } else {
            str = "back";
            z = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int intValue = y1s.A00(Y1s.A0L).intValue();
        int intValue2 = y1s.A00(Y1s.A0K).intValue();
        int intValue3 = y1s.A00(Y1s.A0M).intValue();
        Object A01 = y1s.A01(Y1s.A0T);
        if (A01 != null) {
            C195868lW c195868lW = new C195868lW(file, null, str, intValue, intValue2, intValue3, currentTimeMillis, currentTimeMillis, z, false, AbstractC166987dD.A1a(A01));
            c195868lW.A01 = A00.intValue();
            c195868lW.A0Z = (Integer) y1s.A01(Y1s.A0O);
            c195868lW.A0a = (Integer) y1s.A01(Y1s.A0P);
            Number number = (Number) y1s.A01(Y1s.A0Q);
            if (number != null) {
                i = number.intValue();
            } else {
                i = 3;
            }
            c195868lW.A0b = Integer.valueOf(i);
            return c195868lW;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final boolean A06(CameraConfiguration cameraConfiguration) {
        C55U c55u = cameraConfiguration.A03;
        if ((c55u instanceof C81V) && !cameraConfiguration.A04.contains(C81W.A0y)) {
            return true;
        }
        if (c55u != C208509Kk.A00 && c55u != C81T.A00) {
            return false;
        }
        return cameraConfiguration.A04.contains(C81W.A0B);
    }

    public static final BackgroundGradientColors A02(File file) {
        Bitmap A01;
        if (file.exists() && (A01 = A01(file.getPath(), 0L)) != null) {
            return AbstractC14570oV.A01(A01, C05F.A00);
        }
        return new BackgroundGradientColors(-16777216, -16777216);
    }

    public static final void A05(Context context, UserSession userSession, AbstractC224249v8 abstractC224249v8, BD6 bd6) {
        int i;
        int i2;
        Point A0E = AbstractC13880nE.A0E(context);
        if (abstractC224249v8.A00 == 0 || abstractC224249v8.A01 == 0) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36312879040824864L)) {
                i = (int) C18U.A01(c06090Tz, userSession, 36594354017601222L);
                i2 = (int) C18U.A01(c06090Tz, userSession, 36594354017601222L);
            } else {
                i = A0E.x;
                i2 = A0E.y;
            }
            abstractC224249v8.A00 = i2;
            abstractC224249v8.A01 = i;
        }
        AbstractC23082AFo.A00(new C24181Ao4(userSession, bd6), abstractC224249v8);
    }
}
