package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.FAa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34280FAa {
    public static final C32330EMc A00(UserSession userSession, C23710Aej c23710Aej, EnumC33393EpQ enumC33393EpQ, GYD gyd, String str, String str2, String str3, String str4, List list, List list2, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str2, 8);
        C32330EMc c32330EMc = new C32330EMc();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putBoolean("ARGS_SHOULD_SHOW_PRIVACY_TOGGLE", z);
        A05.putBoolean("ARGS_MENTION_SHARING_ENABLED", z2);
        A05.putInt("ARGS_MAX_MENTION_COUNT", 20);
        A05.putString("ARGS_MEDIA_ID", str);
        A05.putString("ARGS_MEDIA_TYPE", str2);
        A05.putInt("ARGS_MEDIA_POSITION", i);
        A05.putString("ARGS_SESSION_ID", str3);
        A05.putString("ARGS_ENTRY_POINT", enumC33393EpQ.A00);
        A05.putString("ARGS_TITLE", str4);
        A05.putBoolean("ARGS_HAS_ACTION_BUTTON", z3);
        c32330EMc.setArguments(A05);
        c32330EMc.A07 = gyd;
        c32330EMc.A04 = c23710Aej;
        HashSet hashSet = c32330EMc.A0L;
        hashSet.clear();
        if (list != null) {
            hashSet.addAll(list);
        }
        HashSet hashSet2 = c32330EMc.A0K;
        hashSet2.clear();
        HashSet hashSet3 = c32330EMc.A0M;
        hashSet3.clear();
        if (list2 != null) {
            hashSet2.addAll(list2);
            hashSet3.addAll(list2);
        }
        return c32330EMc;
    }
}
