package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ng4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53206Ng4 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53206Ng4[] A02;
    public static final EnumC53206Ng4 A03;
    public static final EnumC53206Ng4 A04;
    public final int A00;

    static {
        EnumC53206Ng4 enumC53206Ng4 = new EnumC53206Ng4("USER_MEDIA", 0, 1);
        A04 = enumC53206Ng4;
        EnumC53206Ng4 enumC53206Ng42 = new EnumC53206Ng4("GALLERY", 1, 2);
        A03 = enumC53206Ng42;
        EnumC53206Ng4[] enumC53206Ng4Arr = {enumC53206Ng4, enumC53206Ng42};
        A02 = enumC53206Ng4Arr;
        A01 = AbstractC12190kN.A00(enumC53206Ng4Arr);
    }

    public static EnumC53206Ng4 valueOf(String str) {
        return (EnumC53206Ng4) Enum.valueOf(EnumC53206Ng4.class, str);
    }

    public static EnumC53206Ng4[] values() {
        return (EnumC53206Ng4[]) A02.clone();
    }

    public EnumC53206Ng4(String str, int i, int i2) {
        this.A00 = i2;
    }
}
