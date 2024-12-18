package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* loaded from: classes8.dex */
public final class L7E {
    public final /* synthetic */ L1V A00;
    public final /* synthetic */ C1580377n A01;
    public final /* synthetic */ DirectMessageIdentifier A02;

    public L7E(L1V l1v, C1580377n c1580377n, DirectMessageIdentifier directMessageIdentifier) {
        this.A01 = c1580377n;
        this.A02 = directMessageIdentifier;
        this.A00 = l1v;
    }

    public final void A00(Exception exc) {
        C11T.A02(new M6O(this.A00, this.A01, this.A02, exc));
    }
}
