package androidx.room;

import X.AbstractC166987dD;
import X.Q3e;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import java.util.Map;

/* loaded from: classes10.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int A00;
    public final Map A02 = AbstractC166987dD.A1I();
    public final RemoteCallbackList A01 = new Q3e(this);
    public final MultiInstanceInvalidationService$binder$1 A03 = new MultiInstanceInvalidationService$binder$1(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.A03;
    }
}
