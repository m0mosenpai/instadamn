package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kci, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46206Kci {
    public static final java.util.Set A01;
    public static final java.util.Set A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC46206Kci[] A04;
    public static final EnumC46206Kci A05;
    public static final EnumC46206Kci A06;
    public static final EnumC46206Kci A07;
    public static final EnumC46206Kci A08;
    public static final EnumC46206Kci A09;
    public static final EnumC46206Kci A0A;
    public static final EnumC46206Kci A0B;
    public static final EnumC46206Kci A0C;
    public static final EnumC46206Kci A0D;
    public static final EnumC46206Kci A0E;
    public static final EnumC46206Kci A0F;
    public static final EnumC46206Kci A0G;
    public static final EnumC46206Kci A0H;
    public final Number A00;

    static {
        EnumC46206Kci enumC46206Kci = new EnumC46206Kci(1, "OFFLINE", 0);
        A0E = enumC46206Kci;
        EnumC46206Kci enumC46206Kci2 = new EnumC46206Kci(2, "HSM", 1);
        A09 = enumC46206Kci2;
        EnumC46206Kci enumC46206Kci3 = new EnumC46206Kci(3, "BLOCK_STORE", 2);
        A05 = enumC46206Kci3;
        EnumC46206Kci enumC46206Kci4 = new EnumC46206Kci(5, "KEYCHAIN", 3);
        A0D = enumC46206Kci4;
        EnumC46206Kci enumC46206Kci5 = new EnumC46206Kci(6, "ICLOUD_KVS", 4);
        A0C = enumC46206Kci5;
        EnumC46206Kci enumC46206Kci6 = new EnumC46206Kci(7, "GOOGLE_DRIVE", 5);
        A07 = enumC46206Kci6;
        EnumC46206Kci enumC46206Kci7 = new EnumC46206Kci(8, "CLOUDKIT", 6);
        A06 = enumC46206Kci7;
        EnumC46206Kci enumC46206Kci8 = new EnumC46206Kci(9, "ICLOUD_DRIVE", 7);
        A0A = enumC46206Kci8;
        EnumC46206Kci enumC46206Kci9 = new EnumC46206Kci(10, "PASSKEY", 8);
        A0F = enumC46206Kci9;
        EnumC46206Kci enumC46206Kci10 = new EnumC46206Kci(11, "ICLOUD_KEYCHAIN", 9);
        A0B = enumC46206Kci10;
        EnumC46206Kci enumC46206Kci11 = new EnumC46206Kci(12, "GOOGLE_ONE_AUTO_BACKUP", 10);
        A08 = enumC46206Kci11;
        EnumC46206Kci enumC46206Kci12 = new EnumC46206Kci(13, "SECURITY_QUESTION_HSM", 11);
        A0G = enumC46206Kci12;
        EnumC46206Kci enumC46206Kci13 = new EnumC46206Kci(14, "TRUSTED_CONTACT", 12);
        A0H = enumC46206Kci13;
        EnumC46206Kci[] enumC46206KciArr = {enumC46206Kci, enumC46206Kci2, enumC46206Kci3, enumC46206Kci4, enumC46206Kci5, enumC46206Kci6, enumC46206Kci7, enumC46206Kci8, enumC46206Kci9, enumC46206Kci10, enumC46206Kci11, enumC46206Kci12, enumC46206Kci13};
        A04 = enumC46206KciArr;
        A03 = AbstractC12190kN.A00(enumC46206KciArr);
        A02 = AbstractC16830sb.A07(enumC46206Kci3, enumC46206Kci, enumC46206Kci2, enumC46206Kci6, enumC46206Kci9, enumC46206Kci11, enumC46206Kci12, enumC46206Kci13);
        A01 = AbstractC16830sb.A07(enumC46206Kci, enumC46206Kci2, enumC46206Kci6, enumC46206Kci9, enumC46206Kci12, enumC46206Kci13);
    }

    public static EnumC46206Kci valueOf(String str) {
        return (EnumC46206Kci) Enum.valueOf(EnumC46206Kci.class, str);
    }

    public static EnumC46206Kci[] values() {
        return (EnumC46206Kci[]) A04.clone();
    }

    public EnumC46206Kci(Number number, String str, int i) {
        this.A00 = number;
    }
}
