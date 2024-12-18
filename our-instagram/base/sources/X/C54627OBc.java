package X;

import android.util.LruCache;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.OBc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54627OBc {
    public final LruCache A00;
    public final AwakeTimeSinceBootClock A01;
    public final Map A02;
    public final UserSession A03;

    public C54627OBc(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A00 = new LruCache(100);
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        this.A01 = awakeTimeSinceBootClock;
        this.A02 = AbstractC166987dD.A1G();
    }
}
