package com.instagram.direct.fragment.permanentmedia;

import X.AbstractC001800i;
import X.AbstractC008903d;
import X.AbstractC02600Aj;
import X.AbstractC06950Ym;
import X.AbstractC125325le;
import X.AbstractC13110lx;
import X.AbstractC13880nE;
import X.AbstractC13890nF;
import X.AbstractC148046la;
import X.AbstractC201688vy;
import X.AbstractC2054797v;
import X.AbstractC25651Mw;
import X.AbstractC28761aE;
import X.AbstractC34378FDu;
import X.AbstractC34777FUb;
import X.AbstractC40161tk;
import X.AbstractC43591JPw;
import X.AbstractC57052jg;
import X.AbstractC68606VXh;
import X.AbstractC86593tX;
import X.AnonymousClass001;
import X.AnonymousClass014;
import X.AnonymousClass189;
import X.AnonymousClass442;
import X.AnonymousClass988;
import X.AnonymousClass989;
import X.B22;
import X.C00O;
import X.C01A;
import X.C03L;
import X.C05F;
import X.C06090Tz;
import X.C09530e4;
import X.C0eB;
import X.C0f5;
import X.C0fA;
import X.C0fQ;
import X.C0w9;
import X.C14240no;
import X.C14360o3;
import X.C150956qv;
import X.C15500q5;
import X.C158797Aq;
import X.C158847Aw;
import X.C16930sl;
import X.C18950wb;
import X.C18A;
import X.C18U;
import X.C2056398n;
import X.C206989Ed;
import X.C24174Anx;
import X.C25531Mh;
import X.C2DS;
import X.C2EC;
import X.C2EY;
import X.C2Io;
import X.C32050E6c;
import X.C34639FNw;
import X.C35011Fbi;
import X.C35139Feg;
import X.C36078FwE;
import X.C36469G6t;
import X.C36714GGj;
import X.C36716GGl;
import X.C36788GJl;
import X.C38321qM;
import X.C3I9;
import X.C3VZ;
import X.C3o9;
import X.C41123IIo;
import X.C41761wQ;
import X.C46094Kas;
import X.C48490Lch;
import X.C49716Lxl;
import X.C55942hf;
import X.C56342iS;
import X.C56352iT;
import X.C57112jm;
import X.C57982lB;
import X.C57992lC;
import X.C5TA;
import X.C61072qV;
import X.C6QM;
import X.C6XJ;
import X.C71045Wn0;
import X.C71046Wn1;
import X.C71058WnD;
import X.C76S;
import X.C76T;
import X.C7A9;
import X.C7AS;
import X.C7D7;
import X.C7E7;
import X.C7E8;
import X.C7EB;
import X.C7EC;
import X.C7EI;
import X.C7EK;
import X.C7EN;
import X.C7EQ;
import X.C7ET;
import X.C7EW;
import X.C7F3;
import X.C7IH;
import X.C7IM;
import X.C7MA;
import X.C7S5;
import X.C7XX;
import X.C83403nh;
import X.E6B;
import X.EnumC40111tc;
import X.EnumC46297KeT;
import X.EnumC72433Xdd;
import X.F2D;
import X.F3G;
import X.G0O;
import X.InterfaceC08830cm;
import X.InterfaceC09390do;
import X.InterfaceC149626oF;
import X.InterfaceC165297aI;
import X.InterfaceC165337aM;
import X.InterfaceC165347aN;
import X.InterfaceC165507ad;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC37230Gaf;
import X.InterfaceC41501vz;
import X.InterfaceC56392iX;
import X.InterfaceC57142jp;
import X.InterfaceC59892oW;
import X.InterfaceC60442pS;
import X.InterfaceC60602pj;
import X.InterfaceC62892tS;
import X.InterfaceC676933j;
import X.InterfaceC83713oG;
import X.InterfaceC83733oI;
import X.JRE;
import X.KL4;
import X.L4T;
import X.L5T;
import X.L6C;
import X.LLD;
import X.LO9;
import X.MK2;
import X.ScaleGestureDetectorOnScaleGestureListenerC81153jk;
import X.ViewOnAttachStateChangeListenerC56972jY;
import X.ViewOnClickListenerC35477FlU;
import X.ViewOnLayoutChangeListenerC70239WNc;
import X.WEW;
import X.WjH;
import X.WjI;
import X.YJD;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Adapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class DirectAggregatedMediaViewerController implements InterfaceC60442pS, InterfaceC60602pj, InterfaceC165507ad, InterfaceC165297aI, InterfaceC165337aM, InterfaceC165347aN, C7XX, C7E7 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public View A07;
    public ViewGroup A08;
    public ViewGroup A09;
    public C61072qV A0A;
    public InterfaceC41501vz A0B;
    public InterfaceC41501vz A0C;
    public ReboundViewPager A0D;
    public TouchInterceptorFrameLayout A0E;
    public SimpleZoomableViewContainer A0F;
    public C76T A0G;
    public MediaViewerReplyBarEligibilityChecker A0H;
    public KL4 A0I;
    public C34639FNw A0J;
    public WEW A0K;
    public C35011Fbi A0L;
    public InterfaceC37230Gaf A0M;
    public C158797Aq A0N;
    public C2EC A0O;
    public E6B A0P;
    public DirectThreadAnalyticsParams A0Q;
    public C71058WnD A0R;
    public DirectShareTarget A0S;
    public C3o9 A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public String A0Y;
    public String A0Z;
    public InterfaceC16820sZ A0a;
    public InterfaceC16820sZ A0b;
    public InterfaceC16660sJ A0c;
    public InterfaceC16660sJ A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public View A0p;
    public ViewGroup A0q;
    public InterfaceC165297aI A0r;
    public C7IH A0s;
    public RoundedCornerFrameLayout A0t;
    public final C03L A0u;
    public final FragmentActivity A0v;
    public final InterfaceC41501vz A0w;
    public final C41761wQ A0x;
    public final UserSession A0y;
    public final C3I9 A0z;
    public final C3I9 A10;
    public final InterfaceC62892tS A11;
    public final C7EC A12;
    public final C7EW A13;
    public final C7EI A14;
    public final C7EK A15;
    public final C7EN A16;
    public final C7E8 A17;
    public final C7EB A18;
    public final InterfaceC149626oF A19;
    public final C7EQ A1A;
    public final InterfaceC676933j A1B;
    public final C7ET A1C;
    public final List A1D;
    public final List A1E;
    public final Map A1F;
    public final InterfaceC09390do A1G;
    public final boolean A1H;
    public final boolean A1I;
    public final boolean A1J;
    public final boolean A1K;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (X.AbstractC52812bN.A00 != false) goto L18;
     */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.7EI] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.7EK] */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.7EW] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DirectAggregatedMediaViewerController(androidx.fragment.app.FragmentActivity r10, com.instagram.common.session.UserSession r11, X.C3I9 r12, int r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController.<init>(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.3I9, int, boolean, boolean):void");
    }

    public static final C158797Aq A06(DirectAggregatedMediaViewerController directAggregatedMediaViewerController, int i) {
        if (i < 0) {
            return null;
        }
        KL4 kl4 = directAggregatedMediaViewerController.A0I;
        if (kl4 != null) {
            if (i >= kl4.getCount()) {
                return null;
            }
            KL4 kl42 = directAggregatedMediaViewerController.A0I;
            if (kl42 != null) {
                return (C158797Aq) kl42.A0D.get(i);
            }
        }
        C14360o3.A0F("pagerAdapter");
        throw C00O.createAndThrow();
    }

    public static final InterfaceC83733oI A09(C3o9 c3o9) {
        InterfaceC83733oI interfaceC83733oI = null;
        if (c3o9 == null) {
            A0a(new IllegalStateException("key is null"));
        } else if (JRE.A0A(c3o9)) {
            interfaceC83733oI = JRE.A05(JRE.A01(c3o9));
            if (interfaceC83733oI == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(JRE.A01(c3o9).getClass());
                sb.append(" does not contains threadId");
                A0a(new IllegalStateException(sb.toString()));
                return interfaceC83733oI;
            }
        } else {
            if (c3o9 instanceof MsysThreadId) {
                return JRE.A03(c3o9);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unsupported key type ");
            sb2.append(c3o9.getClass());
            sb2.append(' ');
            sb2.append(c3o9);
            A0a(new IllegalStateException(sb2.toString()));
            return null;
        }
        return interfaceC83733oI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A0A(com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = 1
            boolean r0 = X.MAT.A03(r8, r6)
            if (r0 == 0) goto L27
            r5 = r8
            X.MAT r5 = (X.MAT) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            if (r0 == 0) goto L2f
            if (r0 == r6) goto L55
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L27:
            r0 = 42
            X.MAT r5 = new X.MAT
            r5.<init>(r7, r8, r6, r0)
            goto L15
        L2f:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r3 = r7.A0y
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36330063205188244(0x81120000034294, double:3.038616488159011E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L5e
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r0 = X.F2D.A00(r3)
            X.0UO r1 = r0.A0M
            X.GRy r0 = new X.GRy
            r0.<init>(r7)
            r5.A00 = r6
            java.lang.Object r0 = r1.collect(r0, r5)
            if (r0 != r4) goto L58
            return r4
        L55:
            X.AbstractC09560e7.A00(r1)
        L58:
            X.PW2 r0 = new X.PW2
            r0.<init>()
            throw r0
        L5e:
            X.0eB r4 = X.C0eB.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController.A0A(com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController, X.1Ds):java.lang.Object");
    }

    public static final void A0U(DirectAggregatedMediaViewerController directAggregatedMediaViewerController, RoundedCornerFrameLayout roundedCornerFrameLayout) {
        float f;
        directAggregatedMediaViewerController.A0j = false;
        C7ET c7et = directAggregatedMediaViewerController.A1C;
        if (!c7et.isIdle()) {
            c7et.A04();
        }
        C158797Aq A05 = A05(directAggregatedMediaViewerController);
        if (A05 != null) {
            directAggregatedMediaViewerController.A0Z(A05);
        }
        directAggregatedMediaViewerController.A0b(false);
        C35011Fbi c35011Fbi = directAggregatedMediaViewerController.A0L;
        if (c35011Fbi != null) {
            c35011Fbi.A02.setVisibility(0);
        }
        A0P(directAggregatedMediaViewerController);
        A0W(directAggregatedMediaViewerController, true);
        A0M(directAggregatedMediaViewerController);
        directAggregatedMediaViewerController.A0H();
        if (roundedCornerFrameLayout != null) {
            A0X(directAggregatedMediaViewerController, true);
            WEW wew = directAggregatedMediaViewerController.A0K;
            if (wew != null) {
                KL4 kl4 = directAggregatedMediaViewerController.A0I;
                if (kl4 != null) {
                    ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
                    if (reboundViewPager != null) {
                        kl4.A00 = reboundViewPager.getCurrentDataIndex();
                        KL4 kl42 = directAggregatedMediaViewerController.A0I;
                        if (kl42 != null) {
                            kl42.A03 = true;
                            C0fA.A00(kl42, 1920743064);
                            boolean Ejg = directAggregatedMediaViewerController.A0H.Ejg();
                            ViewGroup viewGroup = directAggregatedMediaViewerController.A09;
                            if (viewGroup != null) {
                                ReboundViewPager reboundViewPager2 = directAggregatedMediaViewerController.A0D;
                                if (reboundViewPager2 != null) {
                                    int i = directAggregatedMediaViewerController.A04;
                                    int i2 = directAggregatedMediaViewerController.A02;
                                    boolean A0g = A0g(directAggregatedMediaViewerController);
                                    C36716GGl c36716GGl = new C36716GGl(directAggregatedMediaViewerController);
                                    int height = roundedCornerFrameLayout.getHeight();
                                    int width = roundedCornerFrameLayout.getWidth();
                                    float f2 = width / height;
                                    if (A0g) {
                                        wew.A02 -= wew.A06.getResources().getDimensionPixelSize(R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
                                    }
                                    Activity activity = wew.A06;
                                    int i3 = wew.A02;
                                    float A01 = AbstractC13890nF.A01(activity) - (activity.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * 2);
                                    if (f2 > A01 / i3) {
                                        i3 = (int) (A01 / f2);
                                    }
                                    int i4 = wew.A02;
                                    int A012 = AbstractC13890nF.A01(activity) - (activity.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * 2);
                                    float f3 = i4;
                                    if (f2 <= A012 / f3) {
                                        A012 = (int) (f3 * f2);
                                    }
                                    float A00 = AbstractC13890nF.A00(activity);
                                    float f4 = i;
                                    float f5 = wew.A01 - f4;
                                    if (!Ejg) {
                                        Resources resources = activity.getResources();
                                        f = resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin) + resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) + resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
                                    } else {
                                        f = 0.0f;
                                    }
                                    float f6 = ((f5 - f4) - f) / 2.0f;
                                    if (wew.A0D) {
                                        View view = wew.A08;
                                        AbstractC13880nE.A0U(view, i2);
                                        AbstractC13880nE.A0f(view, i);
                                    } else {
                                        View view2 = wew.A08;
                                        view2.setTop(i);
                                        view2.setBottom((int) (A00 - i2));
                                        AbstractC13880nE.A0h(viewGroup, view2.getWidth(), view2.getHeight());
                                        AbstractC13880nE.A0h(reboundViewPager2, reboundViewPager2.getWidth(), wew.A02);
                                    }
                                    C55942hf c55942hf = C150956qv.A02;
                                    AbstractC125325le A013 = AbstractC125325le.A01(roundedCornerFrameLayout, 0);
                                    A013.A0G();
                                    AbstractC125325le A0F = A013.A0F(true);
                                    A0F.A0T(f6, 0.0f);
                                    AbstractC125325le A0E = A0F.A0E(WEW.A0F);
                                    A0E.A06 = new C71046Wn1(wew, roundedCornerFrameLayout, height, i3, width, A012);
                                    A0E.A05 = c36716GGl;
                                    A0E.A0H();
                                    return;
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    C14360o3.A0F("viewPager");
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F("pagerAdapter");
                throw C00O.createAndThrow();
            }
        }
    }

    public static final void A0V(DirectAggregatedMediaViewerController directAggregatedMediaViewerController, RoundedCornerFrameLayout roundedCornerFrameLayout, boolean z) {
        int i;
        int i2;
        InterfaceC37230Gaf interfaceC37230Gaf;
        directAggregatedMediaViewerController.A0j = true;
        if (directAggregatedMediaViewerController.A1H && (interfaceC37230Gaf = directAggregatedMediaViewerController.A0M) != null) {
            interfaceC37230Gaf.EFg();
        }
        C158797Aq A05 = A05(directAggregatedMediaViewerController);
        if (A05 != null) {
            directAggregatedMediaViewerController.A0Z(A05);
        }
        C35011Fbi c35011Fbi = directAggregatedMediaViewerController.A0L;
        if (c35011Fbi != null) {
            c35011Fbi.A02.setVisibility(8);
        }
        A0X(directAggregatedMediaViewerController, false);
        A0W(directAggregatedMediaViewerController, false);
        directAggregatedMediaViewerController.A0b(true);
        A0M(directAggregatedMediaViewerController);
        directAggregatedMediaViewerController.A0H();
        WEW wew = directAggregatedMediaViewerController.A0K;
        if (wew != null) {
            KL4 kl4 = directAggregatedMediaViewerController.A0I;
            String str = "pagerAdapter";
            if (kl4 != null) {
                ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
                if (reboundViewPager == null) {
                    str = "viewPager";
                } else {
                    kl4.A00 = reboundViewPager.getCurrentDataIndex();
                    KL4 kl42 = directAggregatedMediaViewerController.A0I;
                    if (kl42 != null) {
                        kl42.A03 = z;
                        C36714GGj c36714GGj = new C36714GGj(directAggregatedMediaViewerController);
                        C14360o3.A0B(roundedCornerFrameLayout, 0);
                        View view = wew.A0A;
                        wew.A02 = view.getHeight();
                        wew.A01 = AbstractC13880nE.A0G(view).top;
                        boolean z2 = false;
                        if (wew.A0D) {
                            View view2 = wew.A08;
                            AbstractC13880nE.A0U(view2, 0);
                            AbstractC13880nE.A0f(view2, 0);
                        }
                        if (z) {
                            int height = roundedCornerFrameLayout.getHeight();
                            int width = roundedCornerFrameLayout.getWidth();
                            float f = width / height;
                            Activity activity = wew.A06;
                            if (f > AbstractC13890nF.A01(activity) / AbstractC13890nF.A00(activity)) {
                                z2 = true;
                            }
                            int A00 = AbstractC13890nF.A00(activity);
                            if (z2) {
                                i = AbstractC13890nF.A01(activity);
                                i2 = (int) (i / f);
                            } else {
                                i = (int) (A00 * f);
                                i2 = A00;
                            }
                            float f2 = AbstractC13880nE.A0G(roundedCornerFrameLayout).top - ((A00 - height) / 2.0f);
                            C55942hf c55942hf = C150956qv.A02;
                            AbstractC125325le A01 = AbstractC125325le.A01(roundedCornerFrameLayout, 0);
                            A01.A0G();
                            AbstractC125325le A0E = A01.A0F(true).A0E(WEW.A0F);
                            A0E.A0T(f2, 0.0f);
                            A0E.A06 = new C71045Wn0(wew, roundedCornerFrameLayout, height, i2, width, i);
                            A0E.A05 = c36714GGj;
                            A0E.A0H();
                            return;
                        }
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC165337aM
    public final C2056398n Axi() {
        return null;
    }

    @Override // X.InterfaceC165507ad
    public final boolean CQu() {
        return false;
    }

    @Override // X.InterfaceC165347aN
    public final void EkI(C2EY c2ey, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
    }

    @Override // X.C7XX
    public final void EnH(C7S5 c7s5, MessageIdentifier messageIdentifier, String str) {
    }

    @Override // X.InterfaceC165347aN
    public final void F81(MessageIdentifier messageIdentifier, boolean z) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_aggregated_media_viewer";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        if (this.A1H) {
            Configuration configuration2 = this.A0v.getResources().getConfiguration();
            C14360o3.A07(configuration2);
            if (AbstractC68606VXh.A00(configuration2, configuration)) {
                this.A0V = null;
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final int A00(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        int i;
        C56352iT A00;
        Integer num = directAggregatedMediaViewerController.A0V;
        if (num != null) {
            return num.intValue();
        }
        FragmentActivity fragmentActivity = directAggregatedMediaViewerController.A0v;
        int i2 = directAggregatedMediaViewerController.A04;
        int i3 = directAggregatedMediaViewerController.A02;
        boolean Ejg = directAggregatedMediaViewerController.A0H.Ejg();
        boolean z = directAggregatedMediaViewerController.A1I;
        int A002 = AbstractC13890nF.A00(fragmentActivity);
        int i4 = 0;
        if (!z && (A00 = C56342iS.A00(fragmentActivity)) != null) {
            i = A00.AYS();
        } else {
            i = 0;
        }
        if (Ejg) {
            Resources resources = fragmentActivity.getResources();
            i4 = resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin) + resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) + resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        }
        return ((((A002 - i) - i4) - fragmentActivity.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap)) - i2) - i3;
    }

    public static final ViewGroup A01(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        ViewGroup viewGroup;
        Window window = AbstractC13110lx.A00(directAggregatedMediaViewerController.A0v).getWindow();
        C14360o3.A0A(window);
        View decorView = window.getDecorView();
        if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
            return viewGroup;
        }
        throw new IllegalStateException("Couldn't find activity root view");
    }

    public static final C32050E6c A02(DirectAggregatedMediaViewerController directAggregatedMediaViewerController, C158797Aq c158797Aq) {
        Object obj;
        Iterator it = ((List) F2D.A00(directAggregatedMediaViewerController.A0y).A0M.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C32050E6c) obj).A05, c158797Aq.A0S)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C32050E6c) obj;
    }

    public static final L5T A03(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        Object obj;
        ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
        if (reboundViewPager == null) {
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        View view = reboundViewPager.A0F;
        if (view != null) {
            obj = view.getTag();
        } else {
            obj = null;
        }
        if (!(obj instanceof L5T)) {
            return null;
        }
        return (L5T) obj;
    }

    public static final L5T A04(DirectAggregatedMediaViewerController directAggregatedMediaViewerController, int i) {
        Object obj;
        ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
        if (reboundViewPager == null) {
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        View A0D = reboundViewPager.A0D(i);
        if (A0D != null) {
            obj = A0D.getTag();
        } else {
            obj = null;
        }
        if (!(obj instanceof L5T)) {
            return null;
        }
        return (L5T) obj;
    }

    public static final C158797Aq A05(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        if (!directAggregatedMediaViewerController.A0h) {
            return (C158797Aq) AbstractC001800i.A0O(directAggregatedMediaViewerController.A1D, directAggregatedMediaViewerController.A03);
        }
        ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
        if (reboundViewPager == null) {
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        return A06(directAggregatedMediaViewerController, reboundViewPager.getCurrentDataIndex());
    }

    public static final String A0B(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        C3o9 c3o9 = directAggregatedMediaViewerController.A0T;
        if (c3o9 == null) {
            return null;
        }
        if (c3o9 instanceof MsysThreadId) {
            return String.valueOf(JRE.A03(c3o9).A00);
        }
        if (!JRE.A0A(c3o9)) {
            return null;
        }
        return JRE.A01(c3o9).A00;
    }

    private final void A0C() {
        View inflate = LayoutInflater.from(this.A0v).inflate(R.layout.fragment_permanent_media_viewer, (ViewGroup) null);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.A08 = (ViewGroup) inflate;
        if (this.A0m) {
            C0w9.A03("DirectPermanentMediaViewerController_onViewCreated", "view created twice");
        }
        this.A0m = true;
    }

    private final void A0D() {
        C3I9 c3i9;
        InterfaceC37230Gaf wjH;
        InterfaceC59892oW c24174Anx;
        ViewGroup viewGroup = this.A08;
        C14360o3.A0A(viewGroup);
        FragmentActivity fragmentActivity = this.A0v;
        C14360o3.A0B(viewGroup, 1);
        View inflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.permanent_media_viewer_item, viewGroup, false);
        C14360o3.A0A(inflate);
        L4T l4t = new L4T(inflate);
        inflate.setTag(l4t);
        inflate.addOnAttachStateChangeListener(new LO9(l4t));
        View requireViewById = viewGroup.requireViewById(R.id.media_viewer_scalable_container);
        C14360o3.A07(requireViewById);
        ViewGroup viewGroup2 = (ViewGroup) requireViewById;
        viewGroup2.addView(inflate);
        this.A06 = viewGroup.requireViewById(R.id.media_viewer_container);
        this.A07 = viewGroup.requireViewById(R.id.media_viewer_bg);
        View view = this.A06;
        C14360o3.A0A(view);
        this.A0t = (RoundedCornerFrameLayout) view.requireViewById(R.id.media_container);
        this.A0E = (TouchInterceptorFrameLayout) viewGroup2;
        this.A0F = (SimpleZoomableViewContainer) viewGroup.requireViewById(R.id.media_viewer_zoom_container);
        UserSession userSession = this.A0y;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36322173350062125L);
        int i = R.id.intermediate_viewer_reply_bar;
        if (A06) {
            i = R.id.intermediate_viewer_reply_bar_with_additional_entrypoints;
        }
        View requireViewById2 = viewGroup.requireViewById(i);
        C14360o3.A07(requireViewById2);
        View inflate2 = ((ViewStub) requireViewById2).inflate();
        C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup3 = (ViewGroup) inflate2;
        if (C18U.A06(c06090Tz, userSession, 36322173350062125L)) {
            C7EK c7ek = this.A15;
            c3i9 = this.A0z;
            wjH = new WjI(viewGroup3, c3i9, c7ek);
        } else {
            C7EK c7ek2 = this.A15;
            c3i9 = this.A0z;
            wjH = new WjH(viewGroup3, userSession, c3i9, c7ek2);
        }
        this.A0M = wjH;
        View requireViewById3 = viewGroup.requireViewById(R.id.dismiss_button);
        this.A0p = requireViewById3;
        if (requireViewById3 != null) {
            C0fQ.A00(new ViewOnClickListenerC35477FlU(this), requireViewById3);
        }
        if (!this.A1I || C18U.A06(C06090Tz.A06, userSession, 36327696678009634L)) {
            View requireViewById4 = viewGroup.requireViewById(R.id.intermediate_viewer_action_bar);
            C14360o3.A07(requireViewById4);
            View inflate3 = ((ViewStub) requireViewById4).inflate();
            C14360o3.A0C(inflate3, "null cannot be cast to non-null type android.view.ViewGroup");
            this.A0L = new C35011Fbi((ViewGroup) inflate3, userSession, this.A14);
        }
        this.A09 = (ViewGroup) viewGroup.requireViewById(R.id.intermediate_viewer_container);
        boolean z = this.A1H;
        if (z) {
            AbstractC008903d.A00(viewGroup, this.A0u);
            if (viewGroup.isLaidOut() && !viewGroup.isLayoutRequested()) {
                viewGroup.requestApplyInsets();
            } else {
                viewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC70239WNc());
            }
        } else {
            boolean z2 = this.A1J;
            C57992lC c57992lC = C57982lB.A0B;
            if (z2) {
                C206989Ed c206989Ed = new C206989Ed(this, 21);
                this.A1E.add(new C7A9(c206989Ed));
                c24174Anx = new C7A9(c206989Ed);
            } else {
                c24174Anx = new C24174Anx(this);
            }
            c57992lC.A04(fragmentActivity, c24174Anx, false);
        }
        this.A0D = (ReboundViewPager) viewGroup.requireViewById(R.id.view_pager);
        C57112jm A01 = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
        ViewOnAttachStateChangeListenerC56972jY viewOnAttachStateChangeListenerC56972jY = new ViewOnAttachStateChangeListenerC56972jY(viewGroup);
        ReboundViewPager reboundViewPager = this.A0D;
        if (reboundViewPager != null) {
            A01.A08(reboundViewPager, viewOnAttachStateChangeListenerC56972jY, new InterfaceC57142jp[0]);
            Context context = viewGroup.getContext();
            C14360o3.A07(context);
            KL4 kl4 = new KL4(fragmentActivity, this, userSession, A01, new C41123IIo(context, userSession, A01, this), this, new B22(new C01A(this) { // from class: X.MMS
                @Override // X.InterfaceC016806n
                public final Object get() {
                    return DirectAggregatedMediaViewerController.A0B((DirectAggregatedMediaViewerController) this.receiver);
                }
            }), new InterfaceC08830cm() { // from class: X.YJB
                @Override // X.InterfaceC08830cm
                public final /* bridge */ /* synthetic */ Object get() {
                    return Integer.valueOf(DirectAggregatedMediaViewerController.A00(DirectAggregatedMediaViewerController.this));
                }
            }, new B22(new AnonymousClass014(this) { // from class: X.YLV
                @Override // X.InterfaceC016806n
                public final Object get() {
                    return Boolean.valueOf(((DirectAggregatedMediaViewerController) this.receiver).A0j);
                }
            }));
            this.A0I = kl4;
            ReboundViewPager reboundViewPager2 = this.A0D;
            if (reboundViewPager2 != null) {
                reboundViewPager2.setAdapter((Adapter) kl4);
                ReboundViewPager reboundViewPager3 = this.A0D;
                if (reboundViewPager3 != null) {
                    reboundViewPager3.A0b = true;
                    reboundViewPager3.A0P(this.A11);
                    if (A0h(this)) {
                        ReboundViewPager reboundViewPager4 = this.A0D;
                        if (reboundViewPager4 != null) {
                            reboundViewPager4.A0L = new G0O(this);
                        }
                    }
                    this.A0J = new C34639FNw(userSession, this.A16);
                    this.A0G = C76S.A00(fragmentActivity, userSession);
                    this.A05 = new IgView(fragmentActivity);
                    ViewGroup A012 = A01(this);
                    View view2 = this.A05;
                    if (view2 != null) {
                        A012.addView(view2);
                        ViewGroup A013 = A01(this);
                        if (z) {
                            A013.addView(viewGroup);
                            AbstractC13880nE.A0f(viewGroup, this.A04);
                            AbstractC13880nE.A0U(viewGroup, this.A02);
                        } else {
                            A013.addView(viewGroup, AbstractC13890nF.A01(fragmentActivity), AbstractC13890nF.A00(fragmentActivity));
                        }
                        viewGroup.setVisibility(8);
                        this.A08 = viewGroup;
                        this.A1C.start();
                        View view3 = this.A07;
                        if (view3 != null) {
                            View view4 = this.A0p;
                            if (view4 != null) {
                                RoundedCornerFrameLayout roundedCornerFrameLayout = this.A0t;
                                if (roundedCornerFrameLayout != null) {
                                    this.A0K = new WEW(fragmentActivity, view3, view4, viewGroup, inflate, viewGroup2, roundedCornerFrameLayout, z);
                                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A0E;
                                    C14360o3.A0A(touchInterceptorFrameLayout);
                                    this.A0R = new C71058WnD(touchInterceptorFrameLayout, new C36469G6t(inflate, this), 1.0f);
                                    InterfaceC149626oF interfaceC149626oF = this.A19;
                                    TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.A0E;
                                    C14360o3.A0A(touchInterceptorFrameLayout2);
                                    AbstractC148046la.A00(touchInterceptorFrameLayout2, interfaceC149626oF);
                                    c3i9.Dnr(fragmentActivity);
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        C14360o3.A0F("viewPager");
        throw C00O.createAndThrow();
    }

    private final void A0E() {
        InterfaceC41501vz interfaceC41501vz = this.A0B;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(this.A0y).A01(interfaceC41501vz, C36078FwE.class);
        }
        InterfaceC41501vz interfaceC41501vz2 = this.A0C;
        if (interfaceC41501vz2 != null) {
            AbstractC25651Mw.A00(this.A0y).A01(interfaceC41501vz2, C7MA.class);
        }
    }

    private final void A0F() {
        InterfaceC41501vz interfaceC41501vz = this.A0B;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(this.A0y).A02(interfaceC41501vz, C36078FwE.class);
        }
        InterfaceC41501vz interfaceC41501vz2 = this.A0C;
        if (interfaceC41501vz2 != null) {
            AbstractC25651Mw.A00(this.A0y).A02(interfaceC41501vz2, C7MA.class);
        }
    }

    private final void A0G() {
        C158797Aq A05;
        if (JRE.A0A(this.A0T) && (A05 = A05(this)) != null && !A05.A0r) {
            DirectThreadKey A01 = JRE.A01(this.A0T);
            if (this.A0U == C05F.A01) {
                C34639FNw c34639FNw = this.A0J;
                if (c34639FNw == null) {
                    C14360o3.A0F("mediaFetchController");
                    throw C00O.createAndThrow();
                }
                c34639FNw.A00 = A01;
                if (A01 != null) {
                    c34639FNw.A04.A02(c34639FNw.A06.A09(A01, null), new C36788GJl(c34639FNw));
                }
            }
        }
    }

    private final void A0I() {
        Map map = this.A1F;
        for (View view : map.keySet()) {
            Number number = (Number) map.get(view);
            if (number != null) {
                view.setImportantForAccessibility(number.intValue());
            }
        }
        map.clear();
    }

    public static final void A0J(View view, DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        Object obj;
        if (view != null) {
            obj = view.getParent();
            if (obj != null && (obj instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) obj;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    C14360o3.A07(childAt);
                    if (childAt != view) {
                        directAggregatedMediaViewerController.A1F.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    }
                }
            }
        } else {
            obj = null;
        }
        if (obj instanceof View) {
            A0J((View) obj, directAggregatedMediaViewerController);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        if (r2 != X.C05F.A00) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0K(com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController r29) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController.A0K(com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController):void");
    }

    public static final void A0M(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        IgdsMediaButton igdsMediaButton;
        long j;
        boolean A06;
        EnumC72433Xdd enumC72433Xdd;
        DirectThreadKey A01;
        IgdsMediaButton igdsMediaButton2;
        ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
        String str = null;
        if (reboundViewPager != null) {
            C158797Aq A062 = A06(directAggregatedMediaViewerController, reboundViewPager.getCurrentDataIndex());
            if (A062 != null) {
                boolean z = true;
                if (!directAggregatedMediaViewerController.A0j && directAggregatedMediaViewerController.A0W == C05F.A01 && A062.A0I == EnumC40111tc.A0Q) {
                    ReboundViewPager reboundViewPager2 = directAggregatedMediaViewerController.A0D;
                    if (reboundViewPager2 != null) {
                        if (reboundViewPager2.A0O == C3VZ.A03 && directAggregatedMediaViewerController.A0H.Ejg()) {
                            UserSession userSession = directAggregatedMediaViewerController.A0y;
                            C06090Tz c06090Tz = C06090Tz.A05;
                            if (C18U.A06(c06090Tz, userSession, 36327073907751193L)) {
                                if (A062.A0R != null) {
                                    A06 = A062.A0l;
                                } else {
                                    String str2 = userSession.userId;
                                    String str3 = A062.A0U;
                                    if (str3 == null) {
                                        str3 = A062.A0Y;
                                    }
                                    if (C14360o3.A0K(str2, str3)) {
                                        j = 36327928606768087L;
                                    } else {
                                        j = 36327928606637014L;
                                    }
                                    A06 = C18U.A06(c06090Tz, userSession, j);
                                    C14360o3.A0A(Boolean.valueOf(A06));
                                }
                                if (A06) {
                                    L5T A03 = A03(directAggregatedMediaViewerController);
                                    if (A03 != null && (igdsMediaButton2 = A03.A0D) != null) {
                                        igdsMediaButton2.setVisibility(0);
                                    }
                                    C7F3 c7f3 = new C7F3(userSession);
                                    C3o9 c3o9 = directAggregatedMediaViewerController.A0T;
                                    if (c3o9 != null && (A01 = JRE.A01(c3o9)) != null) {
                                        str = A01.A01;
                                    }
                                    C2EC c2ec = directAggregatedMediaViewerController.A0O;
                                    if (c2ec == null || !c2ec.CVQ()) {
                                        z = false;
                                    }
                                    C25531Mh A0J = C25531Mh.A0J(c7f3.A01);
                                    if (z) {
                                        enumC72433Xdd = EnumC72433Xdd.A05;
                                    } else {
                                        enumC72433Xdd = EnumC72433Xdd.A06;
                                    }
                                    if (((AbstractC02600Aj) A0J).A00.isSampled()) {
                                        A0J.A0Z(26);
                                        A0J.A0X(1);
                                        A0J.A0R("selected_item", "edit_with_ai");
                                        A0J.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                                        A0J.A0M(enumC72433Xdd, "thread_type");
                                        A0J.Cht();
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
                ReboundViewPager reboundViewPager3 = directAggregatedMediaViewerController.A0D;
                if (reboundViewPager3 != null) {
                    L5T A04 = A04(directAggregatedMediaViewerController, reboundViewPager3.getCurrentDataIndex());
                    if (A04 == null || (igdsMediaButton = A04.A0D) == null) {
                        return;
                    }
                    igdsMediaButton.setVisibility(8);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("viewPager");
        throw C00O.createAndThrow();
    }

    public static final void A0O(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        String str;
        C5TA c5ta;
        C34639FNw c34639FNw = directAggregatedMediaViewerController.A0J;
        if (c34639FNw == null) {
            str = "mediaFetchController";
        } else {
            c34639FNw.A04.A01();
            View view = directAggregatedMediaViewerController.A06;
            if (view != null) {
                view.setVisibility(0);
            }
            ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
            if (reboundViewPager == null) {
                str = "viewPager";
            } else {
                reboundViewPager.setVisibility(8);
                ViewGroup viewGroup = directAggregatedMediaViewerController.A08;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                L5T A03 = A03(directAggregatedMediaViewerController);
                if (A03 != null && (c5ta = A03.A0A.A01) != null) {
                    c5ta.A0C("finished", true);
                }
                KL4 kl4 = directAggregatedMediaViewerController.A0I;
                if (kl4 == null) {
                    str = "pagerAdapter";
                } else {
                    kl4.A0D.clear();
                    C0fA.A00(kl4, 1213947383);
                    directAggregatedMediaViewerController.A0n = false;
                    directAggregatedMediaViewerController.A0V = null;
                    InterfaceC37230Gaf interfaceC37230Gaf = directAggregatedMediaViewerController.A0M;
                    if (interfaceC37230Gaf != null) {
                        interfaceC37230Gaf.EFg();
                        interfaceC37230Gaf.EJe();
                    }
                    A0W(directAggregatedMediaViewerController, false);
                    directAggregatedMediaViewerController.A0F();
                    directAggregatedMediaViewerController.A0i = false;
                    directAggregatedMediaViewerController.A0B = null;
                    directAggregatedMediaViewerController.A0C = null;
                    C71058WnD c71058WnD = directAggregatedMediaViewerController.A0R;
                    if (c71058WnD != null) {
                        c71058WnD.A00();
                    }
                    directAggregatedMediaViewerController.A0h = false;
                    directAggregatedMediaViewerController.A0I();
                    AbstractC13880nE.A0K(directAggregatedMediaViewerController.A0v);
                    A0L(directAggregatedMediaViewerController);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A0P(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        if (directAggregatedMediaViewerController.A0n) {
            ViewGroup viewGroup = directAggregatedMediaViewerController.A08;
            C14360o3.A0A(viewGroup);
            ViewGroup viewGroup2 = directAggregatedMediaViewerController.A08;
            C14360o3.A0A(viewGroup2);
            viewGroup.setSystemUiVisibility(viewGroup2.getSystemUiVisibility() | 256 | 1024);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r11.A0e() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0144, code lost:
    
        if (r6 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0Q(com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController r11, X.C158797Aq r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController.A0Q(com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController, X.7Aq):void");
    }

    public static final void A0R(DirectAggregatedMediaViewerController directAggregatedMediaViewerController, C158797Aq c158797Aq) {
        C32050E6c A02;
        String str;
        String str2;
        C7AS A01;
        Long l;
        List arrayList;
        Long l2;
        Long l3 = null;
        if (!directAggregatedMediaViewerController.A0i && directAggregatedMediaViewerController.A0d()) {
            C7IH c7ih = directAggregatedMediaViewerController.A0s;
            if (c7ih != null) {
                DirectThreadKey A012 = JRE.A01(directAggregatedMediaViewerController.A0T);
                UserSession userSession = directAggregatedMediaViewerController.A0y;
                C18A A00 = AnonymousClass189.A00(userSession);
                C2DS A002 = AbstractC28761aE.A00(userSession);
                String str3 = c158797Aq.A0T;
                C83403nh BSh = A002.BSh(A012, str3);
                if (BSh != null) {
                    arrayList = BSh.A0w();
                } else {
                    arrayList = new ArrayList();
                }
                String str4 = c158797Aq.A0N;
                String str5 = A012.A00;
                String str6 = userSession.userId;
                C2EY c2ey = C2EY.A1C;
                C158797Aq A05 = A05(directAggregatedMediaViewerController);
                if (A05 != null && (l2 = A05.A0L) != null) {
                    l3 = Long.valueOf(TimeUnit.MICROSECONDS.toMillis(l2.longValue()));
                }
                A01 = C7D7.A02(null, userSession, null, c7ih, c2ey, A00, l3, str3, str4, str5, str6, arrayList, false, false, false, false);
            } else {
                return;
            }
        } else {
            if (directAggregatedMediaViewerController.A0i || !directAggregatedMediaViewerController.A0c() || (A02 = A02(directAggregatedMediaViewerController, c158797Aq)) == null) {
                return;
            }
            UserSession userSession2 = directAggregatedMediaViewerController.A0y;
            Resources resources = directAggregatedMediaViewerController.A0v.getResources();
            C14360o3.A07(resources);
            ImmutableList A003 = AbstractC34777FUb.A00(A02);
            String str7 = A02.A05;
            String str8 = directAggregatedMediaViewerController.A0Y;
            if (str8 != null) {
                String str9 = JRE.A01(directAggregatedMediaViewerController.A0T).A00;
                String str10 = userSession2.userId;
                C7IH c7ih2 = directAggregatedMediaViewerController.A0s;
                if (c7ih2 != null) {
                    User user = A02.A02;
                    if (user != null) {
                        str = user.getId();
                    } else {
                        str = null;
                    }
                    boolean A0K = C14360o3.A0K(str, userSession2.userId);
                    C158797Aq A052 = A05(directAggregatedMediaViewerController);
                    if (A052 != null) {
                        str2 = A052.A0T;
                    } else {
                        str2 = null;
                    }
                    C2EY c2ey2 = C2EY.A1C;
                    C158797Aq A053 = A05(directAggregatedMediaViewerController);
                    if (A053 != null && (l = A053.A0L) != null) {
                        l3 = Long.valueOf(TimeUnit.MICROSECONDS.toMillis(l.longValue()));
                    }
                    A01 = AbstractC34777FUb.A01(resources, A003, userSession2, null, c7ih2, c2ey2, l3, str7, str8, str9, str10, str2, A0K);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        c158797Aq.A00 = A01;
    }

    public static final void A0S(DirectAggregatedMediaViewerController directAggregatedMediaViewerController, C158797Aq c158797Aq) {
        directAggregatedMediaViewerController.A1D.set(directAggregatedMediaViewerController.A03, c158797Aq);
        L5T A03 = A03(directAggregatedMediaViewerController);
        if (A03 != null) {
            A03.A04.A02(c158797Aq.A09.A0M(new C48490Lch(MK2.A00)).A0G(), new C49716Lxl(directAggregatedMediaViewerController, directAggregatedMediaViewerController.A17, c158797Aq, (IgProgressImageView) A03.A06.getView()));
        }
    }

    public static final void A0T(DirectAggregatedMediaViewerController directAggregatedMediaViewerController, C158797Aq c158797Aq, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel) {
        DirectThreadAnalyticsParams directThreadAnalyticsParams = directAggregatedMediaViewerController.A0Q;
        if (!(directAggregatedMediaViewerController.A0T instanceof MsysThreadId) && c158797Aq != null && c158797Aq.A0p && privacyMediaOverlayViewModel.A00 == 2 && directThreadAnalyticsParams != null) {
            UserSession userSession = directAggregatedMediaViewerController.A0y;
            LLD.A03(EnumC46297KeT.PHOTO_VIEWER, userSession, directThreadAnalyticsParams, C14360o3.A0K(c158797Aq.A0U, userSession.userId));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r0 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9.A0y, 36319377332182385L) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9.A0y, 36325033798349471L) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0Z(X.C158797Aq r10) {
        /*
            r9 = this;
            boolean r0 = r9.A0g
            if (r0 == 0) goto La1
            boolean r0 = r10.A0g
            if (r0 == 0) goto L17
            com.instagram.common.session.UserSession r3 = r9.A0y
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325033798349471(0x810d6d0001329f, double:3.0354358710223754E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto La1
        L17:
            r4 = 1
        L18:
            com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker r0 = r9.A0H
            boolean r3 = r0.Ejg()
            X.3o9 r0 = r9.A0T
            boolean r1 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            boolean r0 = r10.A0h
            r2 = 0
            if (r0 != 0) goto L39
            X.7Q4 r0 = r10.A0F
            if (r0 != 0) goto L39
            boolean r0 = r10.A0m
            if (r0 != 0) goto L39
            boolean r0 = r10.A0i
            if (r0 != 0) goto L39
            if (r1 == 0) goto L9f
            boolean r0 = r10.A0j
            if (r0 != 0) goto L9f
        L39:
            boolean r1 = r9.A0j
            boolean r0 = r9.A0e()
            if (r3 == 0) goto L48
            if (r2 == 0) goto L48
            if (r1 != 0) goto L48
            r2 = 0
            if (r0 == 0) goto L4a
        L48:
            r2 = 8
        L4a:
            X.Gaf r1 = r9.A0M
            if (r1 == 0) goto L5e
            boolean r0 = r10.A0g
            r5 = r0 ^ 1
            boolean r8 = r10.A0o
            X.UPp r3 = new X.UPp
            r6 = r5
            r7 = r5
            r3.<init>(r4, r5, r6, r7, r8)
            r1.EYr(r3)
        L5e:
            X.Gaf r0 = r9.A0M
            if (r0 == 0) goto L65
            r0.Eci(r2)
        L65:
            X.3o9 r0 = r9.A0T
            X.3oI r6 = A09(r0)
            if (r6 == 0) goto L9c
            X.Gaf r5 = r9.A0M
            if (r5 == 0) goto L9c
            X.3o9 r0 = r9.A0T
            boolean r0 = r0 instanceof com.instagram.model.direct.DirectThreadKey
            r4 = 1
            if (r0 == 0) goto L9d
            X.2EC r0 = r9.A0O
            if (r0 == 0) goto L84
            int r1 = r0.C7g()
            r0 = 29
            if (r1 != r0) goto L9d
        L84:
            com.instagram.common.session.UserSession r3 = r9.A0y
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319377332182385(0x81084800591d71, double:3.031858699041549E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L9d
        L93:
            com.instagram.common.session.UserSession r0 = r9.A0y
            X.7TH r0 = X.AbstractC46921Kp2.A00(r0, r6)
            r5.EgT(r0, r4)
        L9c:
            return
        L9d:
            r4 = 0
            goto L93
        L9f:
            r2 = 1
            goto L39
        La1:
            r4 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController.A0Z(X.7Aq):void");
    }

    public static final void A0a(Throwable th) {
        C0f5 AEp = C18950wb.A01.AEp(AnonymousClass001.A0T("DirectAggregatedMediaViewerController", "toThreadTarget", '.'), 20134884);
        AEp.ERI(th);
        AEp.report();
    }

    private final void A0b(boolean z) {
        View view;
        if (this.A0e && (view = this.A0p) != null) {
            view.setAlpha(1.0f);
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    private final boolean A0c() {
        if (this.A0U == C05F.A0C && JRE.A0A(this.A0T)) {
            return true;
        }
        return false;
    }

    private final boolean A0d() {
        if (this.A0U == C05F.A01 && JRE.A0A(this.A0T)) {
            if (C18U.A06(C06090Tz.A06, this.A0y, 36316430979699073L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0f(MotionEvent motionEvent, DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        C71058WnD c71058WnD;
        L5T A03;
        ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
        if (reboundViewPager == null) {
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        if (reboundViewPager.A0O == C3VZ.A03 && (((c71058WnD = directAggregatedMediaViewerController.A0R) == null || (!c71058WnD.A02.A00 && !c71058WnD.A03.A03())) && (A03 = A03(directAggregatedMediaViewerController)) != null)) {
            C46094Kas c46094Kas = A03.A0A;
            View view = c46094Kas.A09;
            if (view.getVisibility() == 0) {
                if (c46094Kas.A04) {
                    return true;
                }
                if (C35139Feg.A00(view, c46094Kas.A0A, motionEvent.getX(), motionEvent.getY(), 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A0h(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        DirectShareTarget directShareTarget = directAggregatedMediaViewerController.A0S;
        if (directShareTarget != null) {
            InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
            interfaceC83713oG.getClass();
            userSession = directAggregatedMediaViewerController.A0y;
            if (F3G.A00(userSession, interfaceC83713oG)) {
                c06090Tz = C06090Tz.A05;
                j = 36325909971744255L;
                return C18U.A06(c06090Tz, userSession, j);
            }
        }
        userSession = directAggregatedMediaViewerController.A0y;
        c06090Tz = C06090Tz.A05;
        j = 36325909971613181L;
        return C18U.A06(c06090Tz, userSession, j);
    }

    public static final boolean A0i(DirectAggregatedMediaViewerController directAggregatedMediaViewerController, C158797Aq c158797Aq) {
        if (c158797Aq.A0I == EnumC40111tc.A0Q) {
            C38321qM c38321qM = c158797Aq.A0E;
            if (c38321qM != null) {
                UserSession userSession = directAggregatedMediaViewerController.A0y;
                if (AbstractC40161tk.A08(userSession, c38321qM.A1t()) && C18U.A06(C06090Tz.A05, userSession, 36330063205188244L)) {
                    return true;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return false;
    }

    public static final boolean A0j(DirectAggregatedMediaViewerController directAggregatedMediaViewerController, C38321qM c38321qM) {
        EnumC40111tc enumC40111tc;
        if (directAggregatedMediaViewerController.A0f) {
            if (c38321qM != null) {
                enumC40111tc = c38321qM.BRp();
            } else {
                enumC40111tc = null;
            }
            if (enumC40111tc == EnumC40111tc.A0Q) {
                UserSession userSession = directAggregatedMediaViewerController.A0y;
                if (AbstractC40161tk.A08(userSession, c38321qM.A1t()) && C18U.A06(C06090Tz.A05, userSession, 36330063205188244L)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0l() {
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        if (!this.A0n) {
            return false;
        }
        C71058WnD c71058WnD = this.A0R;
        if (c71058WnD != null) {
            c71058WnD.A00();
        }
        if (this.A0j) {
            L5T A03 = A03(this);
            if (A03 != null && (roundedCornerFrameLayout = A03.A0E) != null) {
                A0U(this, roundedCornerFrameLayout);
                return true;
            }
            return true;
        }
        FragmentActivity fragmentActivity = this.A0v;
        Fragment A0Q = fragmentActivity.getSupportFragmentManager().A0Q("DirectIntermediatePermanentMediaViewer.ITEM_ACTIONS_FRAGMENT_TAG");
        if (A0Q != null) {
            C14240no c14240no = new C14240no(fragmentActivity.getSupportFragmentManager());
            c14240no.A03(A0Q);
            c14240no.A00();
            return true;
        }
        A0K(this);
        return true;
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        if (!this.A1K) {
            A0C();
        }
        AbstractC25651Mw.A00(this.A0y).A01(this.A0w, C2Io.class);
    }

    @Override // X.InterfaceC165297aI
    public final void DDJ(MessageIdentifier messageIdentifier, boolean z) {
        InterfaceC165297aI interfaceC165297aI = this.A0r;
        if (interfaceC165297aI != null) {
            interfaceC165297aI.DDJ(messageIdentifier, z);
        }
        A0N(this);
    }

    @Override // X.C7E7
    public final void DDK(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        AnonymousClass989 anonymousClass989 = AnonymousClass988.A1Z;
        UserSession userSession = this.A0y;
        Parcelable.Creator creator = Capabilities.CREATOR;
        AnonymousClass988 A00 = anonymousClass989.A00(userSession, AbstractC2054797v.A00(C16930sl.A00));
        FragmentActivity fragmentActivity = this.A0v;
        C7IM A06 = AbstractC86593tX.A06(fragmentActivity, A00);
        bundle.putString("direct_emoji_collection_item_id", str);
        bundle.putString("direct_emoji_collection_type", this.A0Y);
        bundle.putString(AbstractC43591JPw.A00(76), A0B(this));
        bundle.putString("direct_emoji_message_id", str2);
        bundle.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID", A06.A01);
        C6XJ c6xj = new C6XJ(fragmentActivity, bundle, userSession, ModalActivity.class, "direct_intermediate_viewer_sheet");
        c6xj.A07();
        c6xj.A0C(fragmentActivity);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        String str;
        UserSession userSession = this.A0y;
        if (AbstractC201688vy.A00(userSession)) {
            C7EB c7eb = this.A18;
            UserSession userSession2 = c7eb.A02;
            C06090Tz c06090Tz = C06090Tz.A06;
            if (C18U.A06(c06090Tz, userSession2, 36311560486191708L) && C18U.A06(c06090Tz, userSession2, 36311560487567985L)) {
                C57112jm c57112jm = c7eb.A00;
                if (c57112jm != null) {
                    c57112jm.A04(c7eb.A01);
                }
                c7eb.A00 = null;
                c7eb.A01 = null;
            }
            this.A1D.clear();
            ReboundViewPager reboundViewPager = this.A0D;
            if (reboundViewPager != null) {
                str = "viewPager";
                reboundViewPager.A0E();
                ReboundViewPager reboundViewPager2 = this.A0D;
                if (reboundViewPager2 != null) {
                    reboundViewPager2.A0Q(this.A11);
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            KL4 kl4 = this.A0I;
            if (kl4 != null) {
                str = "pagerAdapter";
                C7E8 c7e8 = kl4.A0B;
                C57112jm c57112jm2 = kl4.A09;
                C14360o3.A0B(c57112jm2, 0);
                UserSession userSession3 = c7e8.A00;
                if (C18U.A06(c06090Tz, userSession3, 36311560486191708L) && C18U.A06(c06090Tz, userSession3, 36311560487567985L)) {
                    List list = c7e8.A03;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c57112jm2.A04((View) it.next());
                    }
                    list.clear();
                }
                C41123IIo c41123IIo = kl4.A0A;
                List list2 = c41123IIo.A02;
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    c41123IIo.A00.A04((View) it2.next());
                }
                list2.clear();
                KL4 kl42 = this.A0I;
                if (kl42 != null) {
                    kl42.A0D.clear();
                    C0fA.A00(kl42, 1213947383);
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            this.A1C.A0C = null;
            this.A08 = null;
            this.A0K = null;
            this.A0p = null;
            this.A0L = null;
            this.A05 = null;
            this.A09 = null;
            this.A0M = null;
            this.A0t = null;
            this.A06 = null;
            this.A07 = null;
            this.A0R = null;
            this.A0E = null;
            this.A0s = null;
            this.A0F = null;
        }
        if (this.A1J) {
            Iterator it3 = this.A1E.iterator();
            while (it3.hasNext()) {
                C57992lC.A02(this.A0v, (InterfaceC59892oW) it3.next());
            }
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36330638731002829L)) {
            C15500q5.A04(AbstractC34378FDu.A00).remove(this.A0Z);
        }
        C6QM.A00(this);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        ViewGroup viewGroup;
        if (this.A1H && (viewGroup = this.A08) != null) {
            AbstractC008903d.A00(viewGroup, null);
        }
        A01(this).removeView(this.A0t);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A0E;
        if (touchInterceptorFrameLayout != null) {
            touchInterceptorFrameLayout.COs(null);
        }
        C71058WnD c71058WnD = this.A0R;
        if (c71058WnD != null) {
            c71058WnD.destroy();
        }
        this.A19.destroy();
        A01(this).removeView(this.A08);
        A01(this).removeView(this.A05);
        this.A1C.stop();
        A0I();
        AbstractC25651Mw.A00(this.A0y).A02(this.A0w, C2Io.class);
        C7EQ c7eq = this.A1A;
        InterfaceC676933j interfaceC676933j = this.A1B;
        C14360o3.A0B(interfaceC676933j, 0);
        ((ScaleGestureDetectorOnScaleGestureListenerC81153jk) c7eq).A01.remove(interfaceC676933j);
        this.A0m = false;
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        L5T A03;
        C46094Kas c46094Kas;
        C5TA c5ta;
        if (this.A0h) {
            C34639FNw c34639FNw = this.A0J;
            if (c34639FNw == null) {
                C14360o3.A0F("mediaFetchController");
                throw C00O.createAndThrow();
            }
            c34639FNw.A04.A01();
            C158797Aq A05 = A05(this);
            if (A05 != null && A05.A0t && (A03 = A03(this)) != null && (c5ta = (c46094Kas = A03.A0A).A01) != null) {
                c5ta.A09("horizontal_scroll");
                C46094Kas.A01(c46094Kas);
            }
        }
        this.A0x.A01();
        A0P(this);
        A0F();
        A0I();
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        L5T A03;
        C5TA c5ta;
        if (this.A0h) {
            C158797Aq A05 = A05(this);
            if (A05 != null && A05.A0t && (A03 = A03(this)) != null && (c5ta = A03.A0A.A01) != null) {
                c5ta.A0B("fragment_resumed", false);
            }
            A0J(this.A08, this);
            A0G();
        }
        A0E();
        this.A0l = false;
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
        if (this.A10 == null) {
            this.A0z.Dnr(this.A0v);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
        if (this.A10 == null) {
            this.A0z.onStop();
        }
        A0I();
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        if (!this.A1K) {
            A0D();
        }
    }

    public static final AnonymousClass442 A07(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        String str;
        String str2;
        String str3;
        C158797Aq A05 = A05(directAggregatedMediaViewerController);
        if (A05 == null || (str = A05.A0T) == null || (str2 = A05.A0N) == null || (str3 = A05.A0U) == null) {
            return null;
        }
        C2EY c2ey = C2EY.A1C;
        C38321qM c38321qM = null;
        Boolean valueOf = Boolean.valueOf(C14360o3.A0K(A05.A0J, true));
        C38321qM c38321qM2 = A05.A0E;
        if (c38321qM2 != null) {
            c38321qM = c38321qM2;
        }
        return new AnonymousClass442(null, null, null, null, null, null, null, null, null, null, c38321qM, null, c2ey, null, null, null, valueOf, str2, null, str, "permanent_media_viewer", str3, null, null, null, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C158847Aw A08(DirectAggregatedMediaViewerController directAggregatedMediaViewerController, int i) {
        L5T A04 = A04(directAggregatedMediaViewerController, i);
        if (A04 != null) {
            IgProgressImageView igProgressImageView = (IgProgressImageView) A04.A06.getView();
            UserSession userSession = directAggregatedMediaViewerController.A0y;
            return new C158847Aw(A04.A02, igProgressImageView, userSession, igProgressImageView.getIgImageView(), null, A04.A08, 0 == true ? 1 : 0, 224);
        }
        return null;
    }

    private final void A0H() {
        InterfaceC56392iX interfaceC56392iX;
        C158797Aq A05;
        L5T A03 = A03(this);
        if (A03 != null && (interfaceC56392iX = A03.A05) != null && (A05 = A05(this)) != null) {
            ((L6C) this.A1G.getValue()).A00(interfaceC56392iX, A05, new YJD(this));
        }
    }

    public static final void A0L(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        View findViewById = A01(directAggregatedMediaViewerController).findViewById(R.id.bottom_sheet_container);
        if (A01(directAggregatedMediaViewerController).indexOfChild(findViewById) >= 0) {
            A01(directAggregatedMediaViewerController).removeView(findViewById);
            ViewGroup viewGroup = directAggregatedMediaViewerController.A0q;
            if (viewGroup != null) {
                viewGroup.addView(findViewById, directAggregatedMediaViewerController.A01);
            }
        }
    }

    public static final void A0N(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        ViewGroup viewGroup;
        View findViewById = A01(directAggregatedMediaViewerController).findViewById(R.id.bottom_sheet_container);
        ViewParent parent = findViewById.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        directAggregatedMediaViewerController.A0q = viewGroup;
        if (viewGroup != null) {
            directAggregatedMediaViewerController.A01 = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            A01(directAggregatedMediaViewerController).addView(findViewById);
        }
    }

    public static final void A0W(final DirectAggregatedMediaViewerController directAggregatedMediaViewerController, boolean z) {
        C158797Aq A05;
        L5T A03 = A03(directAggregatedMediaViewerController);
        if (A03 != null && (A05 = A05(directAggregatedMediaViewerController)) != null) {
            C7E8.A01(A03, A05, new B22(new AnonymousClass014(directAggregatedMediaViewerController) { // from class: X.YLX
                @Override // X.InterfaceC016806n
                public final Object get() {
                    return Boolean.valueOf(((DirectAggregatedMediaViewerController) this.receiver).A0j);
                }
            }), z);
        }
    }

    public static final void A0X(DirectAggregatedMediaViewerController directAggregatedMediaViewerController, boolean z) {
        L5T A03;
        C158797Aq A05 = A05(directAggregatedMediaViewerController);
        if (A05 != null && A05.A0t) {
            C158797Aq A052 = A05(directAggregatedMediaViewerController);
            if ((A052 != null && A052.A0q) || (A03 = A03(directAggregatedMediaViewerController)) == null) {
                return;
            }
            int i = 8;
            View view = A03.A0A.A09;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public static final void A0Y(final DirectAggregatedMediaViewerController directAggregatedMediaViewerController, boolean z) {
        L5T A03;
        RoundedCornerFrameLayout roundedCornerFrameLayout;
        C158797Aq A05;
        L5T A032;
        RoundedCornerFrameLayout roundedCornerFrameLayout2;
        boolean A0g = A0g(directAggregatedMediaViewerController);
        if (z) {
            List list = directAggregatedMediaViewerController.A1D;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0R(directAggregatedMediaViewerController, (C158797Aq) it.next());
                arrayList.add(C0eB.A00);
            }
        } else {
            C158797Aq A052 = A05(directAggregatedMediaViewerController);
            if (A052 != null) {
                A0R(directAggregatedMediaViewerController, A052);
            }
        }
        if (!A0g && A0g(directAggregatedMediaViewerController) && !directAggregatedMediaViewerController.A0j && (A032 = A03(directAggregatedMediaViewerController)) != null && (roundedCornerFrameLayout2 = A032.A0E) != null) {
            C35139Feg c35139Feg = C35139Feg.A00;
            L5T A033 = A03(directAggregatedMediaViewerController);
            if (A033 != null) {
                Context context = A033.A02;
                C158797Aq A053 = A05(directAggregatedMediaViewerController);
                if (A053 != null) {
                    C09530e4 A01 = c35139Feg.A01(directAggregatedMediaViewerController.A0v, context, new InterfaceC08830cm() { // from class: X.YJE
                        @Override // X.InterfaceC08830cm
                        public final /* bridge */ /* synthetic */ Object get() {
                            return Integer.valueOf(DirectAggregatedMediaViewerController.A00(DirectAggregatedMediaViewerController.this));
                        }
                    }, new B22(new AnonymousClass014(directAggregatedMediaViewerController) { // from class: X.YLY
                        @Override // X.InterfaceC016806n
                        public final Object get() {
                            return Boolean.valueOf(((DirectAggregatedMediaViewerController) this.receiver).A0j);
                        }
                    }), A053.A02, true, false);
                    float floatValue = ((Number) A01.A00).floatValue();
                    float floatValue2 = ((Number) A01.A01).floatValue();
                    if (directAggregatedMediaViewerController.A0K != null) {
                        WEW.A00(roundedCornerFrameLayout2, floatValue, floatValue2, 0.0f);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        L5T A034 = A03(directAggregatedMediaViewerController);
        if (A034 != null && (A05 = A05(directAggregatedMediaViewerController)) != null) {
            directAggregatedMediaViewerController.A17.A02(directAggregatedMediaViewerController, A034, A05, new B22(new AnonymousClass014(directAggregatedMediaViewerController) { // from class: X.YLZ
                @Override // X.InterfaceC016806n
                public final Object get() {
                    return Boolean.valueOf(((DirectAggregatedMediaViewerController) this.receiver).A0j);
                }
            }));
        }
        if (A0g && !A0g(directAggregatedMediaViewerController) && !directAggregatedMediaViewerController.A0j && (A03 = A03(directAggregatedMediaViewerController)) != null && (roundedCornerFrameLayout = A03.A0E) != null) {
            C35139Feg c35139Feg2 = C35139Feg.A00;
            L5T A035 = A03(directAggregatedMediaViewerController);
            if (A035 != null) {
                Context context2 = A035.A02;
                C158797Aq A054 = A05(directAggregatedMediaViewerController);
                if (A054 != null) {
                    C09530e4 A012 = c35139Feg2.A01(directAggregatedMediaViewerController.A0v, context2, new InterfaceC08830cm() { // from class: X.YJF
                        @Override // X.InterfaceC08830cm
                        public final /* bridge */ /* synthetic */ Object get() {
                            return Integer.valueOf(DirectAggregatedMediaViewerController.A00(DirectAggregatedMediaViewerController.this));
                        }
                    }, new B22(new AnonymousClass014(directAggregatedMediaViewerController) { // from class: X.YLa
                        @Override // X.InterfaceC016806n
                        public final Object get() {
                            return Boolean.valueOf(((DirectAggregatedMediaViewerController) this.receiver).A0j);
                        }
                    }), A054.A02, false, false);
                    float floatValue3 = ((Number) A012.A00).floatValue();
                    float floatValue4 = ((Number) A012.A01).floatValue();
                    if (directAggregatedMediaViewerController.A0K != null) {
                        WEW.A00(roundedCornerFrameLayout, floatValue3, floatValue4, 0.0f);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (z) {
            KL4 kl4 = directAggregatedMediaViewerController.A0I;
            if (kl4 != null) {
                ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
                if (reboundViewPager == null) {
                    C14360o3.A0F("viewPager");
                    throw C00O.createAndThrow();
                }
                kl4.A00 = reboundViewPager.getCurrentDataIndex();
                kl4.A05 = true;
                KL4 kl42 = directAggregatedMediaViewerController.A0I;
                if (kl42 != null) {
                    C0fA.A00(kl42, 1920743064);
                    return;
                }
            }
            C14360o3.A0F("pagerAdapter");
            throw C00O.createAndThrow();
        }
    }

    private final boolean A0e() {
        C158797Aq A05 = A05(this);
        if (A05 == null || A05.A0t) {
            return false;
        }
        ReboundViewPager reboundViewPager = this.A0D;
        if (reboundViewPager == null) {
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        C158847Aw A08 = A08(this, reboundViewPager.getCurrentDataIndex());
        if (A08 == null || A08.A05.CGb() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean A0g(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        C7AS c7as;
        C158797Aq A05 = A05(directAggregatedMediaViewerController);
        if (A05 == null || (c7as = A05.A00) == null || !(!c7as.A02.isEmpty())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0378, code lost:
    
        if (r49.A0W != r0) goto L172;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0k(com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker r50, X.InterfaceC165297aI r51, X.C7IH r52, X.C7IK r53, X.E6B r54, com.instagram.model.direct.DirectShareTarget r55, X.C3o9 r56, java.lang.Integer r57, java.lang.Integer r58, java.lang.String r59, java.util.List r60, X.InterfaceC16820sZ r61, X.InterfaceC16660sJ r62, X.InterfaceC16660sJ r63, float r64, int r65, boolean r66, boolean r67, boolean r68, boolean r69, boolean r70) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController.A0k(com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker, X.7aI, X.7IH, X.7IK, X.E6B, com.instagram.model.direct.DirectShareTarget, X.3o9, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, X.0sZ, X.0sJ, X.0sJ, float, int, boolean, boolean, boolean, boolean, boolean):void");
    }
}
