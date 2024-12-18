package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class WYY implements C4RH {
    public C122265gM A00;
    public Utg A01;
    public TextureView A02;
    public final C121745fS A03;
    public final XLC A04;

    @Override // X.C4RH
    public final /* synthetic */ void Ded() {
    }

    @Override // X.C4RH
    public final /* synthetic */ void Dzu(int i, int i2, float f) {
    }

    @Override // X.C4RH
    public final void ACK(C4ST c4st) {
        this.A00 = c4st.A05;
    }

    @Override // X.C4RH
    public final View AMm(Context context, C4RP c4rp, C4RP c4rp2) {
        XLC xlc = this.A04;
        C121745fS c121745fS = this.A03;
        if (!c121745fS.A07) {
            this.A02 = null;
        }
        TextureView textureView = this.A02;
        if (textureView == null) {
            textureView = new TextureView(context);
        }
        if (this.A02 == null) {
            this.A02 = textureView;
            Utg utg = new Utg(textureView, c4rp, c4rp2, c121745fS, xlc);
            this.A01 = utg;
            textureView.setSurfaceTextureListener(utg);
            C122265gM c122265gM = this.A00;
            if (c122265gM != null) {
                textureView.setSurfaceTexture(c122265gM);
                Surface surface = c122265gM.A00;
                C14360o3.A07(surface);
                ((TextureViewSurfaceTextureListenerC121805fY) utg).A00 = surface;
                ((TextureViewSurfaceTextureListenerC121805fY) utg).A02.E1f(surface);
                this.A00 = null;
            }
        } else {
            C122265gM c122265gM2 = this.A00;
            if (c122265gM2 != null) {
                c122265gM2.release();
                return textureView;
            }
        }
        return textureView;
    }

    @Override // X.C4RH
    public final Surface BAQ() {
        Utg utg = this.A01;
        if (utg != null) {
            return ((TextureViewSurfaceTextureListenerC121805fY) utg).A00;
        }
        return null;
    }

    @Override // X.C4RH
    public final C6Q2 Be3() {
        return new C6Q2(this.A03);
    }

    @Override // X.C4RH
    public final /* bridge */ /* synthetic */ InterfaceC126155nC C4P() {
        Utg utg = this.A01;
        if (utg == null) {
            return null;
        }
        SurfaceTexture surfaceTexture = utg.A00;
        Surface surface = ((TextureViewSurfaceTextureListenerC121805fY) utg).A00;
        if (surfaceTexture == null || surface == null) {
            return null;
        }
        return new C6Q3(surfaceTexture, surface);
    }

    public WYY(C121745fS c121745fS, XLC xlc) {
        this.A03 = c121745fS;
        this.A04 = xlc;
    }

    @Override // X.C4RH
    public final void D9z(ViewGroup viewGroup) {
    }
}
