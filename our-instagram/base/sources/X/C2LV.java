package X;

/* renamed from: X.2LV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2LV extends C1Ym {
    public static final C2LV A00 = new C2LV();

    public C2LV() {
        super(7, 8);
    }

    @Override // X.C1Ym
    public final void migrate(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
        interfaceC37481ol.ATG("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
