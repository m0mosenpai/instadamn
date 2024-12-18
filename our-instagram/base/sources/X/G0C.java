package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G0C implements C11R {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AbstractC32549EUz A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ boolean A03;

    @Override // X.C11R
    public final String getName() {
        return "forceSynchronizeQE";
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 259;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    public G0C(UserSession userSession, AbstractC32549EUz abstractC32549EUz, User user, boolean z) {
        this.A01 = abstractC32549EUz;
        this.A00 = userSession;
        this.A02 = user;
        this.A03 = z;
    }

    @Override // X.C11R
    public final void onFinish() {
        AbstractC32549EUz.A00(this.A00, this.A01, this.A02, this.A03);
    }

    @Override // X.C11R
    public final void run() {
        C18V.A01.A04(this.A00);
    }
}
