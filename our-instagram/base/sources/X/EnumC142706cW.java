package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6cW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC142706cW {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC142706cW[] A01;
    public static final EnumC142706cW A02;
    public static final EnumC142706cW A03;

    static {
        EnumC142706cW enumC142706cW = new EnumC142706cW("START_SEGMENT", 0);
        A03 = enumC142706cW;
        EnumC142706cW enumC142706cW2 = new EnumC142706cW("END_SEGMENT", 1);
        A02 = enumC142706cW2;
        EnumC142706cW[] enumC142706cWArr = {enumC142706cW, enumC142706cW2};
        A01 = enumC142706cWArr;
        A00 = AbstractC12190kN.A00(enumC142706cWArr);
    }

    public static EnumC142706cW valueOf(String str) {
        return (EnumC142706cW) Enum.valueOf(EnumC142706cW.class, str);
    }

    public static EnumC142706cW[] values() {
        return (EnumC142706cW[]) A01.clone();
    }

    public EnumC142706cW(String str, int i) {
    }
}
