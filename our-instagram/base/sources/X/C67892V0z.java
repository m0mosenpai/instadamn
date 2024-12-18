package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.V0z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67892V0z extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, XA8 {
    public static final String __redex_internal_original_name = "PromoteReviewFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public ViewStub A09;
    public ViewStub A0A;
    public C70399WUb A0B;
    public W6E A0C;
    public W65 A0D;
    public C69648Vsp A0E;
    public PromoteData A0F;
    public PromoteState A0G;
    public UserSession A0H;
    public IgImageView A0I;
    public IgdsStepperHeader A0J;
    public SpinnerImageView A0K;
    public boolean A0L;
    public boolean A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public FRW A0Q;
    public C23031Ai A0R;
    public boolean A0S;
    public final InterfaceC09390do A0T = AbstractC60492pY.A02(this);
    public final InterfaceC41501vz A0U = new C70723Wfo(this, 7);

    private final String A00(String str) {
        String str2 = str;
        PromoteData promoteData = this.A0F;
        String str3 = "promoteData";
        if (promoteData != null) {
            if (promoteData.A0i != XIGIGBoostDestination.A0B) {
                if (str == null) {
                    return "";
                }
                return str2;
            }
            C70172WEu c70172WEu = WUZ.A00;
            FragmentActivity requireActivity = requireActivity();
            if (str == null) {
                str2 = "";
            }
            PromoteData promoteData2 = this.A0F;
            if (promoteData2 != null) {
                List list = promoteData2.A1q;
                C14360o3.A06(list);
                PromoteData promoteData3 = this.A0F;
                if (promoteData3 != null) {
                    java.util.Set set = promoteData3.A24;
                    C14360o3.A06(set);
                    PromoteData promoteData4 = this.A0F;
                    if (promoteData4 != null) {
                        String str4 = promoteData4.A1X;
                        if (this.A0G == null) {
                            str3 = "promoteState";
                        } else {
                            return c70172WEu.A06(requireActivity, promoteData, str2, str4, list, set, false);
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    public final void A0A(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A0H;
        String str4 = "userSession";
        if (userSession != null) {
            if (AbstractC1565371b.A00(userSession)) {
                Context requireContext = requireContext();
                UserSession userSession2 = this.A0H;
                if (userSession2 != null) {
                    AbstractC35176FfT.A03(AbstractC35176FfT.A00(requireContext, userSession2, "boost_ad_payments", str));
                    return;
                }
            } else {
                UserSession userSession3 = this.A0H;
                if (userSession3 != null) {
                    AbstractC25651Mw.A00(userSession3).A01(this.A0U, C70711Wfa.class);
                    PromoteState promoteState = this.A0G;
                    if (promoteState == null) {
                        str4 = "promoteState";
                    } else {
                        if (promoteState.A08) {
                            promoteState.A08 = false;
                            PromoteState.A01(promoteState, C05F.A06);
                        }
                        C70399WUb c70399WUb = this.A0B;
                        if (c70399WUb != null) {
                            c70399WUb.A0S(VG4.A1Q.toString(), str2);
                            C70399WUb.A07(c70399WUb, c70399WUb.A01, VG4.A1M.toString(), str);
                        }
                        FragmentActivity requireActivity = requireActivity();
                        UserSession userSession4 = this.A0H;
                        if (userSession4 != null) {
                            W6f.A02(requireActivity, new C70628We8(this, str2, str, str3), userSession4, false);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str4);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r1.A00 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0192, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36319600664649270L) == false) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8  */
    @Override // X.XA8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CuW() {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67892V0z.CuW():void");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String str;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970921);
        this.A0Q = new FRW(requireContext(), interfaceC56362iU);
        if (this.A0G == null) {
            str = "promoteState";
        } else {
            PromoteData promoteData = this.A0F;
            str = "promoteData";
            if (promoteData != null) {
                if (!PromoteState.A02(promoteData)) {
                    PromoteData promoteData2 = this.A0F;
                    if (promoteData2 != null) {
                        if (promoteData2.A0v != PromoteLaunchOrigin.A05) {
                            FRW frw = this.A0Q;
                            if (frw == null) {
                                str = "actionBarButtonController";
                            } else {
                                WNO wno = new WNO(this, 19);
                                C35026Fbz c35026Fbz = frw.A02;
                                c35026Fbz.A02 = R.drawable.instagram_arrow_left_pano_outline_24;
                                c35026Fbz.A0A = wno;
                                frw.A01.EkS(true);
                                frw.A02(true);
                                return;
                            }
                        }
                    }
                }
                AbstractC31176DnK.A1C(new WNO(this, 18), AbstractC31176DnK.A0I(), interfaceC56362iU);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_review";
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x06a6, code lost:
    
        if (r0.A0v == com.instagram.business.promote.model.PromoteLaunchOrigin.A05) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x02a7, code lost:
    
        if (r30.A0M == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36330217823814385L) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x054f, code lost:
    
        if (r0.A0v == com.instagram.business.promote.model.PromoteLaunchOrigin.A05) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x07b4, code lost:
    
        if (r0.isEmpty() != false) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x09b4, code lost:
    
        if (X.C18U.A06(r3, r2, 36323152602672168L) != false) goto L553;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0820  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r31, android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 2871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67892V0z.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(C67892V0z c67892V0z) {
        String str;
        if (c67892V0z.A0G == null) {
            str = "promoteState";
        } else {
            PromoteData promoteData = c67892V0z.A0F;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                PromoteState.A00(promoteData);
                AbstractC65702TsY.A0q();
                V10 v10 = new V10();
                FragmentActivity requireActivity = c67892V0z.requireActivity();
                UserSession userSession = c67892V0z.A0H;
                if (userSession == null) {
                    str = "userSession";
                } else {
                    AbstractC31177DnL.A16(v10, requireActivity, userSession);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r0.A0v == com.instagram.business.promote.model.PromoteLaunchOrigin.A05) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0282, code lost:
    
        if (r14 == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015d, code lost:
    
        if (r14 == false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C67892V0z r16) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67892V0z.A02(X.V0z):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r0.ordinal() != 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        if (X.AbstractC31178DnM.A1X(X.C06090Tz.A05, r3, 36315816798457441L) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
    
        if (r1.A2E != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C67892V0z r8) {
        /*
            X.W65 r5 = r8.A0D
            if (r5 != 0) goto Le
            java.lang.String r7 = "createPromotionButtonHolder"
        L6:
            X.C14360o3.A0F(r7)
        L9:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            com.instagram.business.promote.model.PromoteData r2 = r8.A0F
            java.lang.String r7 = "promoteData"
            if (r2 == 0) goto L6
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r2.A0i
            r4 = 1
            if (r0 == 0) goto L31
            com.instagram.business.promote.model.PromoteState r0 = r8.A0G
            java.lang.String r6 = "promoteState"
            if (r0 == 0) goto L9b
            boolean r1 = r0.A02
            if (r1 == 0) goto L36
            boolean r0 = r0.A01
            if (r0 != 0) goto L36
            r0 = 2131970390(0x7f134956, float:1.957773E38)
            java.lang.String r0 = r8.getString(r0)
            r8.A07(r0)
        L31:
            r4 = 0
        L32:
            r5.A04(r4)
            return
        L36:
            X.UPA r0 = r2.A0Y
            if (r0 == 0) goto L49
            X.UPI r0 = r0.A00
            if (r0 == 0) goto L49
            com.instagram.api.schemas.ErrorLevel r0 = r0.A01
            if (r0 == 0) goto L49
            int r0 = r0.ordinal()
            if (r0 == r4) goto L31
            goto L32
        L49:
            java.lang.String r6 = "userSession"
            if (r1 == 0) goto L6d
            com.instagram.business.promote.model.PromoteAudience r0 = r2.A07()
            com.instagram.api.schemas.AudienceValidationResponse r0 = X.WGs.A03(r0)
            boolean r0 = X.WGs.A0L(r0)
            if (r0 == 0) goto L6d
            com.instagram.common.session.UserSession r3 = r8.A0H
            if (r3 == 0) goto L9b
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36315816798457441(0x81050b00000e61, double:3.029607003176776E-306)
            boolean r0 = X.AbstractC31178DnM.A1X(r2, r3, r0)
            if (r0 == 0) goto L6d
            goto L31
        L6d:
            com.instagram.business.promote.model.PromoteData r0 = r8.A0F
            if (r0 == 0) goto L6
            com.instagram.common.session.UserSession r3 = r8.A0H
            if (r3 == 0) goto L9b
            com.instagram.business.promote.model.PromoteAudience r0 = r0.A06()
            if (r0 == 0) goto L32
            boolean r0 = r0.A0C
            if (r0 != r4) goto L32
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318509743020264(0x81077e000118e8, double:3.031310032161923E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L32
            com.instagram.business.promote.model.PromoteData r1 = r8.A0F
            if (r1 == 0) goto L6
            boolean r0 = X.AbstractC69922Vxn.A00(r1)
            if (r0 == 0) goto L31
            boolean r0 = r1.A2E
            if (r0 != 0) goto L32
            goto L31
        L9b:
            X.C14360o3.A0F(r6)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67892V0z.A03(X.V0z):void");
    }

    public static final void A04(C67892V0z c67892V0z) {
        CharSequence charSequence;
        View view = c67892V0z.A0P;
        if (view != null) {
            TextView A0N = AbstractC167007dF.A0N(view, R.id.description_text);
            PromoteData promoteData = c67892V0z.A0F;
            if (promoteData == null) {
                C14360o3.A0F("promoteData");
                throw C00O.createAndThrow();
            }
            if (promoteData.A2w) {
                charSequence = Html.fromHtml(AbstractC166997dE.A0N(c67892V0z).getString(2131970919));
            } else {
                charSequence = promoteData.A1T;
                if (charSequence == null) {
                    throw new IllegalStateException("payment guidance message can not be null when ig_android_promote_payment_guidance is enabled");
                }
            }
            A0N.setText(charSequence);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A06(C67892V0z c67892V0z, boolean z) {
        String str;
        FRW frw = c67892V0z.A0Q;
        if (frw == null) {
            str = "actionBarButtonController";
        } else {
            frw.A02(!z);
            c67892V0z.A0L = z;
            W65 w65 = c67892V0z.A0D;
            if (w65 == null) {
                str = "createPromotionButtonHolder";
            } else {
                w65.A05(z);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final boolean A08() {
        PromoteData promoteData = this.A0F;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        if (promoteData.A0l == BoostFlowType.A04 && promoteData.A0f != null) {
            return true;
        }
        return false;
    }

    public final void A09() {
        View view = this.A0N;
        if (view != null) {
            AbstractC167007dF.A0N(view, R.id.secondary_text).setText(AbstractC166997dE.A0p(requireContext(), 2131970888));
            View view2 = this.A0N;
            if (view2 != null) {
                AbstractC167007dF.A0w(view2.findViewById(R.id.error_icon));
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        InterfaceC09390do interfaceC09390do = this.A0T;
        if (C18U.A06(C06090Tz.A05, (AbstractC12990ll) interfaceC09390do.getValue(), 36318514038577385L)) {
            return (AbstractC18680vv) interfaceC09390do.getValue();
        }
        UserSession userSession = this.A0H;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        boolean z;
        XDE xde;
        C70399WUb c70399WUb = this.A0B;
        if (c70399WUb != null) {
            c70399WUb.A0G(VG4.A1Q, "back_button");
        }
        PromoteData promoteData = this.A0F;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        boolean z2 = true;
        if (promoteData.A2A && promoteData.A2O) {
            z = true;
            promoteData.A2A = false;
        } else {
            z = false;
        }
        if (!this.A0L && !z) {
            z2 = false;
            C1UC activity = getActivity();
            if ((activity instanceof XDE) && (xde = (XDE) activity) != null) {
                xde.CnA(VG4.A1Q.toString());
            }
        }
        return z2;
    }

    public static final void A05(C67892V0z c67892V0z, ImageUrl imageUrl, String str, String str2) {
        XCP xcp;
        C1UC activity = c67892V0z.getActivity();
        if ((activity instanceof XCP) && (xcp = (XCP) activity) != null) {
            xcp.CqW(imageUrl, str, str2, false, true);
        }
    }

    private final void A07(String str) {
        if (getContext() != null) {
            Context context = getContext();
            if (str == null || str.length() == 0) {
                str = getString(2131970899);
                C14360o3.A0A(str);
            }
            C9GR.A09(context, str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        UserSession userSession;
        int A02 = C0f9.A02(-1573074213);
        super.onCreate(bundle);
        this.A0F = InterfaceC72021XFj.A00(this);
        this.A0G = XFZ.A00(this);
        InterfaceC09390do interfaceC09390do = this.A0T;
        String str = "userSession";
        if (C18U.A06(C06090Tz.A05, (AbstractC12990ll) interfaceC09390do.getValue(), 36318514038577385L)) {
            userSession = (UserSession) interfaceC09390do.getValue();
        } else {
            PromoteData promoteData = this.A0F;
            if (promoteData == null) {
                str = "promoteData";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            userSession = promoteData.A0y;
            C14360o3.A06(userSession);
        }
        this.A0H = userSession;
        if (userSession != null) {
            this.A0R = AbstractC23021Ah.A00(userSession);
            C0f9.A09(-562167088, A02);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        XDE xde;
        int A02 = C0f9.A02(-2068708227);
        C14360o3.A0B(layoutInflater, 0);
        C1UC activity = getActivity();
        if ((activity instanceof XDE) && (xde = (XDE) activity) != null) {
            xde.CnB(VG4.A1Q.toString());
        }
        View inflate = layoutInflater.inflate(R.layout.promote_review_view, viewGroup, false);
        C0f9.A09(-1883327872, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1220936352);
        super.onDestroy();
        this.A0B = null;
        C0f9.A09(128307284, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1219053633);
        this.A03 = null;
        this.A0N = null;
        this.A0O = null;
        this.A02 = null;
        this.A08 = null;
        this.A05 = null;
        this.A06 = null;
        this.A0P = null;
        this.A09 = null;
        this.A0A = null;
        this.A04 = null;
        this.A01 = null;
        super.onDestroyView();
        C0f9.A09(1521522159, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(2043669261);
        super.onResume();
        if (A08()) {
            PromoteState promoteState = this.A0G;
            if (promoteState == null) {
                str = "promoteState";
            } else if (!promoteState.A00) {
                W6E w6e = this.A0C;
                if (w6e == null) {
                    str = "dataFetcher";
                } else {
                    w6e.A04(new V26(this.A0B, this, 11));
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C0f9.A09(1497563113, A02);
    }
}
