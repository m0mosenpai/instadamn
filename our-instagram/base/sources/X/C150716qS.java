package X;

import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache;
import com.instagram.common.session.UserSession;

/* renamed from: X.6qS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150716qS {
    public ARDFileCache A00;
    public ARDFileCache A01;
    public final C150526q1 A02;

    public C150716qS(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = C150526q1.A00(userSession);
    }

    public final ARDFileCache A01() {
        ARDFileCache aRDFileCache = this.A00;
        if (aRDFileCache == null) {
            StashARDFileCache A00 = A00(584232554, 50 << 20);
            this.A00 = A00;
            return A00;
        }
        return aRDFileCache;
    }

    public final ARDFileCache A02() {
        ARDFileCache aRDFileCache = this.A01;
        if (aRDFileCache == null) {
            StashARDFileCache A00 = A00(206282182, 50 << 20);
            this.A01 = A00;
            return A00;
        }
        return aRDFileCache;
    }

    public static final StashARDFileCache A00(int i, long j) {
        C1M7 A01 = C1M7.A01();
        C1MC c1mc = new C1MC();
        c1mc.A05 = "<override-ignore>";
        c1mc.A09 = false;
        c1mc.A01 = new C1FB(j, j, j, -1L, false, false);
        return new StashARDFileCache(j, A01.A06(A01.A08(c1mc.A00(), i), i));
    }
}
