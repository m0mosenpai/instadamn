package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF20' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Rgj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class EnumC61183Rgj {
    public static final /* synthetic */ EnumC61183Rgj[] A02;
    public static final EnumC61183Rgj A03;
    public static final EnumC61183Rgj A04;
    public static final EnumC61183Rgj A05;
    public static final EnumC61183Rgj A06;
    public static final EnumC61183Rgj A07;
    public static final EnumC61183Rgj A08;
    public static final EnumC61183Rgj A09;
    public static final EnumC61183Rgj A0A;
    public final int A00;
    public final EnumC61165RgR A01;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC61183Rgj EF21;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC61183Rgj EF20;

    static {
        final int i = 0;
        EnumC61183Rgj enumC61183Rgj = new EnumC61183Rgj(EnumC61165RgR.DOUBLE, "DOUBLE", 0, 1);
        EnumC61183Rgj enumC61183Rgj2 = new EnumC61183Rgj(EnumC61165RgR.FLOAT, "FLOAT", 1, 5);
        A06 = enumC61183Rgj2;
        EnumC61165RgR enumC61165RgR = EnumC61165RgR.LONG;
        final int i2 = 2;
        EnumC61183Rgj enumC61183Rgj3 = new EnumC61183Rgj(enumC61165RgR, "INT64", 2, 0);
        final int i3 = 3;
        EnumC61183Rgj enumC61183Rgj4 = new EnumC61183Rgj(enumC61165RgR, "UINT64", 3, 0);
        EnumC61165RgR enumC61165RgR2 = EnumC61165RgR.INT;
        EnumC61183Rgj enumC61183Rgj5 = new EnumC61183Rgj(enumC61165RgR2, "INT32", 4, 0);
        EnumC61183Rgj enumC61183Rgj6 = new EnumC61183Rgj(enumC61165RgR, "FIXED64", 5, 1);
        EnumC61183Rgj enumC61183Rgj7 = new EnumC61183Rgj(enumC61165RgR2, "FIXED32", 6, 5);
        EnumC61183Rgj enumC61183Rgj8 = new EnumC61183Rgj(EnumC61165RgR.BOOLEAN, "BOOL", 7, 0);
        A03 = enumC61183Rgj8;
        final EnumC61165RgR enumC61165RgR3 = EnumC61165RgR.STRING;
        EnumC61183Rgj enumC61183Rgj9 = new EnumC61183Rgj(enumC61165RgR3, i) { // from class: X.RYx
            public final int A00;

            {
                String str;
                int i4;
                int i5;
                this.A00 = i;
                switch (i) {
                    case 0:
                        str = "STRING";
                        i4 = 8;
                        i5 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i4 = 9;
                        i5 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i4 = 10;
                        i5 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i4 = 11;
                        i5 = 2;
                        break;
                }
            }
        };
        A09 = enumC61183Rgj9;
        final EnumC61165RgR enumC61165RgR4 = EnumC61165RgR.MESSAGE;
        final int i4 = 1;
        EnumC61183Rgj enumC61183Rgj10 = new EnumC61183Rgj(enumC61165RgR4, i4) { // from class: X.RYx
            public final int A00;

            {
                String str;
                int i42;
                int i5;
                this.A00 = i4;
                switch (i4) {
                    case 0:
                        str = "STRING";
                        i42 = 8;
                        i5 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i42 = 9;
                        i5 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i42 = 10;
                        i5 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i42 = 11;
                        i5 = 2;
                        break;
                }
            }
        };
        A07 = enumC61183Rgj10;
        EnumC61183Rgj enumC61183Rgj11 = new EnumC61183Rgj(enumC61165RgR4, i2) { // from class: X.RYx
            public final int A00;

            {
                String str;
                int i42;
                int i5;
                this.A00 = i2;
                switch (i2) {
                    case 0:
                        str = "STRING";
                        i42 = 8;
                        i5 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i42 = 9;
                        i5 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i42 = 10;
                        i5 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i42 = 11;
                        i5 = 2;
                        break;
                }
            }
        };
        A08 = enumC61183Rgj11;
        final EnumC61165RgR enumC61165RgR5 = EnumC61165RgR.BYTE_STRING;
        EnumC61183Rgj enumC61183Rgj12 = new EnumC61183Rgj(enumC61165RgR5, i3) { // from class: X.RYx
            public final int A00;

            {
                String str;
                int i42;
                int i5;
                this.A00 = i3;
                switch (i3) {
                    case 0:
                        str = "STRING";
                        i42 = 8;
                        i5 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i42 = 9;
                        i5 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i42 = 10;
                        i5 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i42 = 11;
                        i5 = 2;
                        break;
                }
            }
        };
        A04 = enumC61183Rgj12;
        EnumC61183Rgj enumC61183Rgj13 = new EnumC61183Rgj(enumC61165RgR2, "UINT32", 12, 0);
        A0A = enumC61183Rgj13;
        EnumC61183Rgj enumC61183Rgj14 = new EnumC61183Rgj(EnumC61165RgR.ENUM, "ENUM", 13, 0);
        A05 = enumC61183Rgj14;
        A02 = new EnumC61183Rgj[]{enumC61183Rgj, enumC61183Rgj2, enumC61183Rgj3, enumC61183Rgj4, enumC61183Rgj5, enumC61183Rgj6, enumC61183Rgj7, enumC61183Rgj8, enumC61183Rgj9, enumC61183Rgj10, enumC61183Rgj11, enumC61183Rgj12, enumC61183Rgj13, enumC61183Rgj14, new EnumC61183Rgj(enumC61165RgR2, "SFIXED32", 14, 5), new EnumC61183Rgj(enumC61165RgR, "SFIXED64", 15, 1), new EnumC61183Rgj(enumC61165RgR2, "SINT32", 16, 0), new EnumC61183Rgj(enumC61165RgR, "SINT64", 17, 0)};
    }

    public static EnumC61183Rgj valueOf(String str) {
        return (EnumC61183Rgj) Enum.valueOf(EnumC61183Rgj.class, str);
    }

    public static EnumC61183Rgj[] values() {
        return (EnumC61183Rgj[]) A02.clone();
    }

    public EnumC61183Rgj(EnumC61165RgR enumC61165RgR, String str, int i, int i2) {
        this.A01 = enumC61165RgR;
        this.A00 = i2;
    }
}
