package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ni1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53324Ni1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53324Ni1[] A01;
    public static final EnumC53324Ni1 A02;
    public static final EnumC53324Ni1 A03;
    public static final EnumC53324Ni1 A04;
    public static final EnumC53324Ni1 A05;
    public static final EnumC53324Ni1 A06;
    public static final EnumC53324Ni1 A07;
    public static final EnumC53324Ni1 A08;
    public static final EnumC53324Ni1 A09;
    public static final EnumC53324Ni1 A0A;
    public static final EnumC53324Ni1 A0B;
    public static final EnumC53324Ni1 A0C;
    public static final EnumC53324Ni1 A0D;
    public static final EnumC53324Ni1 A0E;

    static {
        EnumC53324Ni1 enumC53324Ni1 = new EnumC53324Ni1("CONNECTING", 0);
        A05 = enumC53324Ni1;
        EnumC53324Ni1 enumC53324Ni12 = new EnumC53324Ni1("CONNECTED_WAITING_FOR_COUNTDOWN", 1);
        A04 = enumC53324Ni12;
        EnumC53324Ni1 enumC53324Ni13 = new EnumC53324Ni1("CONNECTED", 2);
        A03 = enumC53324Ni13;
        EnumC53324Ni1 enumC53324Ni14 = new EnumC53324Ni1("STARTED", 3);
        A07 = enumC53324Ni14;
        EnumC53324Ni1 enumC53324Ni15 = new EnumC53324Ni1("STARTED_AUDIO_ONLY", 4);
        A08 = enumC53324Ni15;
        EnumC53324Ni1 enumC53324Ni16 = new EnumC53324Ni1("STARTED_MATCHING_CONTENT_DETECTED", 5);
        A09 = enumC53324Ni16;
        EnumC53324Ni1 enumC53324Ni17 = new EnumC53324Ni1("STARTED_MATCHING_CONTENT_INITIALLY_WARNED", 6);
        A0A = enumC53324Ni17;
        EnumC53324Ni1 enumC53324Ni18 = new EnumC53324Ni1("CMP_VIOLATION", 7);
        A02 = enumC53324Ni18;
        EnumC53324Ni1 enumC53324Ni19 = new EnumC53324Ni1("RESUMED", 8);
        A06 = enumC53324Ni19;
        EnumC53324Ni1 enumC53324Ni110 = new EnumC53324Ni1("STOPPED_BLOCKED", 9);
        A0C = enumC53324Ni110;
        EnumC53324Ni1 enumC53324Ni111 = new EnumC53324Ni1("STOPPED_SUMMARY", 10);
        A0D = enumC53324Ni111;
        EnumC53324Ni1 enumC53324Ni112 = new EnumC53324Ni1("STOPPED", 11);
        A0B = enumC53324Ni112;
        EnumC53324Ni1 enumC53324Ni113 = new EnumC53324Ni1("UNKNOWN", 12);
        A0E = enumC53324Ni113;
        EnumC53324Ni1[] enumC53324Ni1Arr = {enumC53324Ni1, enumC53324Ni12, enumC53324Ni13, enumC53324Ni14, enumC53324Ni15, enumC53324Ni16, enumC53324Ni17, enumC53324Ni18, enumC53324Ni19, enumC53324Ni110, enumC53324Ni111, enumC53324Ni112, enumC53324Ni113};
        A01 = enumC53324Ni1Arr;
        A00 = AbstractC12190kN.A00(enumC53324Ni1Arr);
    }

    public static EnumC53324Ni1 valueOf(String str) {
        return (EnumC53324Ni1) Enum.valueOf(EnumC53324Ni1.class, str);
    }

    public static EnumC53324Ni1[] values() {
        return (EnumC53324Ni1[]) A01.clone();
    }

    public final boolean A00() {
        if (this != A07 && this != A08 && this != A09 && this != A0A && this != A02 && this != A06) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        if (this != A0B && this != A0D && this != A0C) {
            return false;
        }
        return true;
    }

    public EnumC53324Ni1(String str, int i) {
    }
}
