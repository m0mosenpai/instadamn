package X;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WhJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70803WhJ implements InterfaceC13000lm {
    public final InterfaceC200458to A00;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        ConcurrentMapC200188tN concurrentMapC200188tN = ((C200448tn) this.A00).A00;
        C14360o3.A07(concurrentMapC200188tN);
        Iterator A14 = AbstractC166997dE.A14(concurrentMapC200188tN);
        while (A14.hasNext()) {
            Bitmap bitmap = (Bitmap) AbstractC31176DnK.A0j(A14);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        concurrentMapC200188tN.clear();
    }

    public C70803WhJ() {
        C200148tJ c200148tJ = new C200148tJ();
        c200148tJ.A01(25L);
        c200148tJ.A02(10L, TimeUnit.MINUTES);
        C70560Wct c70560Wct = C70560Wct.A00;
        C18C.A0F(AbstractC25229BEm.A1Z(c200148tJ.A05));
        c70560Wct.getClass();
        c200148tJ.A05 = c70560Wct;
        this.A00 = c200148tJ.A00();
    }
}
