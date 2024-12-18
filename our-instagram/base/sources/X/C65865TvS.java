package X;

import com.google.gson.Gson;
import com.instagram.autoplay.models.AutoplayConfigRoot;
import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import com.instagram.common.session.UserSession;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.TvS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65865TvS {
    public AutoplayConfigRoot A00;
    public String A01;
    public final Gson A02;
    public final AutoplayLayout A03;
    public final UserSession A04;
    public final InterfaceC09390do A06;
    public final ReentrantReadWriteLock A05 = new ReentrantReadWriteLock();
    public final ReentrantReadWriteLock A07 = new ReentrantReadWriteLock();

    public final AutoplayConfigRoot A00() {
        String string;
        AutoplayConfigRoot autoplayConfigRoot = this.A00;
        if (autoplayConfigRoot == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A07;
            reentrantReadWriteLock.readLock().lock();
            try {
                try {
                    InterfaceC19630xq interfaceC19630xq = (InterfaceC19630xq) this.A06.getValue();
                    if (interfaceC19630xq != null && (string = interfaceC19630xq.getString("last_config_from_server", "")) != null && string.length() != 0) {
                        return (AutoplayConfigRoot) this.A02.A08(string, AutoplayConfigRoot.class);
                    }
                } catch (Exception e) {
                    C0K8.A0F("Autoplay", "SharedPreferences exception", e);
                }
                return null;
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }
        return autoplayConfigRoot;
    }

    public C65865TvS(AutoplayLayout autoplayLayout, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = autoplayLayout;
        C58579Pxx c58579Pxx = new C58579Pxx();
        c58579Pxx.A02(new Object(), AutoplayWhichVideos.class);
        this.A02 = c58579Pxx.A00();
        this.A06 = AbstractC09440dt.A01(new C50162MDp(this, 40));
    }
}
