package X;

import android.view.View;

/* renamed from: X.Fsf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35865Fsf implements InterfaceC55932he {
    public final /* synthetic */ C35866Fsg A00;
    public final /* synthetic */ C151706sG A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ boolean A03;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    public C35865Fsf(C35866Fsg c35866Fsg, C151706sG c151706sG, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        this.A01 = c151706sG;
        this.A03 = z;
        this.A00 = c35866Fsg;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        boolean z = this.A03;
        C151706sG c151706sG = this.A01;
        if (z) {
            View view = c151706sG.A01;
            view.setRotationY(0.0f);
            view.setVisibility(0);
            ((C55982hj) c151706sG.A02.getValue()).A04();
            return;
        }
        C35866Fsg c35866Fsg = this.A00;
        C55982hj c55982hj2 = (C55982hj) c151706sG.A02.getValue();
        c55982hj2.A0B(c35866Fsg);
        c55982hj2.A05(0.0d);
        c55982hj2.A0A(c35866Fsg);
        this.A02.invoke();
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C151706sG c151706sG = this.A01;
        float f = ((float) ((C55982hj) c151706sG.A03.getValue()).A09.A00) * 180.0f;
        View view = c151706sG.A00;
        view.setRotationY(f);
        View view2 = c151706sG.A01;
        view2.setRotationY(f);
        float abs = Math.abs(f) % 360.0f;
        if (abs >= 90.0f && abs <= 270.0f) {
            view.setVisibility(4);
            view2.setVisibility(0);
            view2.setScaleX(-1.0f);
        } else {
            view.setVisibility(0);
            view2.setVisibility(4);
        }
    }
}
