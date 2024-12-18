package X;

/* renamed from: X.MUx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50587MUx implements InterfaceC58122Ppl {
    public final long A00;

    @Override // X.InterfaceC58122Ppl
    public final String AKD() {
        return "NF_REACHABILITY_UPSELL_LAST_FIBONACCI_COOL_DOWN_UNTIL";
    }

    @Override // X.InterfaceC58122Ppl
    public final boolean CSe() {
        return true;
    }

    @Override // X.InterfaceC58122Ppl
    public final long AKC(int i) {
        int min = Math.min(i, 15);
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int i4 = i2;
            i2 = i3;
            if (min <= 0) {
                return i4 * this.A00;
            }
            min--;
            i3 += i4;
        }
    }

    public C50587MUx(long j) {
        this.A00 = j;
    }
}
