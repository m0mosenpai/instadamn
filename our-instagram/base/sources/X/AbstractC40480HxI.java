package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.HxI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40480HxI {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        HashMap A1G;
        IDH idh;
        HashMap hashMap;
        Number number;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        Object A032 = c6fw.A03(1);
        AbstractC25225BEi.A1S(A032);
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A00()).A00;
        int A0D = AbstractC25230BEn.A0D(c6fw.A03(3), "null cannot be cast to non-null type kotlin.Number");
        AbstractC12990ll A0A = C6BQ.A0A((C6FG) A03);
        C14360o3.A0C(A0A, AbstractC111324zv.A00(6));
        UserSession userSession = (UserSession) A0A;
        long currentTimeMillis = System.currentTimeMillis();
        long j = A0D * 1000;
        IDH A033 = C41768Iek.A03(userSession);
        if (A033 != null && (hashMap = A033.A00) != null && (number = (Number) hashMap.get(A032)) != null) {
            long longValue = currentTimeMillis - number.longValue();
            if (0 <= j && j < longValue) {
                C6FX c6fx = new C6FX();
                c6fx.A03(true, 0);
                c6fx.A03(Long.valueOf(longValue / 1000), 1);
                AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
            } else {
                C6FX c6fx2 = new C6FX();
                c6fx2.A03(false, 0);
                c6fx2.A03(Long.valueOf(longValue / 1000), 1);
                AbstractC25227BEk.A1M(c6fq, c6fx2, interfaceC103384lE);
                return null;
            }
        } else {
            C6FX c6fx3 = new C6FX();
            c6fx3.A03(true, 0);
            c6fx3.A03(null, 1);
            AbstractC25227BEk.A1M(c6fq, c6fx3, interfaceC103384lE);
            if (A033 == null) {
                Object obj = new Object();
                A1G = AbstractC166987dD.A1G();
                idh = obj;
                A1G.put(A032, Long.valueOf(currentTimeMillis));
                idh.A00 = A1G;
                C41768Iek.A06(userSession, idh);
                return null;
            }
        }
        A1G = A033.A00;
        idh = A033;
        if (A1G == null) {
            A1G = AbstractC166987dD.A1G();
            idh = A033;
        }
        A1G.put(A032, Long.valueOf(currentTimeMillis));
        idh.A00 = A1G;
        C41768Iek.A06(userSession, idh);
        return null;
    }
}
