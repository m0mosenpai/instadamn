package X;

import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.Iwo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42812Iwo implements XB2 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C42812Iwo(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.XB2
    public final void ALn(String str, int i) {
        switch (this.A00) {
            case 0:
                HHH hhh = (HHH) this.A01;
                AbstractC35260Fgu.A05(hhh.A03.requireContext(), hhh.A04, hhh.A05, hhh.A0E, str, (List) this.A02, i);
                hhh.A02();
                return;
            case 1:
                HHH hhh2 = (HHH) this.A01;
                FRS frs = hhh2.A0F;
                str.getClass();
                frs.A02(new DialogInterfaceOnClickListenerC41803IfJ(this, str, i), str, hhh2.A06.A02.size());
                return;
            default:
                EM6 em6 = (EM6) this.A01;
                List list = (List) this.A02;
                SavedCollection savedCollection = em6.A0C;
                if (savedCollection != null) {
                    AbstractC35260Fgu.A05(em6.requireContext(), em6, em6.A05, savedCollection, str, list, i);
                }
                EM6.A02(em6);
                return;
        }
    }
}
