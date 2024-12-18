package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;

/* renamed from: X.MWg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50619MWg implements InterfaceC08240bm {
    public final Activity A00;

    public C50619MWg(Activity activity) {
        this.A00 = activity;
    }

    @Override // X.InterfaceC08240bm
    public final ArrayList BIr() {
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(new IntentFilter(AbstractC111324zv.A00(598)));
        return A1E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC08240bm
    public final void Dd8(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        BroadcastReceiver broadcastReceiver;
        AbstractC167017dG.A1O(context, interfaceC08190bh);
        this.A00.onBackPressed();
        if (interfaceC08190bh instanceof BroadcastReceiver) {
            broadcastReceiver = (BroadcastReceiver) interfaceC08190bh;
        } else {
            broadcastReceiver = null;
        }
        context.unregisterReceiver(broadcastReceiver);
    }
}
