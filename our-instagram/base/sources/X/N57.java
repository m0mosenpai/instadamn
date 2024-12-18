package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes9.dex */
public final class N57 extends AbstractC59962oe {
    public EnumC53255Ngt A00;
    public IgLinearLayout A01;
    public IgdsBottomButtonLayout A02;
    public IgdsHeadline A03;
    public C55011OVw A04;
    public boolean A05;
    public boolean A06;
    public String A07;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public static final String __redex_internal_original_name = "ReelsShareToFbUpsellFragment";
    public static final CallerContext A09 = CallerContext.A01(__redex_internal_original_name);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r4 != 5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        if (r2 == 5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014b, code lost:
    
        if (r4 != 5) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C51624MrH r12, X.N57 r13, java.lang.Integer r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N57.A02(X.MrH, X.N57, java.lang.Integer, boolean, boolean):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reels_share_to_fb_upsell_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = (IgdsHeadline) requireView().requireViewById(R.id.headline);
        this.A02 = AbstractC31172DnG.A0j(requireView(), R.id.bottom_buttons);
        this.A01 = (IgLinearLayout) requireView().requireViewById(R.id.custom_button_container);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57166PZk(c07s, this, viewLifecycleOwner, null, 16), C07Y.A00(viewLifecycleOwner));
        InterfaceC09390do interfaceC09390do = this.A08;
        C46552Bt A00 = AbstractC46542Bs.A00(AbstractC166987dD.A0r(interfaceC09390do));
        C55011OVw c55011OVw = this.A04;
        String str = "params";
        if (c55011OVw != null) {
            if (!c55011OVw.A01()) {
                A00.A01(A00.A04.getInt("PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_VIEW_COUNT", 0) + 1);
                A00.A02(System.currentTimeMillis());
            }
            C22C A0T = AbstractC43593JPy.A0T(interfaceC09390do);
            C55011OVw c55011OVw2 = this.A04;
            if (c55011OVw2 != null) {
                MYO myo = c55011OVw2.A03;
                Boolean A0b = AbstractC166997dE.A0b();
                String str2 = c55011OVw2.A06;
                EnumC53255Ngt enumC53255Ngt = this.A00;
                if (enumC53255Ngt == null) {
                    str = "designVariant";
                } else {
                    String str3 = enumC53255Ngt.A01;
                    C448824s c448824s = A0T.A0G;
                    C14360o3.A0B(str3, 3);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448824s.A01, "ig_camera_ui_tool_impression");
                    if (A0f.isSampled()) {
                        MSW.A1N(C81X.A2H, A0f);
                        MSW.A1V(A0f, "IG_CAMERA_CLIPS_SHARE_TO_FACEBOOK_PRIMER_IMPRESSION");
                        C22M c22m = c448824s.A04;
                        AbstractC166987dD.A1S(A0f, MSX.A0f(c22m));
                        AbstractC167017dG.A1A(c22m.A09, A0f);
                        MSZ.A1A(EnumC50631MWs.A0I, A0f);
                        MSZ.A1B(myo, A0f, "media_source");
                        if (str2 == null) {
                            str2 = C22F.A08.getModuleName();
                        }
                        AbstractC31171DnF.A1D(A0f, str2);
                        A0f.A7v("is_crosspost", A0b);
                        AbstractC37302Gc3.A0t(A0f);
                        AbstractC50523MSb.A0z(A0f, str3);
                    }
                    EnumC201098ur enumC201098ur = EnumC201098ur.VIEW;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    C55011OVw c55011OVw3 = this.A04;
                    if (c55011OVw3 != null) {
                        A01(enumC201098ur, A0r, this, c55011OVw3, null);
                        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                        C55011OVw c55011OVw4 = this.A04;
                        if (c55011OVw4 != null) {
                            C197838ou.A01(c55011OVw4.A01, c55011OVw4.A02, A0r2);
                            UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                            C55011OVw c55011OVw5 = this.A04;
                            if (c55011OVw5 != null) {
                                C35038FcB A01 = FXY.A01(A0r3, c55011OVw5.A00);
                                if (A01 != null) {
                                    A01.A00();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(EnumC201098ur enumC201098ur, UserSession userSession, N57 n57, C55011OVw c55011OVw, String str) {
        long j;
        C82H c82h = c55011OVw.A02;
        if (c82h.ordinal() == 4) {
            j = AbstractC31172DnG.A01(AbstractC46542Bs.A00(userSession).A04, "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_VIEW_COUNT");
        } else {
            j = 0;
        }
        boolean A1X = MSZ.A1X(C196068lw.A00(userSession), __redex_internal_original_name);
        C82G c82g = c55011OVw.A01;
        C82I A0H = MSW.A0H();
        A0H.A06("waterfall_id", c55011OVw.A07);
        MSX.A1I(A0H, A1X);
        AbstractC50523MSb.A18(A0H, j);
        AbstractC50523MSb.A19(A0H, "ig_media_id", n57.A07, str);
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
    }

    public static final void A03(N57 n57) {
        String str;
        InterfaceC09390do interfaceC09390do = n57.A08;
        if (C200108tF.A03(null, AbstractC166987dD.A0r(interfaceC09390do))) {
            C22C A0T = AbstractC43593JPy.A0T(interfaceC09390do);
            C55011OVw c55011OVw = n57.A04;
            str = "params";
            if (c55011OVw != null) {
                MYO myo = c55011OVw.A03;
                String str2 = c55011OVw.A06;
                EnumC53255Ngt enumC53255Ngt = n57.A00;
                if (enumC53255Ngt == null) {
                    str = "designVariant";
                } else {
                    A0T.A19(myo, true, str2, enumC53255Ngt.A01, true);
                    EnumC201098ur enumC201098ur = EnumC201098ur.ACCEPT;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    C55011OVw c55011OVw2 = n57.A04;
                    if (c55011OVw2 != null) {
                        A01(enumC201098ur, A0r, n57, c55011OVw2, null);
                        C200108tF.A01.A0C(AbstractC166987dD.A0r(interfaceC09390do), "UPSELL", true, true);
                        Intent putExtra = AbstractC31171DnF.A04().putExtra("ARG_MEDIA_ID", n57.A07);
                        C14360o3.A07(putExtra);
                        n57.requireActivity().setResult(1, putExtra);
                        AbstractC25233BEq.A14(n57);
                        return;
                    }
                }
            }
        } else {
            IgdsBottomButtonLayout igdsBottomButtonLayout = n57.A02;
            if (igdsBottomButtonLayout == null) {
                str = "bottomButtons";
            } else {
                igdsBottomButtonLayout.setVisibility(8);
                IgLinearLayout igLinearLayout = n57.A01;
                if (igLinearLayout == null) {
                    str = "customButtonContainer";
                } else {
                    igLinearLayout.setVisibility(8);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A04(N57 n57) {
        EnumC201098ur enumC201098ur;
        InterfaceC09390do interfaceC09390do = n57.A08;
        C22C A0T = AbstractC43593JPy.A0T(interfaceC09390do);
        C55011OVw c55011OVw = n57.A04;
        String str = "params";
        if (c55011OVw != null) {
            MYO myo = c55011OVw.A03;
            Boolean A0b = AbstractC166997dE.A0b();
            String str2 = c55011OVw.A06;
            EnumC53255Ngt enumC53255Ngt = n57.A00;
            if (enumC53255Ngt == null) {
                str = "designVariant";
            } else {
                A0T.A19(myo, A0b, str2, enumC53255Ngt.A01, false);
                C55011OVw c55011OVw2 = n57.A04;
                if (c55011OVw2 != null) {
                    if (c55011OVw2.A01()) {
                        enumC201098ur = EnumC201098ur.OTHER;
                    } else {
                        enumC201098ur = EnumC201098ur.DECLINE;
                    }
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    C55011OVw c55011OVw3 = n57.A04;
                    if (c55011OVw3 != null) {
                        A01(enumC201098ur, A0r, n57, c55011OVw3, null);
                        Intent putExtra = AbstractC31171DnF.A04().putExtra("ARG_MEDIA_ID", n57.A07);
                        C14360o3.A07(putExtra);
                        n57.requireActivity().setResult(2, putExtra);
                        AbstractC25226BEj.A1Q(n57);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View] */
    public static final void A05(N57 n57) {
        TextView textView;
        boolean z = n57.A06;
        int i = 8;
        IgLinearLayout igLinearLayout = n57.A01;
        if (z) {
            if (igLinearLayout != null) {
                AbstractC31172DnG.A1J(igLinearLayout, R.id.bb_footer, 8);
                IgLinearLayout igLinearLayout2 = n57.A01;
                if (igLinearLayout2 != null) {
                    textView = igLinearLayout2.requireViewById(R.id.footer_above_action);
                    textView.setVisibility(i);
                    return;
                }
            }
            C14360o3.A0F("customButtonContainer");
            throw C00O.createAndThrow();
        }
        if (igLinearLayout != null) {
            AbstractC31172DnG.A1J(igLinearLayout, R.id.footer_above_action, 8);
            IgLinearLayout igLinearLayout3 = n57.A01;
            if (igLinearLayout3 != null) {
                TextView A0N = AbstractC167007dF.A0N(igLinearLayout3, R.id.bb_footer);
                A0N.setText(A00(AbstractC31177DnL.A09(n57), n57, 2131972075));
                i = 0;
                textView = A0N;
                textView.setVisibility(i);
                return;
            }
        }
        C14360o3.A0F("customButtonContainer");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.N57 r8, boolean r9) {
        /*
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r8.A02
            if (r0 != 0) goto Le
            java.lang.String r7 = "bottomButtons"
        L6:
            X.C14360o3.A0F(r7)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            r2 = 8
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgLinearLayout r0 = r8.A01
            java.lang.String r7 = "customButtonContainer"
            if (r0 == 0) goto L6
            r6 = 0
            r0.setVisibility(r6)
            com.instagram.common.ui.base.IgLinearLayout r1 = r8.A01
            if (r1 == 0) goto L6
            r0 = 2131428643(0x7f0b0523, float:1.8478936E38)
            X.AbstractC31172DnG.A1J(r1, r0, r2)
            com.instagram.common.ui.base.IgLinearLayout r1 = r8.A01
            if (r1 == 0) goto L6
            r0 = 2131428642(0x7f0b0522, float:1.8478934E38)
            android.widget.TextView r3 = X.AbstractC167007dF.A0N(r1, r0)
            r3.setVisibility(r6)
            com.instagram.common.ui.base.IgLinearLayout r1 = r8.A01
            if (r1 == 0) goto L6
            r0 = 2131428644(0x7f0b0524, float:1.8478938E38)
            android.view.View r5 = r1.requireViewById(r0)
            X.C14360o3.A07(r5)
            r5.setVisibility(r6)
            com.instagram.common.ui.base.IgLinearLayout r1 = r8.A01
            if (r1 == 0) goto L6
            r0 = 2131428646(0x7f0b0526, float:1.8478942E38)
            X.AbstractC31172DnG.A1J(r1, r0, r2)
            X.0do r0 = r8.A08
            X.0ll r4 = X.AbstractC166987dD.A0o(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36331081112241305(0x8112ed00004499, double:3.03926021667815E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            com.instagram.common.ui.base.IgLinearLayout r1 = r8.A01
            if (r0 == 0) goto La9
            if (r1 == 0) goto L6
            r0 = 2131428649(0x7f0b0529, float:1.8478948E38)
        L6a:
            android.widget.TextView r1 = X.AbstractC166997dE.A0T(r1, r0)
            X.C14360o3.A0A(r1)
            r1.setVisibility(r6)
            r0 = 47
            X.Ok3.A00(r5, r0, r8)
            r0 = 48
            X.Ok3.A00(r1, r0, r8)
            if (r9 == 0) goto L8d
            r0 = 2131972083(0x7f134ff3, float:1.9581164E38)
        L83:
            X.AbstractC25227BEk.A12(r3, r8, r0)
            r0 = 2131968687(0x7f1342af, float:1.9574276E38)
        L89:
            X.AbstractC25227BEk.A12(r1, r8, r0)
            return
        L8d:
            X.OVw r0 = r8.A04
            if (r0 != 0) goto L95
            java.lang.String r7 = "params"
            goto L6
        L95:
            boolean r0 = r0.A01()
            if (r0 == 0) goto La5
            r0 = 2131972086(0x7f134ff6, float:1.958117E38)
            X.AbstractC25227BEk.A12(r3, r8, r0)
            r0 = 2131972085(0x7f134ff5, float:1.9581168E38)
            goto L89
        La5:
            r0 = 2131952905(0x7f130509, float:1.9542266E38)
            goto L83
        La9:
            if (r1 == 0) goto L6
            r0 = 2131428648(0x7f0b0528, float:1.8478946E38)
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N57.A06(X.N57, boolean):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    public static final SpannableStringBuilder A00(Resources resources, N57 n57, int i) {
        String A0v = AbstractC25227BEk.A0v(n57, 2131972024);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(MSZ.A0H(resources, A0v, i));
        AnonymousClass773.A05(A0H, new C50763MbU(n57, 4), A0v);
        return A0H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        if (X.C18U.A06(r2, X.AbstractC166987dD.A0o(r8), 36331081112306842L) == false) goto L18;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = -529128341(0xffffffffe076246b, float:-7.0945676E19)
            int r4 = X.C0f9.A02(r0)
            r0 = r19
            r5 = r18
            super.onCreate(r0)
            android.os.Bundle r3 = r5.requireArguments()
            X.0do r8 = r5.A08
            X.0ll r6 = X.AbstractC166987dD.A0o(r8)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317603505378722(0x8106ab000815a2, double:3.0307369238282855E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            r5.A05 = r0
            java.lang.String r0 = "ARG_MEDIA_SOURCE_TYPE"
            java.lang.String r0 = X.AbstractC153636vY.A01(r3, r0)
            X.MYO r12 = X.MYO.valueOf(r0)
            java.lang.String r0 = "ARG_UPSELL_ENTRY_POINT"
            java.lang.String r0 = X.AbstractC153636vY.A01(r3, r0)
            X.82G r10 = X.C82G.valueOf(r0)
            java.lang.String r0 = "ARG_UPSELL_VARIANT"
            java.lang.String r0 = X.AbstractC153636vY.A01(r3, r0)
            X.82H r11 = X.C82H.valueOf(r0)
            java.lang.String r0 = "ARG_WATERFALL_ID"
            java.lang.String r13 = r3.getString(r0)
            java.lang.String r0 = "ARG_MODULE_NAME"
            java.lang.String r14 = r3.getString(r0)
            java.lang.String r0 = "ARG_NUX_ATTEMPT_QPL_INSTANCE_KEY"
            int r17 = r3.getInt(r0)
            r15 = 0
            X.OVw r9 = new X.OVw
            r16 = r15
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r5.A04 = r9
            X.0ll r12 = X.AbstractC31178DnM.A0M(r8)
            r0 = 36596561630988847(0x82046100040a2f, double:3.20715116573834E-306)
            long r10 = X.C18U.A01(r2, r12, r0)
            X.Ngt r6 = X.EnumC53255Ngt.A05
            long r6 = r6.A00
            int r9 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r9 != 0) goto L79
            r0 = 36599078482152895(0x8206ab00090dbf, double:3.20874283254903E-306)
        L79:
            long r6 = X.C18U.A01(r2, r12, r0)
            java.util.Map r1 = X.EnumC53255Ngt.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object r0 = r1.get(r0)
            X.Ngt r0 = (X.EnumC53255Ngt) r0
            if (r0 != 0) goto L8d
            X.Ngt r0 = X.EnumC53255Ngt.A06
        L8d:
            r5.A00 = r0
            java.lang.String r0 = "ARG_MEDIA_ID"
            java.lang.String r0 = r3.getString(r0)
            r5.A07 = r0
            X.OVw r1 = r5.A04
            java.lang.String r0 = "params"
            if (r1 != 0) goto La5
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        La5:
            X.82H r1 = r1.A02
            X.82H r0 = X.C82H.A03
            if (r1 == r0) goto Laf
            X.82H r0 = X.C82H.A05
            if (r1 != r0) goto Lbf
        Laf:
            X.0ll r3 = X.AbstractC166987dD.A0o(r8)
            r0 = 36331081112306842(0x8112ed0001449a, double:3.0392602167195956E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto Lc0
        Lbf:
            r0 = 0
        Lc0:
            r5.A06 = r0
            r0 = 1873880389(0x6fb12545, float:1.0964781E29)
            X.C0f9.A09(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N57.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(910060484);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_share_to_fb_upsell_bottom_sheet, viewGroup, false);
        C0f9.A09(182780355, A02);
        return inflate;
    }
}
