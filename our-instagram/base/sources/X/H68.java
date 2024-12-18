package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H68 extends C0T6 implements JMC {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final List A03;

    @Override // X.JMC
    public final H68 F1v(C1DY c1dy) {
        return this;
    }

    @Override // X.JMC
    public final H68 F1w(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H68) {
                H68 h68 = (H68) obj;
                if (!C14360o3.A0K(this.A01, h68.A01) || !C14360o3.A0K(this.A03, h68.A03) || !C14360o3.A0K(this.A00, h68.A00) || !C14360o3.A0K(this.A02, h68.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMC
    public final List BSS() {
        return this.A03;
    }

    @Override // X.JMC
    public final Integer C0g() {
        return this.A00;
    }

    @Override // X.JMC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStorySubscriptionShoutoutMentionTappableData", AbstractC40328HuY.A00(this));
    }

    @Override // X.JMC
    public final String getId() {
        return this.A01;
    }

    @Override // X.JMC
    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A01)) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public H68(Integer num, String str, String str2, List list) {
        AbstractC167017dG.A1P(str, list);
        this.A01 = str;
        this.A03 = list;
        this.A00 = num;
        this.A02 = str2;
    }

    @Override // X.JMC
    public final JMC EAn(C1DY c1dy) {
        return this;
    }
}
