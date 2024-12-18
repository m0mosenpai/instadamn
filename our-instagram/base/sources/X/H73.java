package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class H73 extends C0T6 implements JME {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final HashMap A05;

    @Override // X.JME
    public final H73 F3q() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H73) {
                H73 h73 = (H73) obj;
                if (!C14360o3.A0K(this.A02, h73.A02) || !C14360o3.A0K(this.A05, h73.A05) || !C14360o3.A0K(this.A03, h73.A03) || !C14360o3.A0K(this.A04, h73.A04) || !C14360o3.A0K(this.A00, h73.A00) || !C14360o3.A0K(this.A01, h73.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JME
    public final String AgO() {
        return this.A02;
    }

    @Override // X.JME
    public final /* bridge */ /* synthetic */ Map AgZ() {
        return this.A05;
    }

    @Override // X.JME
    public final String BYQ() {
        return this.A04;
    }

    @Override // X.JME
    public final Boolean BvJ() {
        return this.A00;
    }

    @Override // X.JME
    public final Integer Bx0() {
        return this.A01;
    }

    @Override // X.JME
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTVoterRegistrationStickerTappableData", AbstractC40450Hwf.A00(this));
    }

    @Override // X.JME
    public final String getId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H73(Boolean bool, Integer num, String str, String str2, String str3, HashMap hashMap) {
        this.A02 = str;
        this.A05 = hashMap;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = bool;
        this.A01 = num;
    }
}
