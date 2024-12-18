package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H4u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38754H4u extends C0T6 implements JL7 {
    public final int A00;
    public final String A01;
    public final String A02;

    @Override // X.JL7
    public final C38754H4u Eyz() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38754H4u) {
                C38754H4u c38754H4u = (C38754H4u) obj;
                if (this.A00 != c38754H4u.A00 || !C14360o3.A0K(this.A01, c38754H4u.A01) || !C14360o3.A0K(this.A02, c38754H4u.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JL7
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTReactionMetadata", AbstractC40204HsT.A00(this));
    }

    @Override // X.JL7
    public final int getCount() {
        return this.A00;
    }

    @Override // X.JL7
    public final String getName() {
        return this.A01;
    }

    @Override // X.JL7
    public final String getValue() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A01, this.A00 * 31));
    }

    public C38754H4u(int i, String str, String str2) {
        AbstractC167017dG.A1R(str, str2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }
}
