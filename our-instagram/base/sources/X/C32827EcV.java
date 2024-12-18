package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.user.model.User;

/* renamed from: X.EcV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32827EcV extends AbstractC46524KiP implements GZA {
    public FKT A00;
    public C2EC A01;
    public final UserSession A02;
    public final C2056398n A03;
    public final User A04;
    public final String A05;
    public final FragmentActivity A06;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        FKT fkt = new FKT(context, this.A02, this);
        this.A00 = fkt;
        return fkt.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (r6.getInt(X.AbstractC111324zv.A00(4031), 0) < X.C18U.A01(r5, r4, 36597970381507664L)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        if (X.C18U.A06(r5, r4, 36329315880681738L) != false) goto L32;
     */
    @Override // X.AbstractC46524KiP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.InterfaceC50428MOi r12, X.InterfaceC37159GYw r13, X.C2EC r14, java.lang.String r15, boolean r16) {
        /*
            r11 = this;
            r0 = 1
            X.C14360o3.A0B(r13, r0)
            if (r14 == 0) goto Lc0
            r7 = 0
            java.lang.String r1 = r11.A05
            java.lang.String r0 = "quick_promotions"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lba
            int r1 = r14.C7g()
            r0 = 29
            if (r1 != r0) goto Lc0
            com.instagram.common.session.UserSession r4 = r11.A02
            boolean r0 = X.C7HD.A00(r4)
            if (r0 == 0) goto Lc0
            com.instagram.user.model.User r0 = r11.A04
            X.17P r0 = r0.A03
            X.3jn r0 = r0.BdE()
            if (r0 == 0) goto L37
            java.lang.Boolean r0 = r0.BCU()
            if (r0 == 0) goto L37
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lc0
        L37:
            X.98n r0 = r11.A03
            X.0xq r6 = r0.A00
            java.lang.String r0 = "has_explicitly_dismissed_broadcast_channel_mimicry_upsell"
            boolean r0 = r6.getBoolean(r0, r7)
            if (r0 != 0) goto Lc0
            java.lang.String r0 = "broadcast_channel_mimicry_upsell_impression_count"
            int r1 = r6.getInt(r0, r7)
            r0 = 3
            if (r1 >= r0) goto Lc0
            java.lang.String r8 = r14.C7I()
            r0 = 4032(0xfc0, float:5.65E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r8)
            int r0 = r6.getInt(r0, r7)
            long r2 = (long) r0
            X.0Tz r5 = X.C06090Tz.A06
            r0 = 36597970381507664(0x8205a900170c50, double:3.208042065239023E-306)
            long r9 = X.C18U.A01(r5, r4, r0)
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto La2
            r0 = 4028(0xfbc, float:5.644E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r8)
            int r0 = r6.getInt(r0, r7)
            long r2 = (long) r0
            r0 = 36597970381442127(0x8205a900160c4f, double:3.208042065197577E-306)
            long r8 = X.C18U.A01(r5, r4, r0)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto La2
            r0 = 4031(0xfbf, float:5.649E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            int r0 = r6.getInt(r0, r7)
            long r2 = (long) r0
            r0 = 36597970381507664(0x8205a900170c50, double:3.208042065239023E-306)
            long r6 = X.C18U.A01(r5, r4, r0)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto Lc0
        La2:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316495405584842(0x8105a9002311ca, double:3.030036157056676E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto Lc0
            r0 = 36329315880681738(0x8111520000410a, double:3.0381438771318626E-306)
            boolean r0 = X.C18U.A06(r5, r4, r0)
            if (r0 != 0) goto Lc0
        Lba:
            r11.A01 = r14
            r13.Dpu(r11)
            return
        Lc0:
            r13.onFailure()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32827EcV.A07(X.MOi, X.GYw, X.2EC, java.lang.String, boolean):void");
    }

    @Override // X.AbstractC46524KiP
    public final void A04(boolean z) {
        InterfaceC19630xq interfaceC19630xq = this.A03.A00;
        AbstractC167017dG.A1L(interfaceC19630xq.ARD(), interfaceC19630xq, "broadcast_channel_mimicry_upsell_impression_count", 0);
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            C142846ck A00 = AbstractC147806l5.A00(this.A02);
            int AdZ = c2ec.AdZ();
            String C7I = c2ec.C7I();
            String C7q = c2ec.C7q();
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, A00);
                AbstractC31174DnI.A1J(A0I, "mimicry_upsell_banner_rendered");
                A0I.A0o("mimicry_upsell_banner");
                A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_view", C7I, C7q, AdZ));
                AbstractC31178DnM.A1G(A0I, "entrypoint", "mimicry_upsell_composer_banner");
            }
        }
    }

    @Override // X.GZA
    public final void onActionClicked() {
        AbstractC35055FcS.A02(this.A02, ChannelCreationSource.A07, EnumC33330EoP.A02).Cgf(this.A06);
        InterfaceC19610xo ARD = this.A03.A00.ARD();
        ARD.E77("has_explicitly_dismissed_broadcast_channel_mimicry_upsell", true);
        ARD.apply();
        FKT fkt = this.A00;
        if (fkt != null) {
            fkt.A01.setVisibility(8);
        }
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        InterfaceC19610xo ARD = this.A03.A00.ARD();
        ARD.E77("has_explicitly_dismissed_broadcast_channel_mimicry_upsell", true);
        ARD.apply();
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            C142846ck A00 = AbstractC147806l5.A00(this.A02);
            int AdZ = c2ec.AdZ();
            String C7I = c2ec.C7I();
            String C7q = c2ec.C7q();
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, A00);
                AbstractC31174DnI.A1I(A0I, "mimicry_upsell_banner_cancelled");
                A0I.A0o("mimicry_upsell_banner");
                A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_view", C7I, C7q, AdZ));
                AbstractC31178DnM.A1G(A0I, "entrypoint", "mimicry_upsell_composer_banner");
            }
        }
        InterfaceC50429MOj interfaceC50429MOj = super.A00;
        if (interfaceC50429MOj != null) {
            interfaceC50429MOj.onDismiss();
        }
    }

    public C32827EcV(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A06 = fragmentActivity;
        this.A02 = userSession;
        this.A05 = str;
        this.A03 = AbstractC2056298m.A00(userSession);
        this.A04 = AbstractC166987dD.A10(userSession);
    }
}
