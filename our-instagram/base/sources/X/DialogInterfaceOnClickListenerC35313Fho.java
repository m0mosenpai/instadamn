package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fho, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35313Fho implements DialogInterface.OnClickListener {
    public final /* synthetic */ C3BU A00;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        User user;
        C14360o3.A0B(dialogInterface, 0);
        C3BU c3bu = this.A00;
        UserSession userSession = c3bu.A01;
        if (userSession != null && (user = c3bu.A02) != null) {
            AbstractC41775Ier.A0E(userSession, "instagram_shopping_post_onboarding_nux_not_now_button_clicked", user.A03.Bum());
            dialogInterface.dismiss();
        }
    }

    public DialogInterfaceOnClickListenerC35313Fho(C3BU c3bu) {
        this.A00 = c3bu;
    }
}
