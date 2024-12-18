package X;

/* renamed from: X.2LX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2LX extends C1Ym {
    public static final C2LX A00 = new C2LX();

    @Override // X.C1Ym
    public final void migrate(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
        interfaceC37481ol.ATG("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }

    public C2LX() {
        super(8, 9);
    }
}
