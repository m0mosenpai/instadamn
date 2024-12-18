package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Jhd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC44287Jhd {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC44287Jhd[] A01;
    public static final EnumC44287Jhd A02;
    public static final EnumC44287Jhd A03;
    public static final EnumC44287Jhd A04;

    static {
        EnumC44287Jhd enumC44287Jhd = new EnumC44287Jhd("GALLERY", 0);
        A04 = enumC44287Jhd;
        EnumC44287Jhd enumC44287Jhd2 = new EnumC44287Jhd("CAMERA", 1);
        A03 = enumC44287Jhd2;
        EnumC44287Jhd enumC44287Jhd3 = new EnumC44287Jhd("CAMCORDER", 2);
        A02 = enumC44287Jhd3;
        EnumC44287Jhd[] enumC44287JhdArr = {enumC44287Jhd, enumC44287Jhd2, enumC44287Jhd3, new EnumC44287Jhd("REEL", 3)};
        A01 = enumC44287JhdArr;
        A00 = AbstractC12190kN.A00(enumC44287JhdArr);
    }

    public static EnumC44287Jhd valueOf(String str) {
        return (EnumC44287Jhd) Enum.valueOf(EnumC44287Jhd.class, str);
    }

    public static EnumC44287Jhd[] values() {
        return (EnumC44287Jhd[]) A01.clone();
    }

    public EnumC44287Jhd(String str, int i) {
    }
}
