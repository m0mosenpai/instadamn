package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes8.dex */
public final class M6U implements Runnable {
    public final /* synthetic */ KWi A00;
    public final /* synthetic */ MsysThreadId A01;
    public final /* synthetic */ C3o9 A02;
    public final /* synthetic */ boolean A03;

    public M6U(KWi kWi, MsysThreadId msysThreadId, C3o9 c3o9, boolean z) {
        this.A00 = kWi;
        this.A01 = msysThreadId;
        this.A03 = z;
        this.A02 = c3o9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.1vN] */
    @Override // java.lang.Runnable
    public final void run() {
        KWi kWi = this.A00;
        C25671My c25671My = kWi.A00;
        MsysThreadId msysThreadId = this.A01;
        c25671My.E4s(new C48032Iq(msysThreadId));
        if (this.A03) {
            UserSession userSession = kWi.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36326141900240557L) && C18U.A06(c06090Tz, userSession, 36326141900306094L)) {
                c25671My.E4s(new Object());
            }
        }
        kWi.A01(msysThreadId);
    }
}
