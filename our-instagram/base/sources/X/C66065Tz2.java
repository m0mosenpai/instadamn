package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Tz2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66065Tz2 extends C2JS implements MS8 {
    @Override // X.MS8
    public final EnumC44167JfW AYi() {
        return (EnumC44167JfW) getOptionalEnumField(0, "action_type", EnumC44167JfW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.MS8
    public final ImmutableList BOQ() {
        return getRequiredCompactedEnumListField(1, "locations", EnumC44168JfX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0Y(C94754Oe.A01(), new C4OW(C94754Oe.A00, "action_type"), "locations");
    }

    public C66065Tz2(int i) {
        super(i);
    }

    public C66065Tz2() {
        super(960801641);
    }
}
