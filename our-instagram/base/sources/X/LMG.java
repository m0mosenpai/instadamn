package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LMG implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C3CS A02;

    public LMG(Activity activity, UserSession userSession, C3CS c3cs) {
        this.A02 = c3cs;
        this.A01 = userSession;
        this.A00 = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(this.A01), "instagram_android_13_notifications_priming_event");
        if (A0f.isSampled()) {
            A0f.AAP("experiment_group", "in_priming_test_v2");
            AbstractC43593JPy.A1J(A0f, "priming_screen_accepted");
        }
        AbstractC43592JPx.A1C(this.A00, C48299LYx.A00, AbstractC111324zv.A00(171));
    }
}
