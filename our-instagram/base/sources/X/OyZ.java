package X;

/* loaded from: classes9.dex */
public final class OyZ implements BDN {
    public final /* synthetic */ C50643MXf A00;

    public OyZ(C50643MXf c50643MXf) {
        this.A00 = c50643MXf;
    }

    @Override // X.BDN
    public final void DE2() {
        C86S c86s = this.A00.A0T;
        if (c86s != null) {
            AbstractC166997dE.A1Y(c86s.A0B, true);
        }
    }

    @Override // X.BDN
    public final void DaT() {
        C50643MXf c50643MXf = this.A00;
        if (c50643MXf.A0H) {
            if (c50643MXf.A07 == null) {
                AbstractC12120kG.A07(C50643MXf.__redex_internal_original_name, "textureView is null while showing", null);
            } else {
                c50643MXf.A0e.setLoadingStatus(MY0.A03);
                MSY.A0x(c50643MXf.A07);
                c50643MXf.A0R.setVisibility(8);
            }
            c50643MXf.A0N.postOnAnimation(c50643MXf.A0g);
        }
        C86S c86s = c50643MXf.A0T;
        if (c86s != null) {
            AbstractC166997dE.A1Y(c86s.A0B, true);
        }
    }

    @Override // X.BDN
    public final void onCompletion() {
        C50643MXf c50643MXf = this.A00;
        InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
        if (interfaceC58267PsB != null) {
            interfaceC58267PsB.seekTo(c50643MXf.A02);
            InterfaceC58267PsB interfaceC58267PsB2 = c50643MXf.A0B;
            if (interfaceC58267PsB2 != null) {
                interfaceC58267PsB2.start();
            }
        }
    }
}
