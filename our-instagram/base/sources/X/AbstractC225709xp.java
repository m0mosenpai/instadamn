package X;

import java.util.List;

/* renamed from: X.9xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225709xp {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Long] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C1LZ.A00();
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0B(A0B, 1);
        C30192DRx c30192DRx = new C30192DRx(A0B, 5);
        List list = c6fw.A00;
        Object obj = list.get(0);
        C6FG c6fg = null;
        c6fg = null;
        try {
            if (obj instanceof Number) {
                c6fg = Long.valueOf(AbstractC166987dD.A0N(obj));
            } else {
                Number number = (Number) obj;
                if (number != null) {
                    c6fg = Long.valueOf(number.longValue());
                }
            }
        } catch (ClassCastException e) {
            AbstractC25241Le.A00(c6fg, "CXF_CPDP", "Error when trying to get the TTL in argument index 0 for action bk.action.cxf.experimental.cpdp.Prefetch", e);
        }
        Object obj2 = list.get(1);
        boolean z = false;
        try {
            if (obj2 instanceof Boolean) {
                z = AbstractC166987dD.A1a(obj2);
            } else {
                Boolean bool = (Boolean) obj2;
                if (bool != null) {
                    z = bool.booleanValue();
                }
            }
        } catch (ClassCastException e2) {
            AbstractC25241Le.A00(null, "CXF_CPDP", "Error when trying to get the exit_view in argument index 1 for action bk.action.cxf.experimental.cpdp.Prefetch", e2);
        }
        c30192DRx.invoke(c6fg, Boolean.valueOf(z));
        return null;
    }
}
