package X;

import android.util.Pair;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2iz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56662iz {
    public final int A00;
    public final int A01;
    public final AbstractC56582ir A02;
    public final AtomicReference A03 = new AtomicReference();

    public final void finalize() {
        Object obj;
        Pair pair = (Pair) this.A03.get();
        if (pair != null && (obj = pair.second) != null) {
            ((C1VO) obj).close();
        }
    }

    public C56662iz(AbstractC56582ir abstractC56582ir, int i, int i2) {
        this.A02 = abstractC56582ir;
        this.A01 = i;
        this.A00 = i2;
    }
}
