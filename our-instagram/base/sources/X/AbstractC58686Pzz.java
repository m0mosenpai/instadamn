package X;

import java.util.List;

/* renamed from: X.Pzz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58686Pzz {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        Object obj = list.get(0);
        AbstractC25225BEi.A1S(obj);
        String str = (String) obj;
        Object obj2 = list.get(1);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            InterfaceC136226Ez A03 = AnonymousClass634.A03(c6fg, "gs");
            if (A03 != null && (A03 instanceof C6Ey)) {
                ((C6Ey) A03).A00.A01(str, obj2);
                return null;
            }
            AbstractC25241Le.A02("BKBloksActionBloksWriteGlobalConsistencyStoreImpl", "Global State Module not found");
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
