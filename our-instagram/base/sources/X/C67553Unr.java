package X;

/* renamed from: X.Unr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67553Unr extends C2JS implements XIX {
    @Override // X.XIX
    public final EnumC68187VFf Bbw() {
        return (EnumC68187VFf) getOptionalEnumField(0, "payout_credential_type", EnumC68187VFf.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.XIX
    public final String Bbz() {
        return A09("payout_method_detail");
    }

    @Override // X.XIX
    public final String Bc0() {
        return A08("payout_method_title");
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return AbstractC167017dG.A0X(c94754Oe, new C4OW(c94754Oe, "payout_credential_type"), new C4OW(c94754Oe, "payout_method_title"), "payout_method_detail");
    }

    public C67553Unr(int i) {
        super(i);
    }

    public C67553Unr() {
        super(-1344103629);
    }
}
