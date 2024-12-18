package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import java.util.Iterator;

/* renamed from: X.9X3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9X3 extends AbstractC178807ws implements InterfaceC179867yc {
    public final C1814082s A00;
    public final Context A01;
    public final TextureView.SurfaceTextureListener A02;
    public volatile int A03;
    public volatile int A04;
    public volatile TextureView A05;
    public volatile C176507t8 A06;

    @Override // X.InterfaceC179867yc
    public final void A9y(InterfaceC178677wf interfaceC178677wf) {
        C14360o3.A0B(interfaceC178677wf, 0);
        if (this.A00.A01(interfaceC178677wf)) {
            if (this.A05 != null) {
                interfaceC178677wf.Dan(this.A05);
            }
            C176507t8 c176507t8 = this.A06;
            if (c176507t8 != null) {
                interfaceC178677wf.Dah(c176507t8);
                int i = this.A04;
                int i2 = this.A03;
                if (i > 0 && i2 > 0) {
                    interfaceC178677wf.Daj(c176507t8, i, i2);
                }
            }
        }
    }

    @Override // X.InterfaceC179867yc
    public final synchronized void Bfh(C23318AVd c23318AVd) {
        IllegalStateException illegalStateException;
        TextureView textureView = this.A05;
        if (textureView == null) {
            illegalStateException = AbstractC166987dD.A14("Preview view is null");
        } else {
            try {
                Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), textureView.getHeight());
                if (bitmap != null) {
                    c23318AVd.A00(bitmap, null);
                } else {
                    c23318AVd.D2I(AbstractC166987dD.A14("Failed to acquire bitmap"));
                }
            } catch (Throwable th) {
                illegalStateException = new IllegalStateException("Failed to acquire bitmap", th);
            }
        }
        c23318AVd.D2I(illegalStateException);
    }

    @Override // X.InterfaceC179867yc
    public final synchronized View Bfy() {
        TextureView textureView;
        textureView = this.A05;
        if (textureView == null) {
            textureView = new TextureView(this.A01);
            textureView.setSurfaceTextureListener(this.A02);
            this.A05 = textureView;
            Iterator it = this.A00.A00.iterator();
            while (it.hasNext()) {
                ((InterfaceC178677wf) it.next()).Dan(this.A05);
            }
        }
        return textureView;
    }

    @Override // X.InterfaceC179867yc
    public final void EG8(InterfaceC178677wf interfaceC178677wf) {
        C14360o3.A0B(interfaceC178677wf, 0);
        this.A00.A02(interfaceC178677wf);
    }

    @Override // X.InterfaceC179867yc
    public final boolean CLY() {
        return AbstractC167007dF.A1W(this.A05);
    }

    @Override // X.InterfaceC179867yc
    public final void EbQ(SurfaceTexture surfaceTexture, int i, int i2) {
        throw AbstractC166987dD.A1D("setPreviewSurface() is not supported");
    }

    @Override // X.InterfaceC179867yc
    public final void EbT(View view) {
        throw AbstractC166987dD.A1D("setPreviewView() is not supported");
    }

    public C9X3(InterfaceC178207vu interfaceC178207vu) {
        super.A00 = interfaceC178207vu;
        interfaceC178207vu.getClass();
        Context context = interfaceC178207vu.getContext();
        C14360o3.A07(context);
        this.A01 = context;
        this.A00 = new C1814082s();
        this.A02 = new AQ2(this, 0);
    }

    @Override // X.InterfaceC179867yc
    public final View Aqk() {
        return Bfy();
    }
}
