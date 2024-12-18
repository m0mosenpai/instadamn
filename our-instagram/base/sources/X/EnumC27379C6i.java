package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27379C6i {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27379C6i[] A01;
    public static final EnumC27379C6i A02;
    public static final EnumC27379C6i A03;
    public static final EnumC27379C6i A04;
    public static final EnumC27379C6i A05;

    static {
        EnumC27379C6i enumC27379C6i = new EnumC27379C6i("DISCLOSURE_NUX", 0);
        A02 = enumC27379C6i;
        EnumC27379C6i enumC27379C6i2 = new EnumC27379C6i("TOOL_NUX", 1);
        A04 = enumC27379C6i2;
        EnumC27379C6i enumC27379C6i3 = new EnumC27379C6i("TOOL", 2);
        A03 = enumC27379C6i3;
        EnumC27379C6i enumC27379C6i4 = new EnumC27379C6i("TOPIC_EDIT", 3);
        A05 = enumC27379C6i4;
        EnumC27379C6i[] enumC27379C6iArr = {enumC27379C6i, enumC27379C6i2, enumC27379C6i3, enumC27379C6i4};
        A01 = enumC27379C6iArr;
        A00 = AbstractC12190kN.A00(enumC27379C6iArr);
    }

    public static EnumC27379C6i valueOf(String str) {
        return (EnumC27379C6i) Enum.valueOf(EnumC27379C6i.class, str);
    }

    public static EnumC27379C6i[] values() {
        return (EnumC27379C6i[]) A01.clone();
    }

    public EnumC27379C6i(String str, int i) {
    }
}
