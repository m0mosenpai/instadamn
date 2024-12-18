package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108584uj extends C0T6 implements InterfaceC108594uk {
    public final boolean A00;
    public final boolean A01;

    @Override // X.InterfaceC108594uk
    public final C108584uj Eur() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108584uj) {
                C108584uj c108584uj = (C108584uj) obj;
                if (this.A00 != c108584uj.A00 || this.A01 != c108584uj.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC108594uk
    public final boolean Ae5() {
        return this.A00;
    }

    @Override // X.InterfaceC108594uk
    public final boolean CFb() {
        return this.A01;
    }

    @Override // X.InterfaceC108594uk
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLiveAudioVideoToggle", AbstractC39986HoS.A00(this));
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

    public C108584uj(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
