package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class M1R implements Runnable {
    public final /* synthetic */ View A00;

    public M1R(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC125325le A0Z = JQ0.A0Z(this.A00);
        A0Z.A04 = 0;
        A0Z.A0U(0.0f, 1.0f, -1.0f);
        A0Z.A0V(0.0f, 1.0f, -1.0f);
        A0Z.A0H();
    }
}
