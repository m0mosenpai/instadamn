package X;

import java.util.Comparator;

/* loaded from: classes9.dex */
public final class PUC implements Comparator {
    public static final PUC A00 = new PUC();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        String pk;
        InterfaceC58171Pqb interfaceC58171Pqb = (InterfaceC58171Pqb) obj;
        InterfaceC58171Pqb interfaceC58171Pqb2 = (InterfaceC58171Pqb) obj2;
        AbstractC167017dG.A1N(interfaceC58171Pqb, interfaceC58171Pqb2);
        long Asb = interfaceC58171Pqb.Asb() - interfaceC58171Pqb2.Asb();
        if (Asb == 0) {
            String pk2 = interfaceC58171Pqb.getPk();
            if (pk2 == null || (pk = interfaceC58171Pqb2.getPk()) == null || (i = pk2.compareTo(pk)) == 0) {
                return interfaceC58171Pqb.hashCode() - interfaceC58171Pqb2.hashCode();
            }
        } else {
            i = -1;
            if (Asb > 0) {
                return 1;
            }
        }
        return i;
    }
}
