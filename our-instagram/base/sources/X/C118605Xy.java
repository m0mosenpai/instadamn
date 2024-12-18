package X;

/* renamed from: X.5Xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118605Xy extends C0YY implements InterfaceC16660sJ {
    public static final C118605Xy A00 = new C118605Xy();

    public C118605Xy() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C118415Xd c118415Xd = (C118415Xd) obj;
        int round = Math.round(c118415Xd.A00);
        if (round < 0) {
            round = 0;
        }
        int round2 = Math.round(c118415Xd.A01);
        if (round2 < 0) {
            round2 = 0;
        }
        return new C119055aN(AbstractC119215ad.A00(round, round2));
    }
}
