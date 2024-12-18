package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromoteAdsManagerActionType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class V16 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC62612t0, InterfaceC60122ou, InterfaceC71976XDj {
    public static final String __redex_internal_original_name = "PromoteAdToolsFragment";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Dialog A04;
    public C45125Jxu A05;
    public C45125Jxu A06;
    public W6I A07;
    public C70814WhX A08;
    public C70399WUb A09;
    public C68249VJl A0A;
    public C67920V2k A0B;
    public C69785VvQ A0C;
    public C69792VvX A0D;
    public C70654Wea A0E;
    public C70802WhI A0F;
    public W1T A0G;
    public C3FR A0H;
    public C23031Ai A0I;
    public InterfaceC70513Em A0J;
    public SpinnerImageView A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public int A0Z;
    public String A0a;
    public final List A0e = new ArrayList();
    public List A0R = new ArrayList();
    public String A0Q = "IG_BOOST";
    public final List A0c = new ArrayList();
    public final List A0d = new ArrayList();
    public final List A0b = new ArrayList();
    public final InterfaceC41501vz A0g = new C70723Wfo(this, 3);
    public final InterfaceC41501vz A0f = new C70723Wfo(this, 2);
    public final InterfaceC09390do A0h = AbstractC60492pY.A02(this);

    public static final void A09(V16 v16) {
        v16.A01 = 0;
        v16.A0c.clear();
        v16.A0d.clear();
        v16.A0T = false;
        v16.A0S = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0B(X.V16 r9, java.lang.String r10) {
        /*
            r6 = 0
            r9.A0S = r6
            X.VvQ r4 = r9.A0C
            java.lang.String r8 = "promoteAdsManagerDataFetcher"
            r5 = 0
            if (r4 == 0) goto Le8
            r0 = 8
            X.TzI r3 = new X.TzI
            r3.<init>(r9, r0)
            com.instagram.common.session.UserSession r0 = r4.A02
            X.C14360o3.A0B(r0, r6)
            r7 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r0, r7)
            r2.A05()
            java.lang.String r0 = "aymt/fetch_aymt_channel/"
            r2.A0B(r0)
            java.lang.String r1 = "INSTAGRAM_PROMOTIONS_MANAGER"
            java.lang.String r0 = "channel_surface"
            r2.A9s(r0, r1)
            java.lang.Class<X.Uyu> r1 = X.C67821Uyu.class
            java.lang.Class<X.VxH> r0 = X.C69890VxH.class
            r2.A0P(r5, r1, r0, r6)
            X.1ON r1 = r2.A0N()
            r1.A00 = r3
            X.2ry r0 = r4.A01
            r0.schedule(r1)
            java.lang.String r2 = r9.A0a
            X.VvQ r1 = r9.A0C
            if (r1 == 0) goto Le8
            X.N9z r0 = new X.N9z
            r0.<init>(r10, r9, r6)
            r1.A01(r0, r10, r2)
            X.2k6 r2 = X.AbstractC25229BEm.A0a(r9)
            r0 = 48
            X.MC3 r1 = new X.MC3
            r1.<init>(r9, r5, r0)
            X.191 r0 = X.AnonymousClass191.A00
            X.AbstractC23641Du.A05(r0, r1, r2)
            boolean r0 = r9.A0X
            if (r0 == 0) goto Lb8
            com.instagram.common.session.UserSession r3 = r9.getSession()
            X.C14360o3.A0B(r3, r6)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318230570080327(0x81073d00001847, double:3.0311334820705673E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Lb8
            java.lang.String r0 = "INBOX"
            r9.A0Q = r0
        L77:
            X.VvQ r3 = r9.A0C
            if (r3 == 0) goto Le8
            java.lang.String r2 = r9.A0Q
            r1 = 10
            X.TzI r0 = new X.TzI
            r0.<init>(r9, r1)
            r3.A00(r0, r2)
            A06(r9)
            com.instagram.common.session.UserSession r3 = r9.getSession()
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36612526024169875(0x8212e600001993, double:3.2172471122694735E-306)
            long r0 = X.C18U.A01(r2, r3, r0)
            int r5 = (int) r0
            X.VvQ r4 = r9.A0C
            if (r4 == 0) goto Le8
            int r3 = r9.A01
            X.V3p r2 = new X.V3p
            r2.<init>(r9, r5)
            com.instagram.common.session.UserSession r1 = r4.A02
            java.lang.String r0 = "IMPORTANT_V2"
            X.1ON r1 = X.VRS.A00(r1, r0, r10, r5, r3)
            r1.A00 = r2
            X.2ry r0 = r4.A01
            r0.schedule(r1)
            A05(r9)
            return
        Lb8:
            X.VvQ r4 = r9.A0C
            if (r4 == 0) goto Le8
            r0 = 9
            X.TzI r3 = new X.TzI
            r3.<init>(r9, r0)
            com.instagram.common.session.UserSession r0 = r4.A02
            X.C14360o3.A0B(r0, r6)
            X.1Ms r2 = new X.1Ms
            r2.<init>(r0, r7)
            r2.A05()
            java.lang.String r0 = "ads/ads_manager/fetch_suggestions/"
            r2.A0B(r0)
            java.lang.Class<X.Uyx> r1 = X.C67824Uyx.class
            java.lang.Class<X.VxP> r0 = X.C69898VxP.class
            r2.A0P(r5, r1, r0, r6)
            X.1ON r1 = r2.A0N()
            r1.A00 = r3
            X.2ry r0 = r4.A01
            r0.schedule(r1)
            goto L77
        Le8:
            X.C14360o3.A0F(r8)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V16.A0B(X.V16, java.lang.String):void");
    }

    @Override // X.InterfaceC71976XDj
    public final void E0g(InterfaceC72003XEr interfaceC72003XEr) {
        String str;
        W6I w6i = this.A07;
        String str2 = "adsManagerLogger";
        if (w6i != null) {
            if (AbstractC001800i.A0J(interfaceC72003XEr.BzE()) != null) {
                str = "view_ad_comparison_insights";
            } else {
                str = "view_insights";
            }
            w6i.A0A("promotion_list", str, interfaceC72003XEr.BZZ(), null);
            C70654Wea c70654Wea = (C70654Wea) interfaceC72003XEr;
            W6I w6i2 = this.A07;
            if (w6i2 != null) {
                String str3 = c70654Wea.A0C;
                if (str3 != null) {
                    w6i2.A08("promotion_list", "view_insights", str3, null);
                    UserSession session = getSession();
                    FragmentActivity requireActivity = requireActivity();
                    String str4 = c70654Wea.A0C;
                    if (str4 != null) {
                        WGU.A05(requireActivity, c70654Wea, session, str4, "ads_manager", new HashMap(), AbstractC167007dF.A1X(c70654Wea.BIP(), InstagramMediaProductType.A0K), AbstractC167007dF.A1X(c70654Wea.BIP(), InstagramMediaProductType.A0F), AbstractC167007dF.A1X(c70654Wea.BIP(), InstagramMediaProductType.A06));
                        return;
                    }
                }
                str2 = "adsMediaIgId";
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970877);
        C3LO c3lo = new C3LO();
        c3lo.A00();
        AbstractC31176DnK.A1C(new WNN(this, 68), c3lo, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_ads_manager_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("2FAC_DIALOG", this.A0W);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V16.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final C9CN A00() {
        Map map = C0YZ.A03;
        CallerContext A01 = CallerContext.A01(AbstractC13230m9.A01(V16.class));
        C14360o3.A0A(A01);
        return new C9CN(A01, "ig_android_promote_ads_manager_ig_to_fb_fetch_promotions", "ads_manager", VG4.A05.toString(), "promotion_list");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r11.A06 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01() {
        /*
            r11 = this;
            java.util.List r3 = r11.A0e
            com.instagram.common.session.UserSession r4 = r11.getSession()
            X.0Tz r2 = X.AbstractC166997dE.A0U(r4)
            r0 = 36319123923278791(0x81080d00001bc7, double:3.0316984422305206E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L1c
            X.Jxu r1 = r11.A06
            r0 = 2131970320(0x7f134910, float:1.9577588E38)
            if (r1 == 0) goto L1f
        L1c:
            r0 = 2131970321(0x7f134911, float:1.957759E38)
        L1f:
            X.MSY.A0w(r0, r3)
            java.util.List r0 = r11.A0R
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L67
            java.util.List r0 = r11.A0R
            java.util.Iterator r2 = r0.iterator()
        L32:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r1 = r2.next()
            com.instagram.business.promote.model.SuggestedPromotion r1 = (com.instagram.business.promote.model.SuggestedPromotion) r1
            r7 = 0
            com.instagram.common.typedurl.ImageUrl r6 = r1.A01
            if (r6 == 0) goto L5d
            java.lang.String r9 = r1.A03
            if (r9 == 0) goto L5a
            java.lang.String r10 = r1.A02
            r0 = 55
            X.WNV r5 = new X.WNV
            r5.<init>(r0, r1, r11)
            X.Vlm r4 = new X.Vlm
            r8 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3.add(r4)
            goto L32
        L5a:
            java.lang.String r0 = "displayTitle"
            goto L5f
        L5d:
            java.lang.String r0 = "thumbnailUrl"
        L5f:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L67:
            X.Jxu r0 = r11.A06
            if (r0 == 0) goto L6e
            r3.add(r0)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V16.A01():void");
    }

    public static final void A04(V16 v16) {
        if (v16.A0Z == 0) {
            A06(v16);
            W6f.A00(v16.requireActivity(), new C70618Wdw(v16, 1), v16.getSession());
        }
    }

    public static final void A05(V16 v16) {
        int i = v16.A0Z - 1;
        v16.A0Z = i;
        if (i == 0) {
            C3FR c3fr = v16.A0H;
            String str = "recyclerViewProxy";
            if (c3fr != null) {
                c3fr.ARj();
                C3FR c3fr2 = v16.A0H;
                if (c3fr2 != null) {
                    c3fr2.EWc(false);
                    InterfaceC70513Em interfaceC70513Em = v16.A0J;
                    if (interfaceC70513Em == null) {
                        str = "pullToRefresh";
                    } else {
                        interfaceC70513Em.setIsLoading(false);
                        SpinnerImageView spinnerImageView = v16.A0K;
                        if (spinnerImageView == null) {
                            str = "loadingSpinner";
                        } else {
                            spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A06(V16 v16) {
        v16.A0Z++;
        v16.A0T = false;
        C3FR c3fr = v16.A0H;
        String str = "recyclerViewProxy";
        if (c3fr != null) {
            c3fr.APU();
            C3FR c3fr2 = v16.A0H;
            if (c3fr2 != null) {
                c3fr2.EWc(true);
                InterfaceC70513Em interfaceC70513Em = v16.A0J;
                str = "pullToRefresh";
                if (interfaceC70513Em != null) {
                    interfaceC70513Em.setIsLoading(true);
                    List list = v16.A0e;
                    if (list == null || list.isEmpty()) {
                        InterfaceC70513Em interfaceC70513Em2 = v16.A0J;
                        if (interfaceC70513Em2 != null) {
                            if (!(interfaceC70513Em2 instanceof C71094Wnq)) {
                                SpinnerImageView spinnerImageView = v16.A0K;
                                if (spinnerImageView == null) {
                                    str = "loadingSpinner";
                                } else {
                                    spinnerImageView.setLoadingStatus(C3T1.LOADING);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A07(V16 v16) {
        W6I w6i = v16.A07;
        String str = "adsManagerLogger";
        if (w6i != null) {
            w6i.A03("ad_tools_pro2pro", null);
            C69785VvQ c69785VvQ = v16.A0C;
            if (c69785VvQ == null) {
                str = "promoteAdsManagerDataFetcher";
            } else {
                FragmentActivity requireActivity = v16.requireActivity();
                C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
                BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) requireActivity;
                W6I w6i2 = v16.A07;
                if (w6i2 != null) {
                    c69785VvQ.A01.schedule(AbstractC70133W6h.A01(baseFragmentActivity, c69785VvQ.A02, C05F.A0C, "ads_manager", w6i2.A00(), null));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        r5.A01 = r0;
        r3 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r3.hasNext() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r2 = (X.InterfaceC72003XEr) r3.next();
        X.C14360o3.A0C(r2, "null cannot be cast to non-null type com.instagram.business.promote.model.Promotion");
        r2 = (X.C70654Wea) r2;
        r1 = r2.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r1 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r1 == X.EnumC68195VFn.CREATING) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (r1 != X.EnumC68195VFn.PENDING) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (r2.A04 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        r5.A00 = r0;
        r4.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0210, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(X.V16 r13) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V16.A08(X.V16):void");
    }

    public static final void A0A(V16 v16, C70654Wea c70654Wea, String str) {
        String str2;
        C3FR c3fr = v16.A0H;
        if (c3fr == null) {
            str2 = "recyclerViewProxy";
        } else {
            c3fr.EWc(true);
            InterfaceC70513Em interfaceC70513Em = v16.A0J;
            if (interfaceC70513Em != null) {
                interfaceC70513Em.setIsLoading(true);
                InterfaceC70513Em interfaceC70513Em2 = v16.A0J;
                if (interfaceC70513Em2 != null) {
                    if (!(interfaceC70513Em2 instanceof C71094Wnq)) {
                        C67920V2k c67920V2k = v16.A0B;
                        if (c67920V2k == null) {
                            str2 = "promoteAdToolsAdapter";
                        } else {
                            c67920V2k.A00(new ArrayList());
                            SpinnerImageView spinnerImageView = v16.A0K;
                            if (spinnerImageView == null) {
                                str2 = "loadingSpinner";
                            } else {
                                spinnerImageView.setLoadingStatus(C3T1.LOADING);
                            }
                        }
                    }
                    A02(new C70631WeB(v16, c70654Wea, str), v16);
                    return;
                }
            }
            C14360o3.A0F("pullToRefresh");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public static final void A0C(V16 v16, String str, String str2, String str3, String str4) {
        W6I w6i = v16.A07;
        if (w6i != null) {
            w6i.A08("promotion_list", "create_promotion", null, null);
            W6I w6i2 = v16.A07;
            if (w6i2 != null) {
                w6i2.A0A(str3, str4, null, null);
                AbstractC69888VxF.A00().A0A(v16.requireActivity(), v16.getSession(), str2, str, v16.A0X, false, false);
                return;
            }
        }
        C14360o3.A0F("adsManagerLogger");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        return (UserSession) this.A0h.getValue();
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (this.A0T) {
            A04(this);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0022. Please report as an issue. */
    @Override // X.InterfaceC71976XDj
    public final void CuY(PromoteAdsManagerActionType promoteAdsManagerActionType, InterfaceC72003XEr interfaceC72003XEr) {
        C70620Wdy c70620Wdy;
        C140966Yy c140966Yy;
        C70654Wea c70654Wea;
        W6I w6i;
        String BZZ;
        String str;
        String str2;
        XCJ c70620Wdy2;
        C14360o3.A0B(promoteAdsManagerActionType, 1);
        if (this.A0Y) {
            WGU.A04(requireContext(), this.A0O, this.A0N);
            return;
        }
        boolean z = true;
        String str3 = "adsManagerLogger";
        switch (promoteAdsManagerActionType.ordinal()) {
            case 0:
                c70654Wea = (C70654Wea) interfaceC72003XEr;
                w6i = this.A07;
                if (w6i != null) {
                    BZZ = c70654Wea.BZZ();
                    str = "promotion_list";
                    str2 = "appeal_review";
                    w6i.A08(str, str2, BZZ, null);
                    c70620Wdy = new C70620Wdy(2, this, c70654Wea);
                    A02(c70620Wdy, this);
                    return;
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 1:
                C70654Wea c70654Wea2 = (C70654Wea) interfaceC72003XEr;
                W6I w6i2 = this.A07;
                if (w6i2 != null) {
                    w6i2.A08("promotion_list", "edit", c70654Wea2.BZZ(), null);
                    W6I w6i3 = this.A07;
                    if (w6i3 != null) {
                        w6i3.A05("ads_manager", VG4.A0U.toString(), c70654Wea2.BZZ());
                        c140966Yy = new C140966Yy(requireActivity(), getSession());
                        AbstractC65702TsY.A0q();
                        String BZZ2 = c70654Wea2.BZZ();
                        String str4 = c70654Wea2.A0F;
                        String str5 = c70654Wea2.A0L;
                        if (str5 != null) {
                            AbstractC167007dF.A1E(BZZ2, 0, "ads_manager");
                            c140966Yy.A0B(null, AbstractC65703TsZ.A12(BZZ2, str4, "ads_manager", str5));
                            c140966Yy.A04();
                            return;
                        }
                        str3 = "pageId";
                    }
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 2:
                C70654Wea c70654Wea3 = (C70654Wea) interfaceC72003XEr;
                W6I w6i4 = this.A07;
                if (w6i4 != null) {
                    w6i4.A08("promotion_list", "learn_more", c70654Wea3.BZZ(), null);
                    AbstractC65702TsY.A0q();
                    String BZZ3 = c70654Wea3.BZZ();
                    String url = c70654Wea3.C89().getUrl();
                    C14360o3.A07(url);
                    if (c70654Wea3.BIP() != InstagramMediaProductType.A0K) {
                        z = false;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("media_id", BZZ3);
                    bundle.putString("url", url);
                    bundle.putBoolean(AbstractC111324zv.A00(2636), z);
                    C45472KBi c45472KBi = new C45472KBi();
                    c45472KBi.setArguments(bundle);
                    c140966Yy = new C140966Yy(requireActivity(), getSession());
                    c140966Yy.A0B(null, c45472KBi);
                    c140966Yy.A08();
                    c140966Yy.A04();
                    return;
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 3:
                C70654Wea c70654Wea4 = (C70654Wea) interfaceC72003XEr;
                W6I w6i5 = this.A07;
                if (w6i5 != null) {
                    w6i5.A08("promotion_list", "learn_more", c70654Wea4.BZZ(), null);
                    c70620Wdy = new C70620Wdy(1, this, c70654Wea4);
                    A02(c70620Wdy, this);
                    return;
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 4:
                C70654Wea c70654Wea5 = (C70654Wea) interfaceC72003XEr;
                WGU.A00.A07(requireContext(), new DialogInterfaceOnClickListenerC70206WHe(2, c70654Wea5, this), this, getSession(), c70654Wea5.C89(), AbstractC167007dF.A1X(c70654Wea5.BIP(), InstagramMediaProductType.A0K));
                return;
            case 5:
                c70620Wdy2 = new C70620Wdy(4, this, interfaceC72003XEr);
                A02(c70620Wdy2, this);
                return;
            case 6:
                return;
            case 7:
                C70654Wea c70654Wea6 = (C70654Wea) interfaceC72003XEr;
                ImageUrl C89 = c70654Wea6.C89();
                if (c70654Wea6.BIP() != InstagramMediaProductType.A0K) {
                    z = false;
                }
                WGU.A03(requireContext(), new DialogInterfaceOnClickListenerC70206WHe(3, c70654Wea6, this), this, C89, z);
                return;
            case 8:
                c70654Wea = (C70654Wea) interfaceC72003XEr;
                w6i = this.A07;
                if (w6i != null) {
                    BZZ = c70654Wea.BZZ();
                    str = "promotion_list";
                    str2 = "hec_review";
                    w6i.A08(str, str2, BZZ, null);
                    c70620Wdy = new C70620Wdy(2, this, c70654Wea);
                    A02(c70620Wdy, this);
                    return;
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 9:
                C70654Wea c70654Wea7 = (C70654Wea) interfaceC72003XEr;
                W6I w6i6 = this.A07;
                if (w6i6 != null) {
                    w6i6.A08("promotion_list", "view_appeal_review", c70654Wea7.BZZ(), null);
                    Context requireContext = requireContext();
                    FragmentActivity requireActivity = requireActivity();
                    UserSession session = getSession();
                    String BZZ4 = c70654Wea7.BZZ();
                    String str6 = c70654Wea7.A0D;
                    if (str6 != null) {
                        C14360o3.A0B(session, 2);
                        LMJ lmj = new LMJ(requireActivity, session, str6, BZZ4, 0);
                        LMF lmf = new LMF(BZZ4, session, 0);
                        C193328hC c193328hC = new C193328hC(requireContext);
                        c193328hC.A0A(2131970310);
                        c193328hC.A0K(lmj, 2131970296);
                        c193328hC.A0H(lmf, 2131970300);
                        c193328hC.A0t(true);
                        c193328hC.A09(2131970309);
                        c193328hC.A0C(new WHH(BZZ4, session, 0));
                        AbstractC166987dD.A1W(c193328hC);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 10:
                C70653WeZ c70653WeZ = (C70653WeZ) interfaceC72003XEr;
                W6I w6i7 = this.A07;
                if (w6i7 != null) {
                    w6i7.A08("draft_list", "enter_draft", c70653WeZ.BZZ(), null);
                    UserSession session2 = getSession();
                    String BZZ5 = c70653WeZ.BZZ();
                    C14360o3.A0B(session2, 0);
                    C38321qM A02 = C1DW.A00(session2).A02(AnonymousClass001.A0T(BZZ5, session2.userId, '_'));
                    if (A02 != null) {
                        C1Y6 A00 = AbstractC69888VxF.A00();
                        UserSession session3 = getSession();
                        String str7 = c70653WeZ.A06;
                        if (str7 != null) {
                            C14360o3.A0B(session3, 0);
                            C69667Vt8 c69667Vt8 = new C69667Vt8(requireActivity(), this, session3, A02, "ads_manager");
                            c69667Vt8.A07 = str7;
                            C70399WUb.A00(session3).A0U("ads_manager", c69667Vt8.A00());
                            C1Y6.A03(A00, new C69490VoD(c69667Vt8));
                            return;
                        }
                    } else {
                        C1Y6 A002 = AbstractC69888VxF.A00();
                        C1Y5 A003 = VRF.A00();
                        String BZZ6 = c70653WeZ.BZZ();
                        WEX A004 = A003.A00(requireContext(), getSession(), BZZ6, "ads_manager");
                        A004.A0A = WEX.A02(c70653WeZ.BZZ());
                        A004.A01 = BoostFlowType.A05;
                        String str8 = c70653WeZ.A06;
                        if (str8 != null) {
                            A004.A08 = str8;
                            A002.A0B(A004);
                            return;
                        }
                    }
                    str3 = "draftId";
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            default:
                c70620Wdy2 = new C70621Wdz(this, (C70654Wea) interfaceC72003XEr, interfaceC72003XEr);
                A02(c70620Wdy2, this);
                return;
        }
    }

    @Override // X.InterfaceC71976XDj
    public final void Dsy(InterfaceC72003XEr interfaceC72003XEr) {
        W6I w6i = this.A07;
        String str = null;
        if (w6i == null) {
            C14360o3.A0F("adsManagerLogger");
            throw C00O.createAndThrow();
        }
        w6i.A08("promotion_list", "promotion_preview", interfaceC72003XEr.BZZ(), null);
        Context requireContext = requireContext();
        UserSession session = getSession();
        String BZZ = interfaceC72003XEr.BZZ();
        XIGIGBoostCallToAction Ax0 = interfaceC72003XEr.Ax0();
        if (Ax0 != null) {
            str = Ax0.toString();
        }
        AbstractC138316On.A02(requireContext, session, "ads_manager", BZZ, str, interfaceC72003XEr.BeH(), interfaceC72003XEr.BIS());
    }

    @Override // X.InterfaceC71976XDj
    public final void E0j(InterfaceC72003XEr interfaceC72003XEr) {
        String A0R = AnonymousClass001.A0R("promote_ads_manager_fragment", ".BACK_STACK");
        WFR wfr = AbstractC68626VYc.A00;
        String BZY = interfaceC72003XEr.BZY();
        wfr.A05(requireActivity(), getSession(), A0R, BZY);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        W6I w6i = this.A07;
        if (w6i == null) {
            str = "adsManagerLogger";
        } else {
            w6i.A01(VG4.A05.toString());
            if (!this.A0V) {
                C70814WhX c70814WhX = this.A08;
                if (c70814WhX == null) {
                    str = "userFlowLogger";
                } else {
                    c70814WhX.A00();
                    return false;
                }
            } else {
                return false;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(XCJ xcj, V16 v16) {
        W6f.A01(v16.requireActivity(), xcj, v16.getSession(), "ads_manager");
    }

    public static final void A03(V16 v16) {
        FragmentActivity activity = v16.getActivity();
        if (activity != null) {
            AbstractC65702TsY.A0q();
            String string = v16.requireContext().getString(2131970315);
            Bundle bundle = new Bundle();
            bundle.putString(TraceFieldType.Error, string);
            V0B v0b = new V0B();
            v0b.setArguments(bundle);
            C140966Yy c140966Yy = new C140966Yy(v16.requireActivity(), v16.getSession());
            activity.onBackPressed();
            c140966Yy.A0D(v0b);
            c140966Yy.A04();
        }
    }

    public static final void A0D(V16 v16, String str, String str2, String str3, String str4) {
        C1Y6 A00 = AbstractC69888VxF.A00();
        WEX A002 = VRF.A00().A00(v16.requireContext(), v16.getSession(), str2, str);
        A002.A0D = v16.A0X;
        A00.A06(v16, A002, v16);
        W6I w6i = v16.A07;
        if (w6i == null) {
            C14360o3.A0F("adsManagerLogger");
            throw C00O.createAndThrow();
        }
        w6i.A0A("promotion_list", str3, str2, str4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        int A02 = C0f9.A02(-356231677);
        super.onCreate(bundle);
        if (this.mArguments != null) {
            this.A0I = AbstractC23021Ah.A00(getSession());
            UserSession session = getSession();
            C9CN A00 = A00();
            C70616Wdu c70616Wdu = new C70616Wdu(this, 0);
            C14360o3.A0B(session, 0);
            C97N.A00(C97M.A00(session)).AV3(A00, C97J.A00, c70616Wdu);
            AbstractC68461VRr.A00(A00(), new C70616Wdu(this, 1), getSession());
            this.A0B = new C67920V2k(requireContext(), this, this, this, getSession());
            this.A0C = new C69785VvQ(requireContext(), this, getSession());
            C25671My A002 = AbstractC25651Mw.A00(getSession());
            A002.A01(this.A0g, C70702WfR.class);
            A002.A01(this.A0f, C70701WfQ.class);
            this.A0G = new W1T(getSession());
            UserSession session2 = getSession();
            C14360o3.A0B(session2, 0);
            this.A0F = (C70802WhI) session2.A01(C70802WhI.class, X4S.A00);
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                str = bundle2.getString("coupon_offer_id");
            } else {
                str = null;
            }
            this.A0a = str;
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (str2 = bundle3.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY)) == null) {
                str2 = "unknown";
            }
            this.A0M = str2;
            String[] strArr = {"direct_inbox_setting_entrypoint", AbstractC43591JPw.A00(144), AbstractC43591JPw.A00(335)};
            C14360o3.A0B(strArr, 0);
            this.A0X = AbstractC009903n.A0K(strArr).contains(str2);
            this.A09 = C70399WUb.A00(getSession());
            this.A07 = VRC.A00(getSession());
            UserSession session3 = getSession();
            C14360o3.A0B(session3, 0);
            C70814WhX c70814WhX = (C70814WhX) session3.A01(C70814WhX.class, new C50163MDq(session3, 39));
            this.A08 = c70814WhX;
            if (c70814WhX == null) {
                C14360o3.A0F("userFlowLogger");
                throw C00O.createAndThrow();
            }
            if (c70814WhX.A00 != 0) {
                c70814WhX.A00();
            }
            C1QT c1qt = c70814WhX.A01;
            long flowStartForMarker = c1qt.flowStartForMarker(468331674, "ads_manager", true);
            c70814WhX.A00 = flowStartForMarker;
            c1qt.flowMarkPoint(flowStartForMarker, "navigation_start");
            if (bundle != null) {
                this.A0W = bundle.getBoolean("2FAC_DIALOG", false);
            }
            UserSession session4 = getSession();
            C14360o3.A0B(session4, 0);
            if (C18U.A06(C06090Tz.A06, session4, 36319566304976406L)) {
                UserSession session5 = getSession();
                C14360o3.A0B(session5, 0);
                ((C69589Vrs) ((C68717Vat) session5.A01(C68717Vat.class, new X31(session5, 1))).A00.getValue()).A00(new C50679MYx("AD_TOOLS", (String) null, 20));
            }
            C0f9.A09(-1662857798, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(251537034, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(388941474);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_ads_manager_view, false);
        C0f9.A09(-1971521123, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1853128164);
        super.onDestroy();
        C25671My A00 = AbstractC25651Mw.A00(getSession());
        A00.A02(this.A0g, C70702WfR.class);
        A00.A02(this.A0f, C70701WfQ.class);
        A09(this);
        C0f9.A09(1262294563, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-718740075);
        super.onPause();
        Dialog dialog = this.A04;
        if (dialog != null) {
            dialog.dismiss();
            this.A04 = null;
        }
        C0f9.A09(1990365025, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(738593311);
        super.onResume();
        C69785VvQ c69785VvQ = this.A0C;
        if (c69785VvQ == null) {
            C14360o3.A0F("promoteAdsManagerDataFetcher");
            throw C00O.createAndThrow();
        }
        C66081TzI c66081TzI = new C66081TzI(this, 7);
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, "", "access_token");
        UserSession userSession = c69785VvQ.A02;
        C0CA.A00(A0T, userSession.userId, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C2JM c2jm = new C2JM();
        AbstractC31173DnH.A1M(A0T, c2jm.A00, "query_params");
        C907442n c907442n = new C907442n(c2jm, UNX.class, "IGPromoteAdAcctFreezeQuery", false);
        C195928le.A00(userSession).ATV(new C63994SxR(1), new WW0(c66081TzI, 4), c907442n);
        A09(this);
        A04(this);
        C0f9.A09(985546281, A02);
    }
}
