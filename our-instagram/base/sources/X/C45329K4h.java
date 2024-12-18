package X;

import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.K4h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45329K4h extends AbstractC184688Hj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C176877tj A01;
    public final /* synthetic */ InterfaceC174767qC A02;
    public final /* synthetic */ C47982LJb A03;

    @Override // X.AbstractC184688Hj
    public final void A01(Exception exc) {
    }

    public C45329K4h(C176877tj c176877tj, InterfaceC174767qC interfaceC174767qC, C47982LJb c47982LJb, int i) {
        this.A03 = c47982LJb;
        this.A00 = i;
        this.A01 = c176877tj;
        this.A02 = interfaceC174767qC;
    }

    @Override // X.AbstractC184688Hj
    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        C47982LJb c47982LJb = this.A03;
        ScalingTextureView scalingTextureView = c47982LJb.A02;
        if (scalingTextureView.isAvailable() && scalingTextureView.getSurfaceTexture() != null) {
            int i = this.A00;
            float f = i * 1.0f;
            if (this.A01 != null) {
                scalingTextureView.A02 = i;
                scalingTextureView.A01 = (int) ((f * r1.A02) / r1.A01);
                ScalingTextureView.A00(scalingTextureView);
                C0fQ.A00(new ViewOnClickListenerC55468OkN(25, this.A02, c47982LJb), AbstractC167007dF.A0L(c47982LJb.A04));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
