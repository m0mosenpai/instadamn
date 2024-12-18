package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;

/* loaded from: classes8.dex */
public final class MIT extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TransportPayload A01;
    public final /* synthetic */ InterfaceC37261GbE A02;
    public final /* synthetic */ C1OW A03;
    public final /* synthetic */ C47977LIp A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIT(TransportPayload transportPayload, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, C47977LIp c47977LIp, Long l, String str, int i) {
        super(1);
        this.A04 = c47977LIp;
        this.A06 = str;
        this.A05 = l;
        this.A01 = transportPayload;
        this.A00 = i;
        this.A03 = c1ow;
        this.A02 = interfaceC37261GbE;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MailboxFeature mailboxFeature = (MailboxFeature) obj;
        C14360o3.A0B(mailboxFeature, 0);
        C47977LIp c47977LIp = this.A04;
        C47810L9s c47810L9s = c47977LIp.A02;
        String str = this.A06;
        c47810L9s.A02(str);
        long longValue = this.A05.longValue();
        byte[] A0H = this.A01.A0H();
        int i = this.A00;
        JVY jvy = new JVY(17, c47977LIp, this.A03, this.A02);
        InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(mailboxFeature, 2);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0C, jvy);
        AbstractC25231BEo.A1C(A0C, new C48188LUm(mailboxFeature, A0I, A0H, str, i, 0, longValue), A0I);
        return C0eB.A00;
    }
}
