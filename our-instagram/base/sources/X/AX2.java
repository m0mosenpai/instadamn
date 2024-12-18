package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;

/* loaded from: classes4.dex */
public final class AX2 implements InterfaceC150466pv {
    public final /* synthetic */ C24213Aof A00;

    @Override // X.InterfaceC150466pv
    public final void DDu(InterfaceC25156BBa interfaceC25156BBa) {
        C14360o3.A0B(interfaceC25156BBa, 0);
        C24213Aof c24213Aof = this.A00;
        c24213Aof.A01 = interfaceC25156BBa;
        AbstractC167027dH.A15(C05F.A0j, c24213Aof.A09, AbstractC167027dH.A0X());
    }

    @Override // X.InterfaceC150466pv
    public final void Dmz(SliderConfiguration sliderConfiguration, String str) {
        C14360o3.A0B(sliderConfiguration, 1);
        this.A00.A09.add(AbstractC61636Rr0.A00(AbstractC167027dH.A0X(), AbstractC167027dH.A0Y(C05F.A0Y), AbstractC166987dD.A1L("steps", Integer.valueOf(sliderConfiguration.mSteps)), AbstractC166987dD.A1L("sliderType", Integer.valueOf(sliderConfiguration.mSliderType)), AbstractC166987dD.A1L("colorSamplerRGBAData", sliderConfiguration.mColorSamplerRGBAData)));
    }

    public AX2(C24213Aof c24213Aof) {
        this.A00 = c24213Aof;
    }

    @Override // X.InterfaceC150466pv
    public final void DEx() {
        AbstractC167027dH.A15(C05F.A0u, this.A00.A09, AbstractC167027dH.A0X());
    }

    @Override // X.InterfaceC150466pv
    public final void Dmy(float f) {
        AbstractC167027dH.A14("adjustmentValue", Float.valueOf(f), this.A00.A09, AbstractC167027dH.A0X(), AbstractC167027dH.A0Y(C05F.A15));
    }
}
