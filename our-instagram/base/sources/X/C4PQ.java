package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4PQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4PQ implements C4PR {
    public final List A00 = new ArrayList();

    @Override // X.C4PR
    public final C4Pf BOi(String str) {
        List list = this.A00;
        synchronized (list) {
            list.add(str);
        }
        return C4Pf.A00;
    }
}
