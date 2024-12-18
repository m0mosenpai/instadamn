package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33338EoX {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33338EoX[] A01;
    public static final EnumC33338EoX A02;
    public static final EnumC33338EoX A03;
    public static final EnumC33338EoX A04;

    static {
        EnumC33338EoX enumC33338EoX = new EnumC33338EoX("PROGRESS", 0);
        A04 = enumC33338EoX;
        EnumC33338EoX enumC33338EoX2 = new EnumC33338EoX("COMPLETE", 1);
        A02 = enumC33338EoX2;
        EnumC33338EoX enumC33338EoX3 = new EnumC33338EoX("FAILED", 2);
        A03 = enumC33338EoX3;
        EnumC33338EoX[] enumC33338EoXArr = {enumC33338EoX, enumC33338EoX2, enumC33338EoX3};
        A01 = enumC33338EoXArr;
        A00 = AbstractC12190kN.A00(enumC33338EoXArr);
    }

    public static EnumC33338EoX valueOf(String str) {
        return (EnumC33338EoX) Enum.valueOf(EnumC33338EoX.class, str);
    }

    public static EnumC33338EoX[] values() {
        return (EnumC33338EoX[]) A01.clone();
    }

    public EnumC33338EoX(String str, int i) {
    }
}
