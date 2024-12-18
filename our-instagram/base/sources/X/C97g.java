package X;

/* renamed from: X.97g, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C97g {
    public static C97h A00;

    public static final C97h A00() {
        C97h c97h = A00;
        if (c97h == null) {
            try {
                C97h c97h2 = new C97h();
                A00 = c97h2;
                return c97h2;
            } catch (Exception e) {
                C18920wW A002 = new C12210kP(AbstractC12960li.A00).A00();
                InterfaceC02590Ai A003 = A002.A00(A002.A00, "android_on_device_install_referrer_logging");
                if (A003.isSampled()) {
                    A003.AAP("action", "create new storage exception");
                    A003.AAP("asset_id", "");
                    A003.A9K("activity_type", -1L);
                    A003.AAP("error", e.getMessage());
                    A003.Cht();
                }
                return null;
            }
        }
        return c97h;
    }
}
