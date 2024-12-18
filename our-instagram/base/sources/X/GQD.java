package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class GQD implements Runnable {
    public final /* synthetic */ G3P A00;
    public final /* synthetic */ C160787Im A01;
    public final /* synthetic */ C83403nh A02;
    public final /* synthetic */ WeakReference A03;

    public GQD(G3P g3p, C160787Im c160787Im, C83403nh c83403nh, WeakReference weakReference) {
        this.A03 = weakReference;
        this.A01 = c160787Im;
        this.A00 = g3p;
        this.A02 = c83403nh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = (Context) this.A03.get();
        if (context != null) {
            C146106i8 A0j = AbstractC25229BEm.A0j();
            A0j.A0H = "translate_message_error";
            AbstractC25226BEj.A1N(context, A0j, 2131959932);
            AbstractC31171DnF.A11(context, A0j, 2131959934);
            AbstractC25233BEq.A1F(A0j);
        }
        this.A01.A0b = false;
        this.A00.A00.BT6().EZ9(C05F.A00, this.A02.A0i(), false);
    }
}
