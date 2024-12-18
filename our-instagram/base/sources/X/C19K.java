package X;

/* renamed from: X.19K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C19K implements C19L {
    public final C12W A00;

    @Override // X.C19L
    public final C12W Arv() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoroutineScope(coroutineContext=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C19K(C12W c12w) {
        this.A00 = c12w;
    }
}
