package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VPa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68392VPa {
    public static final List A00(C6FG c6fg, List list, float f) {
        ArrayList A0i = AbstractC167007dF.A0i(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C102884kP c102884kP = (C102884kP) it.next();
            List<C102884kP> A0N = c102884kP.A0N(38);
            C14360o3.A07(A0N);
            ArrayList A0i2 = AbstractC167007dF.A0i(A0N);
            for (C102884kP c102884kP2 : A0N) {
                A0i2.add(new C69551VrG(c102884kP2.A02(36, 0.0f), AbstractC65702TsY.A0C(c6fg, c102884kP2, 35)));
            }
            String A0G = c102884kP.A0G();
            if (A0G == null) {
                A0G = "";
            }
            String A0F = c102884kP.A0F();
            if (A0F == null) {
                A0F = "";
            }
            A0i.add(new C69281Vkp(A0G, A0F, A0i2, f, AbstractC65702TsY.A0C(c6fg, c102884kP, 140)));
        }
        return A0i;
    }
}
