package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.errorreporting.lacrima.detector.broadcast.SecureShutdownBootBroadcastReceiver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.0HO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HO implements InterfaceC08240bm {
    @Override // X.InterfaceC08240bm
    public final ArrayList BIr() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new IntentFilter("android.intent.action.ACTION_SHUTDOWN"));
        arrayList.add(new IntentFilter("com.facebook.android.intent.action.ACTION_SHUTDOWN"));
        arrayList.add(new IntentFilter("com.instagram.android.intent.action.ACTION_SHUTDOWN"));
        return arrayList;
    }

    @Override // X.InterfaceC08240bm
    public final void Dd8(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        C0NN.A00(context).A02("last_device_shutdown_s", Long.toString(System.currentTimeMillis() / 1000));
        File file = SecureShutdownBootBroadcastReceiver.A00;
        if (file != null) {
            try {
                new File(file, "shut_down").createNewFile();
            } catch (IOException e) {
                C0PC.A00().DEh("SecureShutdownBootBroadcastReceiverReceive", e, null);
                C0K8.A0H("lacrima", "Could not create is_shutting_down marker file", e);
            }
        }
    }
}
