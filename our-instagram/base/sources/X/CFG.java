package X;

import com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CFG {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A01;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A02;
        List list = c6fw.A00;
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 2);
        Number number = (Number) list.get(3);
        if (number != null) {
            num = Integer.valueOf(number.intValue());
        } else {
            num = null;
        }
        AbstractC166987dD.A1Z(new BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1(c6fq, A0t, num, str, str2, null, C6DZ.A01(c6fw.A03(4)), C6DZ.A01(c6fw.A03(5))), AbstractC24771Iv.A02(197189788, 3));
        return null;
    }
}
