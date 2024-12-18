package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xc8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72372Xc8 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC72372Xc8[] A03;
    public static final EnumC72372Xc8 A04;
    public static final EnumC72372Xc8 A05;
    public static final EnumC72372Xc8 A06;
    public static final EnumC72372Xc8 A07;
    public static final EnumC72372Xc8 A08;
    public final String A00;

    static {
        EnumC72372Xc8 enumC72372Xc8 = new EnumC72372Xc8("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A08 = enumC72372Xc8;
        EnumC72372Xc8 enumC72372Xc82 = new EnumC72372Xc8(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 1, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A06 = enumC72372Xc82;
        EnumC72372Xc8 enumC72372Xc83 = new EnumC72372Xc8("BOLD", 2, "BOLD");
        A04 = enumC72372Xc83;
        EnumC72372Xc8 enumC72372Xc84 = new EnumC72372Xc8("ITALIC", 3, "ITALIC");
        A05 = enumC72372Xc84;
        EnumC72372Xc8 enumC72372Xc85 = new EnumC72372Xc8("UNDERLINE", 4, "UNDERLINE");
        A07 = enumC72372Xc85;
        EnumC72372Xc8[] enumC72372Xc8Arr = {enumC72372Xc8, enumC72372Xc82, enumC72372Xc83, enumC72372Xc84, enumC72372Xc85, new EnumC72372Xc8("STRIKETHROUGH", 5, "STRIKETHROUGH")};
        A03 = enumC72372Xc8Arr;
        A02 = AbstractC12190kN.A00(enumC72372Xc8Arr);
        A01 = AbstractC166987dD.A1G();
        for (EnumC72372Xc8 enumC72372Xc86 : values()) {
            A01.put(enumC72372Xc86.A00, enumC72372Xc86);
        }
    }

    public static EnumC72372Xc8 valueOf(String str) {
        return (EnumC72372Xc8) Enum.valueOf(EnumC72372Xc8.class, str);
    }

    public static EnumC72372Xc8[] values() {
        return (EnumC72372Xc8[]) A03.clone();
    }

    public EnumC72372Xc8(String str, int i, String str2) {
        this.A00 = str2;
    }
}
