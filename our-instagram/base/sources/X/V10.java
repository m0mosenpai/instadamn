package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.IGBoostPackagesFlowInfo;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class V10 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, XDH, XCM, XA8, XAF, InterfaceC25164BBk {
    public static final String __redex_internal_original_name = "PromoteDestinationFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ViewStub A04;
    public ViewStub A05;
    public C70399WUb A06;
    public W6E A07;
    public FRW A08;
    public C67968V4h A09;
    public PromoteData A0A;
    public PromoteState A0B;
    public IgLinearLayout A0C;
    public InterfaceC56392iX A0D;
    public InterfaceC56392iX A0E;
    public InterfaceC56392iX A0F;
    public SpinnerImageView A0G;
    public boolean A0H;
    public C70813WhW A0I;
    public W65 A0J;
    public final InterfaceC09390do A0K = AbstractC60492pY.A02(this);

    @Override // X.XCM
    public final void DGg() {
    }

    @Override // X.XAF
    public final void Dc7(PromoteState promoteState, Integer num) {
        String str;
        C14360o3.A0B(promoteState, 0);
        C14360o3.A0B(num, 1);
        int intValue = num.intValue();
        if (intValue != 2 && intValue != 0) {
            return;
        }
        A01();
        FragmentActivity requireActivity = requireActivity();
        UserSession userSession = (UserSession) this.A0K.getValue();
        C1UC requireActivity2 = requireActivity();
        C14360o3.A0C(requireActivity2, AbstractC43591JPw.A00(13));
        ArrayList BIR = ((InterfaceC72021XFj) requireActivity2).BIR();
        PromoteData promoteData = this.A0A;
        if (promoteData == null) {
            str = "promoteData";
        } else {
            View view = this.A00;
            if (view == null) {
                str = "mainContainer";
            } else {
                VRW.A00(view, requireActivity, promoteData, promoteState, userSession, BIR);
                A00();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r1 != false) goto L15;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r5) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            r0 = 2131970627(0x7f134a43, float:1.957821E38)
            r5.Efu(r0)
            X.3LO r2 = new X.3LO
            r2.<init>()
            com.instagram.business.promote.model.PromoteState r0 = r4.A0B
            if (r0 != 0) goto L1d
            java.lang.String r3 = "promoteState"
        L15:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1d:
            com.instagram.business.promote.model.PromoteData r0 = r4.A0A
            java.lang.String r3 = "promoteData"
            if (r0 == 0) goto L15
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            if (r0 != 0) goto L34
            com.instagram.business.promote.model.PromoteData r0 = r4.A0A
            if (r0 == 0) goto L15
            boolean r1 = r0.A2u
            r0 = 2131239093(0x7f0820b5, float:1.8094483E38)
            if (r1 == 0) goto L37
        L34:
            r0 = 2131237958(0x7f081c46, float:1.8092181E38)
        L37:
            r2.A01(r0)
            X.3LY r0 = new X.3LY
            r0.<init>(r2)
            r5.Ehd(r0)
            com.instagram.business.promote.model.PromoteData r1 = r4.A0A
            if (r1 == 0) goto L15
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r1.A0h
            if (r0 == 0) goto L5c
            com.instagram.common.session.UserSession r3 = r1.A0y
            X.C14360o3.A06(r3)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324578531815670(0x810d03000130f6, double:3.0351479586331885E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L78
        L5c:
            android.content.Context r0 = r4.requireContext()
            X.FRW r2 = new X.FRW
            r2.<init>(r0, r5)
            r4.A08 = r2
            java.lang.String r3 = "actionBarButtonController"
            java.lang.Integer r1 = X.C05F.A0Y
            r0 = 42
            X.WNT.A01(r2, r1, r4, r0)
            X.FRW r1 = r4.A08
            if (r1 == 0) goto L15
            r0 = 1
            r1.A01(r0)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V10.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_destination";
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x031d, code lost:
    
        if (r4.A2D != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0161, code lost:
    
        if (r3 != 9) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0275  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V10.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        boolean z;
        W65 w65 = this.A0J;
        if (w65 != null) {
            PromoteData promoteData = this.A0A;
            String str = "promoteData";
            if (promoteData != null) {
                if (C97F.A04(promoteData)) {
                    PromoteData promoteData2 = this.A0A;
                    if (promoteData2 != null) {
                        XIGIGBoostDestination xIGIGBoostDestination = promoteData2.A0i;
                        if (xIGIGBoostDestination != null && xIGIGBoostDestination == XIGIGBoostDestination.A04 && promoteData2.A0j == null) {
                            z = false;
                            w65.A04(z);
                            return;
                        }
                    }
                }
                PromoteState promoteState = this.A0B;
                if (promoteState == null) {
                    str = "promoteState";
                } else {
                    z = promoteState.A05;
                    w65.A04(z);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0278, code lost:
    
        if (r8 == 5) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0489, code lost:
    
        if (r10 == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r2 != 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05f5, code lost:
    
        if (r0 != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04c1, code lost:
    
        if (r7.A2C != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x05b9, code lost:
    
        if (r0 != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x059b, code lost:
    
        if (r1 != null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x056f, code lost:
    
        if (X.C18U.A06(r8, r3, 36324578531750133L) != false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (r8 == 5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0611, code lost:
    
        if (r0.isEmpty() == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cb, code lost:
    
        if (r11 == 5) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.V10 r32) {
        /*
            Method dump skipped, instructions count: 1618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V10.A02(X.V10):void");
    }

    public static final void A03(V10 v10, ImageUrl imageUrl, String str, String str2) {
        XCP xcp;
        PromoteData promoteData = v10.A0A;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        if (promoteData.A0i != null) {
            C70399WUb c70399WUb = v10.A06;
            if (c70399WUb != null) {
                c70399WUb.A0G(VG4.A17, "destination_ads_preview_thumbnail");
            }
            C1UC activity = v10.getActivity();
            if ((activity instanceof XCP) && (xcp = (XCP) activity) != null) {
                xcp.CqW(imageUrl, str, str2, false, false);
            }
        }
    }

    @Override // X.XDH
    public final W6E Avi() {
        W6E w6e = this.A07;
        if (w6e == null) {
            C14360o3.A0F("promoteDataFetcher");
            throw C00O.createAndThrow();
        }
        return w6e;
    }

    @Override // X.XDH
    public final VG4 BiZ() {
        return VG4.A17;
    }

    @Override // X.XA8
    public final void CuW() {
        String str;
        C140966Yy A0j;
        XIGIGBoostDestination xIGIGBoostDestination;
        XDE xde;
        if (this.A0B != null) {
            PromoteData promoteData = this.A0A;
            str = "promoteData";
            if (promoteData != null) {
                if (!PromoteState.A02(promoteData)) {
                    PromoteData promoteData2 = this.A0A;
                    if (promoteData2 != null) {
                        if (promoteData2.A0v != PromoteLaunchOrigin.A05) {
                            InterfaceC09390do interfaceC09390do = this.A0K;
                            C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
                            C1UC activity = getActivity();
                            if ((activity instanceof XDE) && (xde = (XDE) activity) != null) {
                                xde.CnA(VG4.A17.toString());
                            }
                            W6E w6e = this.A07;
                            if (w6e == null) {
                                str = "promoteDataFetcher";
                            } else {
                                UserSession userSession = (UserSession) interfaceC09390do.getValue();
                                VG4 vg4 = VG4.A17;
                                w6e.A02(vg4, userSession);
                                this.A0H = true;
                                C70399WUb c70399WUb = this.A06;
                                if (c70399WUb != null) {
                                    PromoteData promoteData3 = this.A0A;
                                    if (promoteData3 != null) {
                                        c70399WUb.A0C(vg4, promoteData3);
                                    }
                                }
                                C70399WUb c70399WUb2 = this.A06;
                                if (c70399WUb2 != null) {
                                    PromoteData promoteData4 = this.A0A;
                                    if (promoteData4 != null) {
                                        c70399WUb2.A09(promoteData4.A0S, promoteData4.A0h, promoteData4.A0i, vg4, promoteData4.A1S);
                                    }
                                }
                                if (this.A0B != null) {
                                    PromoteData promoteData5 = this.A0A;
                                    if (promoteData5 != null) {
                                        if (PromoteState.A03(promoteData5) && A0l.A01.getInt("whatsapp_linking_in_goal_screen_has_not_engaged_count", 0) <= 2) {
                                            UserSession userSession2 = (UserSession) interfaceC09390do.getValue();
                                            if (C18U.A06(AbstractC166997dE.A0U(userSession2), userSession2, 36326412482787183L)) {
                                                FragmentActivity requireActivity = requireActivity();
                                                PromoteData promoteData6 = this.A0A;
                                                if (promoteData6 != null) {
                                                    promoteData6.A2n = false;
                                                    AbstractC65702TsY.A0q();
                                                    AbstractC31177DnL.A16(new V0X(), requireActivity, promoteData6.A0y);
                                                    return;
                                                }
                                            }
                                        }
                                        PromoteData promoteData7 = this.A0A;
                                        if (promoteData7 != null) {
                                            IGBoostPackagesFlowInfo iGBoostPackagesFlowInfo = promoteData7.A0m;
                                            if (iGBoostPackagesFlowInfo != null && (xIGIGBoostDestination = promoteData7.A0i) != null && xIGIGBoostDestination == iGBoostPackagesFlowInfo.A00) {
                                                A0j = AbstractC25233BEq.A0j(this, interfaceC09390do);
                                                AbstractC155756z4.A00().A00();
                                                UserSession userSession3 = (UserSession) interfaceC09390do.getValue();
                                                PromoteData promoteData8 = this.A0A;
                                                if (promoteData8 != null) {
                                                    String str2 = promoteData8.A1K;
                                                    C14360o3.A06(str2);
                                                    PromoteData promoteData9 = this.A0A;
                                                    if (promoteData9 != null) {
                                                        String str3 = promoteData9.A1S;
                                                        C14360o3.A06(str3);
                                                        PromoteData promoteData10 = this.A0A;
                                                        if (promoteData10 != null) {
                                                            String currencyCode = promoteData10.A1j.getCurrencyCode();
                                                            C14360o3.A07(currencyCode);
                                                            PromoteData promoteData11 = this.A0A;
                                                            if (promoteData11 != null) {
                                                                int i = promoteData11.A06;
                                                                String url = promoteData11.A11.getUrl();
                                                                C14360o3.A0B(userSession3, 0);
                                                                C67884V0q c67884V0q = new C67884V0q();
                                                                c67884V0q.setArguments(AbstractC61636Rr0.A00(new C09530e4("IgSessionManager.SESSION_TOKEN_KEY", userSession3.token), new C09530e4(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2), new C09530e4("media_id", str3), new C09530e4("currency", currencyCode), new C09530e4("currency_offset", Integer.valueOf(i)), new C09530e4("boost_packages", iGBoostPackagesFlowInfo), new C09530e4("media_url", url)));
                                                                A0j.A0D(c67884V0q);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                V11 A03 = AbstractC155756z4.A00().A02().A03(false);
                                                A0j = AbstractC25233BEq.A0j(this, interfaceC09390do);
                                                A0j.A0D(A03);
                                            }
                                            A0j.A04();
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C67968V4h c67968V4h = this.A09;
                if (c67968V4h == null) {
                    str = "draftController";
                } else if (!c67968V4h.A00()) {
                    if (this.A0B != null) {
                        PromoteData promoteData12 = this.A0A;
                        if (promoteData12 != null) {
                            PromoteState.A00(promoteData12);
                            C70399WUb c70399WUb3 = this.A06;
                            if (c70399WUb3 != null) {
                                PromoteData promoteData13 = this.A0A;
                                if (promoteData13 != null) {
                                    c70399WUb3.A0C(VG4.A17, promoteData13);
                                }
                            }
                            C70399WUb c70399WUb4 = this.A06;
                            if (c70399WUb4 != null) {
                                PromoteData promoteData14 = this.A0A;
                                if (promoteData14 != null) {
                                    c70399WUb4.A09(promoteData14.A0S, promoteData14.A0h, promoteData14.A0i, VG4.A17, promoteData14.A1S);
                                }
                            }
                            AbstractC25226BEj.A1Q(this);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "promoteState";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC25164BBk
    public final void Czp() {
        W6E w6e = this.A07;
        if (w6e == null) {
            C14360o3.A0F("promoteDataFetcher");
            throw C00O.createAndThrow();
        }
        w6e.A03(this);
    }

    @Override // X.XCM
    public final void DGp(C67835Uz8 c67835Uz8) {
        String str;
        PromoteState promoteState = this.A0B;
        if (promoteState == null) {
            str = "promoteState";
        } else {
            XIGIGBoostDestination xIGIGBoostDestination = XIGIGBoostDestination.A0G;
            PromoteData promoteData = this.A0A;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                promoteState.A05(xIGIGBoostDestination, promoteData);
                View view = this.A00;
                if (view == null) {
                    str = "mainContainer";
                } else {
                    C66359UCf c66359UCf = (C66359UCf) AbstractC166997dE.A0S(view, R.id.destination_option_group).findViewWithTag(XIGIGBoostDestination.A04);
                    if (c66359UCf != null) {
                        c66359UCf.setChecked(true);
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0K.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        if (r0.A2Q != false) goto L35;
     */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r7 = this;
            com.instagram.business.promote.model.PromoteState r0 = r7.A0B
            java.lang.String r6 = "promoteState"
            if (r0 == 0) goto Lb5
            com.instagram.business.promote.model.PromoteData r0 = r7.A0A
            java.lang.String r5 = "promoteData"
            if (r0 == 0) goto Lb9
            boolean r0 = com.instagram.business.promote.model.PromoteState.A02(r0)
            r4 = 1
            com.instagram.business.promote.model.PromoteState r1 = r7.A0B
            if (r0 == 0) goto L35
            if (r1 == 0) goto Lb5
            com.instagram.business.promote.model.PromoteData r0 = r7.A0A
            if (r0 == 0) goto Lb9
            r1.A06(r0)
        L1e:
            r4 = 0
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            boolean r0 = r1 instanceof X.XDE
            if (r0 == 0) goto L34
            X.XDE r1 = (X.XDE) r1
            if (r1 == 0) goto L34
            X.VG4 r0 = X.VG4.A17
            java.lang.String r0 = r0.toString()
            r1.CnA(r0)
        L34:
            return r4
        L35:
            if (r1 == 0) goto Lb5
            boolean r0 = r1.A05
            if (r0 == 0) goto L85
            com.instagram.business.promote.model.PromoteData r1 = r7.A0A
            if (r1 == 0) goto Lb9
            boolean r0 = r1.A2w
            if (r0 != 0) goto L85
            com.instagram.business.promote.model.PromoteEnrollCouponInfo r3 = r1.A0t
            if (r3 == 0) goto L85
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r1 = r3.A00()
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r0 = com.instagram.business.promote.model.PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.A02
            if (r1 == r0) goto L5f
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r1 = r3.A00()
            com.instagram.business.promote.model.PromoteEnrollCouponInfo$PromoteEnrollCouponStatus r0 = com.instagram.business.promote.model.PromoteEnrollCouponInfo.PromoteEnrollCouponStatus.A06
            if (r1 != r0) goto L83
            com.instagram.business.promote.model.PromoteData r0 = r7.A0A
            if (r0 == 0) goto Lb9
            boolean r0 = r0.A2Q
            if (r0 == 0) goto L83
        L5f:
            r2 = 1
        L60:
            com.instagram.model.coupon.PromoteCouponType r1 = r3.A05
            com.instagram.model.coupon.PromoteCouponType r0 = com.instagram.model.coupon.PromoteCouponType.A03
            if (r1 != r0) goto L85
            if (r2 == 0) goto L85
            X.AbstractC65702TsY.A0q()
            X.V1O r1 = new X.V1O
            r1.<init>()
            X.Vay r0 = new X.Vay
            r0.<init>(r7)
            r1.A02 = r0
            X.0do r0 = r7.A0K
            X.8aO r0 = X.AbstractC25231BEo.A0g(r0)
            r0.A0U = r1
            X.AbstractC31177DnL.A14(r7, r1, r0)
            return r4
        L83:
            r2 = 0
            goto L60
        L85:
            com.instagram.business.promote.model.PromoteState r0 = r7.A0B
            if (r0 == 0) goto Lb5
            boolean r0 = r0.A05
            if (r0 == 0) goto L1e
            com.instagram.business.promote.model.PromoteData r1 = r7.A0A
            if (r1 == 0) goto Lb9
            boolean r0 = r1.A2w
            if (r0 != 0) goto L1e
            java.lang.String r0 = r1.A1b
            if (r0 != 0) goto L1e
            boolean r0 = r1.A2n
            if (r0 != 0) goto L1e
            X.AbstractC65702TsY.A0q()
            X.V09 r2 = new X.V09
            r2.<init>()
            X.3DO r1 = X.C3DN.A00
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            X.3DN r0 = r1.A00(r0)
            if (r0 == 0) goto L34
            r0.A0K(r2)
            return r4
        Lb5:
            X.C14360o3.A0F(r6)
            goto Lbc
        Lb9:
            X.C14360o3.A0F(r5)
        Lbc:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V10.onBackPressed():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a8, code lost:
    
        if (r0 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01aa, code lost:
    
        r0.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ad, code lost:
    
        r1 = r10.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01af, code lost:
    
        if (r1 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b1, code lost:
    
        r8 = "userFlowLogger";
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c0, code lost:
    
        r2 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c6, code lost:
    
        if (r2 == 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        r1.A01.flowMarkPoint(r2, "promote_destination_preview_holder_rendered");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01cf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b7, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01() {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V10.A01():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(160889989);
        super.onCreate(bundle);
        this.A0A = InterfaceC72021XFj.A00(this);
        this.A0B = XFZ.A00(this);
        InterfaceC09390do interfaceC09390do = this.A0K;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        FragmentActivity activity = getActivity();
        this.A07 = new W6E(activity, activity, userSession);
        this.A09 = new C67968V4h(this);
        C70399WUb A0N = AbstractC43594JPz.A0N(interfaceC09390do);
        PromoteData promoteData = this.A0A;
        String str = "promoteData";
        if (promoteData != null) {
            A0N.A00 = promoteData.A0n;
            this.A06 = A0N;
            AbstractC12990ll A0M = AbstractC31178DnM.A0M(interfaceC09390do);
            C70813WhW c70813WhW = (C70813WhW) A0M.A01(C70813WhW.class, new C50163MDq(A0M, 42));
            this.A0I = c70813WhW;
            if (c70813WhW == null) {
                str = "userFlowLogger";
            } else {
                long j = c70813WhW.A00;
                if (j != 0) {
                    c70813WhW.A01.flowMarkPoint(j, "promote_goal_screen_created");
                }
                PromoteData promoteData2 = this.A0A;
                if (promoteData2 != null) {
                    if (C14360o3.A0K(promoteData2.A1K, "direct_inbox_setting_entrypoint")) {
                        PromoteData promoteData3 = this.A0A;
                        if (promoteData3 != null) {
                            promoteData3.A2i = true;
                        }
                    }
                    C0f9.A09(2111118256, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        XDE xde;
        int A02 = C0f9.A02(1425894120);
        C14360o3.A0B(layoutInflater, 0);
        C1UC activity = getActivity();
        if ((activity instanceof XDE) && (xde = (XDE) activity) != null) {
            xde.CnB(VG4.A17.toString());
        }
        View inflate = layoutInflater.inflate(R.layout.promote_destination_view, viewGroup, false);
        C0f9.A09(-1240214895, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1512964252);
        PromoteState promoteState = this.A0B;
        if (promoteState == null) {
            C14360o3.A0F("promoteState");
            throw C00O.createAndThrow();
        }
        promoteState.A0B(this);
        this.A06 = null;
        this.A02 = null;
        this.A03 = null;
        this.A0C = null;
        this.A0E = null;
        this.A0F = null;
        this.A04 = null;
        super.onDestroyView();
        C0f9.A09(-766470075, A02);
    }
}
