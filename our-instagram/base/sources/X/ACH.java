package X;

import com.instagram.user.model.User;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ACH {
    public final int A00;
    public final int A01;
    public final int A02;
    public final User A03;
    public final String A04;

    public ACH(User user, String str, int i, int i2, int i3) {
        this.A03 = user;
        this.A04 = str;
        this.A02 = i3;
        this.A01 = i2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        ACH ach;
        return this == obj || (obj != null && AbstractC167017dG.A1Z(this, obj) && (obj instanceof ACH) && (ach = (ACH) obj) != null && C14360o3.A0K(this.A03, ach.A03) && C14360o3.A0K(this.A04, ach.A04) && this.A02 == ach.A02 && this.A01 == ach.A01 && this.A00 == ach.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A04, Integer.valueOf(this.A02), Integer.valueOf(this.A01), Integer.valueOf(this.A00)});
    }
}
