package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LMD implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C3CS A01;

    public LMD(UserSession userSession, C3CS c3cs) {
        this.A01 = c3cs;
        this.A00 = userSession;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(this.A00), "instagram_android_13_notifications_priming_event");
        if (A0f.isSampled()) {
            A0f.AAP("experiment_group", "in_priming_test_v2");
            AbstractC43593JPy.A1J(A0f, "priming_screen_denied");
        }
    }
}
