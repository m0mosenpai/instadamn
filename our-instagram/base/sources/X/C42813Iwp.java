package X;

import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.Iwp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42813Iwp implements XB3 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C42813Iwp(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.XB3
    public final void Cpy(SavedCollection savedCollection) {
        switch (this.A00) {
            case 0:
                HHH hhh = (HHH) this.A01;
                AbstractC35260Fgu.A06(hhh.A03.requireContext(), hhh.A04, hhh.A05, savedCollection, (List) this.A02);
                hhh.A02();
                return;
            case 1:
                HHH hhh2 = (HHH) this.A01;
                hhh2.A0F.A02(new DialogInterfaceOnClickListenerC41800IfG(5, this, savedCollection), savedCollection.A0G, hhh2.A06.A02.size());
                return;
            default:
                EM6 em6 = (EM6) this.A01;
                AbstractC35260Fgu.A06(em6.requireContext(), em6, em6.A05, savedCollection, (List) this.A02);
                EM6.A02(em6);
                return;
        }
    }
}
