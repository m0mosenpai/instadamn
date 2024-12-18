package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ofz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55284Ofz implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C84923qg A01;
    public final /* synthetic */ boolean A02;

    public DialogInterfaceOnClickListenerC55284Ofz(UserSession userSession, C84923qg c84923qg, boolean z) {
        this.A02 = z;
        this.A00 = userSession;
        this.A01 = c84923qg;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A02) {
            OOJ.A00(this.A00, this.A01, "cancel_unhide");
        }
        dialogInterface.dismiss();
    }
}
