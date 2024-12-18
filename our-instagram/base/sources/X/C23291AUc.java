package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AUc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23291AUc implements C8EC {
    public final List A00;

    public C23291AUc(List list) {
        this.A00 = list;
    }

    @Override // X.C8EC
    public final void AV9(C8EF c8ef, boolean z) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            A1E.add(new C184028Eq(null, (String) it.next(), "", AbstractC06930Yk.A0E()));
        }
        c8ef.D6b(null, A1E);
    }
}
