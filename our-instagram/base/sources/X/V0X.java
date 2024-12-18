package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class V0X extends AbstractC59962oe implements InterfaceC60122ou, XCM, XA8, InterfaceC25164BBk, CallerContextable {
    public static final String __redex_internal_original_name = "PromoteMessagingAppsFragment";
    public View A00;
    public View A01;
    public View A02;
    public XIGIGBoostCallToAction A03;
    public XIGIGBoostDestination A04;
    public VG4 A05;
    public C70399WUb A06;
    public A9M A07;
    public W6E A08;
    public W65 A09;
    public PromoteData A0A;
    public PromoteState A0B;
    public C66359UCf A0C;
    public C66359UCf A0D;
    public IgRadioGroup A0E;
    public boolean A0F;
    public C70815WhY A0G;
    public W65 A0H;
    public final String A0I = "PromoteMessagingApps";
    public final InterfaceC41501vz A0K = new C70723Wfo(this, 6);
    public final InterfaceC09390do A0J = AbstractC60492pY.A02(this);

    @Override // X.XCM
    public final void DGg() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r7) {
        /*
            r6 = this;
            r3 = 0
            X.C14360o3.A0B(r7, r3)
            r0 = 2131970566(0x7f134a06, float:1.9578087E38)
            r7.Efu(r0)
            X.3LO r2 = new X.3LO
            r2.<init>()
            r2.A00()
            r1 = 14
            X.WNO r0 = new X.WNO
            r0.<init>(r6, r1)
            X.AbstractC31176DnK.A1C(r0, r2, r7)
            boolean r0 = r6.A04()
            java.lang.String r5 = "Required value was null."
            if (r0 != 0) goto L6c
            com.instagram.business.promote.model.PromoteData r0 = r6.A0A
            if (r0 == 0) goto Lb0
            boolean r0 = r0.A2n
            if (r0 == 0) goto L6c
            X.W65 r0 = r6.A09
            if (r0 == 0) goto L33
            r0.A01()
        L33:
            X.W65 r2 = r6.A09
            if (r2 == 0) goto Laa
            android.content.Context r1 = r6.requireContext()
            r0 = 2131970596(0x7f134a24, float:1.9578148E38)
            java.lang.String r0 = r1.getString(r0)
            X.AbstractC69913Vxe.A01(r6, r2, r0)
            X.W65 r1 = r6.A09
            if (r1 == 0) goto L50
            boolean r0 = r6.A05()
            r1.A04(r0)
        L50:
            com.instagram.business.promote.model.PromoteData r0 = r6.A0A
            if (r0 == 0) goto Lb0
            boolean r0 = r0.A2n
            if (r0 == 0) goto L6b
            android.view.View r1 = r6.mView
            if (r1 == 0) goto L6b
            r0 = 2131427589(0x7f0b0105, float:1.8476799E38)
            android.view.View r1 = X.AbstractC166997dE.A0S(r1, r0)
            r0 = 16
            X.WNO.A00(r1, r0, r6)
            r1.setVisibility(r3)
        L6b:
            return
        L6c:
            X.W65 r0 = r6.A0H
            if (r0 == 0) goto L73
            r0.A01()
        L73:
            X.0do r0 = r6.A0J
            java.lang.Object r4 = r0.getValue()
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.0Tz r2 = X.AbstractC166997dE.A0U(r4)
            r0 = 36326412482787183(0x810eae0000376f, double:3.036307756612301E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            X.W65 r2 = r6.A0H
            if (r0 == 0) goto La0
            if (r2 == 0) goto Lba
            android.content.Context r1 = r6.requireContext()
            r0 = 2131970596(0x7f134a24, float:1.9578148E38)
        L95:
            java.lang.String r0 = r1.getString(r0)
            X.AbstractC69913Vxe.A01(r6, r2, r0)
            A02(r6)
            goto L50
        La0:
            if (r2 == 0) goto Lc0
            android.content.Context r1 = r6.requireContext()
            r0 = 2131970625(0x7f134a41, float:1.9578206E38)
            goto L95
        Laa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        Lb0:
            java.lang.String r0 = "promoteData"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        Lc0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0X.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_messaging_apps";
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x0405, code lost:
    
        if (r0 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013a, code lost:
    
        if (r0 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0170, code lost:
    
        if (A03() != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031a  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0X.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(View view, V0X v0x) {
        XIGIGBoostCallToAction xIGIGBoostCallToAction;
        XIGIGBoostCallToAction xIGIGBoostCallToAction2;
        PromoteData promoteData = v0x.A0A;
        String str = "promoteData";
        if (promoteData != null) {
            if (!promoteData.A2q) {
                ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.message_option_group);
                A0C.removeAllViews();
                XIGIGBoostDestination xIGIGBoostDestination = v0x.A04;
                if (xIGIGBoostDestination != XIGIGBoostDestination.A08 && xIGIGBoostDestination != XIGIGBoostDestination.A0G) {
                    xIGIGBoostCallToAction = XIGIGBoostCallToAction.A0J;
                } else {
                    xIGIGBoostCallToAction = XIGIGBoostCallToAction.A0W;
                }
                List A1Q = AbstractC16960so.A1Q(xIGIGBoostCallToAction, XIGIGBoostCallToAction.A0F, XIGIGBoostCallToAction.A0L, XIGIGBoostCallToAction.A0A, XIGIGBoostCallToAction.A0E, XIGIGBoostCallToAction.A0O);
                PromoteData promoteData2 = v0x.A0A;
                if (promoteData2 != null) {
                    List<XIGIGBoostCallToAction> list = A1Q;
                    if (promoteData2.A2C) {
                        list = A1Q;
                        if (v0x.A04 == XIGIGBoostDestination.A04) {
                            ArrayList A0U = AbstractC001800i.A0U(A1Q);
                            A0U.add(0, XIGIGBoostCallToAction.A0U);
                            list = A0U;
                        }
                    }
                    for (XIGIGBoostCallToAction xIGIGBoostCallToAction3 : list) {
                        C66359UCf c66359UCf = new C66359UCf(v0x.requireContext());
                        c66359UCf.setTag(xIGIGBoostCallToAction3);
                        c66359UCf.setPrimaryText(AbstractC166997dE.A0p(v0x.requireContext(), W6g.A00(xIGIGBoostCallToAction3)));
                        c66359UCf.A9c(new C71079Wnb(1, xIGIGBoostCallToAction3, v0x));
                        A0C.addView(c66359UCf);
                        XIGIGBoostCallToAction xIGIGBoostCallToAction4 = v0x.A03;
                        if (xIGIGBoostCallToAction4 == xIGIGBoostCallToAction3 || ((xIGIGBoostCallToAction3 == (xIGIGBoostCallToAction2 = XIGIGBoostCallToAction.A0J) && (xIGIGBoostCallToAction4 == XIGIGBoostCallToAction.A0W || xIGIGBoostCallToAction4 == XIGIGBoostCallToAction.A0C)) || (xIGIGBoostCallToAction3 == XIGIGBoostCallToAction.A0W && (xIGIGBoostCallToAction4 == xIGIGBoostCallToAction2 || xIGIGBoostCallToAction4 == XIGIGBoostCallToAction.A0U)))) {
                            c66359UCf.setChecked(true);
                        }
                    }
                    if (v0x.A0F) {
                        AbstractC166987dD.A1P(v0x.requireContext(), (TextView) view.findViewById(R.id.promote_messaging_cta_options_title), 2131970536);
                    }
                    C70399WUb c70399WUb = v0x.A06;
                    if (c70399WUb == null) {
                        str = "promoteLogger";
                    } else {
                        VG4 vg4 = v0x.A05;
                        if (vg4 == null) {
                            str = "currentStep";
                        } else {
                            c70399WUb.A0I(vg4, "custom_cta_for_more_messages");
                            return;
                        }
                    }
                }
            } else {
                AbstractC166997dE.A0S(view, R.id.call_to_action_row_divider).setVisibility(8);
                AbstractC166997dE.A0S(view, R.id.promote_messaging_cta_options_title).setVisibility(8);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.api.schemas.XIGIGBoostDestination r4, X.V0X r5) {
        /*
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A08
            if (r4 == r0) goto L8
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A0G
            if (r4 != r0) goto L3f
        L8:
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r5.A03
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = com.instagram.api.schemas.XIGIGBoostCallToAction.A0J
            if (r1 != r0) goto L3f
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = com.instagram.api.schemas.XIGIGBoostCallToAction.A0W
        L10:
            r5.A03 = r0
        L12:
            com.instagram.business.promote.model.PromoteData r3 = r5.A0A
            java.lang.String r2 = "promoteData"
            if (r3 == 0) goto L4c
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r5.A03
            r3.A0e = r0
            boolean r0 = r3.A2p
            if (r0 != 0) goto L24
            boolean r0 = r3.A2v
            if (r0 == 0) goto L2a
        L24:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A0G
            if (r4 != r0) goto L2a
            com.instagram.api.schemas.XIGIGBoostDestination r4 = com.instagram.api.schemas.XIGIGBoostDestination.A04
        L2a:
            com.instagram.business.promote.model.PromoteState r1 = r5.A0B
            java.lang.String r0 = "promoteState"
            if (r1 == 0) goto L50
            r1.A05(r4, r3)
            com.instagram.business.promote.model.PromoteState r1 = r5.A0B
            if (r1 == 0) goto L50
            com.instagram.business.promote.model.PromoteData r0 = r5.A0A
            if (r0 == 0) goto L4c
            r1.A04(r4, r0)
            return
        L3f:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A04
            if (r4 != r0) goto L12
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r5.A03
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = com.instagram.api.schemas.XIGIGBoostCallToAction.A0W
            if (r1 != r0) goto L12
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = com.instagram.api.schemas.XIGIGBoostCallToAction.A0J
            goto L10
        L4c:
            X.C14360o3.A0F(r2)
            goto L53
        L50:
            X.C14360o3.A0F(r0)
        L53:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0X.A01(com.instagram.api.schemas.XIGIGBoostDestination, X.V0X):void");
    }

    public static final void A02(V0X v0x) {
        W65 w65 = v0x.A0H;
        if (w65 != null) {
            w65.A04(v0x.A05());
        }
    }

    private final boolean A03() {
        boolean z;
        boolean z2;
        PromoteData promoteData = this.A0A;
        if (promoteData != null) {
            List list = promoteData.A20;
            if (list != null) {
                z = list.contains(XIGIGBoostDestination.A04);
            } else {
                z = false;
            }
            PromoteData promoteData2 = this.A0A;
            if (promoteData2 != null) {
                List list2 = promoteData2.A20;
                if (list2 != null) {
                    z2 = list2.contains(XIGIGBoostDestination.A0G);
                } else {
                    z2 = false;
                }
                if (!z || !z2) {
                    return false;
                }
                return true;
            }
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    private final boolean A04() {
        String str;
        if (this.A0B == null) {
            str = "promoteState";
        } else {
            PromoteData promoteData = this.A0A;
            str = "promoteData";
            if (promoteData != null) {
                if (!PromoteState.A02(promoteData)) {
                    PromoteData promoteData2 = this.A0A;
                    if (promoteData2 != null) {
                        if (promoteData2.A0v != PromoteLaunchOrigin.A05) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final boolean A05() {
        PromoteData promoteData = this.A0A;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        if (promoteData.A2q || this.A03 != null) {
            XIGIGBoostDestination xIGIGBoostDestination = this.A04;
            if (xIGIGBoostDestination != XIGIGBoostDestination.A04) {
                if (xIGIGBoostDestination != XIGIGBoostDestination.A0G || promoteData.A2v || promoteData.A2p) {
                    if (xIGIGBoostDestination == XIGIGBoostDestination.A08 && !promoteData.A2v && !promoteData.A2p) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (X.C18U.A06(X.AbstractC166997dE.A0U(r4), r4, 36326412482787183L) != false) goto L15;
     */
    @Override // X.XA8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CuW() {
        /*
            r9 = this;
            X.0do r3 = r9.A0J
            X.1Ai r5 = X.AbstractC25230BEn.A0l(r3)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r9.A04
            if (r0 == 0) goto Lb1
            A01(r0, r9)
            boolean r0 = r9.A04()
            if (r0 != 0) goto Lad
            com.instagram.business.promote.model.PromoteData r0 = r9.A0A
            if (r0 != 0) goto L21
            java.lang.String r8 = "promoteData"
        L19:
            X.C14360o3.A0F(r8)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L21:
            boolean r0 = r0.A2n
            if (r0 != 0) goto L3a
            java.lang.Object r4 = r3.getValue()
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.0Tz r2 = X.AbstractC166997dE.A0U(r4)
            r0 = 36326412482787183(0x810eae0000376f, double:3.036307756612301E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto Lad
        L3a:
            X.0xq r7 = r5.A01
            java.lang.String r6 = "whatsapp_linking_in_goal_screen_has_not_engaged_count"
            r4 = 0
            int r1 = r7.getInt(r6, r4)
            r0 = 2
            if (r1 > r0) goto L73
            com.instagram.business.promote.model.PromoteData r1 = r9.A0A
            java.lang.String r8 = "promoteData"
            if (r1 == 0) goto L19
            boolean r0 = r1.A2H
            if (r0 != 0) goto L73
            boolean r0 = r1.A2G
            if (r0 != 0) goto L73
            java.lang.Object r5 = r3.getValue()
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.0Tz r2 = X.AbstractC166997dE.A0U(r5)
            r0 = 36326412482787183(0x810eae0000376f, double:3.036307756612301E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L73
            com.instagram.business.promote.model.PromoteData r1 = r9.A0A
            if (r1 == 0) goto L19
            r0 = 1
            r1.A2G = r0
            X.AbstractC50522MSa.A1T(r7, r6, r4)
        L73:
            X.WUb r2 = r9.A06
            if (r2 != 0) goto L7a
            java.lang.String r8 = "promoteLogger"
            goto L19
        L7a:
            X.VG4 r1 = r9.A05
            java.lang.String r8 = "currentStep"
            if (r1 == 0) goto L19
            java.lang.String r0 = "next_button_for_message_setup"
            r2.A0G(r1, r0)
            X.W6E r2 = r9.A08
            if (r2 != 0) goto L8c
            java.lang.String r8 = "promoteDataFetcher"
            goto L19
        L8c:
            java.lang.Object r1 = r3.getValue()
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.VG4 r0 = r9.A05
            if (r0 == 0) goto L19
            r2.A02(r0, r1)
            X.1Vd r0 = X.AbstractC155756z4.A00()
            X.Vvi r0 = r0.A02()
            X.V11 r1 = r0.A03(r4)
            androidx.fragment.app.FragmentActivity r0 = r9.requireActivity()
            X.AbstractC31179DnN.A0y(r1, r0, r3)
            return
        Lad:
            X.AbstractC25226BEj.A1Q(r9)
            return
        Lb1:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0X.CuW():void");
    }

    @Override // X.InterfaceC25164BBk
    public final void Czp() {
        W6E w6e = this.A08;
        if (w6e == null) {
            C14360o3.A0F("promoteDataFetcher");
            throw C00O.createAndThrow();
        }
        w6e.A03(this);
    }

    @Override // X.XCM
    public final void DGp(C67835Uz8 c67835Uz8) {
        A01(XIGIGBoostDestination.A0G, this);
        if (isAdded()) {
            AbstractC25226BEj.A1Q(this);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0J.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1846763276);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0J;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        FragmentActivity activity = getActivity();
        this.A08 = new W6E(activity, activity, userSession);
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) interfaceC09390do.getValue();
        C14360o3.A0B(abstractC12990ll, 0);
        C70815WhY c70815WhY = (C70815WhY) abstractC12990ll.A01(C70815WhY.class, new C50163MDq(abstractC12990ll, 41));
        this.A0G = c70815WhY;
        if (c70815WhY == null) {
            C14360o3.A0F("userFlowLogger");
            throw C00O.createAndThrow();
        }
        if (c70815WhY.A00 != 0) {
            c70815WhY.A00();
        }
        C1QT c1qt = c70815WhY.A01;
        long flowStartForMarker = c1qt.flowStartForMarker(208414543, "messaging_app_selection", true);
        c70815WhY.A00 = flowStartForMarker;
        c1qt.flowMarkPoint(flowStartForMarker, "navigation_start");
        this.A07 = C97F.A01(C97F.A00(V0X.class), (UserSession) interfaceC09390do.getValue());
        this.A0F = C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36320884859872227L);
        AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A0K, C23613Ad8.class);
        C0f9.A09(-1997732962, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(675416619);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_messaging_apps_view, viewGroup, false);
        C0f9.A09(251598763, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1976010304);
        super.onDestroy();
        AbstractC31176DnK.A0Q(this.A0J).A02(this.A0K, C23613Ad8.class);
        C0f9.A09(-1518278046, A02);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroyView() {
        /*
            r7 = this;
            r0 = -746238579(0xffffffffd3854d8d, float:-1.1450635E12)
            int r4 = X.C0f9.A02(r0)
            super.onDestroyView()
            com.instagram.business.promote.model.PromoteState r0 = r7.A0B
            if (r0 != 0) goto L18
            java.lang.String r1 = "promoteState"
        L10:
            X.C14360o3.A0F(r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L18:
            boolean r0 = r0.A07
            java.lang.String r1 = "userFlowLogger"
            X.WhY r3 = r7.A0G
            if (r0 != 0) goto L2c
            if (r3 == 0) goto L10
            r3.A00()
        L25:
            X.WUb r5 = r7.A06
            if (r5 != 0) goto L43
            java.lang.String r1 = "promoteLogger"
            goto L10
        L2c:
            if (r3 == 0) goto L10
            long r5 = r3.A00
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L25
            X.1QT r2 = r3.A01
            java.lang.String r0 = "messaging_app_selected"
            r2.flowMarkPoint(r5, r0)
            long r0 = r3.A00
            r2.flowEndSuccess(r0)
            goto L25
        L43:
            com.instagram.business.promote.model.PromoteData r6 = r7.A0A
            if (r6 != 0) goto L4a
            java.lang.String r1 = "promoteData"
            goto L10
        L4a:
            X.VG4 r2 = r7.A05
            if (r2 != 0) goto L51
            java.lang.String r1 = "currentStep"
            goto L10
        L51:
            X.0wW r1 = r5.A05
            java.lang.String r0 = "promoted_posts_finish_step"
            X.0Ai r3 = X.AbstractC65702TsY.A0I(r5, r1, r0)
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "m_pk"
            r3.AAP(r0, r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "step"
            r3.AAP(r0, r1)
            java.lang.String r1 = "native_android"
            java.lang.String r0 = "bfa_platform"
            r3.AAP(r0, r1)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r6.A0j
            if (r0 == 0) goto L87
            X.UKt r2 = new X.UKt
            r2.<init>()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "messaging_app"
            r2.A06(r0, r1)
            java.lang.String r0 = "selected_values"
            r3.AAQ(r2, r0)
        L87:
            X.UKp r0 = new X.UKp
            r0.<init>()
            X.AbstractC65702TsY.A1I(r0, r5)
            X.AbstractC65702TsY.A1B(r3, r0)
            r0 = -77682908(0xfffffffffb5ea724, float:-1.1560799E36)
            X.C0f9.A09(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0X.onDestroyView():void");
    }
}
