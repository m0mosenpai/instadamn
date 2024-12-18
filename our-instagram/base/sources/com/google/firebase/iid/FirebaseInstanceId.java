package com.google.firebase.iid;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58434PvD;
import X.C5KS;
import X.C61240Rjc;
import X.C62505SEh;
import X.C62718SNi;
import X.C62917SWy;
import X.C62948SYq;
import X.C63301Sh5;
import X.C63342Shx;
import X.C63377Sip;
import X.C64264T6n;
import X.C64437TDv;
import X.InterfaceC65423Tju;
import X.MSW;
import X.MSZ;
import X.RunnableC64706TQn;
import X.SC6;
import X.SMX;
import X.SW7;
import X.SWO;
import X.SWW;
import X.TVI;
import X.ThreadFactoryC58412Puq;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class FirebaseInstanceId {
    public static C62948SYq A08;
    public static ScheduledExecutorService A09;
    public static final long A0A = TimeUnit.HOURS.toSeconds(8);
    public C62917SWy A00;
    public boolean A01;
    public final C63342Shx A02;
    public final SMX A03;
    public final C63301Sh5 A04;
    public final C62505SEh A05;
    public final SWO A06;
    public final Executor A07;

    public static final synchronized void A03(FirebaseInstanceId firebaseInstanceId) {
        synchronized (firebaseInstanceId) {
            if (!firebaseInstanceId.A01) {
                firebaseInstanceId.A07(0L);
            }
        }
    }

    public final synchronized void A06() {
        A08.A01();
        if (this.A03.A00()) {
            A03(this);
        }
    }

    public final synchronized void A07(long j) {
        A04(new RunnableC64706TQn(this, this.A06, Math.min(Math.max(30L, j << 1), A0A)), j);
        this.A01 = true;
    }

    public FirebaseInstanceId(C63342Shx c63342Shx, C64437TDv c64437TDv, SW7 sw7) {
        boolean A1W;
        C63342Shx.A01(c63342Shx);
        Context context = c63342Shx.A00;
        C63301Sh5 c63301Sh5 = new C63301Sh5(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = TVI.A00;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), threadFactory);
        this.A01 = false;
        if (C63301Sh5.A01(c63342Shx) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (A08 == null) {
                    C63342Shx.A01(c63342Shx);
                    A08 = new C62948SYq(context);
                }
            }
            this.A02 = c63342Shx;
            this.A04 = c63301Sh5;
            C62917SWy c62917SWy = this.A00;
            if (c62917SWy == null) {
                C63342Shx.A01(c63342Shx);
                c62917SWy = (C62917SWy) c63342Shx.A02.A03(C62917SWy.class);
                c62917SWy = (c62917SWy == null || c62917SWy.A01.A03() == 0) ? new C62917SWy(c63342Shx, c63301Sh5, sw7, threadPoolExecutor) : c62917SWy;
                this.A00 = c62917SWy;
            }
            this.A00 = c62917SWy;
            this.A07 = threadPoolExecutor2;
            this.A06 = new SWO(A08);
            SMX smx = new SMX(c64437TDv, this);
            this.A03 = smx;
            this.A05 = new C62505SEh(threadPoolExecutor);
            if (smx.A00()) {
                if (!A08(A00(C63301Sh5.A01(this.A02), "*"))) {
                    SWO swo = this.A06;
                    synchronized (swo) {
                        A1W = AbstractC167007dF.A1W(SWO.A00(swo));
                    }
                    if (!A1W) {
                        return;
                    }
                }
                A03(this);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static SWW A00(String str, String str2) {
        SWW sww;
        SWW sww2;
        C62948SYq c62948SYq = A08;
        synchronized (c62948SYq) {
            SharedPreferences sharedPreferences = c62948SYq.A01;
            StringBuilder A15 = AbstractC58320PtC.A15(str2, AbstractC58319PtB.A05("") + 4 + AbstractC58319PtB.A05(str));
            A15.append("");
            A15.append("|T|");
            A15.append(str);
            sww = null;
            String string = sharedPreferences.getString(MSZ.A0u("|", str2, A15), null);
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        JSONObject A17 = AbstractC58318PtA.A17(string);
                        sww2 = new SWW(A17.getString("token"), A17.getString("appVersion"), A17.getLong("timestamp"));
                    } catch (JSONException e) {
                        String valueOf = String.valueOf(e);
                        Log.w("FirebaseInstanceId", MSZ.A0u("Failed to parse token: ", valueOf, AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 23)));
                    }
                } else {
                    sww2 = new SWW(string, null, 0L);
                }
                sww = sww2;
            }
        }
        return sww;
    }

    public static final Object A01(C5KS c5ks, FirebaseInstanceId firebaseInstanceId) {
        try {
            return AbstractC58434PvD.A01(c5ks, TimeUnit.MILLISECONDS, 30000L);
        } catch (InterruptedException | TimeoutException unused) {
            throw MSW.A0y("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    firebaseInstanceId.A06();
                    throw cause;
                }
                throw cause;
            }
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            throw new IOException(e);
        }
    }

    public static String A02() {
        C62718SNi c62718SNi;
        C63377Sip c63377Sip;
        Context context;
        C61240Rjc e;
        File A04;
        C62948SYq c62948SYq = A08;
        synchronized (c62948SYq) {
            Map map = c62948SYq.A03;
            c62718SNi = (C62718SNi) map.get("");
            if (c62718SNi == null) {
                try {
                    c63377Sip = c62948SYq.A02;
                    context = c62948SYq.A00;
                    e = null;
                    try {
                        A04 = C63377Sip.A04(context);
                    } catch (C61240Rjc e2) {
                        e = e2;
                    }
                } catch (C61240Rjc unused) {
                    Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                    getInstance(C63342Shx.A00()).A06();
                    c62718SNi = c62948SYq.A02.A07(c62948SYq.A00);
                }
                try {
                    if (A04.exists()) {
                        try {
                            c62718SNi = C63377Sip.A02(A04);
                        } catch (C61240Rjc | IOException e3) {
                            AbstractC58320PtC.A1L("FirebaseInstanceId", e3);
                            try {
                                c62718SNi = C63377Sip.A02(A04);
                            } catch (IOException e4) {
                                String valueOf = String.valueOf(e4);
                                Log.w("FirebaseInstanceId", MSZ.A0u("IID file exists, but failed to read from it: ", valueOf, AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 45)));
                                throw new Exception(e4);
                            }
                        }
                        C63377Sip.A06(context, c62718SNi);
                        map.put("", c62718SNi);
                    }
                    c62718SNi = C63377Sip.A01(context.getSharedPreferences("com.google.android.gms.appid", 0));
                    if (c62718SNi != null) {
                        C63377Sip.A00(context, c62718SNi, false);
                    } else if (e == null) {
                        c62718SNi = c63377Sip.A07(context);
                    } else {
                        throw e;
                    }
                    map.put("", c62718SNi);
                } catch (C61240Rjc e5) {
                    throw e5;
                }
            }
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(c62718SNi.A01.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused2) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public static void A04(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            ScheduledExecutorService scheduledExecutorService = A09;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC58412Puq("FirebaseInstanceId"));
                A09 = scheduledExecutorService;
            }
            scheduledExecutorService.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static FirebaseInstanceId getInstance(C63342Shx c63342Shx) {
        C63342Shx.A01(c63342Shx);
        return (FirebaseInstanceId) c63342Shx.A02.A03(FirebaseInstanceId.class);
    }

    public final boolean A08(SWW sww) {
        if (sww != null) {
            String A05 = this.A04.A05();
            if (System.currentTimeMillis() <= sww.A00 + SWW.A03 && A05.equals(sww.A02)) {
                return false;
            }
        }
        return true;
    }

    public final String A05(final String str, final String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
                str2 = "*";
            }
            C5KS A0Y = AbstractC58319PtB.A0Y(null);
            Executor executor = this.A07;
            InterfaceC65423Tju interfaceC65423Tju = new InterfaceC65423Tju(this, str, str2) { // from class: X.T6m
                public final FirebaseInstanceId A00;
                public final String A01;
                public final String A02;

                {
                    this.A00 = this;
                    this.A01 = str;
                    this.A02 = str2;
                }

                @Override // X.InterfaceC65423Tju
                public final Object Eq5(C5KS c5ks) {
                    C5KS c5ks2;
                    FirebaseInstanceId firebaseInstanceId = this.A00;
                    String str3 = this.A01;
                    String str4 = this.A02;
                    String A02 = FirebaseInstanceId.A02();
                    SWW A00 = FirebaseInstanceId.A00(str3, str4);
                    if (!firebaseInstanceId.A08(A00)) {
                        return AbstractC58319PtB.A0Y(new SC6(A00.A01));
                    }
                    C62505SEh c62505SEh = firebaseInstanceId.A05;
                    synchronized (c62505SEh) {
                        Pair pair = new Pair(str3, str4);
                        Map map = c62505SEh.A00;
                        c5ks2 = (C5KS) map.get(pair);
                        if (c5ks2 != null) {
                            AbstractC58320PtC.A1L("FirebaseInstanceId", pair);
                        } else {
                            AbstractC58320PtC.A1L("FirebaseInstanceId", pair);
                            C62917SWy c62917SWy = firebaseInstanceId.A00;
                            C5KS A022 = C62917SWy.A00(AbstractC166987dD.A0b(), c62917SWy, A02, str3, str4).A02(new C64261T6k(c62917SWy), c62917SWy.A04);
                            Executor executor2 = firebaseInstanceId.A07;
                            T7F t7f = new T7F(firebaseInstanceId, str3, str4, A02);
                            C5KS c5ks3 = new C5KS();
                            A022.A03.A00(new C64265T6o(t7f, c5ks3, executor2));
                            C5KS.A01(A022);
                            Executor executor3 = c62505SEh.A01;
                            InterfaceC65423Tju interfaceC65423Tju2 = new InterfaceC65423Tju(pair, c62505SEh) { // from class: X.T6l
                                public final Pair A00;
                                public final C62505SEh A01;

                                {
                                    this.A01 = c62505SEh;
                                    this.A00 = pair;
                                }

                                @Override // X.InterfaceC65423Tju
                                public final Object Eq5(C5KS c5ks4) {
                                    C62505SEh c62505SEh2 = this.A01;
                                    Pair pair2 = this.A00;
                                    synchronized (c62505SEh2) {
                                        c62505SEh2.A00.remove(pair2);
                                    }
                                    return c5ks4;
                                }
                            };
                            c5ks2 = new C5KS();
                            c5ks3.A03.A00(new C64264T6n(interfaceC65423Tju2, c5ks2, executor3));
                            C5KS.A01(c5ks3);
                            map.put(pair, c5ks2);
                        }
                    }
                    return c5ks2;
                }
            };
            C5KS c5ks = new C5KS();
            A0Y.A03.A00(new C64264T6n(interfaceC65423Tju, c5ks, executor));
            C5KS.A01(A0Y);
            return ((SC6) A01(c5ks, this)).A00;
        }
        throw MSW.A0y("MAIN_THREAD");
    }
}
