package X;

/* loaded from: classes8.dex */
public final class KV0 extends AbstractC46450KhA {
    public final int A00;
    public final int A01;
    public final int A02;
    public final CharSequence A03;
    public final CharSequence A04;

    public KV0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3) {
        C14360o3.A0B(charSequence, 1);
        this.A04 = charSequence;
        this.A03 = charSequence2;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KV0) {
                KV0 kv0 = (KV0) obj;
                if (!C14360o3.A0K(this.A04, kv0.A04) || !C14360o3.A0K(this.A03, kv0.A03) || this.A02 != kv0.A02 || this.A01 != kv0.A01 || this.A00 != kv0.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166987dD.A0G(this.A04) + AbstractC167017dG.A0M(this.A03)) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }
}
