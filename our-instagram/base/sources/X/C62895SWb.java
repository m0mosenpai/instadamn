package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SWb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62895SWb {
    public List A00;
    public final Integer A01;
    public final String A02;
    public final List A03;

    public static ArrayList A00(C2L1 c2l1, List list) {
        if (list == null) {
            return null;
        }
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C62895SWb c62895SWb = (C62895SWb) it.next();
            A0q.add(new C1120453t(c2l1, c62895SWb.A01, c62895SWb.A02, c62895SWb.A03, A00(c2l1, c62895SWb.A00)));
        }
        return A0q;
    }

    public C62895SWb(Integer num, String str, List list, List list2) {
        this.A02 = str;
        this.A01 = num;
        this.A03 = list;
        this.A00 = list2;
    }
}
