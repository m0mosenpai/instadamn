package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RfH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61102RfH {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61102RfH[] A01;
    public static final EnumC61102RfH A02;
    public static final EnumC61102RfH A03;

    static {
        EnumC61102RfH enumC61102RfH = new EnumC61102RfH("SHORTEST", 0);
        A03 = enumC61102RfH;
        EnumC61102RfH enumC61102RfH2 = new EnumC61102RfH("LONGEST", 1);
        A02 = enumC61102RfH2;
        EnumC61102RfH[] enumC61102RfHArr = {enumC61102RfH, enumC61102RfH2, new EnumC61102RfH("NOT_SET", 2)};
        A01 = enumC61102RfHArr;
        A00 = AbstractC12190kN.A00(enumC61102RfHArr);
    }

    public static EnumC61102RfH valueOf(String str) {
        return (EnumC61102RfH) Enum.valueOf(EnumC61102RfH.class, str);
    }

    public static EnumC61102RfH[] values() {
        return (EnumC61102RfH[]) A01.clone();
    }

    public EnumC61102RfH(String str, int i) {
    }
}
