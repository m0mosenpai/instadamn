package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8Gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC184458Gk {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC184458Gk[] A01;
    public static final EnumC184458Gk A02;
    public static final EnumC184458Gk A03;

    static {
        EnumC184458Gk enumC184458Gk = new EnumC184458Gk("FIRST_OPTION", 0);
        A02 = enumC184458Gk;
        EnumC184458Gk enumC184458Gk2 = new EnumC184458Gk("SECOND_OPTION", 1);
        A03 = enumC184458Gk2;
        EnumC184458Gk[] enumC184458GkArr = {enumC184458Gk, enumC184458Gk2};
        A01 = enumC184458GkArr;
        A00 = AbstractC12190kN.A00(enumC184458GkArr);
    }

    public static EnumC184458Gk valueOf(String str) {
        return (EnumC184458Gk) Enum.valueOf(EnumC184458Gk.class, str);
    }

    public static EnumC184458Gk[] values() {
        return (EnumC184458Gk[]) A01.clone();
    }

    public EnumC184458Gk(String str, int i) {
    }
}
