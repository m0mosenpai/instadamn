package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.Cn4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28772Cn4 implements InterfaceC128395r8 {
    public final /* synthetic */ C58K A00;

    public C28772Cn4(C58K c58k) {
        this.A00 = c58k;
    }

    @Override // X.InterfaceC128395r8
    public final Object AEE(InterfaceC1131459c interfaceC1131459c, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ) {
        View A00 = CBO.A00(this.A00);
        long Chn = interfaceC1131459c.Chn(0L);
        C114205Dh c114205Dh = (C114205Dh) interfaceC16820sZ.invoke();
        if (c114205Dh != null) {
            C114205Dh A03 = c114205Dh.A03(Chn);
            A00.requestRectangleOnScreen(new Rect((int) A03.A01, (int) A03.A03, (int) A03.A02, (int) A03.A00), false);
        }
        return C0eB.A00;
    }
}
