package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2q3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC60792q3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC60792q3[] A01;
    public static final EnumC60792q3 A02;
    public static final EnumC60792q3 A03;

    static {
        EnumC60792q3 enumC60792q3 = new EnumC60792q3("DEFAULT", 0);
        A02 = enumC60792q3;
        EnumC60792q3 enumC60792q32 = new EnumC60792q3("NIGHT", 1);
        A03 = enumC60792q32;
        EnumC60792q3[] enumC60792q3Arr = {enumC60792q3, enumC60792q32};
        A01 = enumC60792q3Arr;
        A00 = AbstractC12190kN.A00(enumC60792q3Arr);
    }

    public static EnumC60792q3 valueOf(String str) {
        return (EnumC60792q3) Enum.valueOf(EnumC60792q3.class, str);
    }

    public static EnumC60792q3[] values() {
        return (EnumC60792q3[]) A01.clone();
    }

    public EnumC60792q3(String str, int i) {
    }
}
