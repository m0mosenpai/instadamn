package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G0B implements C11R {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    public G0B(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // X.C11R
    public final String getName() {
        switch (this.A00) {
            case 0:
                return "CreateBusinessAccountOnSuccess";
            case 1:
                return "FacebookLoginOnSuccess";
            default:
                return null;
        }
    }

    @Override // X.C11R
    public final int getRunnableId() {
        switch (this.A00) {
            case 0:
                return 289;
            case 1:
                return 248;
            default:
                return 0;
        }
    }

    @Override // X.C11R
    public final void onFinish() {
        switch (this.A00) {
            case 0:
                C32544EUu.A00((C32544EUu) this.A01, (UserSession) this.A03, (EDQ) this.A02);
                return;
            case 1:
                EU3 eu3 = (EU3) this.A01;
                User user = (User) this.A02;
                EVN evn = eu3.A07;
                if (evn != null) {
                    evn.A00();
                }
                eu3.A01.post(new GOW(eu3, user));
                return;
            default:
                return;
        }
    }

    @Override // X.C11R
    public final void run() {
        C18V.A01.A04((UserSession) this.A03);
    }
}
