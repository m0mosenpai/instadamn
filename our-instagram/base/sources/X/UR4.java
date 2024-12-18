package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class UR4 extends C0T6 implements XG4 {
    public final Float A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    @Override // X.XG4
    public final UR4 Ex6() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UR4) {
                UR4 ur4 = (UR4) obj;
                if (!C14360o3.A0K(this.A00, ur4.A00) || !C14360o3.A0K(this.A01, ur4.A01) || !C14360o3.A0K(this.A02, ur4.A02) || !C14360o3.A0K(this.A03, ur4.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XG4
    public final Float AbR() {
        return this.A00;
    }

    @Override // X.XG4
    public final Integer Agi() {
        return this.A01;
    }

    @Override // X.XG4
    public final String AhU() {
        return this.A02;
    }

    @Override // X.XG4
    public final String C9T() {
        return this.A03;
    }

    @Override // X.XG4
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardBackground", AbstractC68371VOf.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A0M + i;
    }

    public UR4(Float f, Integer num, String str, String str2) {
        this.A00 = f;
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
    }
}
