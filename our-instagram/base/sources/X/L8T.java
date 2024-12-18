package X;

import com.instagram.direct.store.InboxNetworkSource;

/* loaded from: classes8.dex */
public final class L8T {
    public final /* synthetic */ LLk A00;

    public L8T(LLk lLk) {
        this.A00 = lLk;
    }

    public final boolean A00() {
        InboxNetworkSource inboxNetworkSource = this.A00.A0p.A04;
        if (inboxNetworkSource == null) {
            C14360o3.A0F("directCurrentSource");
            throw C00O.createAndThrow();
        }
        return inboxNetworkSource.A04;
    }

    public final boolean A01() {
        InboxNetworkSource inboxNetworkSource = this.A00.A0p.A04;
        if (inboxNetworkSource == null) {
            C14360o3.A0F("directCurrentSource");
            throw C00O.createAndThrow();
        }
        return inboxNetworkSource.A03;
    }
}
