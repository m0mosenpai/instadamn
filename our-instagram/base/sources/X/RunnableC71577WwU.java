package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.WwU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71577WwU implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public RunnableC71577WwU(View view, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A00 = view;
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        String A00 = MSV.A00(577);
        if (!AbstractC69983Vz2.A01(view, A00) && AbstractC25231BEo.A1b(this.A02)) {
            AbstractC125325le A002 = AbstractC69983Vz2.A00(view, C71051Wn6.A00);
            Context A0L = AbstractC166997dE.A0L(view);
            A002.A0J(AbstractC13880nE.A00(A0L, -5.0f));
            A002.A0K(AbstractC13880nE.A00(A0L, -4.0f));
            A002.A0O(0.0f, -7.0f);
            A002.A05 = new C71037Wms(this.A01, 4);
            A002.A08 = A00;
            A002.A0H();
        }
    }
}
