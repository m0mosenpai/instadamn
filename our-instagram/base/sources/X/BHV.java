package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BHV {
    public static int A00(InterfaceC1131259a interfaceC1131259a, InterfaceC1127857k interfaceC1127857k, List list, int i) {
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1131659e A0K = AbstractC25235BEs.A0K(list, i2);
            Integer num = C05F.A01;
            A0q.add(new BHW(A0K, num, num));
        }
        return interfaceC1127857k.CpD(C25273BGn.A00(interfaceC1131259a), A0q, AbstractC25231BEo.A0K(i)).getHeight();
    }

    public static int A01(InterfaceC1131259a interfaceC1131259a, InterfaceC1127857k interfaceC1127857k, List list, int i) {
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A0q.add(new BHW((InterfaceC1131659e) list.get(i2), C05F.A01, C05F.A00));
        }
        return interfaceC1127857k.CpD(C25273BGn.A00(interfaceC1131259a), A0q, C5AU.A04(0, Integer.MAX_VALUE, 0, i)).getWidth();
    }

    public static int A02(InterfaceC1131259a interfaceC1131259a, InterfaceC1127857k interfaceC1127857k, List list, int i) {
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A0q.add(new BHW((InterfaceC1131659e) list.get(i2), C05F.A00, C05F.A01));
        }
        return interfaceC1127857k.CpD(C25273BGn.A00(interfaceC1131259a), A0q, AbstractC25231BEo.A0K(i)).getHeight();
    }

    public static int A03(InterfaceC1131259a interfaceC1131259a, InterfaceC1127857k interfaceC1127857k, List list, int i) {
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1131659e A0K = AbstractC25235BEs.A0K(list, i2);
            Integer num = C05F.A00;
            A0q.add(new BHW(A0K, num, num));
        }
        return interfaceC1127857k.CpD(C25273BGn.A00(interfaceC1131259a), A0q, C5AU.A04(0, Integer.MAX_VALUE, 0, i)).getWidth();
    }
}
