package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.0uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18150uz implements InterfaceC11380iw, InterfaceC12870lZ {
    public static C18150uz A09 = null;
    public static boolean A0A = false;
    public static final C15670qN A0B = new Object();
    public static final Collection A0C = new ConcurrentLinkedQueue();
    public static final String __redex_internal_original_name = "ConnectionChangeReporter";
    public BroadcastReceiver A00;
    public boolean A01;
    public IntentFilter A02;
    public NetworkInfo A03;
    public boolean A04;
    public final Context A05;
    public volatile NetworkInfo A08;
    public final Handler A07 = new Handler(Looper.getMainLooper());
    public final C14280ns A06 = new C14280ns(1926548712, false);

    public static final NetworkInfo A00(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo = null;
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService instanceof ConnectivityManager) {
                connectivityManager = (ConnectivityManager) systemService;
            } else {
                connectivityManager = null;
            }
            if (connectivityManager == null) {
                return null;
            }
            networkInfo = connectivityManager.getActiveNetworkInfo();
            return networkInfo;
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getActiveNetworkInfo caught Exception: ");
            sb.append(e);
            C0w9.A03(__redex_internal_original_name, sb.toString());
            return networkInfo;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ps, java.lang.Object] */
    public static final void A02(final C18150uz c18150uz) {
        c18150uz.A01 = false;
        A01(c18150uz.A05, c18150uz);
        if (c18150uz.A00 == null) {
            c18150uz.A00 = new BroadcastReceiver() { // from class: X.0qP
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    int i;
                    int A01 = C0f9.A01(333011995);
                    C0fM.A01(this, context, intent);
                    C14360o3.A0B(context, 0);
                    C14360o3.A0B(intent, 1);
                    if (isInitialStickyBroadcast()) {
                        i = -1018055208;
                    } else {
                        C18150uz.A01(context, C18150uz.this);
                        i = -1450268538;
                    }
                    C0f9.A0E(i, A01, intent);
                }
            };
        }
        final ?? obj = new Object();
        IntentFilter intentFilter = c18150uz.A02;
        obj.A00 = intentFilter;
        if (intentFilter == null) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            obj.A00 = intentFilter2;
            c18150uz.A02 = intentFilter2;
        }
        final BroadcastReceiver broadcastReceiver = c18150uz.A00;
        c18150uz.A06.execute(new Runnable() { // from class: X.0qT
            @Override // java.lang.Runnable
            public final void run() {
                C0DJ.A00(broadcastReceiver, c18150uz.A05, (IntentFilter) obj.A00);
            }
        });
    }

    public final NetworkInfo A03() {
        if (this.A01) {
            this.A08 = A00(this.A05);
        }
        return this.A08;
    }

    public C18150uz(Context context) {
        this.A05 = context;
        C218914p.A03(EnumC220415e.A02, this);
        this.A08 = A00(context);
    }

    public static final void A01(Context context, C18150uz c18150uz) {
        NetworkInfo A00 = A00(context);
        c18150uz.A08 = A00;
        if (A00 != null && A00.getState() == NetworkInfo.State.DISCONNECTED) {
            c18150uz.A04 = true;
        }
        NetworkInfo networkInfo = c18150uz.A03;
        if (networkInfo != null ? !(A00 == null || networkInfo.getType() != A00.getType() || networkInfo.getSubtype() != A00.getSubtype()) : A00 == null) {
            if (!c18150uz.A04) {
                return;
            }
        }
        c18150uz.A03 = A00;
        Collection collection = A0C;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((InterfaceC15680qO) it.next()).onConnectionChanged(A00);
            }
        }
        c18150uz.A04 = false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "device";
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(169579005);
        if (((Boolean) AbstractC15930qn.A02.A02.invoke()).booleanValue()) {
            this.A07.post(new Runnable() { // from class: X.0qQ
                @Override // java.lang.Runnable
                public final void run() {
                    C18150uz c18150uz = C18150uz.this;
                    BroadcastReceiver broadcastReceiver = c18150uz.A00;
                    if (broadcastReceiver != null) {
                        c18150uz.A06.execute(new RunnableC15710qR(broadcastReceiver, c18150uz));
                    }
                    c18150uz.A01 = true;
                }
            });
        } else {
            BroadcastReceiver broadcastReceiver = this.A00;
            if (broadcastReceiver != null) {
                this.A06.execute(new RunnableC15710qR(broadcastReceiver, this));
            }
            this.A01 = true;
        }
        C0f9.A0A(-825813907, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-1067350842);
        if (((Boolean) AbstractC15930qn.A02.A02.invoke()).booleanValue()) {
            this.A07.post(new Runnable() { // from class: X.0qS
                @Override // java.lang.Runnable
                public final void run() {
                    C18150uz.A02(C18150uz.this);
                }
            });
        } else {
            A02(this);
        }
        C0f9.A0A(1108421915, A03);
    }
}
