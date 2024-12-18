package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class BMC {
    public final C104234ml A00;
    public final UserSession A01;

    public final C5QE A00(C38321qM c38321qM) {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList A3M = c38321qM.A3M();
        if (A3M != null) {
            arrayList.addAll(A3M);
        }
        ArrayList A3Q = c38321qM.A3Q();
        if (A3Q != null && (!A3Q.isEmpty())) {
            UserSession userSession = this.A01;
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                str = A2E.getId();
            } else {
                str = null;
            }
            if ((C2TN.A05(userSession, str) && !C18U.A06(C06090Tz.A06, userSession, 36321069543793782L)) || C18U.A06(C06090Tz.A05, userSession, 36321069543531634L)) {
                arrayList.addAll(A3Q);
            }
        }
        String str2 = "";
        if (!arrayList.isEmpty()) {
            com.instagram.tagging.model.Tag tag = (com.instagram.tagging.model.Tag) AbstractC001800i.A0J(arrayList);
            if (tag != null) {
                if (tag instanceof PeopleTag) {
                    str2 = ((PeopleTag) tag).A00.A04;
                } else if (tag instanceof FBUserTag) {
                    str2 = ((FBUserTag) tag).A02.A01;
                }
            }
            if (arrayList.size() == 1) {
                C14360o3.A0A(str2);
            } else {
                return new BHS(new Object[]{String.valueOf(arrayList.size())}, 2131969518);
            }
        }
        return MVZ.A00(str2);
    }

    public /* synthetic */ BMC(UserSession userSession) {
        C104234ml A03 = C27S.A00().A03();
        C14360o3.A0B(A03, 2);
        this.A01 = userSession;
        this.A00 = A03;
    }
}
