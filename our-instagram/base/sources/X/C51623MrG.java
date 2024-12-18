package X;

import com.instagram.user.model.User;

/* renamed from: X.MrG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51623MrG extends C0T6 {
    public final User A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51623MrG) {
                C51623MrG c51623MrG = (C51623MrG) obj;
                if (!C14360o3.A0K(this.A00, c51623MrG.A00) || !C14360o3.A0K(this.A02, c51623MrG.A02) || !C14360o3.A0K(this.A03, c51623MrG.A03) || !C14360o3.A0K(this.A01, c51623MrG.A01) || this.A05 != c51623MrG.A05 || !C14360o3.A0K(this.A04, c51623MrG.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A05, (((((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public C51623MrG(User user, Integer num, String str, String str2, String str3, boolean z) {
        this.A00 = user;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = num;
        this.A05 = z;
        this.A04 = str3;
    }
}
