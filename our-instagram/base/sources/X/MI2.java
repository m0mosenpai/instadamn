package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* loaded from: classes8.dex */
public final class MI2 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MI2(Long l, int i, long j, boolean z) {
        super(1);
        this.A01 = j;
        this.A02 = l;
        this.A00 = i;
        this.A03 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        K3Y k3y = (K3Y) obj;
        C14360o3.A0B(k3y, 0);
        String valueOf = String.valueOf(this.A01);
        Long l = this.A02;
        Integer valueOf2 = Integer.valueOf(this.A00);
        boolean z = this.A03;
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3y);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0H);
        int A00 = AbstractC1346866s.A00(A0D);
        TraceInfo A01 = AbstractC1346866s.A01(A0D, "MailboxInstagramReverb", "loadMessagesForReporting");
        if (!A0H.ELJ(new C48185LUj(k3y, A0D, l, valueOf2, valueOf, A00, z))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A01, "MailboxInstagramReverb", "loadMessagesForReporting");
        }
        PlatformLogger.platformEventLog(5);
        return A0D;
    }
}
