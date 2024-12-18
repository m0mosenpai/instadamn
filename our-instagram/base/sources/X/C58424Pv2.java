package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pv2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58424Pv2 {
    public static int A07;
    public ArrayList A00;
    public final int A01;
    public final Integer A02;
    public final List A03;
    public final java.util.Set A04 = AbstractC166987dD.A1H();
    public final java.util.Set A05;
    public final java.util.Set A06;

    public C58424Pv2(Integer num, List list, java.util.Set set, java.util.Set set2) {
        int i;
        this.A02 = num;
        synchronized (C58424Pv2.class) {
            i = A07;
            A07 = i + 1;
        }
        this.A01 = i;
        this.A05 = set;
        this.A06 = set2;
        this.A03 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C58425Pv3 c58425Pv3 = (C58425Pv3) it.next();
            Integer num2 = c58425Pv3.A00;
            if (num2 == C05F.A00 || num2 == C05F.A0C) {
                this.A04.addAll(c58425Pv3.A01);
            }
        }
    }
}
