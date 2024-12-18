package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3hC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79613hC {
    public final List A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public C79613hC(InterfaceC104994oF interfaceC104994oF) {
        ?? r2;
        List BWD;
        if (interfaceC104994oF != null && (BWD = interfaceC104994oF.BWD()) != null) {
            r2 = new ArrayList();
            Iterator it = BWD.iterator();
            while (it.hasNext()) {
                C9CI A00 = AbstractC39721Hjr.A00((JM5) it.next());
                if (A00 != null) {
                    r2.add(A00);
                }
            }
        } else {
            r2 = C16930sl.A00;
        }
        this.A00 = r2;
    }
}
