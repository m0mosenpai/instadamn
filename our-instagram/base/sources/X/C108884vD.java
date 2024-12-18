package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4vD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108884vD extends C0T6 implements InterfaceC108894vE {
    public final boolean A00;
    public final boolean A01;

    @Override // X.InterfaceC108894vE
    public final C108884vD Euw() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108884vD) {
                C108884vD c108884vD = (C108884vD) obj;
                if (this.A00 != c108884vD.A00 || this.A01 != c108884vD.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC108894vE
    public final boolean Az1() {
        return this.A00;
    }

    @Override // X.InterfaceC108894vE
    public final boolean CQp() {
        return this.A01;
    }

    @Override // X.InterfaceC108894vE
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLiveCommentSubscription", AbstractC53776NqS.A00(this));
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
        return i2 + i3;
    }

    public C108884vD(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
