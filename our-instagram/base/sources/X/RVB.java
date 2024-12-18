package X;

@Deprecated
/* loaded from: classes10.dex */
public final class RVB extends AbstractC58533Px1 implements InterfaceC65280ThD {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    public static final RVB DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    public static volatile InterfaceC65281ThE PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    public int keyManagerVersion_;
    public boolean newKeyAllowed_;
    public String primitiveName_ = "";
    public String typeUrl_ = "";
    public String catalogueName_ = "";

    static {
        RVB rvb = new RVB();
        DEFAULT_INSTANCE = rvb;
        AbstractC58533Px1.A0A(rvb, RVB.class);
    }
}
