package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class NNP extends AbstractC52230N9t {
    public final UserSession A00;
    public final DialogInterface.OnDismissListener A01;
    public final AbstractC59962oe A02;
    public final C38321qM A03;

    public NNP(DialogInterface.OnDismissListener onDismissListener, AbstractC59962oe abstractC59962oe, UserSession userSession, C38321qM c38321qM) {
        super(onDismissListener, abstractC59962oe, userSession, c38321qM, "isUpdating");
        this.A02 = abstractC59962oe;
        this.A00 = userSession;
        this.A03 = c38321qM;
        this.A01 = onDismissListener;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(453962196);
        int A032 = C0f9.A03(-2039300790);
        C38321qM c38321qM = super.A00;
        c38321qM.A00 = 0;
        c38321qM.A4L(C05F.A01);
        UserSession userSession = this.A00;
        c38321qM.AEH(userSession);
        User A10 = AbstractC166987dD.A10(userSession);
        A10.A03.Eg3(Integer.valueOf(AbstractC167017dG.A0K(A10.A03.C9r()) + 1));
        AnonymousClass189.A00(userSession).A03(A10);
        C0f9.A0A(-965204429, A032);
        C0f9.A0A(1364862331, A03);
    }
}
