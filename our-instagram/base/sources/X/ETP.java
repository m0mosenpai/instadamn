package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public class ETP extends C1P1 {
    public final UserSession A00;
    public final C104024mO A01;
    public final User A02;
    public final String A03;
    public final boolean A04;

    public ETP(UserSession userSession, C104024mO c104024mO, User user, String str, boolean z) {
        this.A00 = userSession;
        this.A02 = user;
        this.A03 = str;
        this.A01 = c104024mO;
        this.A04 = z;
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1542193393);
        C104024mO c104024mO = this.A01;
        if (c104024mO == null) {
            AbstractC129875tr.A00(this.A00).A0E(this.A02);
        } else if ("create".equals(this.A03) && this.A02.A25()) {
            C57582kX.A00(this.A00).A0O(c104024mO);
        }
        C0f9.A0A(1240025993, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-1728454387);
        EDR edr = (EDR) obj;
        int A0N = AbstractC167017dG.A0N(edr, 1360865800);
        if (!this.A04) {
            AbstractC129875tr.A00(this.A00).A0C(edr.A00(), this.A02, this.A03);
        }
        C104024mO c104024mO = this.A01;
        if (c104024mO != null) {
            C57582kX.A00(this.A00).A0O(c104024mO);
        }
        C0f9.A0A(959314683, A0N);
        C0f9.A0A(1246138539, A03);
    }
}
