package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.wellbeing.reporting.common.impersonation.ConsolidatedProfileSearchBottomSheetFragment;

/* renamed from: X.Fv6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36008Fv6 implements InterfaceC11380iw, InterfaceC71990XEd {
    public static final String __redex_internal_original_name = "ConsolidatedProfileSearchController";
    public C66362zD A00;
    public SearchController A01;
    public boolean A02;
    public ConsolidatedProfileSearchBottomSheetFragment A03;
    public final int A04;
    public final Context A05;
    public final UserSession A06;
    public final InterfaceC132405yL A07;
    public final int A08;
    public String mResponsibleUserId;

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
        return "CONSOLIDATED_PROFILE_SEARCH_CONTROLLER";
    }

    @Override // X.InterfaceC71990XEd
    public final void DEw() {
        SearchController searchController = this.A01;
        if (searchController != null) {
            searchController.A00();
        }
        AbstractC71170Wp5 abstractC71170Wp5 = this.A03.A05;
        if (abstractC71170Wp5 != null) {
            ((C33313Eo8) abstractC71170Wp5).A00.A04.A08();
        }
    }

    @Override // X.InterfaceC71990XEd
    public final void DjS(String str, String str2) {
        if (!TextUtils.isEmpty(str) && this.A02) {
            C66362zD c66362zD = this.A00;
            if (c66362zD != null) {
                ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
                Context context = this.A05;
                A0E.A00(new EY0(context.getString(2131973064), AbstractC31174DnI.A03(context), true));
                c66362zD.A05(A0E);
            }
            C40701ud A01 = AbstractC40691uc.A01(this.A06);
            int i = this.A08;
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "query");
            C0CA.A00(A0T, AbstractC31171DnF.A0V(i), "count");
            C0CA.A00(A0T, "report_profile_ig_search", "search_surface");
            C2JM A0b = AbstractC25225BEi.A0b();
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "request_data"), "ProfileReportingSearchQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C60421Qz9.class, false, null, 0, null, "xdt_profile_reporting_search", AbstractC166987dD.A1E());
            A01.ATV(new C35796FrY(2), new C31463Ds7(this, 14), pandoGraphQLRequest);
        }
    }

    public C36008Fv6(Context context, UserSession userSession, InterfaceC132405yL interfaceC132405yL, ConsolidatedProfileSearchBottomSheetFragment consolidatedProfileSearchBottomSheetFragment, String str, int i, int i2) {
        this.A05 = context;
        this.A06 = userSession;
        this.mResponsibleUserId = str;
        this.A04 = i;
        this.A07 = interfaceC132405yL;
        this.A03 = consolidatedProfileSearchBottomSheetFragment;
        this.A08 = i2 <= 0 ? Integer.MAX_VALUE : i2;
    }
}
