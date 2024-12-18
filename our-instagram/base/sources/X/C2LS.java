package X;

/* renamed from: X.2LS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2LS extends C1Ym {
    public static final C2LS A00 = new C2LS();

    public C2LS() {
        super(4, 5);
    }

    @Override // X.C1Ym
    public final void migrate(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
        interfaceC37481ol.ATG("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        interfaceC37481ol.ATG("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
