package X;

import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import java.util.Collections;

/* renamed from: X.SMu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62706SMu {
    public InterfaceC65512Tlh A00;
    public final InterfaceC65512Tlh A02;
    public final InterfaceC65612To3 A04;
    public final SCQ A05;
    public final IGPaymentMethodsAPI A06;
    public final IGPaymentMethodsAPI A08;
    public final InterfaceC65512Tlh A01 = new C64197T3g(AbstractC62189S1k.A00(null), new X58(C65060Tcp.A00, 48));
    public final InterfaceC65392TjP A07 = new C64199T3i(this, 5);
    public final C60621REg A03 = new C60621REg();

    public final C60621REg A00(String str, String str2) {
        synchronized (this) {
            InterfaceC65512Tlh interfaceC65512Tlh = this.A00;
            if (interfaceC65512Tlh != null) {
                interfaceC65512Tlh.AOi(this.A07);
            }
            IGPaymentMethodsAPI iGPaymentMethodsAPI = this.A06;
            java.util.Set singleton = Collections.singleton(EnumC61116RfW.CREDIT_CARD);
            C14360o3.A07(singleton);
            C1GJ.A03(new C60941Rbv(null, iGPaymentMethodsAPI, str, str2, singleton));
            C58444PvN c58444PvN = iGPaymentMethodsAPI.A01;
            C14360o3.A07(c58444PvN);
            C64197T3g c64197T3g = new C64197T3g(c58444PvN, new X58(C65061Tcq.A00, 48));
            this.A00 = c64197T3g;
            c64197T3g.A9a(this.A07);
        }
        return this.A03;
    }

    public C62706SMu(InterfaceC65612To3 interfaceC65612To3, C62655SKo c62655SKo, SCQ scq, IGPaymentMethodsAPI iGPaymentMethodsAPI) {
        this.A05 = scq;
        this.A06 = iGPaymentMethodsAPI;
        this.A04 = interfaceC65612To3;
        this.A02 = new C64197T3g(c62655SKo.A00(null), new X58(new DRW(this, 5), 48));
        this.A08 = iGPaymentMethodsAPI;
    }
}
