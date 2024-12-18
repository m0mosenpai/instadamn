package X;

import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public abstract class EOD extends AbstractC43842Ja5 implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ChannelDiscoveryFragment";
    public C5e4 A00;
    public String A01;
    public final InterfaceC62602sz A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final InterfaceC41501vz A06;

    public final void A0D(View view, String str, String str2, int i) {
        C31659DvP.A00(new RectF(), view, new C31446Drq(i, str, null, null), (C31659DvP) this.A03.getValue(), null, C4I1.A00, null, null, new DirectThreadKey(str, null), str2, null, AbstractC166987dD.A1J(40), false, false);
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C0UO A0A = A0C().A0A();
        AbstractC18560vj.A03(AbstractC25235BEs.A0S(this), new C15340po(new GST(this, null, 16), AbstractC33634Etk.A00(C07S.STARTED, getViewLifecycleOwner().getLifecycle(), A0A)));
        A0C().A0E();
        G7M.A00(getRecyclerView(), this, 2);
        UserSession A0r = AbstractC166987dD.A0r(this.A05);
        EZ9 ez9 = new EZ9(this, 1);
        C14360o3.A0B(A0r, 0);
        C1GJ.A06(AbstractC121115e3.A01(A0r, ez9), 1967622104, 2, false, false);
    }

    public final ChannelDiscoveryViewModel A0C() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C32727Eas) {
            interfaceC09390do = ((C32727Eas) this).A01;
        } else {
            interfaceC09390do = ((C32726Ear) this).A00;
        }
        return (ChannelDiscoveryViewModel) interfaceC09390do.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        A0C().A0C(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(java.lang.Integer r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            java.lang.String r1 = "s"
            java.lang.String r0 = "inbox_channel_invitation"
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r0)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "st"
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r0, r1)
            java.lang.String r1 = "scid"
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r8)
            android.util.Pair[] r0 = new android.util.Pair[]{r3, r2, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            X.C14360o3.A07(r0)
            java.lang.String r3 = X.AbstractC35186Ffe.A02(r7, r0)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0do r0 = r4.A05
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r0)
            java.lang.String r0 = r4.getModuleName()
            X.AbstractC41776Ies.A0C(r2, r1, r3, r0)
            X.5e4 r1 = r4.A00
            java.lang.String r2 = "banyanClient"
            if (r1 == 0) goto L70
            java.lang.String r0 = "direct_ibc_inbox_invitations"
            X.5eT r0 = r1.A01(r0)
            java.util.List r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        L4d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L68
            com.instagram.model.direct.DirectShareTarget r0 = X.AbstractC31172DnG.A0m(r1)
            java.lang.String r0 = r0.A08()
            boolean r0 = X.C2I7.A00(r0, r6)
            if (r0 == 0) goto L4d
            X.5e4 r0 = r4.A00
            if (r0 == 0) goto L70
            r0.A07(r6)
        L68:
            com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r0 = r4.A0C()
            r0.A0C(r6)
            return
        L70:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EOD.A0E(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        if (this instanceof C32727Eas) {
            C32727Eas c32727Eas = (C32727Eas) this;
            C14360o3.A0B(interfaceC56362iU, 0);
            interfaceC56362iU.Efu(2131959459);
            interfaceC56362iU.EkS(true);
            if (c32727Eas.A00.getValue() == EnumC33329EoO.A02) {
                InterfaceC09390do interfaceC09390do = ((EOD) c32727Eas).A05;
                if (C7HD.A00(AbstractC166987dD.A0r(interfaceC09390do))) {
                    if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36319377328840004L)) {
                        C3LO A0B = AbstractC31171DnF.A0B();
                        A0B.A0C = 2131959424;
                        A0B.A0P = true;
                        A0B.A02 = AbstractC31173DnH.A03(c32727Eas.getContext(), c32727Eas.requireContext(), R.attr.igds_color_creation_tools_blue);
                        AbstractC31176DnK.A1B(ViewOnClickListenerC35681FpG.A00(c32727Eas, 44), A0B, interfaceC56362iU);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131959581);
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new GWH(this, 22));
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public EOD() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A04 = C37055GUl.A00(this, enumC09460dv, 25);
        this.A03 = C37055GUl.A00(this, enumC09460dv, 24);
        this.A06 = C31650DvG.A00(this, 19);
        this.A02 = new C36745GHo(this, 3);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 107 && intent != null) {
            String stringExtra = intent.getStringExtra(AbstractC111324zv.A00(1596));
            if (stringExtra != null) {
                A0C().A0F(stringExtra);
                return;
            }
            String stringExtra2 = intent.getStringExtra(AbstractC111324zv.A00(1597));
            if (stringExtra2 == null) {
                return;
            }
            A0C().A0C(stringExtra2);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-400354571);
        super.onDestroy();
        AbstractC31176DnK.A0Q(this.A05).A02(this.A06, C36067Fw3.class);
        C0f9.A09(230753753, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(632209363);
        super.onResume();
        AbstractC31176DnK.A0Q(this.A05).A01(this.A06, C36067Fw3.class);
        C0f9.A09(1466695201, A02);
    }
}
