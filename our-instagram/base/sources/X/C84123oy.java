package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3oy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84123oy extends C0T6 implements InterfaceC84133oz {
    public final C4CV A00;
    public final boolean A01;

    @Override // X.InterfaceC84133oz
    public final C84123oy F4E() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C84123oy) {
                C84123oy c84123oy = (C84123oy) obj;
                if (this.A01 != c84123oy.A01 || !C14360o3.A0K(this.A00, c84123oy.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC84133oz
    public final /* bridge */ /* synthetic */ IGN AKe() {
        return new IGN(this);
    }

    @Override // X.InterfaceC84133oz
    public final /* bridge */ /* synthetic */ C4CW B2S() {
        return this.A00;
    }

    @Override // X.InterfaceC84133oz
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsContentAppreciationInfo", AbstractC37364Gd6.A00(this));
    }

    @Override // X.InterfaceC84133oz
    public final boolean getEnabled() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = i * 31;
        C4CV c4cv = this.A00;
        if (c4cv == null) {
            hashCode = 0;
        } else {
            hashCode = c4cv.hashCode();
        }
        return i2 + hashCode;
    }

    public C84123oy(C4CV c4cv, boolean z) {
        this.A01 = z;
        this.A00 = c4cv;
    }
}
