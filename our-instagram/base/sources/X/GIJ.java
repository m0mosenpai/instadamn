package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GIJ implements C7K9 {
    public final int A00;
    public final Object A01;

    public GIJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C7K9
    public final void onFail(AbstractC115105If abstractC115105If) {
        switch (this.A00) {
            case 1:
            case 2:
                ((InterfaceC23621Ds) this.A01).resumeWith(null);
                return;
            case 3:
                ((C31815DyZ) this.A01).A04.Egh(C33053EiC.A00);
                return;
            default:
                return;
        }
    }

    @Override // X.C7K9
    public final void onSuccess(User user) {
        switch (this.A00) {
            case 1:
            case 2:
                C14360o3.A0B(user, 0);
                ((InterfaceC23621Ds) this.A01).resumeWith(user);
                return;
            case 3:
                C14360o3.A0B(user, 0);
                ((C31815DyZ) this.A01).A03.Egh(new FJY(user, false));
                return;
            case 4:
            default:
                C14360o3.A0B(user, 0);
                AbstractC31172DnG.A1R((UserSession) this.A01, user);
                return;
            case 5:
                EMO emo = (EMO) this.A01;
                emo.A0E = true;
                if (emo.A04 == null) {
                    UserSession userSession = emo.A01;
                    AbstractC167007dF.A1K(user, userSession);
                    C1ON A02 = AbstractC151506rw.A02(userSession, user.getId(), false);
                    A02.A00 = new C32530EUg(9, emo, user);
                    C1GJ.A03(A02);
                }
                emo.A04 = user;
                EMO.A01(emo);
                return;
        }
    }
}
