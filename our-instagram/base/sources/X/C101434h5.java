package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4h5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101434h5 extends C0T6 implements InterfaceC101444h6 {
    public final String A00;
    public final boolean A01;

    @Override // X.InterfaceC101444h6
    public final C101434h5 EyF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C101434h5) {
                C101434h5 c101434h5 = (C101434h5) obj;
                if (!C14360o3.A0K(this.A00, c101434h5.A00) || this.A01 != c101434h5.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC101444h6
    public final String AqN() {
        return this.A00;
    }

    @Override // X.InterfaceC101444h6
    public final boolean Cez() {
        return this.A01;
    }

    @Override // X.InterfaceC101444h6
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProactiveWarningsImpersonatorInfo", CDS.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = hashCode * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }

    public C101434h5(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
