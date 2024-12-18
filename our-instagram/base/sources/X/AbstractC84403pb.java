package X;

import android.os.Parcelable;
import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.music.common.model.MusicConsumptionModelImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3pb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84403pb {
    public static MusicConsumptionModelImpl parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Integer num = null;
            ArrayList arrayList = null;
            AudioMutingInfo audioMutingInfo = null;
            Boolean bool3 = null;
            String str = null;
            ArrayList arrayList2 = null;
            String str2 = null;
            User user = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Integer num2 = null;
            String str3 = null;
            Integer num3 = null;
            Boolean bool6 = null;
            String str4 = null;
            MusicMuteAudioReason musicMuteAudioReason = null;
            Boolean bool7 = null;
            Integer num4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("allow_media_creation_with_music".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("audio_asset_start_time_in_ms".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("audio_filter_infos".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AudioFilterInfo parseFromJson = ADC.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("audio_muting_info".equals(A0q)) {
                    audioMutingInfo = AbstractC84413pc.parseFromJson(c16l);
                } else if ("contains_lyrics".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("derived_content_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("display_labels".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P2 = null;
                            } else {
                                A1P2 = c16l.A1P();
                            }
                            arrayList2.add(AbstractC106034qH.A00(A1P2));
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("formatted_clips_media_count".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("ig_artist".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("is_bookmarked".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("is_trending_in_clips".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("overlap_duration_in_ms".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("placeholder_profile_pic_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("previous_trend_rank".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("should_allow_music_editing".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("should_mute_audio".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("should_mute_audio_reason".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("should_mute_audio_reason_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    musicMuteAudioReason = AbstractC84183p5.A00(A1P);
                } else if ("should_render_soundwave".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("trend_rank".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (str3 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("placeholder_profile_pic_url", "MusicConsumptionModelImpl");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (str4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("should_mute_audio_reason", "MusicConsumptionModelImpl");
                } else {
                    return new MusicConsumptionModelImpl(audioMutingInfo, musicMuteAudioReason, user, bool2, bool3, bool4, bool5, bool6, bool7, num, num2, num3, num4, str, str2, str3, str4, arrayList, arrayList2, bool.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("should_mute_audio", "MusicConsumptionModelImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, MusicConsumptionModelImpl musicConsumptionModelImpl) {
        anonymousClass182.A0d();
        Boolean bool = musicConsumptionModelImpl.A03;
        if (bool != null) {
            anonymousClass182.A0T("allow_media_creation_with_music", bool.booleanValue());
        }
        Integer num = musicConsumptionModelImpl.A09;
        if (num != null) {
            anonymousClass182.A0Q("audio_asset_start_time_in_ms", num.intValue());
        }
        List<AudioFilterInfo> list = musicConsumptionModelImpl.A0H;
        if (list != null) {
            C16V.A03(anonymousClass182, "audio_filter_infos");
            for (AudioFilterInfo audioFilterInfo : list) {
                if (audioFilterInfo != null) {
                    ADC.A00(anonymousClass182, audioFilterInfo);
                }
            }
            anonymousClass182.A0Z();
        }
        AudioMutingInfo audioMutingInfo = musicConsumptionModelImpl.A00;
        if (audioMutingInfo != null) {
            anonymousClass182.A0r("audio_muting_info");
            AbstractC84413pc.A00(anonymousClass182, audioMutingInfo);
        }
        Boolean bool2 = musicConsumptionModelImpl.A04;
        if (bool2 != null) {
            anonymousClass182.A0T("contains_lyrics", bool2.booleanValue());
        }
        String str = musicConsumptionModelImpl.A0D;
        if (str != null) {
            anonymousClass182.A0S("derived_content_id", str);
        }
        List<AudioMetadataLabels> list2 = musicConsumptionModelImpl.A0I;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "display_labels");
            for (AudioMetadataLabels audioMetadataLabels : list2) {
                if (audioMetadataLabels != null) {
                    anonymousClass182.A0u(audioMetadataLabels.A00);
                }
            }
            anonymousClass182.A0Z();
        }
        String str2 = musicConsumptionModelImpl.A0E;
        if (str2 != null) {
            anonymousClass182.A0S("formatted_clips_media_count", str2);
        }
        User user = musicConsumptionModelImpl.A02;
        if (user != null) {
            anonymousClass182.A0r("ig_artist");
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        Boolean bool3 = musicConsumptionModelImpl.A05;
        if (bool3 != null) {
            anonymousClass182.A0T("is_bookmarked", bool3.booleanValue());
        }
        Boolean bool4 = musicConsumptionModelImpl.A06;
        if (bool4 != null) {
            anonymousClass182.A0T("is_trending_in_clips", bool4.booleanValue());
        }
        Integer num2 = musicConsumptionModelImpl.A0A;
        if (num2 != null) {
            anonymousClass182.A0Q("overlap_duration_in_ms", num2.intValue());
        }
        String str3 = musicConsumptionModelImpl.A0F;
        if (str3 != null) {
            anonymousClass182.A0S("placeholder_profile_pic_url", str3);
        }
        Integer num3 = musicConsumptionModelImpl.A0B;
        if (num3 != null) {
            anonymousClass182.A0Q("previous_trend_rank", num3.intValue());
        }
        Boolean bool5 = musicConsumptionModelImpl.A07;
        if (bool5 != null) {
            anonymousClass182.A0T("should_allow_music_editing", bool5.booleanValue());
        }
        anonymousClass182.A0T("should_mute_audio", musicConsumptionModelImpl.A0J);
        String str4 = musicConsumptionModelImpl.A0G;
        if (str4 != null) {
            anonymousClass182.A0S("should_mute_audio_reason", str4);
        }
        MusicMuteAudioReason musicMuteAudioReason = musicConsumptionModelImpl.A01;
        if (musicMuteAudioReason != null) {
            anonymousClass182.A0S("should_mute_audio_reason_type", musicMuteAudioReason.A00);
        }
        Boolean bool6 = musicConsumptionModelImpl.A08;
        if (bool6 != null) {
            anonymousClass182.A0T("should_render_soundwave", bool6.booleanValue());
        }
        Integer num4 = musicConsumptionModelImpl.A0C;
        if (num4 != null) {
            anonymousClass182.A0Q("trend_rank", num4.intValue());
        }
        anonymousClass182.A0a();
    }
}
