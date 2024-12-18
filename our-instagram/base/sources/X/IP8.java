package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes7.dex */
public abstract class IP8 {
    public static StoryMusicPickTappableData parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            TrackDataImpl trackDataImpl = null;
            String str = null;
            StoryPromptDisablementState storyPromptDisablementState = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            OriginalSoundData originalSoundData = null;
            String str4 = null;
            StoryTemplateAssetDict storyTemplateAssetDict = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A0s)) {
                    trackDataImpl = AbstractC84383pX.parseFromJson(c16l);
                } else if ("author_user_pk".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("disablement_state".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    storyPromptDisablementState = AbstractC109304vw.A00(A1P);
                } else if ("facepile_top_participants".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("original_sound_info".equals(A0s)) {
                    originalSoundData = C3XP.parseFromJson(c16l);
                } else if ("participant_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("prefilled_music_search_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("template_asset".equals(A0s)) {
                    storyTemplateAssetDict = AbstractC115275Iy.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("author_user_pk", c16l, "StoryMusicPickTappableData");
            } else if (storyPromptDisablementState != null || !(c16l instanceof C07950bF)) {
                if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("facepile_top_participants", c16l, "StoryMusicPickTappableData");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "StoryMusicPickTappableData");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("media_id", c16l, "StoryMusicPickTappableData");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("participant_count", c16l, "StoryMusicPickTappableData");
                } else if (storyTemplateAssetDict == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("template_asset", c16l, "StoryMusicPickTappableData");
                } else {
                    return new StoryMusicPickTappableData(originalSoundData, storyPromptDisablementState, storyTemplateAssetDict, trackDataImpl, str, str2, str3, str4, arrayList, num.intValue());
                }
            } else {
                AbstractC166997dE.A1V("disablement_state", c16l, "StoryMusicPickTappableData");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, StoryMusicPickTappableData storyMusicPickTappableData) {
        anonymousClass182.A0d();
        TrackData trackData = storyMusicPickTappableData.A04;
        if (trackData != null) {
            anonymousClass182.A0r(MediaStreamTrack.AUDIO_TRACK_KIND);
            AbstractC84383pX.A00(anonymousClass182, trackData.F3P());
        }
        String str = storyMusicPickTappableData.A05;
        if (str != null) {
            anonymousClass182.A0S("author_user_pk", str);
        }
        StoryPromptDisablementState storyPromptDisablementState = storyMusicPickTappableData.A02;
        if (storyPromptDisablementState != null) {
            anonymousClass182.A0S("disablement_state", storyPromptDisablementState.A00);
        }
        List list = storyMusicPickTappableData.A09;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "facepile_top_participants", list);
            while (A0q.hasNext()) {
                AbstractC167017dG.A1G(anonymousClass182, A0q);
            }
            anonymousClass182.A0Z();
        }
        AbstractC37301Gc2.A1D(anonymousClass182, storyMusicPickTappableData.A06);
        String str2 = storyMusicPickTappableData.A07;
        if (str2 != null) {
            anonymousClass182.A0S("media_id", str2);
        }
        OriginalSoundData originalSoundData = storyMusicPickTappableData.A01;
        if (originalSoundData != null) {
            anonymousClass182.A0r("original_sound_info");
            C3XP.A00(anonymousClass182, originalSoundData);
        }
        anonymousClass182.A0Q("participant_count", storyMusicPickTappableData.A00);
        String str3 = storyMusicPickTappableData.A08;
        if (str3 != null) {
            anonymousClass182.A0S("prefilled_music_search_text", str3);
        }
        StoryTemplateAssetDict storyTemplateAssetDict = storyMusicPickTappableData.A03;
        if (storyTemplateAssetDict != null) {
            anonymousClass182.A0r("template_asset");
            AbstractC115275Iy.A00(anonymousClass182, storyTemplateAssetDict);
        }
        anonymousClass182.A0a();
    }
}
