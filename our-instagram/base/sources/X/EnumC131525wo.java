package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC131525wo {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC131525wo[] A01;
    public static final EnumC131525wo A02;
    public static final EnumC131525wo A03;
    public static final EnumC131525wo A04;

    static {
        EnumC131525wo enumC131525wo = new EnumC131525wo("DRAGGING", 0);
        A02 = enumC131525wo;
        EnumC131525wo enumC131525wo2 = new EnumC131525wo("SETTLING", 1);
        A04 = enumC131525wo2;
        EnumC131525wo enumC131525wo3 = new EnumC131525wo("IDLE", 2);
        A03 = enumC131525wo3;
        EnumC131525wo[] enumC131525woArr = {enumC131525wo, enumC131525wo2, enumC131525wo3};
        A01 = enumC131525woArr;
        A00 = AbstractC12190kN.A00(enumC131525woArr);
    }

    public static EnumC131525wo valueOf(String str) {
        return (EnumC131525wo) Enum.valueOf(EnumC131525wo.class, str);
    }

    public static EnumC131525wo[] values() {
        return (EnumC131525wo[]) A01.clone();
    }

    public EnumC131525wo(String str, int i) {
    }
}
