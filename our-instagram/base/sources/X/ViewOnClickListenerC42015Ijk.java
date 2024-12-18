package X;

import android.content.Context;
import android.view.View;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl;
import com.instagram.trials.view.ClipsTrialBottomSheetFragment$openActionSheet$1$2$1;
import com.instagram.user.model.User;

/* renamed from: X.Ijk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42015Ijk implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    public ViewOnClickListenerC42015Ijk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj5;
        this.A08 = str;
        this.A09 = str2;
        this.A04 = obj3;
        this.A05 = obj6;
        this.A06 = obj7;
        this.A07 = obj4;
        this.A02 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1247782637);
                C41592Iaf c41592Iaf = (C41592Iaf) this.A05;
                C41592Iaf.A00(c41592Iaf, "remove");
                Context context = (Context) this.A02;
                C193328hC A0I = AbstractC31171DnF.A0I(context);
                int A0H = AbstractC166987dD.A0H(this.A01);
                int i2 = 2131973971;
                if (A0H != 0) {
                    i2 = 2131973965;
                }
                A0I.A0A(i2);
                int i3 = 2131973969;
                if (A0H != 0) {
                    i3 = 2131973963;
                }
                A0I.A09(i3);
                int i4 = 2131973970;
                if (A0H != 0) {
                    i4 = 2131973964;
                }
                String A0p = AbstractC166997dE.A0p(context, i4);
                String str = this.A09;
                String str2 = this.A08;
                C38321qM c38321qM = (C38321qM) this.A06;
                UserSession userSession = (UserSession) this.A07;
                AbstractC018607g abstractC018607g = (AbstractC018607g) this.A04;
                JI5 ji5 = (JI5) this.A03;
                A0I.A0Z(new DialogInterfaceOnClickListenerC41816IfW(context, abstractC018607g, userSession, c38321qM, c41592Iaf, ji5, str, str2), EnumC193348hE.A06, A0p, true);
                A0I.A03();
                A0I.A0s(true);
                A0I.A0t(true);
                if (ji5 != null) {
                    A0I.A0g(new DialogInterfaceOnDismissListenerC41843Ifx(ji5, 2));
                }
                AbstractC166987dD.A1W(A0I);
                if (ji5 != null) {
                    ji5.Df2();
                }
                i = 636527780;
                break;
            case 1:
                A05 = C0f9.A05(828058179);
                C57312k6 A00 = C07Y.A00((ComponentActivity) this.A01);
                C153936w2 c153936w2 = (C153936w2) this.A03;
                String str3 = this.A08;
                String str4 = this.A09;
                EnumC37319GcL enumC37319GcL = (EnumC37319GcL) this.A04;
                ClipsTrialBottomSheetRepositoryImpl clipsTrialBottomSheetRepositoryImpl = (ClipsTrialBottomSheetRepositoryImpl) this.A05;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
                AbstractC166987dD.A1Z(new ClipsTrialBottomSheetFragment$openActionSheet$1$2$1((Context) this.A02, enumC37319GcL, (UserSession) this.A07, c153936w2, clipsTrialBottomSheetRepositoryImpl, str3, str4, null, interfaceC16820sZ), A00);
                i = 923398494;
                break;
            default:
                A05 = C0f9.A05(130695601);
                Object obj = this.A02;
                N80 n80 = (N80) this.A07;
                Context requireContext = n80.requireContext();
                User user = (User) this.A05;
                if (C14360o3.A0K(obj, AbstractC167007dF.A0f(requireContext, user.getUsername(), 2131966858))) {
                    FR7 fr7 = (FR7) this.A04;
                    if (fr7 != null) {
                        fr7.A01(new PIW((UserSession) this.A06, user, (C54810OKj) this.A03, this.A08, this.A09), user, "LiveVideoViewerList", false, true);
                    }
                } else if (C14360o3.A0K(obj, n80.requireContext().getString(2131972215))) {
                    Context requireContext2 = n80.requireContext();
                    FragmentActivity requireActivity = n80.requireActivity();
                    UserSession userSession2 = (UserSession) this.A06;
                    FCD.A00(requireActivity, requireContext2, n80, (InterfaceC11380iw) this.A01, userSession2, new PIX(userSession2, user, (C54810OKj) this.A03, n80, this.A08, this.A09), user);
                }
                i = -2079905966;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
