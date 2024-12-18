package X;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.facebook.video.heroplayer.warmup.WarmupPool$4;

/* renamed from: X.2By, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46602By {
    public final C46592Bx A03;
    public final HeroPlayerSetting A05;
    public final InterfaceC459429c A06;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public Handler A00 = null;
    public final LruCache A01 = new LruCache() { // from class: X.2Bz
        {
            super(2);
        }

        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            C46602By.A02((C4ST) obj2, C46602By.this, z);
        }
    };
    public final LruCache A02 = new LruCache() { // from class: X.2C0
        {
            super(1);
        }

        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            C46602By.A02((C4ST) obj2, C46602By.this, z);
        }
    };

    public static C4ST A00(C46602By c46602By, String str) {
        C4ST c4st = (C4ST) c46602By.A01.get(str);
        C4ST c4st2 = (C4ST) c46602By.A02.get(str);
        if (c4st == null && c4st2 != null) {
            if (c46602By.A03.A00.A0c.A00(c4st2.A03) != null) {
                return c4st2;
            }
        }
        return c4st;
    }

    public static C4ST A01(C46602By c46602By, String str) {
        C4ST c4st = (C4ST) c46602By.A01.remove(str);
        C4ST c4st2 = (C4ST) c46602By.A02.remove(str);
        if (c4st == null && c4st2 != null) {
            if (c46602By.A03.A00.A0c.A00(c4st2.A03) != null) {
                return c4st2;
            }
        }
        return c4st;
    }

    public static void A02(C4ST c4st, C46602By c46602By, boolean z) {
        if (z) {
            C459529d c459529d = c46602By.A03.A00;
            c459529d.A0C(new WarmupPool$4(c4st, c459529d, c46602By), c4st.A03);
        }
        c46602By.A06.E1g(c4st, !z);
    }

    public final void A03(final C4ST c4st, String str) {
        this.A01.put(str, c4st);
        long j = c4st.A04;
        if (j > 0 && j != -1) {
            Looper myLooper = Looper.myLooper();
            Handler handler = this.A00;
            if (handler == null) {
                if (myLooper != null) {
                    handler = new Handler(myLooper);
                    this.A00 = handler;
                } else {
                    return;
                }
            }
            handler.postDelayed(new Runnable() { // from class: X.Wu0
                @Override // java.lang.Runnable
                public final void run() {
                    C46602By c46602By = this;
                    C4ST A01 = C46602By.A01(c46602By, c4st.A07);
                    if (A01 != null) {
                        C459529d c459529d = c46602By.A03.A00;
                        c459529d.A0C(new WarmupPool$4(A01, c459529d, c46602By), A01.A03);
                    }
                }
            }, j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[Catch: all -> 0x00e6, TRY_ENTER, TryCatch #1 {all -> 0x00e6, blocks: (B:19:0x0054, B:20:0x0061, B:23:0x0069, B:25:0x007e, B:27:0x0092, B:29:0x00a3, B:32:0x00af, B:33:0x00b3, B:40:0x0082, B:42:0x008a, B:43:0x0057, B:46:0x005d), top: B:17:0x0052, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[Catch: all -> 0x00f0, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:8:0x0020, B:9:0x0022, B:11:0x0029, B:13:0x0034, B:15:0x0038, B:16:0x004a, B:34:0x00b9, B:36:0x00d9, B:37:0x00e2, B:48:0x00e7, B:49:0x00ed, B:51:0x003f, B:19:0x0054, B:20:0x0061, B:23:0x0069, B:25:0x007e, B:27:0x0092, B:29:0x00a3, B:32:0x00af, B:33:0x00b3, B:40:0x0082, B:42:0x008a, B:43:0x0057, B:46:0x005d), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2 A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:8:0x0020, B:9:0x0022, B:11:0x0029, B:13:0x0034, B:15:0x0038, B:16:0x004a, B:34:0x00b9, B:36:0x00d9, B:37:0x00e2, B:48:0x00e7, B:49:0x00ed, B:51:0x003f, B:19:0x0054, B:20:0x0061, B:23:0x0069, B:25:0x007e, B:27:0x0092, B:29:0x00a3, B:32:0x00af, B:33:0x00b3, B:40:0x0082, B:42:0x008a, B:43:0x0057, B:46:0x005d), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0057 A[Catch: all -> 0x00e6, TryCatch #1 {all -> 0x00e6, blocks: (B:19:0x0054, B:20:0x0061, B:23:0x0069, B:25:0x007e, B:27:0x0092, B:29:0x00a3, B:32:0x00af, B:33:0x00b3, B:40:0x0082, B:42:0x008a, B:43:0x0057, B:46:0x005d), top: B:17:0x0052, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A04(X.C459529d r24, X.C122245gK r25) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46602By.A04(X.29d, X.5gK):void");
    }

    public C46602By(C46592Bx c46592Bx, HeroPlayerSetting heroPlayerSetting, InterfaceC459429c interfaceC459429c) {
        this.A05 = heroPlayerSetting;
        this.A03 = c46592Bx;
        this.A06 = interfaceC459429c;
    }
}
