package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35337FiE implements DialogInterface.OnClickListener {
    public final /* synthetic */ EnumC33507Erg A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ GXl A02;

    public DialogInterfaceOnClickListenerC35337FiE(EnumC33507Erg enumC33507Erg, UserSession userSession, GXl gXl) {
        this.A01 = userSession;
        this.A00 = enumC33507Erg;
        this.A02 = gXl;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C35241Fga.A01(this.A00, this.A01, "reminder_confirm");
        this.A02.D6t();
    }
}
