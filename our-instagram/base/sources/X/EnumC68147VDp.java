package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68147VDp {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68147VDp[] A03;
    public static final EnumC68147VDp A04;
    public static final EnumC68147VDp A05;
    public static final EnumC68147VDp A06;
    public static final EnumC68147VDp A07;
    public final String A00;

    public static EnumC68147VDp valueOf(String str) {
        return (EnumC68147VDp) Enum.valueOf(EnumC68147VDp.class, str);
    }

    public static EnumC68147VDp[] values() {
        return (EnumC68147VDp[]) A03.clone();
    }

    static {
        EnumC68147VDp enumC68147VDp = new EnumC68147VDp("UNKNOWN", 0, "unknown");
        A07 = enumC68147VDp;
        EnumC68147VDp enumC68147VDp2 = new EnumC68147VDp("PRE_RELEASE", 1, "pre_release");
        A05 = enumC68147VDp2;
        EnumC68147VDp enumC68147VDp3 = new EnumC68147VDp("NEW_RELEASE", 2, "new_release");
        A04 = enumC68147VDp3;
        EnumC68147VDp enumC68147VDp4 = new EnumC68147VDp("SPOTIFY_PLAYLIST_AS_SPOTLIGHT_BANNER_SONG", 3, "spotify_playlist_as_spotlight_banner_song");
        A06 = enumC68147VDp4;
        EnumC68147VDp[] enumC68147VDpArr = {enumC68147VDp, enumC68147VDp2, enumC68147VDp3, enumC68147VDp4};
        A03 = enumC68147VDpArr;
        A02 = AbstractC12190kN.A00(enumC68147VDpArr);
        EnumC68147VDp[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68147VDp enumC68147VDp5 : values) {
            linkedHashMap.put(enumC68147VDp5.A00, enumC68147VDp5);
        }
        A01 = linkedHashMap;
    }

    public EnumC68147VDp(String str, int i, String str2) {
        this.A00 = str2;
    }
}
