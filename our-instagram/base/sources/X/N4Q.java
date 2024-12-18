package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class N4Q extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ClipsTrialSettingsBottomSheetFragment";
    public InterfaceC16660sJ A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A01 = __redex_internal_original_name;
    public final InterfaceC09390do A03 = C1XM.A00(new C57239PbN(this, 29));

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        if (r1 == false) goto L23;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            super.onViewCreated(r7, r8)
            r0 = 2131430294(0x7f0b0b96, float:1.8482285E38)
            android.view.View r1 = r7.findViewById(r0)
            com.instagram.igds.components.headline.IgdsHeadline r1 = (com.instagram.igds.components.headline.IgdsHeadline) r1
            if (r1 == 0) goto L18
            r0 = 2131956095(0x7f13117f, float:1.9548736E38)
            r1.setHeadline(r0)
        L18:
            r0 = 2131430291(0x7f0b0b93, float:1.8482279E38)
            android.view.View r5 = r7.findViewById(r0)
            com.instagram.igds.components.bulletcell.IgdsBulletCell r5 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r5
            r4 = 0
            if (r5 == 0) goto L4a
            r0 = 2131238326(0x7f081db6, float:1.8092928E38)
            r5.setIcon(r0)
            X.0do r0 = r6.A02
            X.0ll r3 = X.AbstractC166987dD.A0o(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325166943515459(0x810d8c00133343, double:3.035520072561479E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 2131956086(0x7f131176, float:1.9548718E38)
            if (r1 == 0) goto L43
            r0 = 2131956087(0x7f131177, float:1.954872E38)
        L43:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.setText(r4, r0)
        L4a:
            r0 = 2131430293(0x7f0b0b95, float:1.8482283E38)
            android.view.View r1 = r7.findViewById(r0)
            com.instagram.igds.components.bulletcell.IgdsBulletCell r1 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r1
            if (r1 == 0) goto L65
            r0 = 2131239011(0x7f082063, float:1.8094317E38)
            r1.setIcon(r0)
            r0 = 2131956088(0x7f131178, float:1.9548722E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setText(r4, r0)
        L65:
            r0 = 2131443007(0x7f0b3d3f, float:1.850807E38)
            android.widget.ImageView r1 = X.AbstractC31171DnF.A08(r7, r0)
            if (r1 == 0) goto L74
            r0 = 2131237978(0x7f081c5a, float:1.8092222E38)
            r1.setImageResource(r0)
        L74:
            r0 = 2131443017(0x7f0b3d49, float:1.850809E38)
            android.widget.TextView r2 = X.AbstractC166987dD.A0e(r7, r0)
            if (r2 == 0) goto L9c
            X.0cb r1 = X.C17060sy.A01
            X.0do r0 = r6.A02
            com.instagram.user.model.User r0 = X.AbstractC31176DnK.A0g(r1, r0)
            X.17P r0 = r0.A03
            java.lang.Boolean r0 = r0.BD0()
            if (r0 == 0) goto L96
            boolean r1 = r0.booleanValue()
            r0 = 2131956094(0x7f13117e, float:1.9548734E38)
            if (r1 != 0) goto L99
        L96:
            r0 = 2131956093(0x7f13117d, float:1.9548732E38)
        L99:
            r2.setText(r0)
        L9c:
            X.0do r0 = r6.A02
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r0)
            X.0do r0 = r6.A03
            java.lang.String r0 = X.AbstractC25225BEi.A15(r0)
            X.6w2 r4 = X.AbstractC153926w1.A01(r6, r1, r0)
            r0 = 2131442996(0x7f0b3d34, float:1.8508048E38)
            android.view.View r2 = r7.findViewById(r0)
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            if (r2 == 0) goto Lc9
            android.os.Bundle r1 = r6.mArguments
            if (r1 == 0) goto Lf9
            java.lang.String r0 = "initial_auto_graduation_key"
            boolean r0 = r1.getBoolean(r0)
        Lc1:
            r2.setChecked(r0)
            r0 = 8
            X.C55518OlC.A00(r2, r4, r6, r0)
        Lc9:
            r0 = 2131430295(0x7f0b0b97, float:1.8482287E38)
            android.view.View r3 = r7.findViewById(r0)
            X.64P r3 = (X.C64P) r3
            if (r3 == 0) goto Lef
            r1 = 48
            X.Gog r0 = new X.Gog
            r0.<init>(r1, r4, r6)
            r3.setPrimaryActionOnClickListener(r0)
            r0 = 2131965052(0x7f13347c, float:1.9566903E38)
            java.lang.String r2 = r6.getString(r0)
            r1 = 49
            X.Gog r0 = new X.Gog
            r0.<init>(r1, r4, r6)
            r3.setSecondaryAction(r2, r0)
        Lef:
            java.lang.String r2 = "client"
            java.lang.String r1 = "trial_settings"
            java.lang.String r0 = "impression"
            X.C153936w2.A05(r4, r2, r1, r0)
            return
        Lf9:
            r0 = 0
            goto Lc1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4Q.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-374455614);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_trial_bottomsheet, viewGroup, false);
        C0f9.A09(-1197754690, A02);
        return inflate;
    }
}
