package X;

/* renamed from: X.7mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC172827mu {
    public static final EnumC172837mv[] A00;
    public static final EnumC172837mv[] A01;
    public static final EnumC172837mv[] A02;
    public static final EnumC172837mv[] A03;

    public static final EnumC172837mv[] A00(int i) {
        EnumC172837mv[] enumC172837mvArr;
        EnumC172837mv enumC172837mv;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i == 6) {
                            enumC172837mvArr = new EnumC172837mv[2];
                            enumC172837mvArr[0] = EnumC172837mv.A0G;
                            enumC172837mv = EnumC172837mv.A0C;
                        } else {
                            throw new UnsupportedOperationException(AnonymousClass001.A0O("Unsupported number of photos: ", i));
                        }
                    } else {
                        enumC172837mvArr = new EnumC172837mv[2];
                        enumC172837mvArr[0] = EnumC172837mv.A08;
                        enumC172837mv = EnumC172837mv.A0A;
                    }
                } else {
                    enumC172837mvArr = new EnumC172837mv[2];
                    enumC172837mvArr[0] = EnumC172837mv.A0H;
                    enumC172837mv = EnumC172837mv.A0B;
                }
            } else {
                enumC172837mvArr = new EnumC172837mv[2];
                enumC172837mvArr[0] = EnumC172837mv.A09;
                enumC172837mv = EnumC172837mv.A0D;
            }
        } else {
            enumC172837mvArr = new EnumC172837mv[2];
            enumC172837mvArr[0] = EnumC172837mv.A0F;
            enumC172837mv = EnumC172837mv.A0E;
        }
        enumC172837mvArr[1] = enumC172837mv;
        return enumC172837mvArr;
    }

    static {
        EnumC172837mv enumC172837mv = EnumC172837mv.A0H;
        EnumC172837mv enumC172837mv2 = EnumC172837mv.A0E;
        EnumC172837mv enumC172837mv3 = EnumC172837mv.A0D;
        EnumC172837mv enumC172837mv4 = EnumC172837mv.A0F;
        EnumC172837mv enumC172837mv5 = EnumC172837mv.A0G;
        A01 = new EnumC172837mv[]{enumC172837mv, enumC172837mv2, enumC172837mv3, enumC172837mv4, enumC172837mv5, EnumC172837mv.A09};
        A02 = new EnumC172837mv[]{EnumC172837mv.A0B, EnumC172837mv.A0A, EnumC172837mv.A0C, EnumC172837mv.A08};
        A03 = new EnumC172837mv[]{enumC172837mv4, enumC172837mv2, enumC172837mv3};
        A00 = new EnumC172837mv[]{enumC172837mv, enumC172837mv2, enumC172837mv3, enumC172837mv4, enumC172837mv5};
    }
}
