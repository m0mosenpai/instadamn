package X;

/* renamed from: X.2LQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2LQ extends C1Ym {
    public static final C2LQ A00 = new C2LQ();

    public C2LQ() {
        super(3, 4);
    }

    @Override // X.C1Ym
    public final void migrate(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
        interfaceC37481ol.ATG("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
