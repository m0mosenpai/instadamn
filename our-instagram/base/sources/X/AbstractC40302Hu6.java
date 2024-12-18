package X;

import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryTemplateAssetDictIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import java.util.List;

/* renamed from: X.Hu6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40302Hu6 {
    public static StoryMusicPickTappableData A00(OriginalSoundDataIntf originalSoundDataIntf, StoryPromptDisablementState storyPromptDisablementState, StoryTemplateAssetDictIntf storyTemplateAssetDictIntf, TrackData trackData, String str, String str2, String str3, String str4, List list, int i) {
        TrackDataImpl trackDataImpl;
        C1DY A0b = AbstractC25235BEs.A0b(new C37761pD(null));
        if (trackData != null) {
            trackDataImpl = trackData.F3P();
        } else {
            trackDataImpl = null;
        }
        return new StoryMusicPickTappableData(originalSoundDataIntf != null ? originalSoundDataIntf.Exi(A0b) : null, storyPromptDisablementState, storyTemplateAssetDictIntf.F1z(), trackDataImpl, str, str2, str3, str4, list, i);
    }
}
