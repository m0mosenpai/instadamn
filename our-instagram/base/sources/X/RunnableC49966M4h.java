package X;

import android.view.View;

/* renamed from: X.M4h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49966M4h implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public RunnableC49966M4h(View view, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = view;
        this.A01 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        view.setVisibility(8);
        this.A01.invoke();
        AbstractC43593JPy.A1A(view);
    }
}
