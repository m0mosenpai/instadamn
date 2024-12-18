package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class AZA implements InterfaceC179087xK, InterfaceC179437xt {
    public C178907x2 A00;
    public C179427xs A01;
    public BDF A02;
    public C22981ABg A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C178747wm A07;
    public final int A08;
    public volatile InterfaceC180227zC A09;

    @Override // X.InterfaceC179437xt
    public final Object BOS() {
        return this;
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    public final void A00(BDF bdf) {
        if (this.A09 == null) {
            bdf.DEF(AbstractC166987dD.A14("GlContext is null during takePhotoSync()"));
            return;
        }
        if (this.A02 != null) {
            bdf.DEF(AbstractC166987dD.A14("Capture already in progress"));
            return;
        }
        this.A02 = bdf;
        if (this.A09 != null && this.A01 == null) {
            C179427xs c179427xs = new C179427xs(this.A07, new C179387xo(), new C179417xr(), false);
            this.A01 = c179427xs;
            c179427xs.A03(this.A06, this.A04, this.A05);
            C179427xs c179427xs2 = this.A01;
            c179427xs2.A02 = true;
            this.A00.A03(c179427xs2);
        }
    }

    @Override // X.InterfaceC179437xt
    public final /* synthetic */ int BaF() {
        return 0;
    }

    @Override // X.InterfaceC179437xt
    public final int BaJ() {
        return this.A08;
    }

    @Override // X.InterfaceC179437xt
    public final boolean CTm(InterfaceC179467xw interfaceC179467xw) {
        return AbstractC167007dF.A1W(this.A01);
    }

    @Override // X.InterfaceC179437xt
    public final /* synthetic */ boolean CZh() {
        return false;
    }

    @Override // X.InterfaceC179437xt
    public final /* synthetic */ boolean Cem() {
        return false;
    }

    @Override // X.InterfaceC179437xt
    public final Exception Cmh() {
        C179427xs c179427xs = this.A01;
        if (c179427xs != null) {
            return c179427xs.Cmh();
        }
        return null;
    }

    @Override // X.InterfaceC179437xt
    public final C179407xq FBc(InterfaceC179467xw interfaceC179467xw) {
        C179427xs c179427xs = this.A01;
        if (c179427xs != null) {
            return c179427xs.FBd(interfaceC179467xw, c179427xs.A01);
        }
        throw AbstractC166987dD.A14("FrameBuffer is null");
    }

    @Override // X.InterfaceC179437xt
    public final C179407xq FBd(InterfaceC179467xw interfaceC179467xw, AbstractC179397xp abstractC179397xp) {
        C179427xs c179427xs = this.A01;
        if (c179427xs != null) {
            return c179427xs.FBd(interfaceC179467xw, abstractC179397xp);
        }
        throw AbstractC166987dD.A14("FrameBuffer is null");
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        C179427xs c179427xs;
        if (this.A09 != null && (c179427xs = this.A01) != null) {
            this.A00.A04(c179427xs);
            this.A01 = null;
        }
        this.A02 = null;
        this.A09 = null;
    }

    @Override // X.InterfaceC179437xt
    public final void swapBuffers() {
        BDF bdf;
        C179427xs c179427xs = this.A01;
        if (c179427xs != null) {
            C22981ABg c22981ABg = this.A03;
            if (c22981ABg != null) {
                InterfaceC200678uA interfaceC200678uA = c179427xs.A00;
                interfaceC200678uA.getClass();
                int width = interfaceC200678uA.getWidth();
                InterfaceC200678uA interfaceC200678uA2 = this.A01.A00;
                interfaceC200678uA2.getClass();
                c22981ABg.A00(width, interfaceC200678uA2.getHeight());
            }
            this.A01.swapBuffers();
            if (this.A09 != null && this.A01 != null && (bdf = this.A02) != null) {
                bdf.DLI();
                C179407xq c179407xq = this.A01.A0A.A05;
                c179407xq.getClass();
                Exception Cmh = this.A01.Cmh();
                if (Cmh != null) {
                    this.A02.DEF(Cmh);
                } else {
                    int i = c179407xq.A01;
                    int i2 = c179407xq.A00;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * 4 * i2);
                    GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    AbstractC47832Hr.A00(createBitmap, "Cannot create bitmap");
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    this.A02.Czd(createBitmap, this.A01.A0A.A03);
                }
                this.A02 = null;
                return;
            }
            throw new RuntimeException();
        }
    }

    public AZA(C178747wm c178747wm, Integer num, Integer num2, Integer num3, int i) {
        num3.getClass();
        int intValue = num3.intValue();
        num.getClass();
        int intValue2 = num.intValue();
        AbstractC166997dE.A0a().getClass();
        num2.getClass();
        int intValue3 = num2.intValue();
        c178747wm.getClass();
        this.A06 = intValue;
        this.A04 = intValue2;
        this.A05 = intValue3;
        this.A07 = c178747wm;
        this.A08 = i;
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        this.A09 = interfaceC180227zC;
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        this.A00 = c178907x2;
    }

    @Override // X.InterfaceC179437xt
    public final void EZs(C22981ABg c22981ABg) {
        this.A03 = c22981ABg;
    }

    @Override // X.InterfaceC179437xt
    public final boolean contains(Object obj) {
        return AbstractC167007dF.A1X(this, obj);
    }
}
