package X;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public abstract class S4C {
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Object A02 = c6fw.A02();
            C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
            String A0n = AbstractC31176DnK.A0n(c6fw, "null cannot be cast to non-null type kotlin.String");
            List list = c6fw.A00;
            String A0s = AbstractC31173DnH.A0s(list, 3);
            String A0s2 = AbstractC31173DnH.A0s(list, 4);
            String A0s3 = AbstractC31173DnH.A0s(list, 5);
            List list2 = (List) list.get(6);
            String A0o = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 7);
            Object A03 = c6fw.A03(8);
            C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            Map map = (Map) list.get(9);
            InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 10);
            InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 11);
            list.get(12);
            Context context = c6fg.A00;
            C63174SeZ A04 = C2FP.A04();
            C14360o3.A07(A04);
            SPP spp = new SPP(context, A04, new C62559SGk(c6fq, A0I, A0I2), (String) A02, A0n, A0s, A0s2, A0s3, A0o, list2, (Map) A03, map);
            HashMap A1G = AbstractC166987dD.A1G();
            String str = spp.A04;
            A1G.put("PAYMENT_TYPE", str);
            A1G.put("SESSION_ID_LOGGING_KEY", spp.A05);
            java.util.Set emptySet = Collections.emptySet();
            C63174SeZ c63174SeZ = spp.A01;
            T3Z A00 = AbstractC63063Sbk.A00(new C64192T3b(c63174SeZ.A01, 1), emptySet);
            String A0p = AbstractC25231BEo.A0p();
            HashSet A01 = AbstractC63063Sbk.A01(Collections.emptySet());
            C63001SaP c63001SaP = new C63001SaP(null, null, null, null, str, A0p);
            SX5 sx5 = c63174SeZ.A02;
            sx5.A03.put(c63001SaP, new T3R(spp));
            SZ5 A022 = c63174SeZ.A02(T3X.A00, new SJ1(null, null, null, null, str, A0p, A1G), A00);
            Executor mainExecutor = spp.A00.getMainExecutor();
            C14360o3.A07(mainExecutor);
            mainExecutor.execute(new TR3(spp, c63001SaP, A022, A01, mainExecutor));
            return C0eB.A00;
        }
        throw AbstractC166997dE.A0g();
    }
}
