package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.7fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168497fj extends C0T6 {
    public final ImageUrl A00;
    public final EnumC40111tc A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C168497fj) {
                C168497fj c168497fj = (C168497fj) obj;
                if (!C14360o3.A0K(this.A04, c168497fj.A04) || this.A05 != c168497fj.A05 || !C14360o3.A0K(this.A00, c168497fj.A00) || !C14360o3.A0K(this.A02, c168497fj.A02) || !C14360o3.A0K(this.A03, c168497fj.A03) || this.A01 != c168497fj.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.A04;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        ImageUrl imageUrl = this.A00;
        if (imageUrl == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = imageUrl.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        User user = this.A02;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str2 = this.A03;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        EnumC40111tc enumC40111tc = this.A01;
        if (enumC40111tc != null) {
            i = enumC40111tc.hashCode();
        }
        return i7 + i;
    }

    public C168497fj(ImageUrl imageUrl, EnumC40111tc enumC40111tc, User user, String str, String str2, boolean z) {
        this.A04 = str;
        this.A05 = z;
        this.A00 = imageUrl;
        this.A02 = user;
        this.A03 = str2;
        this.A01 = enumC40111tc;
    }

    public C168497fj() {
        this(null, null, null, null, null, false);
    }
}
