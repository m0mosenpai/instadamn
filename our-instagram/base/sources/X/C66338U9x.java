package X;

import android.util.LruCache;
import java.io.IOException;

/* renamed from: X.U9x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66338U9x extends LruCache {
    public final /* synthetic */ VKD A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66338U9x(VKD vkd, int i) {
        super(i);
        this.A00 = vkd;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        UMT umt = (UMT) obj;
        InterfaceC92354Bq interfaceC92354Bq = (InterfaceC92354Bq) obj2;
        if (z) {
            try {
                interfaceC92354Bq.close();
            } catch (IOException unused) {
            }
            LruCache lruCache = (LruCache) this.A00.A03.get(umt.A00);
            if (lruCache != null) {
                lruCache.remove(umt);
            }
        }
    }
}
