package X;

/* renamed from: X.OyB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56264OyB implements C8FR {
    public final C8JF A00;

    @Override // X.C8FR
    public final Integer B0Z(String str) {
        int A00 = this.A00.A00(str);
        if (A00 < 0) {
            return null;
        }
        return Integer.valueOf(A00);
    }

    public C56264OyB(C8JF c8jf) {
        this.A00 = c8jf;
    }
}
