package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class J2Q implements InterfaceC58009Pnt {
    public final /* synthetic */ IM0 A00;

    public J2Q(IM0 im0) {
        this.A00 = im0;
    }

    @Override // X.InterfaceC58009Pnt
    public final /* bridge */ /* synthetic */ void E1G(Object obj, Object obj2, String str, List list) {
        InterfaceC82443m8 interfaceC82443m8 = (InterfaceC82443m8) obj2;
        C14360o3.A0B(list, 3);
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            C50526MSf c50526MSf = (C50526MSf) it.next();
            if (c50526MSf.A01) {
                i++;
            }
            if (c50526MSf.A00) {
                i2++;
            }
        }
        int size = list.size();
        float f = 0.0f;
        if (size != 0) {
            f = i2 / size;
        }
        if (i == 0 && i2 > 0) {
            IM0 im0 = this.A00;
            im0.A00.A01(new C38638Gyf(interfaceC82443m8, C05F.A01, "EXPLORE_GRID", str, "Vista", null, f, AbstractC166987dD.A0N(im0.A03.invoke())));
        }
    }
}
