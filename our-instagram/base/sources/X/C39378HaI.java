package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.HaI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39378HaI extends AbstractC671431f {
    public final UserSession A00;
    public final C38018Go6 A01;
    public final InterfaceC670931a A02;
    public final boolean A03;

    public C39378HaI(UserSession userSession, C38018Go6 c38018Go6, InterfaceC670931a interfaceC670931a, InterfaceC62242sP interfaceC62242sP, C1PY c1py) {
        super(interfaceC62242sP, c1py, false, false, false, false, false, false, false, false, false);
        this.A01 = c38018Go6;
        this.A00 = userSession;
        this.A02 = interfaceC670931a;
        this.A03 = C18U.A06(C06090Tz.A05, userSession, 36317006504399633L);
    }

    @Override // X.AbstractC671431f
    public final int A04(int i) {
        return 0;
    }

    @Override // X.AbstractC671431f
    public final void A0D(InterfaceC42381xS interfaceC42381xS, C671831j c671831j, Integer num, Integer num2, int i, int i2, int i3) {
        C14360o3.A0B(num, 3);
        if (this.A03) {
            C40971v4 c40971v4 = (C40971v4) interfaceC42381xS.BUM();
            C14360o3.A0B(c40971v4, 0);
            C38321qM c38321qM = c40971v4.A0K;
            C14360o3.A0B(c38321qM, 0);
            UserSession userSession = this.A00;
            if (!C5SG.A00(userSession, c38321qM)) {
                if ((num2 == C05F.A0C || num2 == C05F.A0N) && AbstractC114975Hn.A02(num) && !c671831j.A0D(num2, num, i) && i < 2 && i3 < c671831j.A06) {
                    C3YM.A00(userSession).A07(new C25615BUc(C3YP.A03, C05F.A01, Integer.valueOf(i2), null, null, Integer.valueOf(i), null, c38321qM.getId()));
                }
            }
        }
    }

    @Override // X.AbstractC671431f
    public final List A0B() {
        return AbstractC31172DnG.A19(((C42748Ivm) ((AbstractC65202xI) this.A01).A00).A01);
    }

    @Override // X.AbstractC671431f
    public final /* bridge */ /* synthetic */ boolean A0H(Object obj) {
        C40971v4 c40971v4 = (C40971v4) obj;
        C14360o3.A0B(c40971v4, 0);
        C38321qM c38321qM = c40971v4.A0K;
        C14360o3.A0B(c38321qM, 0);
        return AbstractC167007dF.A1M(C5SG.A00(this.A00, c38321qM) ? 1 : 0);
    }

    @Override // X.AbstractC671431f
    public final /* bridge */ /* synthetic */ C671831j A0A(Object obj) {
        return (C671831j) C37469Gen.A00(obj);
    }

    @Override // X.AbstractC671431f
    public final /* bridge */ /* synthetic */ boolean A0G(C671831j c671831j, Object obj) {
        C40971v4 A0J = AbstractC37301Gc2.A0J(obj);
        return this.A02.CeG(A0J.A0K, AbstractC31172DnG.A19(((C42748Ivm) ((AbstractC65202xI) this.A01).A00).A01), c671831j.A09());
    }

    @Override // X.AbstractC671431f
    public final /* bridge */ /* synthetic */ boolean A0I(Object obj) {
        return false;
    }

    @Override // X.AbstractC671431f
    public final /* bridge */ /* synthetic */ void A0E(Object obj, int i, int i2, int i3) {
    }
}
