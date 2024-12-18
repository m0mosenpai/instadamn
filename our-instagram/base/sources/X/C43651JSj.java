package X;

/* renamed from: X.JSj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43651JSj implements C6J5 {
    public final int A00;

    public C43651JSj(int i) {
        this.A00 = i;
    }

    @Override // X.C6J5
    public final boolean test(Object obj) {
        if (this.A00 != 0) {
            return AbstractC167007dF.A1W(((C43618JRb) obj).A00);
        }
        if (((C46h) obj) instanceof C4JL) {
            return true;
        }
        return false;
    }
}
