package X;

/* renamed from: X.TaO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64948TaO extends AbstractC16970sp {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03 = 1;

    public C64948TaO(char c, char c2) {
        this.A02 = c2;
        boolean z = C14360o3.A00(c, c2) <= 0;
        this.A01 = z;
        this.A00 = z ? c : c2;
    }

    @Override // X.AbstractC16970sp
    public final char A00() {
        int i = this.A00;
        if (i == this.A02) {
            if (this.A01) {
                this.A01 = false;
            } else {
                throw AbstractC58318PtA.A13();
            }
        } else {
            this.A00 = this.A03 + i;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01;
    }
}
