package X;

import android.app.Activity;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ETB extends C1P1 {
    public final /* synthetic */ C684436h A00;
    public final /* synthetic */ C34670FPf A01;
    public final /* synthetic */ User A02;

    public ETB(C684436h c684436h, C34670FPf c34670FPf, User user) {
        this.A02 = user;
        this.A00 = c684436h;
        this.A01 = c34670FPf;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(751735328);
        C34670FPf c34670FPf = this.A01;
        if (c34670FPf != null) {
            c34670FPf.A00();
        }
        C9GR.A07(this.A00.A00, 2131961880);
        C0f9.A0A(1466057573, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-235185334);
        int A032 = C0f9.A03(717320608);
        User user = this.A02;
        user.A17(true);
        C08730cb c08730cb = C17060sy.A01;
        C684436h c684436h = this.A00;
        C17P A0T = AbstractC31171DnF.A0T(c684436h.A01, c08730cb);
        Integer Afv = A0T.Afv();
        int i = 1;
        if (Afv != null) {
            i = Afv.intValue() + 1;
        }
        A0T.EQG(Integer.valueOf(i));
        if (this.A01 == null) {
            Activity activity = c684436h.A00;
            String A0r = AbstractC166997dE.A0r(activity.getResources(), user.getUsername(), 2131952462);
            C14360o3.A07(A0r);
            C9GR.A09(activity, A0r);
        }
        C0f9.A0A(-747509933, A032);
        C0f9.A0A(-149070217, A03);
    }
}
