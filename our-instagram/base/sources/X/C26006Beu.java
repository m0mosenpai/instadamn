package X;

import java.util.Arrays;

/* renamed from: X.Beu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26006Beu extends C0T6 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04 = 100.0f;
    public final int A05;
    public final int A06;
    public final C25990Bee[][] A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26006Beu) {
                C26006Beu c26006Beu = (C26006Beu) obj;
                if (!C14360o3.A0K(this.A07, c26006Beu.A07) || Float.compare(this.A03, c26006Beu.A03) != 0 || Float.compare(this.A04, c26006Beu.A04) != 0 || Float.compare(this.A01, c26006Beu.A01) != 0 || Float.compare(this.A00, c26006Beu.A00) != 0 || this.A06 != c26006Beu.A06 || this.A05 != c26006Beu.A05 || Float.compare(this.A02, c26006Beu.A02) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public C26006Beu(C25990Bee[][] c25990BeeArr, float f, float f2, float f3, float f4, int i, int i2) {
        this.A07 = c25990BeeArr;
        this.A03 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A06 = i;
        this.A05 = i2;
        this.A02 = f4;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01((((AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(Arrays.hashCode(this.A07) * 31, this.A03), this.A04), this.A01), this.A00) + this.A06) * 31) + this.A05) * 31, this.A02);
    }
}
