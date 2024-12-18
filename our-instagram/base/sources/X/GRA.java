package X;

import android.os.Handler;
import com.instagram.registration.model.RegFlowExtras;

/* loaded from: classes6.dex */
public final class GRA implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ C07270a1 A03;
    public final /* synthetic */ GY4 A04;
    public final /* synthetic */ GY6 A05;
    public final /* synthetic */ RegFlowExtras A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public GRA(Handler handler, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, GY4 gy4, GY6 gy6, RegFlowExtras regFlowExtras, String str, boolean z) {
        this.A06 = regFlowExtras;
        this.A07 = str;
        this.A03 = c07270a1;
        this.A01 = abstractC59962oe;
        this.A00 = handler;
        this.A02 = interfaceC11380iw;
        this.A05 = gy6;
        this.A08 = z;
        this.A04 = gy4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RegFlowExtras regFlowExtras = this.A06;
        regFlowExtras.A0Z = this.A07;
        C07270a1 c07270a1 = this.A03;
        C006802i.A0p.markerPoint(4197923, "start_create_account");
        AbstractC59962oe abstractC59962oe = this.A01;
        Handler handler = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        Integer A01 = AbstractC35794FrW.A01(regFlowExtras);
        AbstractC35794FrW.A03(handler, abstractC59962oe, interfaceC11380iw, c07270a1, this.A04, this.A05, regFlowExtras, A01, true);
    }
}
