package X;

import android.os.Bundle;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs;

/* loaded from: classes9.dex */
public final class N8F extends AbstractC52114N4m {
    public static final String __redex_internal_original_name = "BrandedContentConsolidatedDisclosureFragment";
    public C64842wi A00;
    public String A01;
    public final InterfaceC41501vz A02;
    public final C64752wZ A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C50150MDd(this, 34));
    public final InterfaceC09390do A05;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e8, code lost:
    
        if (r0 != false) goto L7;
     */
    @Override // X.AbstractC52114N4m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r4 = 0
            X.C14360o3.A0B(r13, r4)
            r8 = r12
            super.onViewCreated(r13, r14)
            X.1Xa r7 = X.AbstractC54912fq.A00()
            X.0do r3 = r12.A09
            com.instagram.common.session.UserSession r6 = X.AbstractC166987dD.A0r(r3)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r5 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0C
            X.2fr r2 = X.AbstractC31175DnJ.A0S()
            r1 = 1
            X.P6y r0 = new X.P6y
            r0.<init>(r12, r1)
            r2.A00 = r0
            X.P75 r0 = X.P75.A00
            r2.A08 = r0
            X.2wi r1 = X.AbstractC31175DnJ.A0T(r12, r6, r2, r7, r5)
            r12.A00 = r1
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0F
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            X.C14360o3.A07(r0)
            r1.AVr(r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r12.A02
            if (r1 == 0) goto Leb
            java.lang.String r0 = r12.A01
            java.lang.String r7 = "live"
            boolean r0 = X.C14360o3.A0K(r0, r7)
            int r0 = X.AbstractC31175DnJ.A01(r0)
            r1.setVisibility(r0)
            r0 = 2131427510(0x7f0b00b6, float:1.8476638E38)
            android.view.ViewStub r0 = X.AbstractC167007dF.A0M(r13, r0)
            android.view.View r5 = r0.inflate()
            r0 = 2131427564(0x7f0b00ec, float:1.8476748E38)
            android.widget.TextView r2 = X.AbstractC166997dE.A0T(r5, r0)
            android.content.Context r1 = r5.getContext()
            r0 = 2131952336(0x7f1302d0, float:1.9541112E38)
            X.AbstractC31173DnH.A12(r1, r2, r0)
            r0 = 2131427517(0x7f0b00bd, float:1.8476652E38)
            android.view.View r1 = r5.requireViewById(r0)
            r0 = 40
            X.ViewOnClickListenerC55467OkM.A00(r1, r0, r12)
            r0 = 2131437018(0x7f0b25da, float:1.8495923E38)
            android.view.View r1 = r5.requireViewById(r0)
            r0 = 41
            X.ViewOnClickListenerC55467OkM.A00(r1, r0, r12)
            android.widget.TextView r6 = r12.A04()
            r6.setVisibility(r4)
            androidx.fragment.app.FragmentActivity r5 = r12.requireActivity()
            com.instagram.common.session.UserSession r4 = X.AbstractC166987dD.A0r(r3)
            java.lang.String r3 = "BrandedContentConsolidatedDisclosureFragment"
            X.0do r2 = r12.A05
            java.lang.Object r0 = r2.getValue()
            X.Mgz r0 = (X.C51047Mgz) r0
            java.lang.String r1 = r0.A05
            int r0 = r1.hashCode()
            switch(r0) {
                case 3230752: goto Lc3;
                case 3322092: goto Lcd;
                case 3496474: goto Ld5;
                case 109770997: goto Ldf;
                default: goto L9f;
            }
        L9f:
            r1 = 2131954162(0x7f1309f2, float:1.9544815E38)
        La2:
            android.text.SpannableStringBuilder r0 = X.AbstractC55199Oe9.A02(r5, r4, r3, r1)
            X.AbstractC31176DnK.A1G(r6, r0)
            java.lang.Object r7 = r2.getValue()
            X.07S r9 = X.C07S.RESUMED
            X.07X r6 = r12.getViewLifecycleOwner()
            X.2k6 r0 = X.C07Y.A00(r6)
            r10 = 0
            r11 = 26
            X.MCP r5 = new X.MCP
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.AbstractC166987dD.A1Z(r5, r0)
            return
        Lc3:
            java.lang.String r0 = "igtv"
            boolean r0 = r1.equals(r0)
            r1 = 2131954163(0x7f1309f3, float:1.9544817E38)
            goto Le8
        Lcd:
            boolean r0 = r1.equals(r7)
            r1 = 2131954164(0x7f1309f4, float:1.954482E38)
            goto Le8
        Ld5:
            java.lang.String r0 = "reel"
            boolean r0 = r1.equals(r0)
            r1 = 2131954165(0x7f1309f5, float:1.9544822E38)
            goto Le8
        Ldf:
            java.lang.String r0 = "story"
            boolean r0 = r1.equals(r0)
            r1 = 2131954166(0x7f1309f6, float:1.9544824E38)
        Le8:
            if (r0 != 0) goto La2
            goto L9f
        Leb:
            java.lang.String r0 = "inlineSearchBox"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N8F.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.2wZ, java.lang.Object] */
    public N8F() {
        C50150MDd c50150MDd = new C50150MDd(this, 38);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50150MDd(new C50150MDd(this, 35), 36));
        this.A05 = AbstractC25225BEi.A0a(new C50150MDd(A00, 37), c50150MDd, new MHW(44, (Object) null, A00), AbstractC25225BEi.A1D(C51047Mgz.class));
        this.A01 = "feed";
        AbstractC54912fq.A00();
        this.A03 = new Object();
        this.A02 = C56035Ou7.A00(this, 10);
    }

    @Override // X.AbstractC52114N4m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1932216321);
        super.onCreate(bundle);
        this.A01 = ((BrandedContentDisclosureArgs) this.A04.getValue()).A03;
        C0f9.A09(-96309732, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-352874927);
        super.onResume();
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A09)).A02(this.A02, C55980OtD.class);
        C0f9.A09(646805000, A02);
    }
}
