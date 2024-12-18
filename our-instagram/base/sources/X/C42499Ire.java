package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.Ire, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42499Ire implements JG2 {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C33F A03;
    public final C1Y1 A04;
    public final EnumC114765Gh A05;
    public final SearchContext A06;
    public final InterfaceC61432r6 A07;
    public final C1M1 A08;
    public final Long A09;
    public final String A0A;

    public C42499Ire(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C33F c33f, C1Y1 c1y1, SearchContext searchContext, InterfaceC61432r6 interfaceC61432r6, C1M1 c1m1, EnumC114765Gh enumC114765Gh, Long l, String str) {
        C14360o3.A0B(c1m1, 5);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = interfaceC60442pS;
        this.A07 = interfaceC61432r6;
        this.A08 = c1m1;
        this.A03 = c33f;
        this.A05 = enumC114765Gh;
        this.A04 = c1y1;
        this.A06 = searchContext;
        this.A09 = l;
        this.A0A = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JG2
    public final void DOu(C38321qM c38321qM, C75113Zb c75113Zb, String str, InterfaceC16820sZ interfaceC16820sZ, int i) {
        AnonymousClass317 anonymousClass317;
        EnumC77173d3 enumC77173d3;
        boolean A1R = AbstractC167007dF.A1R(0, c38321qM, c75113Zb);
        C14360o3.A0B(str, 3);
        Fragment fragment = this.A00;
        Context context = fragment.getContext();
        if (context != null && !AbstractC15820qc.A0E(context)) {
            C23031Ai A00 = AbstractC23021Ah.A00(this.A01);
            if (!AbstractC167017dG.A1b(A00, A00.A4J, C23031Ai.A8c, 71)) {
                C33F c33f = this.A03;
                ViewParent parent = ((InterfaceC60682pr) fragment).getScrollingViewProxy().getParent();
                C14360o3.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                c33f.A00((ViewGroup) parent, AbstractC25227BEk.A0v(fragment, 2131968943), interfaceC16820sZ, 500L, false);
            }
        }
        UserSession userSession = this.A01;
        boolean A1a = AbstractC37301Gc2.A1a(userSession, c38321qM);
        boolean z = false;
        c75113Zb.A0J(null, A1a, false, false, false);
        InterfaceC61432r6 interfaceC61432r6 = this.A07;
        if (A1a) {
            anonymousClass317 = AnonymousClass317.A0T;
        } else {
            anonymousClass317 = AnonymousClass317.A0D;
        }
        AbstractC37300Gc1.A11(interfaceC61432r6, anonymousClass317, c38321qM, c75113Zb);
        if (A1a) {
            enumC77173d3 = EnumC77173d3.A03;
        } else {
            enumC77173d3 = EnumC77173d3.A02;
        }
        C42347Ip9 A002 = I92.A00(userSession, false);
        C14360o3.A0B(A002, 3);
        if (!c38321qM.A3J().isEmpty()) {
            EnumC77173d3 enumC77173d32 = EnumC77173d3.A02;
            EnumC39623HeX enumC39623HeX = EnumC39623HeX.A05;
            if (enumC77173d3 == enumC77173d32) {
                A002.A0E(c38321qM, enumC39623HeX);
            } else {
                A002.A0F(c38321qM, enumC39623HeX);
            }
        }
        C172077lc A003 = C172077lc.A00(userSession);
        Integer num = C05F.A00;
        boolean z2 = !A1a;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        A003.A01(AbstractC123975jB.A02(interfaceC60442pS, c38321qM, num, "button", z2));
        String A0j = AbstractC167017dG.A0j();
        IEY iey = (IEY) userSession.A01(IEY.class, new DGY(userSession, 45));
        String id = c38321qM.getId();
        C1QT c1qt = iey.A00;
        long A004 = c1qt.A00(C05F.A0Y, "like_from_ufi", "ufi_like_clicked");
        c1qt.flowAnnotate(A004, AbstractC111324zv.A00(2641), A1a);
        if (id != null) {
            c1qt.flowAnnotate(A004, "media_id", id);
        }
        iey.A01.put(A0j, Long.valueOf(A004));
        C11520jB A0B = AbstractC37300Gc1.A0B();
        AbstractC37300Gc1.A0z(C5I8.A24, A0B, c75113Zb.A2r);
        C11500j9 c11500j9 = C5I8.A23;
        if (c75113Zb.A0b > 0) {
            z = true;
        }
        AbstractC37300Gc1.A0z(c11500j9, A0B, z);
        A0B.A04(C5I8.A25, Double.valueOf(c75113Zb.A0b));
        Context requireContext = fragment.requireContext();
        int i2 = c75113Zb.A0W;
        int i3 = c75113Zb.A03;
        int i4 = c75113Zb.A0U;
        FragmentActivity activity = fragment.getActivity();
        C1M1 c1m1 = this.A08;
        EnumC77173d3 enumC77173d33 = enumC77173d3;
        AbstractC41706Idc.A01(activity, requireContext, A0B, userSession, new C42531IsA(this, c38321qM, c75113Zb, A0j, z2), enumC77173d33, c38321qM, null, interfaceC60442pS, this.A06, c1m1, num, this.A09, IQ1.A01(c1m1), IQ1.A00(c1m1), this.A0A, i, i2, i3, i4, c75113Zb.A2U);
        if (AbstractC75103Za.A0Q(c38321qM, c75113Zb.A03) && c38321qM.A5l()) {
            AbstractC123605iZ.A00(userSession);
            C123625ib.A00(userSession, c38321qM, interfaceC60442pS, c75113Zb);
            c75113Zb.A0m(A1R, A1R);
            c75113Zb.A1K = AbstractC111324zv.A00(2663);
        }
    }
}
