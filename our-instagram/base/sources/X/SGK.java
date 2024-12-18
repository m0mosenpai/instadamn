package X;

import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class SGK {
    public final Executor A00;
    public volatile SNO A01;
    public volatile Object A02;

    public SGK(Looper looper, Object obj) {
        this.A00 = new ExecutorC64794TUi(looper);
        C3U5.A03(obj, "Listener must not be null");
        this.A02 = obj;
        C3U5.A04("LocationCallback");
        this.A01 = new SNO(obj);
    }
}
