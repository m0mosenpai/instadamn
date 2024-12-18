package com.instagram.profile.fragment;

import X.AbstractC001800i;
import X.AbstractC021208i;
import X.AbstractC06950Ym;
import X.AbstractC10360h2;
import X.AbstractC151756sL;
import X.AbstractC154746xP;
import X.AbstractC154816xW;
import X.AbstractC155926zM;
import X.AbstractC15930qn;
import X.AbstractC23021Ah;
import X.AbstractC25319BIo;
import X.AbstractC50102Ry;
import X.AbstractC59962oe;
import X.AbstractC65332xV;
import X.AbstractC82073lT;
import X.AbstractC99834e5;
import X.AnonymousClass715;
import X.C02R;
import X.C05F;
import X.C06090Tz;
import X.C07X;
import X.C14360o3;
import X.C154306wf;
import X.C155376yQ;
import X.C155396yS;
import X.C155406yT;
import X.C155536yi;
import X.C155666yv;
import X.C155766z5;
import X.C155776z6;
import X.C155786z8;
import X.C155796z9;
import X.C155856zF;
import X.C155876zH;
import X.C155886zI;
import X.C155896zJ;
import X.C155946zO;
import X.C155996zT;
import X.C156006zU;
import X.C156016zV;
import X.C156066za;
import X.C1564670r;
import X.C18U;
import X.C1KM;
import X.C29338CwX;
import X.C30189DRu;
import X.C30226DTf;
import X.C33616EtS;
import X.C33L;
import X.C37351oY;
import X.C38321qM;
import X.C38N;
import X.C38U;
import X.C39144HKx;
import X.C3FN;
import X.C3FQ;
import X.C42747Ivl;
import X.C42749Ivn;
import X.C4NJ;
import X.C4NL;
import X.C53N;
import X.C53P;
import X.C53Q;
import X.C53R;
import X.C53V;
import X.C56292iI;
import X.C5TR;
import X.C673932e;
import X.C684436h;
import X.C70783Fq;
import X.C71E;
import X.C71L;
import X.C75113Zb;
import X.EnumC125765mR;
import X.EnumC125775mS;
import X.EnumC155546yj;
import X.EnumC155676yw;
import X.EnumC155686yx;
import X.IM8;
import X.InterfaceC021908q;
import X.InterfaceC11380iw;
import X.InterfaceC152826uB;
import X.InterfaceC152836uD;
import X.InterfaceC155836zD;
import X.InterfaceC156026zW;
import X.InterfaceC156076zb;
import X.InterfaceC19610xo;
import X.InterfaceC60442pS;
import X.InterfaceC61772re;
import X.InterfaceC65232xL;
import X.InterfaceC70493Ek;
import X.InterfaceC70513Em;
import X.JHJ;
import X.MSV;
import X.MUB;
import X.RunnableC151166rJ;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton;
import com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior;
import com.instagram.ui.animation.pushlayout.PushDynamicCoordinatorLayout;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class UserDetailTabController implements InterfaceC65232xL, InterfaceC021908q, C53R {
    public int A00;
    public int A01;
    public C42749Ivn A02;
    public C155776z6 A03;
    public Integer A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public JHJ A0D;
    public boolean A0E;
    public boolean A0F;
    public final ViewTreeObserver.OnPreDrawListener A0G;
    public final FragmentActivity A0H;
    public final InterfaceC155836zD A0I;
    public final InterfaceC155836zD A0J;
    public final AbstractC59962oe A0K;
    public final UserSession A0L;
    public final InterfaceC156076zb A0M;
    public final C155876zH A0N;
    public final C155666yv A0O;
    public final C155896zJ A0P;
    public final C155996zT A0Q;
    public final C156006zU A0R;
    public final UserDetailFragment A0S;
    public final C155786z8 A0T;
    public final C155536yi A0U;
    public final InterfaceC70493Ek A0V;
    public final Runnable A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final C155886zI A0d;
    public final UserDetailFragment A0e;
    public final C155796z9 A0f;
    public final C53V A0g;
    public final boolean A0h;
    public InterfaceC152826uB mOpalSwitchIndicatorHelper;
    public FadeInFollowButton mOverFlowFollowButton;
    public View mPVFollowSecondaryCTAView;
    public IgTextView mUpsellFollowButtonView;
    public C71E mUserDetailEmptyStateController;
    public AnonymousClass715 mViewHolder;

    @Override // X.InterfaceC021908q
    public final void onPageScrollStateChanged(int i) {
        if (i == 1) {
            this.A05 = "swipe";
        }
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC021908q
    public final void onPageSelected(int i) {
        A05(this, i, true);
    }

    public static void A00(UserDetailTabController userDetailTabController) {
        if (userDetailTabController.mViewHolder != null && userDetailTabController.A0B) {
            A04(userDetailTabController);
            if (userDetailTabController.A09) {
                userDetailTabController.mViewHolder.A0J.setIsLoading(false);
                return;
            }
            AnonymousClass715 anonymousClass715 = userDetailTabController.mViewHolder;
            if (anonymousClass715 != null) {
                ((C56292iI) anonymousClass715.A02.getLayoutParams()).A02 = 49;
            }
            userDetailTabController.mViewHolder.A0E.A05 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x001f, code lost:
    
        if (X.AbstractC154826xX.A02(r8.A01, r2.A0J) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(com.instagram.profile.fragment.UserDetailTabController r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.fragment.UserDetailTabController.A01(com.instagram.profile.fragment.UserDetailTabController):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r6.A03.BQb().intValue() <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36330058910024338L) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0380, code lost:
    
        if (r11.equals("created") == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x036b, code lost:
    
        if (r0.booleanValue() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (r10.A00 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x035b, code lost:
    
        if (r1 != false) goto L54;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:100:0x01d5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:173:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03dd A[LOOP:1: B:184:0x03d6->B:186:0x03dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(final com.instagram.profile.fragment.UserDetailTabController r34) {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.fragment.UserDetailTabController.A02(com.instagram.profile.fragment.UserDetailTabController):void");
    }

    public static void A03(UserDetailTabController userDetailTabController) {
        boolean A01;
        String str;
        if (userDetailTabController.mViewHolder != null) {
            if (userDetailTabController.A0T() && C37351oY.A03 != null) {
                C37351oY A00 = AbstractC151756sL.A00();
                UserSession userSession = userDetailTabController.A0L;
                if (A00.A06(userSession)) {
                    if (userDetailTabController.mOpalSwitchIndicatorHelper == null) {
                        A04(userDetailTabController);
                        AbstractC151756sL.A00();
                        C29338CwX c29338CwX = new C29338CwX();
                        userDetailTabController.mOpalSwitchIndicatorHelper = c29338CwX;
                        ViewGroup viewGroup = userDetailTabController.mViewHolder.A06;
                        AbstractC59962oe abstractC59962oe = userDetailTabController.A0K;
                        C14360o3.A0B(viewGroup, 0);
                        C14360o3.A0B(abstractC59962oe, 1);
                        viewGroup.addView(AbstractC25319BIo.A02(abstractC59962oe, new C5TR(1631125871, true, new C30189DRu(c29338CwX, 3)), false, false));
                        if (!userDetailTabController.A0E) {
                            ViewGroup viewGroup2 = userDetailTabController.mViewHolder.A07;
                            String str2 = userDetailTabController.A0Y;
                            if (userDetailTabController.A0h) {
                                str = "self_profile";
                            } else {
                                str = "profile";
                            }
                            InterfaceC11380iw interfaceC11380iw = userDetailTabController.A0Q.A01;
                            int i = 0;
                            C14360o3.A0B(viewGroup2, 0);
                            C14360o3.A0B(userSession, 2);
                            if (AbstractC23021Ah.A00(userSession).A01.getInt(MSV.A00(1458), 0) < 5) {
                                viewGroup2.addView(AbstractC25319BIo.A02(abstractC59962oe, new C5TR(750075973, true, new C30226DTf(userSession, viewGroup2, interfaceC11380iw, str2, str, 2)), false, false));
                            } else {
                                i = 8;
                            }
                            viewGroup2.setVisibility(i);
                            userDetailTabController.A0E = true;
                        }
                    }
                    A01 = false;
                    userDetailTabController.mViewHolder.A06.setVisibility(0);
                    userDetailTabController.A09 = A01;
                }
            }
            AnonymousClass715 anonymousClass715 = userDetailTabController.mViewHolder;
            if (anonymousClass715 != null) {
                anonymousClass715.A07.setVisibility(8);
                userDetailTabController.mViewHolder.A06.setVisibility(8);
                userDetailTabController.mOpalSwitchIndicatorHelper = null;
            }
            A01 = C33L.A01(userDetailTabController.A0L);
            userDetailTabController.A09 = A01;
        }
    }

    public static void A04(UserDetailTabController userDetailTabController) {
        AnonymousClass715 anonymousClass715 = userDetailTabController.mViewHolder;
        if (anonymousClass715 != null) {
            C1KM.A09.A0I(String.valueOf(anonymousClass715.A02.hashCode()), userDetailTabController.A0K.getModuleName());
            InterfaceC152826uB interfaceC152826uB = userDetailTabController.mOpalSwitchIndicatorHelper;
            if (interfaceC152826uB != null) {
                interfaceC152826uB.FBZ(0.0f);
                return;
            }
            boolean z = userDetailTabController.A09;
            AnonymousClass715 anonymousClass7152 = userDetailTabController.mViewHolder;
            if (z) {
                anonymousClass7152.A0J.setIsLoading(false);
            } else {
                anonymousClass7152.A0E.A01(0.0f);
                userDetailTabController.mViewHolder.A0E.A02(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r3 == null) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A05(com.instagram.profile.fragment.UserDetailTabController r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.fragment.UserDetailTabController.A05(com.instagram.profile.fragment.UserDetailTabController, int, boolean):void");
    }

    public static void A06(UserDetailTabController userDetailTabController, boolean z) {
        FollowStatus followStatus;
        UserDetailFragment userDetailFragment;
        C71L c71l;
        UserDetailFragment userDetailFragment2;
        C1564670r c1564670r;
        long j;
        long j2;
        long j3;
        UserDetailFragment userDetailFragment3;
        C71L c71l2;
        C155666yv c155666yv = userDetailTabController.A0O;
        User user = c155666yv.A0J;
        if (user != null) {
            followStatus = user.B7L();
        } else {
            followStatus = FollowStatus.A08;
        }
        if (followStatus == FollowStatus.A06) {
            User user2 = c155666yv.A0J;
            if (user2 != null && user2.CQf()) {
                return;
            }
            if (userDetailTabController.A0A) {
                if (userDetailTabController.mPVFollowSecondaryCTAView != null && (c71l2 = (userDetailFragment3 = userDetailTabController.A03.A00).A0O) != null) {
                    View view = c71l2.A02;
                    if (!c71l2.A05()) {
                        userDetailFragment3.A0O.A02(view);
                    } else if (userDetailFragment3.A0O.A05()) {
                        userDetailFragment3.A0O.A03(view);
                    }
                }
                IgTextView igTextView = userDetailTabController.mUpsellFollowButtonView;
                if (igTextView != null) {
                    User user3 = c155666yv.A0J;
                    if (user3 != null) {
                        AbstractC99834e5.A02(igTextView, userDetailTabController.A0L, user3.getId());
                    }
                    UserDetailFragment userDetailFragment4 = userDetailTabController.A03.A00;
                    C1564670r c1564670r2 = userDetailFragment4.A17;
                    if (c1564670r2 == null) {
                        return;
                    }
                    c1564670r2.A02(userDetailFragment4.getContext(), userDetailFragment4.mView, true);
                    return;
                }
                FadeInFollowButton fadeInFollowButton = userDetailTabController.mOverFlowFollowButton;
                if (fadeInFollowButton == null) {
                    return;
                }
                User user4 = c155666yv.A0J;
                if (user4 != null) {
                    AbstractC99834e5.A02(fadeInFollowButton, userDetailTabController.A0L, user4.getId());
                }
                userDetailTabController.mOverFlowFollowButton.A04(z, userDetailTabController.A0L);
                final C155776z6 c155776z6 = userDetailTabController.A03;
                final boolean z2 = true;
                Handler handler = c155776z6.A00.A2b;
                Runnable runnable = new Runnable() { // from class: X.6rK
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1564670r c1564670r3;
                        boolean z3;
                        C1564670r c1564670r4;
                        C155776z6 c155776z62 = C155776z6.this;
                        boolean z4 = z2;
                        UserDetailFragment userDetailFragment5 = c155776z62.A00;
                        if ((UserDetailFragment.A0h(userDetailFragment5) && (c1564670r4 = userDetailFragment5.A17) != null && c1564670r4.A03()) || ((c1564670r3 = userDetailFragment5.A17) != null && c1564670r3.A00 != null)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z4 && z3) {
                            return;
                        }
                        userDetailFragment5.A11.A03(!z4);
                    }
                };
                if (z) {
                    j3 = 0;
                } else {
                    j3 = 200;
                }
                handler.postDelayed(runnable, j3);
                return;
            }
            FadeInFollowButton fadeInFollowButton2 = userDetailTabController.mOverFlowFollowButton;
            if (fadeInFollowButton2 != null && fadeInFollowButton2.getVisibility() == 0) {
                FadeInFollowButton fadeInFollowButton3 = userDetailTabController.mOverFlowFollowButton;
                if (!fadeInFollowButton3.A0B) {
                    if (z) {
                        fadeInFollowButton3.setInAnimation(null);
                        fadeInFollowButton3.setOutAnimation(null);
                    }
                    fadeInFollowButton3.setDisplayedChild(0);
                    RunnableC151166rJ runnableC151166rJ = new RunnableC151166rJ(fadeInFollowButton3);
                    if (z) {
                        j2 = 0;
                    } else {
                        j2 = 200;
                    }
                    fadeInFollowButton3.postDelayed(runnableC151166rJ, j2);
                    if (z) {
                        fadeInFollowButton3.setInAnimation(fadeInFollowButton3.A0D);
                        fadeInFollowButton3.setOutAnimation(fadeInFollowButton3.A0E);
                    }
                }
                final C155776z6 c155776z62 = userDetailTabController.A03;
                final boolean z3 = false;
                Handler handler2 = c155776z62.A00.A2b;
                Runnable runnable2 = new Runnable() { // from class: X.6rK
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1564670r c1564670r3;
                        boolean z32;
                        C1564670r c1564670r4;
                        C155776z6 c155776z622 = C155776z6.this;
                        boolean z4 = z3;
                        UserDetailFragment userDetailFragment5 = c155776z622.A00;
                        if ((UserDetailFragment.A0h(userDetailFragment5) && (c1564670r4 = userDetailFragment5.A17) != null && c1564670r4.A03()) || ((c1564670r3 = userDetailFragment5.A17) != null && c1564670r3.A00 != null)) {
                            z32 = true;
                        } else {
                            z32 = false;
                        }
                        if (z4 && z32) {
                            return;
                        }
                        userDetailFragment5.A11.A03(!z4);
                    }
                };
                if (z) {
                    j = 0;
                } else {
                    j = 200;
                }
                handler2.postDelayed(runnable2, j);
            }
            IgTextView igTextView2 = userDetailTabController.mUpsellFollowButtonView;
            if (igTextView2 != null && igTextView2.getVisibility() == 0 && (c1564670r = (userDetailFragment2 = userDetailTabController.A03.A00).A17) != null) {
                c1564670r.A02(userDetailFragment2.getContext(), userDetailFragment2.mView, false);
            }
            View view2 = userDetailTabController.mPVFollowSecondaryCTAView;
            if (view2 == null || view2.getVisibility() != 0 || (c71l = (userDetailFragment = userDetailTabController.A03.A00).A0O) == null) {
                return;
            }
            View view3 = c71l.A02;
            if (!c71l.A05()) {
                return;
            }
            userDetailFragment.A0O.A03(view3);
        }
    }

    public static boolean A07(UserDetailTabController userDetailTabController) {
        AnonymousClass715 anonymousClass715 = userDetailTabController.mViewHolder;
        if (anonymousClass715 != null && anonymousClass715.A0I.getCurrentItem() > -1 && userDetailTabController.A0N.A00.size() > 0) {
            return true;
        }
        return false;
    }

    public final int A08(EnumC125775mS enumC125775mS) {
        AbstractC65332xV abstractC65332xV;
        if (this.A0C && enumC125775mS == EnumC125775mS.A06) {
            C42749Ivn c42749Ivn = this.A02;
            if (c42749Ivn == null) {
                return 0;
            }
            C14360o3.A0B(enumC125775mS, 0);
            abstractC65332xV = C42749Ivn.A00(c42749Ivn, enumC125775mS).A07;
        } else {
            abstractC65332xV = ((AbstractC155926zM) this.A0P.A03.get(enumC125775mS)).A02;
        }
        return abstractC65332xV.A01.size();
    }

    public final int A09(EnumC125775mS enumC125775mS, String str) {
        int i;
        C42749Ivn c42749Ivn;
        if (this.A0C && enumC125775mS == EnumC125775mS.A06 && (c42749Ivn = this.A02) != null) {
            C14360o3.A0B(enumC125775mS, 0);
            C14360o3.A0B(str, 1);
            C42747Ivl A00 = C42749Ivn.A00(c42749Ivn, enumC125775mS);
            Iterator it = ((AbstractC65332xV) A00.A07).A01.iterator();
            i = 0;
            while (it.hasNext()) {
                if (C14360o3.A0K(((IM8) it.next()).A00(), str)) {
                    if (i == -1) {
                        return -1;
                    }
                    EnumC125765mR enumC125765mR = A00.A04;
                    if (enumC125765mR.ordinal() != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("getRowPosition for this profile tab mode unsupported ");
                        sb.append(enumC125765mR);
                        sb.append(". Likely you are trying to use ProfileGridItems in a tab that is not the main grid");
                        throw new UnsupportedOperationException(sb.toString());
                    }
                } else {
                    i++;
                }
            }
            return -1;
        }
        AbstractC155926zM abstractC155926zM = (AbstractC155926zM) this.A0P.A03.get(enumC125775mS);
        C14360o3.A0B(str, 0);
        Iterator it2 = ((AbstractC65332xV) abstractC155926zM.A02).A01.iterator();
        i = 0;
        while (it2.hasNext()) {
            if (C14360o3.A0K(((C38321qM) it2.next()).getId(), str)) {
                if (i == -1) {
                    return -1;
                }
                EnumC125765mR enumC125765mR2 = abstractC155926zM.A05;
                int ordinal = enumC125765mR2.ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getRowPosition for this profile tab mode unsupported ");
                    sb2.append(enumC125765mR2);
                    throw new UnsupportedOperationException(sb2.toString());
                }
            } else {
                i++;
            }
        }
        return -1;
        return i / 3;
    }

    public final C3FQ A0A() {
        InterfaceC152836uD interfaceC152836uD;
        AnonymousClass715 anonymousClass715 = this.mViewHolder;
        if (anonymousClass715 != null) {
            interfaceC152836uD = this.A0N.A02(anonymousClass715.A0I.getCurrentItem());
        } else {
            interfaceC152836uD = null;
        }
        C3FQ c3fq = null;
        if (interfaceC152836uD != null) {
            ViewGroup Br5 = interfaceC152836uD.Br5();
            if ((Br5 instanceof AbsListView) || (Br5 instanceof RecyclerView)) {
                try {
                    c3fq = C3FN.A00(Br5);
                    return c3fq;
                } catch (IllegalArgumentException | IllegalStateException unused) {
                    return c3fq;
                }
            }
        }
        return null;
    }

    public final EnumC125765mR A0B() {
        if (this.mViewHolder != null && A07(this)) {
            C155876zH c155876zH = this.A0N;
            return ((InterfaceC156026zW) c155876zH.A00.get(this.mViewHolder.A0I.getCurrentItem())).BiA();
        }
        return null;
    }

    public final String A0C() {
        if (this.mViewHolder != null && A07(this)) {
            C155876zH c155876zH = this.A0N;
            return ((InterfaceC156026zW) c155876zH.A00.get(this.mViewHolder.A0I.getCurrentItem())).C4o();
        }
        return null;
    }

    public final void A0E() {
        int A01;
        TabLayout tabLayout;
        C154306wf A07;
        if (this.mViewHolder != null && (A01 = this.A0N.A01("profile_highlights")) >= 0 && (A07 = (tabLayout = this.mViewHolder.A0C).A07(A01)) != null) {
            this.A0U.A01(tabLayout, A07.A04, EnumC155546yj.A0G);
        }
    }

    public final void A0F() {
        this.A0O.notifyDataSetChangedSmart();
        A0G();
    }

    public final void A0H() {
        AnonymousClass715 anonymousClass715;
        if (this.A08 && (anonymousClass715 = this.mViewHolder) != null) {
            RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior = anonymousClass715.A0G;
            refreshableAppBarLayoutBehavior.A06 = C05F.A01;
            RefreshableAppBarLayoutBehavior.A02(refreshableAppBarLayoutBehavior);
            InterfaceC70513Em interfaceC70513Em = refreshableAppBarLayoutBehavior.A05;
            if (interfaceC70513Em != null) {
                interfaceC70513Em.setIsLoading(false);
            }
            Iterator it = refreshableAppBarLayoutBehavior.A0G.iterator();
            while (it.hasNext()) {
                ((C53P) it.next()).Doy();
            }
            this.mViewHolder.A0J.setIsLoading(false);
        }
    }

    public final void A0I() {
        AbstractC021208i adapter;
        AnonymousClass715 anonymousClass715 = this.mViewHolder;
        if (anonymousClass715 != null && (adapter = anonymousClass715.A0I.getAdapter()) != null) {
            List A0a = AbstractC001800i.A0a(this.A0R.A09);
            for (int i = 0; i < A0a.size(); i++) {
                if (AbstractC50102Ry.A00(((InterfaceC156026zW) A0a.get(i)).C4o(), "profile_fan_club_grid")) {
                    if (i != -1 && i < adapter.getCount()) {
                        this.mViewHolder.A0I.setCurrentItem(i);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void A0J(int i) {
        C155666yv c155666yv = this.A0O;
        if (c155666yv.A00 != i) {
            c155666yv.A00 = i;
            c155666yv.A00();
        }
        C156016zV c156016zV = this.A0R.A03;
        EnumC125765mR enumC125765mR = c156016zV.A07;
        boolean z = false;
        if (enumC125765mR == EnumC125765mR.A0B) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(enumC125765mR);
        sb.append(" does not support setting badge count externally");
        C02R.A07(z, sb.toString());
        c156016zV.A00 = i;
        C156016zV.A01(c156016zV);
    }

    public final void A0K(EnumC155686yx enumC155686yx) {
        C155666yv c155666yv = this.A0O;
        if (c155666yv.A09 != enumC155686yx) {
            c155666yv.A09 = enumC155686yx;
            c155666yv.A00();
        }
    }

    public final void A0L(EnumC155676yw enumC155676yw) {
        C155666yv c155666yv = this.A0O;
        if (c155666yv.A0A != enumC155676yw) {
            c155666yv.A0A = enumC155676yw;
            c155666yv.A00();
        }
    }

    public final void A0M(C33616EtS c33616EtS) {
        C155666yv c155666yv = this.A0O;
        if (c155666yv.A0D != c33616EtS) {
            c155666yv.A0D = c33616EtS;
            c155666yv.A00();
        }
    }

    public final void A0N(EnumC125775mS enumC125775mS) {
        if (this.A0C && enumC125775mS == EnumC125775mS.A06) {
            return;
        }
        AbstractC155926zM abstractC155926zM = (AbstractC155926zM) this.A0P.A03.get(enumC125775mS);
        abstractC155926zM.A02.A04();
        AbstractC155926zM.A00(abstractC155926zM);
    }

    public final void A0O(EnumC125775mS enumC125775mS) {
        C42749Ivn c42749Ivn = this.A02;
        if (c42749Ivn != null) {
            C14360o3.A0B(enumC125775mS, 0);
            C42747Ivl A00 = C42749Ivn.A00(c42749Ivn, enumC125775mS);
            A00.A07.A04();
            C42747Ivl.A00(A00);
        }
    }

    public final void A0P(EnumC125775mS enumC125775mS, List list) {
        if (this.A0C && enumC125775mS == EnumC125775mS.A06) {
            return;
        }
        AbstractC155926zM abstractC155926zM = (AbstractC155926zM) this.A0P.A03.get(enumC125775mS);
        C14360o3.A0B(list, 0);
        C155946zO c155946zO = abstractC155926zM.A02;
        c155946zO.A0B(list);
        c155946zO.A01 = abstractC155926zM.A06.A17(abstractC155926zM.A05);
        AbstractC155926zM.A00(abstractC155926zM);
    }

    public final void A0Q(EnumC125775mS enumC125775mS, List list) {
        C42749Ivn c42749Ivn = this.A02;
        if (c42749Ivn != null) {
            C14360o3.A0B(list, 0);
            C14360o3.A0B(enumC125775mS, 1);
            C42747Ivl A00 = C42749Ivn.A00(c42749Ivn, enumC125775mS);
            C39144HKx c39144HKx = A00.A07;
            c39144HKx.A0B(list);
            c39144HKx.A00 = A00.A05.A17(A00.A04);
            C42747Ivl.A00(A00);
        }
    }

    public final void A0R(C4NL c4nl) {
        C155666yv c155666yv = this.A0O;
        C4NL c4nl2 = c155666yv.A0H;
        if (c4nl2 != c4nl) {
            if (c4nl2 != null && c4nl == null && ((C4NJ) c4nl2).A0D.equals("511740098064479")) {
                InterfaceC19610xo ARD = AbstractC23021Ah.A00(c155666yv.A0c).A01.ARD();
                ARD.E77("has_dismissed_link_sharing_profile_megaphone", true);
                ARD.apply();
            }
            c155666yv.A0H = c4nl;
            c155666yv.A00();
        }
    }

    public final void A0S(User user, boolean z) {
        C155666yv c155666yv = this.A0O;
        if (c155666yv.A0J != user) {
            c155666yv.A0J = user;
            if (!AbstractC154816xW.A03(c155666yv.A0c, user)) {
                c155666yv.A0Y.A05();
            }
            if (z) {
                c155666yv.A00();
            }
        }
        if (!AbstractC154816xW.A03(this.A0L, user)) {
            HashMap hashMap = this.A0P.A03;
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                AbstractC155926zM abstractC155926zM = (AbstractC155926zM) hashMap.get(it.next());
                abstractC155926zM.A02.A04();
                AbstractC155926zM.A00(abstractC155926zM);
            }
        }
        A02(this);
        A01(this);
        A03(this);
    }

    public final boolean A0T() {
        User user;
        C155666yv c155666yv = this.A0O;
        boolean z = c155666yv.A0j;
        if ((!z && ((user = c155666yv.A0J) == null || user.A03.BYy() == null)) || C37351oY.A03 == null) {
            return false;
        }
        C37351oY A00 = AbstractC151756sL.A00();
        UserSession userSession = this.A0L;
        if (z) {
            return A00.A05(userSession);
        }
        return A00.A04(userSession);
    }

    public final boolean A0U(EnumC125775mS enumC125775mS) {
        C42749Ivn c42749Ivn;
        if (this.A0C && enumC125775mS == EnumC125775mS.A06 && (c42749Ivn = this.A02) != null) {
            C14360o3.A0B(enumC125775mS, 0);
            return C42749Ivn.A00(c42749Ivn, enumC125775mS).A00;
        }
        return ((AbstractC155926zM) this.A0P.A03.get(enumC125775mS)).A01;
    }

    @Override // X.C53R
    public final C155996zT Avm() {
        return this.A0Q;
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        InterfaceC61772re interfaceC61772re;
        WeakReference weakReference = this.A0d.A00;
        if (weakReference != null && (interfaceC61772re = (InterfaceC61772re) weakReference.get()) != null) {
            return interfaceC61772re.BRZ(c38321qM);
        }
        return new C75113Zb(c38321qM.A0p(), c38321qM.A4w());
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        InterfaceC65232xL interfaceC65232xL;
        WeakReference weakReference = this.A0d.A00;
        if (weakReference != null && (interfaceC65232xL = (InterfaceC65232xL) weakReference.get()) != null) {
            interfaceC65232xL.CtR(c38321qM);
        }
    }

    public final ArrayList A0D() {
        ArrayList arrayList;
        String id;
        EnumC125765mR A0B = A0B();
        if (A0B != null) {
            C42749Ivn c42749Ivn = this.A02;
            if (c42749Ivn != null && this.A0C && A0B == EnumC125765mR.A09) {
                EnumC125775mS enumC125775mS = A0B.A00;
                C14360o3.A0B(enumC125775mS, 0);
                C42747Ivl A00 = C42749Ivn.A00(c42749Ivn, enumC125775mS);
                C39144HKx c39144HKx = A00.A07;
                c39144HKx.A08(A00.A06);
                List list = ((AbstractC65332xV) c39144HKx).A01;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((IM8) obj).A01 == ProfileGridItemTypeEnum.A05) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C38321qM c38321qM = ((IM8) it.next()).A02;
                    if (c38321qM != null && (id = c38321qM.getId()) != null) {
                        arrayList.add(id);
                    }
                }
            } else {
                AbstractC155926zM abstractC155926zM = (AbstractC155926zM) this.A0P.A03.get(A0B.A00);
                C155946zO c155946zO = abstractC155926zM.A02;
                c155946zO.A08(abstractC155926zM.A03);
                List list2 = ((AbstractC65332xV) c155946zO).A01;
                arrayList = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C38321qM) it2.next()).getId());
                }
            }
            return new ArrayList(arrayList);
        }
        return null;
    }

    public final void A0G() {
        EnumC125765mR A0B = A0B();
        if (A0B != null) {
            if (this.A0C && A0B == EnumC125765mR.A09) {
                C42749Ivn c42749Ivn = this.A02;
                if (c42749Ivn != null) {
                    EnumC125775mS enumC125775mS = A0B.A00;
                    C14360o3.A0B(enumC125775mS, 0);
                    C42747Ivl.A00(C42749Ivn.A00(c42749Ivn, enumC125775mS));
                    return;
                }
                return;
            }
            C155896zJ c155896zJ = this.A0P;
            AbstractC155926zM.A00((AbstractC155926zM) c155896zJ.A03.get(A0B.A00));
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [X.6zI, java.lang.Object] */
    public UserDetailTabController(FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, C07X c07x, AbstractC59962oe abstractC59962oe, C155766z5 c155766z5, C684436h c684436h, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C673932e c673932e, C155376yQ c155376yQ, InterfaceC60442pS interfaceC60442pS, C53Q c53q, C38N c38n, C155406yT c155406yT, C155666yv c155666yv, C33616EtS c33616EtS, C155776z6 c155776z6, UserDetailFragment userDetailFragment, UserDetailFragment userDetailFragment2, UserDetailFragment userDetailFragment3, MUB mub, C53V c53v, AutoLaunchReelParams autoLaunchReelParams, UserDetailLaunchConfig userDetailLaunchConfig, C155396yS c155396yS, C155536yi c155536yi, JHJ jhj, C38U c38u, InterfaceC70493Ek interfaceC70493Ek, C53N c53n, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C155786z8 c155786z8 = new C155786z8();
        this.A0T = c155786z8;
        final C155796z9 c155796z9 = new C155796z9(this);
        this.A0f = c155796z9;
        this.A0G = ((Boolean) AbstractC15930qn.A02.A0J.invoke()).booleanValue() ? null : new ViewTreeObserver.OnPreDrawListener() { // from class: X.6zA
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                AnonymousClass715 anonymousClass715;
                UserDetailTabController userDetailTabController = (UserDetailTabController) C155796z9.this.A00.get();
                if (userDetailTabController != null && (anonymousClass715 = userDetailTabController.mViewHolder) != null) {
                    RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior = anonymousClass715.A0G;
                    float measuredHeight = anonymousClass715.A02.getMeasuredHeight();
                    refreshableAppBarLayoutBehavior.A02 = measuredHeight;
                    refreshableAppBarLayoutBehavior.A00 = measuredHeight * 1.2f;
                    return true;
                }
                return true;
            }
        };
        this.A07 = false;
        this.A0C = false;
        this.A0E = false;
        this.A0W = new Runnable() { // from class: X.6zB
            @Override // java.lang.Runnable
            public final void run() {
                UserDetailTabController userDetailTabController = UserDetailTabController.this;
                AnonymousClass715 anonymousClass715 = userDetailTabController.mViewHolder;
                if (anonymousClass715 != null) {
                    UserDetailTabController.A05(userDetailTabController, anonymousClass715.A0I.getCurrentItem(), false);
                }
            }
        };
        this.A0I = new InterfaceC155836zD() { // from class: X.6zC
            public int A00 = 0;

            @Override // X.InterfaceC155846zE
            public final void DWT(AppBarLayout appBarLayout, int i) {
                Integer num;
                UserDetailTabController userDetailTabController = UserDetailTabController.this;
                AnonymousClass715 anonymousClass715 = userDetailTabController.mViewHolder;
                if (anonymousClass715 != null) {
                    boolean z7 = userDetailTabController.A0A;
                    int A00 = C3HB.A00(anonymousClass715.A0H.getContext()) + userDetailTabController.mViewHolder.A0C.getMeasuredHeight();
                    if (!userDetailTabController.A0a) {
                        A00 = 0;
                    }
                    C14360o3.A0B(appBarLayout, 0);
                    int totalScrollRange = appBarLayout.getTotalScrollRange() - A00;
                    if (i == 0) {
                        num = C05F.A01;
                    } else if (Math.abs(i) >= totalScrollRange) {
                        num = C05F.A00;
                    } else {
                        num = C05F.A0C;
                    }
                    userDetailTabController.A04 = num;
                    boolean z8 = false;
                    if (num == C05F.A00) {
                        z8 = true;
                    }
                    userDetailTabController.A0A = z8;
                    if (z8 != z7) {
                        if (!z8) {
                            C155786z8 c155786z82 = userDetailTabController.A0T;
                            String A0C = userDetailTabController.A0C();
                            HashSet hashSet = c155786z82.A03;
                            hashSet.clear();
                            for (InterfaceC152846uE interfaceC152846uE : c155786z82.A04) {
                                if (!interfaceC152846uE.Bi9().equals(A0C)) {
                                    interfaceC152846uE.Dix(false);
                                }
                                hashSet.add(interfaceC152846uE.Bi9());
                            }
                        }
                        UserDetailTabController.A06(userDetailTabController, false);
                    }
                    if (i != 0) {
                        UserDetailFragment userDetailFragment4 = userDetailTabController.A03.A00;
                        UserDetailFragment.A0X(userDetailFragment4, AbstractC38971rW.A00(new Object[]{EnumC1564770s.A03}), Double.valueOf(C18U.A00(C06090Tz.A05, userDetailFragment4.A0I, 37169901110100481L)).longValue());
                    }
                    userDetailTabController.mViewHolder.A0F.setIgnoreAdapterUpdates(userDetailTabController.A0A);
                    int i2 = this.A00 - i;
                    this.A00 = i;
                    C155786z8 c155786z83 = userDetailTabController.A0T;
                    PushDynamicCoordinatorLayout pushDynamicCoordinatorLayout = userDetailTabController.mViewHolder.A0H;
                    Iterator it = c155786z83.A04.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC152846uE) it.next()).DXk(i2, pushDynamicCoordinatorLayout);
                    }
                }
            }
        };
        this.A0J = new C155856zF(this);
        this.A0L = userSession;
        this.A0V = interfaceC70493Ek;
        this.A0O = c155666yv;
        this.A0S = userDetailFragment2;
        c155666yv.A0Q = true;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0Z = C18U.A06(c06090Tz, userSession, 36322980805421883L) ? "profile_media_grid" : userDetailLaunchConfig.A0L;
        this.A0b = userDetailLaunchConfig.A0a;
        this.A0g = c53v;
        this.A0e = userDetailFragment3;
        this.A0U = c155536yi;
        this.A0h = z2;
        this.A0c = z3;
        this.A0H = fragmentActivity;
        this.A03 = c155776z6;
        this.A0D = jhj;
        this.A0a = z4;
        this.A0K = abstractC59962oe;
        this.A0Y = userDetailLaunchConfig.A0O;
        this.A0X = userDetailLaunchConfig.A0A;
        this.A0C = z5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        EnumC125765mR enumC125765mR = EnumC125765mR.A09;
        if (z5) {
            arrayList2.add(enumC125765mR);
        } else {
            arrayList.add(enumC125765mR);
        }
        arrayList.add(EnumC125765mR.A0B);
        if (AbstractC154746xP.A00(userSession)) {
            arrayList.add(EnumC125765mR.A0C);
        }
        arrayList.add(EnumC125765mR.A08);
        arrayList.add(EnumC125765mR.A0A);
        this.A09 = C33L.A01(userSession);
        boolean A03 = AbstractC82073lT.A03(userSession);
        C14360o3.A0B(userSession, 0);
        this.A07 = C18U.A06(c06090Tz, userSession, 36321043773989976L);
        C155876zH c155876zH = new C155876zH(abstractC10360h2, A03);
        this.A0N = c155876zH;
        c155876zH.A01 = userDetailLaunchConfig.A0V;
        ?? obj = new Object();
        this.A0d = obj;
        C155896zJ c155896zJ = new C155896zJ(fragmentActivity.getResources(), fragmentActivity, abstractC59962oe, interfaceC11380iw, userSession, c155376yQ, interfaceC60442pS, userDetailFragment, this, c38u, arrayList, z);
        this.A0P = c155896zJ;
        if (this.A0C) {
            this.A02 = new C42749Ivn(fragmentActivity.getResources(), fragmentActivity, abstractC59962oe, interfaceC11380iw, userSession, interfaceC60442pS, userDetailFragment, this, c155396yS, c38u, arrayList2, z);
        }
        this.A0Q = new C155996zT(new C70783Fq(), c155766z5, c684436h, interfaceC11380iw, c673932e, interfaceC60442pS, c53q, c38n, c155406yT, this.A02, c155896zJ, c33616EtS, obj, userDetailFragment, c155786z8, this.A0D, c38u, c53n, new HashSet(), new HashSet(), new HashSet());
        this.A0R = new C156006zU(fragmentActivity, c07x, userSession, mub, autoLaunchReelParams, userDetailLaunchConfig, str, z, z6);
        this.A0M = new C156066za(this, z);
    }
}
