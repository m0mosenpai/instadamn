package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53221NgJ {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53221NgJ[] A03;
    public static final EnumC53221NgJ A04;
    public static final EnumC53221NgJ A05;
    public static final EnumC53221NgJ A06;
    public final String A00;

    static {
        EnumC53221NgJ enumC53221NgJ = new EnumC53221NgJ("ARCHIVE", 0, "archive");
        A04 = enumC53221NgJ;
        EnumC53221NgJ enumC53221NgJ2 = new EnumC53221NgJ("DO_NOT_ARCHIVE", 1, "do_not_archive");
        A05 = enumC53221NgJ2;
        EnumC53221NgJ enumC53221NgJ3 = new EnumC53221NgJ("UNKNOWN", 2, "unknown");
        A06 = enumC53221NgJ3;
        EnumC53221NgJ[] enumC53221NgJArr = {enumC53221NgJ, enumC53221NgJ2, enumC53221NgJ3};
        A03 = enumC53221NgJArr;
        A02 = AbstractC12190kN.A00(enumC53221NgJArr);
        EnumC53221NgJ[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC53221NgJ enumC53221NgJ4 : values) {
            A18.put(enumC53221NgJ4.A00, enumC53221NgJ4);
        }
        A01 = A18;
    }

    public static EnumC53221NgJ valueOf(String str) {
        return (EnumC53221NgJ) Enum.valueOf(EnumC53221NgJ.class, str);
    }

    public static EnumC53221NgJ[] values() {
        return (EnumC53221NgJ[]) A03.clone();
    }

    public EnumC53221NgJ(String str, int i, String str2) {
        this.A00 = str2;
    }
}
