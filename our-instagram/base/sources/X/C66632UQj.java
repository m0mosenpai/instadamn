package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.UQj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66632UQj extends C0T6 implements XG8 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C66632UQj(int i, String str, String str2, String str3, String str4) {
        AbstractC25234BEr.A0j(1, str, str2, str3, str4);
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }

    @Override // X.XG8
    public final C66632UQj Erh() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66632UQj) {
                C66632UQj c66632UQj = (C66632UQj) obj;
                if (!C14360o3.A0K(this.A01, c66632UQj.A01) || this.A00 != c66632UQj.A00 || !C14360o3.A0K(this.A02, c66632UQj.A02) || !C14360o3.A0K(this.A03, c66632UQj.A03) || !C14360o3.A0K(this.A04, c66632UQj.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XG8
    public final String CDI() {
        return this.A01;
    }

    @Override // X.XG8
    public final int CDK() {
        return this.A00;
    }

    @Override // X.XG8
    public final String CDL() {
        return this.A02;
    }

    @Override // X.XG8
    public final String CDM() {
        return this.A03;
    }

    @Override // X.XG8
    public final String CDN() {
        return this.A04;
    }

    @Override // X.XG8
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTChainingUpsellCardDict", VO3.A00(this));
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, ((this.A01.hashCode() * 31) + this.A00) * 31)) + this.A04.hashCode();
    }
}
