package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iub, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42680Iub implements GZA {
    public final int A00;
    public final Object A01;

    public C42680Iub(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GZA
    public final void onActionClicked() {
        switch (this.A00) {
            case 0:
                C38914HBl c38914HBl = new C38914HBl();
                V12 v12 = (V12) this.A01;
                PromoteData promoteData = v12.A08;
                if (promoteData == null) {
                    C14360o3.A0F("promoteData");
                    throw C00O.createAndThrow();
                }
                UserSession userSession = promoteData.A0y;
                C14360o3.A06(userSession);
                C189478aR A0N = AbstractC31175DnJ.A0N(userSession);
                V12.A00(v12).A0G(VG4.A0T, AbstractC111324zv.A00(3110));
                A0N.A02(v12.requireActivity(), c38914HBl);
                return;
            case 1:
                HDJ hdj = ((HEI) this.A01).A08;
                FragmentActivity activity = hdj.getActivity();
                if (activity == null) {
                    return;
                }
                C140966Yy A0r = AbstractC25225BEi.A0r(activity, hdj.A03);
                A0r.A0E(FBR.A00(EnumC72365Xc1.A0M, null));
                A0r.A04();
                return;
            default:
                HDJ hdj2 = ((HEI) this.A01).A08;
                Context context = hdj2.getContext();
                if (context != null) {
                    String string = hdj2.getString(2131957640);
                    String string2 = hdj2.getString(2131969612);
                    C193328hC A0I = AbstractC31171DnF.A0I(context);
                    A0I.A0s(true);
                    A0I.A0t(true);
                    A0I.A0A(2131957643);
                    A0I.A0Z(new DialogInterfaceOnClickListenerC41800IfG(3, hdj2, context), EnumC193348hE.A06, string, true);
                    A0I.A0c(null, string2);
                    AbstractC166987dD.A1W(A0I);
                    return;
                }
                return;
        }
    }

    @Override // X.GZA
    public final /* synthetic */ void onBannerDismissed() {
    }
}
