package X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Puu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC58416Puu implements ServiceConnection {
    public C58420Puy A01;
    public final /* synthetic */ C58414Pus A05;
    public int A00 = 0;
    public final Messenger A02 = new Messenger(new Handler(Looper.getMainLooper(), new Handler.Callback(this) { // from class: X.Puv
        public final ServiceConnectionC58416Puu A00;

        {
            this.A00 = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC58416Puu serviceConnectionC58416Puu = this.A00;
            int i = message.arg1;
            android.util.Log.isLoggable("MessengerIpcClient", 3);
            synchronized (serviceConnectionC58416Puu) {
                SparseArray sparseArray = serviceConnectionC58416Puu.A03;
                AbstractC58415Put abstractC58415Put = (AbstractC58415Put) sparseArray.get(i);
                if (abstractC58415Put == null) {
                    android.util.Log.w("MessengerIpcClient", AbstractC58320PtC.A12("Received response for unknown request: ", AbstractC58318PtA.A0q(50), i));
                    return true;
                }
                sparseArray.remove(i);
                serviceConnectionC58416Puu.A00();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    Rk4 rk4 = new Rk4(4, "Not supported by GmsCore");
                    AbstractC58415Put.A00(abstractC58415Put, rk4);
                    abstractC58415Put.A03.A00(rk4);
                    return true;
                }
                if (abstractC58415Put instanceof RVS) {
                    if (data.getBoolean("ack", false)) {
                        AbstractC58415Put.A00(abstractC58415Put, null);
                        abstractC58415Put.A03.A01(null);
                        return true;
                    }
                    Rk4 rk42 = new Rk4(4, "Invalid response to one way request");
                    AbstractC58415Put.A00(abstractC58415Put, rk42);
                    abstractC58415Put.A03.A00(rk42);
                    return true;
                }
                Bundle bundle = data.getBundle("data");
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                AbstractC58415Put.A00(abstractC58415Put, bundle);
                abstractC58415Put.A03.A01(bundle);
                return true;
            }
        }
    }));
    public final Queue A04 = new ArrayDeque();
    public final SparseArray A03 = AbstractC58318PtA.A0G();

    public final synchronized void A00() {
        if (this.A00 == 2 && this.A04.isEmpty() && this.A03.size() == 0) {
            android.util.Log.isLoggable("MessengerIpcClient", 2);
            this.A00 = 3;
            C1341263x.A00().A02(this.A05.A02, this);
        }
    }

    public final synchronized void A01(int i, String str) {
        SparseArray sparseArray;
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            String.valueOf(str);
        }
        int i2 = this.A00;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    this.A00 = 4;
                }
            } else {
                android.util.Log.isLoggable("MessengerIpcClient", 2);
                this.A00 = 4;
                C1341263x.A00().A02(this.A05.A02, this);
                Rk4 rk4 = new Rk4(i, str);
                Queue<AbstractC58415Put> queue = this.A04;
                for (AbstractC58415Put abstractC58415Put : queue) {
                    AbstractC58415Put.A00(abstractC58415Put, rk4);
                    abstractC58415Put.A03.A00(rk4);
                }
                queue.clear();
                int i3 = 0;
                while (true) {
                    sparseArray = this.A03;
                    if (i3 >= sparseArray.size()) {
                        break;
                    }
                    AbstractC58415Put abstractC58415Put2 = (AbstractC58415Put) sparseArray.valueAt(i3);
                    AbstractC58415Put.A00(abstractC58415Put2, rk4);
                    abstractC58415Put2.A03.A00(rk4);
                    i3++;
                }
                sparseArray.clear();
            }
        } else {
            throw AbstractC58318PtA.A0Z();
        }
    }

    public final synchronized boolean A02(AbstractC58415Put abstractC58415Put) {
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                this.A04.add(abstractC58415Put);
                this.A05.A03.execute(new RunnableC58419Pux(this));
            } else {
                this.A04.add(abstractC58415Put);
            }
        } else {
            this.A04.add(abstractC58415Put);
            if (this.A00 == 0) {
                android.util.Log.isLoggable("MessengerIpcClient", 2);
                this.A00 = 1;
                Intent A0E = AbstractC58318PtA.A0E("com.google.android.c2dm.intent.REGISTER");
                A0E.setPackage("com.google.android.gms");
                C1341263x A00 = C1341263x.A00();
                C58414Pus c58414Pus = this.A05;
                if (!A00.A03(c58414Pus.A02, A0E, this, 1)) {
                    A01(0, "Unable to bind to service");
                } else {
                    c58414Pus.A03.schedule(new Runnable(this) { // from class: X.Puw
                        public final ServiceConnectionC58416Puu A00;

                        {
                            this.A00 = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ServiceConnectionC58416Puu serviceConnectionC58416Puu = this.A00;
                            synchronized (serviceConnectionC58416Puu) {
                                if (serviceConnectionC58416Puu.A00 == 1) {
                                    serviceConnectionC58416Puu.A01(1, "Timed out while binding");
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                }
            } else {
                throw AbstractC58318PtA.A0Z();
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String message;
        android.util.Log.isLoggable("MessengerIpcClient", 2);
        if (iBinder != null) {
            try {
                this.A01 = new C58420Puy(iBinder);
                this.A00 = 2;
                this.A05.A03.execute(new RunnableC58419Pux(this));
            } catch (RemoteException e) {
                message = e.getMessage();
            }
        } else {
            message = "Null service connection";
        }
        A01(0, message);
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        android.util.Log.isLoggable("MessengerIpcClient", 2);
        A01(2, "Service disconnected");
    }

    public ServiceConnectionC58416Puu(C58414Pus c58414Pus) {
        this.A05 = c58414Pus;
    }
}
