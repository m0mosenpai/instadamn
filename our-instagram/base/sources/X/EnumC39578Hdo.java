package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39578Hdo {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39578Hdo[] A03;
    public static final EnumC39578Hdo A04;
    public static final EnumC39578Hdo A05;
    public static final EnumC39578Hdo A06;
    public static final EnumC39578Hdo A07;
    public static final EnumC39578Hdo A08;
    public static final EnumC39578Hdo A09;
    public final String A00;

    public static EnumC39578Hdo valueOf(String str) {
        return (EnumC39578Hdo) Enum.valueOf(EnumC39578Hdo.class, str);
    }

    public static EnumC39578Hdo[] values() {
        return (EnumC39578Hdo[]) A03.clone();
    }

    static {
        EnumC39578Hdo enumC39578Hdo = new EnumC39578Hdo("SONG_NOT_AVAILABLE", 0, "song_not_available");
        A08 = enumC39578Hdo;
        EnumC39578Hdo enumC39578Hdo2 = new EnumC39578Hdo("OUTSIDE_TERRITORY", 1, "outside_territory");
        A07 = enumC39578Hdo2;
        EnumC39578Hdo enumC39578Hdo3 = new EnumC39578Hdo("LABEL_GO_DARK", 2, "label_go_dark");
        A04 = enumC39578Hdo3;
        EnumC39578Hdo enumC39578Hdo4 = new EnumC39578Hdo("MUSIC_RIGHTS_NOT_LAUNCHED_TO_COUNTRY", 3, "music_rights_not_launched_to_country");
        A05 = enumC39578Hdo4;
        EnumC39578Hdo enumC39578Hdo5 = new EnumC39578Hdo("ORIGINAL_AUDIO_MUTED", 4, "original_audio_muted");
        A06 = enumC39578Hdo5;
        EnumC39578Hdo enumC39578Hdo6 = new EnumC39578Hdo("UNKNOWN", 5, "unknown");
        A09 = enumC39578Hdo6;
        EnumC39578Hdo[] enumC39578HdoArr = {enumC39578Hdo, enumC39578Hdo2, enumC39578Hdo3, enumC39578Hdo4, enumC39578Hdo5, enumC39578Hdo6};
        A03 = enumC39578HdoArr;
        A02 = AbstractC12190kN.A00(enumC39578HdoArr);
        EnumC39578Hdo[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39578Hdo enumC39578Hdo7 : values) {
            A18.put(enumC39578Hdo7.A00, enumC39578Hdo7);
        }
        A01 = A18;
    }

    public EnumC39578Hdo(String str, int i, String str2) {
        this.A00 = str2;
    }
}
