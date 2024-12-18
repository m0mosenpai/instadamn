package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class C28 extends AbstractC26821Bsj implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "SchoolOnboardingAddSchoolFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "add_school_fragment";
    }

    @Override // X.AbstractC26821Bsj, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UserSession A03 = A03();
        if (C18U.A06(AbstractC25225BEi.A0j(A03, 0), A03, 36324685906588047L)) {
            C27962CUh c27962CUh = A05().A00;
            C27264C1h c27264C1h = new C27264C1h(c27962CUh.A00);
            C57753Pjg c57753Pjg = new C57753Pjg(c27962CUh, 35);
            String str = ((C26075Bg4) c27962CUh.A01.getValue()).A00.A00;
            C14360o3.A07(str);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            AbstractC25231BEo.A18(AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "surface"), A0b);
            PandoGraphQLRequest A00 = AbstractC28920CpU.A00(A0b, A0b2);
            C40701ud A01 = AbstractC40691uc.A01(c27264C1h.A00);
            C14360o3.A0A(A00);
            C28909CpI.A00(new C58510Pwe(c57753Pjg, 26), A00, A01, c27264C1h, 6);
        }
    }

    @Override // X.AbstractC26821Bsj, X.InterfaceC60072op
    public final boolean onBackPressed() {
        List list = AbstractC27784CMz.A00;
        if (!list.contains(C75.A05) && !list.contains(C75.A04)) {
            A08();
            return false;
        }
        C193328hC c193328hC = new C193328hC(requireContext());
        c193328hC.A0A(2131953191);
        c193328hC.A09(2131972113);
        c193328hC.A0J(new DialogInterfaceOnClickListenerC28537CiV(this, 13), 2131961988);
        c193328hC.A0N(null, 2131963260, true);
        AbstractC166987dD.A1W(c193328hC);
        return true;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return A03();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(636900681);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 46), 819451187);
        C0f9.A09(-526138527, A02);
        return A00;
    }
}
