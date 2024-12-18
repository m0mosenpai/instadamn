package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.87h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1824287h {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC1824287h[] A01;
    public static final EnumC1824287h A02;
    public static final EnumC1824287h A03;

    static {
        EnumC1824287h enumC1824287h = new EnumC1824287h("OPEN", 0);
        A03 = enumC1824287h;
        EnumC1824287h enumC1824287h2 = new EnumC1824287h("CLOSED", 1);
        A02 = enumC1824287h2;
        EnumC1824287h[] enumC1824287hArr = {enumC1824287h, enumC1824287h2};
        A01 = enumC1824287hArr;
        A00 = AbstractC12190kN.A00(enumC1824287hArr);
    }

    public static EnumC1824287h valueOf(String str) {
        return (EnumC1824287h) Enum.valueOf(EnumC1824287h.class, str);
    }

    public static EnumC1824287h[] values() {
        return (EnumC1824287h[]) A01.clone();
    }

    public EnumC1824287h(String str, int i) {
    }
}
