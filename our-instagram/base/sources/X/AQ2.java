package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.List;

/* loaded from: classes4.dex */
public final class AQ2 implements TextureView.SurfaceTextureListener {
    public final int A00;
    public final Object A01;

    public AQ2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(surfaceTexture, 0);
                C9X3 c9x3 = (C9X3) this.A01;
                C176507t8 c176507t8 = c9x3.A06;
                c9x3.A06 = null;
                if (c176507t8 != null) {
                    c176507t8.A01();
                }
                C176507t8 c176507t82 = new C176507t8(surfaceTexture, false);
                c9x3.A06 = c176507t82;
                c9x3.A04 = i;
                c9x3.A03 = i2;
                List list = c9x3.A00.A00;
                C14360o3.A07(list);
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    InterfaceC178677wf interfaceC178677wf = (InterfaceC178677wf) list.get(i3);
                    interfaceC178677wf.Dah(c176507t82);
                    interfaceC178677wf.Daj(c176507t82, i, i2);
                }
                return;
            case 1:
                ACM acm = (ACM) this.A01;
                Object obj = acm.A03;
                if (obj != null) {
                    if (acm.A05) {
                        synchronized (acm.A02) {
                            InterfaceC72007XEv interfaceC72007XEv = acm.A00;
                            if (interfaceC72007XEv != null) {
                                interfaceC72007XEv.DXA();
                            }
                        }
                    }
                    synchronized (obj) {
                        acm.A06 = true;
                        obj.notifyAll();
                    }
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 2:
                C55208OeM c55208OeM = (C55208OeM) this.A01;
                C55208OeM.A03(c55208OeM, -1);
                if (!c55208OeM.A08) {
                    return;
                }
                c55208OeM.A06();
                return;
            case 3:
                C14360o3.A0B(surfaceTexture, 0);
                C23805AgG c23805AgG = (C23805AgG) this.A01;
                c23805AgG.A02 = surfaceTexture;
                c23805AgG.A01 = i;
                c23805AgG.A00 = i2;
                return;
            default:
                C14360o3.A0B(surfaceTexture, 0);
                C23689AeO c23689AeO = (C23689AeO) this.A01;
                c23689AeO.A04 = surfaceTexture;
                c23689AeO.A03 = i;
                c23689AeO.A02 = i2;
                c23689AeO.A07 = true;
                c23689AeO.A09.postInvalidate();
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(surfaceTexture, 0);
                C9X3 c9x3 = (C9X3) this.A01;
                C176507t8 c176507t8 = c9x3.A06;
                if (c176507t8 == null || c176507t8.A0B != surfaceTexture) {
                    return true;
                }
                c9x3.A06 = null;
                c9x3.A04 = 0;
                c9x3.A03 = 0;
                List list = c9x3.A00.A00;
                C14360o3.A07(list);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC178677wf) list.get(i)).Dai(c176507t8);
                }
                c176507t8.A01();
                return true;
            case 1:
                ACM acm = (ACM) this.A01;
                if (!acm.A04 || !acm.A05) {
                    return true;
                }
                synchronized (acm.A02) {
                    InterfaceC72007XEv interfaceC72007XEv = acm.A00;
                    if (interfaceC72007XEv != null) {
                        interfaceC72007XEv.DXB();
                    }
                }
                return true;
            case 2:
                return false;
            case 3:
                C23805AgG c23805AgG = (C23805AgG) this.A01;
                c23805AgG.A01 = 0;
                c23805AgG.A00 = 0;
                c23805AgG.A02 = null;
                return true;
            default:
                C23689AeO c23689AeO = (C23689AeO) this.A01;
                c23689AeO.A03 = 0;
                c23689AeO.A02 = 0;
                c23689AeO.A04 = null;
                return true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(surfaceTexture, 0);
                C9X3 c9x3 = (C9X3) this.A01;
                C176507t8 c176507t8 = c9x3.A06;
                if (c176507t8 == null || c176507t8.A0B != surfaceTexture) {
                    return;
                }
                c9x3.A04 = i;
                c9x3.A03 = i2;
                List list = c9x3.A00.A00;
                C14360o3.A07(list);
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((InterfaceC178677wf) list.get(i3)).Daj(c9x3.A06, c9x3.A04, c9x3.A03);
                }
                return;
            case 1:
            case 2:
            default:
                return;
            case 3:
                C23805AgG c23805AgG = (C23805AgG) this.A01;
                c23805AgG.A01 = i;
                c23805AgG.A00 = i2;
                return;
            case 4:
                C23689AeO c23689AeO = (C23689AeO) this.A01;
                c23689AeO.A03 = i;
                c23689AeO.A02 = i2;
                c23689AeO.A07 = true;
                c23689AeO.A09.postInvalidate();
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (3 - this.A00 == 0) {
            C14360o3.A0B(surfaceTexture, 0);
            ((C23805AgG) this.A01).A02 = surfaceTexture;
        }
    }
}
