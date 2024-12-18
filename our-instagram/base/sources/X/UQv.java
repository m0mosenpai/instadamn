package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class UQv extends C0T6 implements InterfaceC104854ns {
    public final Float A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;

    @Override // X.InterfaceC104854ns
    public final UQv EuH() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQv) {
                UQv uQv = (UQv) obj;
                if (!C14360o3.A0K(this.A00, uQv.A00) || !C14360o3.A0K(this.A01, uQv.A01) || !C14360o3.A0K(this.A02, uQv.A02) || !C14360o3.A0K(this.A03, uQv.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC104854ns
    public final Float Ahg() {
        return this.A00;
    }

    @Override // X.InterfaceC104854ns
    public final Float Ahh() {
        return this.A01;
    }

    @Override // X.InterfaceC104854ns
    public final Float Ahi() {
        return this.A02;
    }

    @Override // X.InterfaceC104854ns
    public final Float Ahj() {
        return this.A03;
    }

    @Override // X.InterfaceC104854ns
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdMediaSmartCropInfoDict", VOP.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
        Float f = this.A03;
        if (f != null) {
            i = f.hashCode();
        }
        return A0M + i;
    }

    public UQv(Float f, Float f2, Float f3, Float f4) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
    }
}
