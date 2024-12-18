package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.31L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C31L {
    public static final C31L A00 = new Object();

    public final C31N A00(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36317453181129903L)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (EnumC39531Hcy enumC39531Hcy : EnumC39531Hcy.values()) {
                if (enumC39531Hcy.ordinal() == 0) {
                    linkedHashMap.put(enumC39531Hcy, Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36317453180998830L)));
                } else {
                    throw new RuntimeException();
                }
            }
            return new C42944Iyw(linkedHashMap);
        }
        return new C31N() { // from class: X.31M
            @Override // X.C31N
            public final void FAv(AbstractC39670Hiz abstractC39670Hiz, EnumC39531Hcy enumC39531Hcy2) {
            }

            @Override // X.C31N
            public final boolean isEnabled() {
                return false;
            }
        };
    }
}
