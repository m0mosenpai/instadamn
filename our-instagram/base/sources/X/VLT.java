package X;

import java.util.List;

/* loaded from: classes11.dex */
public abstract class VLT {
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        Object obj;
        List list = c6fw.A00;
        C102884kP c102884kP = (C102884kP) list.get(0);
        Object obj2 = list.get(1);
        C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj2;
        Object obj3 = list.get(2);
        C6FG A00 = C103064kh.A00(c6fq, c6fw, 3);
        int A002 = AbstractC102804kH.A00(str);
        if (A002 < 32) {
            Integer valueOf = Integer.valueOf(A002);
            if (c102884kP != null) {
                obj = Integer.valueOf(c102884kP.A05);
            } else {
                obj = "unknown";
            }
            AbstractC25241Le.A02("BKBloksActionComponentSetAttrImpl", String.format(AbstractC111324zv.A00(3587), valueOf, str, obj));
        }
        Object A06 = AnonymousClass634.A06(A00, c102884kP);
        if (A06 == null || !(A06 instanceof C6W2) || !((C6W2) A06).EPu(A00, obj3, A002)) {
            AnonymousClass634.A02(A00).A0G(new C70695WfI(c102884kP.A04), new C67963V4c(A002, obj3));
        }
        return C0eB.A00;
    }
}
