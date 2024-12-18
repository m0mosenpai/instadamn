package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoWorldLocationPagesInfo;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.api.schemas.WorldLocationPagesInfoImpl;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HVb extends C17T implements InterfaceC43580JMo {
    public User A00;

    @Override // X.InterfaceC43580JMo
    public final WearablesAppAttributionType AdN() {
        return (WearablesAppAttributionType) A0N(115027706, JCA.A00);
    }

    @Override // X.InterfaceC43580JMo
    public final User BdV() {
        return this.A00;
    }

    @Override // X.InterfaceC43580JMo
    public final WorldLocationPagesInfo CHs() {
        return (WorldLocationPagesInfo) A05(-485042458, ImmutablePandoWorldLocationPagesInfo.class);
    }

    @Override // X.InterfaceC43580JMo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40452Hwh.A00(this));
    }

    @Override // X.InterfaceC43580JMo
    public final Integer BF1() {
        return getOptionalIntValueByHashCode(1174252653);
    }

    @Override // X.InterfaceC43580JMo
    public final String BdQ() {
        return A0i(-1615551502);
    }

    @Override // X.InterfaceC43580JMo
    public final String BdR() {
        return A0i(1039667693);
    }

    @Override // X.InterfaceC43580JMo
    public final String BdS() {
        return A0i(568281257);
    }

    @Override // X.InterfaceC43580JMo
    public final String BdU() {
        return A0i(1332380792);
    }

    @Override // X.InterfaceC43580JMo
    public final String BdW() {
        return A0i(812002501);
    }

    @Override // X.InterfaceC43580JMo
    public final InterfaceC43580JMo EBD(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -1166493156);
        return this;
    }

    @Override // X.InterfaceC43580JMo
    public final H75 F3t(C1DY c1dy) {
        User user;
        String A0h = A0h(-974634699);
        String A0h2 = A0h(-1356003908);
        String A0h3 = A0h(-1277686679);
        String A0h4 = A0h(1694370776);
        String A0h5 = A0h(-729580904);
        String A0h6 = A0h(-1675539437);
        WearablesAppAttributionType AdN = AdN();
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(1174252653);
        String A0i = A0i(-1259655549);
        String A0i2 = A0i(-82370952);
        String A0i3 = A0i(-1848923992);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1644329246);
        String A0i4 = A0i(-1615551502);
        String A0i5 = A0i(1039667693);
        String A0i6 = A0i(568281257);
        String A0i7 = A0i(1332380792);
        User A0J = AbstractC37303Gc4.A0J(c1dy, this, -1166493156);
        WorldLocationPagesInfoImpl worldLocationPagesInfoImpl = null;
        if (A0J != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0J);
        } else {
            user = null;
        }
        String A0i8 = A0i(812002501);
        WorldLocationPagesInfo CHs = CHs();
        if (CHs != null) {
            worldLocationPagesInfoImpl = CHs.F40();
        }
        return new H75(AdN, worldLocationPagesInfoImpl, user, optionalIntValueByHashCode, A0h, A0h2, A0h3, A0h4, A0h5, A0h6, A0i, A0i2, A0i3, A0i4, A0i5, A0i6, A0i7, A0i8, booleanValueByHashCode);
    }

    @Override // X.InterfaceC43580JMo
    public final H75 F3u(C1DV c1dv) {
        return F3t(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC43580JMo
    public final String getAttributionCtaActionUrl() {
        return A0h(-974634699);
    }

    @Override // X.InterfaceC43580JMo
    public final String getAttributionCtaText() {
        return A0h(-1356003908);
    }

    @Override // X.InterfaceC43580JMo
    public final String getAttributionIconUrl() {
        return A0h(-1277686679);
    }

    @Override // X.InterfaceC43580JMo
    public final String getAttributionSubtitle() {
        return A0h(1694370776);
    }

    @Override // X.InterfaceC43580JMo
    public final String getAttributionTitle() {
        return A0h(-729580904);
    }

    @Override // X.InterfaceC43580JMo
    public final String getAttributionTopIconUrl() {
        return A0h(-1675539437);
    }

    @Override // X.InterfaceC43580JMo
    public final String getIconicHorizonWorldDeeplink() {
        return A0i(-1259655549);
    }

    @Override // X.InterfaceC43580JMo
    public final String getIconicHorizonWorldId() {
        return A0i(-82370952);
    }

    @Override // X.InterfaceC43580JMo
    public final String getIconicHorizonWorldName() {
        return A0i(-1848923992);
    }

    @Override // X.InterfaceC43580JMo
    public final boolean isWearableMediaProducer() {
        return getBooleanValueByHashCode(1644329246);
    }
}
