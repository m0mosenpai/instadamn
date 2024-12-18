package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ng5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53207Ng5 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53207Ng5[] A02;
    public static final EnumC53207Ng5 A03;
    public static final EnumC53207Ng5 A04;
    public static final EnumC53207Ng5 A05;
    public final String A00;

    static {
        EnumC53207Ng5 enumC53207Ng5 = new EnumC53207Ng5("APP_JOB", 0, "app_job");
        A03 = enumC53207Ng5;
        EnumC53207Ng5 enumC53207Ng52 = new EnumC53207Ng5("AVATAR_EDITOR", 1, "avatar_editor");
        A04 = enumC53207Ng52;
        EnumC53207Ng5 enumC53207Ng53 = new EnumC53207Ng5("AVATAR_SURFACE", 2, "avatar_surface");
        A05 = enumC53207Ng53;
        EnumC53207Ng5[] enumC53207Ng5Arr = {enumC53207Ng5, enumC53207Ng52, enumC53207Ng53, new EnumC53207Ng5("EXTERNAL_SURFACE", 3, "external_surface")};
        A02 = enumC53207Ng5Arr;
        A01 = AbstractC12190kN.A00(enumC53207Ng5Arr);
    }

    public static EnumC53207Ng5 valueOf(String str) {
        return (EnumC53207Ng5) Enum.valueOf(EnumC53207Ng5.class, str);
    }

    public static EnumC53207Ng5[] values() {
        return (EnumC53207Ng5[]) A02.clone();
    }

    public EnumC53207Ng5(String str, int i, String str2) {
        this.A00 = str2;
    }
}
