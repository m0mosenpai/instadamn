package X;

import com.instagram.api.schemas.LyricsIntf;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf;
import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDictIntf;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf;
import com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

/* renamed from: X.AKi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23124AKi {
    public static final MusicOverlayStickerModel A00(StoryTemplateMusicStickerDictIntf storyTemplateMusicStickerDictIntf) {
        String str;
        String str2;
        int i;
        boolean z;
        boolean z2;
        Integer Azi;
        C22999ABy c22999ABy = new C22999ABy();
        c22999ABy.A08 = storyTemplateMusicStickerDictIntf.AdC();
        c22999ABy.A09 = storyTemplateMusicStickerDictIntf.getAudioAssetId();
        c22999ABy.A06 = storyTemplateMusicStickerDictIntf.getAudioClusterId();
        StoryTemplateMusicAssetInfoDictIntf BVU = storyTemplateMusicStickerDictIntf.BVU();
        MusicCanonicalType musicCanonicalType = null;
        if (BVU != null) {
            str = BVU.getCoverArtworkThumbnailUri();
        } else {
            str = null;
        }
        c22999ABy.A03 = new SimpleImageUrl(str);
        StoryTemplateMusicAssetInfoDictIntf BVU2 = storyTemplateMusicStickerDictIntf.BVU();
        if (BVU2 != null) {
            str2 = BVU2.getCoverArtworkUri();
        } else {
            str2 = null;
        }
        c22999ABy.A02 = new SimpleImageUrl(str2);
        c22999ABy.A07 = "";
        StoryTemplateMusicAssetInfoDictIntf BVU3 = storyTemplateMusicStickerDictIntf.BVU();
        boolean z3 = false;
        if (BVU3 != null && (Azi = BVU3.Azi()) != null) {
            i = Azi.intValue();
        } else {
            i = 0;
        }
        c22999ABy.A00 = i;
        StoryTemplateMusicAssetInfoDictIntf BVU4 = storyTemplateMusicStickerDictIntf.BVU();
        if (BVU4 != null) {
            z = AbstractC166997dE.A1Z(BVU4.BC4(), true);
        } else {
            z = false;
        }
        c22999ABy.A0F = z;
        StoryTemplateMusicAssetInfoDictIntf BVU5 = storyTemplateMusicStickerDictIntf.BVU();
        if (BVU5 != null) {
            z2 = AbstractC166997dE.A1Z(BVU5.CU4(), true);
        } else {
            z2 = false;
        }
        c22999ABy.A0G = z2;
        StoryTemplateMusicAssetInfoDictIntf BVU6 = storyTemplateMusicStickerDictIntf.BVU();
        if (BVU6 != null) {
            String progressiveDownloadUrl = BVU6.getProgressiveDownloadUrl();
            if (progressiveDownloadUrl != null) {
                c22999ABy.A0B = progressiveDownloadUrl;
                StoryTemplateMusicAssetInfoDictIntf BVU7 = storyTemplateMusicStickerDictIntf.BVU();
                if (BVU7 != null) {
                    String title = BVU7.getTitle();
                    if (title != null) {
                        c22999ABy.A0C = title;
                        StoryTemplateMusicAssetInfoDictIntf BVU8 = storyTemplateMusicStickerDictIntf.BVU();
                        if (BVU8 != null) {
                            musicCanonicalType = BVU8.Ae6();
                        }
                        if (musicCanonicalType == MusicCanonicalType.A05) {
                            z3 = true;
                        }
                        c22999ABy.A0I = z3;
                        MusicAssetModel A00 = c22999ABy.A00();
                        MusicProduct musicProduct = MusicProduct.A0L;
                        C14360o3.A0A(A00);
                        return AbstractC23129AMi.A02(musicProduct, A00, Integer.valueOf(storyTemplateMusicStickerDictIntf.getOverlapDurationInMs()), Integer.valueOf(storyTemplateMusicStickerDictIntf.getAudioAssetStartTimeInMs()), AbstractC166997dE.A0n());
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0054, code lost:
    
        if (r0.intValue() < 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9, 36319909903015751L) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007b, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008d, code lost:
    
        if (r3 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(com.instagram.common.session.UserSession r9, com.instagram.reels.prompt.model.PromptStickerModel r10) {
        /*
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r10.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r8 = r0.C2N()
            r7 = 1
            if (r8 == 0) goto Lb0
            com.instagram.api.schemas.StoryTemplateMusicStickerDictIntf r0 = r8.BVo()
            if (r0 == 0) goto L16
            boolean r1 = A02(r0)
            r0 = 1
            if (r1 == 0) goto L17
        L16:
            r0 = 0
        L17:
            r6 = r0 ^ 1
            java.util.List r1 = r8.C2J()
            if (r1 == 0) goto L29
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L91
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L91
        L29:
            r0 = 0
        L2a:
            r5 = r0 ^ 1
            com.instagram.api.schemas.StoryTemplateAssetDictIntf r2 = r8.C5d()
            if (r2 == 0) goto L8f
            com.instagram.model.mediasize.ImageInfo r0 = r2.BGx()
            r1 = 0
            if (r0 == 0) goto L56
            com.instagram.model.mediasize.ImageInfo r0 = r2.BGx()
            if (r0 == 0) goto L88
            java.util.List r0 = r0.AlQ()
        L43:
            boolean r0 = X.AbstractC81033jX.A05(r0)
            if (r0 != 0) goto L56
            java.lang.Integer r0 = r2.CIi()
            if (r0 == 0) goto L56
            int r0 = r0.intValue()
            r4 = 1
            if (r0 >= 0) goto L57
        L56:
            r4 = 0
        L57:
            com.instagram.model.mediasize.ImageInfo r0 = r2.Af9()
            if (r0 == 0) goto L8a
            com.instagram.model.mediasize.ImageInfo r0 = r2.Af9()
            if (r0 == 0) goto L67
            java.util.List r1 = r0.AlQ()
        L67:
            boolean r0 = X.AbstractC81033jX.A05(r1)
            if (r0 != 0) goto L8a
            r3 = 1
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319909903015751(0x8108c4000b1f47, double:3.0321954989810604E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            if (r0 != 0) goto L8b
        L7b:
            r0 = 1
        L7c:
            r0 = r0 ^ 1
            r8.C1C()
            if (r6 == 0) goto Lb0
            if (r5 == 0) goto Lb0
            if (r0 == 0) goto Lb0
            return r7
        L88:
            r0 = r1
            goto L43
        L8a:
            r3 = 0
        L8b:
            if (r4 != 0) goto L8f
            if (r3 == 0) goto L7b
        L8f:
            r0 = 0
            goto L7c
        L91:
            java.util.Iterator r1 = r1.iterator()
        L95:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf r0 = (com.instagram.api.schemas.StoryTemplateStaticOverlayDictIntf) r0
            com.instagram.api.schemas.StoryTemplateGiphyStickerDictIntf r0 = r0.B9t()
            if (r0 == 0) goto L95
            boolean r0 = A01(r0)
            if (r0 != 0) goto L95
            r0 = 1
            goto L2a
        Lb0:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23124AKi.A03(com.instagram.common.session.UserSession, com.instagram.reels.prompt.model.PromptStickerModel):boolean");
    }

    public static final boolean A01(StoryTemplateGiphyStickerDictIntf storyTemplateGiphyStickerDictIntf) {
        StoryTemplateGiphyStickerImageDictIntf BGT;
        String url;
        StoryTemplateGiphyStickerImageDictIntf BGT2;
        String CHh;
        Float A0n;
        StoryTemplateGiphyStickerImageDictIntf BGT3;
        String BDT;
        Float A0n2;
        String B9l = storyTemplateGiphyStickerDictIntf.B9l();
        if (B9l != null && B9l.length() > 0 && (BGT = storyTemplateGiphyStickerDictIntf.BGT()) != null && (url = BGT.getUrl()) != null && url.length() > 0 && (BGT2 = storyTemplateGiphyStickerDictIntf.BGT()) != null && (CHh = BGT2.CHh()) != null && (A0n = AnonymousClass010.A0n(CHh)) != null && A0n.floatValue() > 0.0f && (BGT3 = storyTemplateGiphyStickerDictIntf.BGT()) != null && (BDT = BGT3.BDT()) != null && (A0n2 = AnonymousClass010.A0n(BDT)) != null && A0n2.floatValue() > 0.0f) {
            return true;
        }
        return false;
    }

    public static final boolean A02(StoryTemplateMusicStickerDictIntf storyTemplateMusicStickerDictIntf) {
        StoryTemplateMusicAssetInfoDictIntf BVU;
        String coverArtworkThumbnailUri;
        StoryTemplateMusicAssetInfoDictIntf BVU2;
        String coverArtworkUri;
        StoryTemplateMusicAssetInfoDictIntf BVU3;
        String progressiveDownloadUrl;
        StoryTemplateMusicAssetInfoDictIntf BVU4;
        String title;
        LyricsIntf BPT;
        List Bd4;
        if (storyTemplateMusicStickerDictIntf.AdC().length() > 0 && storyTemplateMusicStickerDictIntf.getAudioAssetId().length() > 0 && storyTemplateMusicStickerDictIntf.getAudioClusterId().length() > 0 && (BVU = storyTemplateMusicStickerDictIntf.BVU()) != null && (coverArtworkThumbnailUri = BVU.getCoverArtworkThumbnailUri()) != null && coverArtworkThumbnailUri.length() > 0 && (BVU2 = storyTemplateMusicStickerDictIntf.BVU()) != null && (coverArtworkUri = BVU2.getCoverArtworkUri()) != null && coverArtworkUri.length() > 0 && (BVU3 = storyTemplateMusicStickerDictIntf.BVU()) != null && (progressiveDownloadUrl = BVU3.getProgressiveDownloadUrl()) != null && progressiveDownloadUrl.length() > 0 && (BVU4 = storyTemplateMusicStickerDictIntf.BVU()) != null && (title = BVU4.getTitle()) != null && title.length() > 0 && A21.A00(storyTemplateMusicStickerDictIntf.Ayd()).A00().A01 != -1) {
            if (!A21.A00(storyTemplateMusicStickerDictIntf.Ayd()).A02() || ((BPT = storyTemplateMusicStickerDictIntf.BPT()) != null && (Bd4 = BPT.Bd4()) != null && AbstractC166987dD.A1b(Bd4))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
