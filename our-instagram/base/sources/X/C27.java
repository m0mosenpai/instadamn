package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.schools.management.data.CheckOTPCodeResponseImpl;

/* loaded from: classes5.dex */
public final class C27 extends AbstractC26821Bsj {
    public static final String __redex_internal_original_name = "SchoolOnboardingConfirmSchoolFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "confirm_school_fragment";
    }

    public static final void A02(C27 c27) {
        AbstractC25229BEm.A1Q(((AbstractC26821Bsj) c27).A00);
        C25873BcV A05 = c27.A05();
        C29886DGa c29886DGa = new C29886DGa(c27, 14);
        C26075Bg4 A01 = C25873BcV.A01(A05);
        String str = A01.A09;
        String str2 = A01.A0A;
        if (str2 != null && str2.length() != 0) {
            if (str != null) {
                C27962CUh c27962CUh = A05.A00;
                C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "affiliation_id");
                C26075Bg4.A03(A0T, c27962CUh.A01);
                C0CA.A00(A0T, str2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                C2JM A0b = AbstractC25225BEi.A0b();
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "CheckOTPCode", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), CheckOTPCodeResponseImpl.class, true, null, 0, null, "xdt_check_otp_code", AbstractC166987dD.A1E());
                AbstractC40691uc.A01(c27962CUh.A00).ATV(new C55656Onh(4, c27962CUh, c29886DGa), new C28912CpM(0, c27962CUh, c29886DGa), pandoGraphQLRequest);
                c27.A07();
            }
        } else {
            A05.A00.A00(EnumC27395C6y.A02);
        }
        c29886DGa.invoke();
        c27.A07();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return A03();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1640901064);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 47), -730388205);
        C0f9.A09(-934833017, A02);
        return A00;
    }
}
