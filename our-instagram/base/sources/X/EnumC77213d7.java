package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3d7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC77213d7 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC77213d7[] A02;
    public static final EnumC77213d7 A03;
    public static final EnumC77213d7 A04;
    public String A00;

    static {
        EnumC77213d7 enumC77213d7 = new EnumC77213d7("SAVED", 0, "save");
        A04 = enumC77213d7;
        EnumC77213d7 enumC77213d72 = new EnumC77213d7("NOT_SAVED", 1, "unsave");
        A03 = enumC77213d72;
        EnumC77213d7[] enumC77213d7Arr = {enumC77213d7, enumC77213d72, new EnumC77213d7("UNKNOWN", 2, "unknown")};
        A02 = enumC77213d7Arr;
        A01 = AbstractC12190kN.A00(enumC77213d7Arr);
    }

    public static EnumC77213d7 valueOf(String str) {
        return (EnumC77213d7) Enum.valueOf(EnumC77213d7.class, str);
    }

    public static EnumC77213d7[] values() {
        return (EnumC77213d7[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC77213d7(String str, int i, String str2) {
        this.A00 = str2;
    }
}
