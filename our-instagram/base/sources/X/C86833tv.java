package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.3tv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86833tv {
    public static final C86833tv A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r6, 36325832662267308L) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (A0A(r6, r8, false) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:
    
        return X.EnumC86843tw.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
    
        if (A09(r6, r8, r9) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0067, code lost:
    
        if (r7 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0079, code lost:
    
        if (r7 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC86843tw A00(com.instagram.common.session.UserSession r6, X.C38321qM r7, java.lang.String r8, boolean r9) {
        /*
            r5 = 1
            X.C14360o3.A0B(r6, r5)
            r0 = 2
            X.C14360o3.A0B(r8, r0)
            r1 = 0
            if (r7 == 0) goto L78
            X.1rF r0 = r7.A0C
            X.1sb r0 = r0.getInjected()
            if (r0 == 0) goto L78
            X.3wT r0 = r0.BFe()
            if (r0 == 0) goto L78
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r2 = r0.BFM()
        L1d:
            X.1rF r0 = r7.A0C
            X.1sb r0 = r0.getInjected()
            if (r0 == 0) goto L2f
            X.4ny r0 = r0.BFf()
            if (r0 == 0) goto L2f
            com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum r1 = r0.B80()
        L2f:
            com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum r0 = com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum.A07
            r3 = 0
            if (r1 != r0) goto L67
            if (r7 == 0) goto Lc9
            X.1qM r0 = r7.A1d()
            boolean r0 = r0.Cff()
            if (r0 != r5) goto L69
            X.0Tz r4 = X.C06090Tz.A06
            r0 = 36325832662267308(0x810e27000135ac, double:3.0359410757807823E-306)
            boolean r0 = X.C18U.A06(r4, r6, r0)
            if (r0 == 0) goto L69
        L4d:
            r1 = 1
        L4e:
            boolean r0 = r7.CdW()
            if (r0 == 0) goto Lc9
            if (r1 == 0) goto Lc9
            java.lang.String r0 = "feed_contextual_ads_chain"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto Lc6
            boolean r0 = A05(r6, r7)
            if (r0 == 0) goto L7c
            X.3tw r0 = X.EnumC86843tw.A07
            return r0
        L67:
            if (r7 == 0) goto Lc9
        L69:
            boolean r0 = r7.Cff()
            if (r0 != r5) goto L76
            boolean r0 = r7.A5Q()
            if (r0 != 0) goto L76
            goto L4d
        L76:
            r1 = 0
            goto L4e
        L78:
            r2 = r1
            if (r7 == 0) goto L2f
            goto L1d
        L7c:
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r0 = com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum.A07
            if (r2 != r0) goto L83
            X.3tw r0 = X.EnumC86843tw.A06
            return r0
        L83:
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r0 = com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum.A09
            if (r2 != r0) goto L8a
            X.3tw r0 = X.EnumC86843tw.A09
            return r0
        L8a:
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r0 = com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum.A0A
            if (r2 != r0) goto L91
            X.3tw r0 = X.EnumC86843tw.A08
            return r0
        L91:
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r0 = com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum.A06
            if (r2 != r0) goto L9e
            boolean r0 = A0A(r6, r8, r3)
            if (r0 == 0) goto Lb0
        L9b:
            X.3tw r0 = X.EnumC86843tw.A02
            return r0
        L9e:
            boolean r0 = A06(r6, r7)
            if (r0 == 0) goto Lb3
            boolean r0 = A0A(r6, r8, r9)
            if (r0 != 0) goto L9b
            boolean r0 = A09(r6, r8, r9)
            if (r0 == 0) goto Lc3
        Lb0:
            X.3tw r0 = X.EnumC86843tw.A04
            return r0
        Lb3:
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r0 = com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum.A05
            if (r2 == r0) goto Lc3
            boolean r0 = r7.A6I()
            if (r0 == 0) goto Lc6
            r7.A6I()
            X.3tw r0 = X.EnumC86843tw.A03
            return r0
        Lc3:
            X.3tw r0 = X.EnumC86843tw.A03
            return r0
        Lc6:
            X.3tw r0 = X.EnumC86843tw.A05
            return r0
        Lc9:
            X.3tw r0 = X.EnumC86843tw.A0B
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86833tv.A00(com.instagram.common.session.UserSession, X.1qM, java.lang.String, boolean):X.3tw");
    }

    public static final IAR A01(Context context, UserSession userSession, C96444Vc c96444Vc, C39B c39b, Integer num, boolean z, boolean z2) {
        Object c29412Cxj;
        Object c29411Cxi;
        Float Aoy;
        int i;
        int max;
        float f;
        String BRh;
        Boolean ARh;
        if (c96444Vc != null && context != null) {
            int A01 = (int) ((AbstractC13890nF.A01(context) / c96444Vc.A01) * c96444Vc.A00);
            int A09 = AbstractC13880nE.A09(context);
            int ordinal = c39b.ordinal();
            switch (ordinal) {
                case 2:
                case 7:
                    c29412Cxj = new C29414Cxl(userSession);
                    break;
                case 3:
                case 4:
                case 5:
                    if (z) {
                        c29411Cxi = new C29409Cxg(userSession);
                    } else {
                        c29411Cxi = new C29411Cxi(userSession, c39b);
                    }
                    c29412Cxj = (InterfaceC31153Dmx) c29411Cxi;
                    break;
                case 6:
                    c29412Cxj = new Object();
                    break;
                case 8:
                    c29412Cxj = new C29413Cxk(userSession);
                    break;
                case 9:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                default:
                    c29412Cxj = new Object();
                    break;
                case 10:
                    c29412Cxj = new C29410Cxh(userSession, c96444Vc);
                    break;
                case 11:
                    c29412Cxj = new C29412Cxj(userSession, c96444Vc);
                    break;
                case 14:
                case Process.SIGTERM /* 15 */:
                    c29412Cxj = new Object();
                    break;
            }
            InterfaceC31079DlM interfaceC31079DlM = (InterfaceC31079DlM) c29412Cxj;
            Float BPu = interfaceC31079DlM.BPu();
            if (BPu != null) {
                float f2 = A09;
                if ((A01 / f2 <= BPu.floatValue() || z) && (Aoy = interfaceC31079DlM.Aoy()) != null) {
                    float floatValue = Aoy.floatValue();
                    Boolean Ap0 = interfaceC31079DlM.Ap0();
                    if (Ap0 != null) {
                        boolean booleanValue = Ap0.booleanValue();
                        Boolean Aoz = interfaceC31079DlM.Aoz();
                        if (Aoz != null) {
                            boolean booleanValue2 = Aoz.booleanValue();
                            Boolean BDd = interfaceC31079DlM.BDd();
                            if (BDd != null) {
                                boolean booleanValue3 = BDd.booleanValue();
                                Boolean BDe = interfaceC31079DlM.BDe();
                                if (BDe != null) {
                                    boolean booleanValue4 = BDe.booleanValue();
                                    int A0G = AbstractC53242c7.A0G(context, R.attr.bottomSheetTopCornerRadius);
                                    int i2 = A09 - A01;
                                    int BTo = (int) (interfaceC31079DlM.BTo() * f2);
                                    if (z2) {
                                        i = AbstractC13880nE.A0B(context);
                                    } else {
                                        i = 0;
                                    }
                                    if (interfaceC31079DlM.CUw()) {
                                        max = (int) (interfaceC31079DlM.B6t() * f2);
                                    } else {
                                        max = A0G + Math.max(i2, BTo);
                                    }
                                    int i3 = max + i;
                                    if (!z) {
                                        f = i3 / f2;
                                    } else if (interfaceC31079DlM.CUx()) {
                                        f = interfaceC31079DlM.B6u();
                                    } else {
                                        f = floatValue;
                                    }
                                    boolean BOT = interfaceC31079DlM.BOT();
                                    String BRi = interfaceC31079DlM.BRi();
                                    if (BRi != null && (BRh = interfaceC31079DlM.BRh()) != null && (ARh = interfaceC31079DlM.ARh()) != null) {
                                        boolean booleanValue5 = ARh.booleanValue();
                                        boolean CY7 = interfaceC31079DlM.CY7();
                                        String ADB = interfaceC31079DlM.ADB();
                                        boolean CeF = interfaceC31079DlM.CeF();
                                        boolean APO = interfaceC31079DlM.APO();
                                        boolean CZR = interfaceC31079DlM.CZR();
                                        boolean Cfo = interfaceC31079DlM.Cfo();
                                        String AEJ = interfaceC31079DlM.AEJ();
                                        double dragUpReleaseRatio = interfaceC31079DlM.getDragUpReleaseRatio();
                                        double swipeUpDistanceAdjustment = interfaceC31079DlM.getSwipeUpDistanceAdjustment();
                                        float swipeUpFlingVelocity = interfaceC31079DlM.getSwipeUpFlingVelocity();
                                        double swipeDownDistanceAdjustment = interfaceC31079DlM.getSwipeDownDistanceAdjustment();
                                        float swipeDownFlingVelocity = interfaceC31079DlM.getSwipeDownFlingVelocity();
                                        boolean APV = interfaceC31079DlM.APV();
                                        boolean Cte = interfaceC31079DlM.Cte();
                                        boolean EF2 = interfaceC31079DlM.EF2();
                                        Integer num2 = C05F.A00;
                                        if (num == num2) {
                                            if (ordinal == 4 || ordinal == 5) {
                                                num2 = C05F.A01;
                                            }
                                            boolean ARl = interfaceC31079DlM.ARl();
                                            interfaceC31079DlM.CUw();
                                            return new C72309Xb6(interfaceC31079DlM.backPressDestination(), c39b, num2, ADB, AEJ, BRi, BRh, interfaceC31079DlM.getDragUpReleaseRatio(), swipeUpDistanceAdjustment, swipeDownDistanceAdjustment, f, floatValue, swipeUpFlingVelocity, swipeDownFlingVelocity, A01, i3, ARl, booleanValue, APO, BOT, CZR, Cfo, interfaceC31079DlM.ARV(), interfaceC31079DlM.ARg(), interfaceC31079DlM.CMq(), interfaceC31079DlM.Epx(), interfaceC31079DlM.ARr(), interfaceC31079DlM.EjV(), z, interfaceC31079DlM.ABE(), APV, EF2, Cte);
                                        }
                                        return new C39447HbZ(interfaceC31079DlM.backPressDestination(), ADB, AEJ, BRi, BRh, dragUpReleaseRatio, f, floatValue, A01, i3, booleanValue, BOT, CZR, Cfo, interfaceC31079DlM.CUw(), booleanValue2, booleanValue3, booleanValue4, booleanValue5, CY7, CeF);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (A09(r13, r15.getModuleName(), true) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        if (A0A(r13, r5, false) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        r4 = X.C05F.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c9, code lost:
    
        if (A09(r13, r5, true) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.IAR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.IAR A02(android.content.Context r12, com.instagram.common.session.UserSession r13, X.C38321qM r14, X.InterfaceC60442pS r15, X.C39B r16, java.lang.Integer r17) {
        /*
            r11 = 0
            r1 = 1
            r0 = 2
            X.C14360o3.A0B(r15, r0)
            r0 = 6
            r8 = r16
            X.C14360o3.A0B(r8, r0)
            boolean r0 = r14.CdW()
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            java.lang.String r0 = r15.getModuleName()
            r6 = r13
            X.3tw r2 = A00(r13, r14, r0, r11)
            X.1rF r0 = r14.A0C
            X.1sb r0 = r0.getInjected()
            if (r0 == 0) goto L64
            X.3wT r0 = r0.BFe()
            if (r0 == 0) goto L64
            java.lang.Boolean r3 = r0.CeE()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r10 = X.C14360o3.A0K(r3, r0)
        L37:
            boolean r0 = r14.A5Q()
            if (r0 == 0) goto L5f
            X.1qM r0 = r14.A1d()
            X.4Vc r7 = r0.A1U()
        L45:
            X.3tw r0 = X.EnumC86843tw.A06
            r9 = r17
            if (r2 == r0) goto L57
            X.3tw r0 = X.EnumC86843tw.A09
            if (r2 == r0) goto L57
            X.3tw r0 = X.EnumC86843tw.A08
            if (r2 == r0) goto L57
            X.3tw r0 = X.EnumC86843tw.A07
            if (r2 != r0) goto L66
        L57:
            r5 = r12
            X.IAR r0 = A01(r5, r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto L66
            return r0
        L5f:
            X.4Vc r7 = r14.A1U()
            goto L45
        L64:
            r10 = 0
            goto L37
        L66:
            X.3tw r0 = X.EnumC86843tw.A02
            if (r2 == r0) goto Ldc
            X.3tw r0 = X.EnumC86843tw.A04
            if (r2 == r0) goto L88
            boolean r0 = A06(r13, r14)
            if (r0 == 0) goto Ld0
            java.lang.String r0 = r15.getModuleName()
            boolean r0 = A0A(r13, r0, r1)
            if (r0 != 0) goto Ldc
            java.lang.String r0 = r15.getModuleName()
            boolean r0 = A09(r13, r0, r1)
            if (r0 == 0) goto Ld0
        L88:
            X.39B r3 = X.C39B.A0H
        L8a:
            java.lang.Integer r4 = X.C05F.A00
            if (r9 != r4) goto Ldf
            java.lang.String r5 = r15.getModuleName()
            X.C14360o3.A0B(r5, r1)
            X.1rF r0 = r14.A0C
            X.1sb r0 = r0.getInjected()
            if (r0 == 0) goto Lce
            X.3wT r0 = r0.BFe()
            if (r0 == 0) goto Lce
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r2 = r0.BFM()
        La7:
            com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum r0 = com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum.A06
            if (r2 != r0) goto Lb9
            boolean r0 = A0A(r13, r5, r11)
            if (r0 == 0) goto Lcb
        Lb1:
            java.lang.Integer r4 = X.C05F.A0C
        Lb3:
            X.Hba r0 = new X.Hba
            r0.<init>(r3, r4)
            return r0
        Lb9:
            boolean r0 = A06(r13, r14)
            if (r0 == 0) goto Lb3
            boolean r0 = A0A(r13, r5, r1)
            if (r0 != 0) goto Lb1
            boolean r0 = A09(r13, r5, r1)
            if (r0 == 0) goto Lb3
        Lcb:
            java.lang.Integer r4 = X.C05F.A01
            goto Lb3
        Lce:
            r2 = 0
            goto La7
        Ld0:
            boolean r0 = r14.A6I()
            if (r0 == 0) goto Ld9
            X.39B r3 = X.C39B.A0E
            goto L8a
        Ld9:
            X.39B r3 = X.C39B.A0D
            goto L8a
        Ldc:
            X.39B r3 = X.C39B.A0B
            goto L8a
        Ldf:
            X.IAR r0 = new X.IAR
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86833tv.A02(android.content.Context, com.instagram.common.session.UserSession, X.1qM, X.2pS, X.39B, java.lang.Integer):X.IAR");
    }

    public static final void A03(Activity activity, int i) {
        Fragment fragment;
        BrowserLiteFragment browserLiteFragment;
        VD2 vd2;
        BottomSheetFragment bottomSheetFragment;
        C14360o3.A0B(activity, 1);
        C3DN A002 = C3DN.A00.A00(activity);
        Fragment fragment2 = null;
        if (A002 != null) {
            fragment = A002.A09();
        } else {
            fragment = null;
        }
        if ((fragment instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment) != null) {
            fragment2 = bottomSheetFragment.A0M();
        }
        if ((fragment2 instanceof BrowserLiteFragment) && (browserLiteFragment = (BrowserLiteFragment) fragment2) != null) {
            if (i != 2) {
                if (i != 3) {
                    vd2 = VD2.A05;
                } else {
                    vd2 = VD2.A04;
                }
            } else {
                vd2 = VD2.A02;
            }
            browserLiteFragment.FD0(vd2, C05F.A1I);
        }
    }

    public static final boolean A05(UserSession userSession, C38321qM c38321qM) {
        if (C14360o3.A0K(Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession, 36329144082055201L)), true) && AbstractC75103Za.A0T((AndroidLink) AbstractC001800i.A0O(c38321qM.A3Y(), 0)) && !c38321qM.A5e()) {
            return true;
        }
        return false;
    }

    public static final boolean A07(UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        C06090Tz c06090Tz;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(userSession, 3);
        if (c38321qM != null && c38321qM.CdW() && c38321qM.A6W(IGPostTriggerExperience.A07) && str.equals("feed_contextual_chain")) {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            boolean A06 = C18U.A06(c06090Tz, userSession, 36321937127188382L);
            C14360o3.A0A(Boolean.valueOf(A06));
            return A06;
        }
        return false;
    }

    public static final boolean A08(UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        if (c38321qM == null || !c38321qM.CdW()) {
            return false;
        }
        switch (A00(userSession, c38321qM, str, z).ordinal()) {
            case 0:
            case 9:
                return false;
            default:
                return true;
        }
    }

    public static final boolean A09(UserSession userSession, String str, boolean z) {
        C06090Tz c06090Tz;
        C14360o3.A0B(str, 1);
        if (!str.equals("feed_timeline")) {
            return false;
        }
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        boolean A06 = C18U.A06(c06090Tz, userSession, 36321937126860699L);
        C14360o3.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public static final boolean A0A(UserSession userSession, String str, boolean z) {
        C06090Tz c06090Tz;
        C14360o3.A0B(str, 1);
        if (!str.equals("feed_timeline")) {
            return false;
        }
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        boolean A06 = C18U.A06(c06090Tz, userSession, 36321937126926236L);
        C14360o3.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public final IAR A0B(Context context, UserSession userSession, C38321qM c38321qM, C39B c39b) {
        C96444Vc c96444Vc;
        C14360o3.A0B(c38321qM, 0);
        if (!c38321qM.CdW()) {
            return null;
        }
        if (c38321qM.Cff()) {
            c96444Vc = c38321qM.A1U();
        } else {
            c96444Vc = new C96444Vc(c38321qM.A0z(), c38321qM.A0y());
        }
        return A01(context, userSession, c96444Vc, c39b, C05F.A00, false, true);
    }

    public static final void A04(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C130935vh c130935vh, String str, String str2) {
        String A0i = AnonymousClass001.A0i(AbstractC111324zv.A00(764), str, str2, '_');
        C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, "gesture");
        A04.A0G(userSession, c38321qM);
        A04.A7A = "bottom_sheet";
        A04.A4y = "watch_browse";
        A04.A7T = A0i;
        if (c130935vh != null) {
            A04.A12 = c130935vh;
        }
        C32U.A0H(userSession, A04, interfaceC60442pS);
    }

    public static final boolean A06(UserSession userSession, C38321qM c38321qM) {
        if (c38321qM.A6W(IGPostTriggerExperience.A07)) {
            if (C18U.A06(C06090Tz.A06, userSession, 36321937126991773L) || c38321qM.A6I()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
