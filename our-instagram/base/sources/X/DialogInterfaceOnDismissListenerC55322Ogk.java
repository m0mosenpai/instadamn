package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ogk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnDismissListenerC55322Ogk implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DialogInterfaceOnDismissListenerC55322Ogk(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 0:
                ((XCV) this.A01).DsW();
                ((C69608VsB) this.A02).A00 = null;
                return;
            case 1:
                ((C07T) this.A01).A0A((C07W) this.A02);
                LL7.A00 = null;
                return;
            case 2:
                if (((C14510oO) this.A01).A00) {
                    return;
                }
                C55196Oe3.A04((C55196Oe3) this.A02, "DISMISSAL");
                return;
            case 3:
                ((InterfaceC55362gb) this.A02).Dcp((C4NJ) this.A01);
                return;
            case 4:
                if (((C14510oO) this.A01).A00) {
                    return;
                }
                C50685MZd.A00((C50685MZd) this.A02).A06(NVX.A00);
                return;
            case 5:
                MSY.A1G((InterfaceC57990Pna) this.A01);
                UserSession userSession = (UserSession) this.A02;
                if (!C18U.A06(C06090Tz.A06, userSession, 36312376529650754L)) {
                    return;
                }
                AbstractC167007dF.A18(AbstractC166987dD.A0x(userSession), "upsells_cancel_count_for_link_switcher", AbstractC166987dD.A0x(userSession).getInt("upsells_cancel_count_for_link_switcher", 0) + 1);
                return;
            default:
                if (!((C14510oO) this.A01).A00) {
                    C145356gu c145356gu = (C145356gu) this.A02;
                    c145356gu.A0B = false;
                    c145356gu.A0F.EJJ();
                    return;
                }
                return;
        }
    }
}
