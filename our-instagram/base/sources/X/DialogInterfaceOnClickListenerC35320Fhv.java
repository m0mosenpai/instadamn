package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fhv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35320Fhv implements DialogInterface.OnClickListener {
    public final /* synthetic */ FID A00;
    public final /* synthetic */ ELI A01;

    public DialogInterfaceOnClickListenerC35320Fhv(FID fid, ELI eli) {
        this.A01 = eli;
        this.A00 = fid;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ELI eli = this.A01;
        UserSession userSession = eli.A03;
        String id = this.A00.A01.getId();
        String str = eli.A03.userId;
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("child_user_id_key", id);
        A05.putString("main_user_id_key", str);
        AbstractC32319ELj abstractC32319ELj = new AbstractC32319ELj();
        C140966Yy A0r = AbstractC25225BEi.A0r(AbstractC31173DnH.A0J(A05, abstractC32319ELj, eli), eli.A03);
        A0r.A0C = getClass().getCanonicalName();
        A0r.A0E(abstractC32319ELj);
        A0r.A0F(eli, 0);
        A0r.A04();
    }
}
