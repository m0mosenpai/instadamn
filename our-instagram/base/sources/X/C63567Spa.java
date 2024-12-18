package X;

import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutPuxLink;

/* renamed from: X.Spa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63567Spa implements C1N8 {
    public static final C63567Spa A00 = new C63567Spa();

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        R0Z r0z;
        C2JS A02;
        C2JS A03;
        C2JS c2js = (C2JS) obj;
        if (c2js != null && (A02 = c2js.A02(C59054QVm.class, "pux_component", 542300976)) != null && (A03 = A02.A03(C59053QVl.class, "exit_flow_cta", 1606310947)) != null) {
            r0z = (R0Z) A03.A01(R0Z.class, 1825808236);
        } else {
            r0z = null;
        }
        return new AnonCheckoutPuxLink(r0z, VG3.A09, false);
    }
}
