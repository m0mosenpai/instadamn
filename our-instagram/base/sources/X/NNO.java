package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NNO extends AbstractC52230N9t {
    public final UserSession A00;
    public final DialogInterface.OnDismissListener A01;
    public final AbstractC59962oe A02;
    public final C38321qM A03;

    public NNO(DialogInterface.OnDismissListener onDismissListener, AbstractC59962oe abstractC59962oe, UserSession userSession, C38321qM c38321qM) {
        super(onDismissListener, abstractC59962oe, userSession, c38321qM, "isDeleting");
        this.A02 = abstractC59962oe;
        this.A00 = userSession;
        this.A03 = c38321qM;
        this.A01 = onDismissListener;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-937031344);
        int A032 = C0f9.A03(-106077553);
        C38321qM c38321qM = super.A00;
        c38321qM.A00 = 2;
        c38321qM.AEH(this.A00);
        C0f9.A0A(521469954, A032);
        C0f9.A0A(1808879901, A03);
    }
}
