package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.Pair;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Lh4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48736Lh4 implements InterfaceC50476MQe {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ InterfaceC50477MQf A01;
    public final /* synthetic */ JR2 A02;
    public final /* synthetic */ C2EC A03;

    @Override // X.InterfaceC50476MQe
    public final void DSE(C45093JxN c45093JxN, C45093JxN c45093JxN2) {
    }

    public C48736Lh4(RectF rectF, InterfaceC50477MQf interfaceC50477MQf, JR2 jr2, C2EC c2ec) {
        this.A03 = c2ec;
        this.A00 = rectF;
        this.A01 = interfaceC50477MQf;
        this.A02 = jr2;
    }

    @Override // X.InterfaceC50476MQe
    public final void DRV() {
        JR2 jr2 = this.A02;
        Context context = jr2.A1L.getContext();
        if (context != null) {
            C146106i8 A0j = AbstractC25229BEm.A0j();
            A0j.A06();
            AbstractC25226BEj.A1N(context, A0j, 2131960136);
            AbstractC25233BEq.A1F(A0j);
        }
        jr2.A0z();
    }

    @Override // X.InterfaceC50476MQe
    public final void DS0() {
        DirectThreadKey directThreadKey;
        C2EC c2ec = this.A03;
        RectF rectF = this.A00;
        InterfaceC50477MQf interfaceC50477MQf = this.A01;
        JR2 jr2 = this.A02;
        C3FR c3fr = jr2.A0o;
        if (c3fr != null) {
            int B6q = c3fr.B6q();
            C3FR c3fr2 = jr2.A0o;
            if (c3fr2 != null) {
                int BM3 = c3fr2.BM3();
                if (B6q >= 0 && BM3 >= 0) {
                    while (B6q < BM3) {
                        Object A04 = ((JXU) jr2.A1e.getValue()).A00.A04(B6q);
                        if ((A04 instanceof JRL) && (directThreadKey = ((JRL) A04).A0I) != null && C14360o3.A0K(c2ec.C7I(), directThreadKey.A00)) {
                            L1Q l1q = jr2.A0b;
                            if (l1q != null) {
                                l1q.A01.DQ6();
                                l1q.A00.removeCallbacks(l1q.A02);
                            }
                            jr2.A0b = null;
                            C15500q5.A04(jr2.A1W).remove(c2ec.C7I());
                            C15500q5.A04(jr2.A1Y).remove(c2ec.C7I());
                            Pair pair = jr2.A07;
                            if (pair != null && pair.second == interfaceC50477MQf) {
                                interfaceC50477MQf.DS5();
                                AbstractC43593JPy.A0W(jr2).A00(rectF, c2ec.BKb(), false);
                                ((InterfaceC50516MRt) jr2.A2x.getValue()).AAX(c2ec.C7I());
                                return;
                            }
                            return;
                        }
                        B6q++;
                    }
                }
                jr2.A0z();
                return;
            }
        }
        C14360o3.A0F("inboxViewProxy");
        throw C00O.createAndThrow();
    }
}
