package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC190238bh {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC190238bh[] A01;
    public static final EnumC190238bh A02;
    public static final EnumC190238bh A03;

    static {
        EnumC190238bh enumC190238bh = new EnumC190238bh("CAMERA", 0);
        A02 = enumC190238bh;
        EnumC190238bh enumC190238bh2 = new EnumC190238bh("GALLERY", 1);
        A03 = enumC190238bh2;
        EnumC190238bh[] enumC190238bhArr = {enumC190238bh, enumC190238bh2};
        A01 = enumC190238bhArr;
        A00 = AbstractC12190kN.A00(enumC190238bhArr);
    }

    public static EnumC190238bh valueOf(String str) {
        return (EnumC190238bh) Enum.valueOf(EnumC190238bh.class, str);
    }

    public static EnumC190238bh[] values() {
        return (EnumC190238bh[]) A01.clone();
    }

    public EnumC190238bh(String str, int i) {
    }
}
