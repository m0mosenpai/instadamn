package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VED {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VED[] A03;
    public static final VED A04;
    public static final VED A05;
    public static final VED A06;
    public static final VED A07;
    public static final VED A08;
    public static final VED A09;
    public static final VED A0A;
    public static final VED A0B;
    public static final VED A0C;
    public static final VED A0D;
    public static final VED A0E;
    public static final VED A0F;
    public static final VED A0G;
    public static final VED A0H;
    public static final VED A0I;
    public static final VED A0J;
    public static final VED A0K;
    public static final VED A0L;
    public static final VED A0M;
    public final String A00;

    public static VED valueOf(String str) {
        return (VED) Enum.valueOf(VED.class, str);
    }

    public static VED[] values() {
        return (VED[]) A03.clone();
    }

    static {
        VED ved = new VED("BOOST_AUDIO_BROWSER", 0, "boost_audio_browser");
        A05 = ved;
        VED ved2 = new VED("CLIPS_CAMERA_FORMAT", 1, "clips_camera_format");
        A06 = ved2;
        VED ved3 = new VED("CLIPS_CAMERA_FORMAT_V2", 2, "clips_camera_format_v2");
        A07 = ved3;
        VED ved4 = new VED("CLIPS_EDIT_METADATA", 3, "clips_edit_metadata");
        A08 = ved4;
        VED ved5 = new VED("AUDIO_GLOBAL_SEARCH", 4, "audio_global_search");
        A04 = ved5;
        VED ved6 = new VED("MEMORY_RESHARE", 5, "memory_reshare");
        A09 = ved6;
        VED ved7 = new VED("MENTION_RESHARE", 6, "mention_reshare");
        A0A = ved7;
        VED ved8 = new VED("MUSIC_AR_EFFECT", 7, "music_ar_effect");
        A0B = ved8;
        VED ved9 = new VED("MUSIC_AR_EFFECT_DEMO", 8, "music_ar_effect_demo");
        A0C = ved9;
        VED ved10 = new VED("MUSIC_CAMERA_FORMAT", 9, "music_camera_format");
        A0D = ved10;
        VED ved11 = new VED("MUSIC_IN_FEED", 10, "music_in_feed");
        A0E = ved11;
        VED ved12 = new VED("MUSIC_NOTES", 11, "music_notes");
        A0F = ved12;
        VED ved13 = new VED("MUSIC_ON_PROFILE", 12, "music_on_profile");
        A0G = ved13;
        VED ved14 = new VED("POST_CAPTURE_STICKER", 13, "post_capture_sticker");
        A0H = ved14;
        VED ved15 = new VED("QUESTION_RESPONSE", 14, "question_response");
        A0I = ved15;
        VED ved16 = new VED("QUESTION_RESPONSE_RESHARE", 15, "question_response_reshare");
        A0J = ved16;
        VED ved17 = new VED("STATUS", 16, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        A0K = ved17;
        VED ved18 = new VED("UNSET", 17, "unset");
        A0M = ved18;
        VED ved19 = new VED("UNKNOWN", 18, "unknown");
        A0L = ved19;
        VED[] vedArr = {ved, ved2, ved3, ved4, ved5, ved6, ved7, ved8, ved9, ved10, ved11, ved12, ved13, ved14, ved15, ved16, ved17, ved18, ved19};
        A03 = vedArr;
        A02 = AbstractC12190kN.A00(vedArr);
        VED[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC37302Gc3.A01(values.length));
        for (VED ved20 : values) {
            linkedHashMap.put(ved20.A00, ved20);
        }
        A01 = linkedHashMap;
    }

    public VED(String str, int i, String str2) {
        this.A00 = str2;
    }
}
