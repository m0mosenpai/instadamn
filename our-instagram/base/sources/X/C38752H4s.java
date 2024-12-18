package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.H4s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38752H4s extends C0T6 implements JKS {
    public final String A00;
    public final String A01;

    @Override // X.JKS
    public final C38752H4s Eyr() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38752H4s) {
                C38752H4s c38752H4s = (C38752H4s) obj;
                if (!C14360o3.A0K(this.A00, c38752H4s.A00) || !C14360o3.A0K(this.A01, c38752H4s.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (getTitle() != null) {
            AbstractC37300Gc1.A17(getTitle(), A1I);
        }
        if (getUrl() != null) {
            AbstractC37300Gc1.A13(getUrl(), A1I);
        }
        return AbstractC37300Gc1.A05("XDTQPActionData", AbstractC06930Yk.A0B(A1I));
    }

    @Override // X.JKS
    public final String getTitle() {
        return this.A00;
    }

    @Override // X.JKS
    public final String getUrl() {
        return this.A01;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C38752H4s(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
