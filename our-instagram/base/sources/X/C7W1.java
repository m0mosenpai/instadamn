package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.7W1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7W1 {
    public C80993jT A00;
    public Long A01;
    public final UserSession A02;
    public final C2DS A03;

    public C7W1(UserSession userSession, C2DS c2ds) {
        C14360o3.A0B(c2ds, 2);
        this.A02 = userSession;
        this.A03 = c2ds;
    }

    public final List A00(C2EC c2ec, DirectThreadKey directThreadKey) {
        long j;
        int i;
        C14360o3.A0B(directThreadKey, 0);
        C80993jT c80993jT = this.A00;
        if (c80993jT == null && c2ec != null) {
            c80993jT = c2ec.Av3(this.A02.userId);
            this.A00 = c80993jT;
        }
        if (this.A01 == null && c80993jT != null) {
            C4GV A0P = ((C2DU) this.A03).A0P(directThreadKey);
            if (A0P != null) {
                synchronized (A0P) {
                    UserSession userSession = A0P.A0H;
                    C14360o3.A0B(userSession, 0);
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36318604232628568L)) {
                        i = (int) C18U.A01(c06090Tz, userSession, 36600079209402089L);
                    } else {
                        i = 5;
                    }
                    List list = A0P.A0K;
                    int size = list.size() - i;
                    if (i > 0) {
                        for (int A00 = C4GV.A00(c80993jT, A0P); A00 <= size; A00++) {
                            if (((C83403nh) list.get(A00)).A1i(C08730cb.A00(userSession).A00())) {
                                j = ((C83403nh) list.get(A00)).C8i();
                                break;
                            }
                        }
                    }
                    j = -1;
                }
            } else {
                j = -1;
            }
            this.A01 = Long.valueOf(j);
        }
        return this.A03.Ab7(directThreadKey, false);
    }
}
