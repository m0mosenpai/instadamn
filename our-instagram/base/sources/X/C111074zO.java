package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4zO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111074zO extends C0T6 implements InterfaceC111084zP {
    public final String A00;
    public final boolean A01;

    @Override // X.InterfaceC111084zP
    public final C111074zO Ext() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C111074zO) {
                C111074zO c111074zO = (C111074zO) obj;
                if (!C14360o3.A0K(this.A00, c111074zO.A00) || this.A01 != c111074zO.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC111084zP
    public final String BPp() {
        return this.A00;
    }

    @Override // X.InterfaceC111084zP
    public final boolean BUt() {
        return this.A01;
    }

    @Override // X.InterfaceC111084zP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPagingInfo", AbstractC40133Hr0.A00(this));
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

    public C111074zO(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
