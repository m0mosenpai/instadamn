package X;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* renamed from: X.Dzm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31880Dzm extends C2UU {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final ChannelCreationFlowExtraArgs A02;
    public final ChannelCreationSource A03;
    public final EnumC33330EoP[] A04;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new E3F(this.A01, this.A00, AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.interest_based_channel_chooser_item, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r12, int r13) {
        /*
            r11 = this;
            X.E3F r12 = (X.E3F) r12
            r5 = 0
            X.C14360o3.A0B(r12, r5)
            com.instagram.common.session.UserSession r6 = r12.A02
            r0 = 0
            int r9 = X.AbstractC34071F1z.A00(r6, r0)
            X.EoP[] r0 = r11.A04
            r4 = r0[r13]
            X.C14360o3.A0B(r4, r5)
            r0 = 1
            int r3 = r4.ordinal()
            if (r3 == r5) goto Lce
            if (r3 != r0) goto Lee
            if (r9 == r0) goto Lc1
            r0 = 2
            if (r9 == r0) goto Lb9
            r0 = 0
        L23:
            r8 = 2131238111(0x7f081cdf, float:1.8092491E38)
            r7 = 2131959477(0x7f131eb5, float:1.9555596E38)
            X.0Tz r10 = X.C06090Tz.A05
            r1 = 36315846868995720(0x81051200580e88, double:3.029626019906268E-306)
            boolean r1 = X.C18U.A06(r10, r6, r1)
            if (r1 == 0) goto La4
            r2 = 2131959482(0x7f131eba, float:1.9555606E38)
        L39:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r12.A03
            r0.setImageResource(r8)
            android.widget.TextView r0 = r12.A00
            r0.setText(r7)
            android.widget.TextView r0 = r12.A01
            r0.setText(r2)
            r0 = 1
            if (r3 == r0) goto L7f
            if (r3 != r5) goto Le9
            com.instagram.common.session.UserSession r0 = r11.A01
            X.Fzu r1 = X.AbstractC34060F1n.A00(r0)
            X.1Mh r2 = X.C36299Fzu.A00(r1)
            boolean r0 = X.AbstractC25226BEj.A1Z(r2)
            if (r0 == 0) goto L77
            X.C36299Fzu.A04(r2, r1)
            java.lang.String r0 = "create_social_channel_button_rendered"
            X.AbstractC31174DnI.A1J(r2, r0)
            java.lang.String r0 = "create_public_chat_item"
            r2.A0o(r0)
            java.lang.String r0 = "create_channel"
            X.AbstractC31175DnJ.A1D(r2, r0)
            java.lang.String r0 = r1.A00
        L71:
            r2.A0u(r0)
            r2.Cht()
        L77:
            android.view.View r1 = r12.itemView
            r0 = 53
            X.ViewOnClickListenerC35683FpI.A00(r1, r0, r4, r11)
            return
        L7f:
            com.instagram.common.session.UserSession r0 = r11.A01
            X.6ck r1 = X.AbstractC147806l5.A00(r0)
            X.1Mh r2 = X.AbstractC31172DnG.A0I(r1)
            boolean r0 = X.AbstractC25226BEj.A1Z(r2)
            if (r0 == 0) goto L77
            X.AbstractC31175DnJ.A1B(r2, r1)
            java.lang.String r0 = "broadcast_chat_option_viewed"
            X.AbstractC31174DnI.A1J(r2, r0)
            java.lang.String r0 = "create_broadcast_chat_item"
            r2.A0o(r0)
            java.lang.String r0 = "create_channel"
            X.AbstractC31175DnJ.A1D(r2, r0)
            java.lang.String r0 = r1.A01
            goto L71
        La4:
            r1 = 2
            if (r0 == 0) goto Lb0
            r2 = 2131959479(0x7f131eb7, float:1.95556E38)
            if (r9 != r1) goto L39
            r2 = 2131959481(0x7f131eb9, float:1.9555604E38)
            goto L39
        Lb0:
            r2 = 2131959478(0x7f131eb6, float:1.9555598E38)
            if (r9 != r1) goto L39
            r2 = 2131959480(0x7f131eb8, float:1.9555602E38)
            goto L39
        Lb9:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316495404470718(0x8105a9001211be, double:3.0300361563520995E-306)
            goto Lc8
        Lc1:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316495403684274(0x8105a9000611b2, double:3.030036155854749E-306)
        Lc8:
            boolean r0 = X.C18U.A06(r2, r6, r0)
            goto L23
        Lce:
            r8 = 2131238115(0x7f081ce3, float:1.80925E38)
            r7 = 2131959483(0x7f131ebb, float:1.9555608E38)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36315846868995720(0x81051200580e88, double:3.029626019906268E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            r2 = 2131959484(0x7f131ebc, float:1.955561E38)
            if (r0 == 0) goto L39
            r2 = 2131959485(0x7f131ebd, float:1.9555612E38)
            goto L39
        Le9:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lee:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31880Dzm.onBindViewHolder(X.3OO, int):void");
    }

    public C31880Dzm(FragmentActivity fragmentActivity, UserSession userSession, ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs, ChannelCreationSource channelCreationSource) {
        AbstractC167017dG.A1R(userSession, channelCreationSource);
        C14360o3.A0B(channelCreationFlowExtraArgs, 5);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = channelCreationSource;
        this.A02 = channelCreationFlowExtraArgs;
        this.A04 = EnumC33330EoP.values();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1656231100);
        int length = this.A04.length;
        C0f9.A0A(315630908, A03);
        return length;
    }
}
