package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;

/* renamed from: X.2wu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC64962wu {
    public static C64972wv A01(Context context, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        return A00(context, fragmentActivity, null, userSession, interfaceC60442pS, null, null, null, null, null, null, str, null, null, str2, false, false);
    }

    public static C64972wv A02(Context context, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, boolean z) {
        return A00(context, fragmentActivity, null, userSession, interfaceC60442pS, null, null, null, null, null, null, str, str2, null, str3, z, false);
    }

    public static C64972wv A00(Context context, FragmentActivity fragmentActivity, RankingInfo rankingInfo, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
        return C1XJ.A00.A0C(context, fragmentActivity, rankingInfo, userSession, interfaceC60442pS, null, num, str9, str6, str7, str5, str2, str4, str, str3, str8, z, z2);
    }
}
