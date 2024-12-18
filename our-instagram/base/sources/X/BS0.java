package X;

import android.animation.Animator;
import android.hardware.Sensor;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BS0 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ Animator A00;
    public final /* synthetic */ Animator A01;
    public final /* synthetic */ Animator A02;
    public final /* synthetic */ C76223bS A03;
    public final /* synthetic */ C2XI A04;
    public final /* synthetic */ C2XI A05;
    public final /* synthetic */ C2XI A06;
    public final /* synthetic */ C2XI A07;
    public final /* synthetic */ C2XI A08;
    public final /* synthetic */ C2XI A09;
    public final /* synthetic */ C2XI A0A;
    public final /* synthetic */ C2XI A0B;
    public final /* synthetic */ C25562BRz A0C;
    public final /* synthetic */ C15370ps A0D;
    public final /* synthetic */ boolean A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BS0(Animator animator, Animator animator2, Animator animator3, C76223bS c76223bS, C2XI c2xi, C2XI c2xi2, C2XI c2xi3, C2XI c2xi4, C2XI c2xi5, C2XI c2xi6, C2XI c2xi7, C2XI c2xi8, C25562BRz c25562BRz, C15370ps c15370ps, boolean z) {
        super(0);
        this.A0E = z;
        this.A03 = c76223bS;
        this.A0C = c25562BRz;
        this.A05 = c2xi;
        this.A04 = c2xi2;
        this.A07 = c2xi3;
        this.A06 = c2xi4;
        this.A08 = c2xi5;
        this.A09 = c2xi6;
        this.A0A = c2xi7;
        this.A0B = c2xi8;
        this.A0D = c15370ps;
        this.A00 = animator;
        this.A01 = animator2;
        this.A02 = animator3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        WIP wip;
        if (this.A0E) {
            wip = new WIP(AbstractC25227BEk.A0A(this.A03));
        } else {
            wip = null;
        }
        C25562BRz c25562BRz = this.A0C;
        UserSession userSession = c25562BRz.A04;
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        float A01 = (float) C18U.A01(A0U, userSession, 36609150179940203L);
        float A012 = (float) C18U.A01(A0U, userSession, 36609150180005740L);
        float A013 = (float) C18U.A01(A0U, userSession, 36609150180136814L);
        float A014 = (float) C18U.A01(A0U, userSession, 36609150180202351L);
        float A00 = AbstractC25225BEi.A00(A0U, userSession, 37172100133683769L);
        float A002 = AbstractC25225BEi.A00(A0U, userSession, 37172100133749306L);
        if (wip != null) {
            C69467Vnq c69467Vnq = new C69467Vnq(this.A05, this.A04, this.A07, this.A06, this.A08, this.A09, this.A0A, this.A0B, c25562BRz, A013, A002, A01, A012, A00, A014);
            Sensor sensor = wip.A02;
            if (sensor != null) {
                wip.A00 = c69467Vnq;
                C0fX.A01(sensor, wip, wip.A03, 1);
            }
        }
        return AbstractC25225BEi.A0f(new C29722D8s(2, wip, this.A01, this.A0D, this.A02, this.A00, c25562BRz));
    }
}
