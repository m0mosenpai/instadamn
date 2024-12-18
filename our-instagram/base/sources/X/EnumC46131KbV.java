package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KbV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46131KbV {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46131KbV[] A01;
    public static final EnumC46131KbV A02;

    static {
        EnumC46131KbV enumC46131KbV = new EnumC46131KbV("FIXED", 0);
        A02 = enumC46131KbV;
        EnumC46131KbV[] enumC46131KbVArr = {enumC46131KbV, new EnumC46131KbV("SCROLLABLE", 1)};
        A01 = enumC46131KbVArr;
        A00 = AbstractC12190kN.A00(enumC46131KbVArr);
    }

    public static EnumC46131KbV valueOf(String str) {
        return (EnumC46131KbV) Enum.valueOf(EnumC46131KbV.class, str);
    }

    public static EnumC46131KbV[] values() {
        return (EnumC46131KbV[]) A01.clone();
    }

    public EnumC46131KbV(String str, int i) {
    }
}
