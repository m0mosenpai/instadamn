package X;

import android.location.Location;

/* renamed from: X.WlC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70965WlC implements InterfaceC127465pP {
    public final /* synthetic */ C69727VuM A00;
    public final /* synthetic */ AbstractC67878V0j A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC127465pP
    public final void DEF(Exception exc) {
    }

    public C70965WlC(C69727VuM c69727VuM, AbstractC67878V0j abstractC67878V0j, String str) {
        this.A01 = abstractC67878V0j;
        this.A00 = c69727VuM;
        this.A02 = str;
    }

    @Override // X.InterfaceC127465pP
    public final void onLocationChanged(Location location) {
        this.A01.A06().A02().A06(this.A00.A00().A02, this.A02);
    }
}
