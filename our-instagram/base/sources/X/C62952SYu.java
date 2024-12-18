package X;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.SYu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62952SYu {
    public static final Executor A04 = Executors.newSingleThreadExecutor();
    public final Handler A00;
    public final C62669SLg A01;
    public final C62606SIm A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);

    public C62952SYu(Context context, InterfaceC65366Tiy interfaceC65366Tiy) {
        C3UV A00 = C3UV.A00(context);
        this.A01 = new C62669SLg(new SBT(interfaceC65366Tiy), "725056107548211|0e20c3123a90c76c02c901b7415ff67f", new C62945SYn(context, A00, "MQTT", null).A01());
        this.A00 = new Q3b(context.getMainLooper(), this, 0);
        this.A02 = new C62606SIm(A00.A01, A00.A00);
    }

    public final void A00(SP7 sp7) {
        A04.execute(new RunnableC64641TNx(sp7, this));
    }
}
