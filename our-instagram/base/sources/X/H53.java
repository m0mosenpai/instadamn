package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H53 extends C0T6 implements JLV {
    public final Boolean A00;
    public final Boolean A01;
    public final Integer A02;

    @Override // X.JLV
    public final H53 EzD() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H53) {
                H53 h53 = (H53) obj;
                if (!C14360o3.A0K(this.A00, h53.A00) || !C14360o3.A0K(this.A02, h53.A02) || !C14360o3.A0K(this.A01, h53.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLV
    public final /* bridge */ /* synthetic */ IGG AKX() {
        return new IGG(this);
    }

    @Override // X.JLV
    public final Boolean AaG() {
        return this.A00;
    }

    @Override // X.JLV
    public final Integer Ai0() {
        return this.A02;
    }

    @Override // X.JLV
    public final Boolean CYA() {
        return this.A01;
    }

    @Override // X.JLV
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTRevshareMediaAdsInfoDict", AbstractC40216Hsf.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H53(Boolean bool, Boolean bool2, Integer num) {
        this.A00 = bool;
        this.A02 = num;
        this.A01 = bool2;
    }
}
