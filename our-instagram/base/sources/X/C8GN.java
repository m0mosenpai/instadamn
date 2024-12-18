package X;

import java.util.Iterator;

/* renamed from: X.8GN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GN {
    public final /* synthetic */ C8GJ A00;

    public C8GN(C8GJ c8gj) {
        this.A00 = c8gj;
    }

    public final void A00(boolean z) {
        C8GH c8gh = this.A00.A04;
        if (c8gh == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        Iterator it = c8gh.A07.iterator();
        while (it.hasNext()) {
            ((AnonymousClass822) it.next()).onChanged(Boolean.valueOf(z));
        }
    }
}
