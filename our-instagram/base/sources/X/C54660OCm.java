package X;

import android.content.Context;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.OCm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54660OCm {
    public final OJC A00;
    public final C55724Ooq A01;
    public final MyA A02;
    public final Executor A03;
    public final Executor A04;

    /* JADX WARN: Type inference failed for: r4v0, types: [com.facebook.papaya.client.ICallback, X.Ooq, java.lang.Object] */
    public C54660OCm(Context context, OED oed) {
        ?? obj = new Object();
        this.A01 = obj;
        MyA myA = new MyA();
        this.A02 = myA;
        this.A03 = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor(new ThreadFactoryC24937B1l("com.facebook.papaya.api_run_thread", 1)));
        this.A04 = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor(new ThreadFactoryC24937B1l("com.facebook.papaya.api_stop_thread", 1)));
        this.A00 = new OJC(context, obj, oed, myA);
    }
}
