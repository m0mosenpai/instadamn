package X;

/* loaded from: classes5.dex */
public final class DEN extends C0YY implements InterfaceC16820sZ {
    public static final DEN A00 = new DEN();

    public DEN() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.BUS, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C27726CKt c27726CKt = BUS.A03;
        BUS bus = BUS.A04;
        if (bus == null) {
            synchronized (c27726CKt) {
                BUS bus2 = BUS.A04;
                bus = bus2;
                if (bus2 == null) {
                    ?? obj = new Object();
                    BUS.A04 = obj;
                    bus = obj;
                }
            }
        }
        return bus;
    }
}
