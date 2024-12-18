package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.MHs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50263MHs extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50263MHs(long j, long j2, String str) {
        super(1);
        this.A01 = j;
        this.A00 = j2;
        this.A02 = str;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        K3Y k3y = (K3Y) obj;
        C14360o3.A0B(k3y, 0);
        String valueOf = String.valueOf(this.A01);
        Long valueOf2 = Long.valueOf(this.A00);
        String str = this.A02;
        C48166LTq c48166LTq = new C48166LTq(0);
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3y);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0H);
        int A00 = AbstractC1346866s.A00(A0D);
        TraceInfo A0F = AbstractC43592JPx.A0F(c48166LTq, A0D, "MailboxInstagramReverb", "deleteThread");
        if (!A0H.ELJ(new LUY(k3y, A0D, valueOf2, valueOf, str, A00))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A0F, "MailboxInstagramReverb", "deleteThread");
        }
        PlatformLogger.platformEventLog(5);
        return C0eB.A00;
    }
}
