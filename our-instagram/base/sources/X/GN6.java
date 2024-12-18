package X;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes6.dex */
public final class GN6 implements Runnable {
    public final /* synthetic */ Context A00;

    public GN6(Context context) {
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00;
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || context == null) {
            return;
        }
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131961880);
        A0I.A09(2131968430);
        AbstractC31176DnK.A17(null, A0I, 2131960994);
    }
}
