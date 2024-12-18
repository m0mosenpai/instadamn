package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fhc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35303Fhc implements DialogInterface.OnClickListener {
    public final /* synthetic */ C143376dc A00;

    public DialogInterfaceOnClickListenerC35303Fhc(C143376dc c143376dc) {
        this.A00 = c143376dc;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        C143376dc c143376dc = this.A00;
        C34979Fb6 c34979Fb6 = C34979Fb6.A00;
        Context context = c143376dc.A00;
        if (context == null) {
            str = "context";
        } else {
            UserSession userSession = c143376dc.A03;
            if (userSession == null) {
                str = "userSession";
            } else {
                C148676mc c148676mc = c143376dc.A02;
                if (c148676mc == null) {
                    str = "audLogging";
                } else {
                    c34979Fb6.A00(context, c148676mc, userSession);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
