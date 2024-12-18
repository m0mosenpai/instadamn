package X;

/* renamed from: X.Mqs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51600Mqs extends C0T6 {
    public final float A00;
    public final long A01;
    public final MVC A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51600Mqs) {
                C51600Mqs c51600Mqs = (C51600Mqs) obj;
                if (!C14360o3.A0K(this.A02, c51600Mqs.A02) || !C14360o3.A0K(this.A03, c51600Mqs.A03) || this.A01 != c51600Mqs.A01 || Float.compare(this.A00, c51600Mqs.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC25236BEt.A01(this.A01, ((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31), this.A00);
    }

    public C51600Mqs(MVC mvc, String str, float f, long j) {
        this.A02 = mvc;
        this.A03 = str;
        this.A01 = j;
        this.A00 = f;
    }
}
