package X;

import com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent;

/* loaded from: classes8.dex */
public final class MIJ extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C47282Kut A02;
    public final /* synthetic */ TransportEvent.Event A03;
    public final /* synthetic */ C47913LEh A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIJ(C47282Kut c47282Kut, TransportEvent.Event event, C47913LEh c47913LEh, String str, long j, long j2) {
        super(1);
        this.A04 = c47913LEh;
        this.A00 = j;
        this.A05 = str;
        this.A03 = event;
        this.A01 = j2;
        this.A02 = c47282Kut;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C47621L1g c47621L1g = (C47621L1g) obj;
        C14360o3.A0B(c47621L1g, 0);
        C2EC c2ec = (C2EC) c47621L1g.A01;
        if (c2ec != null) {
            C47913LEh c47913LEh = this.A04;
            long j = this.A00;
            this.A02.A00.A0A(C47913LEh.A00(this.A03, c2ec, c47913LEh, this.A05, j, this.A01));
        } else {
            C0K8.A0C("ArmadilloExpressTransportEventProcessor", "Thread is still missing after ThreadSnapshot operation");
            this.A04.A02.A01(this.A05, false);
            C47282Kut c47282Kut = this.A02;
            c47282Kut.A00.A09(new Exception("Thread is still missing after ThreadSnapshot operation"));
        }
        return C0eB.A00;
    }
}
