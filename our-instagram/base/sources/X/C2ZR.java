package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.process.asyncinit.IgAppInitReplayBroadcastReceiver;
import java.util.LinkedList;

/* renamed from: X.2ZR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2ZR implements Runnable {
    public final /* synthetic */ Context A00;

    public C2ZR(Context context) {
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            LinkedList linkedList = IgAppInitReplayBroadcastReceiver.originalIntents;
            if (!linkedList.isEmpty()) {
                C0K8.A0D(IgAppInitReplayBroadcastReceiver.TAG, "Processing broadcast during app init");
                Intent intent = (Intent) linkedList.removeFirst();
                if (intent != null) {
                    Context context = this.A00;
                    String action = intent.getAction();
                    if (action != null && action.startsWith("android.")) {
                        intent.setAction(new C11L("android\\.").A01(action, "com.instagram.android."));
                    }
                    context.sendBroadcast(intent);
                }
            } else {
                return;
            }
        }
    }
}
