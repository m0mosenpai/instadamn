package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.msys.reverb.MCAReverbLoggingContextMCFBridgejniDispatcher;
import com.mcftypeholder.McfTypeHolder;
import java.util.List;

/* loaded from: classes8.dex */
public final class JVB extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass776 A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JVB(AnonymousClass776 anonymousClass776, Long l, String str, String str2, List list, List list2, int i) {
        super(1);
        this.A04 = str;
        this.A02 = l;
        this.A00 = i;
        this.A06 = list;
        this.A05 = list2;
        this.A03 = str2;
        this.A01 = anonymousClass776;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [com.mcftypeholder.McfTypeHolder, X.Kb1] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        K3Y k3y = (K3Y) obj;
        C14360o3.A0B(k3y, 0);
        String str = this.A04;
        Long l = this.A02;
        int i2 = this.A00;
        List list = this.A06;
        List list2 = this.A05;
        String str2 = this.A03;
        if (str2 == null) {
            str2 = "";
        }
        AnonymousClass776 anonymousClass776 = this.A01;
        int i3 = 0;
        if (anonymousClass776 != null) {
            i = anonymousClass776.A01;
            i3 = anonymousClass776.A00;
        } else {
            i = 0;
        }
        ?? mcfTypeHolder = new McfTypeHolder(-1974637912, MCAReverbLoggingContextMCFBridgejniDispatcher.MCAReverbLoggingContextCreateWithQPLInstanceNative(str2, i, i3));
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3y);
        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0H);
        int A00 = AbstractC1346866s.A00(A0D);
        TraceInfo A01 = AbstractC1346866s.A01(A0D, "MailboxInstagramReverb", "loadMessageList");
        if (!A0H.ELJ(new JVA(k3y, A0D, mcfTypeHolder, l, str, list, list2, A00, i2))) {
            A0D.cancel(false);
            AbstractC1346866s.A02(A00);
            AbstractC1346866s.A03(A01, "MailboxInstagramReverb", "loadMessageList");
        }
        PlatformLogger.platformEventLog(5);
        return A0D;
    }
}
