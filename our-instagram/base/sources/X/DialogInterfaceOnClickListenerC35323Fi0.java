package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fi0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35323Fi0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ EnumC33507Erg A00;
    public final /* synthetic */ UserSession A01;

    public DialogInterfaceOnClickListenerC35323Fi0(EnumC33507Erg enumC33507Erg, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = enumC33507Erg;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C35241Fga.A01(this.A00, this.A01, "reminder_cancel");
    }
}
