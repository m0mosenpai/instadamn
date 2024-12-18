package X;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8AC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8AC implements C8AD {
    public C183688Ct A00;
    public CaptureRuleSystemState A01;
    public final Fragment A02;
    public final C8B7 A03;
    public final C8BB A04;
    public final InterfaceC09390do A05;
    public final UserSession A06;
    public final List A07;
    public final Map A08;

    public C8AC(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C8B7 c8b7;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(fragment, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A06 = userSession;
        this.A02 = fragment;
        this.A07 = AbstractC16960so.A1N(C8AE.A0Y, C8AE.A0Z, C8AE.A0i, C8AE.A0M, C8AE.A0f, C8AE.A0J, C8AE.A06, C8AE.A0P, C8AE.A0B, C8AE.A0p, C8AE.A0V, C8AE.A0H, C8AE.A0l, C8AE.A0L, C8AE.A09, C8AE.A0I);
        if (C8B6.A00(userSession).booleanValue()) {
            c8b7 = AbstractC173047nI.A00(userSession);
        } else {
            c8b7 = null;
        }
        this.A03 = c8b7;
        this.A08 = new HashMap();
        this.A01 = new CaptureRuleSystemState(null, C8B9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        this.A05 = AbstractC09440dt.A01(new C9E4(this, 43));
        this.A04 = new C8BB(interfaceC11380iw, userSession);
    }

    private final void A01() {
        this.A01 = new CaptureRuleSystemState(null, C8B9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        A03(this);
    }

    @Override // X.C8AD
    public final boolean CcJ(C8AG c8ag) {
        C14360o3.A0B(c8ag, 0);
        return c8ag.CcK(this.A01);
    }

    @Override // X.C8AD
    public final void Doe(Drawable drawable) {
        C220979pL c220979pL;
        PromptStickerModel promptStickerModel;
        C8P7 c8p7;
        PromptStickerModel promptStickerModel2;
        C220979pL c220979pL2;
        PromptStickerModel promptStickerModel3;
        C8P7 c8p72;
        PromptStickerModel promptStickerModel4;
        PromptStickerModel promptStickerModel5;
        C220989pM c220989pM;
        PromptStickerModel promptStickerModel6;
        C220999pN c220999pN;
        PromptStickerModel promptStickerModel7;
        C194808jg c194808jg;
        C14360o3.A0B(drawable, 0);
        if (AbstractC101614hW.A09(drawable) != null) {
            this.A01.A0T = true;
        } else if (AbstractC209239Nf.A00(drawable)) {
            this.A01.A0f = true;
        } else {
            boolean z = drawable instanceof C194808jg;
            if (z) {
                C194808jg c194808jg2 = (C194808jg) drawable;
                Drawable A04 = c194808jg2.A04();
                C14360o3.A07(A04);
                if (A04 instanceof C202458xP) {
                    this.A01.A0H = true;
                } else if (c194808jg2.A04() instanceof C202388xI) {
                    this.A01.A0Z = true;
                } else if (c194808jg2.A04() instanceof InterfaceC202608xe) {
                    A02(drawable, true);
                }
            }
            if ((drawable instanceof C220919pF) && !((C220919pF) drawable).A02) {
                this.A01.A0F = true;
            } else if (drawable instanceof AbstractC130215uR) {
                this.A01.A0j = true;
            } else if (z && (c194808jg = (C194808jg) drawable) != null && (c194808jg.A04() instanceof C133115zd)) {
                this.A01.A0P = true;
            } else {
                Drawable drawable2 = drawable;
                if (z) {
                    drawable2 = ((C194808jg) drawable2).A04();
                }
                if (drawable2 instanceof C220949pI) {
                    this.A01.A0J = true;
                } else if (drawable instanceof C221179pf) {
                    this.A01.A0c = true;
                } else if ((drawable instanceof C220999pN) && (c220999pN = (C220999pN) drawable) != null && (promptStickerModel7 = c220999pN.A04) != null && promptStickerModel7.A0B) {
                    this.A01.A0M = true;
                } else if ((drawable instanceof C220989pM) && (c220989pM = (C220989pM) drawable) != null && (promptStickerModel6 = c220989pM.A03) != null && promptStickerModel6.A0A) {
                    this.A01.A0N = true;
                } else {
                    if (drawable instanceof C221009pO) {
                        StoryPromptType storyPromptType = null;
                        C221009pO c221009pO = (C221009pO) drawable;
                        if (c221009pO != null && (promptStickerModel5 = c221009pO.A06) != null) {
                            if (!promptStickerModel5.A0G()) {
                                storyPromptType = promptStickerModel5.A03();
                            }
                        }
                        if (storyPromptType != StoryPromptType.A06) {
                            this.A01.A0b = true;
                        }
                    }
                    if (drawable instanceof C220809p4) {
                        this.A01.A09 = true;
                    } else {
                        boolean z2 = drawable instanceof C8P7;
                        if (!z2 || ((c8p72 = (C8P7) drawable) != null && (promptStickerModel4 = c8p72.A0B) != null && (promptStickerModel4.A0G() || promptStickerModel4.A0C))) {
                            if (z) {
                                C194808jg c194808jg3 = (C194808jg) drawable;
                                if (c194808jg3.A03 instanceof C217839kG) {
                                    this.A01.A02++;
                                } else if (c194808jg3.A04() instanceof C9SL) {
                                    this.A01.A0E = true;
                                }
                            }
                            Drawable drawable3 = drawable;
                            if (z) {
                                drawable3 = ((C194808jg) drawable3).A04();
                            }
                            if (drawable3 instanceof C220979pL) {
                                Drawable drawable4 = drawable;
                                if (z) {
                                    drawable4 = ((C194808jg) drawable4).A04();
                                }
                                if (!(drawable4 instanceof C220979pL) || (c220979pL2 = (C220979pL) drawable4) == null || (promptStickerModel3 = c220979pL2.A04) == null || !promptStickerModel3.A0F()) {
                                    this.A01.A0R = true;
                                }
                            }
                            boolean z3 = true;
                            if (z2 && (c8p7 = (C8P7) drawable) != null && (promptStickerModel2 = c8p7.A0B) != null && promptStickerModel2.A0C) {
                                this.A01.A0O = true;
                            } else {
                                Drawable drawable5 = drawable;
                                if (z) {
                                    drawable5 = ((C194808jg) drawable5).A04();
                                }
                                if ((drawable5 instanceof C220979pL) && (c220979pL = (C220979pL) drawable5) != null && (promptStickerModel = c220979pL.A04) != null && promptStickerModel.A0F()) {
                                    this.A01.A07 = true;
                                } else if (AbstractC209309No.A00(drawable)) {
                                    this.A01.A0G = true;
                                } else if ((drawable instanceof C220969pK) || (z && (((C194808jg) drawable).A04() instanceof C220959pJ))) {
                                    this.A01.A0W = true;
                                } else if (drawable instanceof C194778jd) {
                                    this.A01.A0e = true;
                                } else if (drawable instanceof C194788je) {
                                    CaptureRuleSystemState captureRuleSystemState = this.A01;
                                    captureRuleSystemState.A0V = true;
                                    C194788je c194788je = (C194788je) drawable;
                                    if (c194788je != null) {
                                        String str = c194788je.A01.A02;
                                        if (str != null && str.length() != 0) {
                                            z3 = false;
                                        }
                                        captureRuleSystemState.A0U = z3;
                                    }
                                } else if (AbstractC209309No.A02(drawable)) {
                                    this.A01.A01++;
                                }
                            }
                        } else {
                            this.A01.A0i = true;
                        }
                    }
                }
            }
        }
        A03(this);
    }

    @Override // X.C8AD
    public final void Dol(Drawable drawable) {
        C8P7 c8p7;
        PromptStickerModel promptStickerModel;
        PromptStickerModel promptStickerModel2;
        C220999pN c220999pN;
        PromptStickerModel promptStickerModel3;
        C220989pM c220989pM;
        PromptStickerModel promptStickerModel4;
        C194808jg c194808jg;
        C14360o3.A0B(drawable, 0);
        if (AbstractC101614hW.A09(drawable) != null) {
            CaptureRuleSystemState captureRuleSystemState = this.A01;
            captureRuleSystemState.A0T = false;
            captureRuleSystemState.A0p = false;
        } else if (AbstractC209239Nf.A00(drawable)) {
            this.A01.A0f = false;
        } else {
            boolean z = drawable instanceof C194808jg;
            if (z && (((C194808jg) drawable).A04() instanceof C202388xI)) {
                this.A01.A0Z = false;
            } else if (z && (((C194808jg) drawable).A04() instanceof InterfaceC202608xe)) {
                A02(drawable, false);
            } else if ((drawable instanceof C220919pF) && !((C220919pF) drawable).A02) {
                this.A01.A0F = false;
            } else if (drawable instanceof AbstractC130215uR) {
                this.A01.A0j = false;
            } else if (z && (c194808jg = (C194808jg) drawable) != null && (c194808jg.A04() instanceof C133115zd)) {
                this.A01.A0P = false;
            } else {
                Drawable drawable2 = drawable;
                if (z) {
                    drawable2 = ((C194808jg) drawable2).A04();
                }
                if (drawable2 instanceof C220949pI) {
                    this.A01.A0J = false;
                } else if (drawable instanceof C221179pf) {
                    this.A01.A0c = false;
                } else if ((drawable instanceof C220989pM) && (c220989pM = (C220989pM) drawable) != null && (promptStickerModel4 = c220989pM.A03) != null && promptStickerModel4.A0A) {
                    this.A01.A0N = false;
                } else if ((drawable instanceof C220999pN) && (c220999pN = (C220999pN) drawable) != null && (promptStickerModel3 = c220999pN.A04) != null && promptStickerModel3.A0B) {
                    this.A01.A0M = false;
                } else {
                    if (drawable instanceof C221009pO) {
                        StoryPromptType storyPromptType = null;
                        C221009pO c221009pO = (C221009pO) drawable;
                        if (c221009pO != null && (promptStickerModel2 = c221009pO.A06) != null) {
                            if (!promptStickerModel2.A0G()) {
                                storyPromptType = promptStickerModel2.A03();
                            }
                        }
                        if (storyPromptType != StoryPromptType.A06) {
                            this.A01.A0b = false;
                        }
                    }
                    if (drawable instanceof C220809p4) {
                        this.A01.A09 = false;
                    } else if (!(drawable instanceof C8P7) || ((c8p7 = (C8P7) drawable) != null && (promptStickerModel = c8p7.A0B) != null && promptStickerModel.A0G())) {
                        if (z) {
                            C194808jg c194808jg2 = (C194808jg) drawable;
                            if (c194808jg2.A03 instanceof C217839kG) {
                                CaptureRuleSystemState captureRuleSystemState2 = this.A01;
                                captureRuleSystemState2.A02--;
                            } else if (c194808jg2.A04() instanceof C9SL) {
                                this.A01.A0E = false;
                            }
                        }
                        Drawable drawable3 = drawable;
                        if (z) {
                            drawable3 = ((C194808jg) drawable3).A04();
                        }
                        if (drawable3 instanceof C220979pL) {
                            this.A01.A0R = false;
                        } else if (AbstractC209309No.A00(drawable)) {
                            this.A01.A0G = false;
                        } else if ((drawable instanceof C220969pK) || (z && (((C194808jg) drawable).A04() instanceof C220959pJ))) {
                            this.A01.A0W = false;
                        } else if (drawable instanceof C194778jd) {
                            this.A01.A0e = false;
                        } else if (drawable instanceof C194788je) {
                            CaptureRuleSystemState captureRuleSystemState3 = this.A01;
                            captureRuleSystemState3.A0V = false;
                            captureRuleSystemState3.A0U = false;
                        } else if (AbstractC209309No.A02(drawable)) {
                            CaptureRuleSystemState captureRuleSystemState4 = this.A01;
                            captureRuleSystemState4.A01--;
                        }
                    } else {
                        this.A01.A0i = false;
                    }
                }
            }
        }
        A03(this);
    }

    private final void A00() {
        C8BB c8bb;
        EnumC199338ra enumC199338ra;
        UserSession userSession = this.A06;
        if (!AbstractC172137li.A04(userSession)) {
            c8bb = this.A04;
            enumC199338ra = EnumC199338ra.A0F;
        } else {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36319132514196484L);
            c8bb = this.A04;
            if (!A06) {
                enumC199338ra = EnumC199338ra.A0G;
            } else {
                c8bb.A00(EnumC199338ra.A0E);
                C206899Du c206899Du = new C206899Du(this, 21);
                C206899Du c206899Du2 = new C206899Du(this, 22);
                C40701ud A01 = AbstractC40691uc.A01(userSession);
                C2JM c2jm = new C2JM();
                C2JM c2jm2 = new C2JM();
                String str = userSession.userId;
                c2jm.A04("igid", str);
                boolean z = false;
                if (str != null) {
                    z = true;
                }
                C18C.A0E(z);
                C2JQ c2jq = PandoGraphQLRequest.Companion;
                C1Dk freshCacheAgeMs = new PandoGraphQLRequest(AbstractC40511uK.A00(), "BrandedContentXPostingDestinationFBPageEligibilityQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C60283Qwv.class, false, null, 0, null, AbstractC111324zv.A00(4454), new ArrayList()).setMaxToleratedCacheAgeMs(86400000L).setFreshCacheAgeMs(0L);
                A01.ATV(new C23353AXc(c206899Du2), new C64015Sxm(c206899Du), freshCacheAgeMs);
                return;
            }
        }
        c8bb.A00(enumC199338ra);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02(android.graphics.drawable.Drawable r6, boolean r7) {
        /*
            r5 = this;
            X.8jg r6 = (X.C194808jg) r6
            android.graphics.drawable.Drawable r4 = r6.A04()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.MediaStickerDrawableIntf"
            X.C14360o3.A0C(r4, r0)
            X.8xe r4 = (X.InterfaceC202608xe) r4
            com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState r3 = r5.A01
            r3.A0S = r7
            com.instagram.model.mediatype.ProductType r2 = r4.BhP()
            if (r2 == 0) goto L32
            int r1 = r2.ordinal()
            r0 = 2
            if (r1 == r0) goto L2f
            r0 = 13
            if (r1 != r0) goto L32
            r3.A0k = r7
        L24:
            X.3YU r1 = r4.BS7()
            X.3YU r0 = X.C3YU.A04
            if (r1 != r0) goto L2e
            r3.A08 = r7
        L2e:
            return
        L2f:
            r3.A0K = r7
            goto L24
        L32:
            r3.A0I = r7
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.UPCOMING_EVENT
            if (r2 != r0) goto L24
            r3.A0j = r7
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8AC.A02(android.graphics.drawable.Drawable, boolean):void");
    }

    public static final void A03(C8AC c8ac) {
        int A01;
        C8AG c8ag;
        C173617oD c173617oD;
        if (C8B6.A00(c8ac.A06).booleanValue()) {
            A01 = AbstractC173097nN.A01("story_v2");
            java.util.Set A00 = AbstractC226739zV.A00(c8ac.A01);
            C8B7 c8b7 = c8ac.A03;
            if (c8b7 != null) {
                c173617oD = (C173617oD) c8b7.A07.getValue();
            } else {
                c173617oD = null;
            }
            if (c173617oD != null) {
                EnumC173197nX enumC173197nX = EnumC173197nX.IG;
                EnumC173527o4 enumC173527o4 = EnumC173527o4.STORY;
                List singletonList = Collections.singletonList(enumC173527o4);
                C14360o3.A07(singletonList);
                List singletonList2 = Collections.singletonList(c8ac.A01.A04);
                C14360o3.A07(singletonList2);
                C23009ACj c23009ACj = new C23009ACj(enumC173197nX, singletonList, singletonList2);
                EnumC173197nX enumC173197nX2 = EnumC173197nX.FB;
                List singletonList3 = Collections.singletonList(enumC173527o4);
                C14360o3.A07(singletonList3);
                List singletonList4 = Collections.singletonList(c8ac.A01.A04);
                C14360o3.A07(singletonList4);
                List A012 = ALn.A01(c23009ACj, new C23009ACj(enumC173197nX2, singletonList3, singletonList4), c173617oD, A00);
                C183688Ct c183688Ct = c8ac.A00;
                if (c183688Ct != null) {
                    c183688Ct.A0o(A012);
                }
            } else {
                C0K8.A0C("CaptureRuleSystem", "(checkXpostContentCompatibility) config==null");
                C183688Ct c183688Ct2 = c8ac.A00;
                if (c183688Ct2 != null) {
                    c183688Ct2.A0o(null);
                }
            }
        } else {
            A01 = AbstractC173097nN.A01("story_v0");
            for (C8AG c8ag2 : c8ac.A07) {
                List list = (List) c8ac.A08.get(c8ag2);
                if (list != null && !list.isEmpty()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C183688Ct c183688Ct3 = (C183688Ct) list.get(i);
                        boolean CcJ = c8ac.CcJ(c8ag2);
                        if (!(c183688Ct3.A0x.A08.A00 instanceof C81V) && (c8ag2 == (c8ag = C8AE.A0Y) || c8ag2 == C8AE.A05 || c8ag2 == C8AE.A0i || c8ag2 == C8AE.A0M || c8ag2 == C8AE.A0f || c8ag2 == C8AE.A06 || c8ag2 == C8AE.A0P || c8ag2 == C8AE.A0B || c8ag2 == C8AE.A0j || c8ag2 == C8AE.A0n || c8ag2 == C8AE.A0k || c8ag2 == C8AE.A0b)) {
                            UserSession userSession = c183688Ct3.A0w;
                            C131995xZ A002 = C196068lw.A00(userSession).A00(C183688Ct.A2B);
                            C195918ld c195918ld = c183688Ct3.A1r;
                            if (c195918ld.A06()) {
                                C8AD c8ad = c183688Ct3.A1K;
                                c8ad.CcJ(c8ag);
                                if ((!c8ad.CcJ(C8AE.A0M) && AbstractC196078lx.A01(userSession) && !C196068lw.A03(A002)) || !c8ad.CcJ(C8AE.A0f) || !c8ad.CcJ(C8AE.A0P) || !c8ad.CcJ(C8AE.A0B) || !C183688Ct.A0K(userSession, c8ad) || !c8ad.CcJ(C8AE.A0k) || !c8ad.CcJ(C8AE.A0b) || !c8ad.CcJ(C8AE.A0j) || !C183688Ct.A0J(c183688Ct3.A0v, userSession, c8ad)) {
                                    C9GR.A07(c183688Ct3.A0p.getContext(), 2131956697);
                                }
                            }
                            c195918ld.A01 = C183688Ct.A0M(c183688Ct3);
                            InterfaceC191388dp interfaceC191388dp = c195918ld.A00;
                            if (interfaceC191388dp != null) {
                                interfaceC191388dp.Dlg();
                            }
                        }
                        if (c8ag2 == C8AE.A0Y) {
                            boolean z = !CcJ;
                            AnonymousClass874 anonymousClass874 = c183688Ct3.A12;
                            if (anonymousClass874.A03 != z) {
                                anonymousClass874.A03 = z;
                                AnonymousClass874.A00(anonymousClass874, false);
                            }
                            AnonymousClass874 anonymousClass8742 = c183688Ct3.A11;
                            if (anonymousClass8742 != null && z) {
                                anonymousClass8742.A00 = true;
                                AnonymousClass874.A00(anonymousClass8742, true);
                            }
                        }
                    }
                }
            }
        }
        C006802i.A0p.markerEnd(383657104, A01, (short) 2);
    }

    @Override // X.C82M
    public final /* bridge */ /* synthetic */ void A7T(Parcelable parcelable) {
        CaptureRuleSystemState captureRuleSystemState = (CaptureRuleSystemState) parcelable;
        if (captureRuleSystemState != null) {
            this.A01 = captureRuleSystemState;
            A03(this);
        }
    }

    @Override // X.C8AD
    public final void A9F(C183688Ct c183688Ct, C8AG c8ag) {
        Map map = this.A08;
        List list = (List) map.get(c8ag);
        if (list == null) {
            list = new ArrayList();
            map.put(c8ag, list);
        }
        if (!list.contains(c183688Ct)) {
            list.add(c183688Ct);
        }
    }

    @Override // X.C82M
    public final /* bridge */ /* synthetic */ Parcelable ANh() {
        return this.A01;
    }

    @Override // X.C8AD
    public final void Cx6() {
        CaptureRuleSystemState captureRuleSystemState = this.A01;
        captureRuleSystemState.A0T = true;
        captureRuleSystemState.A0p = true;
        A03(this);
    }

    @Override // X.C8AD
    public final void D0N(List list) {
        int i;
        boolean z;
        CaptureRuleSystemState captureRuleSystemState = this.A01;
        boolean z2 = false;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        captureRuleSystemState.A00 = i;
        CaptureRuleSystemState captureRuleSystemState2 = this.A01;
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((BrandedContentTag) it.next()).A03) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        captureRuleSystemState2.A0C = z;
        CaptureRuleSystemState captureRuleSystemState3 = this.A01;
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                User A02 = AnonymousClass189.A00(this.A06).A02(((BrandedContentTag) it2.next()).A01);
                if (A02 == null) {
                    C0K8.A0C("CaptureRuleSystem", "The sponsor User model is missing from UserCache, which will block crossposting to FB because we cannot check the sponsor's eligibility");
                } else {
                    Boolean CdV = A02.A03.CdV();
                    if (CdV == null) {
                        C0K8.A0C("CaptureRuleSystem", "The sponsor User model is missing the is_sponsor_enabled_for_branded_content_crossposting_to_fb field, which will block crossposting to FB");
                        this.A04.A00(EnumC199338ra.A0C);
                    } else if (!CdV.booleanValue()) {
                    }
                }
                z2 = true;
            }
        }
        captureRuleSystemState3.A0A = z2;
        A03(this);
    }

    @Override // X.C8AD
    public final void D8H(boolean z) {
        this.A01.A06 = z;
        A03(this);
    }

    @Override // X.C8AD
    public final void DNC(boolean z) {
        this.A01.A0r = z;
        A03(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (X.OO4.A00(r4) != false) goto L8;
     */
    @Override // X.C8AD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DRg(com.instagram.api.schemas.BrandedContentGatingInfo r4) {
        /*
            r3 = this;
            com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState r2 = r3.A01
            if (r4 == 0) goto L18
            boolean r0 = X.OO4.A01(r4)
            if (r0 != 0) goto L11
            boolean r1 = X.OO4.A00(r4)
            r0 = 0
            if (r1 == 0) goto L12
        L11:
            r0 = 1
        L12:
            r2.A0B = r0
            A03(r3)
            return
        L18:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8AC.DRg(com.instagram.api.schemas.BrandedContentGatingInfo):void");
    }

    @Override // X.C8AD
    public final void DUN() {
        this.A01.A0q = true;
        A03(this);
    }

    @Override // X.C8AD
    public final void DYR(boolean z) {
        this.A01.A0L = z;
        A03(this);
    }

    @Override // X.C8AD
    public final void DYS() {
        this.A01.A0Q = true;
        A03(this);
    }

    @Override // X.C8AD
    public final void DbO(ReelProductLink reelProductLink) {
        CaptureRuleSystemState captureRuleSystemState = this.A01;
        boolean z = false;
        if (reelProductLink != null) {
            z = true;
        }
        captureRuleSystemState.A0Y = z;
        A03(this);
    }

    @Override // X.C8AD
    public final void Dbh(ProfileShopLink profileShopLink) {
        CaptureRuleSystemState captureRuleSystemState = this.A01;
        boolean z = false;
        if (profileShopLink != null) {
            z = true;
        }
        captureRuleSystemState.A0a = z;
        A03(this);
    }

    @Override // X.C8AD
    public final void Ddd(List list) {
        CaptureRuleSystemState captureRuleSystemState = this.A01;
        boolean z = false;
        if (list != null && (!list.isEmpty())) {
            z = true;
        }
        captureRuleSystemState.A0d = z;
        A03(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A06, 36323719538552373L) != false) goto L9;
     */
    @Override // X.C8AD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DpR(java.util.List r7, boolean r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Collection
            r4 = 0
            if (r0 == 0) goto L27
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L27
        Lb:
            if (r8 == 0) goto L1c
            com.instagram.common.session.UserSession r3 = r6.A06
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323719538552373(0x810c3b00042e35, double:3.034604727834591E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L1d
        L1c:
            r4 = 1
        L1d:
            com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState r1 = r6.A01
            r0 = r4 ^ 1
            r1.A0g = r0
            A03(r6)
            return
        L27:
            java.util.Iterator r5 = r7.iterator()
        L2b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r5.next()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            boolean r0 = X.AbstractC209309No.A01(r1)
            if (r0 != 0) goto L2b
            boolean r0 = r1 instanceof X.C9PX
            if (r0 != 0) goto L2b
            boolean r0 = r1 instanceof X.AbstractC202988yG
            if (r0 != 0) goto L2b
            boolean r0 = r1 instanceof X.C194808jg
            if (r0 == 0) goto L55
            r0 = r1
            X.8jg r0 = (X.C194808jg) r0
            android.graphics.drawable.Drawable r0 = r0.A04()
            boolean r0 = r0 instanceof X.C202728xq
            if (r0 == 0) goto L55
            goto L2b
        L55:
            boolean r0 = X.AbstractC209309No.A02(r1)
            if (r0 != 0) goto L2b
            X.C14360o3.A0B(r1, r4)
            X.BEc r0 = X.AbstractC101614hW.A09(r1)
            if (r0 == 0) goto L1d
            com.instagram.common.session.UserSession r3 = r6.A06
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323719538486836(0x810c3b00032e34, double:3.0346047277931453E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L1d
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8AC.DpR(java.util.List, boolean):void");
    }

    @Override // X.C8AD
    public final void Dss() {
        this.A01.A0t = true;
        A03(this);
    }

    @Override // X.C8AD
    public final void EKV(C198908qq c198908qq, Void r3) {
        AnonymousClass195 anonymousClass195;
        if (C8B6.A00(this.A06).booleanValue() && (anonymousClass195 = (AnonymousClass195) this.A05.getValue()) != null) {
            anonymousClass195.Emo();
        }
        this.A01 = c198908qq.A00;
        A00();
        A03(this);
    }

    @Override // X.C8AD
    public final C198908qq ELg() {
        return new C198908qq(this.A01);
    }

    @Override // X.C8AD
    public final void AHl(Void r1) {
        A01();
    }

    @Override // X.C8AD
    public final void DDo() {
        A00();
    }

    @Override // X.C8AD
    public final void DEs() {
        A01();
    }

    @Override // X.C8AD
    public final void DSj() {
        A03(this);
    }

    @Override // X.C8AD
    public final void EhR(C183688Ct c183688Ct) {
        this.A00 = c183688Ct;
    }
}
