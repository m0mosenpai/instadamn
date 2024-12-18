package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53235NgY {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53235NgY[] A02;
    public static final EnumC53235NgY A03;
    public static final EnumC53235NgY A04;
    public static final EnumC53235NgY A05;
    public static final EnumC53235NgY A06;
    public static final EnumC53235NgY A07;
    public static final EnumC53235NgY A08;
    public static final EnumC53235NgY A09;
    public final int A00;

    static {
        EnumC53235NgY enumC53235NgY = new EnumC53235NgY("CUSTOM", 0, -65536);
        A03 = enumC53235NgY;
        EnumC53235NgY enumC53235NgY2 = new EnumC53235NgY("FBUI", 1, -16776961);
        A04 = enumC53235NgY2;
        EnumC53235NgY enumC53235NgY3 = new EnumC53235NgY("FIG", 2, -256);
        A06 = enumC53235NgY3;
        EnumC53235NgY enumC53235NgY4 = new EnumC53235NgY("FDS", 3, -16711936);
        A05 = enumC53235NgY4;
        EnumC53235NgY enumC53235NgY5 = new EnumC53235NgY("GEO", 4, -65281);
        A07 = enumC53235NgY5;
        EnumC53235NgY enumC53235NgY6 = new EnumC53235NgY("IGDS", 5, -16711681);
        A08 = enumC53235NgY6;
        EnumC53235NgY enumC53235NgY7 = new EnumC53235NgY("MDS", 6, -12200360);
        A09 = enumC53235NgY7;
        EnumC53235NgY[] enumC53235NgYArr = {enumC53235NgY, enumC53235NgY2, enumC53235NgY3, enumC53235NgY4, enumC53235NgY5, enumC53235NgY6, enumC53235NgY7};
        A02 = enumC53235NgYArr;
        A01 = AbstractC12190kN.A00(enumC53235NgYArr);
    }

    public static EnumC53235NgY valueOf(String str) {
        return (EnumC53235NgY) Enum.valueOf(EnumC53235NgY.class, str);
    }

    public static EnumC53235NgY[] values() {
        return (EnumC53235NgY[]) A02.clone();
    }

    public EnumC53235NgY(String str, int i, int i2) {
        this.A00 = i2;
    }
}
