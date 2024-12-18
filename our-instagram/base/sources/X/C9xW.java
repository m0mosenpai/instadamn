package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xW, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class C9xW {
    public static Map A00(StoryTemplateMusicAssetInfoDictIntf storyTemplateMusicAssetInfoDictIntf) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyTemplateMusicAssetInfoDictIntf.Ae6() != null) {
            MusicCanonicalType Ae6 = storyTemplateMusicAssetInfoDictIntf.Ae6();
            if (Ae6 != null) {
                str = Ae6.A00;
            } else {
                str = null;
            }
            A1I.put("audio_type", str);
        }
        if (storyTemplateMusicAssetInfoDictIntf.getCoverArtworkThumbnailUri() != null) {
            A1I.put(AbstractC43591JPw.A00(877), storyTemplateMusicAssetInfoDictIntf.getCoverArtworkThumbnailUri());
        }
        if (storyTemplateMusicAssetInfoDictIntf.getCoverArtworkUri() != null) {
            A1I.put(AbstractC43591JPw.A00(878), storyTemplateMusicAssetInfoDictIntf.getCoverArtworkUri());
        }
        if (storyTemplateMusicAssetInfoDictIntf.Azi() != null) {
            A1I.put("duration_in_ms", storyTemplateMusicAssetInfoDictIntf.Azi());
        }
        if (storyTemplateMusicAssetInfoDictIntf.BC4() != null) {
            A1I.put("has_lyrics", storyTemplateMusicAssetInfoDictIntf.BC4());
        }
        if (storyTemplateMusicAssetInfoDictIntf.CU4() != null) {
            A1I.put("is_explicit", storyTemplateMusicAssetInfoDictIntf.CU4());
        }
        if (storyTemplateMusicAssetInfoDictIntf.getProgressiveDownloadUrl() != null) {
            A1I.put("progressive_download_url", storyTemplateMusicAssetInfoDictIntf.getProgressiveDownloadUrl());
        }
        if (storyTemplateMusicAssetInfoDictIntf.getTitle() != null) {
            A1I.put(DialogModule.KEY_TITLE, storyTemplateMusicAssetInfoDictIntf.getTitle());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
