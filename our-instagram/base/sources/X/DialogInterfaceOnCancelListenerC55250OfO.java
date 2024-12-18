package X;

import android.content.DialogInterface;
import android.webkit.GeolocationPermissions;
import com.instagram.common.session.UserSession;

/* renamed from: X.OfO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnCancelListenerC55250OfO implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public DialogInterfaceOnCancelListenerC55250OfO(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 0:
                ((GeolocationPermissions.Callback) this.A02).invoke(this.A03, false, false);
                return;
            case 1:
                AbstractC55624On9.A01(EnumC201098ur.DECLINE, (UserSession) this.A02, this.A03, null);
                MSY.A1G((InterfaceC57990Pna) this.A01);
                return;
            default:
                UserSession userSession = ((OIR) this.A02).A00;
                String str = this.A03;
                C14360o3.A0B(str, 1);
                C35191Ffj.A00(userSession, "upsell_screen_dismissed", str);
                InterfaceC58134Ppx interfaceC58134Ppx = (InterfaceC58134Ppx) this.A01;
                if (interfaceC58134Ppx != null) {
                    interfaceC58134Ppx.getDismissAction();
                    return;
                }
                return;
        }
    }
}
