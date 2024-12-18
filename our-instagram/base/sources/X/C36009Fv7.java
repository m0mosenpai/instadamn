package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.wellbeing.reporting.common.impersonation.HighProfileVictimSearchBottomSheetFragment;

/* renamed from: X.Fv7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36009Fv7 implements InterfaceC11380iw, InterfaceC71990XEd {
    public static final String __redex_internal_original_name = "HighProfileUsersSearchController";
    public C66362zD A00;
    public SearchController A01;
    public C32483ESj A02;
    public String A03;
    public boolean A04;
    public HighProfileVictimSearchBottomSheetFragment A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final UserSession A09;
    public final InterfaceC132405yL A0A;
    public final AbstractC018607g A0B;

    @Override // X.InterfaceC71990XEd
    public final float Aby(SearchController searchController, Integer num) {
        return 0.0f;
    }

    @Override // X.InterfaceC71990XEd
    public final void Cwf(SearchController searchController, Integer num, float f, float f2) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DTR() {
    }

    @Override // X.InterfaceC71990XEd
    public final void DTT() {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjB(SearchController searchController, boolean z) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DjP(String str, boolean z) {
    }

    @Override // X.InterfaceC71990XEd
    public final void DoO(SearchController searchController, Integer num, Integer num2) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "HIGH_PROFILE_USERS_SEARCH_CONTROLLER";
    }

    @Override // X.InterfaceC71990XEd
    public final void DEw() {
        SearchController searchController = this.A01;
        if (searchController != null) {
            searchController.A00();
        }
        AbstractC71170Wp5 abstractC71170Wp5 = this.A05.A05;
        if (abstractC71170Wp5 != null) {
            ((C33313Eo8) abstractC71170Wp5).A00.A04.A08();
        }
    }

    public C36009Fv7(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC132405yL interfaceC132405yL, HighProfileVictimSearchBottomSheetFragment highProfileVictimSearchBottomSheetFragment, String str, int i, int i2) {
        this.A08 = context;
        this.A09 = userSession;
        this.A03 = str;
        this.A0B = abstractC018607g;
        this.A07 = i;
        this.A0A = interfaceC132405yL;
        this.A05 = highProfileVictimSearchBottomSheetFragment;
        this.A06 = i2 <= 0 ? Integer.MAX_VALUE : i2;
    }

    @Override // X.InterfaceC71990XEd
    public final void DjS(String str, String str2) {
        if (!TextUtils.isEmpty(str) && this.A04) {
            C66362zD c66362zD = this.A00;
            if (c66362zD != null) {
                ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
                Context context = this.A08;
                A0E.A00(new EY0(context.getString(2131973064), AbstractC31174DnI.A03(context), true));
                c66362zD.A05(A0E);
            }
            C61972ry c61972ry = new C61972ry(this.A08, this.A0B);
            UserSession userSession = this.A09;
            int i = this.A06;
            C25621Ms A0D = AbstractC31179DnN.A0D(userSession);
            A0D.A0B("direct_v2/high_profile_search/");
            A0D.A0R(ECH.class, FYY.class);
            A0D.A9s("query", str);
            A0D.A9s("search_surface", "verified_user_search");
            A0D.A0D("count", i);
            A0D.A0D("max_fb_results", i);
            C1ON A0N = A0D.A0N();
            A0N.A00 = this.A02;
            c61972ry.schedule(A0N);
        }
    }
}
