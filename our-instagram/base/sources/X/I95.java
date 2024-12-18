package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I95 {
    public static final User A00(UserSession userSession, C38321qM c38321qM, List list) {
        String shopRoutingUserId;
        User A0k;
        List A0Y;
        AbstractC167017dG.A1P(list, userSession);
        if (c38321qM != null && ((!c38321qM.A5M() || ((A0Y = AbstractC37300Gc1.A0Y(c38321qM)) != null && (c38321qM = (C38321qM) AbstractC001800i.A0J(A0Y)) != null)) && (shopRoutingUserId = c38321qM.A0C.getShopRoutingUserId()) != null && (A0k = AbstractC31174DnI.A0k(userSession, shopRoutingUserId)) != null)) {
            Parcelable.Creator creator = User.CREATOR;
            String id = A0k.getId();
            String username = A0k.getUsername();
            return AbstractC38851rI.A02(A0k.A03.BSX(), AbstractC37300Gc1.A08(A0k), A0k.Bhu(), null, Boolean.valueOf(A0k.isVerified()), AbstractC166997dE.A0a(), id, null, username);
        }
        return ((Product) AbstractC001800i.A0I(list)).A0B;
    }
}
