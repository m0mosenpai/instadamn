package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class NNN extends AbstractC52230N9t {
    public final UserSession A00;
    public final C147066ji A01;

    public NNN(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, UserSession userSession, C38321qM c38321qM) {
        super(onDismissListener, fragment, userSession, c38321qM, "isDeleting");
        this.A00 = userSession;
        this.A01 = new C147066ji(userSession, fragment.requireActivity());
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1755980763);
        int A032 = C0f9.A03(1755957368);
        C38321qM c38321qM = super.A00;
        c38321qM.A00 = 1;
        c38321qM.A4L(C05F.A0C);
        UserSession userSession = this.A00;
        c38321qM.AEH(userSession);
        User A10 = AbstractC166987dD.A10(userSession);
        A10.A03.Eg3(Integer.valueOf(AbstractC167017dG.A0K(A10.A03.C9r()) - 1));
        AnonymousClass189.A00(userSession).A03(A10);
        this.A01.A00(null, false);
        C0f9.A0A(-1999145642, A032);
        C0f9.A0A(1692862402, A03);
    }
}
