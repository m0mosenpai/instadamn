package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68148VDr {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC68148VDr[] A02;
    public static final EnumC68148VDr A03;
    public static final EnumC68148VDr A04;
    public static final EnumC68148VDr A05;
    public static final EnumC68148VDr A06;
    public static final EnumC68148VDr A07;
    public static final EnumC68148VDr A08;
    public final int A00;

    static {
        EnumC68148VDr enumC68148VDr = new EnumC68148VDr("SUCCESS", 0, 0);
        A08 = enumC68148VDr;
        EnumC68148VDr enumC68148VDr2 = new EnumC68148VDr("BUFFER_TOO_SMALL", 1, 1);
        A03 = enumC68148VDr2;
        EnumC68148VDr enumC68148VDr3 = new EnumC68148VDr("FRAME_INCOMPLETE", 2, 2);
        A05 = enumC68148VDr3;
        EnumC68148VDr enumC68148VDr4 = new EnumC68148VDr("FRAME_INVALID", 3, 3);
        A06 = enumC68148VDr4;
        EnumC68148VDr enumC68148VDr5 = new EnumC68148VDr("SIGNATURE_INVALID", 4, 4);
        A07 = enumC68148VDr5;
        EnumC68148VDr enumC68148VDr6 = new EnumC68148VDr("FAILED", 5, 5);
        A04 = enumC68148VDr6;
        EnumC68148VDr[] enumC68148VDrArr = {enumC68148VDr, enumC68148VDr2, enumC68148VDr3, enumC68148VDr4, enumC68148VDr5, enumC68148VDr6};
        A02 = enumC68148VDrArr;
        A01 = AbstractC12190kN.A00(enumC68148VDrArr);
    }

    public static EnumC68148VDr valueOf(String str) {
        return (EnumC68148VDr) Enum.valueOf(EnumC68148VDr.class, str);
    }

    public static EnumC68148VDr[] values() {
        return (EnumC68148VDr[]) A02.clone();
    }

    public EnumC68148VDr(String str, int i, int i2) {
        this.A00 = i2;
    }
}
