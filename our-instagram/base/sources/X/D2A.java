package X;

import android.view.View;

/* loaded from: classes5.dex */
public final class D2A implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Boolean A02;

    public D2A(View view, View view2, Boolean bool) {
        this.A02 = bool;
        this.A00 = view;
        this.A01 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        if (this.A02.booleanValue()) {
            i = this.A00.getHeight();
        } else {
            i = 0;
        }
        this.A01.setPadding(0, 0, 0, i);
    }
}
