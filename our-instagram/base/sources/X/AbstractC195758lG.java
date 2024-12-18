package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8lG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC195758lG {
    public static final Integer A00(UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 0);
        String string = AbstractC23021Ah.A00(userSession).A01.getString("gallery_suggestions_setting", "auto_created_reels");
        C14360o3.A07(string);
        for (Integer num : C05F.A00(2)) {
            if (1 - num.intValue() == 0) {
                str = "auto_created_reels";
            } else {
                str = "off";
            }
            if (str.equals(string)) {
                return num;
            }
        }
        return C05F.A00;
    }
}
