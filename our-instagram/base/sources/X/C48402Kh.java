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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Kh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48402Kh {
    public static final Map A0D = new HashMap();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final C2KQ A06;
    public final C48392Kg A0C;
    public final List A09 = new ArrayList();
    public final java.util.Set A0A = new HashSet();
    public final Object A07 = new Object();
    public final IBinder.DeathRecipient A05 = new IBinder.DeathRecipient() { // from class: X.2Kj
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C48402Kh c48402Kh = C48402Kh.this;
            C2KQ c2kq = c48402Kh.A06;
            c2kq.A03("reportBinderDeath", new Object[0]);
            c48402Kh.A08.get();
            c2kq.A03("%s : Binder has died.", "SplitInstallService");
            List<AbstractRunnableC58622Pyq> list = c48402Kh.A09;
            for (AbstractRunnableC58622Pyq abstractRunnableC58622Pyq : list) {
                RemoteException remoteException = new RemoteException(String.valueOf("SplitInstallService").concat(" : Binder has died."));
                C58411Pup c58411Pup = abstractRunnableC58622Pyq.A00;
                if (c58411Pup != null) {
                    c58411Pup.A02(remoteException);
                }
            }
            list.clear();
            synchronized (c48402Kh.A07) {
                C48402Kh.A00(c48402Kh);
            }
        }
    };
    public final AtomicInteger A0B = new AtomicInteger(0);
    public final WeakReference A08 = new WeakReference(null);

    public static final void A00(C48402Kh c48402Kh) {
        java.util.Set set = c48402Kh.A0A;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C58411Pup) it.next()).A02(new RemoteException(String.valueOf("SplitInstallService").concat(" : Binder has died.")));
        }
        set.clear();
    }

    public final Handler A01() {
        Handler handler;
        Map map = A0D;
        synchronized (map) {
            if (!map.containsKey("SplitInstallService")) {
                HandlerThread handlerThread = new HandlerThread("SplitInstallService", 10);
                handlerThread.start();
                map.put("SplitInstallService", new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get("SplitInstallService");
        }
        return handler;
    }

    public final void A02(C58411Pup c58411Pup) {
        synchronized (this.A07) {
            this.A0A.remove(c58411Pup);
        }
        A01().post(new C58637Pz9(this));
    }

    public final void A03(C58411Pup c58411Pup, AbstractRunnableC58622Pyq abstractRunnableC58622Pyq) {
        A01().post(new C58624Pys(abstractRunnableC58622Pyq.A00, c58411Pup, this, abstractRunnableC58622Pyq));
    }

    public C48402Kh(Context context, Intent intent, C2KQ c2kq, C48392Kg c48392Kg) {
        this.A03 = context;
        this.A06 = c2kq;
        this.A04 = intent;
        this.A0C = c48392Kg;
    }
}
