package androidx.profileinstaller;

import X.C08Z;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements C08Z {
    @Override // X.C08Z
    public final /* bridge */ /* synthetic */ Object ALO(Context context) {
        final Context applicationContext = context.getApplicationContext();
        final Runnable runnable = new Runnable() { // from class: X.08F
            @Override // java.lang.Runnable
            public final void run() {
                final Context context2 = applicationContext;
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: X.08E
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Context context3 = context2;
                        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: X.08G
                            @Override // java.lang.Runnable
                            public final void run() {
                                C08D.A00(context3, C08D.A00, new Executor() { // from class: X.08A
                                    @Override // java.util.concurrent.Executor
                                    public final void execute(Runnable runnable2) {
                                        runnable2.run();
                                    }
                                }, false);
                            }
                        });
                    }
                }, new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        };
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: X.08H
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
        return new Object();
    }

    @Override // X.C08Z
    public final List AOq() {
        return Collections.emptyList();
    }
}
