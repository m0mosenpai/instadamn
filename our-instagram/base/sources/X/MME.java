package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class MME extends C0YY implements InterfaceC16620sF {
    public static final MME A00 = new MME();

    public MME() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C47750L6u c47750L6u = (C47750L6u) obj2;
        C47750L6u c47750L6u2 = (C47750L6u) ((C09530e4) obj).A01;
        C14360o3.A0A(c47750L6u);
        AbstractC167017dG.A1N(c47750L6u2, c47750L6u);
        List A002 = c47750L6u2.A00();
        List A003 = c47750L6u.A00();
        HashSet A1H = AbstractC166987dD.A1H();
        ArrayList A0q = AbstractC167017dG.A0q(A003);
        Iterator it = A003.iterator();
        while (it.hasNext()) {
            Object key = ((InterfaceC66482zP) it.next()).getKey();
            C14360o3.A07(key);
            A0q.add(Boolean.valueOf(A1H.add(key)));
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj3 : A002) {
            AbstractC25228BEl.A1Q(obj3, A1E, A1H.contains(((InterfaceC66482zP) obj3).getKey()) ? 1 : 0);
        }
        return AbstractC166987dD.A1L(A1E, c47750L6u);
    }
}
