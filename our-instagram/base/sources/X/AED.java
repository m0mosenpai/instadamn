package X;

import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AED {
    public static final String A00(InstagramAudioApplySource instagramAudioApplySource, MusicOverlayStickerModel musicOverlayStickerModel, C47v c47v, String str, List list) {
        String str2;
        float f;
        float f2;
        Object obj;
        StringWriter stringWriter = new StringWriter();
        C17z A0S = AbstractC167007dF.A0S(stringWriter);
        if (list != null && list.size() > 1 && musicOverlayStickerModel != null) {
            A0S.A0r("original");
            A0S.A0d();
            str2 = "volume_level";
            A0S.A0P("volume_level", c47v.A00);
            A0S.A0M(AbstractC111324zv.A00(5031));
            C5JI c5ji = C5JI.A04;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (C5JH c5jh : c47v.A03) {
                if (c5jh.A04 == c5ji) {
                    A1E.add(c5jh);
                }
            }
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                C5JH c5jh2 = (C5JH) it.next();
                A0S.A0d();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (C14360o3.A0K(((MusicOverlayStickerModel) obj).A0b, c5jh2.A06)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                MusicOverlayStickerModel musicOverlayStickerModel2 = (MusicOverlayStickerModel) obj;
                if (musicOverlayStickerModel2 == null) {
                    musicOverlayStickerModel2 = musicOverlayStickerModel;
                }
                A01(A0S, instagramAudioApplySource, musicOverlayStickerModel2, str, c5jh2.A00);
                A0S.A0a();
            }
            A0S.A0Z();
            A0S.A0a();
        } else {
            A0S.A0r("original");
            A0S.A0d();
            str2 = "volume_level";
            A0S.A0P("volume_level", c47v.A00);
            EnumC192868gS enumC192868gS = (EnumC192868gS) c47v.A01.A01;
            if (enumC192868gS != null) {
                A0S.A0M("voice_effects");
                A0S.A0u(enumC192868gS.A04);
                A0S.A0Z();
            }
            List list2 = (List) c47v.A01.A00;
            if (AbstractC166987dD.A1b(list2)) {
                A0S.A0M(AbstractC111324zv.A00(5388));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    String str3 = ((C9ZV) it3.next()).A04;
                    if (str3 != null) {
                        A0S.A0u(str3);
                    }
                }
                A0S.A0Z();
            }
            A0S.A0a();
            if (musicOverlayStickerModel != null) {
                C5JH A00 = c47v.A00(C5JI.A04);
                if (A00 != null) {
                    f = A00.A00;
                } else {
                    f = 1.0f;
                }
                A01(A0S, instagramAudioApplySource, musicOverlayStickerModel, str, f);
            }
        }
        C5JI c5ji2 = C5JI.A0A;
        if (c47v.A00(c5ji2) != null) {
            C5JH A002 = c47v.A00(c5ji2);
            A0S.A0r("voiceover");
            A0S.A0d();
            if (A002 != null) {
                f2 = A002.A00;
            } else {
                f2 = 1.0f;
            }
            A0S.A0P(str2, f2);
            A0S.A0a();
        }
        String str4 = c47v.A02;
        if (str4 != null) {
            A0S.A0S(AbstractC111324zv.A00(5032), str4);
        }
        String A0l = AbstractC167017dG.A0l(A0S, stringWriter);
        C14360o3.A07(A0l);
        return A0l;
    }

    public static final void A01(AnonymousClass182 anonymousClass182, InstagramAudioApplySource instagramAudioApplySource, MusicOverlayStickerModel musicOverlayStickerModel, String str, float f) {
        String str2;
        Boolean bool = musicOverlayStickerModel.A0E;
        Boolean A0b = AbstractC166997dE.A0b();
        if (C14360o3.A0K(bool, A0b)) {
            str2 = "remix";
        } else {
            str2 = "song";
        }
        anonymousClass182.A0r(str2);
        anonymousClass182.A0d();
        anonymousClass182.A0P("volume_level", f);
        boolean A0K = C14360o3.A0K(musicOverlayStickerModel.A0A, A0b);
        String str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        String str4 = "0";
        if (A0K) {
            str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        anonymousClass182.A0S(AbstractC111324zv.A00(457), str4);
        anonymousClass182.A0S("artist_name", musicOverlayStickerModel.A0Y);
        anonymousClass182.A0S("audio_asset_id", musicOverlayStickerModel.A0S);
        anonymousClass182.A0S("audio_cluster_id", musicOverlayStickerModel.A0T);
        anonymousClass182.A0S("track_name", musicOverlayStickerModel.A0m);
        if (C14360o3.A0K(musicOverlayStickerModel.A0G, A0b)) {
            str3 = "0";
        }
        anonymousClass182.A0S("is_picked_precapture", str3);
        if (C14360o3.A0K(bool, A0b)) {
            anonymousClass182.A0S("original_media_id", musicOverlayStickerModel.A0e);
        }
        if (str != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(741), str);
        }
        if (instagramAudioApplySource != null) {
            anonymousClass182.A0Q(AbstractC111324zv.A00(739), instagramAudioApplySource.A00);
        }
        anonymousClass182.A0a();
    }
}
