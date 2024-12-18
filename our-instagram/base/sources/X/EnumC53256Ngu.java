package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53256Ngu {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53256Ngu[] A03;
    public static final EnumC53256Ngu A04;
    public static final EnumC53256Ngu A05;
    public static final EnumC53256Ngu A06;
    public static final EnumC53256Ngu A07;
    public static final EnumC53256Ngu A08;
    public static final EnumC53256Ngu A09;
    public final float A00;
    public final float A01;

    static {
        EnumC53256Ngu enumC53256Ngu = new EnumC53256Ngu("HIDDEN", 0.0f, 0.0f, 0);
        A06 = enumC53256Ngu;
        EnumC53256Ngu enumC53256Ngu2 = new EnumC53256Ngu("PEEK", 0.244f, 0.244f, 1);
        A07 = enumC53256Ngu2;
        EnumC53256Ngu enumC53256Ngu3 = new EnumC53256Ngu("VIDEO_PREVIEW_LARGE", 0.4105f, 0.32f, 2);
        A08 = enumC53256Ngu3;
        EnumC53256Ngu enumC53256Ngu4 = new EnumC53256Ngu("VIDEO_PREVIEW_SMALL", 0.5358f, 0.4105f, 3);
        A09 = enumC53256Ngu4;
        EnumC53256Ngu enumC53256Ngu5 = new EnumC53256Ngu("FULL", 0.919f, 0.919f, 4);
        A04 = enumC53256Ngu5;
        EnumC53256Ngu enumC53256Ngu6 = new EnumC53256Ngu("FULLY_REVEALED", 1.0f, 1.0f, 5);
        A05 = enumC53256Ngu6;
        EnumC53256Ngu[] enumC53256NguArr = {enumC53256Ngu, enumC53256Ngu2, enumC53256Ngu3, enumC53256Ngu4, enumC53256Ngu5, enumC53256Ngu6};
        A03 = enumC53256NguArr;
        A02 = AbstractC12190kN.A00(enumC53256NguArr);
    }

    public static EnumC53256Ngu valueOf(String str) {
        return (EnumC53256Ngu) Enum.valueOf(EnumC53256Ngu.class, str);
    }

    public static EnumC53256Ngu[] values() {
        return (EnumC53256Ngu[]) A03.clone();
    }

    public EnumC53256Ngu(String str, float f, float f2, int i) {
        this.A00 = f;
        this.A01 = f2;
    }
}
