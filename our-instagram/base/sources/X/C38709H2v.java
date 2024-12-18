package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H2v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38709H2v extends C0T6 implements JKD {
    public final Integer A00;
    public final String A01;

    @Override // X.JKD
    public final C38709H2v EsW() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38709H2v) {
                C38709H2v c38709H2v = (C38709H2v) obj;
                if (!C14360o3.A0K(this.A00, c38709H2v.A00) || !C14360o3.A0K(this.A01, c38709H2v.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKD
    public final Integer BqX() {
        return this.A00;
    }

    @Override // X.JKD
    public final String CEH() {
        return this.A01;
    }

    @Override // X.JKD
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTContentSchedulingMetadata", AbstractC39849Hlx.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C38709H2v(Integer num, String str) {
        this.A00 = num;
        this.A01 = str;
    }
}
