package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4vG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108914vG extends C0T6 implements InterfaceC108924vH {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.InterfaceC108924vH
    public final C108914vG Ev5() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108914vG) {
                C108914vG c108914vG = (C108914vG) obj;
                if (this.A00 != c108914vG.A00 || this.A01 != c108914vG.A01 || this.A02 != c108914vG.A02 || this.A03 != c108914vG.A03 || this.A04 != c108914vG.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC108924vH
    public final boolean Acm() {
        return this.A00;
    }

    @Override // X.InterfaceC108924vH
    public final boolean Apf() {
        return this.A01;
    }

    @Override // X.InterfaceC108924vH
    public final boolean CGG() {
        return this.A03;
    }

    @Override // X.InterfaceC108924vH
    public final boolean CGH() {
        return this.A04;
    }

    @Override // X.InterfaceC108924vH
    public final boolean CQ4() {
        return this.A02;
    }

    @Override // X.InterfaceC108924vH
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLiveViewerRedesignBroadcaster", AbstractC39991HoY.A00(this));
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
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A03) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A04) {
            i9 = 1231;
        }
        return i8 + i9;
    }

    public C108914vG(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
    }
}
