package X;

import android.util.LruCache;
import com.instagram.fanclub.api.FanClubApi;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156296zz implements InterfaceC13000lm {
    public static final long A04 = TimeUnit.SECONDS.toMillis(60);
    public final LruCache A00;
    public final FanClubApi A01;
    public final java.util.Set A02;
    public final C19L A03;

    public C156296zz(C12N c12n, FanClubApi fanClubApi) {
        C14360o3.A0B(c12n, 2);
        this.A01 = fanClubApi;
        this.A03 = AnonymousClass194.A02(((C12M) c12n).A04);
        this.A00 = new LruCache(50);
        this.A02 = new LinkedHashSet();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.evictAll();
        AnonymousClass194.A05(null, this.A03);
    }
}
