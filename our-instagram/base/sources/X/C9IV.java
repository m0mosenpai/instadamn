package X;

import java.util.List;

/* renamed from: X.9IV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9IV extends C0T6 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9IV) {
                C9IV c9iv = (C9IV) obj;
                if (!C14360o3.A0K(this.A05, c9iv.A05) || Float.compare(this.A03, c9iv.A03) != 0 || Float.compare(this.A00, c9iv.A00) != 0 || Float.compare(this.A04, c9iv.A04) != 0 || Float.compare(this.A01, c9iv.A01) != 0 || Float.compare(this.A02, c9iv.A02) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public C9IV(boolean z) {
        C16930sl c16930sl = C16930sl.A00;
        float f = z ? 0.0f : 1.0f;
        C14360o3.A0B(c16930sl, 1);
        this.A05 = c16930sl;
        this.A03 = f;
        this.A00 = 1.0f;
        this.A04 = 1.0f;
        this.A01 = 1.0f;
        this.A02 = 1.0f;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166987dD.A0G(this.A05), this.A03), this.A00), this.A04), this.A01) + Float.floatToIntBits(this.A02);
    }

    public C9IV() {
        this(false);
    }
}
