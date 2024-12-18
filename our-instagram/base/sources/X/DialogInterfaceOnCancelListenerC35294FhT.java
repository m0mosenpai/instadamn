package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.FhT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnCancelListenerC35294FhT implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C6WG A00;
    public final /* synthetic */ String A01;

    public DialogInterfaceOnCancelListenerC35294FhT(C6WG c6wg, String str) {
        this.A00 = c6wg;
        this.A01 = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        UserSession userSession = this.A00.A00;
        String str = this.A01;
        C14360o3.A0B(userSession, 0);
        FAR.A00(userSession, "cancel", str);
    }
}
