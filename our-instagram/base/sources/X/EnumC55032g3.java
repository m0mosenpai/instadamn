package X;

import java.util.Locale;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2g3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC55032g3 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC55032g3[] A02;
    public static final EnumC55032g3 A03;
    public static final EnumC55032g3 A04 = new EnumC55032g3("LIGHT_MODE", 0, "image");
    public final String A00;

    static {
        EnumC55032g3 enumC55032g3 = new EnumC55032g3("DARK_MODE", 1, "dark_mode_image");
        A03 = enumC55032g3;
        EnumC55032g3[] enumC55032g3Arr = {A04, enumC55032g3};
        A02 = enumC55032g3Arr;
        A01 = AbstractC12190kN.A00(enumC55032g3Arr);
    }

    public static EnumC55032g3 valueOf(String str) {
        return (EnumC55032g3) Enum.valueOf(EnumC55032g3.class, str);
    }

    public static EnumC55032g3[] values() {
        return (EnumC55032g3[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC55032g3(String str, int i, String str2) {
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        this.A00 = lowerCase;
    }
}
