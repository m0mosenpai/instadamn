package X;

/* renamed from: X.Pj6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57717Pj6 extends C0YY implements InterfaceC16660sJ {
    public static final C57717Pj6 A00 = new C57717Pj6();

    public C57717Pj6() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractC52972be abstractC52972be = (AbstractC52972be) obj;
        C14360o3.A0B(abstractC52972be, 0);
        C54703OEf c54703OEf = (C54703OEf) abstractC52972be.A00(C55574OmC.A00);
        if (c54703OEf != null) {
            OB0 ob0 = c54703OEf.A01;
            OCK ock = c54703OEf.A03;
            return new C6WU(ob0, c54703OEf.A02, ock, c54703OEf.A04, c54703OEf.A05, c54703OEf.A06);
        }
        throw AbstractC166987dD.A14("No use case provider found");
    }
}
