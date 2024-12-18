package X;

/* renamed from: X.8kD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195118kD extends C2JS implements C2JT {
    public final EnumC195158kH A0E() {
        return (EnumC195158kH) getOptionalEnumField(0, "property_name", EnumC195158kH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final C195128kE A0F() {
        return (C195128kE) getOptionalTreeField(1, "property_value", C195128kE.class, 1109881939);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return new C4OU(new C4OM[]{new C4OW(C94754Oe.A00, "property_name"), new C4OK(C195128kE.class, "property_value", 1109881939)});
    }

    public C195118kD(int i) {
        super(i);
    }

    public C195118kD() {
        super(791577990);
    }
}
