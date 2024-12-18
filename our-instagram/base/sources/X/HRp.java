package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HRp extends C17T implements JMK {
    public User A00;
    public List A01;

    @Override // X.JMK
    public final List AiP() {
        List list = this.A01;
        if (list == null) {
            return A08(1354444754, HNG.class);
        }
        return list;
    }

    @Override // X.JMK
    public final User CDj() {
        return this.A00;
    }

    @Override // X.JMK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, HrN.A00(this));
    }

    @Override // X.JMK
    public final Boolean Aki() {
        return getOptionalBooleanValueByHashCode(373873083);
    }

    @Override // X.JMK
    public final Boolean Akk() {
        return getOptionalBooleanValueByHashCode(-1482588131);
    }

    @Override // X.JMK
    public final Float BLv() {
        return A0K(74499224);
    }

    @Override // X.JMK
    public final JMK E9c(C1DY c1dy) {
        ArrayList arrayList;
        List<InterfaceC37961pd> AiP = AiP();
        if (AiP != null) {
            arrayList = AbstractC167017dG.A0q(AiP);
            for (InterfaceC37961pd interfaceC37961pd : AiP) {
                interfaceC37961pd.E8l(c1dy);
                arrayList.add(interfaceC37961pd);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        this.A00 = AbstractC31179DnN.A0T(c1dy, this);
        return this;
    }

    @Override // X.JMK
    public final C38736H4a Ey6(C1DY c1dy) {
        ArrayList arrayList;
        User A0N;
        List AiP = AiP();
        User user = null;
        if (AiP != null) {
            arrayList = AbstractC167017dG.A0q(AiP);
            Iterator it = AiP.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC37961pd) it.next()).ErP(c1dy));
            }
        } else {
            arrayList = null;
        }
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(373873083);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1482588131);
        Float A0K = A0K(74499224);
        String A0k = AbstractC37301Gc2.A0k(this);
        ImmutablePandoUserDict A0R = AbstractC37301Gc2.A0R(this);
        if (A0R != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0R)) != null) {
            user = (User) c1dy.A00(A0N);
        }
        return new C38736H4a(user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, A0K, A0k, arrayList);
    }

    @Override // X.JMK
    public final String getPk() {
        return AbstractC37301Gc2.A0k(this);
    }
}
