package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.2OR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2OR implements InterfaceC13000lm {
    public InterfaceC16820sZ A00;
    public final UserSession A01;

    public C2OR(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public static final void A00(C2OR c2or, Boolean bool, List list) {
        UserSession userSession = c2or.A01;
        User A00 = C08730cb.A00(userSession).A00();
        InterfaceC223716s C45 = A00.A03.C45();
        if (C45 != null) {
            C223616r F2e = C45.F2e();
            Integer num = F2e.A0E;
            String str = F2e.A0G;
            Boolean bool2 = F2e.A01;
            Boolean bool3 = F2e.A02;
            Boolean bool4 = F2e.A03;
            Boolean bool5 = F2e.A04;
            Boolean bool6 = F2e.A05;
            Boolean bool7 = F2e.A06;
            Boolean bool8 = F2e.A07;
            Boolean bool9 = F2e.A08;
            Boolean bool10 = F2e.A09;
            Boolean bool11 = F2e.A0B;
            Boolean bool12 = F2e.A0C;
            Boolean bool13 = F2e.A0D;
            A00.A03.EfB(VP8.A00(F2e, F2e.BMG(), bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool, bool11, bool12, bool13, num, F2e.A0F, str, F2e.A0H, list));
            A00.A0c(userSession);
            EnumC456327x[] values = EnumC456327x.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (AnonymousClass292.A07(userSession, values[i])) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    C461529z.A05();
                    C455127l.A03(userSession).A0T();
                    break;
                }
            }
            if (C461529z.A0A(userSession)) {
                AnonymousClass280.A01.A0A(userSession, EnumC456327x.A0A, 0L);
            }
            C455127l.A03(userSession).A0X(false);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        InterfaceC16820sZ interfaceC16820sZ = this.A00;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        this.A00 = null;
    }
}
