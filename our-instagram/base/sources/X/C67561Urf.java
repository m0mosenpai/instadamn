package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Urf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67561Urf extends C2JS implements MS7 {
    @Override // X.MS7
    public final VF2 BIQ() {
        return (VF2) getOptionalEnumField(0, "instagram_position", VF2.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.MS7
    public final ImmutableList Bfq() {
        return getRequiredCompactedTreeListField(1, "preview_info", C67560Ure.class, -274625485);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC58320PtC.A0T(C4OO.A02(), new C4OW(C94754Oe.A00, "instagram_position"), C67560Ure.class, "preview_info", -274625485);
    }

    public C67561Urf(int i) {
        super(i);
    }

    public C67561Urf() {
        super(-1372103358);
    }
}
