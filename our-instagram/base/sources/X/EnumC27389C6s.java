package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27389C6s {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27389C6s[] A01;
    public static final EnumC27389C6s A02;
    public static final EnumC27389C6s A03;
    public static final EnumC27389C6s A04;
    public static final EnumC27389C6s A05;

    static {
        EnumC27389C6s enumC27389C6s = new EnumC27389C6s("FULLSCREEN", 0);
        A03 = enumC27389C6s;
        EnumC27389C6s enumC27389C6s2 = new EnumC27389C6s("NOTE", 1);
        A04 = enumC27389C6s2;
        EnumC27389C6s enumC27389C6s3 = new EnumC27389C6s("SAVE", 2);
        A05 = enumC27389C6s3;
        EnumC27389C6s enumC27389C6s4 = new EnumC27389C6s("CUTOUT", 3);
        A02 = enumC27389C6s4;
        EnumC27389C6s[] enumC27389C6sArr = {enumC27389C6s, enumC27389C6s2, enumC27389C6s3, enumC27389C6s4};
        A01 = enumC27389C6sArr;
        A00 = AbstractC12190kN.A00(enumC27389C6sArr);
    }

    public static EnumC27389C6s valueOf(String str) {
        return (EnumC27389C6s) Enum.valueOf(EnumC27389C6s.class, str);
    }

    public static EnumC27389C6s[] values() {
        return (EnumC27389C6s[]) A01.clone();
    }

    public EnumC27389C6s(String str, int i) {
    }
}
