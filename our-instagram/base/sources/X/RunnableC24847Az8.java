package X;

import android.app.Activity;

/* renamed from: X.Az8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24847Az8 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ C189478aR A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    public RunnableC24847Az8(Activity activity, AbstractC59962oe abstractC59962oe, C189478aR c189478aR, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = c189478aR;
        this.A00 = activity;
        this.A01 = abstractC59962oe;
        this.A03 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A02(this.A00, this.A01);
        InterfaceC16820sZ interfaceC16820sZ = this.A03;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }
}
