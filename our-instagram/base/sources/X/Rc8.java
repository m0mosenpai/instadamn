package X;

import android.content.Context;

/* loaded from: classes10.dex */
public final class Rc8 extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rc8(Context context) {
        super(176, 4, false, false);
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = this.A00;
            AbstractC61800Rtu.A00(context, AbstractC61801Rtv.A00(context).A01);
        } catch (RjE e) {
            C0w9.A07("omvp_tos_display_manager: error communicating tos acceptance to appmanager", e);
            C0K8.A0F("TosNoticeDisplayManager", "Error communicating with appmanager", e);
        }
    }
}
