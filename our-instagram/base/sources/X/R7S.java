package X;

import java.util.Collection;

/* loaded from: classes10.dex */
public final class R7S extends AbstractC08800ci {
    public final Integer A00 = C05F.A00;
    public final Collection A01;

    @Override // X.AbstractC08800ci
    public final boolean A01(android.net.Uri uri) {
        if (uri == null) {
            return false;
        }
        Integer num = this.A00;
        if (num == C05F.A00) {
            return this.A01.contains(uri.getScheme());
        }
        if (num == C05F.A01) {
            return !this.A01.contains(uri.getScheme());
        }
        return false;
    }

    public R7S(Collection collection) {
        this.A01 = collection;
    }

    @Override // X.AbstractC08800ci
    public final boolean A00() {
        return this.A01.isEmpty();
    }
}
