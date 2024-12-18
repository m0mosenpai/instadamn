package X;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: X.Ww3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71554Ww3 implements Runnable {
    public final View A00;
    public final boolean A01;
    public final /* synthetic */ SwipeDismissBehavior A02;

    public RunnableC71554Ww3(View view, SwipeDismissBehavior swipeDismissBehavior, boolean z) {
        this.A02 = swipeDismissBehavior;
        this.A00 = view;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC71910X9u interfaceC71910X9u;
        SwipeDismissBehavior swipeDismissBehavior = this.A02;
        C70198WGk c70198WGk = swipeDismissBehavior.A03;
        if (c70198WGk != null && c70198WGk.A0H()) {
            this.A00.postOnAnimation(this);
        } else {
            if (!this.A01 || (interfaceC71910X9u = swipeDismissBehavior.A04) == null) {
                return;
            }
            interfaceC71910X9u.DAi(this.A00);
        }
    }
}
