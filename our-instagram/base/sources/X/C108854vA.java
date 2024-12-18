package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4vA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108854vA extends C0T6 implements InterfaceC108864vB {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    @Override // X.InterfaceC108864vB
    public final C108854vA Euv() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108854vA) {
                C108854vA c108854vA = (C108854vA) obj;
                if (this.A00 != c108854vA.A00 || this.A01 != c108854vA.A01 || this.A02 != c108854vA.A02 || this.A03 != c108854vA.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC108864vB
    public final boolean Abk() {
        return this.A00;
    }

    @Override // X.InterfaceC108864vB
    public final boolean CQr() {
        return this.A01;
    }

    @Override // X.InterfaceC108864vB
    public final boolean CVv() {
        return this.A02;
    }

    @Override // X.InterfaceC108864vB
    public final boolean CVw() {
        return this.A03;
    }

    @Override // X.InterfaceC108864vB
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLiveCommentInteractions", HoU.A00(this));
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
        return i6 + i7;
    }

    public C108854vA(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
    }
}
