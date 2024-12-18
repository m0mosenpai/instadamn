package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;

/* renamed from: X.9Mq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209089Mq {
    public static final BitmapFactory.Options A00;

    public static final int A00() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        AbstractC167027dH.A0Z(iArr[0]);
        return iArr[0];
    }

    public static final InterfaceC197718oi A03(Bitmap bitmap, boolean z) {
        C197728oj c197728oj;
        Gainmap gainmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int A002 = A00();
        AHO.A01(bitmap, 2);
        if (z && Build.VERSION.SDK_INT >= 34 && (gainmap = bitmap.getGainmap()) != null) {
            c197728oj = null;
            Bitmap gainmapContents = gainmap.getGainmapContents();
            C14360o3.A07(gainmapContents);
            int width2 = gainmapContents.getWidth();
            int height2 = gainmapContents.getHeight();
            int A003 = A00();
            AHO.A01(gainmapContents, 2);
            if (!A05("makeBitmapTexture")) {
                c197728oj = AbstractC197698og.A00(gainmap, A003, width2, height2);
            }
        } else {
            c197728oj = null;
        }
        bitmap.recycle();
        if (A05("makeBitmapTexture")) {
            return null;
        }
        return AbstractC197698og.A01(c197728oj, A002, width, height);
    }

    public static final boolean A05(String str) {
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                C0K8.A09(C209089Mq.class, "GL error 0x%x after %s: %s", Integer.valueOf(glGetError), str, GLUtils.getEGLErrorString(glGetError));
                z = true;
            } else {
                return z;
            }
        }
    }

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        A00 = options;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00a1: IF  (r5 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:43:? (LINE:161), block:B:35:0x00a1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC197718oi A01(android.content.Context r8, java.lang.String r9, int r10, boolean r11, boolean r12) {
        /*
            java.lang.String r3 = "Failed to close input stream"
            r7 = 0
            r4 = 0
            java.lang.String r0 = "/"
            boolean r0 = X.AbstractC002300n.A0h(r9, r0, r7)     // Catch: java.io.IOException -> L87 java.lang.Throwable -> Lae
            if (r0 == 0) goto L1d
            java.io.File r0 = X.AbstractC166987dD.A11(r9)     // Catch: java.io.IOException -> L87 java.lang.Throwable -> Lae
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.io.IOException -> L87 java.lang.Throwable -> Lae
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch: java.io.IOException -> L87 java.lang.Throwable -> Lae
            java.io.InputStream r5 = r1.openInputStream(r0)     // Catch: java.io.IOException -> L87 java.lang.Throwable -> Lae
            goto L2b
        L1d:
            android.content.res.AssetManager r1 = r8.getAssets()     // Catch: java.io.IOException -> L87 java.lang.Throwable -> Lae
            java.lang.String r0 = "filters/"
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r9)     // Catch: java.io.IOException -> L87 java.lang.Throwable -> Lae
            java.io.InputStream r5 = r1.open(r0)     // Catch: java.io.IOException -> L87 java.lang.Throwable -> Lae
        L2b:
            if (r11 == 0) goto L55
            android.opengl.ETC1Util$ETC1Texture r11 = android.opengl.ETC1Util.createTexture(r5)     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            r6 = 3553(0xde1, float:4.979E-42)
            int r2 = A00()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            r9 = 6407(0x1907, float:8.978E-42)
            r10 = 33635(0x8363, float:4.7133E-41)
            r8 = r7
            android.opengl.ETC1Util.loadTexture(r6, r7, r8, r9, r10, r11)     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            java.lang.String r0 = "makeETC1Texture"
            boolean r0 = A05(r0)     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            if (r0 != 0) goto L91
            int r1 = r11.getWidth()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            int r0 = r11.getHeight()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            X.8oh r0 = X.AbstractC197698og.A01(r4, r2, r1, r0)     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            goto L92
        L55:
            android.graphics.BitmapFactory$Options r1 = X.C209089Mq.A00     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            r0 = 0
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r5, r4, r1)     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            if (r6 == 0) goto L92
            r1 = 3553(0xde1, float:4.979E-42)
            int r2 = A00()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            if (r12 == 0) goto L81
            X.AHO.A01(r6, r10)     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
        L69:
            r6.recycle()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            java.lang.String r1 = "makeBitmapTexture"
            boolean r1 = A05(r1)     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            if (r1 != 0) goto L92
            int r1 = r6.getWidth()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            int r0 = r6.getHeight()     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            X.8oh r0 = X.AbstractC197698og.A01(r4, r2, r1, r0)     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            goto L92
        L81:
            android.opengl.GLUtils.texImage2D(r1, r7, r6, r7)     // Catch: java.io.IOException -> L85 java.lang.Throwable -> La0
            goto L69
        L85:
            r2 = move-exception
            goto L89
        L87:
            r2 = move-exception
            r5 = r4
        L89:
            java.lang.Class<X.9Mq> r1 = X.C209089Mq.class
            java.lang.String r0 = "Failed to open input stream"
            X.C0K8.A05(r1, r0, r2)     // Catch: java.lang.Throwable -> La0
            goto L93
        L91:
            r0 = 0
        L92:
            r4 = r0
        L93:
            if (r5 == 0) goto L9f
            r5.close()     // Catch: java.io.IOException -> L99
            return r4
        L99:
            r1 = move-exception
            java.lang.Class<X.9Mq> r0 = X.C209089Mq.class
            X.C0K8.A05(r0, r3, r1)
        L9f:
            return r4
        La0:
            r2 = move-exception
            if (r5 == 0) goto Laf
            r5.close()     // Catch: java.io.IOException -> La7
            throw r2
        La7:
            r1 = move-exception
            java.lang.Class<X.9Mq> r0 = X.C209089Mq.class
            X.C0K8.A05(r0, r3, r1)
            throw r2
        Lae:
            r2 = move-exception
        Laf:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209089Mq.A01(android.content.Context, java.lang.String, int, boolean, boolean):X.8oi");
    }

    public static final InterfaceC197718oi A02(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int A002 = A00();
        AHO.A01(bitmap, i);
        if (A05("makeBitmapTexture")) {
            return null;
        }
        return AbstractC197698og.A01(null, A002, width, height);
    }

    public static final void A04(String str) {
        if (!A05(str)) {
        } else {
            throw AbstractC166987dD.A18(AnonymousClass001.A0R("OpenGL Error:", str));
        }
    }
}
