package X;

import android.app.Application;

/* renamed from: X.JlN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44455JlN extends C193578hc {
    public SZC A00;
    public Boolean A01;
    public boolean A02;
    public final C2GT A03;
    public final C2GT A04;
    public final C2GT A05;
    public final C2GT A06;
    public final C2GT A07;
    public final AbstractC61599RqO A08;
    public final InterfaceC65489TlA A09;
    public final Integer A0A;
    public final InterfaceC06180Ui A0B;
    public final C47717L4y A0C;
    public final SLA A0D;
    public final InterfaceC19390xP A0E;
    public final InterfaceC19390xP A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44455JlN(Application application, AbstractC61599RqO abstractC61599RqO, InterfaceC65489TlA interfaceC65489TlA) {
        super(application);
        C14360o3.A0B(application, 1);
        AbstractC167007dF.A1E(abstractC61599RqO, 2, interfaceC65489TlA);
        this.A08 = abstractC61599RqO;
        this.A09 = interfaceC65489TlA;
        String A00 = AbstractC58317Pt9.A00(227);
        this.A00 = new SZC(A00, A00, "InstallViewModel", A00, A00, A00, "", "");
        C47717L4y c47717L4y = new C47717L4y(A0D(), abstractC61599RqO, interfaceC65489TlA);
        this.A0C = c47717L4y;
        SLA sla = new SLA(application);
        this.A0D = sla;
        InterfaceC19390xP interfaceC19390xP = sla.A01;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A04 = AbstractC58232lf.A00(anonymousClass191, interfaceC19390xP);
        this.A0A = c47717L4y.A02;
        InterfaceC19390xP interfaceC19390xP2 = c47717L4y.A03;
        this.A07 = AbstractC58232lf.A00(anonymousClass191, new MWG(2, this, interfaceC19390xP2));
        this.A06 = AbstractC58232lf.A00(anonymousClass191, interfaceC19390xP2);
        InterfaceC19390xP A01 = C0ST.A01(new C16360rh(new MU8(this, (InterfaceC23621Ds) null, 2), AbstractC43593JPy.A16(interfaceC19390xP, interfaceC19390xP2, 2)));
        this.A0F = A01;
        this.A05 = AbstractC58232lf.A00(anonymousClass191, A01);
        AnonymousClass057 A002 = C10M.A00(C05F.A0C, 10, 10);
        this.A0B = A002;
        InterfaceC19390xP A012 = C0ST.A01(A002);
        this.A0E = A012;
        this.A03 = AbstractC58232lf.A00(anonymousClass191, A012);
    }

    public final void A0E(L2D l2d) {
        AbstractC166987dD.A1Z(new MCH(l2d, this, (InterfaceC23621Ds) null, 10), AbstractC141776au.A00(this));
    }
}
