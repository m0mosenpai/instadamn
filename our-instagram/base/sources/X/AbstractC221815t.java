package X;

import com.instagram.user.model.User;

/* renamed from: X.15t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC221815t {
    public static User A00(String str) {
        C16L A03 = AbstractC221915u.A00.A03(str);
        A03.A1J();
        C16X parseFromJson = C16W.parseFromJson(A03);
        if (parseFromJson != null) {
            return AnonymousClass170.A01(parseFromJson);
        }
        return null;
    }
}
