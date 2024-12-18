package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Dq2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC31337Dq2 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC31337Dq2[] A01;
    public static final EnumC31337Dq2 A02;
    public static final EnumC31337Dq2 A03;
    public static final EnumC31337Dq2 A04;
    public static final EnumC31337Dq2 A05;
    public static final EnumC31337Dq2 A06;
    public static final EnumC31337Dq2 A07;

    static {
        EnumC31337Dq2 enumC31337Dq2 = new EnumC31337Dq2("DEFAULT", 0);
        A05 = enumC31337Dq2;
        EnumC31337Dq2 enumC31337Dq22 = new EnumC31337Dq2("ADMINS_AND_MODERATORS", 1);
        A02 = enumC31337Dq22;
        EnumC31337Dq2 enumC31337Dq23 = new EnumC31337Dq2("COLLABORATOR", 2);
        A03 = enumC31337Dq23;
        EnumC31337Dq2 enumC31337Dq24 = new EnumC31337Dq2("MUTUAL_FOLLOWERS", 3);
        A07 = enumC31337Dq24;
        EnumC31337Dq2 enumC31337Dq25 = new EnumC31337Dq2("FOLLOWERS", 4);
        A06 = enumC31337Dq25;
        EnumC31337Dq2 enumC31337Dq26 = new EnumC31337Dq2("CREATORS", 5);
        A04 = enumC31337Dq26;
        EnumC31337Dq2[] enumC31337Dq2Arr = {enumC31337Dq2, enumC31337Dq22, enumC31337Dq23, enumC31337Dq24, enumC31337Dq25, enumC31337Dq26};
        A01 = enumC31337Dq2Arr;
        A00 = AbstractC12190kN.A00(enumC31337Dq2Arr);
    }

    public static EnumC31337Dq2 valueOf(String str) {
        return (EnumC31337Dq2) Enum.valueOf(EnumC31337Dq2.class, str);
    }

    public static EnumC31337Dq2[] values() {
        return (EnumC31337Dq2[]) A01.clone();
    }

    public EnumC31337Dq2(String str, int i) {
    }
}
