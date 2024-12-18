package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF19' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.PuZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class EnumC58395PuZ {
    public static final /* synthetic */ EnumC58395PuZ[] A02;
    public static final EnumC58395PuZ A03;
    public static final EnumC58395PuZ A04;
    public static final EnumC58395PuZ A05;
    public static final EnumC58395PuZ A06;
    public final int A00;
    public final EnumC58394PuY A01;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC58395PuZ EF21;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC58395PuZ EF20;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC58395PuZ EF19;

    static {
        final int i = 0;
        final int i2 = 1;
        EnumC58395PuZ enumC58395PuZ = new EnumC58395PuZ(EnumC58394PuY.DOUBLE, "DOUBLE", 0, 1);
        EnumC58395PuZ enumC58395PuZ2 = new EnumC58395PuZ(EnumC58394PuY.FLOAT, "FLOAT", 1, 5);
        EnumC58394PuY enumC58394PuY = EnumC58394PuY.LONG;
        final int i3 = 2;
        EnumC58395PuZ enumC58395PuZ3 = new EnumC58395PuZ(enumC58394PuY, "INT64", 2, 0);
        final int i4 = 3;
        EnumC58395PuZ enumC58395PuZ4 = new EnumC58395PuZ(enumC58394PuY, "UINT64", 3, 0);
        EnumC58394PuY enumC58394PuY2 = EnumC58394PuY.INT;
        EnumC58395PuZ enumC58395PuZ5 = new EnumC58395PuZ(enumC58394PuY2, "INT32", 4, 0);
        EnumC58395PuZ enumC58395PuZ6 = new EnumC58395PuZ(enumC58394PuY, "FIXED64", 5, 1);
        EnumC58395PuZ enumC58395PuZ7 = new EnumC58395PuZ(enumC58394PuY2, "FIXED32", 6, 5);
        EnumC58395PuZ enumC58395PuZ8 = new EnumC58395PuZ(EnumC58394PuY.BOOLEAN, "BOOL", 7, 0);
        final EnumC58394PuY enumC58394PuY3 = EnumC58394PuY.STRING;
        EnumC58395PuZ enumC58395PuZ9 = new EnumC58395PuZ(enumC58394PuY3, i) { // from class: X.Pu4
            public final int A00;

            {
                String str;
                int i5;
                int i6;
                this.A00 = i;
                switch (i) {
                    case 0:
                        str = "STRING";
                        i5 = 8;
                        i6 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i5 = 9;
                        i6 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i5 = 10;
                        i6 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i5 = 11;
                        i6 = 2;
                        break;
                }
            }
        };
        A06 = enumC58395PuZ9;
        final EnumC58394PuY enumC58394PuY4 = EnumC58394PuY.MESSAGE;
        EnumC58395PuZ enumC58395PuZ10 = new EnumC58395PuZ(enumC58394PuY4, i2) { // from class: X.Pu4
            public final int A00;

            {
                String str;
                int i5;
                int i6;
                this.A00 = i2;
                switch (i2) {
                    case 0:
                        str = "STRING";
                        i5 = 8;
                        i6 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i5 = 9;
                        i6 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i5 = 10;
                        i6 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i5 = 11;
                        i6 = 2;
                        break;
                }
            }
        };
        A04 = enumC58395PuZ10;
        EnumC58395PuZ enumC58395PuZ11 = new EnumC58395PuZ(enumC58394PuY4, i3) { // from class: X.Pu4
            public final int A00;

            {
                String str;
                int i5;
                int i6;
                this.A00 = i3;
                switch (i3) {
                    case 0:
                        str = "STRING";
                        i5 = 8;
                        i6 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i5 = 9;
                        i6 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i5 = 10;
                        i6 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i5 = 11;
                        i6 = 2;
                        break;
                }
            }
        };
        A05 = enumC58395PuZ11;
        final EnumC58394PuY enumC58394PuY5 = EnumC58394PuY.BYTE_STRING;
        EnumC58395PuZ enumC58395PuZ12 = new EnumC58395PuZ(enumC58394PuY5, i4) { // from class: X.Pu4
            public final int A00;

            {
                String str;
                int i5;
                int i6;
                this.A00 = i4;
                switch (i4) {
                    case 0:
                        str = "STRING";
                        i5 = 8;
                        i6 = 2;
                        break;
                    case 1:
                        str = "GROUP";
                        i5 = 9;
                        i6 = 3;
                        break;
                    case 2:
                        str = "MESSAGE";
                        i5 = 10;
                        i6 = 2;
                        break;
                    default:
                        str = "BYTES";
                        i5 = 11;
                        i6 = 2;
                        break;
                }
            }
        };
        A03 = enumC58395PuZ12;
        A02 = new EnumC58395PuZ[]{enumC58395PuZ, enumC58395PuZ2, enumC58395PuZ3, enumC58395PuZ4, enumC58395PuZ5, enumC58395PuZ6, enumC58395PuZ7, enumC58395PuZ8, enumC58395PuZ9, enumC58395PuZ10, enumC58395PuZ11, enumC58395PuZ12, new EnumC58395PuZ(enumC58394PuY2, "UINT32", 12, 0), new EnumC58395PuZ(EnumC58394PuY.ENUM, "ENUM", 13, 0), new EnumC58395PuZ(enumC58394PuY2, "SFIXED32", 14, 5), new EnumC58395PuZ(enumC58394PuY, "SFIXED64", 15, 1), new EnumC58395PuZ(enumC58394PuY2, "SINT32", 16, 0), new EnumC58395PuZ(enumC58394PuY, "SINT64", 17, 0)};
    }

    public static EnumC58395PuZ valueOf(String str) {
        return (EnumC58395PuZ) Enum.valueOf(EnumC58395PuZ.class, str);
    }

    public static EnumC58395PuZ[] values() {
        return (EnumC58395PuZ[]) A02.clone();
    }

    public EnumC58395PuZ(EnumC58394PuY enumC58394PuY, String str, int i, int i2) {
        this.A01 = enumC58394PuY;
        this.A00 = i2;
    }
}
