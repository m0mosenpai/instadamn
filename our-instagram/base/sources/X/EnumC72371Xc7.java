package X;

import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xc7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72371Xc7 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC72371Xc7[] A03;
    public static final EnumC72371Xc7 A04;
    public static final EnumC72371Xc7 A05;
    public static final EnumC72371Xc7 A06;
    public static final EnumC72371Xc7 A07;
    public static final EnumC72371Xc7 A08;
    public final String A00;

    static {
        EnumC72371Xc7 enumC72371Xc7 = new EnumC72371Xc7("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A08 = enumC72371Xc7;
        EnumC72371Xc7 enumC72371Xc72 = new EnumC72371Xc7("BUTTON_OUTLINE", 1, "BUTTON_OUTLINE");
        A05 = enumC72371Xc72;
        EnumC72371Xc7 enumC72371Xc73 = new EnumC72371Xc7("BUTTON_FILLED", 2, "BUTTON_FILLED");
        A04 = enumC72371Xc73;
        EnumC72371Xc7 enumC72371Xc74 = new EnumC72371Xc7("FIT_TO_HEIGHT", 3, "FIT_TO_HEIGHT");
        A06 = enumC72371Xc74;
        EnumC72371Xc7 enumC72371Xc75 = new EnumC72371Xc7("SHOW_INTERACTION_HINT", 4, "SHOW_INTERACTION_HINT");
        A07 = enumC72371Xc75;
        EnumC72371Xc7[] enumC72371Xc7Arr = {enumC72371Xc7, enumC72371Xc72, enumC72371Xc73, enumC72371Xc74, enumC72371Xc75, new EnumC72371Xc7("VIDEO_PLAY_PAUSE_DISABLED", 5, "VIDEO_PLAY_PAUSE_DISABLED")};
        A03 = enumC72371Xc7Arr;
        A02 = AbstractC12190kN.A00(enumC72371Xc7Arr);
        A01 = AbstractC166987dD.A1G();
        for (EnumC72371Xc7 enumC72371Xc76 : values()) {
            A01.put(enumC72371Xc76.A00, enumC72371Xc76);
        }
    }

    public static EnumC72371Xc7 valueOf(String str) {
        return (EnumC72371Xc7) Enum.valueOf(EnumC72371Xc7.class, str);
    }

    public static EnumC72371Xc7[] values() {
        return (EnumC72371Xc7[]) A03.clone();
    }

    public EnumC72371Xc7(String str, int i, String str2) {
        this.A00 = str2;
    }
}
