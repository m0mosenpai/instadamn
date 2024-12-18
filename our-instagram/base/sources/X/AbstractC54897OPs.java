package X;

import com.instagram.user.model.User;

/* renamed from: X.OPs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54897OPs {
    public static final C51731MtC A00(User user) {
        C14360o3.A0B(user, 0);
        String id = user.getId();
        Long BTC = user.BTC();
        int BJ8 = user.BJ8();
        return new C51731MtC(user.Bhu(), BTC, id, user.getUsername(), user.B8y(), BJ8);
    }

    public static final boolean A01(C51731MtC c51731MtC, User user) {
        C14360o3.A0B(c51731MtC, 1);
        String str = c51731MtC.A05;
        if (!AbstractC31174DnI.A1Y(user, str) && !C14360o3.A0K(str, MSY.A0g(user))) {
            return false;
        }
        return true;
    }
}
