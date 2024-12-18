package X;

import com.instagram.user.model.User;

/* renamed from: X.7eG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167607eG extends AbstractC167617eH {
    public final User A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167607eG) {
                C167607eG c167607eG = (C167607eG) obj;
                if (!C14360o3.A0K(this.A02, c167607eG.A02) || !C14360o3.A0K(this.A03, c167607eG.A03) || !C14360o3.A0K(this.A04, c167607eG.A04) || !C14360o3.A0K(this.A00, c167607eG.A00) || !C14360o3.A0K(this.A01, c167607eG.A01) || this.A05 != c167607eG.A05 || this.A07 != c167607eG.A07 || this.A06 != c167607eG.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A02.hashCode() * 31;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.A04;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode4 = (((i2 + hashCode2) * 31) + this.A00.hashCode()) * 31;
        Long l = this.A01;
        if (l != null) {
            i = l.hashCode();
        }
        int i3 = (hashCode4 + i) * 31;
        int i4 = 1237;
        if (this.A05) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A07) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A06) {
            i8 = 1231;
        }
        return i7 + i8;
    }

    public C167607eG(User user, Long l, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = user;
        this.A01 = l;
        this.A05 = z;
        this.A07 = z2;
        this.A06 = z3;
    }
}
