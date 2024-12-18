package X;

/* loaded from: classes9.dex */
public final class MT8 extends AbstractC58374PuE implements InterfaceC65300ThY {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final MT8 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    public static volatile InterfaceC57784PkB PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    public int bitField0_;
    public int valueCase_ = 0;
    public Object value_;

    static {
        MT8 mt8 = new MT8();
        DEFAULT_INSTANCE = mt8;
        AbstractC58374PuE.defaultInstanceMap.put(MT8.class, mt8);
    }

    public static C50837MdU A00() {
        return (C50837MdU) ((AbstractC50838MdV) DEFAULT_INSTANCE.A03(C05F.A0Y, null, null));
    }

    @Override // X.AbstractC58374PuE
    public final Object A03(Integer num, Object obj, Object obj2) {
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C58391PuV(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C50839MdW.class});
            case 3:
                return new MT8();
            case 4:
                return new C50837MdU();
            default:
                return DEFAULT_INSTANCE;
        }
    }
}
