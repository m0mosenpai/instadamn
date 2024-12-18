package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BJ3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BJ3[] A01;
    public static final BJ3 A02;
    public static final BJ3 A03;
    public static final BJ3 A04;
    public static final BJ3 A05;
    public static final BJ3 A06;
    public static final BJ3 A07;
    public static final BJ3 A08;
    public static final BJ3 A09;
    public static final BJ3 A0A;
    public static final BJ3 A0B;
    public static final BJ3 A0C;
    public static final BJ3 A0D;

    static {
        BJ3 bj3 = new BJ3("ADMIN", 0);
        A02 = bj3;
        BJ3 bj32 = new BJ3("FOLLOW", 1);
        A03 = bj32;
        BJ3 bj33 = new BJ3("FOLLOW_BACK", 2);
        A05 = bj33;
        BJ3 bj34 = new BJ3("FOLLOWING", 3);
        A04 = bj34;
        BJ3 bj35 = new BJ3("JOIN", 4);
        A06 = bj35;
        BJ3 bj36 = new BJ3("LOADING", 5);
        A07 = bj36;
        BJ3 bj37 = new BJ3("MEMBER", 6);
        A08 = bj37;
        BJ3 bj38 = new BJ3("MESSAGE", 7);
        A09 = bj38;
        BJ3 bj39 = new BJ3("REQUESTED", 8);
        A0A = bj39;
        BJ3 bj310 = new BJ3("UNBLOCK", 9);
        A0B = bj310;
        BJ3 bj311 = new BJ3("UNDO", 10);
        A0C = bj311;
        BJ3 bj312 = new BJ3("UNKNOWN", 11);
        A0D = bj312;
        BJ3[] bj3Arr = {bj3, bj32, bj33, bj34, bj35, bj36, bj37, bj38, bj39, bj310, bj311, bj312};
        A01 = bj3Arr;
        A00 = AbstractC12190kN.A00(bj3Arr);
    }

    public static BJ3 valueOf(String str) {
        return (BJ3) Enum.valueOf(BJ3.class, str);
    }

    public static BJ3[] values() {
        return (BJ3[]) A01.clone();
    }

    public BJ3(String str, int i) {
    }
}
