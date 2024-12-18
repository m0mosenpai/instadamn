package X;

/* renamed from: X.2Lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48592Lb extends C1Ym {
    public static final C48592Lb A00 = new C48592Lb();

    @Override // X.C1Ym
    public final void migrate(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
        interfaceC37481ol.ATG("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }

    public C48592Lb() {
        super(11, 12);
    }
}
