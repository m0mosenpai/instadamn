package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;

/* renamed from: X.PUg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57093PUg implements InterfaceC09250da, InterfaceC16610sE {
    public final int A00;
    public final Object A01;

    public C57093PUg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16610sE
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A00) {
            case 0:
                C8NW c8nw = (C8NW) ((C183688Ct) this.A01).A1h.get();
                c8nw.A1G((Drawable) obj2, (C148276lx) obj3, (C23108AGw) obj);
                return null;
            case 1:
                ((Fragment) this.A01).onActivityResult(AbstractC166987dD.A0H(obj), AbstractC166987dD.A0H(obj2), (Intent) obj3);
                return C0eB.A00;
            default:
                C3G7 c3g7 = (C3G7) this.A01;
                C41551w4 c41551w4 = (C41551w4) obj;
                int A0H = AbstractC166987dD.A0H(obj2);
                String str = (String) obj3;
                AbstractC167017dG.A1O(c41551w4, str);
                return c3g7.A04(c41551w4.A0H, str, A0H);
        }
    }
}
