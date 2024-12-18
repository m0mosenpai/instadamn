package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.OfN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnCancelListenerC55249OfN implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public DialogInterfaceOnCancelListenerC55249OfN(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = z;
        this.A02 = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        UserSession userSession;
        int i = this.A00;
        AbstractC54123NwL.A00((C54696ODy) this.A01, "cancel", "dialog", null, this.A03);
        Object obj = this.A02;
        if (i != 0) {
            userSession = ((C55908Orz) obj).A07;
        } else {
            userSession = (UserSession) obj;
        }
        AbstractC54126NwO.A00(userSession).A00();
    }
}
