package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EU7 extends C1P1 {
    public final /* synthetic */ C3CZ A00;

    public EU7(C3CZ c3cz) {
        this.A00 = c3cz;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1322328588);
        super.onFail(abstractC115105If);
        C3CZ c3cz = this.A00;
        boolean z = C3CZ.A0G;
        Context context = c3cz.A01.getContext();
        if (context != null) {
            String string = context.getString(2131956849);
            C193328hC A00 = AbstractC35254Fgn.A00(context);
            A00.A0r(string);
            AbstractC166987dD.A1W(A00);
        }
        C0f9.A0A(-512275002, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(703193743);
        C3CZ c3cz = this.A00;
        boolean z = C3CZ.A0G;
        C69923Cb.A01(c3cz.A01, c3cz.A02);
        C0f9.A0A(-811336339, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-717764865);
        C3CZ c3cz = this.A00;
        boolean z = C3CZ.A0G;
        C69923Cb.A02(c3cz.A01, c3cz.A02);
        C0f9.A0A(1817228693, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1912276608);
        C3DC c3dc = (C3DC) obj;
        int A0N = AbstractC167017dG.A0N(c3dc, -303216686);
        super.onSuccess(c3dc);
        User user = ((C34391FEh) c3dc.F7f()).A00;
        C3CZ c3cz = this.A00;
        boolean z = C3CZ.A0G;
        UserSession userSession = c3cz.A04;
        AbstractC31172DnG.A1R(userSession, user);
        user.A0c(userSession);
        C0f9.A0A(520503742, A0N);
        C0f9.A0A(-693877750, A03);
    }
}
