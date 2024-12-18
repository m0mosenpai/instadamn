package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.ProfilePicture;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectActionSheetIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;
import com.instagram.model.shopping.ProductItemWithARIntf;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.reels.viewer.attribution.model.ReelAttributionModel;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6ZL, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6ZL {
    public boolean A00;
    public final UserSession A01;
    public final InterfaceC11380iw A02;
    public final C18920wW A03;
    public final C41181vS A04;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.C38321qM r14) {
        /*
            r13 = this;
            r7 = 0
            X.0wW r6 = r13.A03
            java.lang.String r5 = "story_viewer_attribution_tap"
            X.0kM r4 = r6.A00
            X.0Ai r12 = r6.A00(r4, r5)
            X.1vS r0 = r13.A04
            r3 = 0
            if (r0 == 0) goto L15
            com.instagram.user.model.User r1 = r0.A0i
        L12:
            r10 = -1
            goto L17
        L15:
            r1 = r3
            goto L12
        L17:
            java.lang.String r0 = r14.A2u()     // Catch: java.lang.NumberFormatException -> L36
            if (r0 == 0) goto L2e
            long r8 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L36
            if (r1 == 0) goto L40
            java.lang.String r0 = r1.getId()     // Catch: java.lang.NumberFormatException -> L2c
            long r10 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L2c
            goto L40
        L2c:
            r2 = move-exception
            goto L39
        L2e:
            java.lang.String r1 = "Media id is null"
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> L36
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> L36
            throw r0     // Catch: java.lang.NumberFormatException -> L36
        L36:
            r2 = move-exception
            r8 = -1
        L39:
            java.lang.String r1 = "ReelAttributionType"
            java.lang.String r0 = "Can't parse mediaId or authorId"
            X.C0w9.A06(r1, r0, r2)
        L40:
            X.1rF r0 = r14.A0C
            X.4tM r0 = r0.BEB()
            if (r0 == 0) goto L5a
            java.util.List r0 = r0.AZh()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r7)
            X.4tK r0 = (X.InterfaceC107754tK) r0
            if (r0 == 0) goto L5a
            java.lang.String r3 = r0.BlW()
        L5a:
            boolean r0 = r12.isSampled()
            if (r0 == 0) goto La0
            X.0Ai r2 = r6.A00(r4, r5)
            java.lang.String r0 = r13.A02()
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.C14360o3.A07(r1)
            java.lang.String r0 = "attribution_type"
            r2.AAk(r0, r1)
            X.0iw r0 = r13.A02
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "containermodule"
            r2.AAP(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.String r0 = "media_id"
            r2.A9K(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            java.lang.String r0 = "author_id"
            r2.A9K(r0, r1)
            java.lang.String r0 = "reel_id"
            r2.AAP(r0, r3)
            java.lang.String r1 = X.AbstractC25041Ki.A00
            java.lang.String r0 = "canonical_nav_chain"
            r2.AAP(r0, r1)
            r2.Cht()
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ZL.A07(X.1qM):void");
    }

    public final ReelHeaderAttributionType A01() {
        if (this instanceof C141096Zn) {
            return ((C141096Zn) this).A01;
        }
        if (this instanceof C6ZR) {
            C6ZR c6zr = (C6ZR) this;
            C38321qM c38321qM = c6zr.A03.A0b;
            if (c38321qM != null) {
                UserSession userSession = ((C6ZL) c6zr).A01;
                if (c38321qM.A6j(userSession)) {
                    return ReelHeaderAttributionType.A0Y;
                }
                if (c38321qM.A6k(userSession)) {
                    return ReelHeaderAttributionType.A0Q;
                }
                if (c38321qM.A6h(userSession)) {
                    return ReelHeaderAttributionType.A0R;
                }
            }
            return ReelHeaderAttributionType.A0w;
        }
        if (this instanceof C141256a4) {
            return ((C141256a4) this).A01;
        }
        if (this instanceof C6ZU) {
            return ((C6ZU) this).A01;
        }
        if (this instanceof C141146Zs) {
            return ReelHeaderAttributionType.A0I;
        }
        if (this instanceof C141016Ze) {
            return ((C141016Ze) this).A01;
        }
        if (this instanceof C141086Zm) {
            return ((C141086Zm) this).A02;
        }
        if (this instanceof C6ZW) {
            return ((C6ZW) this).A01;
        }
        if (this instanceof C6ZQ) {
            return ReelHeaderAttributionType.A0m;
        }
        if (this instanceof C141276a6) {
            return ((C141276a6) this).A01;
        }
        if (this instanceof C141216Zz) {
            return ((C141216Zz) this).A01;
        }
        if (this instanceof C141336aC) {
            return ((C141336aC) this).A01;
        }
        if (this instanceof C141076Zl) {
            return ReelHeaderAttributionType.A0D;
        }
        if (this instanceof C141196Zx) {
            return ((C141196Zx) this).A01;
        }
        if (this instanceof C141106Zo) {
            return ReelHeaderAttributionType.A02;
        }
        if (this instanceof C6ZY) {
            return ((C6ZY) this).A00;
        }
        if (this instanceof C141026Zf) {
            return ((C141026Zf) this).A01;
        }
        if (this instanceof C141176Zv) {
            return ((C141176Zv) this).A01;
        }
        if (this instanceof C141356aE) {
            return ((C141356aE) this).A01;
        }
        if (this instanceof C141236a1) {
            return ((C141236a1) this).A01;
        }
        if (this instanceof C141036Zg) {
            return ((C141036Zg) this).A02;
        }
        if (this instanceof C6a2) {
            return ((C6a2) this).A01;
        }
        if (this instanceof C141136Zr) {
            return ReelHeaderAttributionType.A0g;
        }
        if (this instanceof C141206Zy) {
            return ((C141206Zy) this).A02;
        }
        if (this instanceof C6ZS) {
            return ReelHeaderAttributionType.A0v;
        }
        if (this instanceof C6ZT) {
            return ReelHeaderAttributionType.A0u;
        }
        if (this instanceof C6ZV) {
            return ((C6ZV) this).A00;
        }
        if (this instanceof C6ZP) {
            return ((C6ZP) this).A01;
        }
        if (this instanceof C6ZX) {
            return ((C6ZX) this).A00;
        }
        if (this instanceof C6ZZ) {
            return ReelHeaderAttributionType.A0n;
        }
        if (this instanceof C141246a3) {
            return ((C141246a3) this).A02;
        }
        if (this instanceof C141226a0) {
            return ((C141226a0) this).A01;
        }
        if (this instanceof C6ZN) {
            return ((C6ZN) this).A01;
        }
        if (this instanceof C6Zh) {
            return ((C6Zh) this).A02;
        }
        if (this instanceof C6ZO) {
            return ((C6ZO) this).A01;
        }
        if (this instanceof C140996Zc) {
            return ((C140996Zc) this).A01;
        }
        if (this instanceof C141126Zq) {
            return ReelHeaderAttributionType.A0b;
        }
        if (this instanceof C6ZK) {
            return ((C6ZK) this).A03;
        }
        if (this instanceof C141326aB) {
            return ((C141326aB) this).A01;
        }
        if (this instanceof C141296a8) {
            return ((C141296a8) this).A02;
        }
        if (this instanceof C141046Zi) {
            return ReelHeaderAttributionType.A0T;
        }
        if (this instanceof C141316aA) {
            return ((C141316aA) this).A01;
        }
        if (this instanceof C141006Zd) {
            return ((C141006Zd) this).A00;
        }
        if (this instanceof C141186Zw) {
            return ((C141186Zw) this).A01;
        }
        if (this instanceof C141056Zj) {
            return ((C141056Zj) this).A02;
        }
        if (this instanceof C141286a7) {
            return ((C141286a7) this).A00;
        }
        if (this instanceof C6ZM) {
            return ((C6ZM) this).A00;
        }
        if (this instanceof C140986Za) {
            return ((C140986Za) this).A02;
        }
        if (this instanceof C141266a5) {
            return ((C141266a5) this).A01;
        }
        if (this instanceof C141346aD) {
            return ((C141346aD) this).A00;
        }
        if (this instanceof C141376aG) {
            return ((C141376aG) this).A02;
        }
        if (this instanceof C141366aF) {
            return ((C141366aF) this).A01;
        }
        if (this instanceof C141156Zt) {
            return ((C141156Zt) this).A02;
        }
        if (this instanceof C141116Zp) {
            return ReelHeaderAttributionType.A07;
        }
        return ReelHeaderAttributionType.A03;
    }

    public final String A02() {
        CreativeConfigIntf Asm;
        EnumC138476Pd A03;
        ProductDetailsProductItemDictIntf BhA;
        if (this instanceof C141096Zn) {
            return "music";
        }
        if (this instanceof C141256a4) {
            return "mention_reshare";
        }
        if (this instanceof C6ZU) {
            return "translation";
        }
        if (this instanceof C141146Zs) {
            C141146Zs c141146Zs = (C141146Zs) this;
            CreativeConfigIntf creativeConfigIntf = c141146Zs.A02;
            if (creativeConfigIntf == null) {
                C0w9.A03("EffectAttributionType", "null media for tap logging");
                return "unknown";
            }
            if (AbstractC141406aJ.A00(c141146Zs.A00, creativeConfigIntf)) {
                if (C18U.A06(C06090Tz.A06, ((C6ZL) c141146Zs).A01, 36311178234102224L)) {
                    return "unknown";
                }
            }
            EnumC138476Pd A032 = AbstractC121575f6.A03(creativeConfigIntf);
            ProductItemWithARIntf B0b = creativeConfigIntf.B0b();
            if (B0b != null && (BhA = B0b.BhA()) != null) {
                AbstractC38048Gob.A01(BhA);
                return "face_effect";
            }
            if (A032 == null) {
                return "face_effect";
            }
            String B3z = creativeConfigIntf.B3z();
            switch (A032.ordinal()) {
                case 2:
                case 4:
                    return "superzoom";
                case 3:
                    return "focus";
                case 5:
                    if (B3z != null) {
                        return "face_effect";
                    }
                    return "boomerang";
                case 6:
                case 7:
                case 9:
                default:
                    return "face_effect";
                case 8:
                    if (B3z == null) {
                        return "layout";
                    }
                    return "face_effect";
                case 10:
                    return "dual";
            }
        }
        if (this instanceof C141016Ze) {
            return ((C141016Ze) this).A06;
        }
        if (this instanceof C141086Zm) {
            return "clips_reshare";
        }
        if (this instanceof C6ZW) {
            return "story_template";
        }
        if (this instanceof C6ZQ) {
            return "sponsored";
        }
        if (this instanceof C141276a6) {
            return "message_share";
        }
        if (this instanceof C141216Zz) {
            return "gen_ai_sticker";
        }
        if (this instanceof C141336aC) {
            return "cutout_anything";
        }
        if (this instanceof C141076Zl) {
            return "clips";
        }
        if (this instanceof C141196Zx) {
            return "avatar_sticker";
        }
        if (this instanceof C141106Zo) {
            C141106Zo c141106Zo = (C141106Zo) this;
            C38321qM c38321qM = c141106Zo.A02.A0b;
            if (c38321qM != null && FAT.A00(((C6ZL) c141106Zo).A01, c38321qM)) {
                return "created_on_facebook";
            }
            return "third_party";
        }
        if (this instanceof C6ZY) {
            return "stories_teaser";
        }
        if (this instanceof C141026Zf) {
            return ((C141026Zf) this).A06;
        }
        if (this instanceof C141176Zv) {
            return "create";
        }
        if (this instanceof C141356aE) {
            return "barcelona_share";
        }
        if (this instanceof C141236a1) {
            return "polaroid_frame";
        }
        if (!(this instanceof C141036Zg)) {
            if (this instanceof C6a2) {
                return "memory_story";
            }
            if (!(this instanceof C141136Zr)) {
                if (this instanceof C141206Zy) {
                    return "gen_ai_detection";
                }
                if (this instanceof C6ZR) {
                    return ((C6ZR) this).A06;
                }
                if (this instanceof C6ZS) {
                    return "video_call";
                }
                if (this instanceof C6ZT) {
                    return "unlockable_sticker";
                }
                if (this instanceof C6ZV) {
                    return MSV.A00(35);
                }
                if (this instanceof C6ZP) {
                    return "suggested_reel";
                }
                if (this instanceof C6ZX) {
                    return "story_snapshot";
                }
                if (this instanceof C6ZZ) {
                    return "state_controlled_media_label";
                }
                if (this instanceof C141246a3) {
                    return "share_to_friends_story_profile";
                }
                if (this instanceof C141226a0) {
                    return "secret_sticker";
                }
                if (!(this instanceof C6ZN)) {
                    if (!(this instanceof C6Zh)) {
                        if (this instanceof C6ZO) {
                            return "quicksnap_recap";
                        }
                        if (this instanceof C140996Zc) {
                            return "public_collection";
                        }
                        if (!(this instanceof C141126Zq)) {
                            if (this instanceof C6ZK) {
                                return "multiple_lists";
                            }
                            if (this instanceof C141326aB) {
                                return "imagine_genai_attribution";
                            }
                            if (this instanceof C141296a8) {
                                return "magic_mod";
                            }
                            if (this instanceof C141046Zi) {
                                return "internal";
                            }
                            if (this instanceof C141316aA) {
                                return "imagine_template";
                            }
                            if (this instanceof C141006Zd) {
                                return ((C141006Zd) this).A05;
                            }
                            if (this instanceof C141186Zw) {
                                return "gallery_grid_format";
                            }
                            if (this instanceof C141056Zj) {
                                return "clips_full_screen_reshare";
                            }
                            if (this instanceof C141286a7) {
                                return "published_superlative";
                            }
                            if (!(this instanceof C6ZM)) {
                                if (this instanceof C140986Za) {
                                    return "explore_shareable_grid";
                                }
                                if (this instanceof C141266a5) {
                                    return AbstractC43591JPw.A00(851);
                                }
                                if (this instanceof C141346aD) {
                                    return "channel_challenge";
                                }
                                if (this instanceof C141376aG) {
                                    return "campfire_self_view";
                                }
                                if (this instanceof C141366aF) {
                                    return "campfire";
                                }
                                if (this instanceof C141156Zt) {
                                    C38321qM c38321qM2 = ((C141156Zt) this).A01;
                                    if (c38321qM2 == null || (Asm = c38321qM2.A0C.Asm()) == null || (A03 = AbstractC121575f6.A03(Asm)) == null) {
                                        return "unknown";
                                    }
                                    switch (A03.ordinal()) {
                                        case 2:
                                        case 4:
                                            return "superzoom";
                                        case 3:
                                            return "focus";
                                        case 5:
                                            return "boomerang";
                                        case 6:
                                        case 7:
                                        case 9:
                                        default:
                                            return "unknown";
                                        case 8:
                                            return "layout";
                                        case 10:
                                            return "dual";
                                    }
                                }
                                if (this instanceof C141116Zp) {
                                    C38321qM c38321qM3 = ((C141116Zp) this).A01.A0b;
                                    if (c38321qM3 != null) {
                                        String A37 = c38321qM3.A37();
                                        if (A37 != null) {
                                            return A37;
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                }
                                return "face_effect_preview";
                            }
                            return "roll_call_first_take";
                        }
                        return "archive";
                    }
                    return "highlights";
                }
                return "roll_call_first_take";
            }
            return "archive";
        }
        return "highlights";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:228:0x01c3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A03() {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ZL.A03():java.lang.String");
    }

    public final List A05() {
        ReelAttributionModel reelAttributionModel;
        String str;
        String str2;
        C84823qW c84823qW;
        CreativeConfigIntf creativeConfigIntf;
        CreativeConfigIntf Asm;
        String captureType;
        EffectInfoBottomSheetConfiguration A01;
        ImageUrl imageUrl;
        AttributionUser AdP;
        ImageUrl imageUrl2;
        List list;
        List list2;
        boolean z;
        Boolean CPi;
        EffectActionSheetIntf B0O;
        EffectActionSheetIntf B0O2;
        ProfilePicture Bhx;
        EffectThumbnailImageDictIntf C84;
        MusicOverlayStickerModel musicOverlayStickerModel;
        C84823qW c84823qW2;
        if (this instanceof C140996Zc) {
            return ((C140996Zc) this).A06;
        }
        if (this instanceof C141096Zn) {
            C141096Zn c141096Zn = (C141096Zn) this;
            reelAttributionModel = new ReelAttributionModel(c141096Zn.A01);
            List BlY = c141096Zn.A02.BlY(EnumC75383a5.A0s);
            if (BlY != null && (c84823qW2 = (C84823qW) AbstractC001800i.A0J(BlY)) != null) {
                musicOverlayStickerModel = c84823qW2.A0v;
            } else {
                musicOverlayStickerModel = null;
            }
            if (musicOverlayStickerModel != null) {
                reelAttributionModel.A03 = musicOverlayStickerModel;
                try {
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    C4A1.A00(A0A, musicOverlayStickerModel, true);
                    A0A.close();
                    reelAttributionModel.A05 = stringWriter.toString();
                } catch (IOException unused) {
                    str = "ReelAttributionModel";
                    str2 = "Could not json serialize MusicAssetModel";
                    C0w9.A03(str, str2);
                    List singletonList = Collections.singletonList(reelAttributionModel);
                    C14360o3.A07(singletonList);
                    return singletonList;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            if (this instanceof C140986Za) {
                return ((C140986Za) this).A07;
            }
            if (this instanceof C141146Zs) {
                C141146Zs c141146Zs = (C141146Zs) this;
                ArrayList arrayList = new ArrayList();
                CreativeConfigIntf creativeConfigIntf2 = c141146Zs.A02;
                if (creativeConfigIntf2 == null) {
                    return arrayList;
                }
                EnumC138476Pd enumC138476Pd = null;
                ReelViewerConfig reelViewerConfig = c141146Zs.A04;
                if (reelViewerConfig != null && !reelViewerConfig.A04) {
                    String B3z = creativeConfigIntf2.B3z();
                    EffectPreviewIntf B0a = creativeConfigIntf2.B0a();
                    if (B0a == null || (captureType = B0a.getName()) == null) {
                        captureType = creativeConfigIntf2.getCaptureType();
                    }
                    if (B3z != null && captureType != null) {
                        EnumC138476Pd enumC138476Pd2 = EnumC138476Pd.A0B;
                        if (!AbstractC121575f6.A0B(creativeConfigIntf2, enumC138476Pd2) && !AbstractC121575f6.A0B(creativeConfigIntf2, EnumC138476Pd.A08) && (!AbstractC121575f6.A0B(creativeConfigIntf2, EnumC138476Pd.A04) || creativeConfigIntf2.B3z() != null)) {
                            Context context = c141146Zs.A00;
                            UserSession userSession = ((C6ZL) c141146Zs).A01;
                            EffectPreviewIntf B0a2 = creativeConfigIntf2.B0a();
                            if (B0a2 != null && (C84 = B0a2.C84()) != null) {
                                imageUrl = C84.CDO();
                            } else {
                                imageUrl = null;
                            }
                            String A06 = AbstractC121575f6.A06(creativeConfigIntf2);
                            String A05 = AbstractC121575f6.A05(creativeConfigIntf2);
                            EffectPreviewIntf B0a3 = creativeConfigIntf2.B0a();
                            if (((B0a3 != null && (AdP = B0a3.AdP()) != null) || (AdP = creativeConfigIntf2.AdP()) != null) && (Bhx = AdP.Bhx()) != null) {
                                imageUrl2 = Bhx.CDO();
                            } else {
                                imageUrl2 = null;
                            }
                            String failureReason = creativeConfigIntf2.getFailureReason();
                            if (AbstractC121575f6.A0A(creativeConfigIntf2)) {
                                enumC138476Pd = AbstractC121575f6.A03(creativeConfigIntf2);
                            }
                            ProductItemWithARIntf B0b = creativeConfigIntf2.B0b();
                            EffectPreviewIntf B0a4 = creativeConfigIntf2.B0a();
                            boolean z2 = true;
                            if (B0a4 == null || !"SAVED".equals(B0a4.getSaveStatus())) {
                                z2 = false;
                            }
                            EffectPreviewIntf B0a5 = creativeConfigIntf2.B0a();
                            if (B0a5 == null || (B0O2 = B0a5.B0O()) == null || (list = B0O2.BgC()) == null) {
                                list = C16930sl.A00;
                            }
                            EffectPreviewIntf B0a6 = creativeConfigIntf2.B0a();
                            if (B0a6 == null || (B0O = B0a6.B0O()) == null || (list2 = B0O.BrM()) == null) {
                                list2 = C16930sl.A00;
                            }
                            String BcZ = creativeConfigIntf2.BcZ();
                            EnumC223179sw A04 = AbstractC121575f6.A04(creativeConfigIntf2);
                            EffectPreviewIntf B0a7 = creativeConfigIntf2.B0a();
                            if (B0a7 != null && (CPi = B0a7.CPi()) != null) {
                                z = CPi.booleanValue();
                            } else {
                                z = false;
                            }
                            A01 = LH4.A00(context, userSession, imageUrl, imageUrl2, enumC138476Pd, A04, B0b, B3z, captureType, A06, A05, failureReason, BcZ, c141146Zs.A07, list, list2, 5, z2, z, reelViewerConfig.A08);
                        } else if (AbstractC121575f6.A0B(creativeConfigIntf2, enumC138476Pd2, EnumC138476Pd.A08) && creativeConfigIntf2.B0S() != null) {
                            A01 = LH4.A01(c141146Zs.A00, creativeConfigIntf2, c141146Zs.A07);
                        }
                        ImmutableList immutableList = A01.A02;
                        if (immutableList != null && !immutableList.isEmpty()) {
                            Iterator<E> it = immutableList.iterator();
                            while (it.hasNext()) {
                                EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = (EffectInfoAttributionConfiguration) it.next();
                                if (effectInfoAttributionConfiguration.A02 == null) {
                                    ReelAttributionModel reelAttributionModel2 = new ReelAttributionModel(ReelHeaderAttributionType.A0I);
                                    reelAttributionModel2.A01 = effectInfoAttributionConfiguration;
                                    arrayList.add(reelAttributionModel2);
                                }
                            }
                        }
                    }
                }
                if (!AbstractC141406aJ.A00(c141146Zs.A00, creativeConfigIntf2)) {
                    return arrayList;
                }
                if (C18U.A06(C06090Tz.A06, ((C6ZL) c141146Zs).A01, 36311178234102224L)) {
                    return arrayList;
                }
                EnumC138476Pd A03 = AbstractC121575f6.A03(creativeConfigIntf2);
                ReelAttributionModel reelAttributionModel3 = new ReelAttributionModel(ReelHeaderAttributionType.A08);
                reelAttributionModel3.A02 = A03;
                arrayList.add(reelAttributionModel3);
                return arrayList;
            }
            if (this instanceof C141086Zm) {
                return ((C141086Zm) this).A07;
            }
            if (this instanceof C141076Zl) {
                ReelAttributionModel reelAttributionModel4 = new ReelAttributionModel(ReelHeaderAttributionType.A0D);
                reelAttributionModel4.A02 = EnumC138476Pd.A05;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(reelAttributionModel4);
                return arrayList2;
            }
            if (this instanceof C141156Zt) {
                C141156Zt c141156Zt = (C141156Zt) this;
                ArrayList arrayList3 = new ArrayList();
                Context context2 = c141156Zt.A00;
                C38321qM c38321qM = c141156Zt.A01;
                EnumC138476Pd enumC138476Pd3 = null;
                if (c38321qM != null) {
                    creativeConfigIntf = c38321qM.A0C.Asm();
                } else {
                    creativeConfigIntf = null;
                }
                if (!AbstractC141406aJ.A00(context2, creativeConfigIntf)) {
                    return arrayList3;
                }
                if (c38321qM != null && (Asm = c38321qM.A0C.Asm()) != null) {
                    enumC138476Pd3 = AbstractC121575f6.A03(Asm);
                }
                ReelAttributionModel reelAttributionModel5 = new ReelAttributionModel(ReelHeaderAttributionType.A08);
                reelAttributionModel5.A02 = enumC138476Pd3;
                arrayList3.add(reelAttributionModel5);
                return arrayList3;
            }
            if (this instanceof C141196Zx) {
                C141196Zx c141196Zx = (C141196Zx) this;
                reelAttributionModel = new ReelAttributionModel(c141196Zx.A01);
                List BlY2 = c141196Zx.A02.BlY(EnumC75383a5.A09);
                C102134ij c102134ij = null;
                if (BlY2 != null && (!BlY2.isEmpty()) && (c84823qW = (C84823qW) AbstractC001800i.A0O(BlY2, 0)) != null) {
                    c102134ij = c84823qW.A0C;
                }
                if (c102134ij != null) {
                    reelAttributionModel.A00 = c102134ij;
                    try {
                        StringWriter stringWriter2 = new StringWriter();
                        C17z A0A2 = AbstractC221915u.A00.A0A(stringWriter2);
                        AbstractC102124ii.A00(A0A2, c102134ij);
                        A0A2.close();
                        reelAttributionModel.A04 = stringWriter2.toString();
                    } catch (IOException unused2) {
                        str = "ReelAttributionModel";
                        str2 = "Could not json serialize AvatarStickerDict";
                        C0w9.A03(str, str2);
                        List singletonList2 = Collections.singletonList(reelAttributionModel);
                        C14360o3.A07(singletonList2);
                        return singletonList2;
                    }
                }
            } else {
                return C16930sl.A00;
            }
        }
        List singletonList22 = Collections.singletonList(reelAttributionModel);
        C14360o3.A07(singletonList22);
        return singletonList22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:302:0x03d9, code lost:
    
        if (((X.C6ZL) r2).A00 != false) goto L276;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06() {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ZL.A06():void");
    }

    public final boolean A08() {
        boolean z;
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        if (!(this instanceof C141146Zs)) {
            if (this instanceof C141096Zn) {
                C38321qM c38321qM = ((C141096Zn) this).A02.A0b;
                z = false;
                if (c38321qM != null) {
                    ArrayList A3N = c38321qM.A3N();
                    C14360o3.A0B(A3N, 0);
                    MusicOverlayStickerModel A05 = AbstractC101614hW.A05(A3N);
                    if (A05 == null || !A05.A0t) {
                        return true;
                    }
                }
            } else {
                if ((this instanceof C6ZU) || (this instanceof C141016Ze) || (this instanceof C141256a4) || (this instanceof C141086Zm) || (this instanceof C6ZW)) {
                    return true;
                }
                if (!(this instanceof C6ZQ)) {
                    if (!(this instanceof C141276a6) && !(this instanceof C141336aC)) {
                        if (this instanceof C141106Zo) {
                            z = false;
                            if (((C141106Zo) this).A02.A0b != null) {
                                return true;
                            }
                        } else {
                            if (!(this instanceof C6ZY)) {
                                if ((this instanceof C141026Zf) || (this instanceof C141176Zv) || (this instanceof C141356aE) || (this instanceof C141136Zr) || (this instanceof C141076Zl) || (this instanceof C141036Zg) || (this instanceof C141196Zx) || (this instanceof C6a2)) {
                                    return true;
                                }
                                if (this instanceof C141236a1) {
                                    userSession = this.A01;
                                    c06090Tz = C06090Tz.A05;
                                    j = 36320189075169405L;
                                } else {
                                    if (this instanceof C141206Zy) {
                                        return true;
                                    }
                                    if (this instanceof C6ZR) {
                                        C6ZR c6zr = (C6ZR) this;
                                        return c6zr.A07.contains(c6zr.A01());
                                    }
                                    if (!(this instanceof C6ZS)) {
                                        if (this instanceof C6ZT) {
                                            return true;
                                        }
                                        if (!(this instanceof C6ZV) && !(this instanceof C6ZP) && !(this instanceof C6ZX)) {
                                            if (this instanceof C6ZZ) {
                                                return A09();
                                            }
                                            if (this instanceof C141246a3) {
                                                return true;
                                            }
                                            if (!(this instanceof C141226a0) && !(this instanceof C6ZN) && !(this instanceof C6Zh)) {
                                                if ((this instanceof C6ZO) || (this instanceof C140996Zc) || (this instanceof C141126Zq) || (this instanceof C6ZK)) {
                                                    return true;
                                                }
                                                if (this instanceof C141326aB) {
                                                    userSession = this.A01;
                                                    c06090Tz = C06090Tz.A05;
                                                    j = 36327172692523371L;
                                                } else {
                                                    if (this instanceof C141296a8) {
                                                        return true;
                                                    }
                                                    if (!(this instanceof C141046Zi)) {
                                                        if (this instanceof C141316aA) {
                                                            userSession = this.A01;
                                                            c06090Tz = C06090Tz.A05;
                                                            j = 36325407460570156L;
                                                        } else {
                                                            if ((this instanceof C141006Zd) || (this instanceof C141216Zz) || (this instanceof C141186Zw) || (this instanceof C141056Zj) || (this instanceof C141286a7)) {
                                                                return true;
                                                            }
                                                            if (!(this instanceof C6ZM)) {
                                                                if (this instanceof C140986Za) {
                                                                    return true;
                                                                }
                                                                if (!(this instanceof C141266a5)) {
                                                                    if ((this instanceof C141346aD) || (this instanceof C141376aG) || (this instanceof C141366aF) || (this instanceof C141156Zt)) {
                                                                        return true;
                                                                    }
                                                                    if (this instanceof C141116Zp) {
                                                                        C41181vS c41181vS = ((C141116Zp) this).A01;
                                                                        if (c41181vS.A0e == EnumC41231vY.A09) {
                                                                            C38321qM c38321qM2 = c41181vS.A0b;
                                                                            c38321qM2.getClass();
                                                                            List C1E = c38321qM2.A0C.C1E();
                                                                            if (C1E != null) {
                                                                                C1E.isEmpty();
                                                                                return false;
                                                                            }
                                                                            return false;
                                                                        }
                                                                        return false;
                                                                    }
                                                                    return false;
                                                                }
                                                                return false;
                                                            }
                                                            return false;
                                                        }
                                                    } else {
                                                        return false;
                                                    }
                                                }
                                            } else {
                                                return false;
                                            }
                                        } else {
                                            return false;
                                        }
                                    } else {
                                        return false;
                                    }
                                }
                                return C18U.A06(c06090Tz, userSession, j);
                            }
                            return false;
                        }
                    } else {
                        return true;
                    }
                } else {
                    C41181vS c41181vS2 = ((C6ZQ) this).A01;
                    C38321qM c38321qM3 = c41181vS2.A0b;
                    if (c38321qM3 != null && c38321qM3.A5t()) {
                        boolean A10 = c41181vS2.A10();
                        z = true;
                        if (!A10) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            return z;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        if (r1 != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0354 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09() {
        /*
            Method dump skipped, instructions count: 1952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ZL.A09():boolean");
    }

    public C6ZL(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS) {
        this.A01 = userSession;
        this.A02 = interfaceC11380iw;
        this.A04 = c41181vS;
        this.A03 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1118:0x15ad, code lost:
    
        if (r3 != null) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x0dd5, code lost:
    
        if (r5 != null) goto L1313;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:1329:0x1a1f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:527:0x09ea. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1112:0x156e  */
    /* JADX WARN: Removed duplicated region for block: B:1115:0x1592  */
    /* JADX WARN: Removed duplicated region for block: B:1328:0x1a1b  */
    /* JADX WARN: Removed duplicated region for block: B:1372:0x1cd0  */
    /* JADX WARN: Removed duplicated region for block: B:1377:0x1ced  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0e48  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x1abe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A04() {
        /*
            Method dump skipped, instructions count: 7684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ZL.A04():java.util.List");
    }
}
