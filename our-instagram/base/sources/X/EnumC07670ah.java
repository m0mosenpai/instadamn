package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC07670ah {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC07670ah[] A01;
    public static final EnumC07670ah A02;
    public static final EnumC07670ah A03;
    public static final EnumC07670ah A04;
    public static final EnumC07670ah A05;
    public static final EnumC07670ah A06;
    public static final EnumC07670ah A07;
    public static final EnumC07670ah A08;
    public static final EnumC07670ah A09;
    public static final EnumC07670ah A0A;
    public static final EnumC07670ah A0B;

    static {
        EnumC07670ah enumC07670ah = new EnumC07670ah("NO_ANR_DETECTED", 0);
        A04 = enumC07670ah;
        EnumC07670ah enumC07670ah2 = new EnumC07670ah("DURING_ANR", 1);
        A03 = enumC07670ah2;
        EnumC07670ah enumC07670ah3 = new EnumC07670ah("ANR_RECOVERED", 2);
        A02 = enumC07670ah3;
        EnumC07670ah enumC07670ah4 = new EnumC07670ah("SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED", 3);
        A0A = enumC07670ah4;
        EnumC07670ah enumC07670ah5 = new EnumC07670ah("SIGQUIT_RECEIVED_AM_CONFIRMED_MT_BLOCKED", 4);
        A07 = enumC07670ah5;
        EnumC07670ah enumC07670ah6 = new EnumC07670ah("SIGQUIT_RECEIVED_AM_CONFIRMED_MT_UNBLOCKED", 5);
        A08 = enumC07670ah6;
        EnumC07670ah enumC07670ah7 = new EnumC07670ah("SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_UNBLOCKED", 6);
        A0B = enumC07670ah7;
        EnumC07670ah enumC07670ah8 = new EnumC07670ah("SIGQUIT_RECEIVED_AM_EXPIRED_MT_BLOCKED", 7);
        A09 = enumC07670ah8;
        EnumC07670ah enumC07670ah9 = new EnumC07670ah("NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED", 8);
        A05 = enumC07670ah9;
        EnumC07670ah enumC07670ah10 = new EnumC07670ah("NO_SIGQUIT_AM_CONFIRMED_MT_UNBLOCKED", 9);
        A06 = enumC07670ah10;
        EnumC07670ah[] enumC07670ahArr = {enumC07670ah, enumC07670ah2, enumC07670ah3, enumC07670ah4, enumC07670ah5, enumC07670ah6, enumC07670ah7, enumC07670ah8, enumC07670ah9, enumC07670ah10};
        A01 = enumC07670ahArr;
        A00 = AbstractC12190kN.A00(enumC07670ahArr);
    }

    public static EnumC07670ah valueOf(String str) {
        return (EnumC07670ah) Enum.valueOf(EnumC07670ah.class, str);
    }

    public static EnumC07670ah[] values() {
        return (EnumC07670ah[]) A01.clone();
    }

    public EnumC07670ah(String str, int i) {
    }
}
