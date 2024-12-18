package X;

import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I99 {
    public static final boolean A00(C38321qM c38321qM, User user) {
        Iterable iterable;
        ClipsShoppingInfoIntf Buh;
        List A0a = AbstractC001800i.A0a(c38321qM.A3J());
        C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
        if (A0u == null || (Buh = A0u.Buh()) == null || (iterable = I3Q.A00(Buh)) == null) {
            iterable = C16930sl.A00;
        }
        ArrayList A0S = AbstractC001800i.A0S(iterable, A0a);
        if (!(A0S instanceof Collection) || !A0S.isEmpty()) {
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                if (AbstractC31174DnI.A1Y(user, AbstractC37302Gc3.A0d(AbstractC37300Gc1.A0L(it)))) {
                    return true;
                }
            }
        }
        return false;
    }
}
