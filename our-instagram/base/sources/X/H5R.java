package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class H5R extends C0T6 implements JMU {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final HashMap A07;

    @Override // X.JMU
    public final H5R F07() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5R) {
                H5R h5r = (H5R) obj;
                if (!C14360o3.A0K(this.A02, h5r.A02) || !C14360o3.A0K(this.A03, h5r.A03) || !C14360o3.A0K(this.A04, h5r.A04) || !C14360o3.A0K(this.A07, h5r.A07) || !C14360o3.A0K(this.A05, h5r.A05) || !C14360o3.A0K(this.A06, h5r.A06) || !C14360o3.A0K(this.A00, h5r.A00) || !C14360o3.A0K(this.A01, h5r.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMU
    public final String AXx() {
        return this.A02;
    }

    @Override // X.JMU
    public final String AYf() {
        return this.A03;
    }

    @Override // X.JMU
    public final String AgO() {
        return this.A04;
    }

    @Override // X.JMU
    public final /* bridge */ /* synthetic */ Map AgZ() {
        return this.A07;
    }

    @Override // X.JMU
    public final String BYQ() {
        return this.A06;
    }

    @Override // X.JMU
    public final Boolean BvJ() {
        return this.A00;
    }

    @Override // X.JMU
    public final Integer Bx0() {
        return this.A01;
    }

    @Override // X.JMU
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryBloksTappableStickerDict", AbstractC40273Htd.A00(this));
    }

    @Override // X.JMU
    public final String getId() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H5R(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, HashMap hashMap) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A07 = hashMap;
        this.A05 = str4;
        this.A06 = str5;
        this.A00 = bool;
        this.A01 = num;
    }
}
