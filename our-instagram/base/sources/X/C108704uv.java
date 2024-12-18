package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108704uv extends C0T6 implements InterfaceC108714uw {
    public final boolean A00;
    public final boolean A01;

    @Override // X.InterfaceC108714uw
    public final C108704uv Eux() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108704uv) {
                C108704uv c108704uv = (C108704uv) obj;
                if (this.A00 != c108704uv.A00 || this.A01 != c108704uv.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC108714uw
    public final boolean CDc() {
        return this.A01;
    }

    @Override // X.InterfaceC108714uw
    public final boolean CVx() {
        return this.A00;
    }

    @Override // X.InterfaceC108714uw
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLiveEmojiReactions", AbstractC39988HoV.A00(this));
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

    public C108704uv(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
