package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class ESW extends C1P1 {
    public final /* synthetic */ C2EC A00;
    public final /* synthetic */ C2DS A01;

    public ESW(C2EC c2ec, C2DS c2ds) {
        this.A01 = c2ds;
        this.A00 = c2ec;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.4q9] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1031079623);
        EAE eae = (EAE) obj;
        int A0N = AbstractC167017dG.A0N(eae, 1139666772);
        super.onSuccess(eae);
        C2DS c2ds = this.A01;
        C2EC c2ec = this.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        C32038E5q c32038E5q = eae.A00;
        if (c32038E5q == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        Iterator it = c32038E5q.A00.iterator();
        while (it.hasNext()) {
            E8E e8e = (E8E) ((InterfaceC37254Gb7) it.next());
            String str = e8e.A03;
            if (str == null) {
                str = "";
            }
            String str2 = e8e.A02;
            Boolean bool = e8e.A00;
            String str3 = e8e.A01;
            ?? obj2 = new Object();
            obj2.A05 = str;
            obj2.A03 = str2;
            obj2.A00 = bool;
            obj2.A06 = null;
            obj2.A04 = null;
            obj2.A02 = str3;
            obj2.A01 = null;
            A1E.add(obj2);
        }
        DirectThreadKey BKb = c2ec.BKb();
        C2DU c2du = (C2DU) c2ds;
        C4GV A0P = c2du.A0P(BKb);
        if (A0P != null) {
            C81663kb c81663kb = A0P.A0I;
            C14360o3.A07(c81663kb);
            c81663kb.A0G(A1E);
            c2du.FCS(BKb);
        }
        C0f9.A0A(2038954933, A0N);
        C0f9.A0A(1480901615, A03);
    }
}
