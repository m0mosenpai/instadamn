package X;

import android.os.SystemClock;
import android.util.LruCache;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2BV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BV {
    public final C46282Ap A01;
    public final HeroPlayerSetting A02;
    public final AtomicLong A03 = new AtomicLong(SystemClock.elapsedRealtime());
    public final LruCache A04 = new LruCache(3);
    public final LruCache A00 = new LruCache() { // from class: X.2BW
        {
            super(3);
        }

        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            C95794Sn c95794Sn = (C95794Sn) obj2;
            C2QC.A03("entryRemoved, playerId=%d", Long.valueOf(c95794Sn.A0q));
            C2QC.A02(c95794Sn, "removed from pool, evicted = %s, size = %d", Boolean.valueOf(z), Integer.valueOf(size()));
            synchronized (c95794Sn) {
                C95794Sn.A0E(c95794Sn, "Release player", new Object[0]);
                if (c95794Sn.A1E) {
                    C95794Sn.A0E(c95794Sn, "Player already released", new Object[0]);
                } else {
                    C95794Sn.A07(c95794Sn.A0G.obtainMessage(8), c95794Sn);
                    c95794Sn.A0v.Deb(z, false);
                }
            }
        }
    };

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.4Rd] */
    public final void A01(long j, boolean z) {
        Long valueOf = Long.valueOf(j);
        C2QC.A03("id [%d]: Release player", valueOf);
        if (z && j > 0 && A00(j) != null) {
            C95794Sn A00 = A00(j);
            ?? obj = new Object();
            C95844St c95844St = A00.A0v;
            c95844St.Dkr(c95844St.A00.A0q);
            c95844St.A01 = obj;
        }
        this.A00.remove(valueOf);
        C2QC.A03("HeroServicePlayerPool", "releasePlayer HeroServicePlayer[%d] released: %s", valueOf, true);
    }

    public final synchronized boolean A02(String str) {
        boolean z;
        Iterator it = this.A00.snapshot().values().iterator();
        while (true) {
            if (it.hasNext()) {
                C4SS c4ss = ((C95794Sn) it.next()).A15;
                if (c4ss != null && str.equals(c4ss.A0K.A0G)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    public final C95794Sn A00(long j) {
        return (C95794Sn) this.A00.get(Long.valueOf(j));
    }

    public C2BV(C46282Ap c46282Ap, HeroPlayerSetting heroPlayerSetting) {
        this.A02 = heroPlayerSetting;
        this.A01 = c46282Ap;
    }
}
