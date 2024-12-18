package X;

import android.util.SparseArray;

/* renamed from: X.G0e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36309G0e implements InterfaceC43071ya {
    public final /* synthetic */ FNE A00;

    public C36309G0e(FNE fne) {
        this.A00 = fne;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        if (c59062n7 != null) {
            FNE fne = this.A00;
            if (interfaceC57162jr != null && interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
                Object obj = c59062n7.A03;
                C31576Du4 c31576Du4 = (C31576Du4) obj;
                String str = c31576Du4.A01;
                if (str != null && fne.A04.add(str)) {
                    FQ3 fq3 = fne.A02;
                    C14360o3.A06(obj);
                    SparseArray sparseArray = c31576Du4.A00;
                    if (sparseArray != null) {
                        Object obj2 = sparseArray.get(1);
                        if (obj2 instanceof String) {
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(fq3.A00, "suggestions_see_all_impression");
                            A0f.AAP("view_module", (String) obj2);
                            A0f.Cht();
                        }
                    }
                }
            }
        }
    }
}
