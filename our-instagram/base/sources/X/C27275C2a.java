package X;

import android.content.Context;
import android.os.Bundle;

/* renamed from: X.C2a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27275C2a extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AccessibilityOptionsFragment";
    public C27895CRg A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        Context requireContext = requireContext();
        int i = 2131952031;
        if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A01, 0), 36322860544895683L)) {
            i = 2131952033;
        }
        interfaceC56362iU.setTitle(requireContext.getString(i));
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "settings_accessibility_options";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-926963221);
        super.onCreate(bundle);
        this.A00 = new C27895CRg(this, AbstractC166987dD.A0r(this.A01));
        C0f9.A09(-1306899449, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36328173419445542L) != false) goto L12;
     */
    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r8 = this;
            r0 = 1785632669(0x6a6e979d, float:7.211008E25)
            int r5 = X.C0f9.A02(r0)
            super.onResume()
            java.util.ArrayList r6 = X.AbstractC166987dD.A1E()
            X.CRg r7 = r8.A00
            if (r7 != 0) goto L1c
            java.lang.String r0 = "accessibilityOptionsController"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1c:
            androidx.fragment.app.FragmentActivity r4 = r7.A00
            r1 = 2131973614(0x7f1355ee, float:1.9584269E38)
            r0 = 37
            X.ClE r0 = X.ViewOnClickListenerC28666ClE.A00(r7, r0)
            X.AbstractC25235BEs.A1C(r4, r0, r6, r1)
            com.instagram.common.session.UserSession r3 = r7.A01
            boolean r0 = X.AbstractC75373a4.A04(r3)
            if (r0 != 0) goto L38
            boolean r0 = X.AbstractC75373a4.A02(r3)
            if (r0 == 0) goto L48
        L38:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328173419445542(0x81104800013d26, double:3.03742138004577E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 2131973571(0x7f1355c3, float:1.9584182E38)
            if (r0 == 0) goto L4b
        L48:
            r1 = 2131973570(0x7f1355c2, float:1.958418E38)
        L4b:
            r0 = 35
            X.ClE r0 = X.ViewOnClickListenerC28666ClE.A00(r7, r0)
            X.AbstractC25235BEs.A1C(r4, r0, r6, r1)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317783893481019(0x8106d50000163b, double:3.0308510019905427E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L6d
            r1 = 2131973572(0x7f1355c4, float:1.9584184E38)
            r0 = 36
            X.ClE r0 = X.ViewOnClickListenerC28666ClE.A00(r7, r0)
            X.AbstractC25235BEs.A1C(r4, r0, r6, r1)
        L6d:
            r2 = 2131957495(0x7f1316f7, float:1.9551576E38)
            r1 = 34
            X.FpM r0 = new X.FpM
            r0.<init>(r1, r4, r3)
            X.AbstractC25235BEs.A1C(r4, r0, r6, r2)
            r8.setItems(r6)
            r0 = 420182062(0x190b782e, float:7.210402E-24)
            X.C0f9.A09(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27275C2a.onResume():void");
    }
}
