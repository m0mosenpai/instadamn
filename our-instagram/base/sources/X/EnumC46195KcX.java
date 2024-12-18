package X;

import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46195KcX {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46195KcX[] A03;
    public static final EnumC46195KcX A04;
    public static final EnumC46195KcX A05;
    public static final EnumC46195KcX A06;
    public final String A00;

    static {
        EnumC46195KcX enumC46195KcX = new EnumC46195KcX("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A06 = enumC46195KcX;
        EnumC46195KcX enumC46195KcX2 = new EnumC46195KcX("NO_LOOPING", 1, "NO_LOOPING");
        A05 = enumC46195KcX2;
        EnumC46195KcX enumC46195KcX3 = new EnumC46195KcX("LOOPING", 2, "LOOPING");
        A04 = enumC46195KcX3;
        EnumC46195KcX[] enumC46195KcXArr = {enumC46195KcX, enumC46195KcX2, enumC46195KcX3, new EnumC46195KcX("LOOPING_WITH_CROSS_FADE", 3, "LOOPING_WITH_CROSS_FADE")};
        A03 = enumC46195KcXArr;
        A02 = AbstractC12190kN.A00(enumC46195KcXArr);
        A01 = AbstractC166987dD.A1G();
        for (EnumC46195KcX enumC46195KcX4 : values()) {
            A01.put(enumC46195KcX4.A00, enumC46195KcX4);
        }
    }

    public static EnumC46195KcX valueOf(String str) {
        return (EnumC46195KcX) Enum.valueOf(EnumC46195KcX.class, str);
    }

    public static EnumC46195KcX[] values() {
        return (EnumC46195KcX[]) A03.clone();
    }

    public EnumC46195KcX(String str, int i, String str2) {
        this.A00 = str2;
    }
}
