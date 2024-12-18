package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.C2b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27276C2b extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorAgentThreadSettingsDetailFragment";
    public InterfaceC56362iU A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        C14360o3.A0B(layoutInflater, 0);
        super.afterOnCreateView(layoutInflater, viewGroup, bundle, view);
        C36731GHa c36731GHa = new C36731GHa((CompoundButton.OnCheckedChangeListener) C28694Clg.A00, (CharSequence) "", false);
        setItems(AbstractC166987dD.A1J(c36731GHa));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCM(viewLifecycleOwner, c36731GHa, c07s, this, null, 11), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "creator_agent_thread_settings_thread_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C27276C2b() {
        C29887DGb A00 = C29887DGb.A00(this, 31);
        C29887DGb A002 = C29887DGb.A00(this, 28);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A003 = AbstractC09440dt.A00(enumC09460dv, C29887DGb.A00(A002, 29));
        this.A06 = AbstractC25225BEi.A0a(C29887DGb.A00(A003, 30), A00, new C50169MDw(11, A003, null), AbstractC25225BEi.A1D(C25839Bbu.class));
        this.A04 = AbstractC60492pY.A02(this);
        this.A02 = C1XM.A00(C29887DGb.A00(this, 27));
        this.A01 = DH5.A01(this, "is_enabled_map", enumC09460dv, 7);
        this.A03 = DH5.A01(this, AbstractC111324zv.A00(2845), enumC09460dv, 8);
        this.A05 = DH5.A01(this, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, enumC09460dv, 9);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(((C32063E6p) ((C25839Bbu) this.A06.getValue()).A06.getValue()).A01);
        this.A00 = interfaceC56362iU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r10 == false) goto L11;
     */
    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = -1326124388(0xffffffffb0f4f29c, float:-1.782229E-9)
            int r2 = X.C0f9.A02(r0)
            super.onCreate(r12)
            X.0do r0 = r11.A06
            java.lang.Object r4 = r0.getValue()
            X.Bbu r4 = (X.C25839Bbu) r4
            java.util.Map r6 = r4.A04
            java.util.Collection r1 = r6.values()
            r8 = 0
            if (r1 == 0) goto L7d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L7d
        L21:
            r9 = 1
        L22:
            X.0cb r1 = X.C17060sy.A01
            com.instagram.common.session.UserSession r0 = r4.A00
            com.instagram.user.model.User r0 = r1.A01(r0)
            X.6ql r5 = r4.A01
            boolean r10 = r0.CS0(r5)
            com.instagram.user.model.User r3 = r4.A02
            java.lang.String r0 = r3.getId()
            java.lang.Object r0 = r6.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = X.AbstractC167007dF.A1T(r0)
            boolean r0 = r3.CS0(r5)
            if (r1 != 0) goto L6d
            r6 = 2131952644(0x7f130404, float:1.9541737E38)
            if (r10 != 0) goto L77
        L4b:
            X.05A r1 = r4.A05
        L4d:
            java.lang.Object r0 = r1.getValue()
            java.lang.String r5 = X.AbstractC101904i3.A07(r3)
            X.C14360o3.A07(r5)
            r7 = 2131953387(0x7f1306eb, float:1.9543244E38)
            X.E6p r4 = new X.E6p
            r4.<init>(r5, r6, r7, r8, r9, r10)
            boolean r0 = r1.AIi(r0, r4)
            if (r0 == 0) goto L4d
            r0 = -1981233111(0xffffffff89e8c829, float:-5.6040198E-33)
            X.C0f9.A09(r0, r2)
            return
        L6d:
            if (r10 == 0) goto L79
            r6 = 2131953386(0x7f1306ea, float:1.9543242E38)
            if (r0 == 0) goto L77
            r6 = 2131952645(0x7f130405, float:1.9541739E38)
        L77:
            r8 = 1
            goto L4b
        L79:
            r6 = 2131952646(0x7f130406, float:1.954174E38)
            goto L77
        L7d:
            java.util.Iterator r1 = r1.iterator()
        L81:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()
            boolean r0 = X.AbstractC166987dD.A1a(r0)
            if (r0 != 0) goto L81
            r9 = 0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27276C2b.onCreate(android.os.Bundle):void");
    }
}
