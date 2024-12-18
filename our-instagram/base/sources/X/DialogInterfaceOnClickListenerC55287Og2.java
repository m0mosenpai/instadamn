package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Og2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55287Og2 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public DialogInterfaceOnClickListenerC55287Og2(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                AbstractC55624On9.A01(EnumC201098ur.DECLINE, (UserSession) this.A02, this.A03, null);
                MSY.A1G((InterfaceC57990Pna) this.A01);
                dialogInterface.dismiss();
                return;
            case 1:
                InterfaceC58134Ppx interfaceC58134Ppx = (InterfaceC58134Ppx) this.A01;
                if (interfaceC58134Ppx != null) {
                    interfaceC58134Ppx.getPrimaryCtaAction();
                }
                userSession = ((OIR) this.A02).A00;
                str = this.A03;
                C14360o3.A0B(str, 1);
                str2 = "upsell_primary_button_clicked";
                break;
            case 2:
                InterfaceC58134Ppx interfaceC58134Ppx2 = (InterfaceC58134Ppx) this.A01;
                if (interfaceC58134Ppx2 != null) {
                    interfaceC58134Ppx2.getSecondaryCtaAction();
                }
                userSession = ((OIR) this.A02).A00;
                str = this.A03;
                C14360o3.A0B(str, 1);
                str2 = "upsell_secondary_button_clicked";
                break;
            default:
                C65761Ttc.A02(FDN.A00(AbstractC206099Aq.A00, (UserSession) this.A02), ((C71603Jf) this.A01).A03(0L), "ig_quiet_mode_upsell_enable_flow_dialog_not_now", this.A03);
                dialogInterface.dismiss();
                return;
        }
        C35191Ffj.A00(userSession, str2, str);
    }
}
