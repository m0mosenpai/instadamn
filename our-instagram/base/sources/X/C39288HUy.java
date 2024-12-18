package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HUy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39288HUy extends C17T implements InterfaceC43567JMb {
    @Override // X.InterfaceC43567JMb
    public final JMZ B3u() {
        return (JMZ) A05(66939701, C39287HUx.class);
    }

    @Override // X.InterfaceC43567JMb
    public final List Bjh() {
        return A08(-1782234803, C39287HUx.class);
    }

    @Override // X.InterfaceC43567JMb
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, HvM.A00(this));
    }

    @Override // X.InterfaceC43567JMb
    public final Boolean B1Y() {
        return getOptionalBooleanValueByHashCode(269710604);
    }

    @Override // X.InterfaceC43567JMb
    public final Boolean B1b() {
        return getOptionalBooleanValueByHashCode(-1694647728);
    }

    @Override // X.InterfaceC43567JMb
    public final Boolean BCl() {
        return getOptionalBooleanValueByHashCode(-2110297763);
    }

    @Override // X.InterfaceC43567JMb
    public final Boolean BOW() {
        return getOptionalBooleanValueByHashCode(1827452855);
    }

    @Override // X.InterfaceC43567JMb
    public final String BUl() {
        return A0i(-1194801875);
    }

    @Override // X.InterfaceC43567JMb
    public final Integer CCk() {
        return getOptionalIntValueByHashCode(-2098431359);
    }

    @Override // X.InterfaceC43567JMb
    public final Integer CEt() {
        return getOptionalIntValueByHashCode(1248883784);
    }

    @Override // X.InterfaceC43567JMb
    public final H6W F2l() {
        H6V h6v;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(269710604);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(-1694647728);
        JMZ B3u = B3u();
        ArrayList arrayList = null;
        if (B3u != null) {
            h6v = B3u.F2k();
        } else {
            h6v = null;
        }
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(-2110297763);
        String A0e = A0e();
        Boolean optionalBooleanValueByHashCode4 = getOptionalBooleanValueByHashCode(1827452855);
        String A0i = A0i(-1194801875);
        List Bjh = Bjh();
        if (Bjh != null) {
            arrayList = AbstractC167017dG.A0q(Bjh);
            Iterator it = Bjh.iterator();
            while (it.hasNext()) {
                arrayList.add(((JMZ) it.next()).F2k());
            }
        }
        return new H6W(h6v, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalBooleanValueByHashCode4, getOptionalIntValueByHashCode(-2098431359), getOptionalIntValueByHashCode(1248883784), A0e, A0i, arrayList);
    }

    @Override // X.InterfaceC43567JMb
    public final String getId() {
        return A0e();
    }
}
