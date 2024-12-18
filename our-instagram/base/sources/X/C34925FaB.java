package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.FaB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34925FaB {
    public final C18920wW A00;

    public static final void A00(C34925FaB c34925FaB, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34925FaB.A00, "direct_welcome_message_events");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, str);
            A0f.A7v("enabled_status", bool);
            A0f.A7v("has_emoji", bool3);
            A0f.A7v("has_message_content", bool2);
            A0f.AAP("error_message", str3);
            A0f.AAP(CacheBehaviorLogger.SOURCE, str2);
            A0f.A7v("is_default_content", bool4);
            A0f.Cht();
        }
    }

    public C34925FaB(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
