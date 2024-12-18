package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7YE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7YE {
    public Boolean A00;
    public final AbstractC59962oe A01;
    public final InterfaceC11380iw A02;
    public final C41761wQ A03;
    public final UserSession A04;
    public final C7YG A05;
    public final InterfaceC83713oG A06;
    public final InterfaceC08830cm A07;
    public final InterfaceC16820sZ A08;

    public C7YE(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC83713oG interfaceC83713oG, InterfaceC08830cm interfaceC08830cm, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A01 = abstractC59962oe;
        this.A04 = userSession;
        this.A02 = interfaceC11380iw;
        this.A06 = interfaceC83713oG;
        this.A07 = interfaceC08830cm;
        this.A08 = interfaceC16820sZ;
        this.A05 = C7YF.A00(userSession);
        this.A03 = new C41761wQ(null);
    }

    public final void maybeRedirectThread() {
        UserSession userSession = this.A04;
        if (C18U.A06(C06090Tz.A05, userSession, 2342156051466094224L)) {
            InterfaceC83713oG interfaceC83713oG = this.A06;
            if ((interfaceC83713oG instanceof InterfaceC83703oF) && ((Boolean) this.A08.invoke()).booleanValue()) {
                C7YG c7yg = this.A05;
                AbstractC59962oe abstractC59962oe = this.A01;
                c7yg.A01(abstractC59962oe.getActivity(), abstractC59962oe, this.A02, userSession, AbstractC140946Yw.A01(interfaceC83713oG), (List) this.A07.get());
                C41761wQ c41761wQ = this.A03;
                C42221xC A00 = C137766Ly.A00(C137746Lw.A00(c7yg.A00, "IGDThreadCutoverHelper").A01);
                final MKS mks = MKS.A00;
                c41761wQ.A02(A00.A0M(new C6J5(mks) { // from class: X.Lck
                    public final /* synthetic */ InterfaceC16660sJ A00;

                    {
                        C14360o3.A0B(mks, 1);
                        this.A00 = mks;
                    }

                    @Override // X.C6J5
                    public final /* synthetic */ boolean test(Object obj) {
                        return AbstractC25231BEo.A1a(obj, this.A00);
                    }
                }).A0O(AbstractC142856cl.A01), new C24233Aoz(this));
            }
        }
    }
}
