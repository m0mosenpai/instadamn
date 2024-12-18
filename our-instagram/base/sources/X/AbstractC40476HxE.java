package X;

import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.HxE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40476HxE {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        HashMap hashMap;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        boolean z = true;
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 1);
        AbstractCollection abstractCollection = (AbstractCollection) c6fw.A00();
        Object obj = c6fw.A00.get(3);
        AbstractC12990ll A0A = C6BQ.A0A((C6FG) A03);
        C14360o3.A0C(A0A, AbstractC111324zv.A00(6));
        UserSession userSession = (UserSession) A0A;
        IDI A04 = C41768Iek.A04(userSession);
        if (abstractCollection != null && obj != null) {
            InterfaceC103384lE interfaceC103384lE = ((C1344465q) obj).A00;
            IDH A032 = C41768Iek.A03(userSession);
            Iterator A13 = AbstractC166997dE.A13(abstractCollection);
            while (A13.hasNext()) {
                String str = (String) AbstractC166997dE.A0l(A13);
                if (A032 == null || (hashMap = A032.A00) == null || !hashMap.containsKey(str)) {
                    if (!new C11L("\\d+").A08(str) || A04 == null) {
                        C6FX c6fx = new C6FX();
                        c6fx.A03(str, 0);
                        AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
                        return null;
                    }
                }
            }
            C6FX c6fx2 = new C6FX();
            c6fx2.A03(null, 0);
            AbstractC25227BEk.A1M(c6fq, c6fx2, interfaceC103384lE);
            return null;
        }
        if (A04 == null) {
            z = false;
        }
        C6FX c6fx3 = new C6FX();
        c6fx3.A03(Boolean.valueOf(z), 0);
        AbstractC25227BEk.A1M(c6fq, c6fx3, A0I);
        return null;
    }
}
