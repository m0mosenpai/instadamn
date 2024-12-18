package androidx.work.multiprocess;

import X.AbstractC58318PtA;
import X.C2L1;
import X.C2LB;
import X.C48442Kl;
import X.RunnableC64722TRd;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public class RemoteWorkManagerClient {
    public final Context A00;
    public final C2L1 A01;
    public final Object A02;
    public final Executor A03;
    public final Handler A04;
    public final RunnableC64722TRd A05;

    static {
        C48442Kl.A01("RemoteWorkManagerClient");
    }

    public RemoteWorkManagerClient(Context context, C2L1 c2l1) {
        this(context, c2l1, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
    }

    public RemoteWorkManagerClient(Context context, C2L1 c2l1, long j) {
        this.A00 = context.getApplicationContext();
        this.A01 = c2l1;
        this.A03 = ((C2LB) c2l1.A06).A01;
        this.A02 = AbstractC58318PtA.A0b();
        this.A05 = new RunnableC64722TRd(this);
        this.A04 = Handler.createAsync(Looper.getMainLooper());
    }

    public RemoteWorkManagerClient() {
    }
}
