package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.51Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C51Z extends C0T6 {
    public final User A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C51Z(User user, String str, String str2, List list, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = user;
        this.A03 = list;
        this.A04 = z;
        this.A06 = z2;
        this.A05 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51Z) {
                C51Z c51z = (C51Z) obj;
                if (!C14360o3.A0K(this.A01, c51z.A01) || !C14360o3.A0K(this.A02, c51z.A02) || !C14360o3.A0K(this.A00, c51z.A00) || !C14360o3.A0K(this.A03, c51z.A03) || this.A04 != c51z.A04 || this.A06 != c51z.A06 || this.A05 != c51z.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A03.hashCode()) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A05) {
            i5 = 1231;
        }
        return i4 + i5;
    }
}
