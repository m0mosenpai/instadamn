package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.26y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26y {
    public final List A00;

    public final String A00(AnonymousClass270 anonymousClass270) {
        C14360o3.A0B(anonymousClass270, 0);
        StringBuilder sb = new StringBuilder();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            String ALT = ((InterfaceC453226p) it.next()).ALT(anonymousClass270);
            if (ALT != null) {
                sb.append(ALT);
                sb.append(" ");
            }
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public C26y(List list) {
        this.A00 = list;
    }
}
