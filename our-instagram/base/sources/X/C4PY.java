package X;

import java.util.Iterator;

/* renamed from: X.4PY, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4PY {
    public static final C4PZ A00(C4PX c4px) {
        Object obj;
        Iterator it = c4px.A00.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof C4PZ) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (!(obj instanceof C4PZ)) {
            return null;
        }
        return (C4PZ) obj;
    }

    public static final void A02(C4PZ c4pz) {
        StringBuilder sb = new StringBuilder();
        sb.append("folding_mode_unexpected_");
        W4D w4d = ((WTE) c4pz).A00;
        sb.append(w4d);
        sb.append('_');
        C23099AGl BZe = c4pz.BZe();
        sb.append(BZe);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected folding feature values: state=");
        sb2.append(w4d);
        sb2.append(AbstractC111324zv.A00(281));
        sb2.append(BZe);
        C0w9.A03(obj, sb2.toString());
    }

    public static final C8A3 A01(C4PX c4px) {
        C4PZ A00 = A00(c4px);
        if (A00 != null) {
            W4D w4d = ((WTE) A00).A00;
            if (C14360o3.A0K(w4d, W4D.A02)) {
                C23099AGl BZe = A00.BZe();
                if (C14360o3.A0K(BZe, C23099AGl.A02)) {
                    return C8A3.A02;
                }
                if (C14360o3.A0K(BZe, C23099AGl.A01)) {
                    return C8A3.A04;
                }
                A02(A00);
                return C8A3.A04;
            }
            if (C14360o3.A0K(w4d, W4D.A01)) {
                return C8A3.A03;
            }
            A02(A00);
            return C8A3.A03;
        }
        return null;
    }
}
