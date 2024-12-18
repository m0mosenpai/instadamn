package X;

import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.AdditionalCandidatesImpl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import com.instagram.model.mediasize.SpriteSheetInfoCandidatesImpl;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1rj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39101rj {
    public static ImageInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            AdditionalCandidatesImpl additionalCandidatesImpl = null;
            SpriteSheetInfoCandidatesImpl spriteSheetInfoCandidatesImpl = null;
            ArrayList arrayList = null;
            SpriteSheetInfoCandidatesImpl spriteSheetInfoCandidatesImpl2 = null;
            ArrayList arrayList2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("additional_candidates".equals(A0q)) {
                    additionalCandidatesImpl = AbstractC39121rl.parseFromJson(c16l);
                } else if ("animated_thumbnail_spritesheet_info_candidates".equals(A0q)) {
                    spriteSheetInfoCandidatesImpl = AbstractC88313wi.parseFromJson(c16l);
                } else if ("candidates".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            ExtendedImageUrl parseFromJson = C17Y.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("scrubber_spritesheet_info_candidates".equals(A0q)) {
                    spriteSheetInfoCandidatesImpl2 = AbstractC88313wi.parseFromJson(c16l);
                } else if ("spins_underlying_media_candidates".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            ExtendedImageUrl parseFromJson2 = C17Y.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                c16l.A0z();
            }
            return new ImageInfoImpl(additionalCandidatesImpl, spriteSheetInfoCandidatesImpl, spriteSheetInfoCandidatesImpl2, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ImageInfoImpl imageInfoImpl) {
        anonymousClass182.A0d();
        AdditionalCandidates additionalCandidates = imageInfoImpl.A00;
        if (additionalCandidates != null) {
            anonymousClass182.A0r("additional_candidates");
            AdditionalCandidatesImpl F5A = additionalCandidates.F5A();
            anonymousClass182.A0d();
            ExtendedImageUrl extendedImageUrl = F5A.A00;
            if (extendedImageUrl != null) {
                anonymousClass182.A0r("first_frame");
                C17Y.A00(anonymousClass182, extendedImageUrl);
            }
            ExtendedImageUrl extendedImageUrl2 = F5A.A01;
            if (extendedImageUrl2 != null) {
                anonymousClass182.A0r("igtv_first_frame");
                C17Y.A00(anonymousClass182, extendedImageUrl2);
            }
            ExtendedImageUrl extendedImageUrl3 = F5A.A02;
            if (extendedImageUrl3 != null) {
                anonymousClass182.A0r("smart_frame");
                C17Y.A00(anonymousClass182, extendedImageUrl3);
            }
            anonymousClass182.A0a();
        }
        SpriteSheetInfoCandidates spriteSheetInfoCandidates = imageInfoImpl.A01;
        if (spriteSheetInfoCandidates != null) {
            anonymousClass182.A0r("animated_thumbnail_spritesheet_info_candidates");
            SpriteSheetInfoCandidatesImpl F5C = spriteSheetInfoCandidates.F5C();
            anonymousClass182.A0d();
            SpritesheetInfo spritesheetInfo = F5C.A00;
            if (spritesheetInfo != null) {
                anonymousClass182.A0r(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                AbstractC88323wj.A00(anonymousClass182, spritesheetInfo.F5D());
            }
            anonymousClass182.A0a();
        }
        List<ExtendedImageUrl> list = imageInfoImpl.A03;
        if (list != null) {
            C16V.A03(anonymousClass182, "candidates");
            for (ExtendedImageUrl extendedImageUrl4 : list) {
                if (extendedImageUrl4 != null) {
                    C17Y.A00(anonymousClass182, extendedImageUrl4);
                }
            }
            anonymousClass182.A0Z();
        }
        SpriteSheetInfoCandidates spriteSheetInfoCandidates2 = imageInfoImpl.A02;
        if (spriteSheetInfoCandidates2 != null) {
            anonymousClass182.A0r("scrubber_spritesheet_info_candidates");
            SpriteSheetInfoCandidatesImpl F5C2 = spriteSheetInfoCandidates2.F5C();
            anonymousClass182.A0d();
            SpritesheetInfo spritesheetInfo2 = F5C2.A00;
            if (spritesheetInfo2 != null) {
                anonymousClass182.A0r(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                AbstractC88323wj.A00(anonymousClass182, spritesheetInfo2.F5D());
            }
            anonymousClass182.A0a();
        }
        List<ExtendedImageUrl> list2 = imageInfoImpl.A04;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "spins_underlying_media_candidates");
            for (ExtendedImageUrl extendedImageUrl5 : list2) {
                if (extendedImageUrl5 != null) {
                    C17Y.A00(anonymousClass182, extendedImageUrl5);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
