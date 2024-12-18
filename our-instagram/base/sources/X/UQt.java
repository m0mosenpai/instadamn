package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes11.dex */
public final class UQt extends C0T6 implements XGB {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final List A05;

    @Override // X.XGB
    public final UQt Etj() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQt) {
                UQt uQt = (UQt) obj;
                if (!C14360o3.A0K(this.A00, uQt.A00) || !C14360o3.A0K(this.A05, uQt.A05) || !C14360o3.A0K(this.A01, uQt.A01) || !C14360o3.A0K(this.A02, uQt.A02) || !C14360o3.A0K(this.A03, uQt.A03) || !C14360o3.A0K(this.A04, uQt.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XGB
    public final Integer AwO() {
        return this.A00;
    }

    @Override // X.XGB
    public final List Ays() {
        return this.A05;
    }

    @Override // X.XGB
    public final Integer BQF() {
        return this.A01;
    }

    @Override // X.XGB
    public final Integer BU9() {
        return this.A02;
    }

    @Override // X.XGB
    public final Integer Bfb() {
        return this.A03;
    }

    @Override // X.XGB
    public final String CDp() {
        return this.A04;
    }

    @Override // X.XGB
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFundRaiserDonationAmountConfig", VOI.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return A0M + i;
    }

    public UQt(Integer num, Integer num2, Integer num3, Integer num4, String str, List list) {
        this.A00 = num;
        this.A05 = list;
        this.A01 = num2;
        this.A02 = num3;
        this.A03 = num4;
        this.A04 = str;
    }
}
