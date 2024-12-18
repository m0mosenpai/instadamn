package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.9dx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213989dx extends C2JS implements InterfaceC174107p2 {
    @Override // X.InterfaceC174107p2
    public final ImmutableList AlZ() {
        return getRequiredCompactedTreeListField(5, "capabilities_min_version_models", C213949dt.class, 1497816082);
    }

    @Override // X.InterfaceC174107p2
    public final String BPa() {
        return A09("manifest_json");
    }

    @Override // X.InterfaceC174107p2
    public final InterfaceC174127p4 Bas() {
        return (InterfaceC174127p4) getOptionalTreeField(3, AbstractC58317Pt9.A00(332), C213979dw.class, -1040728851);
    }

    @Override // X.InterfaceC174107p2
    public final boolean CEG() {
        return getCoercedBooleanField(8, "uses_flm_capability");
    }

    @Override // X.InterfaceC174107p2
    public final String getId() {
        return A07("strong_id__");
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW A0V = AbstractC166997dE.A0V(c94754Oe);
        C4OK A0h = AbstractC166987dD.A0h(C4OO.A02(), C213959du.class, "effect_instructions", 1937911875);
        C4OW A0i = AbstractC166987dD.A0i(c94754Oe, "manifest_json");
        C4OK c4ok = new C4OK(C213979dw.class, AbstractC58317Pt9.A00(332), -1040728851);
        C4OW A0i2 = AbstractC166987dD.A0i(c94754Oe, "required_sdk_version");
        C4OK A0h2 = AbstractC166987dD.A0h(C4OO.A02(), C213949dt.class, "capabilities_min_version_models", 1497816082);
        C95124Py c95124Py = C95124Py.A00;
        return AbstractC166987dD.A0k(new C4OM[]{A0V, A0h, A0i, c4ok, A0i2, A0h2, AbstractC166987dD.A0i(c95124Py, "is_network_consent_required"), AbstractC166987dD.A0i(c95124Py, MSV.A00(1363)), AbstractC166987dD.A0i(c95124Py, "uses_flm_capability")});
    }

    public C213989dx(int i) {
        super(i);
    }

    public C213989dx() {
        super(945878766);
    }
}
