package X;

/* loaded from: classes10.dex */
public final class PxG extends AbstractC58533Px1 implements InterfaceC65280ThD {
    public static final PxG DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    public static volatile InterfaceC65281ThE PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    public int keyMaterialType_;
    public String typeUrl_ = "";
    public AbstractC58536Px4 value_ = AbstractC58536Px4.A01;

    static {
        PxG pxG = new PxG();
        DEFAULT_INSTANCE = pxG;
        AbstractC58533Px1.A0A(pxG, PxG.class);
    }

    public final Rj2 A0G() {
        int i = this.keyMaterialType_;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return Rj2.UNRECOGNIZED;
                        }
                        return Rj2.REMOTE;
                    }
                    return Rj2.ASYMMETRIC_PUBLIC;
                }
                return Rj2.ASYMMETRIC_PRIVATE;
            }
            return Rj2.SYMMETRIC;
        }
        return Rj2.UNKNOWN_KEYMATERIAL;
    }
}
