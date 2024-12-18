package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H6R extends C0T6 implements InterfaceC43541JLb {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC43541JLb
    public final H6R F2f() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6R) {
                H6R h6r = (H6R) obj;
                if (!C14360o3.A0K(this.A00, h6r.A00) || !C14360o3.A0K(this.A01, h6r.A01) || !C14360o3.A0K(this.A02, h6r.A02) || !C14360o3.A0K(this.A03, h6r.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43541JLb
    public final Integer BXy() {
        return this.A01;
    }

    @Override // X.InterfaceC43541JLb
    public final Boolean CU1() {
        return this.A00;
    }

    @Override // X.InterfaceC43541JLb
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSurveyAnswer", AbstractC40368HvE.A00(this));
    }

    @Override // X.InterfaceC43541JLb
    public final String getText() {
        return this.A02;
    }

    @Override // X.InterfaceC43541JLb
    public final String getValue() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC166997dE.A0K(this.A02, ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01)) * 31));
    }

    public H6R(Boolean bool, Integer num, String str, String str2) {
        AbstractC37302Gc3.A1U(str, str2);
        this.A00 = bool;
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
    }
}
