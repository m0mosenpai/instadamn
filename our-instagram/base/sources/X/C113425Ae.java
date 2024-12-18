package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Ae, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113425Ae extends C59G {
    public static final C113425Ae A00 = new C113425Ae();

    public C113425Ae() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // X.InterfaceC1127857k
    public final InterfaceC119205ac CpD(C59Z c59z, List list, long j) {
        int A03;
        int A02;
        InterfaceC16660sJ dru;
        InterfaceC16660sJ c206929Dx;
        if (list.isEmpty()) {
            A03 = Constraints.A03(j);
            A02 = Constraints.A02(j);
            c206929Dx = C207889Hu.A00;
        } else {
            if (list.size() == 1) {
                C59W CpF = ((InterfaceC1131559d) list.get(0)).CpF(j);
                A03 = C5AU.A03(j, CpF.A01);
                A02 = C5AU.A02(j, CpF.A00);
                c206929Dx = new C206929Dx(CpF, 49);
            } else {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((InterfaceC1131559d) list.get(i)).CpF(j));
                }
                int size2 = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    C59W c59w = (C59W) arrayList.get(i4);
                    i2 = Math.max(c59w.A01, i2);
                    i3 = Math.max(c59w.A00, i3);
                }
                A03 = C5AU.A03(j, i2);
                A02 = C5AU.A02(j, i3);
                dru = new DRU(arrayList, 34);
                return c59z.Cgx(AbstractC06930Yk.A0E(), dru, A03, A02);
            }
        }
        dru = c206929Dx;
        return c59z.Cgx(AbstractC06930Yk.A0E(), dru, A03, A02);
    }
}
