package X;

/* renamed from: X.T8l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C64302T8l implements InterfaceC65428Tjz {
    public final Rj2 A00;
    public final InterfaceC65281ThE A01;
    public final Class A02;
    public final String A03;

    public C64302T8l(Rj2 typeUrl, InterfaceC65281ThE primitiveClass, Class keyMaterialType, String protobufKeyParser) {
        this.A01 = primitiveClass;
        this.A03 = protobufKeyParser;
        this.A02 = keyMaterialType;
        this.A00 = typeUrl;
    }

    @Override // X.InterfaceC65428Tjz
    public final PxG CsS(AbstractC58536Px4 serializedKeyFormat) {
        RUZ A02 = AbstractC58532Px0.A02();
        A02.A07(this.A03);
        A02.A06(serializedKeyFormat);
        A02.A05(PxH.RAW);
        T91 A00 = T91.A00((RVD) A02.A02());
        C58550PxN c58550PxN = C58550PxN.A01;
        return AbstractC58532Px0.A01((C58551PxO) c58550PxN.A07(C63163SeN.A00(c58550PxN.A06(A00), C63163SeN.A02)));
    }
}
