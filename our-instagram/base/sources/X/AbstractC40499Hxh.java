package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.shopping.model.pdp.link.secondarytext.SecondaryTextContent;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Hxh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40499Hxh {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        SecondaryTextContent secondaryTextContent;
        String str;
        String str2;
        List list = c6fw.A00;
        C102884kP c102884kP = (C102884kP) list.get(0);
        if (c102884kP == null) {
            AbstractC25241Le.A02("IgBloksExtensions", "missing parameter: product in bk.action.ig.cxf.SendMessageToMerchant");
            return null;
        }
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 1);
        C102884kP c102884kP2 = (C102884kP) list.get(2);
        Product A01 = AbstractC41287IPc.A01(c102884kP);
        if (c102884kP2 != null) {
            String A0G = c102884kP2.A0G();
            List A0O = c102884kP2.A0O(35);
            secondaryTextContent = new SecondaryTextContent();
            secondaryTextContent.A00 = A0G;
            secondaryTextContent.A01 = A0O;
        } else {
            secondaryTextContent = null;
        }
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        InterfaceC11380iw A08 = C6BQ.A08(c6fq);
        C14360o3.A0B(A0K, 1);
        AbstractC167007dF.A1E(A04, 2, A08);
        C3DN A0r = AbstractC31172DnG.A0r(A04);
        if (A0r != null) {
            Parcelable.Creator creator = User.CREATOR;
            User user = A01.A0B;
            ImageUrl imageUrl = null;
            if (user != null) {
                str = AbstractC76433bn.A00(user);
                str2 = AbstractC37300Gc1.A0U(user);
            } else {
                str = null;
                str2 = null;
            }
            User user2 = new User(str, str2);
            if (user != null) {
                imageUrl = user.A03.Bhu();
            }
            user2.A0i(imageUrl);
            Bundle A00 = AbstractC61636Rr0.A00(AbstractC25230BEn.A1b("IgSessionManager.SESSION_TOKEN_KEY", A0K.token));
            A00.putString(AbstractC111324zv.A00(146), "shopping_pdp");
            A00.putParcelable(AbstractC111324zv.A00(304), A01);
            A00.putString(AbstractC111324zv.A00(612), "message_merchant");
            C42409IqC c42409IqC = new C42409IqC(A08, c6fq, A0I, A0K, A01);
            if (secondaryTextContent != null) {
                A00.putParcelable(AbstractC111324zv.A00(305), secondaryTextContent);
            }
            A0r.A0K(F3M.A00(A00, c42409IqC, user2));
        }
        return null;
    }
}
