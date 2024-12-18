package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.63M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63M implements C63N {
    public Map A00;
    public final Handler A01;
    public final C223016j A02;
    public final C63O A03;
    public final Object A04;

    public C63M() {
        HandlerThread handlerThread = new HandlerThread("Bloks_ACQ_CleanupThread", 19);
        handlerThread.start();
        Object obj = new Object();
        this.A04 = obj;
        this.A03 = new C63O();
        synchronized (obj) {
            C223016j c223016j = new C223016j(50);
            this.A02 = c223016j;
            this.A00 = c223016j.A04();
        }
        this.A01 = new Handler(handlerThread.getLooper());
    }

    public final void A00(Q0E q0e, EnumC58683Pzw enumC58683Pzw, C64517THk c64517THk, String str, long j, long j2) {
        C223016j c223016j;
        Runnable runnable;
        long j3 = j;
        C14360o3.A0B(str, 0);
        try {
            C1LN.A01(AnonymousClass001.A0T("BloksComponentQueryLRUMemoryCache", AnonymousClass001.A0R("storeResponseForKey:", str), ':'));
            Object obj = this.A04;
            synchronized (obj) {
                try {
                    c223016j = this.A02;
                    Q0J q0j = (Q0J) c223016j.A02(str);
                    if (q0j != null && (runnable = q0j.A02) != null) {
                        this.A01.removeCallbacks(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Q0K q0k = new Q0K(this, str);
            Handler handler = this.A01;
            if (enumC58683Pzw == EnumC58683Pzw.A04 && j == 0) {
                j3 = 5;
            }
            handler.postDelayed(q0k, TimeUnit.SECONDS.toMillis(j3));
            synchronized (obj) {
                try {
                    c223016j.A06(str, new Q0I(q0e, enumC58683Pzw, c64517THk, q0k, j2));
                    LinkedHashMap A04 = c223016j.A04();
                    this.A00 = A04;
                    this.A03.A01(new C1340163j(A04));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } finally {
            C1LN.A00();
        }
    }

    public final void A01(String str) {
        try {
            C1LN.A01(AnonymousClass001.A0T("BloksComponentQueryLRUMemoryCache", "removeResponseForKey", ':'));
            synchronized (this.A04) {
                C223016j c223016j = this.A02;
                c223016j.A03(str);
                LinkedHashMap A04 = c223016j.A04();
                this.A00 = A04;
                this.A03.A01(new C1340163j(A04));
            }
        } finally {
            C1LN.A00();
        }
    }

    @Override // X.C63N
    public final Q0J Epl(String str) {
        Q0J q0j;
        try {
            C1LN.A01(AnonymousClass001.A0T("BloksComponentQueryLRUMemoryCache", AnonymousClass001.A0R("syncFetchResponseForKey:", str), ':'));
            synchronized (this.A04) {
                q0j = (Q0J) this.A02.A02(str);
            }
            return q0j;
        } finally {
            C1LN.A00();
        }
    }
}
