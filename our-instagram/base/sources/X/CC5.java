package X;

import com.facebook.R;
import java.util.AbstractMap;

/* loaded from: classes5.dex */
public abstract class CC5 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, AbstractC111324zv.A00(38));
        long A0N = AbstractC166987dD.A0N(A02);
        boolean A01 = C6DZ.A01(c6fw.A00());
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A03(3)).A00;
        Object A03 = c6fw.A03(4);
        AbstractC25225BEi.A1S(A03);
        String str = (String) A03;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            CUH cuh = new CUH(new CS2(c6fq, interfaceC103384lE, str, AbstractC25225BEi.A16(c6fg)), A0N, A01);
            cuh.A01 = false;
            cuh.A03.postDelayed(cuh.A05, cuh.A02);
            AbstractMap abstractMap = (AbstractMap) c6fg.A00(R.id.bk_context_key_timers);
            CUH cuh2 = (CUH) abstractMap.get(str);
            if (cuh2 != null) {
                cuh2.A00();
                AbstractC25241Le.A02("BloksTimer", AnonymousClass001.A0g("Timer with id ", str, " already exists. Overwriting previous timer."));
            }
            abstractMap.put(str, cuh);
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
