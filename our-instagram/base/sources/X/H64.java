package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H64 extends C0T6 implements JMN {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final List A04;

    @Override // X.JMN
    public final H64 F1o(C1DY c1dy) {
        return this;
    }

    @Override // X.JMN
    public final H64 F1p(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H64) {
                H64 h64 = (H64) obj;
                if (!C14360o3.A0K(this.A01, h64.A01) || !C14360o3.A0K(this.A02, h64.A02) || !C14360o3.A0K(this.A00, h64.A00) || !C14360o3.A0K(this.A03, h64.A03) || !C14360o3.A0K(this.A04, h64.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMN
    public final Integer BME() {
        return this.A01;
    }

    @Override // X.JMN
    public final String BPp() {
        return this.A02;
    }

    @Override // X.JMN
    public final Boolean BUs() {
        return this.A00;
    }

    @Override // X.JMN
    public final List CH6() {
        return this.A04;
    }

    @Override // X.JMN
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStorySliderVoterInfoObject", AbstractC40323HuT.A00(this));
    }

    @Override // X.JMN
    public final String getSliderId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public H64(Boolean bool, Integer num, String str, String str2, List list) {
        this.A01 = num;
        this.A02 = str;
        this.A00 = bool;
        this.A03 = str2;
        this.A04 = list;
    }

    @Override // X.JMN
    public final JMN EAk(C1DY c1dy) {
        return this;
    }
}
