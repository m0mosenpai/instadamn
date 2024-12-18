package X;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;

/* renamed from: X.0zG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC20390zG implements Runnable, AnonymousClass008, ViewTreeObserver.OnDrawListener {
    public Runnable A00;
    public boolean A01;
    public final long A02 = SystemClock.uptimeMillis() + 10000;
    public final /* synthetic */ ComponentActivity A03;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        this.A00 = runnable;
        View decorView = this.A03.getWindow().getDecorView();
        C14360o3.A07(decorView);
        if (this.A01) {
            if (C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new Runnable() { // from class: X.009
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC20390zG runnableC20390zG = RunnableC20390zG.this;
                Runnable runnable2 = runnableC20390zG.A00;
                if (runnable2 != null) {
                    runnable2.run();
                    runnableC20390zG.A00 = null;
                }
            }
        });
    }

    public RunnableC20390zG(ComponentActivity componentActivity) {
        this.A03 = componentActivity;
    }

    @Override // X.AnonymousClass008
    public final void FDg(View view) {
        if (!this.A01) {
            this.A01 = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        ComponentActivity componentActivity;
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
            this.A00 = null;
            componentActivity = this.A03;
            if (componentActivity.getFullyDrawnReporter().A01()) {
                this.A01 = false;
            } else {
                return;
            }
        } else {
            if (SystemClock.uptimeMillis() <= this.A02) {
                return;
            }
            this.A01 = false;
            componentActivity = this.A03;
        }
        componentActivity.getWindow().getDecorView().post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A03.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
