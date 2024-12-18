package X;

import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;

/* renamed from: X.8mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196648mu implements InterfaceC177027ty {
    public ImageReader A00;
    public C196668mw A01;
    public final ImageReader.OnImageAvailableListener A02 = new ImageReader.OnImageAvailableListener() { // from class: X.APG
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [X.8n0, java.lang.Object] */
        @Override // android.media.ImageReader.OnImageAvailableListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onImageAvailable(android.media.ImageReader r14) {
            /*
                r13 = this;
                X.8mu r1 = X.C196648mu.this
                X.8mw r3 = r1.A01
                android.media.ImageReader r0 = r1.A00
                r6 = 0
                if (r0 == 0) goto Le
                r0.setOnImageAvailableListener(r6, r6)
                r1.A01 = r6
            Le:
                android.media.Image r5 = r14.acquireLatestImage()     // Catch: java.lang.Exception -> L34
                if (r5 == 0) goto L43
                X.8n0 r4 = new X.8n0     // Catch: java.lang.Throwable -> L29
                r4.<init>()     // Catch: java.lang.Throwable -> L29
                r11 = 1
                r7 = r6
                r8 = r6
                r9 = r6
                r10 = r6
                r12 = r11
                r4.A02(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L27
                r6 = r4
                r5.close()     // Catch: java.lang.Exception -> L34
                goto L43
            L27:
                r1 = move-exception
                goto L2b
            L29:
                r1 = move-exception
                r4 = r6
            L2b:
                r5.close()     // Catch: java.lang.Throwable -> L2f
                goto L33
            L2f:
                r0 = move-exception
                X.AbstractC61625Rqp.A00(r1, r0)     // Catch: java.lang.Exception -> L36
            L33:
                throw r1     // Catch: java.lang.Exception -> L36
            L34:
                r2 = move-exception
                goto L38
            L36:
                r2 = move-exception
                r6 = r4
            L38:
                java.lang.String r1 = "YuvPhotoProcessor"
                java.lang.String r0 = "Failed to acquire image: "
                java.lang.String r0 = X.AbstractC166997dE.A0y(r0, r2)
                X.AbstractC175037qd.A02(r1, r0)
            L43:
                if (r3 == 0) goto L4d
                X.8mz r0 = new X.8mz
                r0.<init>(r6)
                r3.A00(r0)
            L4d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.APG.onImageAvailable(android.media.ImageReader):void");
        }
    };

    @Override // X.InterfaceC177027ty
    public final int BGf() {
        return 35;
    }

    @Override // X.InterfaceC177027ty
    public final void CNa(int i, int i2, int i3) {
        this.A00 = ImageReader.newInstance(i, i2, 35, 1);
    }

    @Override // X.InterfaceC177027ty
    public final void E5b(Handler handler, C196668mw c196668mw) {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            this.A01 = c196668mw;
            imageReader.setOnImageAvailableListener(this.A02, handler);
        }
    }

    @Override // X.InterfaceC177027ty
    public final Surface getSurface() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    @Override // X.InterfaceC177027ty
    public final boolean isEnabled() {
        if (this.A00 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC177027ty
    public final void release() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(null, null);
            this.A00.close();
            this.A00 = null;
        }
        this.A01 = null;
    }
}
