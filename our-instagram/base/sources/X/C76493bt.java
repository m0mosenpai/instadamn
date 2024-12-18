package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import com.facebook.R;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.AutoDubStatus;
import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.ContextualHighlightType;
import com.instagram.api.schemas.MediaTrialStatus;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf;
import com.instagram.clips.model.metadata.InteractionUpsellCTAType;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.3bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76493bt {
    public static final C76493bt A00 = new Object();

    public static final boolean A04(Context context, UserSession userSession, C38321qM c38321qM, Boolean bool, int i) {
        boolean A03;
        C14360o3.A0B(userSession, 4);
        if (C14360o3.A0K(bool, true)) {
            if (C6Qi.A01(context, userSession, c38321qM, i)) {
                A03 = C18U.A06(C06090Tz.A05, userSession, 36318818981190152L);
            } else {
                return false;
            }
        } else if (C5Hu.A01(c38321qM.A0C.AqQ(), userSession)) {
            A03 = C5Hu.A03(userSession);
        } else {
            return false;
        }
        if (!A03) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r7.A0F == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A05(X.C25377BKu r7, X.C120985dq r8, com.instagram.common.session.UserSession r9) {
        /*
            r3 = 0
            r2 = 1
            boolean r0 = r8.CdW()
            r6 = 0
            if (r0 == 0) goto L2e
            boolean r0 = r7.A0E
            if (r0 == 0) goto L2d
            boolean r0 = r8.CdW()
            if (r0 == 0) goto L2d
            boolean r0 = X.AbstractC25381BKy.A00(r8)
            if (r0 != 0) goto L2d
            boolean r0 = X.AbstractC25381BKy.A01(r8)
            if (r0 != 0) goto L2d
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326064590894704(0x810e5d00073670, double:3.036087748378649E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
        L2a:
            if (r0 == 0) goto L2d
            r6 = 1
        L2d:
            return r6
        L2e:
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36328761830031122(0x8110d100023f12, double:3.03779349326943E-306)
            boolean r0 = X.C18U.A06(r4, r9, r0)
            if (r0 != 0) goto L40
            boolean r0 = r7.A0F
            r5 = 0
            if (r0 != 0) goto L41
        L40:
            r5 = 1
        L41:
            X.5t1 r1 = r8.A01
            X.5t1 r0 = X.EnumC129395t1.A0G
            if (r1 == r0) goto L4b
            X.5t1 r0 = X.EnumC129395t1.A0I
            if (r1 != r0) goto L2d
        L4b:
            boolean r0 = r7.A0E
            if (r0 == 0) goto L2d
            if (r5 == 0) goto L2d
            boolean r0 = X.BLH.A04(r9)
            if (r0 != 0) goto L62
            r0 = 36328705995456229(0x8110c400023ee5, double:3.03775818325944E-306)
            boolean r0 = X.C18U.A06(r4, r9, r0)
            if (r0 == 0) goto L2d
        L62:
            boolean r0 = A0P(r8, r9, r3, r2)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76493bt.A05(X.BKu, X.5dq, com.instagram.common.session.UserSession):boolean");
    }

    public static final boolean A06(ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq) {
        C5HS c5hs;
        C38321qM c38321qM;
        C3x9 clipsMetadata;
        C14360o3.A0B(clipsViewerConfig, 0);
        C14360o3.A0B(c120985dq, 1);
        if (!clipsViewerConfig.A1r && !clipsViewerConfig.A1R && (((c5hs = c120985dq.A0H) == null || !c5hs.Axn()) && ((c38321qM = c120985dq.A02) == null || (clipsMetadata = c38321qM.A0C.getClipsMetadata()) == null || !C14360o3.A0K(clipsMetadata.CbJ(), true)))) {
            return true;
        }
        return false;
    }

    public static final boolean A07(ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq) {
        C5HS c5hs;
        C14360o3.A0B(clipsViewerConfig, 0);
        C14360o3.A0B(c120985dq, 1);
        if (!clipsViewerConfig.A1V && ((c5hs = c120985dq.A0H) == null || !c5hs.Axl())) {
            return true;
        }
        return false;
    }

    public static final boolean A08(ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, UserSession userSession) {
        if (!clipsViewerConfig.A1r && !clipsViewerConfig.A1b) {
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM == null || !c38321qM.A4k()) {
                C5HS c5hs = c120985dq.A0H;
                if ((c5hs == null || !c5hs.Axp()) && !A0B(c120985dq) && !A0K(c120985dq, userSession)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean A09(ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, UserSession userSession) {
        C38321qM c38321qM;
        InterfaceC39541sb injected;
        C3x9 clipsMetadata;
        C38321qM c38321qM2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(clipsViewerConfig, 1);
        C14360o3.A0B(c120985dq, 2);
        if (!clipsViewerConfig.A1r && !clipsViewerConfig.A1d) {
            C5HS c5hs = c120985dq.A0H;
            if (c5hs != null && c5hs.Axx()) {
                return false;
            }
            C38321qM c38321qM3 = c120985dq.A02;
            if (c38321qM3 != null && c38321qM3.A5X() && (c38321qM2 = c120985dq.A02) != null && c38321qM2.A5h()) {
                return false;
            }
            C38321qM c38321qM4 = c120985dq.A02;
            if (c38321qM4 != null && (clipsMetadata = c38321qM4.A0C.getClipsMetadata()) != null && C14360o3.A0K(clipsMetadata.CbJ(), true)) {
                return false;
            }
            C38321qM c38321qM5 = c120985dq.A02;
            if (c38321qM5 != null && c38321qM5.A5h()) {
                return false;
            }
            if ((!c120985dq.CdW() || (c38321qM = c120985dq.A02) == null || (injected = c38321qM.A0C.getInjected()) == null || !C14360o3.A0K(injected.Axd(), false)) && !A0K(c120985dq, userSession)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A0A(C120985dq c120985dq) {
        boolean z;
        C38321qM c38321qM;
        EnumC76383bi enumC76383bi;
        C88543xC A1Q;
        MusicConsumptionModel BVa;
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null && (A1Q = c38321qM2.A1Q()) != null && (BVa = A1Q.A00.BVa()) != null) {
            z = C14360o3.A0K(BVa.AbG(), false);
        } else {
            z = false;
        }
        if (!z && ((c38321qM = c120985dq.A02) == null || !c38321qM.A5U())) {
            C38321qM c38321qM3 = c120985dq.A02;
            EnumC76383bi enumC76383bi2 = null;
            if (c38321qM3 != null) {
                enumC76383bi = c38321qM3.A1x();
            } else {
                enumC76383bi = null;
            }
            if (enumC76383bi != EnumC76383bi.A04) {
                C38321qM c38321qM4 = c120985dq.A02;
                if (c38321qM4 != null) {
                    enumC76383bi2 = c38321qM4.A1x();
                }
                if (enumC76383bi2 != EnumC76383bi.A08 && !c120985dq.CdW()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A0G(C120985dq c120985dq, C4GI c4gi) {
        Boolean BPj;
        String productType;
        if (c4gi == null || (BPj = c4gi.BPj()) == null || !BPj.booleanValue()) {
            return false;
        }
        String productType2 = c4gi.getProductType();
        return ((productType2 != null && ProductType.IGTV == ProductType.A01.get(productType2)) || ((productType = c4gi.getProductType()) != null && ProductType.CLIPS == ProductType.A01.get(productType))) && A0A(c120985dq);
    }

    public static final boolean A0J(C120985dq c120985dq, UserSession userSession) {
        C38321qM c38321qM;
        InterfaceC84163p3 A1P;
        if (A0A(c120985dq)) {
            if ((!C14360o3.A0K(C17060sy.A01.A01(userSession), c120985dq.A09(userSession)) || C37855Gl9.A00.A0J(userSession)) && (c38321qM = c120985dq.A02) != null && (A1P = c38321qM.A1P()) != null && A1P.getMashupsAllowed()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A0M(C120985dq c120985dq, UserSession userSession) {
        C3x9 clipsMetadata;
        String str;
        C14360o3.A0B(userSession, 1);
        C5HS c5hs = c120985dq.A0H;
        if (c5hs == null || !c5hs.Axu()) {
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM == null || (clipsMetadata = c38321qM.A0C.getClipsMetadata()) == null || !C14360o3.A0K(clipsMetadata.CbJ(), true)) {
                return true;
            }
            User A09 = c120985dq.A09(userSession);
            if (A09 != null) {
                str = A09.getId();
            } else {
                str = null;
            }
            if (!C14360o3.A0K(str, userSession.userId)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0P(C120985dq c120985dq, UserSession userSession, boolean z, boolean z2) {
        C38321qM c38321qM;
        boolean z3;
        OriginalAudioSubtype originalAudioSubtype;
        OriginalSoundDataIntf A1K;
        C38321qM c38321qM2 = c120985dq.A02;
        if ((c38321qM2 != null && c38321qM2.A5t()) || ((c38321qM = c120985dq.A02) != null && c38321qM.A58())) {
            z3 = true;
        } else {
            z3 = false;
        }
        C38321qM c38321qM3 = c120985dq.A02;
        if (c38321qM3 != null && (A1K = c38321qM3.A1K()) != null) {
            originalAudioSubtype = A1K.BZj();
        } else {
            originalAudioSubtype = null;
        }
        if (!z3 && originalAudioSubtype != null && (originalAudioSubtype == OriginalAudioSubtype.A05 || originalAudioSubtype == OriginalAudioSubtype.A04)) {
            if (!z && AbstractC85373rS.A00(userSession)) {
                return false;
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36328761829900048L)) {
                return false;
            }
            if (z2 && (C18U.A06(c06090Tz, userSession, 36326064591484537L) || C18U.A06(c06090Tz, userSession, 36326064591877758L))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0Q(UserSession userSession, C38321qM c38321qM) {
        if ((c38321qM != null && c38321qM.CdW()) || A0Y(c38321qM) || !C18U.A06(C06090Tz.A05, userSession, 36322774646467081L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0S(UserSession userSession, C38321qM c38321qM) {
        List list;
        C75363a3 c75363a3 = null;
        if (c38321qM != null) {
            list = c38321qM.A0C.CAf();
            c75363a3 = c38321qM.CFR();
        } else {
            list = null;
        }
        if ((AbstractC75343a1.A0A(userSession, c75363a3, list) || ((AbstractC75373a4.A08(userSession, c38321qM) || AbstractC75373a4.A0A(userSession, c38321qM)) && AbstractC75373a4.A07(userSession))) && !AbstractC75343a1.A08(userSession, c38321qM)) {
            return true;
        }
        return false;
    }

    public static final boolean A0T(UserSession userSession, C38321qM c38321qM) {
        CreativeConfigIntf Asm;
        List<EffectPreviewIntf> B0S;
        AttributionUser AdP;
        C14360o3.A0B(c38321qM, 0);
        if (AbstractC138316On.A05(userSession, c38321qM) && c38321qM.A1z() == ProductType.CLIPS && !AbstractC23021Ah.A00(userSession).A01.getBoolean("reel_boost_with_instagram_effect_seen_tooltip_on_more_button", false) && BH3.A00(userSession) && (Asm = c38321qM.A0C.Asm()) != null && (B0S = Asm.B0S()) != null) {
            boolean z = false;
            for (EffectPreviewIntf effectPreviewIntf : B0S) {
                if (effectPreviewIntf != null && (AdP = effectPreviewIntf.AdP()) != null) {
                    if (C14360o3.A0K(AdP.getInstagramUserId(), "25025320") && C14360o3.A0K(AdP.getUsername(), "instagram")) {
                        z = true;
                    }
                }
            }
            return z;
        }
        return false;
    }

    public static final boolean A0U(UserSession userSession, C38321qM c38321qM) {
        List<JK9> AeH;
        if (c38321qM != null && C2TN.A02(userSession, c38321qM) && (AeH = c38321qM.A0C.AeH()) != null && (!(AeH instanceof Collection) || !AeH.isEmpty())) {
            for (JK9 jk9 : AeH) {
                if (jk9.C0G() == AutoDubStatus.A07 || jk9.C0G() == AutoDubStatus.A06) {
                    if (C18U.A06(C06090Tz.A05, userSession, 36323092474112973L)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean A0V(UserSession userSession, C38321qM c38321qM, boolean z, boolean z2) {
        Integer num;
        C14360o3.A0B(userSession, 0);
        if (!z) {
            if (c38321qM != null) {
                num = c38321qM.A2O();
            } else {
                num = null;
            }
            if (num != C05F.A0C && !z2 && c38321qM != null && C14360o3.A0K(c38321qM.A0C.CdU(), true) && C18U.A06(C06090Tz.A05, userSession, 36326910698993853L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A0Z(C38321qM c38321qM) {
        return (AbstractC37667Gi0.A00(c38321qM) == null || c38321qM.A5r() || c38321qM.A0C.CD4() != null) ? false : true;
    }

    public final boolean A0b(MotionEvent motionEvent, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq) {
        C14360o3.A0B(motionEvent, 0);
        C14360o3.A0B(clipsViewerConfig, 1);
        C14360o3.A0B(c120985dq, 2);
        if (motionEvent.getAction() == 0 && A07(clipsViewerConfig, c120985dq)) {
            return true;
        }
        return false;
    }

    public static final int A00(Resources resources) {
        return BOB.A00(resources, resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
    }

    public static final void A03(EnumC25479BOs enumC25479BOs, Map map) {
        map.put(Integer.valueOf(enumC25479BOs.A00), enumC25479BOs);
    }

    public static final boolean A0B(C120985dq c120985dq) {
        C38321qM c38321qM;
        C3x9 clipsMetadata;
        if (c120985dq != null && (c38321qM = c120985dq.A02) != null && (clipsMetadata = c38321qM.A0C.getClipsMetadata()) != null) {
            return C14360o3.A0K(clipsMetadata.CbJ(), true);
        }
        return false;
    }

    public static final boolean A0C(C120985dq c120985dq) {
        InteractionUpsellCTAType interactionUpsellCTAType;
        User user = c120985dq.A0K;
        if (user == null || !AbstractC76693cH.A03(user)) {
            C5HS c5hs = c120985dq.A0H;
            if (c5hs != null) {
                interactionUpsellCTAType = c5hs.BIu();
            } else {
                interactionUpsellCTAType = null;
            }
            if (interactionUpsellCTAType == InteractionUpsellCTAType.A06) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0D(C120985dq c120985dq) {
        C38321qM c38321qM;
        InterfaceC84163p3 A1P;
        C38321qM c38321qM2 = c120985dq.A02;
        Integer num = null;
        if (c38321qM2 != null) {
            num = c38321qM2.A2O();
        }
        if (num != C05F.A0C && (c38321qM = c120985dq.A02) != null && (A1P = c38321qM.A1P()) != null && A1P.BZr() != null) {
            return true;
        }
        return false;
    }

    public static final boolean A0F(C120985dq c120985dq, C3x9 c3x9) {
        ContextualHighlightType contextualHighlightType;
        InterfaceC84163p3 BPh;
        C4GI BZr;
        if (c3x9 != null && c3x9.ArW() != null) {
            Integer num = null;
            ClipsContextualHighlightInfoIntf ArW = c3x9.ArW();
            if (ArW != null) {
                contextualHighlightType = ArW.ArX();
            } else {
                contextualHighlightType = null;
            }
            if (contextualHighlightType == ContextualHighlightType.A05) {
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM != null) {
                    num = c38321qM.A2O();
                }
                if (num != C05F.A0C && (BPh = c3x9.BPh()) != null && (BZr = BPh.BZr()) != null && C14360o3.A0K(BZr.BPj(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A0I(C120985dq c120985dq, UserSession userSession) {
        EnumC76383bi enumC76383bi;
        C38321qM c38321qM;
        if (C14360o3.A0K(C17060sy.A01.A01(userSession), c120985dq.A09(userSession))) {
            C38321qM c38321qM2 = c120985dq.A02;
            EnumC76383bi enumC76383bi2 = null;
            if (c38321qM2 != null) {
                enumC76383bi = c38321qM2.A1x();
            } else {
                enumC76383bi = null;
            }
            if (enumC76383bi != EnumC76383bi.A04) {
                C38321qM c38321qM3 = c120985dq.A02;
                if (c38321qM3 != null) {
                    enumC76383bi2 = c38321qM3.A1x();
                }
                if (enumC76383bi2 != EnumC76383bi.A08 && ((c38321qM = c120985dq.A02) == null || !c38321qM.A5U())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A0K(C120985dq c120985dq, UserSession userSession) {
        if (AdFormatType.A04 == c120985dq.A0E && !C18U.A06(C06090Tz.A05, userSession, 36321713789544157L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0N(C120985dq c120985dq, UserSession userSession) {
        EnumC76383bi enumC76383bi;
        C38321qM c38321qM = c120985dq.A02;
        String str = null;
        if (c38321qM != null) {
            enumC76383bi = c38321qM.A1x();
        } else {
            enumC76383bi = null;
        }
        if (enumC76383bi == EnumC76383bi.A08) {
            User A09 = c120985dq.A09(userSession);
            if (A09 != null) {
                str = A09.getId();
            }
            if (C14360o3.A0K(str, userSession.userId)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0O(C120985dq c120985dq, UserSession userSession, C38321qM c38321qM) {
        C75363a3 A0A;
        if (C18U.A06(C06090Tz.A05, userSession, 36323092473457605L) && (A0A = c120985dq.A0A(userSession, null)) != null && A0A.A07()) {
            return true;
        }
        if ((c38321qM == null || !AbstractC75373a4.A09(userSession, c38321qM)) && !AbstractC75373a4.A0B(userSession, c120985dq.A0A(userSession, null))) {
            return false;
        }
        return true;
    }

    public static final boolean A0R(UserSession userSession, C38321qM c38321qM) {
        OriginalSoundDataIntf BZw;
        User BFU;
        MusicInfo BVc;
        if (c38321qM != null && AbstractC37724Giz.A05(userSession, c38321qM)) {
            C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
            if (clipsMetadata != null && (BVc = clipsMetadata.BVc()) != null) {
                BFU = BVc.BVa().BFU();
                if (BFU == null) {
                    BVc.BVV().getDisplayArtist();
                    return true;
                }
            } else {
                C3x9 clipsMetadata2 = c38321qM.A0C.getClipsMetadata();
                if (clipsMetadata2 == null || (BZw = clipsMetadata2.BZw()) == null || (BFU = BZw.BFU()) == null) {
                    return false;
                }
            }
            BFU.getUsername();
            return true;
        }
        return false;
    }

    public static final boolean A0W(UserSession userSession, boolean z) {
        if (!z) {
            C06090Tz c06090Tz = C06090Tz.A06;
            if (!C18U.A06(c06090Tz, userSession, 36322315084048518L) && !C18U.A06(c06090Tz, userSession, 36322315083982981L) && !C18U.A06(c06090Tz, userSession, 36322315084245129L) && !C18U.A06(c06090Tz, userSession, 36322315084310666L)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0X(C38321qM c38321qM) {
        AnonymousClass924 CGu;
        AnonymousClass924 CGu2;
        if (c38321qM != null && (CGu = c38321qM.A0C.CGu()) != null && Long.valueOf(Long.parseLong(CGu.BZq().getPk())) != null && (CGu2 = c38321qM.A0C.CGu()) != null && Long.valueOf(Long.parseLong(CGu2.Apb().getCommentId())) != null) {
            return true;
        }
        return false;
    }

    public static final boolean A0Y(C38321qM c38321qM) {
        if (c38321qM != null) {
            if (c38321qM.A58() || c38321qM.A5t()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A0a(EnumC25479BOs enumC25479BOs, Map map) {
        return !map.containsKey(Integer.valueOf(enumC25479BOs.A00));
    }

    public static final C65 A01(C120985dq c120985dq) {
        C38321qM c38321qM;
        if (c120985dq.CdW() && (c38321qM = c120985dq.A02) != null && c38321qM.A2D() != null) {
            return C65.INFLUENCER;
        }
        return C65.BRAND;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r7.A0J == com.instagram.clips.intf.ClipsViewerSource.A0H) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.content.Context r5, X.C25377BKu r6, com.instagram.clips.intf.ClipsViewerConfig r7, X.C120985dq r8, X.C37644Ghd r9, com.instagram.common.session.UserSession r10, X.C38321qM r11) {
        /*
            com.instagram.user.model.User r3 = r8.A09(r10)
            if (r3 == 0) goto L66
            X.17P r0 = r3.A03
            java.lang.String r2 = r0.CAl()
            if (r2 == 0) goto L17
            java.lang.String r1 = r3.getId()
            X.Rie r0 = X.Rie.REELS
            X.AbstractC76693cH.A02(r5, r0, r10, r1, r2)
        L17:
            boolean r5 = r11.A4j()
            com.instagram.user.model.FollowStatus r1 = r9.A0G
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            r4 = 0
            if (r1 != r0) goto L23
            r4 = 1
        L23:
            boolean r0 = r7.A1r
            if (r0 != 0) goto L32
            boolean r0 = r6.A09
            if (r0 == 0) goto L32
            com.instagram.clips.intf.ClipsViewerSource r2 = r7.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A0H
            r1 = 1
            if (r2 != r0) goto L33
        L32:
            r1 = 0
        L33:
            X.0cb r0 = X.C17060sy.A01
            com.instagram.user.model.User r0 = r0.A01(r10)
            boolean r0 = X.C14360o3.A0K(r0, r3)
            if (r0 != 0) goto L45
            if (r1 == 0) goto L45
            if (r4 == 0) goto L45
            if (r5 == 0) goto L49
        L45:
            boolean r0 = r6.A0I
            if (r0 == 0) goto L66
        L49:
            X.730 r2 = new X.730
            r2.<init>(r10)
            java.lang.String r4 = r3.getId()
            X.17P r0 = r3.A03
            java.lang.String r5 = r0.CAl()
            X.Rie r3 = X.Rie.REELS
            r7 = 0
            X.1qM r0 = r8.A02
            if (r0 == 0) goto L67
            java.lang.String r6 = r0.A2u()
        L63:
            r2.A00(r3, r4, r5, r6, r7)
        L66:
            return
        L67:
            r6 = 0
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76493bt.A02(android.content.Context, X.BKu, com.instagram.clips.intf.ClipsViewerConfig, X.5dq, X.Ghd, com.instagram.common.session.UserSession, X.1qM):void");
    }

    public static final boolean A0E(C120985dq c120985dq, InterfaceC84163p3 interfaceC84163p3, UserSession userSession) {
        if (A0I(c120985dq, userSession) && interfaceC84163p3 != null && interfaceC84163p3.getCanToggleMashupsAllowed()) {
            return true;
        }
        return false;
    }

    public static final boolean A0H(C120985dq c120985dq, UserSession userSession) {
        String str;
        ClipsTrialDict Aog;
        User A09 = c120985dq.A09(userSession);
        MediaTrialStatus mediaTrialStatus = null;
        if (A09 != null) {
            str = A09.getId();
        } else {
            str = null;
        }
        if (C14360o3.A0K(str, userSession.userId) && c120985dq.A0Z && !c120985dq.A0a) {
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && (Aog = c38321qM.A0C.Aog()) != null) {
                mediaTrialStatus = Aog.C0I();
            }
            if (mediaTrialStatus != MediaTrialStatus.A04) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0L(C120985dq c120985dq, UserSession userSession) {
        if (c120985dq.CdW()) {
            if (!c120985dq.A06().A0K.A5v() && !AbstractC61652rS.A07(userSession, AbstractC23021Ah.A00(userSession)) && C18U.A06(C06090Tz.A05, userSession, 36322302199146622L) && !A0K(c120985dq, userSession)) {
                return true;
            }
            return false;
        }
        return C18U.A06(C06090Tz.A05, userSession, 36322302199408768L);
    }
}
