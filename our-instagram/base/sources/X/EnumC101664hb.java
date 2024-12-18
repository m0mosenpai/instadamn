package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC101664hb {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC101664hb[] A02;
    public static final EnumC101664hb A03;
    public static final EnumC101664hb A04;
    public static final EnumC101664hb A05;
    public static final EnumC101664hb A06;
    public static final EnumC101664hb A07;
    public static final EnumC101664hb A08;
    public static final EnumC101664hb A09;
    public static final EnumC101664hb A0A;
    public static final EnumC101664hb A0B;
    public static final EnumC101664hb A0C;
    public final int A00;

    public static EnumC101664hb valueOf(String str) {
        return (EnumC101664hb) Enum.valueOf(EnumC101664hb.class, str);
    }

    public static EnumC101664hb[] values() {
        return (EnumC101664hb[]) A02.clone();
    }

    static {
        EnumC101664hb enumC101664hb = new EnumC101664hb("RAVEN_SENT", 0, 2131960520);
        A0A = enumC101664hb;
        EnumC101664hb enumC101664hb2 = new EnumC101664hb("RAVEN_CANNOT_DELIVER", 1, 2131960514);
        A04 = enumC101664hb2;
        EnumC101664hb enumC101664hb3 = new EnumC101664hb("RAVEN_SENDING", 2, 0);
        A09 = enumC101664hb3;
        EnumC101664hb enumC101664hb4 = new EnumC101664hb("RAVEN_BLOCKED", 3, 2131960513);
        A03 = enumC101664hb4;
        EnumC101664hb enumC101664hb5 = new EnumC101664hb("RAVEN_UNKNOWN", 4, 0);
        A0C = enumC101664hb5;
        EnumC101664hb enumC101664hb6 = new EnumC101664hb("RAVEN_SUGGESTED", 5, 2131960521);
        A0B = enumC101664hb6;
        EnumC101664hb enumC101664hb7 = new EnumC101664hb("RAVEN_DELIVERED", 6, 2131960515);
        A05 = enumC101664hb7;
        EnumC101664hb enumC101664hb8 = new EnumC101664hb("RAVEN_OPENED", 7, 2131960517);
        A06 = enumC101664hb8;
        EnumC101664hb enumC101664hb9 = new EnumC101664hb("RAVEN_SCREENSHOT", 8, 2131960519);
        A08 = enumC101664hb9;
        EnumC101664hb enumC101664hb10 = new EnumC101664hb("RAVEN_REPLAYED", 9, 2131960518);
        A07 = enumC101664hb10;
        EnumC101664hb[] enumC101664hbArr = {enumC101664hb, enumC101664hb2, enumC101664hb3, enumC101664hb4, enumC101664hb5, enumC101664hb6, enumC101664hb7, enumC101664hb8, enumC101664hb9, enumC101664hb10};
        A02 = enumC101664hbArr;
        A01 = AbstractC12190kN.A00(enumC101664hbArr);
    }

    public EnumC101664hb(String str, int i, int i2) {
        this.A00 = i2;
    }
}
