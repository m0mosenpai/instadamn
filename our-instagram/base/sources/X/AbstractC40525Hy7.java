package X;

import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Hy7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40525Hy7 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        Product product;
        String str = (String) c6fw.A03(0);
        List list = c6fw.A00;
        C102884kP c102884kP = (C102884kP) list.get(1);
        String A0s = AbstractC31173DnH.A0s(list, 2);
        if (c102884kP != null) {
            product = AbstractC41287IPc.A01(c102884kP);
        } else {
            product = null;
        }
        FragmentActivity A04 = C6BQ.A04(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        switch (str.hashCode()) {
            case 110844:
                if (str.equals("pdp")) {
                    C42579Isx c42579Isx = new C42579Isx(A08);
                    if (product != null) {
                        C42130Ile.A01(C1XJ.A00.A0L(A04, A0K, c42579Isx, product, "bloks", null));
                        return null;
                    }
                    return null;
                }
                throw AbstractC31175DnJ.A0V("unknown destination ", str);
            case 2072880909:
                if (str.equals("merchant_shop")) {
                    if (A0s != null) {
                        SimpleImageUrl A0t = AbstractC25225BEi.A0t("");
                        Parcelable.Creator creator = User.CREATOR;
                        User A03 = AbstractC38851rI.A03(A0t, A0s, "");
                        C1XJ.A00.A0N(A04, AbstractC37300Gc1.A08(A03), A0K, new C42580Isy(A08), null, null, "merchant_shopping_bag_view_shop_row", AbstractC76433bn.A00(A03), AbstractC37300Gc1.A0U(A03)).A05();
                        return null;
                    }
                    return null;
                }
                throw AbstractC31175DnJ.A0V("unknown destination ", str);
            case 2073932338:
                if (str.equals("merchant_profile")) {
                    if (A0s != null) {
                        C31368DqX.A01(AbstractC31173DnH.A0P(A04, A0K), A0K, AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(A0K, A0s, AbstractC111324zv.A00(4910), A08.getModuleName()));
                    }
                    return null;
                }
                throw AbstractC31175DnJ.A0V("unknown destination ", str);
            default:
                throw AbstractC31175DnJ.A0V("unknown destination ", str);
        }
    }
}
