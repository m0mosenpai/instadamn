package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Jdx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC44072Jdx {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC44072Jdx[] A01;
    public static final EnumC44072Jdx A02;
    public static final EnumC44072Jdx A03;
    public static final EnumC44072Jdx A04;

    static {
        EnumC44072Jdx enumC44072Jdx = new EnumC44072Jdx("CAMERA_ROLL", 0);
        A02 = enumC44072Jdx;
        EnumC44072Jdx enumC44072Jdx2 = new EnumC44072Jdx("GIF", 1);
        A03 = enumC44072Jdx2;
        EnumC44072Jdx enumC44072Jdx3 = new EnumC44072Jdx("SCENE", 2);
        A04 = enumC44072Jdx3;
        EnumC44072Jdx[] enumC44072JdxArr = {enumC44072Jdx, enumC44072Jdx2, enumC44072Jdx3};
        A01 = enumC44072JdxArr;
        A00 = AbstractC12190kN.A00(enumC44072JdxArr);
    }

    public static EnumC44072Jdx valueOf(String str) {
        return (EnumC44072Jdx) Enum.valueOf(EnumC44072Jdx.class, str);
    }

    public static EnumC44072Jdx[] values() {
        return (EnumC44072Jdx[]) A01.clone();
    }

    public EnumC44072Jdx(String str, int i) {
    }
}
