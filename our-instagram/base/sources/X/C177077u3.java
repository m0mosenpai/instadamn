package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* renamed from: X.7u3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177077u3 implements InterfaceC175497rP {
    public W4Z A00;
    public boolean A01;
    public WeakReference A03 = new WeakReference(null);
    public WeakReference A02 = new WeakReference(null);
    public final C73405YBr A04 = new Object();

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void D1a(int i) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void DA4(int i) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Dib(int i, int i2) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Die(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void Dif(Surface surface) {
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ void EbO(boolean z) {
    }

    public final void A00(Surface surface) {
        W4Z w4z = this.A00;
        if (w4z != null) {
            synchronized (w4z) {
                W68 w68 = w4z.A03;
                if (!w68.A03()) {
                    C69796Vvg c69796Vvg = w4z.A00;
                    if (c69796Vvg != null) {
                        c69796Vvg.A03();
                    }
                    w4z.A00 = null;
                    if (surface != null) {
                        w4z.A00 = w68.A00(new C176507t8(surface, false));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ InterfaceC177027ty Bcs() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ InterfaceC177027ty BkW() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final SurfaceTexture C4L(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SurfaceTexture surfaceTexture;
        W4Z w4z = this.A00;
        if (w4z != null) {
            w4z.A01();
            this.A00 = null;
        }
        if (this.A01) {
            W4Z w4z2 = new W4Z();
            this.A00 = w4z2;
            int i9 = i;
            int i10 = i2;
            if (i4 % 180 != 0) {
                i9 = i2;
                i10 = i;
            }
            SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.A03.get();
            if (surfaceTexture2 != null) {
                surfaceTexture2.setDefaultBufferSize(i9, i10);
                W4Z w4z3 = this.A00;
                synchronized (w4z3) {
                    W68 w68 = w4z3.A03;
                    if (!w68.A03()) {
                        C69796Vvg c69796Vvg = w4z3.A01;
                        if (c69796Vvg != null) {
                            c69796Vvg.A03();
                        }
                        w4z3.A01 = null;
                        w4z3.A01 = w68.A00(new C176507t8(surfaceTexture2, false));
                    }
                }
            } else {
                Surface surface = (Surface) this.A02.get();
                if (surface == null) {
                    return null;
                }
                synchronized (w4z2) {
                    W68 w682 = w4z2.A03;
                    if (!w682.A03()) {
                        C69796Vvg c69796Vvg2 = w4z2.A01;
                        if (c69796Vvg2 != null) {
                            c69796Vvg2.A03();
                        }
                        w4z2.A01 = null;
                        w4z2.A01 = w682.A00(new C176507t8(surface, false));
                    }
                }
            }
            C73405YBr c73405YBr = this.A04;
            c73405YBr.A01 = i9;
            c73405YBr.A00 = i10;
            c73405YBr.A03 = this;
            Surface surface2 = c73405YBr.A02;
            if (surface2 != null) {
                A00(surface2);
            }
            W4Z w4z4 = this.A00;
            synchronized (w4z4) {
                if (w4z4.A03.A03()) {
                    surfaceTexture = null;
                } else {
                    C70127W5n c70127W5n = w4z4.A04;
                    C176507t8 c176507t8 = c70127W5n.A09;
                    if (c176507t8 != null) {
                        c70127W5n.A01();
                        c176507t8.A01();
                    }
                    surfaceTexture = new SurfaceTexture(c70127W5n.A00);
                    surfaceTexture.setOnFrameAvailableListener(w4z4.A02);
                    C176507t8 c176507t82 = new C176507t8(surfaceTexture, true);
                    c176507t82.A02(i, i2, i4, false);
                    c70127W5n.A02(null, c176507t82);
                }
            }
            if (surfaceTexture == null) {
                return null;
            }
            surfaceTexture.setDefaultBufferSize(i, i2);
            return surfaceTexture;
        }
        return (SurfaceTexture) this.A03.get();
    }

    @Override // X.InterfaceC175497rP
    public final Surface C4M() {
        return (Surface) this.A02.get();
    }

    @Override // X.InterfaceC175497rP
    public final SurfaceTexture C4N() {
        return (SurfaceTexture) this.A03.get();
    }

    @Override // X.InterfaceC175497rP
    public final InterfaceC176297sm CFN() {
        if (this.A00 != null) {
            return this.A04;
        }
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ InterfaceC177027ty CIg() {
        return null;
    }

    @Override // X.InterfaceC175497rP
    public final void Dic(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A03 = new WeakReference(surfaceTexture);
    }

    @Override // X.InterfaceC175497rP
    public final void Did(Surface surface, int i, int i2) {
        this.A02 = new WeakReference(surface);
    }

    @Override // X.InterfaceC175497rP
    public final void EES(SurfaceTexture surfaceTexture) {
        this.A04.A03 = null;
        W4Z w4z = this.A00;
        if (w4z != null) {
            w4z.A01();
            this.A00 = null;
        }
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ boolean FE6() {
        return false;
    }

    @Override // X.InterfaceC175497rP
    public final /* synthetic */ Object BZG(C176377su c176377su) {
        return null;
    }
}
