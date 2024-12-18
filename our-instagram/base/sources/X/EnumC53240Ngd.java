package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53240Ngd {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53240Ngd[] A02;
    public static final EnumC53240Ngd A03;
    public static final EnumC53240Ngd A04;
    public static final EnumC53240Ngd A05;
    public static final EnumC53240Ngd A06;
    public static final EnumC53240Ngd A07;
    public static final EnumC53240Ngd A08;
    public static final EnumC53240Ngd A09;
    public static final EnumC53240Ngd A0A;
    public final String A00;

    static {
        EnumC53240Ngd enumC53240Ngd = new EnumC53240Ngd("NORMAL_EFFECT", 0, "normal_effect");
        A08 = enumC53240Ngd;
        EnumC53240Ngd enumC53240Ngd2 = new EnumC53240Ngd("AVATAR_EFFECT", 1, "avatar_effect");
        A04 = enumC53240Ngd2;
        EnumC53240Ngd enumC53240Ngd3 = new EnumC53240Ngd("MULTIPEER_EFFECT", 2, "multipeer_effect");
        A07 = enumC53240Ngd3;
        EnumC53240Ngd enumC53240Ngd4 = new EnumC53240Ngd("FILTER_EFFECT", 3, "filter_effect");
        A06 = enumC53240Ngd4;
        EnumC53240Ngd enumC53240Ngd5 = new EnumC53240Ngd("TOUCHUP_EFFECT", 4, "touchup_effect");
        A0A = enumC53240Ngd5;
        EnumC53240Ngd enumC53240Ngd6 = new EnumC53240Ngd("AVATAR_BACKGROUND", 5, "avatar_background");
        A03 = enumC53240Ngd6;
        EnumC53240Ngd enumC53240Ngd7 = new EnumC53240Ngd("AVATAR_EMOTE", 6, "avatar_art_emote");
        A05 = enumC53240Ngd7;
        EnumC53240Ngd enumC53240Ngd8 = new EnumC53240Ngd("PRESET_AVATAR_EFFECT", 7, "preset_avatar_effect");
        A09 = enumC53240Ngd8;
        EnumC53240Ngd[] enumC53240NgdArr = {enumC53240Ngd, enumC53240Ngd2, enumC53240Ngd3, enumC53240Ngd4, enumC53240Ngd5, enumC53240Ngd6, enumC53240Ngd7, enumC53240Ngd8};
        A02 = enumC53240NgdArr;
        A01 = AbstractC12190kN.A00(enumC53240NgdArr);
    }

    public static EnumC53240Ngd valueOf(String str) {
        return (EnumC53240Ngd) Enum.valueOf(EnumC53240Ngd.class, str);
    }

    public static EnumC53240Ngd[] values() {
        return (EnumC53240Ngd[]) A02.clone();
    }

    public EnumC53240Ngd(String str, int i, String str2) {
        this.A00 = str2;
    }
}
