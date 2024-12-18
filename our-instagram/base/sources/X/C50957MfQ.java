package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.video.live.mvvm.viewmodel.cameraeffect.IgLiveFaceFilterViewModel$1;

/* renamed from: X.MfQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50957MfQ extends AbstractC52922bZ {
    public CameraAREffect A00;
    public final C22C A01;
    public final InterfaceC58088PpD A02;
    public final MTU A03;
    public final InterfaceC24731Iq A04;
    public final InterfaceC19390xP A05;
    public final C05A A06;
    public final C05A A07;
    public final C0UO A08;
    public final AbstractC55106ObM A09;
    public final OLC A0A;

    public C50957MfQ(C22C c22c, AbstractC55106ObM abstractC55106ObM, InterfaceC58088PpD interfaceC58088PpD, OLC olc, MTU mtu) {
        AbstractC167027dH.A13(mtu, olc, abstractC55106ObM);
        this.A03 = mtu;
        this.A0A = olc;
        this.A09 = abstractC55106ObM;
        this.A02 = interfaceC58088PpD;
        this.A01 = c22c;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A04 = A12;
        this.A05 = AbstractC07080Za.A03(A12);
        C008002u A1H = AbstractC25225BEi.A1H(new MUG((CameraAREffect) null, EnumC1810181d.A08, false));
        this.A06 = A1H;
        this.A08 = AbstractC208910l.A02(A1H);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A07 = A1A;
        AbstractC18560vj.A03(AbstractC141776au.A00(this), C10Q.A02(new IgLiveFaceFilterViewModel$1(this, null), olc.A0f, olc.A0e, olc.A0o, A1A, abstractC55106ObM.A03));
        AbstractC25232BEp.A1J(this, new C57158PZc(this, null, 45), mtu.A00);
    }
}
