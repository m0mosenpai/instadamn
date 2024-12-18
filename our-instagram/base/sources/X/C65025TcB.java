package X;

import com.fbpay.w3c.W3CCardDetail;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.TcB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65025TcB extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C2GT A02;
    public final /* synthetic */ Q8E A03;
    public final /* synthetic */ C15130pT A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65025TcB(C2GT c2gt, Q8E q8e, C15130pT c15130pT, long j, long j2) {
        super(1);
        this.A03 = q8e;
        this.A02 = c2gt;
        this.A04 = c15130pT;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C2GS c2gs;
        Object c69777VvE;
        C62678SLr c62678SLr = (C62678SLr) obj;
        if (c62678SLr != null) {
            Q8E q8e = this.A03;
            C58252li c58252li = q8e.A08;
            c58252li.A0D(this.A02);
            Throwable th = c62678SLr.A02;
            if (AbstractC25229BEm.A1Z(th)) {
                C2GS c2gs2 = q8e.A09;
                Object obj2 = c62678SLr.A01;
                if (obj2 != null) {
                    c2gs2.A0B(new C69777VvE(((W3CCardDetail) obj2).A00, null, null, q8e.A0D.now() - this.A04.A00, this.A01, this.A00, C63021Sam.A02.now()));
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                List list = q8e.A06;
                if (th != null) {
                    list.add(th);
                    long j = this.A04.A00;
                    HashSet hashSet = W39.A0C;
                    W39 w39 = new W39(q8e.A0D(), th);
                    if (AbstractC167007dF.A1Z(w39.A07)) {
                        c2gs = q8e.A0A;
                        if (c2gs.A02() == EnumC61076Req.A02) {
                            c69777VvE = EnumC61076Req.A03;
                            c2gs.A0B(c69777VvE);
                            Q8E.A01(q8e);
                        }
                    }
                    c58252li.A0B(EnumC61125Rff.A02);
                    c2gs = q8e.A09;
                    c69777VvE = new C69777VvE(null, w39, null, q8e.A0D.now() - j, -1L, -1L, -1L);
                    c2gs.A0B(c69777VvE);
                    Q8E.A01(q8e);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        }
        return C0eB.A00;
    }
}
