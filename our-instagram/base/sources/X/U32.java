package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class U32 {
    public static final C2n2 A00 = U35.A00;

    public static final List A00(UserSession userSession, C195218kN c195218kN, String str) {
        List A01;
        char charAt;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c195218kN, 2);
        String str2 = str;
        if (!TextUtils.isEmpty(str) && ((charAt = str.charAt(0)) == '@' || charAt == '#')) {
            str2 = str.substring(1);
        }
        C14360o3.A07(str2);
        HashSet hashSet = new HashSet();
        c195218kN.A08(null, "autocomplete_user_list", str, hashSet);
        C65740TtF A002 = AbstractC65792TuA.A00(userSession);
        synchronized (A002) {
            A01 = A002.A00.A01();
        }
        AbstractC169147gn.A00(null, str2, A01, hashSet);
        List A012 = U12.A01(hashSet);
        c195218kN.A07(A00, "autocomplete_user_list", null, A012);
        C14360o3.A0C(A012, "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.search.common.model.UserSearchEntry>");
        return C15500q5.A02(A012);
    }
}
