package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Sel, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63186Sel {
    public static final Map A0D = AbstractC166987dD.A1G();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final C62928SXk A06;
    public final C62848STv A0C;
    public final List A09 = AbstractC166987dD.A1E();
    public final java.util.Set A0A = AbstractC166987dD.A1H();
    public final Object A07 = AbstractC58318PtA.A0b();
    public final IBinder.DeathRecipient A05 = new IBinder.DeathRecipient() { // from class: X.Skj
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C63186Sel c63186Sel = C63186Sel.this;
            C62928SXk c62928SXk = c63186Sel.A06;
            c62928SXk.A01("reportBinderDeath", AbstractC58318PtA.A1b());
            c63186Sel.A08.get();
            c62928SXk.A01("%s : Binder has died.", "IntegrityService");
            List list = c63186Sel.A09;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC64727TRj) it.next()).A00(AbstractC58320PtC.A0G("IntegrityService"));
            }
            list.clear();
            C63186Sel.A00(c63186Sel);
        }
    };
    public final AtomicInteger A0B = AbstractC58319PtB.A16();
    public final WeakReference A08 = AbstractC25225BEi.A16(null);

    public static final void A00(C63186Sel c63186Sel) {
        synchronized (c63186Sel.A07) {
            java.util.Set set = c63186Sel.A0A;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C58411Pup) it.next()).A02(AbstractC58320PtC.A0G("IntegrityService"));
            }
            set.clear();
        }
    }

    public final Handler A01() {
        Handler handler;
        Map map = A0D;
        synchronized (map) {
            if (!map.containsKey("IntegrityService")) {
                HandlerThread handlerThread = new HandlerThread("IntegrityService", 10);
                handlerThread.start();
                map.put("IntegrityService", MSY.A09(handlerThread));
            }
            handler = (Handler) map.get("IntegrityService");
        }
        return handler;
    }

    public C63186Sel(Context context, Intent intent, C62848STv c62848STv, C62928SXk c62928SXk) {
        this.A03 = context;
        this.A06 = c62928SXk;
        this.A04 = intent;
        this.A0C = c62848STv;
    }
}
