package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import java.util.Map;

/* renamed from: X.Obx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55133Obx {
    public RtcCallKey A00;
    public String A01;
    public final UserSession A02;
    public final UserFlowLoggerImpl A03;

    public C55133Obx(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = new UserFlowLoggerImpl(C006802i.A0p);
    }

    public static C25531Mh A00(C55133Obx c55133Obx) {
        C18920wW A02 = AbstractC12220kQ.A02(c55133Obx.A02);
        return new C25531Mh(A02.A00(A02.A00, "ig_cowatch_event"), 214);
    }

    public static String A01(InterfaceC02530Ab interfaceC02530Ab, AbstractC02600Aj abstractC02600Aj, C55133Obx c55133Obx) {
        abstractC02600Aj.A0M(interfaceC02530Ab, CacheBehaviorLogger.SOURCE);
        RtcCallKey rtcCallKey = c55133Obx.A00;
        if (rtcCallKey != null) {
            return rtcCallKey.A00;
        }
        return null;
    }

    public static void A02(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02530Ab interfaceC02530Ab2, AbstractC02600Aj abstractC02600Aj, C55133Obx c55133Obx, String str) {
        abstractC02600Aj.A0R("waterfall_id", c55133Obx.A01);
        abstractC02600Aj.A0M(interfaceC02530Ab, "media_source");
        abstractC02600Aj.A0M(interfaceC02530Ab2, "media_type");
        abstractC02600Aj.A0R("media_id", str);
        abstractC02600Aj.Cht();
    }

    public final void A03(EnumC53379NjU enumC53379NjU, String str, Map map) {
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(this.A02), "ig_cowatch_event");
        if (A0f.isSampled()) {
            AbstractC37300Gc1.A0e(enumC53379NjU, A0f);
            RtcCallKey rtcCallKey = this.A00;
            if (rtcCallKey != null) {
                str2 = rtcCallKey.A00;
            } else {
                str2 = null;
            }
            A0f.AAP("server_info", str2);
            MSW.A1U(A0f, this.A01);
            A0f.A9M("extra_info", map);
            MSW.A1S(A0f, str);
            A0f.Cht();
        }
    }
}
