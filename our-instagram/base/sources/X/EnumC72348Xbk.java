package X;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Xbk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72348Xbk {
    public static final EnumC72348Xbk A01;
    public static final EnumC72348Xbk A02;
    public static final EnumC72348Xbk A03;
    public static final EnumC72348Xbk A04;
    public final int A00;
    public static final EnumC72348Xbk A06 = new EnumC72348Xbk("UINT8", 0, 0);
    public static final EnumC72348Xbk A05 = new EnumC72348Xbk("INT8", 1, 1);

    static {
        A00("INT16", 2);
        A03 = new EnumC72348Xbk("INT32", 3, 3);
        A04 = new EnumC72348Xbk("INT64", 4, 4);
        A00("HALF", 5);
        A02 = new EnumC72348Xbk("FLOAT", 6, 6);
        A01 = new EnumC72348Xbk("DOUBLE", 7, 7);
        A00("COMPLEX_HALF", 8);
        A00("COMPLEX_FLOAT", 9);
        A00("COMPLEX_DOUBLE", 10);
        A00("BOOL", 11);
        A00("QINT8", 12);
        A00("QUINT8", 13);
        A00("QINT32", 14);
        A00("BFLOAT16", 15);
        A00("QINT4X2", 16);
        A00("QINT2X4", 17);
        A00("BITS1X8", 18);
        A00("BITS2X4", 19);
        A00("BITS4X2", 20);
        A00("BITS8", 21);
        A00("BITS16", 22);
    }

    public static void A00(String str, int i) {
        new EnumC72348Xbk(str, i, i);
    }

    public EnumC72348Xbk(String str, int i, int i2) {
        this.A00 = i2;
    }
}
