package X;

/* loaded from: classes10.dex */
public final class RUY extends PxQ implements InterfaceC65280ThD {
    public RUY() {
        super(PxG.DEFAULT_INSTANCE);
    }

    public final void A05(Rj2 value) {
        PxG pxG = (PxG) PxQ.A00(this);
        int i = PxG.KEY_MATERIAL_TYPE_FIELD_NUMBER;
        if (value != Rj2.UNRECOGNIZED) {
            pxG.keyMaterialType_ = value.A00;
            return;
        }
        throw AbstractC166987dD.A12("Can't get the number of an unknown enum value.");
    }

    public final void A06(AbstractC58536Px4 value) {
        PxG pxG = (PxG) PxQ.A00(this);
        int i = PxG.KEY_MATERIAL_TYPE_FIELD_NUMBER;
        value.getClass();
        pxG.value_ = value;
    }

    public final void A07(String value) {
        PxG pxG = (PxG) PxQ.A00(this);
        int i = PxG.KEY_MATERIAL_TYPE_FIELD_NUMBER;
        value.getClass();
        pxG.typeUrl_ = value;
    }

    @Override // X.T9B
    public final /* bridge */ /* synthetic */ Object clone() {
        return A01();
    }
}
