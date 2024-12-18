package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3gb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC79303gb {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC79303gb[] A01;
    public static final EnumC79303gb A02;
    public static final EnumC79303gb A03;

    static {
        EnumC79303gb enumC79303gb = new EnumC79303gb("SHOW", 0);
        A03 = enumC79303gb;
        EnumC79303gb enumC79303gb2 = new EnumC79303gb("HIDDEN", 1);
        A02 = enumC79303gb2;
        EnumC79303gb[] enumC79303gbArr = {enumC79303gb, enumC79303gb2};
        A01 = enumC79303gbArr;
        A00 = AbstractC12190kN.A00(enumC79303gbArr);
    }

    public static EnumC79303gb valueOf(String str) {
        return (EnumC79303gb) Enum.valueOf(EnumC79303gb.class, str);
    }

    public static EnumC79303gb[] values() {
        return (EnumC79303gb[]) A01.clone();
    }

    public EnumC79303gb(String str, int i) {
    }
}
