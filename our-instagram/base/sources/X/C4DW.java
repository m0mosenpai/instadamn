package X;

import android.util.LruCache;
import com.instagram.repository.common.MemoryCache;

/* renamed from: X.4DW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4DW extends MemoryCache {
    public final LruCache A00;
    public final InterfaceC09390do A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4DY] */
    public C4DW(int i, long j) {
        super(new Object(), j);
        this.A01 = AbstractC09440dt.A01(new C9GY(j, this, 3));
        this.A00 = new LruCache(i);
    }

    @Override // com.instagram.repository.common.MemoryCache
    public final Object A01(Object obj, Object obj2) {
        Object A01 = super.A01(obj, obj2);
        final C129845to c129845to = (C129845to) this.A01.getValue();
        c129845to.A02.post(new Runnable() { // from class: X.5tp
            @Override // java.lang.Runnable
            public final void run() {
                C129845to c129845to2 = C129845to.this;
                if (!c129845to2.A00) {
                    c129845to2.A00 = true;
                    c129845to2.A02.postDelayed(new RunnableC130315ub(c129845to2), c129845to2.A01);
                }
            }
        });
        return A01;
    }
}
