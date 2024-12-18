package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H6O extends C0T6 implements JMO {
    public final H6P A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public H6O(H6P h6p, Integer num, String str, String str2, String str3, List list) {
        C14360o3.A0B(str3, 5);
        this.A02 = str;
        this.A03 = str2;
        this.A05 = list;
        this.A01 = num;
        this.A04 = str3;
        this.A00 = h6p;
    }

    @Override // X.JMO
    public final H6O F2b(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6O) {
                H6O h6o = (H6O) obj;
                if (!C14360o3.A0K(this.A02, h6o.A02) || !C14360o3.A0K(this.A03, h6o.A03) || !C14360o3.A0K(this.A05, h6o.A05) || !C14360o3.A0K(this.A01, h6o.A01) || !C14360o3.A0K(this.A04, h6o.A04) || !C14360o3.A0K(this.A00, h6o.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMO
    public final String Alx() {
        return this.A02;
    }

    @Override // X.JMO
    public final List BaB() {
        return this.A05;
    }

    @Override // X.JMO
    public final Integer C59() {
        return this.A01;
    }

    @Override // X.JMO
    public final String C5f() {
        return this.A04;
    }

    @Override // X.JMO
    public final /* bridge */ /* synthetic */ InterfaceC43562JLw CDq() {
        return this.A00;
    }

    @Override // X.JMO
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSuperlativeCardData", AbstractC40361Hv7.A00(this));
    }

    @Override // X.JMO
    public final String getMediaId() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A04, ((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    @Override // X.JMO
    public final JMO EAx(C1DY c1dy) {
        return this;
    }
}
