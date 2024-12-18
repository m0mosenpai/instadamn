package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FRl {
    public final C1QT A00;
    public final UserSession A01;

    public FRl(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = C1QS.A00(userSession);
    }

    public final void A04(EnumC33422Ept enumC33422Ept, String str) {
        C14360o3.A0B(str, 1);
        long j = enumC33422Ept.A00;
        if (j != 0) {
            this.A00.flowEndFail(j, str, null);
            enumC33422Ept.A00 = 0L;
        }
    }

    public final void A00(EnumC33422Ept enumC33422Ept, Integer num) {
        long j = enumC33422Ept.A00;
        if (j != 0) {
            this.A00.flowMarkPoint(j, FA8.A00(num));
        }
    }

    public final void A01(EnumC33422Ept enumC33422Ept, Integer num) {
        long j = enumC33422Ept.A00;
        if (j != 0) {
            if (num != null) {
                this.A00.flowMarkPoint(j, FA8.A00(num));
            }
            this.A00.flowEndSuccess(enumC33422Ept.A00);
            enumC33422Ept.A00 = 0L;
        }
    }

    public final void A02(EnumC33422Ept enumC33422Ept, Integer num) {
        C1QT c1qt = this.A00;
        long A00 = c1qt.A00(C05F.A00, enumC33422Ept.A01, enumC33422Ept.A02);
        enumC33422Ept.A00 = A00;
        if (num != null) {
            c1qt.flowMarkPoint(A00, FA8.A00(num));
        }
    }

    public final void A03(EnumC33422Ept enumC33422Ept, String str) {
        long j = enumC33422Ept.A00;
        if (j != 0) {
            this.A00.flowEndCancel(j, str);
            enumC33422Ept.A00 = 0L;
        }
    }

    public final void A05(EnumC33422Ept enumC33422Ept, String str, String str2) {
        long j = enumC33422Ept.A00;
        if (j != 0) {
            this.A00.flowAnnotate(j, str, str2);
        }
    }
}
