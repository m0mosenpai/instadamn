package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WHH implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public WHH(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.A00 != 0) {
            C18920wW c18920wW = (C18920wW) this.A01;
            String str = this.A02;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(2572));
            A00.AAP("visual_style", AbstractC111324zv.A00(185));
            A00.AAP("from", "dialog_tap_outside");
            A00.AAP("shopping_session_id", str);
            A00.Cht();
            return;
        }
        VRC.A00((UserSession) this.A01).A08("promotion_list", AbstractC43591JPw.A00(1398), this.A02, null);
    }
}
