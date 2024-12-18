package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.StoryMusicPickTappableDataIntf;
import com.instagram.api.schemas.StoryPromptDisablementState;
import com.instagram.api.schemas.TrackData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Hu5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40301Hu5 {
    public static Map A00(StoryMusicPickTappableDataIntf storyMusicPickTappableDataIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (storyMusicPickTappableDataIntf.Adc() != null) {
            TrackData Adc = storyMusicPickTappableDataIntf.Adc();
            if (Adc != null) {
                treeUpdaterJNI = Adc.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(MediaStreamTrack.AUDIO_TRACK_KIND, treeUpdaterJNI);
        }
        if (storyMusicPickTappableDataIntf.AeC() != null) {
            A1I.put("author_user_pk", storyMusicPickTappableDataIntf.AeC());
        }
        if (storyMusicPickTappableDataIntf.Ay6() != null) {
            StoryPromptDisablementState Ay6 = storyMusicPickTappableDataIntf.Ay6();
            C14360o3.A0B(Ay6, 0);
            A1I.put("disablement_state", Ay6.A00);
        }
        if (storyMusicPickTappableDataIntf.B48() != null) {
            List B48 = storyMusicPickTappableDataIntf.B48();
            ArrayList A0q = AbstractC167017dG.A0q(B48);
            Iterator it = B48.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("facepile_top_participants", A0q);
        }
        if (storyMusicPickTappableDataIntf.getId() != null) {
            AbstractC37300Gc1.A12(storyMusicPickTappableDataIntf.getId(), A1I);
        }
        if (storyMusicPickTappableDataIntf.getMediaId() != null) {
            AbstractC37300Gc1.A18(storyMusicPickTappableDataIntf.getMediaId(), A1I);
        }
        if (storyMusicPickTappableDataIntf.BZw() != null) {
            OriginalSoundDataIntf BZw = storyMusicPickTappableDataIntf.BZw();
            if (BZw != null) {
                treeUpdaterJNI2 = BZw.F7o();
            }
            A1I.put("original_sound_info", treeUpdaterJNI2);
        }
        storyMusicPickTappableDataIntf.BbW();
        A1I.put("participant_count", Integer.valueOf(storyMusicPickTappableDataIntf.BbW()));
        if (storyMusicPickTappableDataIntf.Bfc() != null) {
            A1I.put("prefilled_music_search_text", storyMusicPickTappableDataIntf.Bfc());
        }
        if (storyMusicPickTappableDataIntf.C5d() != null) {
            A1I.put("template_asset", storyMusicPickTappableDataIntf.C5d().F7o());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
