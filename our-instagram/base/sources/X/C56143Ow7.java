package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ow7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56143Ow7 implements InterfaceC13000lm, InterfaceC220315d {
    public final LruCache A00;
    public final UserSession A01;

    public C56143Ow7(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        AbstractC25061Kk.A00().EDS(this);
        this.A00 = new LruCache(50);
    }

    @Override // X.InterfaceC220315d
    public final void F8d(C1KJ c1kj) {
        LruCache lruCache = this.A00;
        if (lruCache.size() > 0) {
            if (C18U.A06(C06090Tz.A05, this.A01, 36323521969925437L)) {
                lruCache.evictAll();
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.evictAll();
    }
}
