package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.767, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass767 extends AbstractC162927Rd implements C7AX {
    public final C7AX A00;
    public final Class A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass767(C7RX c7rx, C7AX c7ax, C158677Ad c158677Ad, Class cls) {
        super(c7rx, c158677Ad);
        C14360o3.A0B(c158677Ad, 1);
        C14360o3.A0B(c7rx, 2);
        this.A01 = cls;
        this.A00 = c7ax;
    }

    @Override // X.C7AX
    public final C7D8 CFg(DirectMessageIdentifier directMessageIdentifier) {
        C7AX c7ax = this.A00;
        if (c7ax != null) {
            return c7ax.CFg(directMessageIdentifier);
        }
        return null;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return this.A01;
    }
}
