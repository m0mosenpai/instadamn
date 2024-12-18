package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC155676yw {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC155676yw[] A01;
    public static final EnumC155676yw A02;
    public static final EnumC155676yw A03;
    public static final EnumC155676yw A04;

    static {
        EnumC155676yw enumC155676yw = new EnumC155676yw("Closed", 0);
        A02 = enumC155676yw;
        EnumC155676yw enumC155676yw2 = new EnumC155676yw("Open", 1);
        A04 = enumC155676yw2;
        EnumC155676yw enumC155676yw3 = new EnumC155676yw("Loading", 2);
        A03 = enumC155676yw3;
        EnumC155676yw[] enumC155676ywArr = {enumC155676yw, enumC155676yw2, enumC155676yw3};
        A01 = enumC155676ywArr;
        A00 = AbstractC12190kN.A00(enumC155676ywArr);
    }

    public static EnumC155676yw valueOf(String str) {
        return (EnumC155676yw) Enum.valueOf(EnumC155676yw.class, str);
    }

    public static EnumC155676yw[] values() {
        return (EnumC155676yw[]) A01.clone();
    }

    public EnumC155676yw(String str, int i) {
    }
}
