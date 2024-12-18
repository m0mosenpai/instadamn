package X;

import com.instagram.user.model.User;

/* renamed from: X.L8g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47780L8g {
    public final User A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C14360o3.A0K(getClass(), AbstractC43593JPy.A0o(obj))) {
            return false;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.settings.common.audiencepicker.UserSourcePair");
        return C14360o3.A0K(this.A00, ((C47780L8g) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C47780L8g(User user, Integer num) {
        this.A00 = user;
        this.A01 = num;
    }
}
