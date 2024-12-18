package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class IKJ {
    public boolean A00;
    public boolean A01;
    public final UserSession A02;
    public final Product A03;
    public final User A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public IKJ(UserSession userSession, HBA hba, JID jid) {
        String str;
        this.A02 = userSession;
        ProductDetailsProductItemDict productDetailsProductItemDict = hba.A01;
        if (productDetailsProductItemDict != null) {
            this.A03 = AbstractC38048Gob.A01(productDetailsProductItemDict);
            this.A04 = hba.A02;
            this.A06 = hba.A03;
            ArrayList A1E = AbstractC166987dD.A1E();
            this.A07 = A1E;
            C40967ICo c40967ICo = hba.A00;
            if (c40967ICo != null) {
                str = c40967ICo.A00;
            } else {
                str = null;
            }
            this.A05 = str;
            if (jid != null) {
                A1E.addAll(jid.BZu());
                this.A01 = jid.CMA();
                this.A00 = jid.CLy();
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
