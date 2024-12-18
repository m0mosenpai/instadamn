package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.HaG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39376HaG extends AbstractC41050IFt {
    public boolean A00;
    public final UserSession A01;
    public final InterfaceC61352qx A02;
    public final C672531q A03;
    public final C65192xH A04;
    public final C26281Pj A05;
    public final InterfaceC670931a A06;
    public final InterfaceC62242sP A07;
    public final InterfaceC671231d A08;
    public final C31H A09;
    public final List A0A;
    public final java.util.Set A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final C1PC A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39376HaG(UserSession userSession, InterfaceC61352qx interfaceC61352qx, C65192xH c65192xH, C1PC c1pc, InterfaceC670931a interfaceC670931a, InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C31H c31h) {
        super(interfaceC62242sP, interfaceC671231d);
        AbstractC167007dF.A1I(interfaceC62242sP, 5, c1pc);
        this.A08 = interfaceC671231d;
        this.A01 = userSession;
        this.A06 = interfaceC670931a;
        this.A02 = interfaceC61352qx;
        this.A07 = interfaceC62242sP;
        this.A04 = c65192xH;
        this.A09 = c31h;
        this.A0E = c1pc;
        this.A0B = AbstractC31171DnF.A0l();
        this.A03 = new C672531q(c65192xH);
        this.A0D = C18U.A06(C06090Tz.A05, userSession, 36316362259829031L);
        this.A0A = AbstractC16960so.A1Q(AnonymousClass317.A0J, AnonymousClass317.A08, AnonymousClass317.A0P, AnonymousClass317.A07, AnonymousClass317.A0K, AnonymousClass317.A0X);
        this.A05 = C26271Pi.A02.A00(c1pc);
        C06090Tz c06090Tz = C06090Tz.A06;
        this.A0C = C18U.A06(c06090Tz, userSession, 36318797505894893L) || C18U.A06(c06090Tz, userSession, 36319347261709506L);
    }
}
