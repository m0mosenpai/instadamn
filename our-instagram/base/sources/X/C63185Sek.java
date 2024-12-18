package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Sek, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63185Sek {
    public static final Map A0D = AbstractC166987dD.A1G();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final C62927SXj A06;
    public final C62849STw A0C;
    public final List A09 = AbstractC166987dD.A1E();
    public final java.util.Set A0A = AbstractC166987dD.A1H();
    public final Object A07 = AbstractC58318PtA.A0b();
    public final IBinder.DeathRecipient A05 = new IBinder.DeathRecipient() { // from class: X.Ski
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C63185Sek c63185Sek = C63185Sek.this;
            C62927SXj c62927SXj = c63185Sek.A06;
            c62927SXj.A01("reportBinderDeath", AbstractC58318PtA.A1b());
            c63185Sek.A08.get();
            c62927SXj.A01("%s : Binder has died.", "com.google.android.finsky.inappreviewservice.InAppReviewService");
            List<AbstractRunnableC64723TRe> list = c63185Sek.A09;
            for (AbstractRunnableC64723TRe abstractRunnableC64723TRe : list) {
                RemoteException A0G = AbstractC58320PtC.A0G("com.google.android.finsky.inappreviewservice.InAppReviewService");
                C58411Pup c58411Pup = abstractRunnableC64723TRe.A00;
                if (c58411Pup != null) {
                    c58411Pup.A02(A0G);
                }
            }
            list.clear();
            C63185Sek.A00(c63185Sek);
        }
    };
    public final AtomicInteger A0B = AbstractC58319PtB.A16();
    public final WeakReference A08 = AbstractC25225BEi.A16(null);

    public static final void A00(C63185Sek c63185Sek) {
        synchronized (c63185Sek.A07) {
            java.util.Set set = c63185Sek.A0A;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C58411Pup) it.next()).A02(AbstractC58320PtC.A0G("com.google.android.finsky.inappreviewservice.InAppReviewService"));
            }
            set.clear();
        }
    }

    public final Handler A01() {
        Handler handler;
        Map map = A0D;
        synchronized (map) {
            if (!map.containsKey("com.google.android.finsky.inappreviewservice.InAppReviewService")) {
                HandlerThread handlerThread = new HandlerThread("com.google.android.finsky.inappreviewservice.InAppReviewService", 10);
                handlerThread.start();
                map.put("com.google.android.finsky.inappreviewservice.InAppReviewService", MSY.A09(handlerThread));
            }
            handler = (Handler) map.get("com.google.android.finsky.inappreviewservice.InAppReviewService");
        }
        return handler;
    }

    public C63185Sek(Context context, Intent intent, C62927SXj c62927SXj, C62849STw c62849STw) {
        this.A03 = context;
        this.A06 = c62927SXj;
        this.A04 = intent;
        this.A0C = c62849STw;
    }
}
