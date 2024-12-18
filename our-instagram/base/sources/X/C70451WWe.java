package X;

/* renamed from: X.WWe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70451WWe implements X9A {
    public final String A00;

    @Override // X.X9A
    public final boolean FDX(X9A x9a) {
        return ((C70451WWe) x9a).A00.equals(this.A00);
    }

    public C70451WWe(String str) {
        if (str != null && !str.isEmpty()) {
            this.A00 = str;
            return;
        }
        throw new IllegalArgumentException("Non-null/Non-empty identifier required");
    }
}
