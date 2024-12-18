package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Ske, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63459Ske implements Handler.Callback {
    public final Handler A01;
    public final InterfaceC1340963t A02;
    public final ArrayList A05 = AbstractC166987dD.A1E();
    public final ArrayList A04 = AbstractC166987dD.A1E();
    public final ArrayList A06 = AbstractC166987dD.A1E();
    public volatile boolean A08 = false;
    public final AtomicInteger A07 = MSW.A1C(0);
    public boolean A00 = false;
    public final Object A03 = AbstractC58318PtA.A0b();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C69F c69f = (C69F) message.obj;
            synchronized (this.A03) {
                if (this.A08 && this.A02.isConnected() && this.A05.contains(c69f)) {
                    c69f.D75(null);
                }
            }
            return true;
        }
        android.util.Log.wtf("GmsClientEvents", AnonymousClass001.A0O("Don't know how to handle message: ", i), new Exception());
        return false;
    }

    public C63459Ske(Looper looper, InterfaceC1340963t interfaceC1340963t) {
        this.A02 = interfaceC1340963t;
        this.A01 = new HandlerC1336161q(looper, this);
    }

    public final void A00(C69E c69e) {
        C3U5.A02(c69e);
        synchronized (this.A03) {
            ArrayList arrayList = this.A05;
            if (arrayList.contains(c69e)) {
                android.util.Log.w("GmsClientEvents", AnonymousClass001.A0g("registerConnectionCallbacks(): listener ", String.valueOf(c69e), " is already registered"));
            } else {
                arrayList.add(c69e);
            }
        }
        if (this.A02.isConnected()) {
            AbstractC166997dE.A1H(this.A01, c69e, 1);
        }
    }

    public final void A01(C69G c69g) {
        C3U5.A02(c69g);
        synchronized (this.A03) {
            ArrayList arrayList = this.A06;
            if (arrayList.contains(c69g)) {
                android.util.Log.w("GmsClientEvents", AnonymousClass001.A0g("registerConnectionFailedListener(): listener ", String.valueOf(c69g), " is already registered"));
            } else {
                arrayList.add(c69g);
            }
        }
    }
}
