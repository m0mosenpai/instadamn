package X;

import android.content.Context;
import android.graphics.Rect;
import java.lang.ref.WeakReference;

/* renamed from: X.CyU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29454CyU implements InterfaceC58972mv {
    public final WeakReference A00;

    @Override // X.InterfaceC58972mv
    public final boolean CGl(Rect rect, Rect rect2, Rect rect3) {
        boolean A1b = AbstractC25233BEq.A1b(rect, rect2, rect3);
        InterfaceC1131459c interfaceC1131459c = (InterfaceC1131459c) this.A00.get();
        if (interfaceC1131459c != null && interfaceC1131459c.CQ7()) {
            C114205Dh Chk = AbstractC119495b6.A02(interfaceC1131459c).Chk(interfaceC1131459c, A1b);
            float f = Chk.A01;
            float f2 = Chk.A02;
            if (f < f2) {
                float f3 = Chk.A03;
                float f4 = Chk.A00;
                if (f3 < f4) {
                    rect.set(C1H4.A01(f), C1H4.A01(f3), C1H4.A01(f2), C1H4.A01(f4));
                    if (rect.intersect(rect3)) {
                        int i = rect.left;
                        int i2 = rect.top;
                        long Bxd = interfaceC1131459c.Bxd();
                        rect2.set(i, i2, i + AbstractC25225BEi.A06(Bxd), C119055aN.A00(Bxd) + i2);
                        return A1b;
                    }
                }
            }
            rect.setEmpty();
            rect2.setEmpty();
        }
        return false;
    }

    @Override // X.InterfaceC58972mv
    public final Context getContext() {
        return null;
    }

    public C29454CyU(InterfaceC1131459c interfaceC1131459c) {
        this.A00 = AbstractC25225BEi.A16(interfaceC1131459c);
    }
}
