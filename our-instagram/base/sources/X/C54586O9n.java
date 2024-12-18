package X;

import com.instagram.appreciation.analytics.LoggingData;
import com.instagram.common.session.UserSession;

/* renamed from: X.O9n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54586O9n {
    public final LLN A00;
    public final C47241KuE A01;
    public final UserSession A02;

    public /* synthetic */ C54586O9n(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        LLN lln = new LLN(new LoggingData(str, str2), interfaceC11380iw, AbstractC12220kQ.A01(interfaceC11380iw, userSession));
        C47241KuE c47241KuE = new C47241KuE(userSession);
        this.A02 = userSession;
        this.A00 = lln;
        this.A01 = c47241KuE;
    }
}
