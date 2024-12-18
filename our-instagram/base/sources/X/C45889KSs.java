package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.KSs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45889KSs extends AbstractC162927Rd implements C7AX {
    public final C7AX A00;
    public final Class A01;

    @Override // X.C7AX
    public final C7D8 CFg(DirectMessageIdentifier directMessageIdentifier) {
        return this.A00.CFg(directMessageIdentifier);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return this.A01;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45889KSs(C7RX c7rx, C7AX c7ax, C49119Lnw c49119Lnw, Class cls) {
        super(c7rx, c49119Lnw);
        AbstractC25234BEr.A1P(c49119Lnw, c7rx, c7ax);
        this.A01 = cls;
        this.A00 = c7ax;
    }
}
