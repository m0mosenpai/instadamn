package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class GOE implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ E0K A01;

    public GOE(View view, E0K e0k) {
        this.A01 = e0k;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E0K.A00(this.A00, 10.0d, 0.0f, 1.0f);
    }
}
