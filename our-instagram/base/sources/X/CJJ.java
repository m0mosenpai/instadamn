package X;

import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public abstract class CJJ {
    public static final Integer A00(User user) {
        if (user.CQf()) {
            return C05F.A1F;
        }
        switch (user.B7L().ordinal()) {
            case 0:
            case 1:
                return C05F.A1I;
            case 2:
                return C05F.A0j;
            case 3:
                if (user.A27()) {
                    return C05F.A0C;
                }
                return C05F.A01;
            case 4:
                return C05F.A0N;
            case 5:
                return C05F.A15;
            default:
                throw B4Z.A00();
        }
    }
}
