package X;

/* renamed from: X.PxO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58551PxO implements InterfaceC65430Tk1 {
    public final Rj2 A00;
    public final PxH A01;
    public final AbstractC58536Px4 A02;
    public final C58526Pwu A03;
    public final Integer A04;
    public final String A05;

    public static C58551PxO A00(Rj2 typeUrl, PxH value, AbstractC58536Px4 keyMaterialType, Integer outputPrefixType, String idRequirement) {
        if (value == PxH.RAW) {
            if (outputPrefixType != null) {
                throw AbstractC58318PtA.A0x("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (outputPrefixType == null) {
            throw AbstractC58318PtA.A0x("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C58551PxO(typeUrl, value, keyMaterialType, outputPrefixType, idRequirement);
    }

    @Override // X.InterfaceC65430Tk1
    public final C58526Pwu BYW() {
        return this.A03;
    }

    public C58551PxO(Rj2 typeUrl, PxH value, AbstractC58536Px4 keyMaterialType, Integer outputPrefixType, String idRequirement) {
        this.A05 = idRequirement;
        this.A03 = AbstractC58538Px6.A01(idRequirement);
        this.A02 = keyMaterialType;
        this.A00 = typeUrl;
        this.A01 = value;
        this.A04 = outputPrefixType;
    }
}
