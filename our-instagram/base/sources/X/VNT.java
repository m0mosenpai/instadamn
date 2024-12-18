package X;

import com.facebook.R;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public abstract class VNT {
    /* JADX WARN: Type inference failed for: r2v3, types: [X.Vlh, X.UwC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.Vjc, X.Uw1] */
    public static final void A00(InterfaceC72013XFb interfaceC72013XFb, InterfaceC72013XFb interfaceC72013XFb2, InterfaceC72013XFb interfaceC72013XFb3, InterfaceC72013XFb interfaceC72013XFb4, ImmutableList.Builder builder, String str, String str2, String str3, String str4, InterfaceC16610sE interfaceC16610sE, double d, int i) {
        String A0d;
        int i2;
        VEP vep;
        if (d > 0.0d) {
            A0d = str3 != null ? AbstractC002300n.A0d(str3, "↑", "", false) : null;
            i2 = 2131969295;
        } else {
            A0d = str3 != null ? AbstractC002300n.A0d(str3, "↓", "", false) : null;
            i2 = 2131969294;
        }
        Waa waa = new Waa(new Object[]{interfaceC72013XFb, interfaceC72013XFb2, interfaceC72013XFb3, new Waa(new Object[]{new Wab(A0d)}, i2)}, 2131969293);
        ?? abstractC69335Vlh = new AbstractC69335Vlh(12);
        abstractC69335Vlh.A00 = new C70514WZv(null, 14, R.drawable.rounded_icon_background, R.dimen.account_recs_header_image_margin);
        ?? abstractC69209Vjc = new AbstractC69209Vjc();
        Uw5.A03(interfaceC72013XFb, abstractC69209Vjc, VEP.A0o);
        abstractC69209Vjc.A02 = new C69753Vuo(null, interfaceC72013XFb2, VEP.A0x);
        abstractC69209Vjc.A03 = new C69753Vuo(null, interfaceC72013XFb3, VEP.A14);
        if (d > 0.0d) {
            vep = VEP.A1D;
        } else {
            vep = VEP.A1C;
        }
        abstractC69209Vjc.A01 = new C69753Vuo(null, interfaceC72013XFb4, vep);
        WDT wdt = new WDT(null, null, C05F.A00, false, false, false);
        wdt.A01 = waa;
        wdt.A04 = false;
        abstractC69209Vjc.A01 = new W4A(wdt);
        abstractC69335Vlh.A02 = new C67684UwB(abstractC69209Vjc);
        ?? abstractC69209Vjc2 = new AbstractC69209Vjc();
        abstractC69209Vjc2.A01 = new C69753Vuo(null, new Waa(new Object[0], 2131976839), VEP.A13);
        abstractC69209Vjc2.A00 = new C70514WZv(6, null, R.drawable.button_background, 0);
        abstractC69209Vjc2.A00 = new WMd(str2, str, str4, interfaceC16610sE);
        abstractC69209Vjc2.A01 = new W4A(new WDT(null, new Waa(new Object[0], i), C05F.A01, true, false, false));
        abstractC69335Vlh.A01 = new Uw6(abstractC69209Vjc2);
        builder.add((Object) new C67693UwK(abstractC69335Vlh));
    }
}
