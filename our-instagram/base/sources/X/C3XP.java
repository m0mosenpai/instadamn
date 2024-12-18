package X;

import android.os.Parcelable;
import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalAudioPartMetadata;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfo;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo;
import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfoImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3XP, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3XP {
    public static OriginalSoundData parseFromJson(C16L c16l) {
        C0KX c0kx;
        String str;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            String str2 = null;
            Integer num = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            OriginalSoundConsumptionInfo originalSoundConsumptionInfo = null;
            String str3 = null;
            Integer num2 = null;
            String str4 = null;
            User user = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            String str5 = null;
            Boolean bool12 = null;
            OriginalAudioSubtype originalAudioSubtype = null;
            String str6 = null;
            String str7 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str8 = null;
            Boolean bool13 = null;
            Integer num5 = null;
            Integer num6 = null;
            XpostOriginalSoundFBCreatorInfoImpl xpostOriginalSoundFBCreatorInfoImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("allow_creator_to_rename".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("audio_asset_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
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
                } else if ("audio_parts".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            OriginalAudioPartMetadata parseFromJson2 = AbstractC114435Ek.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("audio_parts_by_filter".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            OriginalAudioPartMetadata parseFromJson3 = AbstractC114435Ek.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("can_remix_be_shared_to_fb".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("can_remix_be_shared_to_fb_expansion".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("consumption_info".equals(A0q)) {
                    originalSoundConsumptionInfo = AbstractC84173p4.parseFromJson(c16l);
                } else if ("dash_manifest".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("duration_in_ms".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("formatted_clips_media_count".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("hide_remixing".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("ig_artist".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("is_audio_automatically_attributed".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("is_eligible_for_audio_effects".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("is_eligible_for_vinyl_sticker".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("is_explicit".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("is_original_audio_download_eligible".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("is_reuse_disabled".equals(A0q)) {
                    bool10 = Boolean.valueOf(c16l.A0d());
                } else if ("is_xpost_from_fb".equals(A0q)) {
                    bool11 = Boolean.valueOf(c16l.A0d());
                } else if ("music_canonical_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("oa_owner_is_music_artist".equals(A0q)) {
                    bool12 = Boolean.valueOf(c16l.A0d());
                } else if ("original_audio_subtype".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    originalAudioSubtype = (OriginalAudioSubtype) OriginalAudioSubtype.A01.get(A1P);
                    if (originalAudioSubtype == null) {
                        originalAudioSubtype = OriginalAudioSubtype.A07;
                    }
                } else if ("original_audio_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("original_media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("overlap_duration_in_ms".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("previous_trend_rank".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("progressive_download_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("should_mute_audio".equals(A0q)) {
                    bool13 = Boolean.valueOf(c16l.A0d());
                } else if ("time_created".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("trend_rank".equals(A0q)) {
                    num6 = Integer.valueOf(c16l.A1D());
                } else if ("xpost_fb_creator_info".equals(A0q)) {
                    xpostOriginalSoundFBCreatorInfoImpl = C47T.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("allow_creator_to_rename", "OriginalSoundData");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (arrayList2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("audio_parts", "OriginalSoundData");
                } else if (originalSoundConsumptionInfo == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("consumption_info", "OriginalSoundData");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("dash_manifest", "OriginalSoundData");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("hide_remixing", "OriginalSoundData");
                } else if (user == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("ig_artist", "OriginalSoundData");
                } else if (bool5 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_audio_automatically_attributed", "OriginalSoundData");
                } else if (bool8 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_explicit", "OriginalSoundData");
                } else if (originalAudioSubtype == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("original_audio_subtype", "OriginalSoundData");
                } else if (str6 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("original_audio_title", "OriginalSoundData");
                } else {
                    if (str7 == null && (c16l instanceof C07950bF)) {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "original_media_id";
                    } else if (str8 != null || !(c16l instanceof C07950bF)) {
                        if (bool13 == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "should_mute_audio";
                        } else {
                            return new OriginalSoundData(originalAudioSubtype, originalSoundConsumptionInfo, xpostOriginalSoundFBCreatorInfoImpl, user, bool3, bool4, bool6, bool7, bool9, bool10, bool11, bool12, num, num2, num3, num4, num5, num6, str2, str3, str4, str5, str6, str7, str8, arrayList, arrayList2, arrayList3, bool.booleanValue(), bool2.booleanValue(), bool5.booleanValue(), bool8.booleanValue(), bool13.booleanValue());
                        }
                    } else {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "progressive_download_url";
                    }
                    c0kx.A00(str, "OriginalSoundData");
                }
            } else {
                ((C07950bF) c16l).A03.A00("audio_asset_id", "OriginalSoundData");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, OriginalSoundData originalSoundData) {
        anonymousClass182.A0d();
        anonymousClass182.A0T("allow_creator_to_rename", originalSoundData.A0S);
        String str = originalSoundData.A0I;
        if (str != null) {
            anonymousClass182.A0S("audio_asset_id", str);
        }
        Integer num = originalSoundData.A0C;
        if (num != null) {
            anonymousClass182.A0Q("audio_asset_start_time_in_ms", num.intValue());
        }
        List<AudioFilterInfo> list = originalSoundData.A0P;
        if (list != null) {
            C16V.A03(anonymousClass182, "audio_filter_infos");
            for (AudioFilterInfo audioFilterInfo : list) {
                if (audioFilterInfo != null) {
                    ADC.A00(anonymousClass182, audioFilterInfo);
                }
            }
            anonymousClass182.A0Z();
        }
        List<OriginalAudioPartMetadata> list2 = originalSoundData.A0Q;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "audio_parts");
            for (OriginalAudioPartMetadata originalAudioPartMetadata : list2) {
                if (originalAudioPartMetadata != null) {
                    AbstractC114435Ek.A00(anonymousClass182, originalAudioPartMetadata);
                }
            }
            anonymousClass182.A0Z();
        }
        List<OriginalAudioPartMetadata> list3 = originalSoundData.A0R;
        if (list3 != null) {
            C16V.A03(anonymousClass182, "audio_parts_by_filter");
            for (OriginalAudioPartMetadata originalAudioPartMetadata2 : list3) {
                if (originalAudioPartMetadata2 != null) {
                    AbstractC114435Ek.A00(anonymousClass182, originalAudioPartMetadata2);
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool = originalSoundData.A04;
        if (bool != null) {
            anonymousClass182.A0T("can_remix_be_shared_to_fb", bool.booleanValue());
        }
        Boolean bool2 = originalSoundData.A05;
        if (bool2 != null) {
            anonymousClass182.A0T("can_remix_be_shared_to_fb_expansion", bool2.booleanValue());
        }
        OriginalSoundConsumptionInfo originalSoundConsumptionInfo = originalSoundData.A01;
        if (originalSoundConsumptionInfo != null) {
            anonymousClass182.A0r("consumption_info");
            anonymousClass182.A0d();
            String str2 = originalSoundConsumptionInfo.A01;
            if (str2 != null) {
                anonymousClass182.A0S("display_media_id", str2);
            }
            anonymousClass182.A0T("is_bookmarked", originalSoundConsumptionInfo.A03);
            anonymousClass182.A0T("is_trending_in_clips", originalSoundConsumptionInfo.A04);
            String str3 = originalSoundConsumptionInfo.A02;
            if (str3 != null) {
                anonymousClass182.A0S("should_mute_audio_reason", str3);
            }
            MusicMuteAudioReason musicMuteAudioReason = originalSoundConsumptionInfo.A00;
            if (musicMuteAudioReason != null) {
                anonymousClass182.A0S("should_mute_audio_reason_type", musicMuteAudioReason.A00);
            }
            anonymousClass182.A0a();
        }
        String str4 = originalSoundData.A0J;
        if (str4 != null) {
            anonymousClass182.A0S("dash_manifest", str4);
        }
        Integer num2 = originalSoundData.A0D;
        if (num2 != null) {
            anonymousClass182.A0Q("duration_in_ms", num2.intValue());
        }
        String str5 = originalSoundData.A0K;
        if (str5 != null) {
            anonymousClass182.A0S("formatted_clips_media_count", str5);
        }
        anonymousClass182.A0T("hide_remixing", originalSoundData.A0T);
        User user = originalSoundData.A03;
        if (user != null) {
            anonymousClass182.A0r("ig_artist");
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        anonymousClass182.A0T("is_audio_automatically_attributed", originalSoundData.A0U);
        Boolean bool3 = originalSoundData.A06;
        if (bool3 != null) {
            anonymousClass182.A0T("is_eligible_for_audio_effects", bool3.booleanValue());
        }
        Boolean bool4 = originalSoundData.A07;
        if (bool4 != null) {
            anonymousClass182.A0T("is_eligible_for_vinyl_sticker", bool4.booleanValue());
        }
        anonymousClass182.A0T("is_explicit", originalSoundData.A0V);
        Boolean bool5 = originalSoundData.A08;
        if (bool5 != null) {
            anonymousClass182.A0T("is_original_audio_download_eligible", bool5.booleanValue());
        }
        Boolean bool6 = originalSoundData.A09;
        if (bool6 != null) {
            anonymousClass182.A0T("is_reuse_disabled", bool6.booleanValue());
        }
        Boolean bool7 = originalSoundData.A0A;
        if (bool7 != null) {
            anonymousClass182.A0T("is_xpost_from_fb", bool7.booleanValue());
        }
        String str6 = originalSoundData.A0L;
        if (str6 != null) {
            anonymousClass182.A0S("music_canonical_id", str6);
        }
        Boolean bool8 = originalSoundData.A0B;
        if (bool8 != null) {
            anonymousClass182.A0T("oa_owner_is_music_artist", bool8.booleanValue());
        }
        OriginalAudioSubtype originalAudioSubtype = originalSoundData.A00;
        if (originalAudioSubtype != null) {
            anonymousClass182.A0S("original_audio_subtype", originalAudioSubtype.A00);
        }
        String str7 = originalSoundData.A0M;
        if (str7 != null) {
            anonymousClass182.A0S("original_audio_title", str7);
        }
        String str8 = originalSoundData.A0N;
        if (str8 != null) {
            anonymousClass182.A0S("original_media_id", str8);
        }
        Integer num3 = originalSoundData.A0E;
        if (num3 != null) {
            anonymousClass182.A0Q("overlap_duration_in_ms", num3.intValue());
        }
        Integer num4 = originalSoundData.A0F;
        if (num4 != null) {
            anonymousClass182.A0Q("previous_trend_rank", num4.intValue());
        }
        String str9 = originalSoundData.A0O;
        if (str9 != null) {
            anonymousClass182.A0S("progressive_download_url", str9);
        }
        anonymousClass182.A0T("should_mute_audio", originalSoundData.A0W);
        Integer num5 = originalSoundData.A0G;
        if (num5 != null) {
            anonymousClass182.A0Q("time_created", num5.intValue());
        }
        Integer num6 = originalSoundData.A0H;
        if (num6 != null) {
            anonymousClass182.A0Q("trend_rank", num6.intValue());
        }
        XpostOriginalSoundFBCreatorInfo xpostOriginalSoundFBCreatorInfo = originalSoundData.A02;
        if (xpostOriginalSoundFBCreatorInfo != null) {
            anonymousClass182.A0r("xpost_fb_creator_info");
            XpostOriginalSoundFBCreatorInfoImpl F46 = xpostOriginalSoundFBCreatorInfo.F46();
            anonymousClass182.A0d();
            String str10 = F46.A00;
            if (str10 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(200), str10);
            }
            String str11 = F46.A01;
            if (str11 != null) {
                anonymousClass182.A0S("creator_profile_picture", str11);
            }
            String str12 = F46.A02;
            if (str12 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(927), str12);
            }
            String str13 = F46.A03;
            if (str13 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(928), str13);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
