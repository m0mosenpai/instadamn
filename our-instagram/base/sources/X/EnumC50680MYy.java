package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.MYy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC50680MYy {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC50680MYy[] A02;
    public static final EnumC50680MYy A03;
    public static final EnumC50680MYy A04;
    public final String A00;

    static {
        EnumC50680MYy enumC50680MYy = new EnumC50680MYy("IMAGINE", 0, "META_AI_IMAGINE");
        A03 = enumC50680MYy;
        EnumC50680MYy enumC50680MYy2 = new EnumC50680MYy("TEXT", 1, "META_AI_TEXT");
        A04 = enumC50680MYy2;
        EnumC50680MYy[] enumC50680MYyArr = {enumC50680MYy, enumC50680MYy2};
        A02 = enumC50680MYyArr;
        A01 = AbstractC12190kN.A00(enumC50680MYyArr);
    }

    public static EnumC50680MYy valueOf(String str) {
        return (EnumC50680MYy) Enum.valueOf(EnumC50680MYy.class, str);
    }

    public static EnumC50680MYy[] values() {
        return (EnumC50680MYy[]) A02.clone();
    }

    public EnumC50680MYy(String str, int i, String str2) {
        this.A00 = str2;
    }
}
