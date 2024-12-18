package X;

import com.instagram.common.lispy.lang.BloksScript;
import java.util.ArrayList;

/* renamed from: X.65p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1344365p {
    public static final InterfaceC103384lE A00(C102884kP c102884kP, Object obj, int i) {
        C102964kX c102964kX;
        C14360o3.A0B(obj, 2);
        if (obj instanceof InterfaceC103384lE) {
            return (InterfaceC103384lE) obj;
        }
        if (obj instanceof BloksScript) {
            return ((BloksScript) obj).A00(c102884kP.A01, c102884kP.A0A);
        }
        if (obj instanceof C1344465q) {
            return ((C1344465q) obj).A00;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            C14360o3.A0B(str, 2);
            InterfaceC102974kY interfaceC102974kY = c102884kP.A01;
            if (interfaceC102974kY != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(i));
                c102964kX = new C102964kX(interfaceC102974kY, arrayList);
            } else {
                c102964kX = null;
            }
            return new BloksScript(c102964kX, str, c102884kP.A0A, c102884kP.A04);
        }
        AbstractC25241Le.A02("BloksExpressionParser", AnonymousClass001.A07(i, "Unsupported value type: ", obj.getClass().getName(), " for key: "));
        return null;
    }
}
