package X;

import com.google.common.collect.ImmutableList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: X.1LI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LI {
    public final ImmutableList A00;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1LQ, X.1LT] */
    public final void A00(Callable combiner, Executor executor) {
        ?? c1lt = new C1LT(this.A00, false, false);
        c1lt.A00 = new C25411Lv(c1lt, combiner, executor);
        c1lt.A0C();
    }

    public C1LI(ImmutableList immutableList) {
        this.A00 = immutableList;
    }
}
