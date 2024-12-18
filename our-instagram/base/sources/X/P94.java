package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class P94 implements GZN {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public P94(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.GZN
    public final void DlA(List list) {
        if (this.A00 != 0) {
            C14360o3.A0B(list, 0);
            C55908Orz c55908Orz = (C55908Orz) this.A02;
            Object obj = this.A01;
            boolean A1a = AbstractC166987dD.A1a(list.get(0));
            Activity activity = c55908Orz.A01;
            C121275eQ A02 = AbstractC50633MWu.A02(activity, c55908Orz.A07, c55908Orz.A0A, C55908Orz.__redex_internal_original_name, false, A1a);
            A02.A00 = new NFS(1, c55908Orz, obj);
            AbstractC63248Sg4.A02(c55908Orz.A04);
            C1GJ.A00(activity, c55908Orz.A05, A02);
            return;
        }
        C14360o3.A0B(list, 0);
        List list2 = (List) this.A01;
        if (list2.size() == 1 && AbstractC25225BEi.A0x(list2, 0).Cff()) {
            C52156N6i c52156N6i = (C52156N6i) this.A02;
            if (!C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(c52156N6i.A05), 36319854067982035L)) {
                C193328hC A0O = AbstractC31175DnJ.A0O(c52156N6i);
                A0O.A0A(2131963637);
                A0O.A09(2131963636);
                AbstractC31176DnK.A1W(A0O);
                return;
            }
        }
        C52156N6i c52156N6i2 = (C52156N6i) this.A02;
        Object A17 = AbstractC166987dD.A17(c52156N6i2.A02);
        ArrayList A0q = AbstractC167017dG.A0q(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A0q.add(((C75H) c52156N6i2.A04.getValue()).A00(AbstractC31172DnG.A0i(it)));
        }
        List A0a = AbstractC001800i.A0a(A0q);
        C08790ch A00 = AbstractC018607g.A00(c52156N6i2);
        C121275eQ A01 = ((C75H) c52156N6i2.A04.getValue()).A01(A0a, list);
        A01.A00 = new NFU(0, c52156N6i2, list2, A00, A17);
        C1GJ.A00(c52156N6i2.requireActivity(), A00, A01);
    }

    @Override // X.GZN
    public final void onCancel() {
        throw C00O.createAndThrow();
    }
}
