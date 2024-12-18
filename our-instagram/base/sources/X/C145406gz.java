package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.6gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145406gz implements InterfaceC145416h0 {
    public C141526aV A00;
    public UserSession A01;
    public C145826hf A02;
    public AbstractC149546o6 A03;
    public C148536mO A04;
    public C147196jv A05;
    public C3t0 A06;
    public C145906hn A07;
    public C148726mh A08;
    public C146826jK A09;
    public String A0A;
    public final InterfaceC1118853a A0B;
    public final InterfaceC11380iw A0C;
    public final InterfaceC60442pS A0D;
    public final InterfaceC144586fe A0E;
    public final C1M1 A0F;
    public final C145126gX A0G;
    public final WeakReference A0H;

    private final void A00(C4SX c4sx, C38321qM c38321qM, C2Fb c2Fb, Boolean bool, Long l, String str, String str2) {
        String str3;
        String str4;
        long j;
        Long A0k;
        if (C14360o3.A0K(bool, true)) {
            str3 = c2Fb.toString();
            str4 = "tappable_rounded_border";
        } else {
            str3 = "non_tappable_squared";
            str4 = "non_tappable_squared";
        }
        UserSession userSession = this.A01;
        Long l2 = null;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        C18920wW A01 = AbstractC12220kQ.A01(this.A0D, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_ad_tap_collection_product_tile");
        A00.AAP("action", str3);
        if (str != null && (A0k = AbstractC003100w.A0k(10, str)) != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        A00.A9K("ad_id", Long.valueOf(j));
        A00.A7v("is_checkout_enabled", false);
        A00.A7v("is_tappable", bool);
        if (c4sx != null) {
            l2 = c4sx.A00;
        }
        A00.A9K("merchant_id", l2);
        A00.AAP("m_pk", c38321qM.getId());
        A00.A9K("m_t", Long.valueOf(c38321qM.BRp().A00));
        A00.A9K("product_id", l);
        A00.AAP("tile_style", str4);
        A00.AAP("tracking_token", str2);
        A00.Cht();
    }

    @Override // X.InterfaceC145496h8
    public final void CJD(Context context, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(str4, 4);
        C141526aV c141526aV = this.A00;
        if (c141526aV != null && c141526aV.A08.get() && str.length() != 0 && str2.length() != 0 && str3.length() != 0 && str4.length() != 0) {
            H8N h8n = c141526aV.A00;
            if (h8n != null) {
                h8n.ClL(str5);
            }
            C141526aV.A00(c141526aV);
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A01 = 5000;
            c146106i8.A0D = str;
            c146106i8.A02();
            c146106i8.A0L = true;
            c146106i8.A0R = true;
            c146106i8.A0G = str3;
            c146106i8.A0J = true;
            c146106i8.A0A = new C42691Ium(c141526aV, str5, str4);
            Drawable A02 = AbstractC65877Tvg.A02(context, str2);
            if (A02 != null) {
                c146106i8.A08(A02, context.getColor(AbstractC53242c7.A05(context)));
            }
            C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
            c141526aV.A01();
        }
    }

    @Override // X.InterfaceC145526hB
    public final void CiJ(C41181vS c41181vS, C41551w4 c41551w4) {
        Long l;
        long j;
        String str;
        Long l2;
        Integer num;
        Long l3;
        String str2;
        String str3;
        String str4;
        Integer num2;
        String str5;
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(c41181vS, 1);
        if (AbstractC130925vf.A0n(c41551w4)) {
            C145826hf c145826hf = this.A02;
            if (c145826hf == null) {
                C14360o3.A0F("reelViewerLogger");
                throw C00O.createAndThrow();
            }
            C145816he c145816he = c145826hf.A01;
            if (c145816he != null) {
                UserSession userSession = c145816he.A03;
                InterfaceC11380iw interfaceC11380iw = c145816he.A01;
                C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
                InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_ad_pivots_carousel_header_click");
                C38321qM c38321qM = c41181vS.A0b;
                c38321qM.getClass();
                String A07 = AbstractC41071vF.A07(userSession, c38321qM);
                Boolean bool = null;
                if (A07 != null) {
                    l = AbstractC003100w.A0k(10, A07);
                } else {
                    l = null;
                }
                if (A00.isSampled() && l != null) {
                    A00.A9K("ad_id", l);
                    InterfaceC101944i9 interfaceC101944i9 = c145816he.A00;
                    if (interfaceC101944i9 != null) {
                        j = interfaceC101944i9.CNR(c41551w4);
                    } else {
                        j = 0;
                    }
                    A00.A9K("chaining_position", Long.valueOf(j));
                    C1M1 c1m1 = c145816he.A04;
                    A00.AAP("chaining_session_id", c1m1.getSessionId());
                    A00.AAP("client_session_id", c1m1.getSessionId());
                    A00.AAP("contextual_ads_category", "");
                    A00.AAk("position", AbstractC16960so.A1N(0L, Long.valueOf(c41551w4.A01)));
                    Reel reel = c41551w4.A0H;
                    IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
                    if (intentAwareAdsInfo != null) {
                        str = intentAwareAdsInfo.A09;
                    } else {
                        str = null;
                    }
                    A00.AAP("trigger_type", str);
                    IntentAwareAdsInfo intentAwareAdsInfo2 = reel.A0B;
                    if (intentAwareAdsInfo2 != null && (str5 = intentAwareAdsInfo2.A07) != null) {
                        l2 = AbstractC003100w.A0k(10, str5);
                    } else {
                        l2 = null;
                    }
                    A00.A9K("hscroll_seed_ad_id", l2);
                    A00.AAP("container_module", interfaceC11380iw.getModuleName());
                    IntentAwareAdsInfo intentAwareAdsInfo3 = reel.A0B;
                    if (intentAwareAdsInfo3 != null) {
                        num = intentAwareAdsInfo3.A02;
                    } else {
                        num = null;
                    }
                    A00.AAP("multi_ads_type", String.valueOf(num));
                    IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
                    if (intentAwareAdsInfo4 != null && (num2 = intentAwareAdsInfo4.A02) != null) {
                        l3 = Long.valueOf(num2.intValue());
                    } else {
                        l3 = null;
                    }
                    A00.A9K("multi_ads_type_number", l3);
                    IntentAwareAdsInfo intentAwareAdsInfo5 = reel.A0B;
                    if (intentAwareAdsInfo5 != null) {
                        str2 = intentAwareAdsInfo5.A06;
                    } else {
                        str2 = null;
                    }
                    A00.AAP("multi_ads_id", str2);
                    IntentAwareAdsInfo intentAwareAdsInfo6 = reel.A0B;
                    if (intentAwareAdsInfo6 != null) {
                        str3 = intentAwareAdsInfo6.A06;
                    } else {
                        str3 = null;
                    }
                    A00.AAP("multi_ads_unit_id", str3);
                    IntentAwareAdsInfo intentAwareAdsInfo7 = reel.A0B;
                    if (intentAwareAdsInfo7 != null) {
                        str4 = intentAwareAdsInfo7.A04;
                    } else {
                        str4 = null;
                    }
                    A00.AAP("insertion_mechanism", str4);
                    IntentAwareAdsInfo intentAwareAdsInfo8 = reel.A0B;
                    if (intentAwareAdsInfo8 != null) {
                        bool = intentAwareAdsInfo8.A01;
                    }
                    A00.A7v("is_seed_ad_multi_ads_eligible", bool);
                    A00.AAP("tracking_token", c41181vS.BzL(userSession));
                    A00.Cht();
                }
            }
        }
    }

    @Override // X.InterfaceC145556hE
    public final void CuX(C41181vS c41181vS) {
        C14360o3.A0B(c41181vS, 0);
        this.A0E.CuX(c41181vS);
    }

    @Override // X.InterfaceC145446h3, X.InterfaceC145596hI
    public final void D2A(C41181vS c41181vS, C41551w4 c41551w4, InterfaceC138906Qw interfaceC138906Qw) {
        Context context;
        String str;
        Fragment fragment = (Fragment) this.A0H.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            InterfaceC1118853a interfaceC1118853a = this.A0B;
            interfaceC1118853a.EJ8(true);
            interfaceC1118853a.EJE("tapped");
            C145826hf c145826hf = this.A02;
            if (c145826hf == null) {
                str = "reelViewerLogger";
            } else {
                Reel reel = c41551w4.A0H;
                if (c41181vS.CY4()) {
                    C38321qM c38321qM = c41181vS.A0b;
                    if (c38321qM != null) {
                        UserSession userSession = c145826hf.A06;
                        C145836hg c145836hg = c145826hf.A0A;
                        c145836hg.A00 = reel;
                        C82713mZ A04 = AbstractC82703mY.A04(c38321qM, c145836hg, "caption_more_click");
                        A04.A0G(userSession, c38321qM);
                        A04.A8E = interfaceC138906Qw.B32();
                        Map BMV = interfaceC138906Qw.BMV();
                        C11520jB c11520jB = A04.A0m;
                        if (c11520jB == null) {
                            c11520jB = new C11520jB();
                            A04.A0m = c11520jB;
                        }
                        c11520jB.A04(C5I8.A4u, Boolean.valueOf(Boolean.parseBoolean((String) BMV.getOrDefault("is_systematic_caption", "false"))));
                        C145826hf.A04(A04, (C37948Gmq) c145826hf.A0I.get(c41181vS.CGe()), c145826hf);
                        String str2 = C1QM.A00.A02.A00;
                        if (str2 != null) {
                            A04.A6C = str2;
                        }
                        C32U.A0C(userSession, A04, c38321qM, c145836hg, null);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                AbstractC149546o6 abstractC149546o6 = this.A03;
                if (abstractC149546o6 == null) {
                    str = "reelViewerBottomSheetManager";
                } else {
                    String moduleName = this.A0C.getModuleName();
                    if (abstractC149546o6 instanceof C143536ds) {
                        abstractC149546o6.A07(context, c41551w4, moduleName, null);
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC145476h6
    public final void D2D(boolean z, boolean z2) {
        this.A0E.Dwo(false);
        this.A0B.EJ8(true);
    }

    @Override // X.InterfaceC145506h9
    public final void D8o(C84823qW c84823qW, float f, float f2) {
        C14360o3.A0B(c84823qW, 0);
        A03(c84823qW, "tap_cta_sticker_attempt", f, f2);
    }

    @Override // X.InterfaceC145506h9
    public final void D8p(C41181vS c41181vS, C2Fb c2Fb, float f, float f2) {
        C14360o3.A0B(c41181vS, 0);
        A01(c41181vS, c2Fb, "tap_cta_sticker", f, f2);
    }

    @Override // X.InterfaceC145466h5
    public final void DDe(C41181vS c41181vS) {
        InterfaceC147266kB interfaceC147266kB;
        C14360o3.A0B(c41181vS, 0);
        C145176gc c145176gc = (C145176gc) this.A0E;
        if (c41181vS.CdW() && (interfaceC147266kB = ((ReelViewerFragment) c145176gc.A18).mViewPager) != null && interfaceC147266kB.isIdle()) {
            c145176gc.CJE(null, c41181vS, null, C2Fb.A3m);
        }
    }

    @Override // X.InterfaceC145466h5
    public final void DDf(C41181vS c41181vS) {
        InterfaceC147266kB interfaceC147266kB;
        C14360o3.A0B(c41181vS, 0);
        C145176gc c145176gc = (C145176gc) this.A0E;
        if (c41181vS.CdW() && (interfaceC147266kB = ((ReelViewerFragment) c145176gc.A18).mViewPager) != null && interfaceC147266kB.isIdle()) {
            c145176gc.CJE(null, c41181vS, null, C2Fb.A3n);
        }
    }

    @Override // X.InterfaceC145576hG
    public final void DF4(C41181vS c41181vS, C141596ac c141596ac, float[] fArr) {
        float f = (c141596ac.A0A / 1000.0f) * c141596ac.A0B;
        C145826hf c145826hf = this.A02;
        if (c145826hf != null) {
            c145826hf.A08(c41181vS, f);
            InterfaceC1118853a interfaceC1118853a = this.A0B;
            C41551w4 Aun = interfaceC1118853a.Aun(c41181vS.A0k);
            if (Aun != null) {
                C145826hf c145826hf2 = this.A02;
                if (c145826hf2 != null) {
                    c145826hf2.A0K(Aun, ((C146226iL) ((ReelViewerFragment) interfaceC1118853a).A1C).A0C.C00(c41181vS), null, "tap_expand_story", fArr[0], fArr[1]);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("reelViewerLogger");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC145576hG
    public final void DF5(View view, boolean z) {
        C145126gX c145126gX;
        C149206nU c149206nU;
        C14360o3.A0B(view, 0);
        if (z && (c149206nU = (c145126gX = this.A0G).A0G) != null) {
            UserSession userSession = c145126gX.A00;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            C5SW c5sw = c149206nU.A00;
            if ((c5sw == null || !c5sw.A09()) && !c149206nU.A03.getBoolean(c149206nU.A04, false)) {
                C5SU c5su = c149206nU.A02;
                c5su.A03(view);
                C5SW A00 = c5su.A00();
                c149206nU.A00 = A00;
                A00.A07(userSession);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        if (r14 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        r0 = r0.A0b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r0.A5M() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        X.F7W.A00(r6, r21, "feed_ufi", r9, r10, r11, r12, r22, r14, r15, r16, false, true, false);
        instagram.features.stories.fragment.ReelViewerFragment.A0I(r1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        if (r0 != null) goto L33;
     */
    @Override // X.InterfaceC145586hH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DIV(com.instagram.common.session.UserSession r21, java.lang.String r22) {
        /*
            r20 = this;
            r2 = 0
            r18 = 1
            r5 = r20
            java.lang.ref.WeakReference r0 = r5.A0H
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L79
            android.content.Context r6 = r0.getContext()
            if (r6 == 0) goto L79
            X.53a r1 = r5.A0B
            instagram.features.stories.fragment.ReelViewerFragment r1 = (instagram.features.stories.fragment.ReelViewerFragment) r1
            X.1w4 r3 = r1.A0a
            if (r3 != 0) goto L80
            r0 = 0
        L1e:
            r11 = 0
            r7 = r21
            if (r0 == 0) goto L7e
            X.1qM r4 = r0.A0b
            if (r4 == 0) goto L7e
            boolean r3 = X.C87153uY.A03(r7, r4)
            if (r3 == 0) goto L7e
            com.instagram.user.model.User r3 = X.C87153uY.A01(r7, r4)
            if (r3 == 0) goto L7e
            java.lang.String r15 = r3.getId()
        L37:
            X.0iw r3 = r5.A0C
            java.lang.String r9 = r3.getModuleName()
            if (r0 == 0) goto L7c
            X.1qM r3 = r0.A0b
            if (r3 == 0) goto L7c
            java.lang.String r10 = r3.getId()
        L47:
            java.lang.String r4 = ""
            if (r10 != 0) goto L4c
            r10 = r4
        L4c:
            if (r0 == 0) goto L7a
            java.lang.String r11 = r0.A0k
            java.lang.String r12 = r0.A0j
            X.1v4 r3 = r0.A0g
            if (r3 == 0) goto L5a
            java.lang.String r14 = r3.A0S
            if (r14 != 0) goto L5d
        L5a:
            r14 = r4
            if (r0 == 0) goto L69
        L5d:
            X.1qM r0 = r0.A0b
            if (r0 == 0) goto L69
            boolean r0 = r0.A5M()
            r16 = -1
            if (r0 == 0) goto L6b
        L69:
            r16 = 0
        L6b:
            java.lang.String r8 = "feed_ufi"
            r13 = r22
            r19 = r2
            r17 = r2
            X.F7W.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            instagram.features.stories.fragment.ReelViewerFragment.A0I(r1, r2)
        L79:
            return
        L7a:
            r12 = r11
            goto L5a
        L7c:
            r10 = r11
            goto L47
        L7e:
            r15 = r11
            goto L37
        L80:
            com.instagram.common.session.UserSession r0 = r1.getSession()
            X.C14360o3.A0B(r0, r2)
            java.util.List r0 = X.C41551w4.A00(r0, r3)
            java.lang.Object r0 = r0.get(r2)
            X.1vS r0 = (X.C41181vS) r0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145406gz.DIV(com.instagram.common.session.UserSession, java.lang.String):void");
    }

    @Override // X.InterfaceC145426h1
    public final void DJz(C84823qW c84823qW, boolean z) {
        String str;
        String str2;
        if (c84823qW.A1g.equals("interactive_media_tooltip_from_tap_and_hold") && !z) {
            str = "long_pressed";
        } else {
            str = "tapped";
        }
        InterfaceC1118853a interfaceC1118853a = this.A0B;
        interfaceC1118853a.EJE(str);
        InterfaceC144586fe interfaceC144586fe = this.A0E;
        interfaceC144586fe.Ddl(c84823qW, (int) c84823qW.A03, (int) c84823qW.A04);
        if (!z) {
            C41181vS AuU = interfaceC1118853a.AuU();
            if (AuU != null) {
                boolean A0b = AbstractC130925vf.A0b(AuU);
                boolean equals = c84823qW.A1g.equals("interactive_media_tooltip_from_tap_and_hold");
                if (A0b) {
                    if (!equals) {
                        str2 = "tap_interactive_media";
                    } else {
                        str2 = "tap_and_hold_non_9x16_interactive_media";
                    }
                } else if (!equals) {
                    str2 = "tap_9x16_interactive_media";
                } else {
                    str2 = "tap_and_hold_9x16_interactive_media";
                }
                A02(AuU, str2, c84823qW.A03, c84823qW.A04);
            } else {
                return;
            }
        }
        if (c84823qW.A1g.equals("interactive_media_tooltip_from_tap_and_hold") && z) {
            interfaceC144586fe.Dwo(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r0.A04() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r1 == false) goto L8;
     */
    @Override // X.InterfaceC145506h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DKb(X.C84823qW r6) {
        /*
            r5 = this;
            r4 = 0
            X.C14360o3.A0B(r6, r4)
            X.6mO r0 = r5.A04
            java.lang.String r3 = "reelInteractiveController"
            if (r0 == 0) goto L39
            X.3qW r0 = r0.A01
            if (r0 == 0) goto L15
            boolean r1 = r0.equals(r6)
            r0 = 1
            if (r1 != 0) goto L16
        L15:
            r0 = 0
        L16:
            r2 = 1
            if (r0 == 0) goto L24
            X.6mO r0 = r5.A04
            if (r0 == 0) goto L39
            boolean r0 = r0.A04()
            r1 = 1
            if (r0 != 0) goto L25
        L24:
            r1 = 0
        L25:
            X.6mO r0 = r5.A04
            if (r0 == 0) goto L39
            boolean r0 = r0.A04()
            if (r0 == 0) goto L38
            r6.A1q = r2
            X.6mO r0 = r5.A04
            if (r0 == 0) goto L39
            r0.A03(r6, r2, r4)
        L38:
            return r1
        L39:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145406gz.DKb(X.3qW):boolean");
    }

    @Override // X.InterfaceC145436h2
    public final void DMV(C84823qW c84823qW) {
        String str;
        C41551w4 c41551w4;
        long j;
        Long A0k;
        String str2;
        C14360o3.A0B(c84823qW, 0);
        String str3 = null;
        A03(c84823qW, null, c84823qW.A03, c84823qW.A04);
        InterfaceC1118853a interfaceC1118853a = this.A0B;
        C41181vS AuU = interfaceC1118853a.AuU();
        if (AuU != null) {
            if (c84823qW.A1I.booleanValue()) {
                str = "tap_interactive_sticker_present_tooltip";
            } else {
                str = "tap_interactive_sticker_dismiss_tooltip";
            }
            A02(AuU, str, c84823qW.A03, c84823qW.A04);
            if (AuU.A1A() && c84823qW.A1I.booleanValue() && (c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a) != null) {
                C145826hf c145826hf = this.A02;
                if (c145826hf == null) {
                    str2 = "reelViewerLogger";
                } else {
                    UserSession userSession = this.A01;
                    if (userSession == null) {
                        str2 = "userSession";
                    } else {
                        C18920wW A01 = AbstractC12220kQ.A01(C145826hf.A01(c41551w4.A0H, c145826hf), userSession);
                        C38321qM c38321qM = AuU.A0b;
                        C40971v4 c40971v4 = AuU.A0g;
                        Long l = null;
                        if (c40971v4 != null) {
                            str3 = c40971v4.A0S;
                        }
                        IGCTMessagingAdsInfoDictIntf A00 = AbstractC41071vF.A00(userSession, c38321qM);
                        if (A00 != null) {
                            l = Long.valueOf(VTE.A00(A00));
                        }
                        InterfaceC02590Ai A002 = A01.A00(A01.A00, "whatsapp_sticker_tooltip_impression");
                        if (A002.isSampled()) {
                            long j2 = 0;
                            if (str3 != null && (A0k = AbstractC003100w.A0k(10, str3)) != null) {
                                j = A0k.longValue();
                            } else {
                                j = 0;
                            }
                            A002.A9K("ad_id", Long.valueOf(j));
                            if (l != null) {
                                j2 = l.longValue();
                            }
                            A002.A9K("page_id", Long.valueOf(j2));
                            String A06 = AbstractC41071vF.A06(userSession, c38321qM);
                            if (A06 == null) {
                                if (c38321qM != null) {
                                    A06 = c38321qM.A0C.getOrganicTrackingToken();
                                } else {
                                    A06 = null;
                                }
                            }
                            A002.AAP("client_token", A06);
                            A002.AAP(AbstractC37316GcI.A00(0, 10, 12), c145826hf.A0E.getSessionId());
                            A002.A8R(XNX.PAGE_INSTAGRAM_STORY, "on_feed_messaging_surface");
                            A002.AAP("message_destination", "WHATSAPP");
                            A002.Cht();
                            return;
                        }
                        return;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.InterfaceC145426h1
    public final void DMZ(C41181vS c41181vS, C84823qW c84823qW, C2Fb c2Fb) {
        String str;
        float f = c84823qW.A03;
        float f2 = c84823qW.A04;
        boolean A0b = AbstractC130925vf.A0b(c41181vS);
        boolean equals = c84823qW.A1g.equals("interactive_media_tooltip_from_tap_and_hold");
        if (A0b) {
            if (!equals) {
                str = "tap_interactive_media_tooltip";
            } else {
                str = "tap_and_hold_non_9x16_interactive_media_tooltip";
            }
        } else if (!equals) {
            str = "tap_9x16_interactive_media_tooltip";
        } else {
            str = "tap_and_hold_9x16_interactive_media_tooltip";
        }
        A01(c41181vS, c2Fb, str, f, f2);
        if (c84823qW.A1g.equals("interactive_media_tooltip_from_tap_and_hold")) {
            this.A0E.Dwo(true);
        }
    }

    @Override // X.InterfaceC144616fh
    public final boolean DQr(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A0E.DQr(motionEvent);
    }

    @Override // X.InterfaceC145486h7
    public final void DTq(C41181vS c41181vS, C41551w4 c41551w4, float f, float f2) {
        FragmentActivity activity;
        User user;
        String str;
        C145826hf c145826hf = this.A02;
        String str2 = null;
        if (c145826hf == null) {
            str = "reelViewerLogger";
        } else {
            InterfaceC1118853a interfaceC1118853a = this.A0B;
            c145826hf.A0K(c41551w4, ((ReelViewerFragment) interfaceC1118853a).A1C.C00(c41181vS), null, "tap_social_context", f, f2);
            Fragment fragment = (Fragment) this.A0H.get();
            if (fragment != null && (activity = fragment.getActivity()) != null && (user = c41181vS.A0i) != null) {
                UserSession userSession = this.A01;
                str = "userSession";
                if (userSession != null) {
                    C06090Tz c06090Tz = C06090Tz.A06;
                    if (C18U.A06(c06090Tz, userSession, 36320850501379015L)) {
                        interfaceC1118853a.EJ8(true);
                        interfaceC1118853a.EJE("tapped");
                        UserSession userSession2 = this.A01;
                        if (userSession2 != null) {
                            InterfaceC11380iw interfaceC11380iw = this.A0C;
                            C38321qM c38321qM = c41181vS.A0b;
                            if (c38321qM != null) {
                                str2 = c38321qM.getId();
                            }
                            UserSession userSession3 = this.A01;
                            if (userSession3 != null) {
                                boolean A06 = C18U.A06(c06090Tz, userSession3, 36320850501444552L);
                                UserSession userSession4 = this.A01;
                                if (userSession4 != null) {
                                    FYC.A01(activity, interfaceC11380iw, userSession2, new C24115An0(this), user, str2, A06, C18U.A06(c06090Tz, userSession4, 2342163859715204041L));
                                    return;
                                }
                            }
                        }
                    } else {
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

    @Override // X.InterfaceC145486h7
    public final void DTr(RectF rectF, C41181vS c41181vS, C41551w4 c41551w4, Integer num) {
        C14360o3.A0B(num, 2);
        this.A0E.Ddw(null, c41181vS, c41551w4, num, false);
    }

    @Override // X.InterfaceC145616hK
    public final void DU2(C41181vS c41181vS, C41551w4 c41551w4, C84823qW c84823qW) {
        String str;
        C14360o3.A0B(c41551w4, 1);
        C14360o3.A0B(c41181vS, 2);
        C145826hf c145826hf = this.A02;
        if (c145826hf == null) {
            str = "reelViewerLogger";
        } else {
            c145826hf.A0B(c41181vS, c41551w4, C05F.A00);
            C147196jv c147196jv = this.A05;
            str = "reelUserProfileTooltipHelper";
            if (c147196jv != null) {
                C51622Yk c51622Yk = c147196jv.A05;
                if (c51622Yk != null && c51622Yk.isShowing()) {
                    C147196jv c147196jv2 = this.A05;
                    if (c147196jv2 != null) {
                        c147196jv2.A00(true, false);
                        return;
                    }
                } else {
                    A03(c84823qW, "tap_multi_advertiser_carousel_banner_cta", c84823qW.A03, c84823qW.A04);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    @Override // X.InterfaceC145536hC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DU4(android.graphics.RectF r19, X.C41181vS r20, X.C41551w4 r21) {
        /*
            r18 = this;
            r6 = 1
            r2 = r20
            X.1pE r4 = r2.A08
            if (r4 == 0) goto Le0
            java.lang.String r3 = "multi_ad_pop_up_"
            java.lang.String r0 = r4.A1V
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto Lc4
            java.lang.String r3 = X.AnonymousClass001.A0R(r3, r0)
            X.1pE r0 = X.AbstractC37741pB.A00
            X.C14360o3.A0B(r3, r6)
            X.3Qg r0 = new X.3Qg
            r0.<init>(r4)
            r0.A1V = r3
            X.1pE r4 = r0.A00()
            r5 = r18
            com.instagram.common.session.UserSession r0 = r5.A01
            java.lang.String r8 = "userSession"
            if (r0 == 0) goto Lbc
            com.instagram.reels.store.ReelStore r3 = com.instagram.reels.store.ReelStore.A03(r0)
            java.util.List r0 = java.util.Collections.singletonList(r4)
            X.C14360o3.A07(r0)
            java.util.ArrayList r0 = r3.A0S(r0)
            java.lang.Object r11 = X.AbstractC001800i.A0I(r0)
            com.instagram.model.reels.Reel r11 = (com.instagram.model.reels.Reel) r11
            r3 = r21
            com.instagram.model.reels.Reel r0 = r3.A0H
            com.instagram.api.schemas.IntentAwareAdsInfo r0 = r0.A0B
            if (r0 == 0) goto Lb6
            r11.A0B = r0
            com.instagram.common.session.UserSession r0 = r5.A01
            if (r0 == 0) goto Lbc
            java.util.List r0 = r11.A0O(r0)
            int r0 = r0.size()
            int r0 = r0 - r6
            r11.A00 = r0
            com.instagram.common.session.UserSession r10 = r5.A01
            if (r10 == 0) goto Lbc
            r14 = -1
            boolean r17 = r11.CdW()
            long r15 = java.lang.System.currentTimeMillis()
            java.lang.String r12 = r3.A0I
            java.lang.String r13 = r3.A0J
            X.1w4 r9 = new X.1w4
            r9.<init>(r10, r11, r12, r13, r14, r15, r17)
            com.instagram.common.session.UserSession r7 = r5.A01
            if (r7 == 0) goto Lbc
            X.0Tz r0 = X.C06090Tz.A06
            r3 = 36317792485709402(0x8106d70023165a, double:3.03085643575037E-306)
            boolean r0 = X.C18U.A06(r0, r7, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb4
            com.instagram.common.session.UserSession r0 = r5.A01
            if (r0 == 0) goto Lbc
            java.util.List r0 = r11.A0O(r0)
            int r0 = r0.size()
            if (r0 <= r6) goto Lb4
            com.instagram.common.session.UserSession r0 = r5.A01
            if (r0 == 0) goto Lbc
            X.1vS r0 = r11.A0A(r0, r6)
            X.1qM r0 = r0.A0b
            if (r0 == 0) goto Lb4
            java.lang.String r10 = r0.getId()
        La6:
            X.3t0 r4 = r5.A06
            if (r4 != 0) goto Lca
            java.lang.String r0 = "highlightReelOpener"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lb4:
            r10 = 0
            goto La6
        Lb6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lbc:
            X.C14360o3.A0F(r8)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lc4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lca:
            com.instagram.model.reels.Reel r0 = r9.A0H
            java.lang.String r9 = r0.getId()
            X.C14360o3.A07(r9)
            com.instagram.user.model.User r0 = r2.A0i
            if (r0 == 0) goto Le1
            X.3G2 r7 = X.C3G2.A1P
            r6 = 0
            r5 = r19
            r8 = r0
            r4.A00(r5, r6, r7, r8, r9, r10)
        Le0:
            return
        Le1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145406gz.DU4(android.graphics.RectF, X.1vS, X.1w4):void");
    }

    @Override // X.InterfaceC145536hC
    public final void DXi(C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac) {
        C145906hn c145906hn = this.A07;
        if (c145906hn == null) {
            C14360o3.A0F("reelProfileOpener");
            throw C00O.createAndThrow();
        }
        c145906hn.A02(C65.BRAND, c41181vS, c41551w4, c141596ac, c41181vS.A0L(), "sponsor_in_header", "reel_viewer_go_to_profile", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x012a, code lost:
    
        if (X.C18U.A06(r8, r9, r0) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012c, code lost:
    
        r2 = android.os.SystemClock.uptimeMillis() - r13.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0138, code lost:
    
        if (r0.A5f() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013e, code lost:
    
        if (r0.A6K() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0140, code lost:
    
        r1 = r31.A12.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0148, code lost:
    
        if (r1 == 10) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x014c, code lost:
    
        if (r1 == 7) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014e, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0153, code lost:
    
        if (r2 < r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0155, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015e, code lost:
    
        if (r2 >= 2000.0d) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0160, code lost:
    
        if (r23 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0166, code lost:
    
        if (r31.A12 != X.EnumC75383a5.A0T) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016c, code lost:
    
        if (r0.A5f() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0172, code lost:
    
        if (r0.A6K() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0174, code lost:
    
        r13.A0p = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0178, code lost:
    
        ((X.C146226iL) r15.A1C).A0C.C00(r11).A0o = true;
        ((X.C146226iL) r15.A1C).A0C.C00(r11).A0X = r32;
        r1 = r29.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0198, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x019a, code lost:
    
        r0 = "reelInteractiveController";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0213, code lost:
    
        if (r1.A04() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0215, code lost:
    
        r1.A03(r31, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x021a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x021b, code lost:
    
        r1 = r1.A08;
        r0 = r1.Aqk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0221, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0223, code lost:
    
        r1.DZg(r0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0226, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019e, code lost:
    
        if (r23 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b9, code lost:
    
        r0 = 36608866712229666L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01be, code lost:
    
        r4 = X.C18U.A01(r8, r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a1, code lost:
    
        r0 = 36608866712164129L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ab, code lost:
    
        if (r0.A5f() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ad, code lost:
    
        r0 = 36609442238175117L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b3, code lost:
    
        r0 = 36609442238109580L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x020b, code lost:
    
        if (r31.A04 <= r2) goto L47;
     */
    @Override // X.InterfaceC145446h3, X.InterfaceC145476h6, X.InterfaceC145546hD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DbT(android.content.Context r30, X.C84823qW r31, java.lang.Integer r32) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145406gz.DbT(android.content.Context, X.3qW, java.lang.Integer):void");
    }

    @Override // X.InterfaceC145486h7
    public final boolean Ddk(C84823qW c84823qW, int i, int i2) {
        InterfaceC1118853a interfaceC1118853a = this.A0B;
        C41181vS AuU = interfaceC1118853a.AuU();
        C38321qM c38321qM = null;
        if (AuU != null) {
            c38321qM = AuU.A0b;
        }
        if (c84823qW.A12.ordinal() == 36 && AbstractC130925vf.A0U(c38321qM) && AuU != null && c38321qM != null) {
            if (this.A01 == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            if (((C146226iL) ((ReelViewerFragment) interfaceC1118853a).A1C).A0C.C00(AuU).A0N <= 0 || SystemClock.uptimeMillis() - r2 < C18U.A01(C06090Tz.A06, r6, 36612749362534810L)) {
                return false;
            }
        }
        return this.A0E.Ddl(c84823qW, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r4.A6E() != true) goto L12;
     */
    @Override // X.InterfaceC144616fh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ddl(X.C84823qW r11, int r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            X.C14360o3.A0B(r11, r0)
            X.53a r2 = r10.A0B
            X.1vS r0 = r2.AuU()
            r6 = 0
            if (r0 == 0) goto L88
            X.1qM r4 = r0.A0b
        Lf:
            X.3a5 r0 = r11.A12
            int r3 = r0.ordinal()
            r1 = 1
            r0 = 7
            if (r3 == r0) goto L85
            r0 = 10
            if (r3 != r0) goto L99
            if (r4 == 0) goto L26
            boolean r3 = r4.A6E()
            r0 = 1
            if (r3 == r1) goto L27
        L26:
            r0 = 0
        L27:
            java.lang.String r3 = "reelInteractiveController"
            if (r0 == 0) goto L39
            X.6mO r0 = r10.A04
            if (r0 == 0) goto L63
            X.3qW r0 = r0.A01
            if (r0 == 0) goto L77
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L77
        L39:
            if (r4 == 0) goto L4f
            boolean r0 = r4.A6D()
            if (r0 != r1) goto L4f
            X.6mO r0 = r10.A04
            if (r0 == 0) goto L63
            X.3qW r0 = r0.A01
            if (r0 == 0) goto L6b
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L6b
        L4f:
            java.lang.String r7 = "media_tap"
        L51:
            X.1vS r1 = r2.AuU()
            if (r1 == 0) goto L99
            instagram.features.stories.fragment.ReelViewerFragment r2 = (instagram.features.stories.fragment.ReelViewerFragment) r2
            X.1w4 r4 = r2.A0a
            if (r4 == 0) goto L99
            X.6hf r3 = r10.A02
            if (r3 != 0) goto L8a
            java.lang.String r3 = "reelViewerLogger"
        L63:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L6b:
            boolean r0 = r4.A5f()
            if (r0 != r1) goto L74
            java.lang.String r7 = "story_frida_tap"
            goto L51
        L74:
            java.lang.String r7 = "showreel_bloks_media_tap"
            goto L51
        L77:
            if (r4 == 0) goto L82
            boolean r0 = r4.A6K()
            if (r0 != r1) goto L82
            java.lang.String r7 = "story_tesla_tap"
            goto L51
        L82:
            java.lang.String r7 = "showreel_native_media_tap"
            goto L51
        L85:
            java.lang.String r7 = "collection_thumbnail_tap_open"
            goto L51
        L88:
            r4 = r6
            goto Lf
        L8a:
            float r8 = (float) r12
            float r9 = (float) r13
            X.5Gn r0 = r2.A1C
            X.6iL r0 = (X.C146226iL) r0
            X.6iR r0 = r0.A0C
            X.6ac r5 = r0.C00(r1)
            r3.A0K(r4, r5, r6, r7, r8, r9)
        L99:
            X.6fe r0 = r10.A0E
            boolean r0 = r0.Ddl(r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145406gz.Ddl(X.3qW, int, int):boolean");
    }

    @Override // X.InterfaceC145526hB
    public final void Ddw(RectF rectF, C41181vS c41181vS, C41551w4 c41551w4, Integer num, boolean z) {
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(num, 2);
        this.A0E.Ddw(null, c41181vS, c41551w4, num, z);
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean Drb(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent, 0);
        C14360o3.A0B(motionEvent2, 1);
        return this.A0E.Drb(motionEvent, motionEvent2, f, f2);
    }

    @Override // X.InterfaceC145546hD
    public final void DsI(FragmentActivity fragmentActivity, C38321qM c38321qM, Integer num, int i, boolean z) {
        C2Fb c2Fb;
        ProductDetailsProductItemDictIntf Bgl;
        Boolean bool;
        EnumC906041v A01;
        C14360o3.A0B(fragmentActivity, 2);
        List Ap5 = c38321qM.A0C.Ap5();
        C14360o3.A0C(Ap5, "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.feed.media.Media>");
        List A02 = C15500q5.A02(Ap5);
        UserSession userSession = this.A01;
        Integer num2 = null;
        r2 = null;
        C4SX c4sx = null;
        if (userSession != null) {
            String A07 = AbstractC41071vF.A07(userSession, c38321qM);
            if (this.A01 != null) {
                String A33 = c38321qM.A33();
                if (z) {
                    if (num == C05F.A0N) {
                        c2Fb = C2Fb.A3c;
                    } else {
                        c2Fb = C2Fb.A3b;
                    }
                } else {
                    c2Fb = C2Fb.A3d;
                }
                int i2 = i + 1;
                if (A02 != null && i2 < A02.size()) {
                    InterfaceC102674k2 C5N = ((C38321qM) A02.get(i2)).A0C.C5N();
                    Long l = null;
                    if (C5N == null) {
                        A00(null, c38321qM, c2Fb, false, null, A07, A33);
                        return;
                    }
                    List BNi = C5N.BNi();
                    UserSession userSession2 = this.A01;
                    if (userSession2 != null) {
                        AndroidLink A03 = AbstractC905941u.A03(fragmentActivity, userSession2, BNi, false);
                        if (A03 != null && (A01 = AbstractC114965Hm.A01(A03)) != null) {
                            String CHN = A03.CHN();
                            UserSession userSession3 = this.A01;
                            if (userSession3 != null) {
                                List A0K = AbstractC41071vF.A0K(userSession3, c38321qM);
                                if (CHN != null) {
                                    bool = true;
                                    UserSession userSession4 = this.A01;
                                    if (userSession4 != null) {
                                        String id = c38321qM.getId();
                                        if (id != null) {
                                            AbstractC41776Ies.A07(fragmentActivity, userSession4, A01, c2Fb, CHN, id, this.A0D.getModuleName(), A07, A33, A0K);
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                }
                                bool = null;
                            }
                        } else {
                            if (C5N.Bgl() != null && (Bgl = C5N.Bgl()) != null) {
                                Product A012 = AbstractC38048Gob.A01(Bgl);
                                bool = true;
                                UserSession userSession5 = this.A01;
                                if (userSession5 != null) {
                                    C38683GzO A032 = C128205qp.A03(userSession5, A012);
                                    l = Long.valueOf(Long.parseLong(A012.A0H));
                                    C4SX c4sx2 = A032.A01;
                                    C1XJ c1xj = C1XJ.A00;
                                    UserSession userSession6 = this.A01;
                                    if (userSession6 != null) {
                                        C42130Ile A0L = c1xj.A0L(fragmentActivity, userSession6, this.A0D, A012, "collection_ads", null);
                                        UserSession userSession7 = this.A01;
                                        if (userSession7 != null) {
                                            C38321qM A1g = c38321qM.A1g(userSession7);
                                            UserSession userSession8 = this.A01;
                                            if (userSession8 != null) {
                                                A0L.A02(A1g, Integer.valueOf(c38321qM.A16(userSession8)));
                                                A0L.A0b = true;
                                                A0L.A08 = null;
                                                UserSession userSession9 = this.A01;
                                                if (userSession9 != null) {
                                                    A0L.A0X = c38321qM.A1g(userSession9).CdW();
                                                    A0L.A0a = true;
                                                    C42130Ile.A01(A0L);
                                                    c4sx = c4sx2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            bool = null;
                        }
                        A00(c4sx, c38321qM, c2Fb, bool, l, A07, A33);
                        return;
                    }
                } else {
                    C0f5 AEp = C18950wb.A01.AEp("AD_NEED_MORE_THUMBNAIL_LINK_COUNT", 817903741);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Needed thumbnail link at index ");
                    sb.append(i2);
                    sb.append(" for collection ad ");
                    sb.append(A07);
                    sb.append(" but had ");
                    if (A02 != null) {
                        num2 = Integer.valueOf(A02.size());
                    }
                    sb.append(num2);
                    sb.append(" media");
                    AEp.ABW(DialogModule.KEY_MESSAGE, sb.toString());
                    AEp.report();
                    return;
                }
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC145636hM
    public final void Dsh(C41181vS c41181vS, C41551w4 c41551w4, String str) {
        Context context;
        C14360o3.A0B(c41551w4, 0);
        Fragment fragment = (Fragment) this.A0H.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            InterfaceC1118853a interfaceC1118853a = this.A0B;
            interfaceC1118853a.EJ8(true);
            interfaceC1118853a.EJE("tapped");
            AbstractC149546o6 abstractC149546o6 = this.A03;
            if (abstractC149546o6 == null) {
                C14360o3.A0F("reelViewerBottomSheetManager");
                throw C00O.createAndThrow();
            }
            abstractC149546o6.A07(context, c41551w4, this.A0C.getModuleName(), str);
        }
    }

    @Override // X.InterfaceC145516hA
    public final void EIJ(C41181vS c41181vS, float[] fArr) {
        InterfaceC1118853a interfaceC1118853a = this.A0B;
        C41551w4 Aun = interfaceC1118853a.Aun(c41181vS.A0k);
        if (Aun != null) {
            C145826hf c145826hf = this.A02;
            if (c145826hf == null) {
                C14360o3.A0F("reelViewerLogger");
                throw C00O.createAndThrow();
            }
            c145826hf.A0K(Aun, ((C146226iL) ((ReelViewerFragment) interfaceC1118853a).A1C).A0C.C00(c41181vS), null, "swipe_up_guidance_tap", fArr[0], fArr[1]);
        }
    }

    private final void A02(C41181vS c41181vS, String str, float f, float f2) {
        InterfaceC1118853a interfaceC1118853a = this.A0B;
        C41551w4 Aun = interfaceC1118853a.Aun(c41181vS.A0k);
        if (Aun != null) {
            C145826hf c145826hf = this.A02;
            if (c145826hf == null) {
                C14360o3.A0F("reelViewerLogger");
                throw C00O.createAndThrow();
            }
            c145826hf.A0K(Aun, ((C146226iL) ((ReelViewerFragment) interfaceC1118853a).A1C).A0C.C00(c41181vS), null, str, f, f2);
        }
    }

    private final void A03(C84823qW c84823qW, String str, float f, float f2) {
        InterfaceC1118853a interfaceC1118853a = this.A0B;
        interfaceC1118853a.EJE("tapped");
        this.A0E.Ddl(c84823qW, (int) c84823qW.A03, (int) c84823qW.A04);
        C41181vS AuU = interfaceC1118853a.AuU();
        if (AuU != null && str != null) {
            A02(AuU, str, f, f2);
        }
    }

    @Override // X.InterfaceC145506h9
    public final void AAh(CountDownTimer countDownTimer) {
        HashSet hashSet = ((C145176gc) this.A0E).A10;
        if (hashSet == null) {
            C14360o3.A0F("upcomingEventCountDownTimers");
            throw C00O.createAndThrow();
        }
        hashSet.add(countDownTimer);
    }

    @Override // X.InterfaceC145426h1
    public final C84823qW Bx4() {
        C148536mO c148536mO = this.A04;
        if (c148536mO == null) {
            C14360o3.A0F("reelInteractiveController");
            throw C00O.createAndThrow();
        }
        return c148536mO.A01;
    }

    @Override // X.InterfaceC145496h8
    public final boolean CLi() {
        C141526aV c141526aV = this.A00;
        if (c141526aV != null && c141526aV.A08.get() && c141526aV.A02 == null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC145496h8
    public final boolean CQz() {
        C141526aV c141526aV = this.A00;
        if (c141526aV != null) {
            return C18U.A06(C06090Tz.A06, c141526aV.A06, 36323680883781104L);
        }
        return false;
    }

    @Override // X.InterfaceC145496h8
    public final boolean CS9(String str) {
        C141596ac c141596ac;
        String str2;
        OIq oIq;
        C141526aV c141526aV = this.A00;
        if (c141526aV == null || (c141596ac = c141526aV.A02) == null) {
            return false;
        }
        Integer num = null;
        OIq oIq2 = c141596ac.A0R;
        if (oIq2 != null) {
            str2 = oIq2.A03;
        } else {
            str2 = null;
        }
        if (!C14360o3.A0K(str2, str)) {
            return false;
        }
        C141596ac c141596ac2 = c141526aV.A02;
        if (c141596ac2 != null && (oIq = c141596ac2.A0R) != null) {
            num = oIq.A02;
        }
        if (num != C05F.A01) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC145496h8
    public final boolean CTf() {
        C141526aV c141526aV = this.A00;
        if (c141526aV != null && c141526aV.A01 != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC145426h1
    public final boolean CWp() {
        C148536mO c148536mO = this.A04;
        if (c148536mO == null) {
            C14360o3.A0F("reelInteractiveController");
            throw C00O.createAndThrow();
        }
        C84823qW c84823qW = c148536mO.A01;
        if (c84823qW != null) {
            String str = c84823qW.A1g;
            if ((str.equals("interactive_media_tooltip_from_tap") || str.equals("interactive_media_tooltip_from_tap_and_hold")) && c148536mO.A04()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC145536hC
    public final void CvF(C41181vS c41181vS) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A0H.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            this.A0B.EJE("tapped");
            UserSession userSession = this.A01;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null) {
                AbstractC41689IdI.A00(activity, IGAdTransparencyDisclaimerPlacement.A04, userSession, c38321qM, EnumC39562HdY.A05, new J7R(this, 34));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC145446h3
    public final void D2B(Reel reel, C41181vS c41181vS, String str) {
        InterfaceC1118853a interfaceC1118853a = this.A0B;
        interfaceC1118853a.EJ8(true);
        ReelViewerFragment.A0I((ReelViewerFragment) interfaceC1118853a, false);
        C145826hf c145826hf = this.A02;
        if (c145826hf == null) {
            C14360o3.A0F("reelViewerLogger");
            throw C00O.createAndThrow();
        }
        c145826hf.A06(reel, c41181vS, "tap_less");
    }

    @Override // X.InterfaceC145536hC
    public final void D2Y(C41181vS c41181vS, C141596ac c141596ac) {
        float f = (c141596ac.A0A / 1000.0f) * c141596ac.A0B;
        C145826hf c145826hf = this.A02;
        if (c145826hf == null) {
            C14360o3.A0F("reelViewerLogger");
            throw C00O.createAndThrow();
        }
        c145826hf.A08(c41181vS, f);
    }

    @Override // X.InterfaceC145456h4
    public final void D4b(C84823qW c84823qW) {
        this.A0B.EJE("tapped");
        C148536mO c148536mO = this.A04;
        if (c148536mO == null) {
            C14360o3.A0F("reelInteractiveController");
            throw C00O.createAndThrow();
        }
        c148536mO.A05(c84823qW, (int) c84823qW.A03, (int) c84823qW.A04);
    }

    @Override // X.InterfaceC145606hJ
    public final void D9N() {
        this.A0B.EJE("debug_pause");
    }

    @Override // X.InterfaceC145606hJ
    public final void D9O() {
        ReelViewerFragment.A0I((ReelViewerFragment) this.A0B, false);
    }

    @Override // X.InterfaceC145566hF
    public final void DAW(C41181vS c41181vS, C41551w4 c41551w4) {
        FragmentActivity activity;
        String str;
        String str2;
        Fragment fragment = (Fragment) this.A0H.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            UserSession userSession = this.A01;
            String str3 = "userSession";
            if (userSession != null) {
                String A0Y = c41181vS.A0Y(userSession);
                if (A0Y != null) {
                    UserSession userSession2 = this.A01;
                    if (userSession2 != null) {
                        EnumC41231vY enumC41231vY = c41181vS.A0e;
                        EnumC41231vY enumC41231vY2 = EnumC41231vY.A09;
                        if (enumC41231vY == enumC41231vY2) {
                            C38321qM c38321qM = c41181vS.A0b;
                            c38321qM.getClass();
                            str = AbstractC41071vF.A0C(userSession2, c38321qM);
                        } else {
                            str = null;
                        }
                        UserSession userSession3 = this.A01;
                        if (userSession3 != null) {
                            if (enumC41231vY == enumC41231vY2) {
                                C38321qM c38321qM2 = c41181vS.A0b;
                                c38321qM2.getClass();
                                str2 = AbstractC41071vF.A0A(userSession3, c38321qM2);
                            } else {
                                str2 = null;
                            }
                            UserSession userSession4 = this.A01;
                            if (userSession4 != null) {
                                C38321qM c38321qM3 = c41181vS.A0b;
                                c38321qM3.getClass();
                                String A0G = AbstractC41071vF.A0G(userSession4, c38321qM3);
                                UserSession userSession5 = this.A01;
                                if (userSession5 != null) {
                                    String str4 = this.A0A;
                                    if (str4 == null) {
                                        str3 = "traySessionId";
                                    } else {
                                        C130915ve c130915ve = new C130915ve(userSession5, c41551w4.A0H, str4, this.A0F.getSessionId(), c41551w4.A01, c41551w4.A0E);
                                        UserSession userSession6 = this.A01;
                                        if (userSession6 != null) {
                                            if (A0G != null) {
                                                I9X.A00(activity, userSession6, c130915ve, c38321qM3, this.A0D, A0Y, str, str2, A0G);
                                                return;
                                            }
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    String id = c41551w4.A0H.getId();
                    C14360o3.A07(id);
                    throw new IllegalStateException(AnonymousClass001.A0g("Disclaimer ad with ID ", id, " should have a disclaimer title!"));
                }
            }
            C14360o3.A0F(str3);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC145426h1
    public final void DB0(C84823qW c84823qW) {
        C148536mO c148536mO = this.A04;
        if (c148536mO == null) {
            C14360o3.A0F("reelInteractiveController");
            throw C00O.createAndThrow();
        }
        c148536mO.A03(c84823qW, true, false);
    }

    @Override // X.InterfaceC144616fh
    public final void DBc(float f) {
        this.A0E.DBc(f);
    }

    @Override // X.InterfaceC145436h2
    public final void DMW(C41181vS c41181vS, C2Fb c2Fb, float f, float f2) {
        String str;
        C41551w4 c41551w4;
        String str2;
        long j;
        Long A0k;
        String str3;
        if (c41181vS.A1A() && (c41551w4 = ((ReelViewerFragment) this.A0B).A0a) != null) {
            C145826hf c145826hf = this.A02;
            if (c145826hf == null) {
                str3 = "reelViewerLogger";
            } else {
                UserSession userSession = this.A01;
                if (userSession == null) {
                    str3 = "userSession";
                } else {
                    C18920wW A01 = AbstractC12220kQ.A01(C145826hf.A01(c41551w4.A0H, c145826hf), userSession);
                    C38321qM c38321qM = c41181vS.A0b;
                    C40971v4 c40971v4 = c41181vS.A0g;
                    Long l = null;
                    if (c40971v4 != null) {
                        str2 = c40971v4.A0S;
                    } else {
                        str2 = null;
                    }
                    IGCTMessagingAdsInfoDictIntf A00 = AbstractC41071vF.A00(userSession, c38321qM);
                    if (A00 != null) {
                        l = Long.valueOf(VTE.A00(A00));
                    }
                    InterfaceC02590Ai A002 = A01.A00(A01.A00, "whatsapp_sticker_send_button_click");
                    if (A002.isSampled()) {
                        long j2 = 0;
                        if (str2 != null && (A0k = AbstractC003100w.A0k(10, str2)) != null) {
                            j = A0k.longValue();
                        } else {
                            j = 0;
                        }
                        A002.A9K("ad_id", Long.valueOf(j));
                        if (l != null) {
                            j2 = l.longValue();
                        }
                        A002.A9K("page_id", Long.valueOf(j2));
                        String A06 = AbstractC41071vF.A06(userSession, c38321qM);
                        if (A06 == null) {
                            if (c38321qM != null) {
                                A06 = c38321qM.A0C.getOrganicTrackingToken();
                            } else {
                                A06 = null;
                            }
                        }
                        A002.AAP("client_token", A06);
                        A002.AAP(AbstractC37316GcI.A00(0, 10, 12), c145826hf.A0E.getSessionId());
                        A002.A8R(XNX.PAGE_INSTAGRAM_STORY, "on_feed_messaging_surface");
                        A002.AAP("message_destination", "WHATSAPP");
                        A002.Cht();
                    }
                }
            }
            C14360o3.A0F(str3);
            throw C00O.createAndThrow();
        }
        if ((c41181vS.A1J() || c41181vS.A1N()) && c2Fb == C2Fb.A3y) {
            str = "tap_interactive_sticker_no_tooltip_cta";
        } else {
            str = "tap_interactive_sticker_cta";
        }
        A01(c41181vS, c2Fb, str, f, f2);
    }

    @Override // X.InterfaceC145426h1
    public final void DMY(C41181vS c41181vS, float f, float f2) {
        A02(c41181vS, "tap_interactive_media_link_icon", f, f2);
    }

    @Override // X.InterfaceC145436h2
    public final void DMa(C41181vS c41181vS, C2Fb c2Fb, float f, float f2) {
        A01(c41181vS, c2Fb, "tap_interactive_sticker_tooltip_cta", f, f2);
    }

    @Override // X.InterfaceC144616fh
    public final void DQV(float f, float f2) {
        C148536mO c148536mO = this.A04;
        if (c148536mO == null) {
            C14360o3.A0F("reelInteractiveController");
            throw C00O.createAndThrow();
        }
        C84823qW c84823qW = c148536mO.A01;
        if (c84823qW != null) {
            String str = c84823qW.A1g;
            if ((str.equals("interactive_media_tooltip_from_tap") || str.equals("interactive_media_tooltip_from_tap_and_hold")) && c148536mO.A04()) {
                DJz(c84823qW, true);
                return;
            }
        }
        this.A0E.DQV(f, f2);
    }

    @Override // X.InterfaceC80063hv
    public final void DSK(C51757Mtg c51757Mtg) {
        this.A0E.DSK(c51757Mtg);
    }

    @Override // X.InterfaceC145526hB
    public final void DSn(C41181vS c41181vS, C41551w4 c41551w4) {
        this.A0E.DSm(null, c41181vS, c41551w4);
    }

    @Override // X.InterfaceC145616hK
    public final void DU3(View view, View view2, C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, String str, String str2, int i, int i2) {
        String str3;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(view2, 3);
        C14360o3.A0B(c41551w4, 6);
        C14360o3.A0B(c41181vS, 7);
        C14360o3.A0B(c141596ac, 8);
        C145826hf c145826hf = this.A02;
        if (c145826hf == null) {
            str3 = "reelViewerLogger";
        } else {
            c145826hf.A0B(c41181vS, c41551w4, C05F.A0C);
            C148536mO c148536mO = this.A04;
            str3 = "reelInteractiveController";
            if (c148536mO != null) {
                if (c148536mO.A04()) {
                    C84823qW c84823qW = new C84823qW();
                    c84823qW.A12 = EnumC75383a5.A0P;
                    c84823qW.A1q = true;
                    C148536mO c148536mO2 = this.A04;
                    if (c148536mO2 != null) {
                        c148536mO2.A03(c84823qW, true, false);
                        return;
                    }
                } else {
                    C147196jv c147196jv = this.A05;
                    str3 = "reelUserProfileTooltipHelper";
                    if (c147196jv != null) {
                        C51622Yk c51622Yk = c147196jv.A05;
                        if (c51622Yk != null && c51622Yk.isShowing()) {
                            C147196jv c147196jv2 = this.A05;
                            if (c147196jv2 != null) {
                                c147196jv2.A00(true, false);
                                return;
                            }
                        } else {
                            InterfaceC1118853a interfaceC1118853a = this.A0B;
                            interfaceC1118853a.EJE("tapped");
                            InterfaceC143576dw Av7 = interfaceC1118853a.Av7();
                            if (Av7 == null) {
                                return;
                            }
                            RoundedCornerFrameLayout BRC = Av7.BRC();
                            if (!(BRC instanceof View) || BRC == null) {
                                return;
                            }
                            C147196jv c147196jv3 = this.A05;
                            if (c147196jv3 != null) {
                                User user = c41181vS.A0i;
                                if (user != null) {
                                    String id = user.getId();
                                    ImageUrl Bhu = user.Bhu();
                                    String fullName = user.getFullName();
                                    if (fullName == null) {
                                        fullName = "";
                                    }
                                    View Auc = interfaceC1118853a.Auc();
                                    c147196jv3.A00(false, true);
                                    c147196jv3.A08 = id;
                                    c147196jv3.A07 = "stories_multi_advertiser_carousel_banner";
                                    c147196jv3.A00 = null;
                                    c147196jv3.A03 = c41551w4;
                                    c147196jv3.A02 = c41181vS;
                                    c147196jv3.A04 = c141596ac;
                                    c147196jv3.A06 = "profile_tooltop_in_stories_multi_advertiser_carousel_banner";
                                    c147196jv3.A01 = view2;
                                    L5J A00 = LHF.A00(BRC, c147196jv3.A0A);
                                    A00.A02 = EnumC46122KbM.A01;
                                    C51622Yk c51622Yk2 = new C51622Yk(A00);
                                    c147196jv3.A05 = c51622Yk2;
                                    LHF.A01(BRC, Auc, c51622Yk2);
                                    C51622Yk c51622Yk3 = c147196jv3.A05;
                                    c51622Yk3.A03 = c147196jv3;
                                    LHF.A02(c147196jv3.A09, Bhu, c51622Yk3, fullName, 2131970227, false);
                                    c147196jv3.A05.A02(view2, i, i2, false);
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC145566hF
    public final void DZU(C41181vS c41181vS, C41551w4 c41551w4) {
        FragmentActivity activity;
        Fragment fragment = (Fragment) this.A0H.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            this.A0B.EJE("tapped");
            UserSession userSession = this.A01;
            String str = "userSession";
            if (userSession != null) {
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    InterfaceC60442pS interfaceC60442pS = this.A0D;
                    String str2 = this.A0A;
                    if (str2 == null) {
                        str = "traySessionId";
                    } else {
                        AbstractC41559Ia8.A00(activity, userSession, new C130915ve(userSession, c41551w4.A0H, str2, this.A0F.getSessionId(), c41551w4.A01, c41551w4.A0E), c38321qM, interfaceC60442pS, new C9E5(this, 24), 2);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Political ad needs to have a media attached to it!");
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC145436h2, X.InterfaceC145586hH
    public final void DgA() {
        this.A0B.EJE("tapped");
    }

    @Override // X.InterfaceC145556hE
    public final void DgZ(C41181vS c41181vS, C41551w4 c41551w4) {
        this.A0E.Dga(c41181vS, null, c41551w4, null);
    }

    @Override // X.InterfaceC145536hC
    public final void Dne(C41181vS c41181vS) {
        this.A0E.CJE(null, c41181vS, null, C2Fb.A3v);
    }

    @Override // X.InterfaceC145416h0
    public final void Dng(Context context, C41181vS c41181vS, C41551w4 c41551w4, C140436Wx c140436Wx, boolean z) {
        InterfaceC1118853a interfaceC1118853a = this.A0B;
        ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
        if (reelViewerFragment.A0a != c41551w4) {
            c140436Wx.ERN(1.0f);
        }
        C146826jK c146826jK = this.A09;
        if (c146826jK == null) {
            C14360o3.A0F("reelLoaderControllerHelper");
            throw C00O.createAndThrow();
        }
        if (c140436Wx.A03 != null) {
            C82013lN A00 = AbstractC82003lM.A00(c146826jK.A02);
            C41551w4 c41551w42 = c140436Wx.A01;
            if (c41551w42 != null) {
                String id = c41551w42.A0H.getId();
                C14360o3.A07(id);
                InterfaceC81993lL interfaceC81993lL = c140436Wx.A03;
                C14360o3.A0A(interfaceC81993lL);
                A00.A04(interfaceC81993lL, id);
                c140436Wx.A03 = null;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        UserSession userSession = c146826jK.A02;
        Reel reel = c41551w4.A0H;
        if (!reel.A0z(userSession)) {
            YFS yfs = new YFS(context, c41551w4, c140436Wx, c146826jK);
            c146826jK.A0A.add(yfs);
            C82013lN A002 = AbstractC82003lM.A00(userSession);
            String id2 = reel.getId();
            C14360o3.A07(id2);
            A002.A05(yfs, id2, null, false);
            c140436Wx.A03 = yfs;
            HashMap hashMap = new HashMap();
            hashMap.put("media_id", c41181vS.A0j);
            if (c140436Wx.A01 == c41551w4) {
                C140706Xy A003 = AbstractC140696Xx.A00(userSession);
                C41181vS A08 = c41551w4.A08(userSession);
                C14360o3.A0B(A08, 0);
                String str = A08.A0k;
                C14360o3.A07(str);
                Long A01 = C140706Xy.A01(A003, str, C140706Xy.A02(A08));
                if (A01 != null) {
                    A003.A00.flowMarkPoint(A01.longValue(), "json_fetch_start");
                }
            }
            C82013lN A004 = AbstractC82003lM.A00(userSession);
            String id3 = reel.getId();
            C14360o3.A07(id3);
            String moduleName = c146826jK.A08.getModuleName();
            C14360o3.A07(moduleName);
            A004.A02(C3G5.A0I, id3, moduleName, hashMap);
        }
        if (reelViewerFragment.A0a == c41551w4 || z) {
            interfaceC1118853a.D8u(c41181vS, c140436Wx);
            C139626Tr c139626Tr = c140436Wx.A0l;
            C14360o3.A0B(c139626Tr, 1);
            boolean A0b = AbstractC130925vf.A0b(c41181vS);
            boolean A0a = AbstractC130925vf.A0a(c41181vS);
            boolean A0h = AbstractC130925vf.A0h(c41181vS);
            boolean z2 = true;
            if (!c41181vS.A15()) {
                if ((A0b && !A0a) || A0h) {
                    if (c139626Tr.A03.CGb() == 0) {
                        z2 = false;
                    }
                    AbstractC138396Ov.A00(c41181vS, z2);
                }
            }
        }
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean DrS(float f, float f2) {
        return this.A0E.DrS(f, f2);
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrU() {
        return this.A0E.DrU();
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrW() {
        return this.A0E.DrW();
    }

    @Override // X.InterfaceC144616fh
    public final void DsB(float f, float f2) {
        this.A0E.DsB(f, f2);
    }

    @Override // X.InterfaceC144616fh
    public final void Dwo(boolean z) {
        this.A0E.Dwo(z);
    }

    @Override // X.InterfaceC145416h0
    public final void E13(C41181vS c41181vS) {
        this.A0E.E13(c41181vS);
    }

    @Override // X.InterfaceC145446h3, X.InterfaceC145476h6
    public final void E15(C41181vS c41181vS, C141596ac c141596ac, boolean z) {
        this.A0E.E15(c41181vS, c141596ac, z);
    }

    @Override // X.InterfaceC145416h0
    public final void E16(C41181vS c41181vS, C41551w4 c41551w4, boolean z) {
        this.A0E.E16(c41181vS, c41551w4, z);
    }

    @Override // X.InterfaceC145536hC
    public final void E1p(C41181vS c41181vS) {
        float currentPositionMs = ((ReelViewerFragment) this.A0B).mVideoPlayer.getCurrentPositionMs() / 1000.0f;
        C145826hf c145826hf = this.A02;
        if (c145826hf == null) {
            C14360o3.A0F("reelViewerLogger");
            throw C00O.createAndThrow();
        }
        c145826hf.A08(c41181vS, currentPositionMs);
    }

    @Override // X.InterfaceC145466h5
    public final void EIK(C41551w4 c41551w4, C141596ac c141596ac, String str, float f, float f2) {
        C145826hf c145826hf = this.A02;
        if (c145826hf == null) {
            C14360o3.A0F("reelViewerLogger");
            throw C00O.createAndThrow();
        }
        c145826hf.A0K(c41551w4, c141596ac, null, str, f, f2);
    }

    @Override // X.InterfaceC145496h8
    public final void ETW(InterfaceC41501vz interfaceC41501vz) {
        C141526aV c141526aV = this.A00;
        if (c141526aV != null) {
            c141526aV.A01 = interfaceC41501vz;
        }
    }

    @Override // X.InterfaceC145496h8
    public final boolean EjM(InterfaceC39271s5 interfaceC39271s5) {
        C141526aV c141526aV = this.A00;
        if (c141526aV != null) {
            return AbstractC129385t0.A02(interfaceC39271s5, c141526aV.A06, true);
        }
        return false;
    }

    @Override // X.InterfaceC145436h2
    public final void EmA() {
        ((C145176gc) this.A0E).A18.Csv(true);
    }

    public C145406gz(InterfaceC11380iw interfaceC11380iw, InterfaceC60442pS interfaceC60442pS, InterfaceC1118853a interfaceC1118853a, InterfaceC144586fe interfaceC144586fe, C1M1 c1m1, C145126gX c145126gX, WeakReference weakReference) {
        this.A0E = interfaceC144586fe;
        this.A0B = interfaceC1118853a;
        this.A0C = interfaceC11380iw;
        this.A0H = weakReference;
        this.A0F = c1m1;
        this.A0D = interfaceC60442pS;
        this.A0G = c145126gX;
    }

    private final void A01(C41181vS c41181vS, C2Fb c2Fb, String str, float f, float f2) {
        A02(c41181vS, str, f, f2);
        if (AbstractC130925vf.A0S(c41181vS.A0b) && (AbstractC130925vf.A0g(c41181vS) || AbstractC130925vf.A0d(c41181vS))) {
            C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0q, c41181vS.A0c());
            if (A00 != null) {
                this.A0E.Ddl(A00, (int) f, (int) f2);
                return;
            }
            return;
        }
        this.A0E.CJE(null, c41181vS, null, c2Fb);
    }
}
