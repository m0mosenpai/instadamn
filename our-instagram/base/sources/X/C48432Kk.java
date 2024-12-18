package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.2Kk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48432Kk {
    public static C48432Kk A08;
    public C48542Kw A00;
    public final Context A01;
    public final IntentFilter A02;
    public final C2KQ A03;
    public final java.util.Set A04;
    public final Handler A05;
    public final InterfaceC48462Kn A06;
    public final java.util.Set A07;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.2Kw, android.content.BroadcastReceiver] */
    public final synchronized void A00(C2KN c2kn) {
        C48542Kw c48542Kw;
        this.A03.A03("registerListener", new Object[0]);
        java.util.Set set = this.A04;
        set.add(c2kn);
        if (!set.isEmpty() && this.A00 == null) {
            ?? r4 = new BroadcastReceiver() { // from class: X.2Kw
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    int A01 = C0f9.A01(-603892414);
                    C0fM.A01(this, context, intent);
                    C48432Kk c48432Kk = C48432Kk.this;
                    Bundle bundleExtra = intent.getBundleExtra("session_state");
                    if (bundleExtra != null) {
                        RP1 A00 = AbstractC62642SJz.A00(bundleExtra);
                        c48432Kk.A03.A01("ListenerRegistryBroadcastReceiver.onReceive: %s", A00);
                        c48432Kk.A01(A00);
                    }
                    C0f9.A0E(984997982, A01, intent);
                }
            };
            this.A00 = r4;
            int i = Build.VERSION.SDK_INT;
            Context context = this.A01;
            IntentFilter intentFilter = this.A02;
            if (i >= 33) {
                context.registerReceiver(r4, intentFilter, 2);
            } else {
                context.registerReceiver(r4, intentFilter);
            }
        }
        if (set.isEmpty() && (c48542Kw = this.A00) != null) {
            this.A01.unregisterReceiver(c48542Kw);
            this.A00 = null;
        }
    }

    public final synchronized void A01(AbstractC62642SJz abstractC62642SJz) {
        Iterator it = new LinkedHashSet(this.A07).iterator();
        while (it.hasNext()) {
            ((C2KM) it.next()).DoW(abstractC62642SJz);
        }
        Iterator it2 = new HashSet(this.A04).iterator();
        while (it2.hasNext()) {
            ((C2KN) it2.next()).DoW(abstractC62642SJz);
        }
    }

    public C48432Kk(Context context, InterfaceC48462Kn interfaceC48462Kn) {
        C2KQ c2kq = new C2KQ("SplitInstallListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService");
        this.A04 = new HashSet();
        this.A00 = null;
        this.A03 = c2kq;
        this.A02 = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext != null ? applicationContext : context;
        this.A05 = new Handler(Looper.getMainLooper());
        this.A07 = new LinkedHashSet();
        this.A06 = interfaceC48462Kn;
    }
}
