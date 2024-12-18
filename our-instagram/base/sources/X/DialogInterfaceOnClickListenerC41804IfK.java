package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.IfK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41804IfK implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC110564yT A01;
    public final /* synthetic */ User A02;

    public DialogInterfaceOnClickListenerC41804IfK(UserSession userSession, ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT, User user) {
        this.A02 = user;
        this.A00 = userSession;
        this.A01 = viewOnAttachStateChangeListenerC110564yT;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        IA6.A00(this.A00, this.A02, MSV.A00(601));
        this.A01.A0R.setEnabled(true);
    }
}
