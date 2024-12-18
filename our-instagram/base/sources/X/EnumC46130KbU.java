package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KbU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46130KbU {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46130KbU[] A01;
    public static final EnumC46130KbU A02;

    static {
        EnumC46130KbU enumC46130KbU = new EnumC46130KbU("FIXED", 0);
        A02 = enumC46130KbU;
        EnumC46130KbU[] enumC46130KbUArr = {enumC46130KbU, new EnumC46130KbU("SCROLLABLE", 1)};
        A01 = enumC46130KbUArr;
        A00 = AbstractC12190kN.A00(enumC46130KbUArr);
    }

    public static EnumC46130KbU valueOf(String str) {
        return (EnumC46130KbU) Enum.valueOf(EnumC46130KbU.class, str);
    }

    public static EnumC46130KbU[] values() {
        return (EnumC46130KbU[]) A01.clone();
    }

    public EnumC46130KbU(String str, int i) {
    }
}
