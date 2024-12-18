package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class EL4 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ChannelConfigureFragment";
    public IgTextView A00;
    public IgdsListCell A01;
    public IgdsListCell A02;
    public IgdsListCell A03;
    public IgdsListCell A04;
    public IgdsListCell A05;
    public IgdsListCell A06;
    public User A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final View.OnClickListener A0J;
    public final InterfaceC09390do A0K;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C5QE c5qe;
        int i;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.setTitle("");
        AbstractC31176DnK.A1C(ViewOnClickListenerC35681FpG.A00(this, 35), AbstractC31174DnI.A0K(), interfaceC56362iU);
        InterfaceC09390do interfaceC09390do = this.A0I;
        AbstractC31791DyA abstractC31791DyA = (AbstractC31791DyA) interfaceC09390do.getValue();
        if (abstractC31791DyA instanceof C32725Eaq) {
            C32725Eaq c32725Eaq = (C32725Eaq) abstractC31791DyA;
            if (AbstractC31791DyA.A00(c32725Eaq) == 2 && !c32725Eaq.A08) {
                C36299Fzu c36299Fzu = c32725Eaq.A04;
                C25531Mh A00 = C36299Fzu.A00(c36299Fzu);
                if (AbstractC25226BEj.A1Z(A00)) {
                    C36299Fzu.A04(A00, c36299Fzu);
                    AbstractC31174DnI.A1K(A00, "direct_invite_enter");
                    A00.A0o("direct_invite_next_button");
                    C36299Fzu.A05(A00, c36299Fzu, "chat_setup");
                    A00.Cht();
                }
                i = 2131959428;
            } else {
                i = 2131959423;
            }
            c5qe = BHS.A00(new Object[0], i);
        } else {
            c5qe = ((C32724Eap) abstractC31791DyA).A02;
        }
        String obj = BHX.A02(this, c5qe).toString();
        if (C14360o3.A0K(((AbstractC31791DyA) interfaceC09390do.getValue()).A0H.getValue(), C32722Ean.A00)) {
            interfaceC56362iU.ARc(true);
            interfaceC56362iU.setIsLoading(true);
        } else {
            if (this.A08) {
                interfaceC56362iU.setIsLoading(false);
                interfaceC56362iU.AAE(obj, this.A0J);
                return;
            }
            interfaceC56362iU.setIsLoading(false);
        }
        interfaceC56362iU.AAD(obj);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_interest_based_configure";
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x02b3, code lost:
    
        if (r0.BdF().size() < 5) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04b5  */
    /* JADX WARN: Type inference failed for: r0v175 */
    /* JADX WARN: Type inference failed for: r0v219 */
    /* JADX WARN: Type inference failed for: r0v220 */
    /* JADX WARN: Type inference failed for: r0v221 */
    /* JADX WARN: Type inference failed for: r0v68, types: [int] */
    /* JADX WARN: Type inference failed for: r0v78, types: [int] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r32, android.os.Bundle r33) {
        /*
            Method dump skipped, instructions count: 1558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EL4.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final EnumC33330EoP A00(EL4 el4) {
        return (EnumC33330EoP) el4.A0K.getValue();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C36299Fzu c36299Fzu = (C36299Fzu) this.A0H.getValue();
        ChannelCreationSource channelCreationSource = (ChannelCreationSource) this.A0A.getValue();
        C14360o3.A0B(channelCreationSource, 0);
        C25531Mh A00 = C36299Fzu.A00(c36299Fzu);
        if (AbstractC25226BEj.A1Z(A00)) {
            C36299Fzu.A04(A00, c36299Fzu);
            AbstractC31174DnI.A1K(A00, "exit_chat_setup_sheet");
            A00.A0o("back_button");
            C36299Fzu.A05(A00, c36299Fzu, "chat_setup");
            String str = channelCreationSource.A00;
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("chat_type", "public");
            if (str != null) {
                A1G.put("chat_creation_source", str);
            }
            C18U.A06(C06090Tz.A05, c36299Fzu.A03, 36327520584612494L);
            A00.A0v(A1G);
            A00.Cht();
        }
        return false;
    }

    public EL4() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0F = C37055GUl.A00(this, enumC09460dv, 9);
        this.A0H = C37055GUl.A00(this, enumC09460dv, 10);
        this.A0B = C37055GUl.A00(this, enumC09460dv, 7);
        this.A0E = C37055GUl.A00(this, enumC09460dv, 8);
        this.A0K = C37055GUl.A00(this, enumC09460dv, 6);
        this.A0A = DH5.A01(this, "social_channel_creation_source", enumC09460dv, 13);
        this.A0C = DH5.A01(this, "direct_channel_creation_flow_extra_args", enumC09460dv, 14);
        this.A0D = DH5.A01(this, "interest_based_channel_implicit_audience_type", enumC09460dv, 15);
        C37055GUl c37055GUl = new C37055GUl(this, 14);
        InterfaceC09390do A00 = C37055GUl.A00(new C37055GUl(this, 11), enumC09460dv, 12);
        this.A0I = AbstractC25225BEi.A0a(new C37055GUl(A00, 13), c37055GUl, new C50172MDz(28, null, A00), AbstractC25225BEi.A1D(AbstractC31791DyA.class));
        this.A0J = ViewOnClickListenerC35681FpG.A00(this, 36);
        this.A0G = AbstractC60492pY.A02(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r6.A0J == false) goto L21;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 12523177(0xbf16a9, float:1.7548709E-38)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r9)
            r0 = 0
            r8.A09 = r0
            X.0do r0 = r8.A0I
            java.lang.Object r6 = r0.getValue()
            X.DyA r6 = (X.AbstractC31791DyA) r6
            X.0cb r0 = X.C17060sy.A01
            com.instagram.common.session.UserSession r7 = r6.A05
            com.instagram.user.model.User r0 = r0.A01(r7)
            com.instagram.api.schemas.FanClubInfoDict r0 = X.AbstractC31172DnG.A0M(r0)
            if (r0 == 0) goto L71
            java.lang.Integer r0 = r0.C3U()
            if (r0 == 0) goto L71
            int r5 = r0.intValue()
        L2d:
            r6.A00 = r5
            X.05A r4 = r6.A09
            X.EoP r2 = r6.A07
            X.EoP r0 = X.EnumC33330EoP.A03
            r1 = 5
            if (r2 != r0) goto L68
            java.lang.Integer r0 = r6.A08
            if (r0 == 0) goto L50
            int r0 = r0.intValue()
            if (r0 != r1) goto L50
        L42:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.Egh(r0)
            r0 = -39315272(0xfffffffffda818b8, float:-2.7929831E37)
            X.C0f9.A09(r0, r3)
            return
        L50:
            boolean r0 = r6 instanceof X.C32725Eaq
            if (r0 == 0) goto L62
            r0 = r6
            X.Eaq r0 = (X.C32725Eaq) r0
            boolean r0 = r0.A07
        L59:
            if (r0 == 0) goto L60
            boolean r0 = r6.A0J
            r1 = 2
            if (r0 != 0) goto L42
        L60:
            r1 = 0
            goto L42
        L62:
            r0 = r6
            X.Eap r0 = (X.C32724Eap) r0
            boolean r0 = r0.A07
            goto L59
        L68:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            int r1 = X.AbstractC34071F1z.A00(r7, r0)
            goto L42
        L71:
            r5 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EL4.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1952507791);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_interest_channel_configure, false);
        C0f9.A09(414658317, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1275871771);
        super.onDestroy();
        if (!this.A09 && !AbstractC167007dF.A1Z(this.A0E)) {
            C31600DuS.A00(AbstractC166987dD.A0r(this.A0G), false).A0C(false, false);
            this.A09 = true;
        }
        C0f9.A09(1880854685, A02);
    }
}
