package X;

import android.location.Location;

/* renamed from: X.Ak6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23971Ak6 implements InterfaceC127465pP {
    public final /* synthetic */ C37331oW A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    @Override // X.InterfaceC127465pP
    public final void onLocationChanged(Location location) {
        C14360o3.A0B(location, 0);
        this.A01.invoke(location);
    }

    public C23971Ak6(C37331oW c37331oW, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
        this.A00 = c37331oW;
    }

    @Override // X.InterfaceC127465pP
    public final void DEF(Exception exc) {
        this.A01.invoke(this.A00.A00);
    }
}
