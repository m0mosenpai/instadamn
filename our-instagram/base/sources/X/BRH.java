package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes5.dex */
public final class BRH implements InterfaceC30939Dit {
    public final /* synthetic */ C51762Yz A00;
    public final /* synthetic */ BRG A01;

    public BRH(C51762Yz c51762Yz, BRG brg) {
        this.A00 = c51762Yz;
        this.A01 = brg;
    }

    @Override // X.InterfaceC30939Dit
    public final boolean DC3(MotionEvent motionEvent, View view, InterfaceC30808Dgj interfaceC30808Dgj) {
        C14360o3.A0B(interfaceC30808Dgj, 0);
        AbstractC25227BEk.A1L(this.A00, false);
        return this.A01.A05.DC3(motionEvent, view, interfaceC30808Dgj);
    }
}
