package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7MK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7MK {
    public static final String A00(Context context, UserSession userSession, String str, String str2, int i) {
        int i2;
        String string;
        Object[] objArr;
        switch (i) {
            case 4:
                i2 = 2131958673;
                if (str2 != null) {
                    i2 = 2131958672;
                    objArr = new Object[]{str, str2};
                    string = context.getString(i2, objArr);
                    break;
                }
                objArr = new Object[]{str};
                string = context.getString(i2, objArr);
            case 5:
                i2 = 2131959027;
                if (str2 != null) {
                    i2 = 2131959026;
                    objArr = new Object[]{str, str2};
                    string = context.getString(i2, objArr);
                    break;
                }
                objArr = new Object[]{str};
                string = context.getString(i2, objArr);
            case 6:
            case 7:
                string = context.getString(2131958815);
                break;
            default:
                if (str2 != null) {
                    i2 = 2131960334;
                    objArr = new Object[]{str, str2};
                    string = context.getString(i2, objArr);
                    break;
                } else {
                    i2 = 2131960335;
                    if (C18U.A05(C06090Tz.A05, userSession)) {
                        i2 = 2131960336;
                    }
                    objArr = new Object[]{str};
                    string = context.getString(i2, objArr);
                }
        }
        C14360o3.A0A(string);
        return string;
    }
}
