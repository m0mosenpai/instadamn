package X;

/* renamed from: X.6tf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152526tf extends AbstractC65924TwV {
    public String A00;

    public C152526tf() {
        super(5);
        this.A00 = "null_query";
    }

    @Override // X.AbstractC65924TwV
    public final boolean A05(String str) {
        C14360o3.A0B(str, 0);
        return U12.A03(this.A00, str);
    }

    @Override // X.AbstractC65924TwV
    public final Object A00() {
        return this.A00;
    }

    @Override // X.AbstractC65924TwV
    public final String A01() {
        return AnonymousClass001.A0R("entry_id_", this.A00);
    }

    @Override // X.AbstractC65924TwV
    public final String A02() {
        return AnonymousClass001.A0R("entry_id_", this.A00);
    }

    @Override // X.AbstractC65924TwV
    public final String A03() {
        return AnonymousClass001.A0R("logging_id_", this.A00);
    }

    @Override // X.AbstractC65924TwV
    public final String A04() {
        return "EFFECT";
    }
}
