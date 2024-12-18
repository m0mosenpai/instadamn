package X;

import java.util.Comparator;

/* loaded from: classes9.dex */
public final /* synthetic */ class PU9 implements Comparator {
    public final /* synthetic */ InterfaceC16660sJ[] A00;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC16660sJ[] interfaceC16660sJArr = this.A00;
        C14360o3.A0B(interfaceC16660sJArr, 0);
        for (InterfaceC16660sJ interfaceC16660sJ : interfaceC16660sJArr) {
            int A00 = C2BS.A00((Comparable) interfaceC16660sJ.invoke(obj), (Comparable) interfaceC16660sJ.invoke(obj2));
            if (A00 != 0) {
                return A00;
            }
        }
        return 0;
    }
}
