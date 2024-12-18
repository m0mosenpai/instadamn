package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fhq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35315Fhq implements DialogInterface.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC126195nG A00;

    public DialogInterfaceOnClickListenerC35315Fhq(ViewOnClickListenerC126195nG viewOnClickListenerC126195nG) {
        this.A00 = viewOnClickListenerC126195nG;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ViewOnClickListenerC126195nG viewOnClickListenerC126195nG = this.A00;
        User user = viewOnClickListenerC126195nG.A00;
        if (user != null) {
            C1GL c1gl = viewOnClickListenerC126195nG.A05;
            C34974Faz c34974Faz = AbstractC34375FDr.A00;
            UserSession userSession = viewOnClickListenerC126195nG.A04;
            InterfaceC11380iw interfaceC11380iw = viewOnClickListenerC126195nG.A03;
            Integer num = C05F.A0N;
            C1ON A01 = c34974Faz.A01(interfaceC11380iw, userSession, num, AbstractC166987dD.A1E(), AbstractC166987dD.A1J(user.getId()));
            A01.A00 = new C32530EUg(2, user, viewOnClickListenerC126195nG);
            c1gl.schedule(A01);
            viewOnClickListenerC126195nG.A01 = num;
            ViewOnClickListenerC126195nG.A01(viewOnClickListenerC126195nG);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
