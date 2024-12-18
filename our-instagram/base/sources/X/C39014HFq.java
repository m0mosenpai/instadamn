package X;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* renamed from: X.HFq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39014HFq extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C104294ms A01;
    public final /* synthetic */ C141596ac A02;
    public final /* synthetic */ C38080Gp9 A03;

    public C39014HFq(C104294ms c104294ms, C141596ac c141596ac, C38080Gp9 c38080Gp9, int i) {
        this.A02 = c141596ac;
        this.A01 = c104294ms;
        this.A03 = c38080Gp9;
        this.A00 = i;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        int i;
        C41181vS c41181vS;
        C104294ms c104294ms;
        Object remove;
        C104294ms c104294ms2;
        int A03 = C0f9.A03(219000891);
        int A032 = C0f9.A03(-1513859514);
        ICR icr = ((HA3) obj).A00;
        if (icr != null && (list = icr.A00) != null) {
            C141596ac c141596ac = this.A02;
            if (c141596ac.A11) {
                C104294ms c104294ms3 = this.A01;
                List A01 = c104294ms3.A01();
                List list2 = (List) A01.stream().map(new J6G(1)).collect(Collectors.toList());
                for (int i2 = 0; i2 < list.size(); i2++) {
                    C139196Sa c139196Sa = (C139196Sa) list.get(i2);
                    if (!list2.contains(c139196Sa.A02.getId())) {
                        A01.add(c139196Sa);
                    }
                }
                c104294ms3.A02(A01);
                C38080Gp9 c38080Gp9 = this.A03;
                C6SE c6se = c38080Gp9.A0V;
                C41551w4 c41551w4 = c38080Gp9.A07;
                if (c41551w4 != null) {
                    C6SY[] A04 = c6se.A04();
                    int length = A04.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        if (A04[i3].A05.getVisibility() == 4) {
                            C141596ac c141596ac2 = c6se.A09;
                            if (c141596ac2 != null && (i = c141596ac2.A0M) != 0) {
                                C41181vS c41181vS2 = c6se.A08;
                                ArrayList arrayList = null;
                                if (c41181vS2 != null && (c104294ms2 = c41181vS2.A09) != null) {
                                    arrayList = AbstractC166987dD.A1F(c104294ms2.A01());
                                }
                                for (int i4 = 0; i4 < i; i4++) {
                                    if (arrayList != null && (remove = arrayList.remove(i4)) != null) {
                                        arrayList.add(i + i4 + 1, remove);
                                    }
                                }
                                C141596ac c141596ac3 = c6se.A09;
                                if (c141596ac3 != null) {
                                    c141596ac3.A0M = 0;
                                }
                                if (arrayList != null && (c41181vS = c6se.A08) != null && (c104294ms = c41181vS.A09) != null) {
                                    c104294ms.A02(AbstractC001800i.A0a(arrayList));
                                }
                            }
                            C6SW.A01.A04(c41551w4, c6se, false);
                        } else {
                            i3++;
                        }
                    }
                }
                AbstractC139216Sc.A03(c104294ms3, c141596ac);
            } else if (list.size() > this.A00) {
                this.A01.A02(list);
            }
        }
        C0f9.A0A(304939277, A032);
        C0f9.A0A(2012479806, A03);
    }
}
