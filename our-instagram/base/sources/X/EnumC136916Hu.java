package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6Hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC136916Hu {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC136916Hu[] A01;
    public static final EnumC136916Hu A02;
    public static final EnumC136916Hu A03;
    public static final EnumC136916Hu A04;

    static {
        EnumC136916Hu enumC136916Hu = new EnumC136916Hu("Image", 0);
        A03 = enumC136916Hu;
        EnumC136916Hu enumC136916Hu2 = new EnumC136916Hu("Video", 1);
        A04 = enumC136916Hu2;
        EnumC136916Hu enumC136916Hu3 = new EnumC136916Hu("Gif", 2);
        A02 = enumC136916Hu3;
        EnumC136916Hu[] enumC136916HuArr = {enumC136916Hu, enumC136916Hu2, enumC136916Hu3};
        A01 = enumC136916HuArr;
        A00 = AbstractC12190kN.A00(enumC136916HuArr);
    }

    public static EnumC136916Hu valueOf(String str) {
        return (EnumC136916Hu) Enum.valueOf(EnumC136916Hu.class, str);
    }

    public static EnumC136916Hu[] values() {
        return (EnumC136916Hu[]) A01.clone();
    }

    public EnumC136916Hu(String str, int i) {
    }
}
