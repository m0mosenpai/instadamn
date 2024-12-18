package X;

import com.instagram.common.cache.base.CacheKeyGenerator;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HJL extends AbstractRunnableC14200nk {
    public final /* synthetic */ C13P A00;
    public final /* synthetic */ AbstractC12990ll A01;

    @Override // java.lang.Runnable
    public final void run() {
        CacheKeyGenerator cacheKeyGenerator;
        AbstractC12990ll abstractC12990ll = this.A01;
        C18720vz c18720vz = AbstractC12960li.A00;
        C226418s A01 = C226218q.A01(c18720vz);
        A01.A0P(A01.A02, "CDN_CACHE_KEY_LIBRARY_INIT_START");
        if ((abstractC12990ll instanceof UserSession) && (cacheKeyGenerator = (CacheKeyGenerator) abstractC12990ll.A01(CacheKeyGenerator.class, new J7Q(abstractC12990ll, 36))) != null && !cacheKeyGenerator.isInitialized()) {
            C06090Tz c06090Tz = C06090Tz.A05;
            String A04 = C18U.A04(c06090Tz, abstractC12990ll, 36879840493830434L);
            if (C18U.A06(c06090Tz, abstractC12990ll, 36317869793154700L)) {
                cacheKeyGenerator.enableLogging();
            }
            cacheKeyGenerator.initializeKeyGenerator(A04);
        }
        C226418s A012 = C226218q.A01(c18720vz);
        A012.A0P(A012.A02, "CDN_CACHE_KEY_LIBRARY_INIT_END");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJL(C13P c13p, AbstractC12990ll abstractC12990ll) {
        super(1311468058, 3, false, false);
        this.A00 = c13p;
        this.A01 = abstractC12990ll;
    }
}
