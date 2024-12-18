package X;

import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Hxe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40496Hxe {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        String str = (String) A03;
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 1);
        String A0s2 = AbstractC31173DnH.A0s(list, 2);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        Parcelable.Creator creator = User.CREATOR;
        User A032 = AbstractC38851rI.A03(AbstractC25225BEi.A0t(""), str, "");
        if (A0s2 == null) {
            A0s2 = A08.getModuleName();
        }
        C42578Isw c42578Isw = new C42578Isw(A0s2);
        C1XJ.A00.A0N(A04, AbstractC37300Gc1.A08(A032), A0K, c42578Isw, A0s, A0s2, "shopping_product_details_page", str, AbstractC37300Gc1.A0U(A032)).A05();
        return null;
    }
}
