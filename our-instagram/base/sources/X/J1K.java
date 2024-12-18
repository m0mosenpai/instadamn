package X;

import android.content.Context;
import android.widget.AbsListView;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class J1K implements InterfaceC62602sz, InterfaceC62612t0, AbsListView.OnScrollListener {
    public Integer A00;
    public String A01;
    public boolean A02;
    public final UserSession A03;
    public final ID4 A04;
    public final EnumC39584Hdu A05;
    public final String A06;
    public final Context A07;
    public final AbstractC018607g A08;
    public final C65953Twy A09;

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A00(this, false);
    }

    public static final void A00(J1K j1k, boolean z) {
        String str;
        if (j1k.A00 != C05F.A00) {
            C25621Ms A0M = AbstractC31177DnL.A0M(j1k.A03);
            A0M.A0B(AbstractC111324zv.A00(2169));
            A0M.A0R(HBF.class, ISF.class);
            if (!z && (str = j1k.A01) != null) {
                A0M.A9s("max_id", str);
            }
            String str2 = j1k.A06;
            if (str2 != null && str2.equals("entry_point_creator_swipe_up_to_shop")) {
                A0M.A9s("require_visible_profile_shop", "true");
                A0M.A9s("include_viewer_if_business", "true");
            }
            EnumC39584Hdu enumC39584Hdu = j1k.A05;
            if (enumC39584Hdu != null) {
                A0M.A9s("surface", enumC39584Hdu.A00);
            }
            C1ON A0N = A0M.A0N();
            C39030HGg.A00(A0N, j1k, 20);
            C1GJ.A00(j1k.A07, j1k.A08, A0N);
        }
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (this.A00 == C05F.A0C && this.A02) {
            A00(this, false);
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        if (this.A04.A00.A02 == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        return !r0.isEmpty();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return this.A02;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return AbstractC167007dF.A1X(this.A00, C05F.A01);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return AbstractC167007dF.A1X(this.A00, C05F.A00);
    }

    public J1K(Context context, AbstractC018607g abstractC018607g, UserSession userSession, ID4 id4, EnumC39584Hdu enumC39584Hdu, String str) {
        AbstractC167017dG.A1P(id4, userSession);
        this.A04 = id4;
        this.A03 = userSession;
        this.A07 = context;
        this.A08 = abstractC018607g;
        this.A09 = new C65953Twy(userSession, this, C05F.A01, 5);
        this.A06 = str;
        this.A05 = enumC39584Hdu;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (isLoading()) {
            return CL7();
        }
        return true;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0N = AbstractC167017dG.A0N(absListView, 558091180);
        this.A09.onScroll(absListView, i, i2, i3);
        C0f9.A0A(-1992627755, A0N);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, 1753892475);
        this.A09.onScrollStateChanged(absListView, i);
        C0f9.A0A(-166907737, A0N);
    }
}
