package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.He5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39595He5 {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC39595He5[] A04;
    public static final EnumC39595He5 A05;
    public static final EnumC39595He5 A06;
    public static final EnumC39595He5 A07;
    public static final EnumC39595He5 A08;
    public static final EnumC39595He5 A09;
    public static final EnumC39595He5 A0A;
    public final int A00;
    public final String A01;
    public final String A02;

    static {
        EnumC39595He5 enumC39595He5 = new EnumC39595He5("RENAME_TOOLTIP", "rename_original_audio_total_times_seen_key", "rename_original_audio_tooltip_last_seen_timestamp_ms_key", 0, 2);
        A07 = enumC39595He5;
        EnumC39595He5 enumC39595He52 = new EnumC39595He5("PARTIAL_ATTRIBUTION_RESTORE_TOOLTIP", "partial_attribution_restore_tooltip_view_total_times_seen_key", null, 1, 1);
        A06 = enumC39595He52;
        EnumC39595He5 enumC39595He53 = new EnumC39595He5("MUSIC_ON_PROFILE_TOOLTIP", "music_on_profile_tooltip_total_times_seen_key", null, 2, 1);
        A05 = enumC39595He53;
        EnumC39595He5 enumC39595He54 = new EnumC39595He5("TRY_AUDIO_FILTER_TOOLTIP", "try_audio_filter_tooltip_total_times_seen_key", null, 3, 1);
        A0A = enumC39595He54;
        EnumC39595He5 enumC39595He55 = new EnumC39595He5("SHARE_TO_NOTE_TOOLTIP", "share_to_note_tooltip_total_times_seen_key", null, 4, 1);
        A08 = enumC39595He55;
        EnumC39595He5 enumC39595He56 = new EnumC39595He5("TRENDING_AUDIO_TOOLTIP", "trending_audio_tooltip_total_times_seen_key", "trending_audio_tooltip_last_seen_timestamp_ms_key", 5, 3);
        A09 = enumC39595He56;
        EnumC39595He5[] enumC39595He5Arr = {enumC39595He5, enumC39595He52, enumC39595He53, enumC39595He54, enumC39595He55, enumC39595He56};
        A04 = enumC39595He5Arr;
        A03 = AbstractC12190kN.A00(enumC39595He5Arr);
    }

    public static EnumC39595He5 valueOf(String str) {
        return (EnumC39595He5) Enum.valueOf(EnumC39595He5.class, str);
    }

    public static EnumC39595He5[] values() {
        return (EnumC39595He5[]) A04.clone();
    }

    public EnumC39595He5(String str, String str2, String str3, int i, int i2) {
        this.A00 = i2;
        this.A02 = str2;
        this.A01 = str3;
    }
}
