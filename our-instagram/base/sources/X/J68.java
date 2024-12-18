package X;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class J68 implements Comparator {
    public final int A00;
    public final Object A01;

    public J68(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = 0;
        C14360o3.A0B(interfaceC16620sF, 1);
        this.A01 = interfaceC16620sF;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Integer valueOf;
        int A0C;
        int i;
        switch (this.A00) {
            case 0:
                return AbstractC166987dD.A0H(((InterfaceC16620sF) this.A01).invoke(obj, obj2));
            case 1:
                AbstractC39459Hbl abstractC39459Hbl = ((C37697GiY) this.A01).A05;
                valueOf = Integer.valueOf(abstractC39459Hbl.A0C((C120985dq) ((C206239Bg) obj).A03));
                A0C = abstractC39459Hbl.A0C((C120985dq) ((C206239Bg) obj2).A03);
                return C2BS.A00(valueOf, Integer.valueOf(A0C));
            default:
                Map map = (Map) this.A01;
                Number A0Q = AbstractC37300Gc1.A0Q(((C154026wB) obj).A05, map);
                if (A0Q != null) {
                    i = A0Q.intValue();
                } else {
                    i = Integer.MAX_VALUE;
                }
                valueOf = Integer.valueOf(i);
                A0C = AbstractC25227BEk.A06(AbstractC37300Gc1.A0Q(((C154026wB) obj2).A05, map), Integer.MAX_VALUE);
                return C2BS.A00(valueOf, Integer.valueOf(A0C));
        }
    }

    public J68(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
