package X;

/* renamed from: X.6aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141796aw implements C19L, AutoCloseable {
    public final C12W A00;

    public C141796aw(C12W c12w) {
        C14360o3.A0B(c12w, 1);
        this.A00 = c12w;
    }

    @Override // X.C19L
    public final C12W Arv() {
        return this.A00;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C57Z.A01(null, this.A00);
    }
}
