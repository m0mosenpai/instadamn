package X;

import android.app.Activity;
import android.graphics.Bitmap;

/* loaded from: classes8.dex */
public final class M56 implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C47614L0z A02;

    public M56(Bitmap bitmap, InterfaceC11380iw interfaceC11380iw, C47614L0z c47614L0z) {
        this.A02 = c47614L0z;
        this.A00 = bitmap;
        this.A01 = interfaceC11380iw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47614L0z c47614L0z = this.A02;
        Bitmap bitmap = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        Activity activity = c47614L0z.A00;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            C193328hC A0H = AbstractC31171DnF.A0H(activity);
            A0H.A0i(bitmap, interfaceC11380iw, null);
            A0H.A0A(2131957418);
            A0H.A09(2131957416);
            A0H.A0J(null, 2131957417);
            A0H.A04();
            A0H.A0h(new DialogInterfaceOnShowListenerC48027LMw(c47614L0z, 2));
            AbstractC166987dD.A1W(A0H);
        }
    }
}
