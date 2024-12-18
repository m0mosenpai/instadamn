package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3aU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75633aU {
    public final UserSession A00;
    public final C75623aT A01;
    public final C75563aN A02;
    public final C75583aP A03;
    public final C57462kL A04;
    public final boolean A05;

    public C75633aU(UserSession userSession, C75623aT c75623aT, C75563aN c75563aN, C75583aP c75583aP, C57462kL c57462kL) {
        C14360o3.A0B(c75563aN, 1);
        C14360o3.A0B(c75583aP, 2);
        C14360o3.A0B(c75623aT, 3);
        this.A02 = c75563aN;
        this.A03 = c75583aP;
        this.A01 = c75623aT;
        this.A00 = userSession;
        this.A04 = c57462kL;
        this.A05 = AbstractC65492xl.A00(userSession).A0G;
    }

    public final int A00(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(userSession, 2);
        if (this.A05) {
            return Arrays.hashCode(new Object[]{Integer.valueOf(c75113Zb.A2v ? 1 : 0), Integer.valueOf(this.A02.A02(userSession, c38321qM, c75113Zb))});
        }
        return this.A02.A02(userSession, c38321qM, c75113Zb);
    }

    public final C206209Bd A01(Context context, C19260xA c19260xA, C65682y4 c65682y4, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C76293bZ c76293bZ, C75113Zb c75113Zb, Integer num, String str) {
        InterfaceC76863cY A04;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(c76293bZ, 2);
        C57462kL c57462kL = this.A04;
        interfaceC60442pS.getModuleName();
        C76893cb c76893cb = null;
        if (c57462kL.A05(c38321qM) && !c57462kL.A04()) {
            A04 = null;
        } else {
            A04 = this.A02.A04(context, c38321qM, interfaceC60442pS, c76293bZ, c75113Zb, str);
        }
        C206189Bb A00 = C75583aP.A00(context, c38321qM, interfaceC60442pS, this.A03, c75113Zb);
        if (this.A05) {
            C75623aT c75623aT = this.A01;
            if (c75113Zb.A2v) {
                C36274FzR c36274FzR = (C36274FzR) c75623aT.A02.getValue();
                User A2E = c38321qM.A2E(c75623aT.A00);
                if (A2E != null) {
                    C31363DqS c31363DqS = new C31363DqS((List) c36274FzR.A00.get(A2E.getId()));
                    C42675IuW c42675IuW = new C42675IuW(c75113Zb);
                    InterfaceC75603aR interfaceC75603aR = c75623aT.A01;
                    ImmutableList copyOf = ImmutableList.copyOf((Collection) c31363DqS.A00);
                    C14360o3.A07(copyOf);
                    c76893cb = new C76893cb(c75113Zb.A0d, copyOf, c19260xA, c65682y4, c38321qM, c75113Zb, c42675IuW, interfaceC75603aR, num, c31363DqS.A01());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                c76893cb = null;
            }
        }
        return new C206209Bd(7, A04, A00, c76893cb);
    }
}
