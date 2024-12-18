package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AfiInterestsRecoStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HMs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39189HMs extends C17T implements C5FT {
    @Override // X.C5FT
    public final List BJ1() {
        return A08(502611593, C39186HMp.class);
    }

    @Override // X.C5FT
    public final JK7 Bf6() {
        return (JK7) A05(347361150, C39187HMq.class);
    }

    @Override // X.C5FT
    public final AfiInterestsRecoStyle C33() {
        return (AfiInterestsRecoStyle) A0N(109780401, J91.A00);
    }

    @Override // X.C5FT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39740HkC.A00(this));
    }

    @Override // X.C5FT
    public final String B30() {
        return A0i(-1319702228);
    }

    @Override // X.C5FT
    public final Integer B33() {
        return getOptionalIntValueByHashCode(-1311205448);
    }

    @Override // X.C5FT
    public final Integer BY1() {
        return getOptionalIntValueByHashCode(-1888824590);
    }

    @Override // X.C5FT
    public final H2G Eqn() {
        ArrayList arrayList;
        String A0i = A0i(-1319702228);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1311205448);
        List BJ1 = BJ1();
        H2E h2e = null;
        if (BJ1 != null) {
            arrayList = AbstractC167017dG.A0q(BJ1);
            Iterator it = BJ1.iterator();
            while (it.hasNext()) {
                arrayList.add(((JMH) it.next()).Eqk());
            }
        } else {
            arrayList = null;
        }
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-1888824590);
        JK7 Bf6 = Bf6();
        if (Bf6 != null) {
            h2e = Bf6.Eqm();
        }
        return new H2G(h2e, C33(), optionalIntValueByHashCode, optionalIntValueByHashCode2, A0i, A0U(), A0Y(), arrayList);
    }

    @Override // X.C5FT
    public final String getSubtitle() {
        return A0U();
    }

    @Override // X.C5FT
    public final String getTitle() {
        return A0Y();
    }
}
