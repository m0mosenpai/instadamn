package X;

import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class H3U extends C0T6 implements InterfaceC43471JIj {
    public final long A00;
    public final long A01;
    public final User A02;
    public final Float A03;
    public final Float A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public H3U(User user, Float f, Float f2, String str, String str2, String str3, long j, long j2) {
        AbstractC167007dF.A1I(str, 1, str3);
        this.A05 = str;
        this.A06 = str2;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = f;
        this.A02 = user;
        this.A04 = f2;
        this.A07 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3U) {
                H3U h3u = (H3U) obj;
                if (!C14360o3.A0K(this.A05, h3u.A05) || !C14360o3.A0K(this.A06, h3u.A06) || this.A00 != h3u.A00 || this.A01 != h3u.A01 || !C14360o3.A0K(this.A03, h3u.A03) || !C14360o3.A0K(this.A02, h3u.A02) || !C14360o3.A0K(this.A04, h3u.A04) || !C14360o3.A0K(this.A07, h3u.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A07, (((((AbstractC167007dF.A07(this.A01, AbstractC167007dF.A07(this.A00, (AbstractC166987dD.A0J(this.A05) + AbstractC167017dG.A0O(this.A06)) * 31)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31);
    }
}
