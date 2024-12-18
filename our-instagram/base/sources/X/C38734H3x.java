package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H3x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38734H3x extends C0T6 implements JLR {
    public final Boolean A00;
    public final Boolean A01;
    public final Integer A02;

    @Override // X.JLR
    public final C38734H3x EvZ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38734H3x) {
                C38734H3x c38734H3x = (C38734H3x) obj;
                if (!C14360o3.A0K(this.A00, c38734H3x.A00) || !C14360o3.A0K(this.A02, c38734H3x.A02) || !C14360o3.A0K(this.A01, c38734H3x.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLR
    public final /* bridge */ /* synthetic */ IGF AKN() {
        return new IGF(this);
    }

    @Override // X.JLR
    public final Boolean AaG() {
        return this.A00;
    }

    @Override // X.JLR
    public final Integer Ai0() {
        return this.A02;
    }

    @Override // X.JLR
    public final Boolean Cfk() {
        return this.A01;
    }

    @Override // X.JLR
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGTVAdsInfoDict", Hp8.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38734H3x(Boolean bool, Boolean bool2, Integer num) {
        this.A00 = bool;
        this.A02 = num;
        this.A01 = bool2;
    }
}
