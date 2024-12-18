package X;

import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo;
import com.instagram.feed.media.ReelCTA;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.user.model.ProductCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.MYv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50677MYv {
    public static boolean A00;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r2.equals(com.instagram.pendingmedia.model.UserStoryTarget.A09) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A02(X.ACA r4) {
        /*
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            boolean r0 = r4.A01()
            r3 = 1
            if (r0 != 0) goto L41
            boolean r0 = r4.A00()
            if (r0 != 0) goto L41
            com.instagram.pendingmedia.model.UserStoryTarget r2 = r4.A01
            if (r2 == 0) goto L3f
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A02
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L32
            java.lang.String r1 = r2.CBn()
            java.lang.String r0 = "CLOSE_FRIENDS_WITH_BLACKLIST"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L32
            com.instagram.pendingmedia.model.UserStoryTarget r0 = com.instagram.pendingmedia.model.UserStoryTarget.A09
            boolean r1 = r2.equals(r0)
            r0 = 0
            if (r1 == 0) goto L33
        L32:
            r0 = 1
        L33:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L37:
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r3)
            if (r0 == 0) goto L3e
            r3 = 2
        L3e:
            return r3
        L3f:
            r0 = 0
            goto L37
        L41:
            r3 = 3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC50677MYv.A02(X.ACA):int");
    }

    public static final int A03(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                return 1;
            }
            if (intValue == 0) {
                return 2;
            }
        }
        return -1;
    }

    public static final AnonymousClass249 A05(int i) {
        if (i != 1) {
            if (i != 2) {
                return AnonymousClass249.OTHER;
            }
            return AnonymousClass249.VIDEO;
        }
        return AnonymousClass249.PHOTO;
    }

    public static final OTS A09(List list) {
        ReelCTA reelCTA;
        String A002;
        String str;
        Object obj = null;
        if (list != null && (reelCTA = (ReelCTA) AbstractC001800i.A0J(list)) != null) {
            if (C6T4.A02(reelCTA) != null) {
                A002 = C6T4.A02(reelCTA);
                str = "web_link";
            } else if (C6T4.A01(reelCTA) != null) {
                A002 = C6T4.A01(reelCTA);
                str = "igtv";
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (C6T4.A00((ReelCTA) next) != null) {
                        obj = next;
                        break;
                    }
                }
                ReelCTA reelCTA2 = (ReelCTA) obj;
                if (reelCTA2 != null) {
                    A002 = C6T4.A00(reelCTA2);
                    str = "effect";
                }
            }
            return new OTS(str, A002);
        }
        return OTS.A02;
    }

    public static final String A0B(AnonymousClass840 anonymousClass840) {
        C88Z c88z;
        C14360o3.A0B(anonymousClass840, 0);
        C81M A02 = anonymousClass840.A02.A01.A02();
        if (A02 != null && (c88z = A02.A06) != null) {
            return c88z.A00;
        }
        return null;
    }

    public static final HashMap A0D(UserSession userSession, List list) {
        MusicOverlayStickerModel musicOverlayStickerModel;
        String str;
        C14360o3.A0B(userSession, 0);
        C84823qW A002 = C48r.A00(EnumC75383a5.A0s, list);
        if (A002 == null || (musicOverlayStickerModel = A002.A0v) == null) {
            return null;
        }
        HashMap A1G = AbstractC166987dD.A1G();
        String str2 = musicOverlayStickerModel.A0S;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        A1G.put("audio_asset_id", str2);
        String str4 = musicOverlayStickerModel.A0m;
        if (str4 == null) {
            str4 = "";
        }
        A1G.put("song_name", str4);
        String str5 = musicOverlayStickerModel.A0Y;
        if (str5 == null) {
            str5 = "";
        }
        A1G.put("artist_name", str5);
        A1G.put(TraceFieldType.StartTime, String.valueOf(musicOverlayStickerModel.A0K));
        Integer num = musicOverlayStickerModel.A0O;
        if (num == null) {
            AbstractC12120kG.A07("MusicLoggerHelper", "musicStickerModel.getOverlapDurationMs() is null", null);
            num = AbstractC25227BEk.A0o();
        }
        A1G.put("length", num.toString());
        MusicProduct musicProduct = musicOverlayStickerModel.A02;
        if (musicProduct == null || (str = AbstractC65993Txo.A00(musicProduct)) == null) {
            str = "";
        }
        A1G.put("product", str);
        String str6 = musicOverlayStickerModel.A0U;
        if (str6 == null) {
            str6 = "";
        }
        A1G.put("browse_session_id", str6);
        String str7 = musicOverlayStickerModel.A0Q;
        if (str7 != null) {
            str3 = str7;
        }
        A1G.put("alacorn_session_id", str3);
        return A1G;
    }

    public static final void A0G(UserSession userSession, C55U c55u, boolean z) {
        EnumC193318hB enumC193318hB;
        C14360o3.A0B(c55u, 1);
        C449124v c449124v = AnonymousClass229.A01(userSession).A0A;
        if (c55u == C81S.A00) {
            enumC193318hB = EnumC193318hB.A07;
        } else if (c55u instanceof C81V) {
            enumC193318hB = EnumC193318hB.A02;
        } else if (c55u == C128535rM.A00) {
            enumC193318hB = EnumC193318hB.A03;
        } else if (c55u == C1811281o.A00) {
            enumC193318hB = EnumC193318hB.A05;
        } else {
            enumC193318hB = EnumC193318hB.A08;
        }
        c449124v.A0Y(enumC193318hB, c55u.A00, null, z);
    }

    public static final void A0H(UserSession userSession, Integer num) {
        C14360o3.A0B(userSession, 0);
        C22C A01 = AnonymousClass229.A01(userSession);
        int A03 = A03(num);
        C448724r c448724r = A01.A0F;
        C22M c22m = c448724r.A04;
        c22m.A01 = A03;
        InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
        MSW.A1N(C81X.A0Y, A0M);
        MSW.A1V(A0M, "IG_CAMERA_SWITCH_TAP_BUTTON");
        AbstractC166987dD.A1S(A0M, MSX.A0f(c22m));
        AbstractC167007dF.A10(A0M, c448724r);
        int i = 1;
        if (A03 != 1) {
            i = 2;
        }
        AbstractC50522MSa.A17(A0M, i);
        AbstractC167007dF.A11(A0M, c448724r);
        AbstractC167017dG.A1A(c22m.A09, A0M);
        MSX.A1G(A0M, c22m);
        AbstractC167017dG.A1B(A0M);
        MSW.A1M(EnumC50631MWs.A0J, A0M);
        AbstractC167017dG.A1C(A0M);
    }

    public static final int A00(C8PM c8pm) {
        String A002;
        if (c8pm != null && (A002 = c8pm.A00()) != null) {
            InterfaceC09390do interfaceC09390do = AbstractC13670mt.A09;
            return A002.length();
        }
        return 0;
    }

    public static final AnonymousClass249 A06(EnumC198268pb enumC198268pb) {
        if (enumC198268pb != null) {
            int ordinal = enumC198268pb.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return AnonymousClass249.VIDEO;
                }
            } else {
                return AnonymousClass249.PHOTO;
            }
        }
        return AnonymousClass249.OTHER;
    }

    public static final EnumC53371NjM A07(int i) {
        if (i != 10) {
            switch (i) {
                case 1:
                    return EnumC53371NjM.STORY;
                case 2:
                    return EnumC53371NjM.CLOSE_FRIENDS;
                case 3:
                    return EnumC53371NjM.DIRECT;
                case 4:
                    return EnumC53371NjM.BLAST_LIST;
                case 5:
                    return EnumC53371NjM.FACEBOOK;
                case 6:
                    return EnumC53371NjM.FRIENDS_LIST;
                case 7:
                    return EnumC53371NjM.FEED;
                default:
                    AbstractC12120kG.A07("CameraLoggerHelper", "No conversion between CameraAnalyticsConstants.ShareDestination and InstagramCameraShareDestinationTypes", null);
                    return EnumC53371NjM.STORY;
            }
        }
        return EnumC53371NjM.CLIPS;
    }

    public static final EnumC50631MWs A08(Integer num, boolean z) {
        if (z) {
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        return EnumC50631MWs.A06;
                    }
                } else {
                    return EnumC50631MWs.A0E;
                }
            }
            return EnumC50631MWs.A0J;
        }
        return EnumC50631MWs.A0I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r23.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0F(X.C85B r16, com.instagram.common.session.UserSession r17, X.C55U r18, X.C8FR r19, X.C1821585z r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, boolean r29, boolean r30, boolean r31) {
        /*
            r10 = r23
            if (r23 == 0) goto Lb
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto Lc
        Lb:
            r1 = 1
        Lc:
            java.lang.String r6 = "CameraLoggerHelper"
            r0 = 0
            if (r1 == 0) goto L17
            java.lang.String r1 = "Unable to log effect applied with missing effect id"
        L13:
            X.AbstractC12120kG.A07(r6, r1, r0)
            return
        L17:
            r1 = r19
            java.lang.Integer r5 = r1.B0Z(r10)
            if (r5 != 0) goto L30
            java.lang.StringBuilder r2 = X.AbstractC166987dD.A1C()
            java.lang.String r1 = "Could not find effect position for effect id: "
            r2.append(r1)
            r2.append(r10)
        L2b:
            java.lang.String r1 = r2.toString()
            goto L13
        L30:
            r4 = r16
            if (r16 != 0) goto L41
            java.lang.StringBuilder r2 = X.AbstractC166987dD.A1C()
            java.lang.String r1 = "Source is invalid value: "
            r2.append(r1)
            r2.append(r4)
            goto L2b
        L41:
            r3 = r18
            if (r18 != 0) goto L52
            java.lang.StringBuilder r2 = X.AbstractC166987dD.A1C()
            java.lang.String r1 = "Camera Destination is invalid value : "
            r2.append(r1)
            r2.append(r3)
            goto L2b
        L52:
            r1 = r29
            r2 = r22
            X.MWs r8 = A08(r2, r1)
            r7 = r20
            if (r20 == 0) goto Lb5
            com.instagram.user.model.Product r2 = r7.A04()
            if (r2 == 0) goto Lb9
            com.instagram.user.model.User r1 = r2.A0B
            if (r1 == 0) goto Lb3
            java.lang.String r14 = X.AbstractC76433bn.A00(r1)
        L6c:
            java.lang.String r15 = r2.A0H
            com.instagram.user.model.Product r1 = r7.A04()
            if (r1 == 0) goto Lb1
            java.lang.String r2 = r1.A0H
        L76:
            com.instagram.model.shopping.ProductItemWithAR r1 = r7.A01
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r1.A01
            java.lang.String r1 = r1.A0h
            java.lang.Boolean r9 = X.AbstractC43593JPy.A0n(r1, r2)
        L80:
            X.8zI r1 = X.AbstractC189108Zb.A00(r4)
            int r18 = A03(r21)
            X.22C r7 = X.AnonymousClass229.A01(r17)
            int r19 = r5.intValue()
            X.AbstractC191238dS.A00(r3)
            int r21 = X.AbstractC203568zH.A00(r4)
            if (r1 == 0) goto L9d
            java.util.List r0 = X.AbstractC166987dD.A1J(r1)
        L9d:
            r22 = r30
            r23 = r31
            r11 = r24
            r12 = r25
            r13 = r26
            r16 = r27
            r20 = r28
            r17 = r0
            r7.A1Q(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        Lb1:
            r2 = 0
            goto L76
        Lb3:
            r14 = r0
            goto L6c
        Lb5:
            r14 = r0
            r15 = r0
            r9 = r0
            goto L80
        Lb9:
            java.lang.String r1 = "Product is null"
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC50677MYv.A0F(X.85B, com.instagram.common.session.UserSession, X.55U, X.8FR, X.85z, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, boolean):void");
    }

    public static final int A01(EnumC198268pb enumC198268pb) {
        int ordinal = enumC198268pb.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    AbstractC12120kG.A07("CameraLoggerHelper", AbstractC167017dG.A0n(enumC198268pb, "Unsupported MediaType: ", AbstractC166987dD.A1C()), null);
                    return 3;
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    public static final Pair A04(List list, List list2) {
        String str;
        String str2;
        String A0D;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C84823qW c84823qW = (C84823qW) it.next();
                if (C14360o3.A0K(c84823qW.A1l, AbstractC111324zv.A00(265))) {
                    String str3 = c84823qW.A1l;
                    C38820H7m c38820H7m = c84823qW.A0p;
                    if (c38820H7m == null) {
                        A0D = "";
                    } else {
                        ProductCollection productCollection = c38820H7m.A02;
                        if (productCollection != null) {
                            str2 = productCollection.Ap3();
                        } else {
                            str2 = null;
                        }
                        A0D = AnonymousClass001.A0D(str2, '_');
                    }
                    str = AnonymousClass001.A0R(str3, A0D);
                } else {
                    str = c84823qW.A1l;
                    C14360o3.A0A(str);
                }
                A1E.add(str);
                A1E2.add(c84823qW.A12.A00);
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C84823qW c84823qW2 = (C84823qW) it2.next();
                String str4 = c84823qW2.A1j;
                if (str4 != null) {
                    A1E.add(str4);
                    String str5 = c84823qW2.A1i;
                    if (str5 == null) {
                        str5 = "";
                    }
                    A1E2.add(str5);
                }
            }
        }
        return new Pair(A1E, A1E2);
    }

    public static final ArrayList A0C(CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2) {
        String str;
        String str2;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (cameraAREffect != null && cameraAREffect.A0D() && (str2 = cameraAREffect.A0B) != null) {
            A1E.add(str2);
        }
        if (cameraAREffect2 != null && cameraAREffect2.A0D() && (str = cameraAREffect2.A0B) != null) {
            A1E.add(str);
        }
        return A1E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x027c, code lost:
    
        if (r64.A0L() != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x021a, code lost:
    
        if (r56 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0114, code lost:
    
        if (r64 != null) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101 A[LOOP:2: B:66:0x00fb->B:68:0x0101, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0209 A[LOOP:3: B:89:0x0203->B:91:0x0209, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0229  */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.0sl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo A0A(android.util.Pair r51, X.EnumC33503Erc r52, X.C24H r53, X.C9B8 r54, com.instagram.api.schemas.ACRType r55, com.instagram.camera.effect.models.CameraAREffect r56, com.instagram.common.session.UserSession r57, X.OTS r58, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r59, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r60, X.C8FR r61, X.EnumC198268pb r62, com.instagram.music.common.model.MusicBrowseCategory r63, com.instagram.reels.prompt.model.PromptStickerModel r64, java.lang.Integer r65, java.lang.Integer r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.util.HashMap r77, java.util.List r78, java.util.List r79, java.util.List r80, java.util.List r81, java.util.List r82, java.util.List r83, int r84, int r85, int r86, long r87, boolean r89, boolean r90, boolean r91, boolean r92, boolean r93, boolean r94, boolean r95, boolean r96) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC50677MYv.A0A(android.util.Pair, X.Erc, X.24H, X.9B8, com.instagram.api.schemas.ACRType, com.instagram.camera.effect.models.CameraAREffect, com.instagram.common.session.UserSession, X.OTS, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.8FR, X.8pb, com.instagram.music.common.model.MusicBrowseCategory, com.instagram.reels.prompt.model.PromptStickerModel, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, int, int, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo");
    }

    public static final void A0E(EnumC53371NjM enumC53371NjM, UserSession userSession, C55U c55u, ShareMediaLoggingInfo shareMediaLoggingInfo, CreationLayoutConfig creationLayoutConfig, Boolean bool, Integer num, Long l, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        EnumC190198bd enumC190198bd;
        List list4;
        List list5;
        List list6;
        AbstractC167007dF.A1D(userSession, 0, enumC53371NjM);
        AbstractC25233BEq.A0y(5, c55u, str, shareMediaLoggingInfo);
        Integer num2 = shareMediaLoggingInfo.A0H;
        Integer num3 = shareMediaLoggingInfo.A0I;
        new C9B8(0, 0, 7, 0, false);
        if (num2 != null && num3 != null) {
            int intValue = num2.intValue();
            int intValue2 = num3.intValue();
            new C9B8(AbstractC25230BEn.A1S(intValue, intValue2), intValue, intValue2, 0);
        }
        int A002 = AbstractC449424y.A00(userSession, num, shareMediaLoggingInfo.A04);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap hashMap = shareMediaLoggingInfo.A0b;
        if (hashMap != null) {
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                AbstractC43594JPz.A1S(A1G, (Map.Entry) AbstractC166997dE.A0l(A14));
            }
        }
        C449124v c449124v = AnonymousClass229.A01(userSession).A0A;
        MYO A03 = AbstractC449424y.A03(shareMediaLoggingInfo.A04);
        AnonymousClass249 A05 = A05(shareMediaLoggingInfo.A05);
        int A032 = A03(Integer.valueOf(shareMediaLoggingInfo.A01));
        int i = shareMediaLoggingInfo.A03;
        List list7 = shareMediaLoggingInfo.A0g;
        List list8 = shareMediaLoggingInfo.A0h;
        List list9 = shareMediaLoggingInfo.A0f;
        HashMap hashMap2 = shareMediaLoggingInfo.A0a;
        List list10 = shareMediaLoggingInfo.A0j;
        boolean z = shareMediaLoggingInfo.A0v;
        int i2 = shareMediaLoggingInfo.A06;
        List list11 = shareMediaLoggingInfo.A0l;
        List list12 = shareMediaLoggingInfo.A0m;
        Pair A003 = shareMediaLoggingInfo.A00();
        String str5 = shareMediaLoggingInfo.A0L;
        String str6 = shareMediaLoggingInfo.A0M;
        String str7 = shareMediaLoggingInfo.A0N;
        EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0I;
        boolean z2 = shareMediaLoggingInfo.A0x;
        MediaTransformation mediaTransformation = shareMediaLoggingInfo.A0C;
        Integer num4 = shareMediaLoggingInfo.A0F;
        boolean z3 = shareMediaLoggingInfo.A0y;
        String str8 = shareMediaLoggingInfo.A0O;
        if (str8 != null && str8.length() != 0) {
            enumC190198bd = EnumC190198bd.valueOf(str8);
        } else {
            enumC190198bd = null;
        }
        List list13 = shareMediaLoggingInfo.A0d;
        GallerySuggestionsInfo gallerySuggestionsInfo = shareMediaLoggingInfo.A0D;
        Long A0W = AbstractC37302Gc3.A0W(str4);
        boolean z4 = shareMediaLoggingInfo.A12;
        String str9 = shareMediaLoggingInfo.A0X;
        int i3 = shareMediaLoggingInfo.A07;
        boolean z5 = shareMediaLoggingInfo.A10;
        String str10 = shareMediaLoggingInfo.A0K;
        List list14 = shareMediaLoggingInfo.A0i;
        String str11 = shareMediaLoggingInfo.A0U;
        String str12 = shareMediaLoggingInfo.A0T;
        String str13 = shareMediaLoggingInfo.A0Q;
        String str14 = shareMediaLoggingInfo.A0W;
        Long l2 = shareMediaLoggingInfo.A0J;
        if (l != null) {
            list4 = AbstractC43594JPz.A10(l.longValue());
        } else {
            list4 = null;
        }
        if (str3 != null) {
            list5 = AbstractC166987dD.A1J(str3);
        } else {
            list5 = null;
        }
        c449124v.A0S(A003, null, null, A03, A05, enumC190198bd, enumC53371NjM, enumC50631MWs, null, null, c55u, mediaTransformation, gallerySuggestionsInfo, bool, null, null, num4, null, A0W, l2, str5, str6, str7, null, str5, str, null, null, str9, str10, str11, str12, str13, str2, str14, null, list, list7, list8, list9, list10, list11, list12, list13, null, list2, list3, list14, null, list4, list5, hashMap2, A032, A002, i, i2, i3, z, z2, z3, false, false, z4, z5, false, false);
        C449124v c449124v2 = AnonymousClass229.A01(userSession).A0A;
        int i4 = shareMediaLoggingInfo.A04;
        MYO A033 = AbstractC449424y.A03(i4);
        AnonymousClass249 A052 = A05(shareMediaLoggingInfo.A05);
        int A034 = A03(Integer.valueOf(shareMediaLoggingInfo.A01));
        int i5 = shareMediaLoggingInfo.A03;
        List list15 = shareMediaLoggingInfo.A0g;
        List list16 = shareMediaLoggingInfo.A0h;
        List list17 = shareMediaLoggingInfo.A0f;
        HashMap hashMap3 = shareMediaLoggingInfo.A0a;
        List list18 = shareMediaLoggingInfo.A0j;
        boolean z6 = shareMediaLoggingInfo.A0v;
        int i6 = shareMediaLoggingInfo.A06;
        List list19 = shareMediaLoggingInfo.A0l;
        List list20 = shareMediaLoggingInfo.A0m;
        Pair A004 = shareMediaLoggingInfo.A00();
        String str15 = shareMediaLoggingInfo.A0L;
        String str16 = shareMediaLoggingInfo.A0M;
        String str17 = shareMediaLoggingInfo.A0N;
        boolean z7 = shareMediaLoggingInfo.A0x;
        MediaTransformation mediaTransformation2 = shareMediaLoggingInfo.A0C;
        Integer num5 = shareMediaLoggingInfo.A0F;
        boolean z8 = shareMediaLoggingInfo.A0y;
        List list21 = shareMediaLoggingInfo.A0d;
        GallerySuggestionsInfo gallerySuggestionsInfo2 = shareMediaLoggingInfo.A0D;
        List A1J = AbstractC166987dD.A1J(enumC53371NjM);
        EnumC33503Erc A02 = AbstractC449424y.A02(shareMediaLoggingInfo.A00);
        ACRType aCRType = shareMediaLoggingInfo.A0A;
        boolean z9 = shareMediaLoggingInfo.A12;
        String str18 = shareMediaLoggingInfo.A0X;
        int i7 = shareMediaLoggingInfo.A07;
        boolean z10 = shareMediaLoggingInfo.A10;
        MediaUploadMetadata mediaUploadMetadata = shareMediaLoggingInfo.A0B;
        List list22 = shareMediaLoggingInfo.A0i;
        String str19 = shareMediaLoggingInfo.A0U;
        String str20 = shareMediaLoggingInfo.A0T;
        String str21 = shareMediaLoggingInfo.A0Q;
        String str22 = shareMediaLoggingInfo.A0P;
        boolean z11 = shareMediaLoggingInfo.A11;
        String str23 = shareMediaLoggingInfo.A0W;
        Long l3 = shareMediaLoggingInfo.A0J;
        if (l != null) {
            list6 = AbstractC43594JPz.A10(l.longValue());
        } else {
            list6 = null;
        }
        c449124v2.A0T(A004, A02, null, A033, A052, enumC50631MWs, null, null, null, aCRType, mediaUploadMetadata, c55u, mediaTransformation2, creationLayoutConfig, gallerySuggestionsInfo2, null, bool, null, null, null, num5, null, null, l3, str15, str16, str17, null, str15, null, str, null, null, str18, str19, str20, str21, str22, str23, null, list, list15, list16, list17, list18, list19, list20, null, list21, null, list2, list3, A1J, list22, null, list6, str3 != null ? AbstractC166987dD.A1J(str3) : null, hashMap3, null, i4, A034, A002, i5, i6, i7, z6, z7, z8, false, false, z9, z10, z11, false, false);
    }
}
