package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.87i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1824387i {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC1824387i[] A01;
    public static final EnumC1824387i A02;
    public static final EnumC1824387i A03;

    static {
        EnumC1824387i enumC1824387i = new EnumC1824387i("OPEN", 0);
        A03 = enumC1824387i;
        EnumC1824387i enumC1824387i2 = new EnumC1824387i("CLOSED", 1);
        A02 = enumC1824387i2;
        EnumC1824387i[] enumC1824387iArr = {enumC1824387i, enumC1824387i2};
        A01 = enumC1824387iArr;
        A00 = AbstractC12190kN.A00(enumC1824387iArr);
    }

    public static EnumC1824387i valueOf(String str) {
        return (EnumC1824387i) Enum.valueOf(EnumC1824387i.class, str);
    }

    public static EnumC1824387i[] values() {
        return (EnumC1824387i[]) A01.clone();
    }

    public EnumC1824387i(String str, int i) {
    }
}
