package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.N0g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52032N0g extends AbstractC55776Opl {
    public final /* synthetic */ AtomicReference A00;

    @Override // X.XES
    public final void D6f(List list) {
        C14360o3.A0B(list, 0);
        if (list.size() == 1) {
        } else {
            throw AbstractC166987dD.A14("we should have exactly one result");
        }
    }

    @Override // X.XES
    public final /* bridge */ /* synthetic */ void DEg(C70129W5q c70129W5q, Object obj) {
        C14360o3.A0B(obj, 0);
        this.A00.set(obj);
    }

    public C52032N0g(AtomicReference atomicReference) {
        this.A00 = atomicReference;
    }
}
