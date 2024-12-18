package X;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6TK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6TK {
    public RunnableFuture A01;
    public final AtomicInteger A02 = new AtomicInteger(-1);
    public C6AV A00 = null;

    public C6TK(final C6FG c6fg, final C136326Fl c136326Fl, final C6AV c6av, final Map map) {
        this.A01 = new FutureTask(new Callable() { // from class: X.6TL
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AbstractC136356Fo.A00(C6FG.this, c136326Fl, c6av, map);
            }
        });
    }
}
