package X;

import android.view.View;

/* renamed from: X.Fsg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35866Fsg implements InterfaceC55932he {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C151706sG A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    public C35866Fsg(C151706sG c151706sG, InterfaceC16820sZ interfaceC16820sZ, float f, int i) {
        this.A02 = c151706sG;
        this.A00 = f;
        this.A01 = i;
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        Double valueOf;
        if (c55982hj != null && (valueOf = Double.valueOf(c55982hj.A09.A00)) != null && valueOf.doubleValue() == 0.0d) {
            this.A03.invoke();
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        View view;
        C151706sG c151706sG = this.A02;
        float f = (float) ((C55982hj) c151706sG.A02.getValue()).A09.A00;
        float f2 = this.A00;
        int i = this.A01;
        View view2 = c151706sG.A00;
        if (view2 != null && (view = c151706sG.A01) != null) {
            float f3 = 1.0f - 0.0f;
            float f4 = f2 - 0.0f;
            float f5 = 0.0f;
            if (f3 != 0.0f) {
                f5 = (f - 0.0f) / f3;
            }
            float f6 = (f5 * f4) + 0.0f;
            float f7 = 0.5f - 1.0f;
            float f8 = 0.0f;
            if (f3 != 0.0f) {
                f8 = (f - 0.0f) / f3;
            }
            float f9 = (f8 * f7) + 1.0f;
            view.setScaleX(f9);
            view.setScaleY(f9);
            view.setTranslationX(-f6);
            view2.setTranslationX(f6);
            if (f6 == f2) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                InterfaceC09390do interfaceC09390do = c151706sG.A03;
                ((C55982hj) interfaceC09390do.getValue()).A06(((C55982hj) interfaceC09390do.getValue()).A09.A00 - i);
            }
        }
    }
}
