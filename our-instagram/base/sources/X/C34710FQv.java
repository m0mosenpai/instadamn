package X;

import com.instagram.user.model.User;
import java.util.Arrays;

/* renamed from: X.FQv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34710FQv {
    public boolean A00;
    public final User A01;

    public C34710FQv(User user, boolean z) {
        C14360o3.A0B(user, 1);
        this.A01 = user;
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        C34710FQv c34710FQv;
        return this == obj || (obj != null && AbstractC167017dG.A1Z(this, obj) && (obj instanceof C34710FQv) && (c34710FQv = (C34710FQv) obj) != null && this.A00 == c34710FQv.A00 && C14360o3.A0K(this.A01, c34710FQv.A01));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Boolean.valueOf(this.A00)});
    }
}
