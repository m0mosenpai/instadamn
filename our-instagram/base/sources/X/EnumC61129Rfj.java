package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61129Rfj {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61129Rfj[] A01;
    public static final EnumC61129Rfj A02;
    public static final EnumC61129Rfj A03;
    public static final EnumC61129Rfj A04;
    public static final EnumC61129Rfj A05;
    public static final EnumC61129Rfj A06;

    static {
        EnumC61129Rfj enumC61129Rfj = new EnumC61129Rfj("PROMPTED_SYSTEM_AUTOFILL", 0);
        A06 = enumC61129Rfj;
        EnumC61129Rfj enumC61129Rfj2 = new EnumC61129Rfj("ACCEPTED_SYSTEM_AUTOFILL", 1);
        A02 = enumC61129Rfj2;
        EnumC61129Rfj enumC61129Rfj3 = new EnumC61129Rfj("DECLINED_SYSTEM_AUTOFILL", 2);
        A04 = enumC61129Rfj3;
        EnumC61129Rfj enumC61129Rfj4 = new EnumC61129Rfj("NOT_PROMPTED_SYSTEM_AUTOFILL", 3);
        A05 = enumC61129Rfj4;
        EnumC61129Rfj enumC61129Rfj5 = new EnumC61129Rfj("AUTOFILL_MANAGER_CANCEL_SUCCESS", 4);
        A03 = enumC61129Rfj5;
        EnumC61129Rfj[] enumC61129RfjArr = {enumC61129Rfj, enumC61129Rfj2, enumC61129Rfj3, enumC61129Rfj4, enumC61129Rfj5, new EnumC61129Rfj("AUTOFILL_MANAGER_CANCEL_FAILURE", 5)};
        A01 = enumC61129RfjArr;
        A00 = AbstractC12190kN.A00(enumC61129RfjArr);
    }

    public static EnumC61129Rfj valueOf(String str) {
        return (EnumC61129Rfj) Enum.valueOf(EnumC61129Rfj.class, str);
    }

    public static EnumC61129Rfj[] values() {
        return (EnumC61129Rfj[]) A01.clone();
    }

    public EnumC61129Rfj(String str, int i) {
    }
}
