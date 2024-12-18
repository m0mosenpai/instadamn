package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Og0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55285Og0 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public DialogInterfaceOnClickListenerC55285Og0(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = z;
        this.A01 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MP2 mp2;
        Integer num;
        switch (this.A00) {
            case 0:
                AbstractC55032OXr.A02((UserSession) this.A02, this.A03, true);
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 1:
                IllegalArgumentException A12 = AbstractC166987dD.A12(AnonymousClass001.A0c(AbstractC43591JPw.A00(711), " is not supported", i));
                if (i != 0) {
                    if (i == 1) {
                        if (this.A03) {
                            throw A12;
                        }
                    } else {
                        throw A12;
                    }
                } else {
                    if (!((InterfaceC50518MRv) this.A02).CVQ()) {
                        mp2 = (MP2) this.A01;
                        num = C05F.A00;
                    } else if (!this.A03) {
                        mp2 = (MP2) this.A01;
                        num = C05F.A01;
                    }
                    mp2.DWx(num);
                    return;
                }
                mp2 = (MP2) this.A01;
                num = C05F.A0C;
                mp2.DWx(num);
                return;
            case 2:
                C33225ElD.A01((C33225ElD) this.A01, (C36731GHa) this.A02, this.A03, true);
                dialogInterface.dismiss();
                return;
            default:
                C55908Orz c55908Orz = (C55908Orz) this.A02;
                DialogInterface.OnDismissListener onDismissListener = c55908Orz.A00;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                AbstractC54123NwL.A00((C54696ODy) this.A01, "cancel", "dialog", null, this.A03);
                AbstractC54126NwO.A00(c55908Orz.A07).A00();
                return;
        }
    }
}
