package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;

/* loaded from: classes4.dex */
public final class AX3 implements InterfaceC150466pv {
    public final /* synthetic */ C22911A8h A00;

    @Override // X.InterfaceC150466pv
    public final void Dmz(SliderConfiguration sliderConfiguration, String str) {
    }

    public AX3(C22911A8h c22911A8h) {
        this.A00 = c22911A8h;
    }

    @Override // X.InterfaceC150466pv
    public final void DDu(InterfaceC25156BBa interfaceC25156BBa) {
        if (interfaceC25156BBa != null) {
            C22939A9j c22939A9j = this.A00.A01;
            c22939A9j.A02 = true;
            AbstractC166997dE.A1Y(c22939A9j.A05, true);
            c22939A9j.A01.A0F = new C24143AnS(interfaceC25156BBa);
        }
    }

    @Override // X.InterfaceC150466pv
    public final void DEx() {
        C22939A9j c22939A9j = this.A00.A01;
        c22939A9j.A02 = false;
        AbstractC166997dE.A1Y(c22939A9j.A05, false);
    }

    @Override // X.InterfaceC150466pv
    public final void Dmy(float f) {
        C22939A9j c22939A9j = this.A00.A01;
        float f2 = c22939A9j.A00;
        if (c22939A9j.A04.AJi(Float.valueOf(f)) && f2 != f) {
            c22939A9j.A01.setProgress(f);
            f2 = f;
        }
        c22939A9j.A00 = f2;
    }
}
