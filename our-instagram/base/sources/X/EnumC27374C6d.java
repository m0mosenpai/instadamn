package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27374C6d {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27374C6d[] A01;
    public static final EnumC27374C6d A02;
    public static final EnumC27374C6d A03;
    public static final EnumC27374C6d A04;
    public static final EnumC27374C6d A05;

    static {
        EnumC27374C6d enumC27374C6d = new EnumC27374C6d("TEMPLATE", 0);
        A05 = enumC27374C6d;
        EnumC27374C6d enumC27374C6d2 = new EnumC27374C6d("CUSTOM", 1);
        A04 = enumC27374C6d2;
        EnumC27374C6d enumC27374C6d3 = new EnumC27374C6d("CREATOR", 2);
        A02 = enumC27374C6d3;
        EnumC27374C6d enumC27374C6d4 = new EnumC27374C6d("CREATOR_AI_COMING_SOON", 3);
        A03 = enumC27374C6d4;
        EnumC27374C6d[] enumC27374C6dArr = {enumC27374C6d, enumC27374C6d2, enumC27374C6d3, enumC27374C6d4};
        A01 = enumC27374C6dArr;
        A00 = AbstractC12190kN.A00(enumC27374C6dArr);
    }

    public static EnumC27374C6d valueOf(String str) {
        return (EnumC27374C6d) Enum.valueOf(EnumC27374C6d.class, str);
    }

    public static EnumC27374C6d[] values() {
        return (EnumC27374C6d[]) A01.clone();
    }

    public EnumC27374C6d(String str, int i) {
    }
}
