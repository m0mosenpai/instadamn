package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.4NP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NP {
    public String A00 = "";
    public List A01 = C16930sl.A00;

    public final C94514Ne A00(String str) {
        Object obj = null;
        Iterator it = this.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C14360o3.A0K(((C94514Ne) next).A02, str)) {
                obj = next;
                break;
            }
        }
        return (C94514Ne) obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ QpToolTipTemplate name: ");
        sb.append(this.A00);
        sb.append(",parameters: ");
        sb.append(this.A01);
        sb.append(" }");
        return sb.toString();
    }
}
