package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class MIS extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C47282Kut A04;
    public final /* synthetic */ C47912LEg A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIS(C47282Kut c47282Kut, C47912LEg c47912LEg, String str, int i, int i2, long j, long j2) {
        super(1);
        this.A05 = c47912LEg;
        this.A01 = i;
        this.A02 = j;
        this.A06 = str;
        this.A03 = j2;
        this.A00 = i2;
        this.A04 = c47282Kut;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A1J;
        C47621L1g c47621L1g = (C47621L1g) obj;
        C14360o3.A0B(c47621L1g, 0);
        C2EC c2ec = (C2EC) c47621L1g.A01;
        if (c2ec != null) {
            A1J = C47912LEg.A00(c2ec, this.A05, this.A06, this.A01, this.A00, this.A02, this.A03);
        } else {
            L8o l8o = this.A05.A03;
            String str = this.A06;
            ArrayList A0S = AbstractC001800i.A0S(c47621L1g.A02, AbstractC43594JPz.A0z(c47621L1g.A00));
            ArrayList A0q = AbstractC167017dG.A0q(A0S);
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                AbstractC166997dE.A1X(A0q, AbstractC167007dF.A0B(it));
            }
            l8o.A00(str, A0q, 7035, 2);
            l8o.A01(str, false);
            A1J = AbstractC166987dD.A1J(new KX0("Thread is still missing after ThreadSnapshot operation"));
        }
        this.A04.A00.A0A(A1J);
        return C0eB.A00;
    }
}
