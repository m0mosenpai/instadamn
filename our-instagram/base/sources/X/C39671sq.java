package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.1sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39671sq extends C0T6 implements InterfaceC39681sr {
    public final String A00;
    public final String A01;
    public final boolean A02;

    @Override // X.InterfaceC39681sr
    public final C39671sq EzR() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39671sq) {
                C39671sq c39671sq = (C39671sq) obj;
                if (!C14360o3.A0K(this.A00, c39671sq.A00) || !C14360o3.A0K(this.A01, c39671sq.A01) || this.A02 != c39671sq.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC39681sr
    public final String AgQ() {
        return this.A00;
    }

    @Override // X.InterfaceC39681sr
    public final String BuU() {
        return this.A01;
    }

    @Override // X.InterfaceC39681sr
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSharingFrictionInfo", AbstractC37345Gcn.A00(this));
    }

    @Override // X.InterfaceC39681sr
    public final boolean getShouldHaveSharingFriction() {
        return this.A02;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A00;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        int i4 = 1237;
        if (this.A02) {
            i4 = 1231;
        }
        return i3 + i4;
    }

    public C39671sq(String str, String str2, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }
}
