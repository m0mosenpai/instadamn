package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.LEp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47920LEp {
    public long A00;
    public final InterfaceC11380iw A01;
    public final C41761wQ A02;
    public final UserSession A03;
    public final JUk A04;

    public /* synthetic */ C47920LEp(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        JUk jUk = new JUk(interfaceC11380iw, userSession);
        this.A03 = userSession;
        this.A01 = interfaceC11380iw;
        this.A04 = jUk;
        this.A02 = AbstractC31174DnI.A0S();
    }

    public static final void A00(C47920LEp c47920LEp, MsysThreadId msysThreadId) {
        c47920LEp.A02.A02(C137746Lw.A00(c47920LEp.A03, "MsysProactiveWarningBannerManager").A01.A0B.A0L(new C43597JQd(msysThreadId, 47)).A0P(AbstractC142856cl.A00), C49793Lz0.A00);
    }
}
