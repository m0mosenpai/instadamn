package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H41 extends C0T6 implements JMI {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    @Override // X.JMI
    public final H41 Evn() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H41) {
                H41 h41 = (H41) obj;
                if (!C14360o3.A0K(this.A00, h41.A00) || !C14360o3.A0K(this.A01, h41.A01) || !C14360o3.A0K(this.A02, h41.A02) || !C14360o3.A0K(this.A03, h41.A03) || !C14360o3.A0K(this.A04, h41.A04) || !C14360o3.A0K(this.A05, h41.A05) || !C14360o3.A0K(this.A06, h41.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMI
    public final String B1I() {
        return this.A01;
    }

    @Override // X.JMI
    public final String BZl() {
        return this.A03;
    }

    @Override // X.JMI
    public final String C0h() {
        return this.A04;
    }

    @Override // X.JMI
    public final List CAd() {
        return this.A06;
    }

    @Override // X.JMI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTKaraokeStickerTappableData", AbstractC40038HpP.A00(this));
    }

    @Override // X.JMI
    public final String getBackgroundColor() {
        return this.A00;
    }

    @Override // X.JMI
    public final String getId() {
        return this.A02;
    }

    @Override // X.JMI
    public final String getTextColor() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A06);
    }

    public H41(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = list;
    }
}
