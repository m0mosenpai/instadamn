package X;

import java.util.Collection;

/* loaded from: classes10.dex */
public final class R7R extends AbstractC08800ci {
    public final Collection A00;

    @Override // X.AbstractC08800ci
    public final boolean A00() {
        return this.A00.isEmpty();
    }

    @Override // X.AbstractC08800ci
    public final boolean A01(android.net.Uri uri) {
        if (uri != null && this.A00.contains(uri.getPath())) {
            return true;
        }
        return false;
    }

    public R7R(Collection collection) {
        if (!collection.isEmpty()) {
            this.A00 = collection;
            return;
        }
        throw AbstractC166987dD.A12("You need to pass at least one path");
    }
}
