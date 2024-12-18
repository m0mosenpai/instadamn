package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IQ7 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Fragment fragment, UserSession userSession, C38321qM c38321qM, InterfaceC16820sZ interfaceC16820sZ) {
        if (fragment.getActivity() != null) {
            View view = fragment.mView;
            if (view != null) {
                AbstractC13880nE.A0O(view);
            }
            User A2E = c38321qM.A2E(userSession);
            InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession);
            A0e.E77("has_seen_direct_reply_bottom_sheet", true);
            A0e.apply();
            C34725FRo A06 = C28531Zo.A04.A02.A06((InterfaceC11380iw) fragment, userSession, "feed_ufi");
            A06.A02(c38321qM.getId());
            String A0t = AbstractC25231BEo.A0t(A2E);
            Bundle bundle = A06.A01;
            bundle.putString(AbstractC111324zv.A00(149), A0t);
            bundle.putBoolean(AbstractC111324zv.A00(148), true);
            C3DN A0m = AbstractC25230BEn.A0m(fragment);
            if (A0m != null) {
                A0m.A0R(new C33172EkJ(interfaceC16820sZ, 0));
                A0m.A0K(A06.A00());
            }
        }
    }

    public static final void A01(Fragment fragment, C38321qM c38321qM) {
        List AtY;
        JLT BZV = c38321qM.A0C.BZV();
        if (BZV != null && (AtY = BZV.AtY()) != null) {
            String str = (String) AbstractC001800i.A0J(AtY);
            if (str == null) {
                str = "";
            }
            if (str.length() != 0) {
                if (AbstractC14490oL.A0G(fragment.requireContext())) {
                    String queryParameter = AbstractC08820cl.A03(str).getQueryParameter("phone");
                    String queryParameter2 = AbstractC08820cl.A03(str).getQueryParameter("text");
                    if (queryParameter != null) {
                        if (queryParameter.length() != 0) {
                            Context requireContext = fragment.requireContext();
                            C14360o3.A07(requireContext.getResources().getString(2131977075));
                            C14360o3.A07(requireContext.getResources().getString(2131977074));
                            String str2 = "";
                            if (queryParameter2 != null) {
                                str2 = queryParameter2;
                            }
                            Uri.Builder builder = new Uri.Builder();
                            builder.scheme("whatsapp").authority("send").appendQueryParameter("phone", queryParameter).appendQueryParameter("text", AnonymousClass001.A0B(str2));
                            str = AbstractC166987dD.A19(builder);
                        } else {
                            return;
                        }
                    }
                }
                AbstractC41776Ies.A03(fragment.requireContext(), str);
            }
        }
    }
}
