package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27395C6y {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27395C6y[] A01;
    public static final EnumC27395C6y A02;
    public static final EnumC27395C6y A03;
    public static final EnumC27395C6y A04;
    public static final EnumC27395C6y A05;
    public static final EnumC27395C6y A06;

    static {
        EnumC27395C6y enumC27395C6y = new EnumC27395C6y("EMPTY", 0);
        A02 = enumC27395C6y;
        EnumC27395C6y enumC27395C6y2 = new EnumC27395C6y("VALID", 1);
        A06 = enumC27395C6y2;
        EnumC27395C6y enumC27395C6y3 = new EnumC27395C6y("INVALID", 2);
        A04 = enumC27395C6y3;
        EnumC27395C6y enumC27395C6y4 = new EnumC27395C6y("EXPIRED", 3);
        A03 = enumC27395C6y4;
        EnumC27395C6y enumC27395C6y5 = new EnumC27395C6y("OTHER_ERROR", 4);
        A05 = enumC27395C6y5;
        EnumC27395C6y[] enumC27395C6yArr = {enumC27395C6y, enumC27395C6y2, enumC27395C6y3, enumC27395C6y4, enumC27395C6y5};
        A01 = enumC27395C6yArr;
        A00 = AbstractC12190kN.A00(enumC27395C6yArr);
    }

    public static EnumC27395C6y valueOf(String str) {
        return (EnumC27395C6y) Enum.valueOf(EnumC27395C6y.class, str);
    }

    public static EnumC27395C6y[] values() {
        return (EnumC27395C6y[]) A01.clone();
    }

    public EnumC27395C6y(String str, int i) {
    }
}
