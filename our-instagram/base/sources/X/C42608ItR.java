package X;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.ItR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42608ItR implements JH9 {
    public final /* synthetic */ HEO A00;

    @Override // X.JH9
    public final void DJi(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C44459JlR c44459JlR = this.A00.A03;
        Collection collection = (Collection) c44459JlR.A01.A04.getValue();
        if (collection != null) {
            C05A c05a = c44459JlR.A08;
            Collection collection2 = (Collection) c05a.getValue();
            if (collection2 != null) {
                collection = collection2;
            }
            ArrayList A1F = AbstractC166987dD.A1F(collection);
            String A2u = c38321qM.A2u();
            if (AbstractC001800i.A0u(A1F, A2u)) {
                C15500q5.A00(A1F).remove(A2u);
            } else if (A1F.size() < 3) {
                if (A2u != null) {
                    A1F.add(A2u);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                c44459JlR.A09.Egh(new BHS(AbstractC25228BEl.A1Y(3), 2131973246));
            }
            c05a.Egh(A1F);
        }
    }

    @Override // X.JH9
    public final /* synthetic */ void DkP(C38321qM c38321qM) {
    }

    public C42608ItR(HEO heo) {
        this.A00 = heo;
    }
}
