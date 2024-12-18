package X;

import com.instagram.user.model.User;

/* renamed from: X.3Mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72343Mh extends C0T6 implements InterfaceC41141vN {
    public final C38321qM A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C72343Mh(C38321qM c38321qM, User user, String str, String str2, boolean z) {
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(user, 2);
        C14360o3.A0B(str, 3);
        this.A00 = c38321qM;
        this.A01 = user;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72343Mh) {
                C72343Mh c72343Mh = (C72343Mh) obj;
                if (!C14360o3.A0K(this.A00, c72343Mh.A00) || !C14360o3.A0K(this.A01, c72343Mh.A01) || !C14360o3.A0K(this.A02, c72343Mh.A02) || !C14360o3.A0K(this.A03, c72343Mh.A03) || this.A04 != c72343Mh.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        String str = this.A03;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        int i2 = 1237;
        if (this.A04) {
            i2 = 1231;
        }
        return i + i2;
    }
}
