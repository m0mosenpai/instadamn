package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.NtN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53950NtN {
    public static final C45126Jxv A00(User user) {
        String id = user.getId();
        ImageUrl Bhu = user.Bhu();
        String A08 = AbstractC101904i3.A08(user);
        C14360o3.A07(A08);
        return new C45126Jxv(Bhu, id, A08, user.getUsername(), 9);
    }
}
