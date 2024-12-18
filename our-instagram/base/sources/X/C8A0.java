package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;

/* renamed from: X.8A0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8A0 extends AbstractC52922bZ implements InterfaceC150466pv {
    public SliderConfiguration A00;
    public InterfaceC25156BBa A01;
    public final C1821385x A02;
    public final AnonymousClass825 A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;

    public C8A0(C1821385x c1821385x, AnonymousClass825 anonymousClass825) {
        C14360o3.A0B(c1821385x, 2);
        this.A03 = anonymousClass825;
        this.A02 = c1821385x;
        C141796aw A00 = AbstractC141776au.A00(this);
        C206639Cu c206639Cu = new C206639Cu(this, null, 25);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, A00);
        this.A04 = new C008002u(C8A3.A03);
        this.A06 = new C008002u(true);
        this.A07 = new C008002u(Float.valueOf(0.0f));
        this.A05 = new C008002u(false);
    }

    @Override // X.InterfaceC150466pv
    public final void DEx() {
        this.A01 = null;
        this.A05.Egh(false);
    }

    @Override // X.InterfaceC150466pv
    public final void DDu(InterfaceC25156BBa interfaceC25156BBa) {
        this.A01 = interfaceC25156BBa;
        this.A05.Egh(true);
    }

    @Override // X.InterfaceC150466pv
    public final void Dmy(float f) {
        this.A07.Egh(Float.valueOf(f));
    }

    @Override // X.InterfaceC150466pv
    public final void Dmz(SliderConfiguration sliderConfiguration, String str) {
        this.A00 = sliderConfiguration;
    }
}
