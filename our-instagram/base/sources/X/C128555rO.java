package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5rO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128555rO extends C0T6 implements InterfaceC128105qe {
    public final int A00;
    public final String A01;
    public final String A02;

    public C128555rO(int i, String str, String str2) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.InterfaceC128105qe
    public final C128555rO EzL() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128555rO) {
                C128555rO c128555rO = (C128555rO) obj;
                if (this.A00 != c128555rO.A00 || !C14360o3.A0K(this.A01, c128555rO.A01) || !C14360o3.A0K(this.A02, c128555rO.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A00 * 31) + this.A01.hashCode()) * 31;
        String str = this.A02;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // X.InterfaceC128105qe
    public final int BAH() {
        return this.A00;
    }

    @Override // X.InterfaceC128105qe
    public final String Bqd() {
        return this.A01;
    }

    @Override // X.InterfaceC128105qe
    public final String Bqe() {
        return this.A02;
    }

    @Override // X.InterfaceC128105qe
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSchoolsBadgeMetadataDict", CDV.A00(this));
    }
}
