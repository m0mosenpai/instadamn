package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Iz0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42948Iz0 implements InterfaceC670130s, InterfaceC669530m {
    public int A00;
    public C31G A01;
    public Integer A02;
    public java.util.Set A03;
    public InterfaceC669830p A04;
    public InterfaceC670130s A05;
    public final Context A06;
    public final IJS A07;
    public final C1OK A08;
    public final UserSession A09;
    public final InterfaceC61432r6 A0A;

    public C42948Iz0(Context context, UserSession userSession, InterfaceC61432r6 interfaceC61432r6, ContextualFeedFragment contextualFeedFragment) {
        C14360o3.A0B(userSession, 2);
        this.A06 = context;
        this.A09 = userSession;
        this.A0A = interfaceC61432r6;
        this.A02 = C05F.A00;
        this.A04 = new C669730o();
        this.A08 = new C1OK();
        this.A07 = new IJS(this, userSession, contextualFeedFragment);
    }

    public final void A00(String str, String str2, String str3, boolean z, boolean z2) {
        C14360o3.A0B(str3, 2);
        UserSession userSession = this.A09;
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        Integer num = C05F.A01;
        A0q.A09(num);
        A0q.A0B("discover/chaining_experience_notification_ads/");
        A0q.A0P(null, HBC.class, C41320IQq.class, false);
        A0q.A00 = this.A08.A00;
        AbstractC37300Gc1.A0y(A0q, str3);
        A0q.A9s("seed_media_id", str);
        A0q.A9s("seed_ad_id", str2);
        A0q.A0I("need_seed_media", z);
        InterfaceC61432r6 interfaceC61432r6 = this.A0A;
        Map AUS = interfaceC61432r6.AUS(EnumC64222vh.A04.toString());
        Map A00 = AbstractC85703rz.A00(AUS);
        this.A03 = AbstractC85703rz.A01(AUS);
        Iterator A15 = AbstractC166997dE.A15(A00);
        while (A15.hasNext()) {
            AbstractC37303Gc4.A16(A0q, A15);
        }
        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A06;
        java.util.Set set = this.A03;
        if (set != null) {
            interfaceC61432r6.FCF(enumC74603Ws, set);
        }
        A0q.A0R = true;
        AbstractC37301Gc2.A0t(this.A06, A0q, userSession);
        if (AbstractC39718Hjo.A00(userSession)) {
            this.A00++;
        }
        C1ON A0N = A0q.A0N();
        this.A04.DGn(new C85633rs(null, null, null, null, null, null, null, null, AbstractC16960so.A1N(str2), false, false, false, false));
        this.A02 = num;
        IJS ijs = this.A07;
        ijs.A02 = true;
        A0N.A00 = new C37476Geu(0, ijs, z2);
        C1GJ.A06(A0N, 332178420, 2, true, true);
    }

    @Override // X.InterfaceC669530m
    public final int BX5() {
        return 0;
    }

    @Override // X.InterfaceC669530m
    public final int Bg5() {
        return 0;
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ void CKM(C206209Bd c206209Bd, List list) {
    }

    @Override // X.InterfaceC669530m
    public final void Co5() {
    }

    @Override // X.InterfaceC669530m
    public final void CoL(AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, boolean z) {
    }

    @Override // X.InterfaceC669530m
    public final void CoN(int i) {
    }

    @Override // X.InterfaceC670130s
    public final void CtX(int i) {
    }

    @Override // X.InterfaceC670130s
    public final void D7Y() {
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final void Dtv(int i) {
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ boolean AFs() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ C51G AND() {
        return new C43000Izq();
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ String B5L() {
        return "";
    }

    @Override // X.InterfaceC669530m
    public final boolean CUl() {
        return AbstractC25229BEm.A1a(this.A02, C05F.A00);
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void Cnx(boolean z) {
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(53));
    }

    @Override // X.InterfaceC670130s
    public final /* synthetic */ C101484hA DnY(Integer num, Integer num2, List list) {
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(24));
    }

    @Override // X.InterfaceC669530m
    public final void deactivate() {
        this.A07.A02 = false;
        this.A08.A00();
    }

    @Override // X.InterfaceC669530m
    public final boolean A7S(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        boolean A1a = AbstractC167017dG.A1a(interfaceC670130s, interfaceC669830p);
        this.A05 = interfaceC670130s;
        this.A04 = interfaceC669830p;
        return A1a;
    }

    @Override // X.InterfaceC670130s
    public final Map Bkt() {
        return AbstractC166987dD.A1I();
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ java.util.Set Bts() {
        return AbstractC166987dD.A1H();
    }

    @Override // X.InterfaceC670130s
    public final C101484hA DnX(Integer num, List list) {
        C101484hA DnX;
        AbstractC167017dG.A1N(list, num);
        InterfaceC670130s interfaceC670130s = this.A05;
        if (interfaceC670130s == null || (DnX = interfaceC670130s.DnX(num, list)) == null) {
            C16930sl c16930sl = C16930sl.A00;
            return new C101484hA(c16930sl, c16930sl);
        }
        return DnX;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void CoM(C9C3 c9c3, AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, String str, String str2, double d, boolean z) {
        AbstractC167017dG.A1Q(anonymousClass320, enumC37671p4);
    }
}
