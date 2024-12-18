package X;

import com.instagram.user.model.User;

/* renamed from: X.7dM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167077dM extends C0T6 implements InterfaceC166427cB {
    public final C38321qM A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167077dM) {
                C167077dM c167077dM = (C167077dM) obj;
                if (!C14360o3.A0K(this.A04, c167077dM.A04) || !C14360o3.A0K(this.A05, c167077dM.A05) || !C14360o3.A0K(this.A02, c167077dM.A02) || !C14360o3.A0K(this.A03, c167077dM.A03) || !C14360o3.A0K(this.A01, c167077dM.A01) || !C14360o3.A0K(this.A00, c167077dM.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A05;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31;
        User user = this.A01;
        int hashCode3 = (hashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        C38321qM c38321qM = this.A00;
        return hashCode3 + (c38321qM != null ? c38321qM.hashCode() : 0);
    }

    public C167077dM(C38321qM c38321qM, User user, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A01 = user;
        this.A00 = c38321qM;
    }
}
