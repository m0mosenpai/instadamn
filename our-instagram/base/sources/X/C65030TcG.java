package X;

import android.util.SparseArray;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TcG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65030TcG extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SparseArray A01;
    public final /* synthetic */ C2GT A02;
    public final /* synthetic */ C58252li A03;
    public final /* synthetic */ C62735SOb A04;
    public final /* synthetic */ OtcInput A05;
    public final /* synthetic */ T2N A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65030TcG(SparseArray sparseArray, C2GT c2gt, C58252li c58252li, C62735SOb c62735SOb, OtcInput otcInput, T2N t2n, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A08 = str;
        this.A05 = otcInput;
        this.A06 = t2n;
        this.A04 = c62735SOb;
        this.A01 = sparseArray;
        this.A07 = str2;
        this.A03 = c58252li;
        this.A02 = c2gt;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        PaymentMethod paymentMethod;
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        int i = this.A00;
        if (i != 3) {
            if (i == 7) {
                T2N t2n = this.A06;
                C62735SOb c62735SOb = this.A04;
                C14360o3.A0A(c63406Sjd);
                t2n.A0B(c62735SOb, c63406Sjd, this.A07);
            } else {
                throw AbstractC43592JPx.A11();
            }
        } else if (C14360o3.A0K(this.A08, "CREATE")) {
            if (this.A05 != null) {
                C58252li A0J = AbstractC58322PtE.A0J(this.A04, this.A06);
                C63406Sjd A0S = AbstractC58318PtA.A0S(A0J);
                if (A0S != null) {
                    A0J.A0B(C63406Sjd.A00(C63568Spb.A00, A0S));
                }
            }
            T2N t2n2 = this.A06;
            SparseArray sparseArray = this.A01;
            C62735SOb c62735SOb2 = this.A04;
            C14360o3.A0A(c63406Sjd);
            t2n2.A08(sparseArray, c62735SOb2, c63406Sjd);
        } else {
            T2N t2n3 = this.A06;
            SparseArray sparseArray2 = this.A01;
            C62735SOb c62735SOb3 = this.A04;
            C14360o3.A0A(c63406Sjd);
            C58252li A0J2 = AbstractC58322PtE.A0J(c62735SOb3, t2n3);
            if (C63406Sjd.A0J(c63406Sjd) && (obj2 = c63406Sjd.A01) != null && C63406Sjd.A0F(A0J2)) {
                obj2.getClass();
                R0N A0E = ((R1N) obj2).A0E();
                QRL qrl = null;
                if (A0E != null) {
                    qrl = A0E.A0E();
                }
                C63406Sjd A03 = T2N.A03(qrl, false);
                if (A03 != null && (paymentMethod = (PaymentMethod) A03.A01) != null) {
                    C70126W5l c70126W5l = (C70126W5l) C63406Sjd.A07(A0J2);
                    List list = c70126W5l.A02;
                    C2J7 c2j7 = C2J8.A04;
                    if (C2J8.A06 != null) {
                        c2j7.A02().A02(paymentMethod.AtA(), C63287Sgm.A02(sparseArray2), "ECP");
                    }
                    C65089TdM c65089TdM = C65089TdM.A00;
                    C14360o3.A0B(c65089TdM, 2);
                    ArrayList A1F = AbstractC166987dD.A1F(list);
                    Iterator it = list.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (AbstractC166987dD.A1a(c65089TdM.invoke(it.next(), A03))) {
                            if (i2 != -1) {
                                A1F.set(i2, A03);
                            }
                        } else {
                            i2++;
                        }
                    }
                    C63406Sjd.A0C(A0J2, C70126W5l.A00(c70126W5l, null, AbstractC001800i.A0a(A1F), 1022));
                }
            }
        }
        if (C63406Sjd.A0J(c63406Sjd) || C63406Sjd.A0G(c63406Sjd)) {
            this.A03.A0D(this.A02);
        }
        return C0eB.A00;
    }
}
