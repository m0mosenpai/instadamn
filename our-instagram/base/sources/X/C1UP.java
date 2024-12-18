package X;

import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import com.facebook.common.dextricks.StringTreeSet;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1UP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1UP implements C1UM {
    public static final Object A0D = new Object();
    public static final Handler A0E = new Handler(Looper.getMainLooper());
    public Throwable A00;
    public final int A01;
    public final C1UQ A02;
    public final Thread A04;
    public final Executor A07;
    public final String A09;
    public final CountDownLatch A0B;
    public final Object A03 = new Object();
    public final AtomicBoolean A08 = new AtomicBoolean(false);
    public volatile boolean A0C = false;
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final Map A0A = new HashMap();

    public static synchronized void A04(C1UP c1up, java.util.Set set) {
        synchronized (c1up) {
            Throwable th = new Throwable("commit stack");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                c1up.A06(th, c1up.A0A);
                Map map = (Map) c1up.A06.get(str);
                if (map != null) {
                    c1up.A06(th, map);
                }
            }
            c1up.A00 = null;
        }
    }

    public static RuntimeException A00(C1UP c1up, Exception exc, String str) {
        return new RuntimeException(AnonymousClass001.A0u("LightSharedPreferences threw an exception for Key: ", str, "; Raw file: ", c1up.A02.A00()), exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5 A[Catch: all -> 0x00d9, TRY_LEAVE, TryCatch #5 {all -> 0x00d9, blocks: (B:53:0x00c0, B:55:0x00d5), top: B:52:0x00c0, outer: #2 }] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C1UP r11) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1UP.A02(X.1UP):void");
    }

    public static void A03(C1UP c1up) {
        if (!c1up.A0C) {
            CountDownLatch countDownLatch = c1up.A0B;
            if (countDownLatch.getCount() == 1) {
                StrictMode.noteSlowCall("Blocked on LightSharedPreferences Init");
            }
            String A0R = AnonymousClass001.A0R("LightSharedPreferences.waitIfNotLoaded: ", A01(c1up.A09));
            AbstractC09780fb.A01(A0R.substring(0, Math.min(A0R.length(), StringTreeSet.MAX_SYMBOL_COUNT)), 1141194875);
            while (!c1up.A0C) {
                Thread thread = c1up.A04;
                if (thread != null && thread.getState() != Thread.State.TERMINATED) {
                    int priority = Thread.currentThread().getPriority();
                    synchronized (c1up) {
                        if (priority > thread.getPriority()) {
                            A05(thread, priority);
                        }
                    }
                }
                try {
                    continue;
                    countDownLatch.await();
                    break;
                } catch (InterruptedException unused) {
                }
            }
            AbstractC09780fb.A00(319702124);
        }
    }

    public C1UP(String str, Executor executor, InterfaceC08830cm interfaceC08830cm, int i, boolean z) {
        this.A09 = str;
        this.A02 = new C1UQ(interfaceC08830cm);
        executor.getClass();
        this.A07 = executor;
        this.A01 = i;
        this.A0B = new CountDownLatch(1);
        if (z) {
            A02(this);
            return;
        }
        Thread thread = new Thread(new Runnable() { // from class: X.1UR
            @Override // java.lang.Runnable
            public final void run() {
                C1UP c1up = C1UP.this;
                Thread currentThread = Thread.currentThread();
                currentThread.setPriority(currentThread.getPriority());
                C1UP.A02(c1up);
            }
        }, AnonymousClass001.A0R("LSP-", A01(str)));
        this.A04 = thread;
        A05(thread, Math.max(Thread.currentThread().getPriority() - 1, 1));
        thread.start();
    }

    public static String A01(String str) {
        boolean z;
        StringBuilder sb = new StringBuilder(str.length());
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        boolean z2 = false;
        while (i < length) {
            char c = charArray[i];
            if (c <= '9' && c >= '0') {
                z = true;
                if (!z2) {
                    c = '#';
                } else {
                    i++;
                    z2 = z;
                }
            } else {
                z = false;
            }
            sb.append(c);
            i++;
            z2 = z;
        }
        return sb.toString();
    }

    public static void A05(Thread thread, int i) {
        try {
            thread.setPriority(i);
        } catch (IllegalArgumentException e) {
            if (thread.getState() != Thread.State.TERMINATED) {
                throw new IllegalArgumentException(AnonymousClass001.A07(i, "Failed to set thread priority - thread state:", thread.getState().name(), " priority:"), e);
            }
        }
    }

    private void A06(Throwable th, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            entry.getKey();
            ((Handler) entry.getValue()).post(new TNT(this, th));
        }
    }

    @Override // X.C1UM
    public final C1ZT AR9() {
        A03(this);
        return new C1ZT(this);
    }

    @Override // X.C1UM
    public final HashMap Aax() {
        HashMap hashMap;
        A03(this);
        synchronized (this.A03) {
            hashMap = new HashMap(this.A05);
        }
        return hashMap;
    }

    @Override // X.C1UM
    public final boolean contains(String str) {
        boolean containsKey;
        A03(this);
        synchronized (this.A03) {
            containsKey = this.A05.containsKey(str);
        }
        return containsKey;
    }

    @Override // X.C1UM
    public final boolean getBoolean(String str, boolean z) {
        A03(this);
        synchronized (this.A03) {
            try {
                Boolean bool = (Boolean) this.A05.get(str);
                if (bool != null) {
                    z = bool.booleanValue();
                }
            } catch (ClassCastException e) {
                throw A00(this, e, str);
            }
        }
        return z;
    }

    @Override // X.C1UM
    public final int getInt(String str, int i) {
        A03(this);
        synchronized (this.A03) {
            try {
                Integer num = (Integer) this.A05.get(str);
                if (num != null) {
                    i = num.intValue();
                }
            } catch (ClassCastException e) {
                throw A00(this, e, str);
            }
        }
        return i;
    }

    @Override // X.C1UM
    public final long getLong(String str, long j) {
        A03(this);
        synchronized (this.A03) {
            try {
                Long l = (Long) this.A05.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            } catch (ClassCastException e) {
                throw A00(this, e, str);
            }
        }
        return j;
    }

    @Override // X.C1UM
    public final int getSize() {
        int size;
        A03(this);
        synchronized (this.A03) {
            size = this.A05.size();
        }
        return size;
    }

    @Override // X.C1UM
    public final String getString(String str, String str2) {
        A03(this);
        synchronized (this.A03) {
            try {
                String str3 = (String) this.A05.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } catch (ClassCastException e) {
                throw A00(this, e, str);
            }
        }
        return str2;
    }
}
