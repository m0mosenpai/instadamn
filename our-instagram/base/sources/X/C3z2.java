package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3z2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3z2 {
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

    public final C9BW A01(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        boolean A0E = Systrace.A0E(1L);
        if (A0E) {
            C0fO.A01("TestimonialRowUseCase#getUiState", -1020534509);
        }
        C9BW c9bw = new C9BW(20, c38321qM.A1N(), new C9BH(new C9FY(13, c75113Zb, this, c38321qM, interfaceC60442pS), 16));
        if (A0E) {
            C0fO.A00(-102977985);
        }
        return c9bw;
    }

    public C3z2(UserSession userSession, C1M1 c1m1) {
        this.A00 = userSession;
        this.A01 = c1m1;
    }
}
