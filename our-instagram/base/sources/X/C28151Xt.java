package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28151Xt {
    public static C28151Xt A02;
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    public final C166217bp A01(UserSession userSession) {
        C166217bp c166217bp;
        C14360o3.A0B(userSession, 0);
        C166207bo c166207bo = (C166207bo) userSession.A00(C166207bo.class);
        if (c166207bo != null && (c166217bp = (C166217bp) c166207bo.A00.get()) != null) {
            return c166217bp;
        }
        C166217bp c166217bp2 = new C166217bp();
        userSession.A04(C166207bo.class, new C166207bo(c166217bp2));
        return c166217bp2;
    }

    public final void A02(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC37205GaG interfaceC37205GaG, String str, String str2) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(str, 3);
        C14360o3.A0B(str2, 4);
        C166217bp A01 = A01(userSession);
        C14360o3.A0B(A01, 3);
        List singletonList = Collections.singletonList(str);
        C14360o3.A07(singletonList);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("session_user_id:%s::change_type:%s::target_user_id:%s", userSession.userId, "unrestrict", TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, singletonList));
        C14360o3.A07(formatStrLocaleSafe);
        Map map = AbstractC166547cQ.A01;
        Number number = (Number) map.get(formatStrLocaleSafe);
        if (number != null) {
            if (number.longValue() + AbstractC166547cQ.A00 <= System.currentTimeMillis()) {
                map.remove(formatStrLocaleSafe);
            } else {
                return;
            }
        }
        C1ON A012 = AbstractC166547cQ.A01(userSession, str, str2);
        A012.A00 = new EUV(userSession, new C33315EoA(A01), interfaceC37205GaG, formatStrLocaleSafe);
        C1GJ.A00(context, abstractC018607g, A012);
    }

    public final void A03(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC37205GaG interfaceC37205GaG, String str, String str2, String str3, String str4) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(abstractC018607g, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(str2, 4);
        C166217bp A01 = A01(userSession);
        List singletonList = Collections.singletonList(str);
        C14360o3.A07(singletonList);
        AbstractC166547cQ.A02(context, abstractC018607g, userSession, interfaceC37205GaG, A01, str2, str3, str4, singletonList);
    }

    public final C35015Fbo A00() {
        return (C35015Fbo) this.A01.getValue();
    }

    public C28151Xt() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A00 = AbstractC09440dt.A00(enumC09460dv, C28161Xu.A00);
        this.A01 = AbstractC09440dt.A00(enumC09460dv, C28181Xw.A00);
    }
}
