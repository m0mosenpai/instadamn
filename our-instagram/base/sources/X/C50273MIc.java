package X;

import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MIc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50273MIc extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C47282Kut A02;
    public final /* synthetic */ TransportPayload A03;
    public final /* synthetic */ EnumC46242KdI A04;
    public final /* synthetic */ C47970LIe A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50273MIc(C47282Kut c47282Kut, TransportPayload transportPayload, EnumC46242KdI enumC46242KdI, C47970LIe c47970LIe, String str, String str2, long j, long j2) {
        super(1);
        this.A05 = c47970LIe;
        this.A07 = str;
        this.A00 = j;
        this.A03 = transportPayload;
        this.A01 = j2;
        this.A06 = str2;
        this.A04 = enumC46242KdI;
        this.A02 = c47282Kut;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractC24481Hr kkc;
        C47621L1g c47621L1g = (C47621L1g) obj;
        C14360o3.A0B(c47621L1g, 0);
        C2EC c2ec = (C2EC) c47621L1g.A01;
        if (c2ec != null) {
            C47970LIe c47970LIe = this.A05;
            LAB lab = c47970LIe.A04;
            String str = this.A07;
            lab.A01.A03(str, "thread_fetch_in_render_end");
            long j = this.A00;
            kkc = C47970LIe.A00(this.A03, this.A04, c2ec, c47970LIe, str, this.A06, j, this.A01);
        } else {
            C47970LIe c47970LIe2 = this.A05;
            LAB lab2 = c47970LIe2.A04;
            String str2 = this.A07;
            int i = c47621L1g.A00;
            List list = c47621L1g.A02;
            LJA lja = lab2.A01;
            lja.A04(str2, "thread_fetch_failure_error_code", i);
            lja.A08(str2, (Integer[]) list.toArray(new Integer[0]));
            lja.A07(str2, (short) 3);
            C0K8.A0C("ArmadilloExpressMessageProcessor", "Thread is still missing after ThreadSnapshot operation");
            c47970LIe2.A06.A07(this.A06, str2, "Thread missing", true);
            L8o l8o = c47970LIe2.A05;
            ArrayList A0S = AbstractC001800i.A0S(list, AbstractC43594JPz.A0z(i));
            ArrayList A0q = AbstractC167017dG.A0q(A0S);
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                AbstractC166997dE.A1X(A0q, AbstractC167007dF.A0B(it));
            }
            l8o.A00(str2, A0q, 7035, 2);
            l8o.A01(str2, false);
            C91Y A00 = C91Y.A0A.A00();
            if (A00 != null) {
                LCM.A01(c47970LIe2.A00, this.A04, A00, null, str2);
            }
            JZK A002 = JZK.A0A.A00();
            if (A002 != null) {
                LCM.A00(A002, c47970LIe2.A00, this.A04, null, str2);
            }
            Exception exc = new Exception("Thread is still missing after ThreadSnapshot operation");
            kkc = new KKC();
            kkc.A09(exc);
        }
        kkc.A03(new C48526LdP(this.A02, 1));
        return C0eB.A00;
    }
}
