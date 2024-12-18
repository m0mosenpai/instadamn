package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.He4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39594He4 {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC39594He4[] A04;
    public static final EnumC39594He4 A05;
    public static final EnumC39594He4 A06;
    public static final EnumC39594He4 A07;
    public static final EnumC39594He4 A08;
    public final int A00;
    public final int A01;
    public final int A02;

    public static EnumC39594He4 valueOf(String str) {
        return (EnumC39594He4) Enum.valueOf(EnumC39594He4.class, str);
    }

    public static EnumC39594He4[] values() {
        return (EnumC39594He4[]) A04.clone();
    }

    static {
        EnumC39594He4 enumC39594He4 = new EnumC39594He4("NO_CONTACT_POINT", 0, 2131976365, 2131976356, 2131976360);
        A05 = enumC39594He4;
        EnumC39594He4 enumC39594He42 = new EnumC39594He4("VULNERABLE_EMAIL_AND_PHONE", 1, 2131976367, 2131976358, 2131976362);
        A07 = enumC39594He42;
        EnumC39594He4 enumC39594He43 = new EnumC39594He4("VULNERABLE_EMAIL", 2, 2131976366, 2131976357, 2131976361);
        A06 = enumC39594He43;
        EnumC39594He4 enumC39594He44 = new EnumC39594He4("VULNERABLE_PHONE", 3, 2131976368, 2131976359, 2131976363);
        A08 = enumC39594He44;
        EnumC39594He4[] enumC39594He4Arr = {enumC39594He4, enumC39594He42, enumC39594He43, enumC39594He44};
        A04 = enumC39594He4Arr;
        A03 = AbstractC12190kN.A00(enumC39594He4Arr);
    }

    public EnumC39594He4(String str, int i, int i2, int i3, int i4) {
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }
}
