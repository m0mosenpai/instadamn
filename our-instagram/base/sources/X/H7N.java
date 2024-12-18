package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideTypeStr;

/* loaded from: classes7.dex */
public final class H7N extends C0T6 implements JMX {
    public final int A00;
    public final GuideTypeStr A01;
    public final H7P A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public H7N(GuideTypeStr guideTypeStr, H7P h7p, String str, String str2, String str3, int i) {
        AbstractC25229BEm.A1I(str2, 2, guideTypeStr);
        this.A03 = str;
        this.A04 = str2;
        this.A02 = h7p;
        this.A00 = i;
        this.A05 = str3;
        this.A01 = guideTypeStr;
    }

    @Override // X.JMX
    public final H7N F4f(C1DY c1dy) {
        return this;
    }

    @Override // X.JMX
    public final H7N F4g(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7N) {
                H7N h7n = (H7N) obj;
                if (!C14360o3.A0K(this.A03, h7n.A03) || !C14360o3.A0K(this.A04, h7n.A04) || !C14360o3.A0K(this.A02, h7n.A02) || this.A00 != h7n.A00 || !C14360o3.A0K(this.A05, h7n.A05) || this.A01 != h7n.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMX
    public final /* bridge */ /* synthetic */ JLE BUE() {
        return this.A02;
    }

    @Override // X.JMX
    public final int BXg() {
        return this.A00;
    }

    @Override // X.JMX
    public final GuideTypeStr CBT() {
        return this.A01;
    }

    @Override // X.JMX
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTMediaGuideMetadata", I08.A00(this));
    }

    @Override // X.JMX
    public final String getDescription() {
        return this.A03;
    }

    @Override // X.JMX
    public final String getId() {
        return this.A04;
    }

    @Override // X.JMX
    public final String getTitle() {
        return this.A05;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, (((((AbstractC166997dE.A0K(this.A04, AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A00) * 31) + AbstractC25227BEk.A07(this.A05)) * 31);
    }

    @Override // X.JMX
    public final JMX EBP(C1DY c1dy) {
        return this;
    }
}
