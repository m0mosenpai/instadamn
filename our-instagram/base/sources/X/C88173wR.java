package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3wR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88173wR extends C0T6 implements InterfaceC88183wS {
    public final C84433pm A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C88173wR(C84433pm c84433pm, String str, String str2, String str3, String str4, boolean z) {
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str4, 6);
        this.A01 = str;
        this.A00 = c84433pm;
        this.A02 = str2;
        this.A05 = z;
        this.A03 = str3;
        this.A04 = str4;
    }

    @Override // X.InterfaceC88183wS
    public final C88173wR Etf() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88173wR) {
                C88173wR c88173wR = (C88173wR) obj;
                if (!C14360o3.A0K(this.A01, c88173wR.A01) || !C14360o3.A0K(this.A00, c88173wR.A00) || !C14360o3.A0K(this.A02, c88173wR.A02) || this.A05 != c88173wR.A05 || !C14360o3.A0K(this.A03, c88173wR.A03) || !C14360o3.A0K(this.A04, c88173wR.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC88183wS
    public final /* bridge */ /* synthetic */ InterfaceC84443pn Awj() {
        return this.A00;
    }

    @Override // X.InterfaceC88183wS
    public final boolean BwU() {
        return this.A05;
    }

    @Override // X.InterfaceC88183wS
    public final String C39() {
        return this.A03;
    }

    @Override // X.InterfaceC88183wS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFollowUpOption", AbstractC37365Gd7.A00(this));
    }

    @Override // X.InterfaceC88183wS
    public final String getData() {
        return this.A01;
    }

    @Override // X.InterfaceC88183wS
    public final String getId() {
        return this.A02;
    }

    @Override // X.InterfaceC88183wS
    public final String getText() {
        return this.A04;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        C84433pm c84433pm = this.A00;
        if (c84433pm == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c84433pm.hashCode();
        }
        int hashCode3 = (((i2 + hashCode2) * 31) + this.A02.hashCode()) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (hashCode3 + i3) * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((i4 + i) * 31) + this.A04.hashCode();
    }
}
