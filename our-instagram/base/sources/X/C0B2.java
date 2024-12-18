package X;

/* renamed from: X.0B2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0B2 extends AbstractC08800ci {
    public final AbstractC08800ci[] A00;

    @Override // X.AbstractC08800ci
    public final boolean A01(android.net.Uri uri) {
        if (uri == null) {
            return false;
        }
        for (AbstractC08800ci abstractC08800ci : this.A00) {
            if (!abstractC08800ci.A01(uri)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC08800ci
    public final boolean A00() {
        if (this.A00.length != 0) {
            return false;
        }
        return true;
    }

    public C0B2(AbstractC08800ci... abstractC08800ciArr) {
        this.A00 = abstractC08800ciArr;
    }
}
