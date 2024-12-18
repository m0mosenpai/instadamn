package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zact;

/* loaded from: classes10.dex */
public final class TLM implements Runnable {
    public final /* synthetic */ zact A00;

    public TLM(zact zactVar) {
        this.A00 = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.FF6(new ConnectionResult(4));
    }
}
