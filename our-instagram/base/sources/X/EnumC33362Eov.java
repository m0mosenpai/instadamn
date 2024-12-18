package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eov, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33362Eov {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33362Eov[] A01;
    public static final EnumC33362Eov A02;
    public static final EnumC33362Eov A03;
    public static final EnumC33362Eov A04;
    public static final EnumC33362Eov A05;
    public static final EnumC33362Eov A06;
    public static final EnumC33362Eov A07;

    static {
        EnumC33362Eov enumC33362Eov = new EnumC33362Eov("UNSEND", 0);
        A07 = enumC33362Eov;
        EnumC33362Eov enumC33362Eov2 = new EnumC33362Eov("DELETE", 1);
        A02 = enumC33362Eov2;
        EnumC33362Eov enumC33362Eov3 = new EnumC33362Eov("REMOVE", 2);
        A04 = enumC33362Eov3;
        EnumC33362Eov enumC33362Eov4 = new EnumC33362Eov("DOWNLOAD", 3);
        A03 = enumC33362Eov4;
        EnumC33362Eov enumC33362Eov5 = new EnumC33362Eov("REPORT", 4);
        A05 = enumC33362Eov5;
        EnumC33362Eov enumC33362Eov6 = new EnumC33362Eov("SHARE", 5);
        A06 = enumC33362Eov6;
        EnumC33362Eov[] enumC33362EovArr = {enumC33362Eov, enumC33362Eov2, enumC33362Eov3, enumC33362Eov4, enumC33362Eov5, enumC33362Eov6};
        A01 = enumC33362EovArr;
        A00 = AbstractC12190kN.A00(enumC33362EovArr);
    }

    public static EnumC33362Eov valueOf(String str) {
        return (EnumC33362Eov) Enum.valueOf(EnumC33362Eov.class, str);
    }

    public static EnumC33362Eov[] values() {
        return (EnumC33362Eov[]) A01.clone();
    }

    public EnumC33362Eov(String str, int i) {
    }
}
