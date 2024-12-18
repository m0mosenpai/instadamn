package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4v1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108764v1 extends C0T6 implements InterfaceC108774v2 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    @Override // X.InterfaceC108774v2
    public final C108764v1 Ev0() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108764v1) {
                C108764v1 c108764v1 = (C108764v1) obj;
                if (this.A00 != c108764v1.A00 || this.A01 != c108764v1.A01 || this.A02 != c108764v1.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC108774v2
    public final boolean C5I() {
        return this.A00;
    }

    @Override // X.InterfaceC108774v2
    public final boolean C5J() {
        return this.A01;
    }

    @Override // X.InterfaceC108774v2
    public final boolean C5M() {
        return this.A02;
    }

    @Override // X.InterfaceC108774v2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLiveHaloCallControls", AbstractC39989HoW.A00(this));
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A02) {
            i5 = 1231;
        }
        return i4 + i5;
    }

    public C108764v1(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }
}
