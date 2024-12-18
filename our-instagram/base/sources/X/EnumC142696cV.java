package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6cV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC142696cV {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC142696cV[] A01;
    public static final EnumC142696cV A02;
    public static final EnumC142696cV A03;

    static {
        EnumC142696cV enumC142696cV = new EnumC142696cV("CONSTRAINED", 0);
        A02 = enumC142696cV;
        EnumC142696cV enumC142696cV2 = new EnumC142696cV("FLEXIBLE", 1);
        A03 = enumC142696cV2;
        EnumC142696cV[] enumC142696cVArr = {enumC142696cV, enumC142696cV2};
        A01 = enumC142696cVArr;
        A00 = AbstractC12190kN.A00(enumC142696cVArr);
    }

    public static EnumC142696cV valueOf(String str) {
        return (EnumC142696cV) Enum.valueOf(EnumC142696cV.class, str);
    }

    public static EnumC142696cV[] values() {
        return (EnumC142696cV[]) A01.clone();
    }

    public EnumC142696cV(String str, int i) {
    }
}
