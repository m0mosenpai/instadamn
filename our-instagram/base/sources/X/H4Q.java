package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OrganicCTAType;
import java.util.List;

/* loaded from: classes7.dex */
public final class H4Q extends C0T6 implements JLT {
    public final OrganicCTAType A00;
    public final String A01;
    public final String A02;
    public final List A03;

    @Override // X.JLT
    public final H4Q Exf() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4Q) {
                H4Q h4q = (H4Q) obj;
                if (!C14360o3.A0K(this.A03, h4q.A03) || !C14360o3.A0K(this.A01, h4q.A01) || !C14360o3.A0K(this.A02, h4q.A02) || this.A00 != h4q.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLT
    public final List AtY() {
        return this.A03;
    }

    @Override // X.JLT
    public final OrganicCTAType Atr() {
        return this.A00;
    }

    @Override // X.JLT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTOrganicCTADict", AbstractC40124Hqr.A00(this));
    }

    @Override // X.JLT
    public final String getCtaSubtitle() {
        return this.A01;
    }

    @Override // X.JLT
    public final String getCtaTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0K(this.A02, ((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC25227BEk.A07(this.A01)) * 31));
    }

    public H4Q(OrganicCTAType organicCTAType, String str, String str2, List list) {
        AbstractC37302Gc3.A1U(str2, organicCTAType);
        this.A03 = list;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = organicCTAType;
    }
}
