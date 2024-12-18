package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fi5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35328Fi5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C6WG A00;
    public final /* synthetic */ String A01;

    public DialogInterfaceOnClickListenerC35328Fi5(C6WG c6wg, String str) {
        this.A00 = c6wg;
        this.A01 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A00.A00;
        String str = this.A01;
        C14360o3.A0B(userSession, 0);
        FAR.A00(userSession, "cancel", str);
    }
}
