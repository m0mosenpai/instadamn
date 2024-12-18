package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76953ch {
    public final UserSession A00;
    public final C1M1 A01;

    public static final int A00(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        Integer num = null;
        int i = 0;
        List list = c38321qM.A1Z().A00;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Arrays.hashCode(new Object[]{Boolean.valueOf(((C84923qg) it.next()).A0O)})));
        }
        Object obj = c75113Zb.A3b.A00;
        Integer valueOf = Integer.valueOf(c38321qM.A0w());
        Integer valueOf2 = Integer.valueOf(c38321qM.A0s());
        List ByK = c38321qM.A0C.ByK();
        if (ByK != null) {
            num = Integer.valueOf(ByK.size());
        }
        List ByK2 = c38321qM.A0C.ByK();
        if (ByK2 != null) {
            i = ByK2.hashCode();
        }
        return Arrays.hashCode(new Object[]{arrayList, obj, valueOf, valueOf2, num, Integer.valueOf(i), c38321qM.BqK()});
    }

    public final C206209Bd A01(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        boolean A0E = Systrace.A0E(1L);
        if (A0E) {
            C0fO.A01("SocialContextBubblesRowUseCase#getUiState", 1130721165);
        }
        C206209Bd c206209Bd = new C206209Bd(new C9BH(new C207219Fa(4, this, c38321qM, interfaceC60442pS, c75113Zb), 15), C79343gf.A00.A00(interfaceC60442pS, this.A00, new C79313gc(c38321qM, c75113Zb), C05F.A0N, c75113Zb.getPosition(), false), c75113Zb);
        if (A0E) {
            C0fO.A00(-1532406958);
        }
        return c206209Bd;
    }

    public final boolean A02(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        Integer num;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(interfaceC60442pS, 2);
        C3HM c3hm = C3HM.A00;
        UserSession userSession = this.A00;
        String moduleName = interfaceC60442pS.getModuleName();
        C14360o3.A0B(moduleName, 1);
        if (!C3HM.A02(moduleName) || !c3hm.A05(userSession) || !C18U.A06(C06090Tz.A05, userSession, 36327658023566091L) || !c3hm.A04(userSession)) {
            return false;
        }
        C79343gf c79343gf = C79343gf.A00;
        C79313gc c79313gc = new C79313gc(c38321qM, c75113Zb);
        int position = c75113Zb.getPosition();
        Integer num2 = C05F.A0N;
        C86493tM A00 = c79343gf.A00(interfaceC60442pS, userSession, c79313gc, num2, position, true);
        if (A00 == null || (num = A00.A04) == null || num == num2) {
            return false;
        }
        return true;
    }

    public final boolean A03(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        C3HM c3hm = C3HM.A00;
        UserSession userSession = this.A00;
        if (c3hm.A04(userSession)) {
            C86493tM A00 = C79343gf.A00.A00(interfaceC60442pS, userSession, new C79313gc(c38321qM, c75113Zb), C05F.A0N, c75113Zb.getPosition(), true);
            if (A00 == null || A00.A04 != C05F.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C76953ch(UserSession userSession, C1M1 c1m1) {
        this.A00 = userSession;
        this.A01 = c1m1;
    }
}
