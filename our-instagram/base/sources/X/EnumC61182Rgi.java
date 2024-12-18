package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rgi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61182Rgi {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC61182Rgi[] A03;
    public static final EnumC61182Rgi A04;
    public static final EnumC61182Rgi A05;
    public static final EnumC61182Rgi A06;
    public static final EnumC61182Rgi A07;
    public static final EnumC61182Rgi A08;
    public static final EnumC61182Rgi A09;
    public final boolean A00;
    public final boolean A01;

    static {
        EnumC61182Rgi enumC61182Rgi = new EnumC61182Rgi("INIT", false, false, 0);
        A08 = enumC61182Rgi;
        EnumC61182Rgi enumC61182Rgi2 = new EnumC61182Rgi("IN_PROGRESS", false, false, 1);
        A09 = enumC61182Rgi2;
        EnumC61182Rgi enumC61182Rgi3 = new EnumC61182Rgi("COMPLETE_SUCCESS", true, true, 2);
        A04 = enumC61182Rgi3;
        EnumC61182Rgi enumC61182Rgi4 = new EnumC61182Rgi("COMPLETE_WITH_ERRORS", false, true, 3);
        A05 = enumC61182Rgi4;
        EnumC61182Rgi enumC61182Rgi5 = new EnumC61182Rgi("COMPLETE_WITH_SPECIAL_ERRORS", false, true, 4);
        A06 = enumC61182Rgi5;
        EnumC61182Rgi enumC61182Rgi6 = new EnumC61182Rgi("FAILURE", false, false, 5);
        A07 = enumC61182Rgi6;
        EnumC61182Rgi[] enumC61182RgiArr = {enumC61182Rgi, enumC61182Rgi2, enumC61182Rgi3, enumC61182Rgi4, enumC61182Rgi5, enumC61182Rgi6};
        A03 = enumC61182RgiArr;
        A02 = AbstractC12190kN.A00(enumC61182RgiArr);
    }

    public static EnumC61182Rgi valueOf(String str) {
        return (EnumC61182Rgi) Enum.valueOf(EnumC61182Rgi.class, str);
    }

    public static EnumC61182Rgi[] values() {
        return (EnumC61182Rgi[]) A03.clone();
    }

    public EnumC61182Rgi(String str, boolean z, boolean z2, int i) {
        this.A01 = z;
        this.A00 = z2;
    }
}
