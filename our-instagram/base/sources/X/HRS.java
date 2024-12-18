package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.OrganicCTAType;
import java.util.List;

/* loaded from: classes7.dex */
public final class HRS extends C17T implements JLT {
    @Override // X.JLT
    public final OrganicCTAType Atr() {
        return (OrganicCTAType) A0M(-815886327, JAP.A00);
    }

    @Override // X.JLT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40124Hqr.A00(this));
    }

    @Override // X.JLT
    public final List AtY() {
        return getOptionalStringListByHashCode(2020012607);
    }

    @Override // X.JLT
    public final H4Q Exf() {
        ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(2020012607);
        return new H4Q(Atr(), A0i(-1950593689), A0h(476855145), optionalStringListByHashCode);
    }

    @Override // X.JLT
    public final String getCtaSubtitle() {
        return A0i(-1950593689);
    }

    @Override // X.JLT
    public final String getCtaTitle() {
        return A0h(476855145);
    }
}
