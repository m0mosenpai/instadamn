package X;

/* loaded from: classes9.dex */
public final class MT7 extends AbstractC58374PuE implements InterfaceC65300ThY {
    public static final MT7 DEFAULT_INSTANCE;
    public static volatile InterfaceC57784PkB PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    public C58372PuC preferences_ = C58372PuC.A01;

    static {
        MT7 mt7 = new MT7();
        DEFAULT_INSTANCE = mt7;
        AbstractC58374PuE.defaultInstanceMap.put(MT7.class, mt7);
    }

    @Override // X.AbstractC58374PuE
    public final Object A03(Integer num, Object obj, Object obj2) {
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C58391PuV(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC58396Pua.A00});
            case 3:
                return new MT7();
            case 4:
                return new C50835MdS();
            default:
                return DEFAULT_INSTANCE;
        }
    }
}
