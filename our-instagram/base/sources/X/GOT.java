package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class GOT implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ EKC A01;

    public GOT(View view, EKC ekc) {
        this.A01 = ekc;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.requestFocus();
    }
}
