package X;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class WYX implements C4RH {
    public WL0 A00;
    public final C121745fS A01;
    public final XL9 A02;

    @Override // X.C4RH
    public final /* synthetic */ void ACK(C4ST c4st) {
    }

    @Override // X.C4RH
    public final /* synthetic */ void Ded() {
    }

    @Override // X.C4RH
    public final /* synthetic */ void Dzu(int i, int i2, float f) {
    }

    @Override // X.C4RH
    public final View AMm(Context context, C4RP c4rp, C4RP c4rp2) {
        XL9 xl9 = this.A02;
        C121745fS c121745fS = this.A01;
        UtR utR = new UtR(context);
        utR.setZOrderOnTop(false);
        WL0 wl0 = new WL0(c4rp, c121745fS, xl9);
        this.A00 = wl0;
        utR.getHolder().addCallback(wl0);
        return utR;
    }

    @Override // X.C4RH
    public final Surface BAQ() {
        WL0 wl0 = this.A00;
        if (wl0 != null) {
            return wl0.A00;
        }
        return null;
    }

    @Override // X.C4RH
    public final /* synthetic */ C6Q2 Be3() {
        return C6Q2.A02;
    }

    @Override // X.C4RH
    public final /* synthetic */ InterfaceC126155nC C4P() {
        return null;
    }

    public WYX(C121745fS c121745fS, XL9 xl9) {
        this.A01 = c121745fS;
        this.A02 = xl9;
    }

    @Override // X.C4RH
    public final void D9z(ViewGroup viewGroup) {
    }
}
