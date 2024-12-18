package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes8.dex */
public final class KWi extends AbstractC31602DuU {
    public final C25671My A00;
    public final UserSession A01;
    public final Context A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KWi(Context context, UserSession userSession) {
        super(userSession);
        C14360o3.A0B(userSession, 2);
        this.A02 = context;
        this.A01 = userSession;
        this.A00 = AbstractC25651Mw.A00(userSession);
    }

    @Override // X.AbstractC31602DuU
    public final void A02(C3o9 c3o9, Integer num) {
        AbstractC167007dF.A1K(c3o9, num);
        A03(c3o9, num, false);
    }

    @Override // X.AbstractC31602DuU
    public final void A03(C3o9 c3o9, Integer num, boolean z) {
        C14360o3.A0B(num, 2);
        AbstractC34188F6m.A00(this.A02, this.A01, new G6W(4, this, c3o9), JRE.A03(c3o9), num);
    }

    public final void A04(C3o9 c3o9, boolean z) {
        C14360o3.A0B(c3o9, 0);
        MsysThreadId A03 = JRE.A03(c3o9);
        K3a A01 = LIu.A01(this.A01);
        long j = A03.A00;
        LUO luo = new LUO(2, A03, c3o9, this, z);
        InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(A01, 0);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
        int A00 = AbstractC1346866s.A00(A0D);
        TraceInfo A0F = AbstractC43592JPx.A0F(luo, A0D, "MailboxTam", "runTamClientThreadDelete");
        if (!A0C.ELJ(new LUN(A00, 1, j, A01, A0D))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A0F, "MailboxTam", "runTamClientThreadDelete");
        }
        PlatformLogger.platformEventLog(5);
    }
}
