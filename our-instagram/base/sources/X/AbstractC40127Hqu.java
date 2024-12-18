package X;

import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.ImmutablePandoOriginalSoundData;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hqu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40127Hqu {
    public static OriginalSoundDataIntf A00(OriginalAudioSubtype originalAudioSubtype, OriginalSoundConsumptionInfoIntf originalSoundConsumptionInfoIntf, OriginalSoundDataIntf originalSoundDataIntf, XpostOriginalSoundFBCreatorInfo xpostOriginalSoundFBCreatorInfo, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = null;
        int A00 = AbstractC37301Gc2.A00(new C37761pD(null));
        if (originalSoundDataIntf instanceof ImmutablePandoOriginalSoundData) {
            C09530e4[] c09530e4Arr = new C09530e4[33];
            C09530e4 A1L = AbstractC166987dD.A1L("allow_creator_to_rename", Boolean.valueOf(z));
            C09530e4 A1L2 = AbstractC166987dD.A1L("audio_asset_id", str);
            C09530e4 A1L3 = AbstractC166987dD.A1L("audio_asset_start_time_in_ms", num);
            if (list != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AudioFilterInfoIntf audioFilterInfoIntf = (AudioFilterInfoIntf) it.next();
                    if (audioFilterInfoIntf != null) {
                        arrayList.add(audioFilterInfoIntf.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            C09530e4 A1L4 = AbstractC166987dD.A1L("audio_filter_infos", arrayList);
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf = (OriginalAudioPartMetadataIntf) it2.next();
                if (originalAudioPartMetadataIntf != null) {
                    A1E.add(originalAudioPartMetadataIntf.F7o());
                }
            }
            C09530e4 A1L5 = AbstractC166987dD.A1L("audio_parts", A1E);
            if (list3 != null) {
                arrayList2 = AbstractC166987dD.A1E();
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf2 = (OriginalAudioPartMetadataIntf) it3.next();
                    if (originalAudioPartMetadataIntf2 != null) {
                        arrayList2.add(originalAudioPartMetadataIntf2.F7o());
                    }
                }
            } else {
                arrayList2 = null;
            }
            C09530e4 A1L6 = AbstractC166987dD.A1L("audio_parts_by_filter", arrayList2);
            C09530e4 A1L7 = AbstractC166987dD.A1L("can_remix_be_shared_to_fb", bool);
            C09530e4 A1L8 = AbstractC166987dD.A1L("can_remix_be_shared_to_fb_expansion", bool2);
            C09530e4 A1L9 = AbstractC166987dD.A1L("consumption_info", originalSoundConsumptionInfoIntf.F7o());
            C09530e4 A1L10 = AbstractC166987dD.A1L("dash_manifest", str2);
            C09530e4 A1L11 = AbstractC166987dD.A1L("duration_in_ms", num2);
            C09530e4 A1L12 = AbstractC166987dD.A1L("formatted_clips_media_count", str3);
            C09530e4 A1L13 = AbstractC166987dD.A1L("hide_remixing", Boolean.valueOf(z2));
            C09530e4 A1L14 = AbstractC166987dD.A1L("ig_artist", user.A07());
            C09530e4 A1L15 = AbstractC166987dD.A1L("is_audio_automatically_attributed", Boolean.valueOf(z3));
            C09530e4 A1L16 = AbstractC166987dD.A1L("is_eligible_for_audio_effects", bool3);
            C09530e4 A1L17 = AbstractC166987dD.A1L("is_eligible_for_vinyl_sticker", bool4);
            C09530e4 A1L18 = AbstractC166987dD.A1L("is_explicit", Boolean.valueOf(z4));
            C09530e4 A1L19 = AbstractC166987dD.A1L("is_original_audio_download_eligible", bool5);
            C09530e4 A1L20 = AbstractC166987dD.A1L("is_reuse_disabled", bool6);
            C09530e4 A1L21 = AbstractC166987dD.A1L("is_xpost_from_fb", bool7);
            C09530e4 A1L22 = AbstractC166987dD.A1L("music_canonical_id", str4);
            C09530e4 A1L23 = AbstractC166987dD.A1L("oa_owner_is_music_artist", bool8);
            C14360o3.A0B(originalAudioSubtype, 0);
            System.arraycopy(new C09530e4[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, A1L22, A1L23, AbstractC166987dD.A1L("original_audio_subtype", originalAudioSubtype.A00), AbstractC166987dD.A1L("original_audio_title", str5), AbstractC166987dD.A1L("original_media_id", str6), AbstractC166987dD.A1L("overlap_duration_in_ms", num3)}, 0, c09530e4Arr, 0, 27);
            System.arraycopy(new C09530e4[]{AbstractC166987dD.A1L("previous_trend_rank", num4), AbstractC166987dD.A1L("progressive_download_url", str7), AbstractC166987dD.A1L("should_mute_audio", Boolean.valueOf(z5)), AbstractC166987dD.A1L("time_created", num5), AbstractC166987dD.A1L("trend_rank", num6), AbstractC166987dD.A1L(AbstractC111324zv.A00(3325), xpostOriginalSoundFBCreatorInfo != null ? xpostOriginalSoundFBCreatorInfo.F7o() : null)}, 0, c09530e4Arr, 27, 6);
            obj = AbstractC37303Gc4.A06(originalSoundDataIntf, c09530e4Arr);
        } else {
            ArrayList arrayList4 = null;
            C1DY A0C = AbstractC37302Gc3.A0C(A00);
            if (list != null) {
                arrayList3 = AbstractC167007dF.A0i(list);
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((AudioFilterInfoIntf) it4.next()).Er1());
                }
            }
            ArrayList A0i = AbstractC167007dF.A0i(list2);
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                A0i.add(((OriginalAudioPartMetadataIntf) it5.next()).Exg(A0C));
            }
            if (list3 != null) {
                arrayList4 = AbstractC167007dF.A0i(list3);
                Iterator it6 = list3.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(((OriginalAudioPartMetadataIntf) it6.next()).Exg(A0C));
                }
            }
            obj = new OriginalSoundData(originalAudioSubtype, originalSoundConsumptionInfoIntf.Exh(), xpostOriginalSoundFBCreatorInfo != null ? xpostOriginalSoundFBCreatorInfo.F46() : null, user, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, num, num2, num3, num4, num5, num6, str, str2, str3, str4, str5, str6, str7, arrayList3, A0i, arrayList4, z, z2, z3, z4, z5);
        }
        return (OriginalSoundDataIntf) obj;
    }
}
