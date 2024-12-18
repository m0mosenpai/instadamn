package X;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.8MH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MH implements C8MI {
    public final LinkedHashSet A00 = new LinkedHashSet();

    @Override // X.C8MI
    public final void Da9() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C8MI) it.next()).Da9();
        }
    }
}
