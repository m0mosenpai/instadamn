package X;

/* renamed from: X.MdW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50839MdW extends AbstractC58374PuE implements InterfaceC65300ThY {
    public static final C50839MdW DEFAULT_INSTANCE;
    public static volatile InterfaceC57784PkB PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    public InterfaceC65688TsA strings_ = Q7L.A02;

    static {
        C50839MdW c50839MdW = new C50839MdW();
        DEFAULT_INSTANCE = c50839MdW;
        AbstractC58374PuE.defaultInstanceMap.put(C50839MdW.class, c50839MdW);
    }

    @Override // X.AbstractC58374PuE
    public final Object A03(Integer num, Object obj, Object obj2) {
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                String A00 = AbstractC58317Pt9.A00(410);
                return new C58391PuV(DEFAULT_INSTANCE, A00, new Object[]{"strings_"});
            case 3:
                return new C50839MdW();
            case 4:
                return new C50836MdT();
            default:
                return DEFAULT_INSTANCE;
        }
    }
}
