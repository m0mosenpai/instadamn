package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.IMm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41221IMm {
    public User A00;
    public String A01;
    public List A02;

    public final User A00() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        C14360o3.A0F("business");
        throw C00O.createAndThrow();
    }

    public final List A01() {
        List list = this.A02;
        if (list != null) {
            return AbstractC31172DnG.A19(list);
        }
        C14360o3.A0F("imageUrlList");
        throw C00O.createAndThrow();
    }
}
