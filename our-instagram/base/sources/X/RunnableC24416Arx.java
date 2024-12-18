package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Arx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24416Arx implements Runnable {
    public final /* synthetic */ C191478dz A00;

    public RunnableC24416Arx(C191478dz c191478dz) {
        this.A00 = c191478dz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C191728eU c191728eU;
        C191478dz c191478dz = this.A00;
        FragmentActivity fragmentActivity = c191478dz.A0X;
        if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed() && (c191728eU = c191478dz.A09) != null) {
            c191728eU.A00();
        }
    }
}
