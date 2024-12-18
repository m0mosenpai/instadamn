package X;

import android.os.Bundle;

/* renamed from: X.ELr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32323ELr extends AbstractC59962oe implements GWV {
    public static final String __redex_internal_original_name = "PartialContactImportPromptFragment";
    public C147036jf A00;
    public InterfaceC37264GbH A01;
    public String A02;
    public String A03;
    public final InterfaceC41501vz A05 = C31650DvG.A00(this, 67);
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "partial_ci_nux_prompt";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1281325907);
        this.A03 = AbstractC31175DnJ.A0Y(requireArguments(), "NUX_FLOW_TYPE");
        this.A01 = AbstractC34275F9v.A00(this);
        this.A00 = new C147036jf(this, AbstractC166987dD.A0r(this.A04));
        super.onCreate(bundle);
        C0f9.A09(264352955, A02);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            r0 = -939382882(0xffffffffc802279e, float:-133278.47)
            int r3 = X.C0f9.A02(r0)
            r1 = 0
            X.C14360o3.A0B(r10, r1)
            r0 = 2131628141(0x7f0e106d, float:1.8883566E38)
            android.view.View r4 = r10.inflate(r0, r11, r1)
            r0 = 2131441495(0x7f0b3757, float:1.8505003E38)
            android.view.View r1 = X.AbstractC166997dE.A0S(r4, r0)
            r0 = 17
            X.ViewOnClickListenerC31724DwT.A00(r1, r0, r9)
            X.0do r6 = r9.A04
            X.0ll r5 = X.AbstractC166987dD.A0o(r6)
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36603747111277535(0x820aea000413df, double:3.211695292406513E-306)
            int r0 = X.AbstractC25225BEi.A07(r2, r5, r0)
            r7 = 1
            r5 = 0
            if (r0 == 0) goto L9b
            if (r0 != r7) goto L55
            r0 = 2131437512(0x7f0b27c8, float:1.8496925E38)
            android.view.View r2 = X.AbstractC166997dE.A0R(r4, r0)
            com.instagram.igds.components.headline.IgdsHeadline r2 = (com.instagram.igds.components.headline.IgdsHeadline) r2
            android.content.Context r1 = r9.getContext()
            if (r1 == 0) goto L99
            r0 = 2131969325(0x7f13452d, float:1.957557E38)
            java.lang.String r0 = r1.getString(r0)
        L4b:
            r2.setHeadline(r0)
            r2.setBody(r5)
            java.lang.String r0 = "content_variant_1"
        L53:
            r9.A02 = r0
        L55:
            r0 = 2131429922(0x7f0b0a22, float:1.848153E38)
            android.view.View r1 = X.AbstractC166997dE.A0S(r4, r0)
            r0 = 18
            X.ViewOnClickListenerC31724DwT.A00(r1, r0, r9)
            r1 = 2131969318(0x7f134526, float:1.9575555E38)
            r0 = 2131969322(0x7f13452a, float:1.9575564E38)
            java.lang.String r8 = X.AbstractC25227BEk.A0v(r9, r0)
            android.text.SpannableStringBuilder r2 = X.AbstractC31178DnM.A08(r9, r8, r1)
            r1 = 5
            X.Dx2 r0 = new X.Dx2
            r0.<init>(r8, r9, r1)
            X.AnonymousClass773.A05(r2, r0, r8)
            r0 = 2131429240(0x7f0b0778, float:1.8480147E38)
            android.view.View r1 = X.AbstractC166997dE.A0R(r4, r0)
            com.instagram.igds.components.bulletcell.IgdsBulletCell r1 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r1
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r5, r0)
            com.instagram.igds.components.bulletcell.IgdsBulletCell.A00(r1, r5, r2)
            X.6jf r2 = r9.A00
            if (r2 != 0) goto L9e
            java.lang.String r0 = "contactImportLogger"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L99:
            r0 = r5
            goto L4b
        L9b:
            java.lang.String r0 = "content_variant_0"
            goto L53
        L9e:
            java.lang.String r1 = r9.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r2.A01(r0, r5, r1)
            X.0ll r1 = X.AbstractC166987dD.A0o(r6)
            java.lang.String r0 = "partial_contact_import"
            X.C35203Ffv.A01(r1, r0)
            r0 = -705259967(0xffffffffd5f69641, float:-3.389065E13)
            X.C0f9.A09(r0, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32323ELr.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-2083637731);
        super.onStart();
        AbstractC31176DnK.A0Q(this.A04).A01(this.A05, C36062Fvy.class);
        C0f9.A09(-673366777, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1596271321);
        super.onStop();
        AbstractC31176DnK.A0Q(this.A04).A02(this.A05, C36062Fvy.class);
        C0f9.A09(-1425058208, A02);
    }
}
