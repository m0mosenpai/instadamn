package X;

/* renamed from: X.2Lc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48602Lc extends C1Ym {
    public static final C48602Lc A00 = new C48602Lc();

    @Override // X.C1Ym
    public final void migrate(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
        interfaceC37481ol.ATG("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        interfaceC37481ol.ATG("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }

    public C48602Lc() {
        super(12, 13);
    }
}
