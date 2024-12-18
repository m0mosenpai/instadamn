package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.M2q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49923M2q implements Runnable {
    public final /* synthetic */ C0SG A00;
    public final /* synthetic */ FragmentActivity A01;

    public RunnableC49923M2q(C0SG c0sg, FragmentActivity fragmentActivity) {
        this.A00 = c0sg;
        this.A01 = fragmentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0B(this.A01.getSupportFragmentManager(), "consent_dialog");
    }
}
