package X;

/* renamed from: X.4Pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95134Pz extends C2JS implements C4Q0 {
    @Override // X.C4Q0
    public final boolean BJc() {
        return getCoercedBooleanField(0, "is_basic_ads_opted_in");
    }

    @Override // X.C4Q0
    public final boolean BJd() {
        return getCoercedBooleanField(2, "is_basic_ads_youth");
    }

    @Override // X.C4Q0
    public final EnumC23041Aj C8G() {
        return (EnumC23041Aj) getOptionalEnumField(1, "tier", EnumC23041Aj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.C4Q0
    public final boolean CL4() {
        return hasFieldValue("is_basic_ads_opted_in");
    }

    @Override // X.C4Q0
    public final boolean CL5() {
        return hasFieldValue("is_basic_ads_youth");
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{new C4OW(c95124Py, "is_basic_ads_opted_in"), new C4OW(C94754Oe.A00, "tier"), new C4OW(c95124Py, "is_basic_ads_youth")});
    }

    public C95134Pz(int i) {
        super(i);
    }

    public C95134Pz() {
        super(19589305);
    }
}
