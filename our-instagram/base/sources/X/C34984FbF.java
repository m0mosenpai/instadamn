package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FbF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34984FbF {
    public static final C34984FbF A00 = new Object();

    public final int A00(UserSession userSession) {
        EnumC33391EpO enumC33391EpO;
        int A07 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36605546702443814L);
        if (A07 != 0) {
            if (A07 != 1) {
                if (A07 != 2) {
                    if (A07 == 3) {
                        enumC33391EpO = EnumC33391EpO.A05;
                    }
                } else {
                    enumC33391EpO = EnumC33391EpO.A06;
                }
            } else {
                enumC33391EpO = EnumC33391EpO.A03;
            }
            return enumC33391EpO.A00;
        }
        enumC33391EpO = EnumC33391EpO.A04;
        return enumC33391EpO.A00;
    }
}
