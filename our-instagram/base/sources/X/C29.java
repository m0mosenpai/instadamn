package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.schools.management.data.StartValidationMutationResponseImpl;

/* loaded from: classes5.dex */
public final class C29 extends AbstractC26821Bsj implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "SchoolOnboardingStudentEmailFragment";
    public boolean A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "student_email_fragment";
    }

    public static final void A02(C29 c29) {
        C25873BcV A05 = c29.A05();
        C29886DGa c29886DGa = new C29886DGa(c29, 28);
        C29886DGa c29886DGa2 = new C29886DGa(c29, 29);
        C57753Pjg c57753Pjg = new C57753Pjg(c29, 44);
        if (A05.A02() == EnumC27396C6z.A06) {
            c29886DGa.invoke();
            C27962CUh c27962CUh = A05.A00;
            C57252Pba c57252Pba = new C57252Pba(1, c29886DGa2, A05);
            C57750Pjd c57750Pjd = new C57750Pjd(36, A05, c57753Pjg);
            String str = C25873BcV.A01(A05).A0D;
            if (str == null) {
                str = "";
            }
            String A1A = AbstractC25228BEl.A1A(str);
            C14360o3.A0B(A1A, 2);
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, A1A, MSV.A00(271));
            C26075Bg4.A03(A0T, c27962CUh.A01);
            C2JM A0b = AbstractC25225BEi.A0b();
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "StartValidationMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), StartValidationMutationResponseImpl.class, true, null, 0, null, "xdt_start_validation", AbstractC166987dD.A1E());
            AbstractC40691uc.A01(c27962CUh.A00).ATV(new C28909CpI(10, c57750Pjd), new C28913CpN(c57252Pba, c57750Pjd, c27962CUh, A1A, 2), pandoGraphQLRequest);
        }
    }

    @Override // X.AbstractC26821Bsj, X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A00) {
            Intent intent = new Intent();
            intent.putExtra(MSV.A00(670), true);
            requireActivity().setResult(-1, intent);
            AbstractC25227BEk.A1B(this);
            super.onBackPressed();
            return true;
        }
        return super.onBackPressed();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return A03();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1545806787);
        ComposeView A01 = AbstractC25319BIo.A01(this, C5UA.A04(C30482DbR.A00(this, 1), -1880603423, true));
        C0f9.A09(-735938630, A02);
        return A01;
    }
}
