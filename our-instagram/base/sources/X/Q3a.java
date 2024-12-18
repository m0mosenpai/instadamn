package X;

import android.app.AppOpsManager;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.facebook.location.platform.api.Location;

/* loaded from: classes10.dex */
public final class Q3a extends Handler {
    public final ComponentName A00;
    public final /* synthetic */ Q1F A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3a(ComponentName componentName, Looper looper, Q1F q1f) {
        super(looper);
        this.A01 = q1f;
        this.A00 = componentName;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message != null) {
            Q1F q1f = this.A01;
            try {
                ((AppOpsManager) q1f.getApplicationContext().getSystemService("appops")).checkPackage(message.sendingUid, "com.google.android.gms");
                int i = message.what;
                if (i != 1) {
                    if (i != 2 && i != 4) {
                        C0K8.A0O("GcmTaskService", "Unrecognized message received: %s", message);
                        return;
                    }
                    return;
                }
                Bundle data = message.getData();
                Messenger messenger = message.replyTo;
                String string = data.getString("tag");
                if (messenger != null && string != null) {
                    RunnableC64728TRk A00 = Q1F.A00(data.getBundle(Location.EXTRAS), q1f, new C63982Sx8(this.A00, messenger, string), string);
                    if (A00 != null) {
                        A00.A01();
                        return;
                    }
                    return;
                }
                C0I3 c0i3 = C0K8.A01;
            } catch (SecurityException e) {
                C0K8.A0F("GcmTaskService", "Message was not sent from GCM.", e);
            }
        }
    }
}
