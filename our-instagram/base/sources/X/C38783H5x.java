package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H5x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38783H5x extends C0T6 implements JMB {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final List A03;

    @Override // X.JMB
    public final C38783H5x F1X(C1DY c1dy) {
        return this;
    }

    @Override // X.JMB
    public final C38783H5x F1Y(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38783H5x) {
                C38783H5x c38783H5x = (C38783H5x) obj;
                if (!C14360o3.A0K(this.A01, c38783H5x.A01) || !C14360o3.A0K(this.A00, c38783H5x.A00) || !C14360o3.A0K(this.A03, c38783H5x.A03) || !C14360o3.A0K(this.A02, c38783H5x.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMB
    public final String BPp() {
        return this.A01;
    }

    @Override // X.JMB
    public final Boolean BUs() {
        return this.A00;
    }

    @Override // X.JMB
    public final List BbX() {
        return this.A03;
    }

    @Override // X.JMB
    public final String Bjo() {
        return this.A02;
    }

    @Override // X.JMB
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryQuizParticipantInfoDict", AbstractC40315HuK.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public C38783H5x(Boolean bool, String str, String str2, List list) {
        this.A01 = str;
        this.A00 = bool;
        this.A03 = list;
        this.A02 = str2;
    }

    @Override // X.JMB
    public final JMB EAd(C1DY c1dy) {
        return this;
    }
}
