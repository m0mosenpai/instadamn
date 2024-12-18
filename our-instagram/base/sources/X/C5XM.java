package X;

/* renamed from: X.5XM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5XM extends C0T6 implements InterfaceC118065Vq {
    public final float A00;
    public final float A01;
    public final float A02;

    @Override // X.InterfaceC118065Vq
    public final C58K AL3(C5XP c5xp) {
        C14360o3.A0B(c5xp, 0);
        return new C5Zw(c5xp, this.A01, this.A00, this.A02);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5XM) {
                C5XM c5xm = (C5XM) obj;
                if (Float.compare(this.A01, c5xm.A01) != 0 || Float.compare(this.A00, c5xm.A00) != 0 || Float.compare(this.A02, c5xm.A02) != 0 || Float.compare(0.0f, 0.0f) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(0.0f);
    }

    public C5XM(float f, float f2) {
        this.A01 = 0.9f;
        this.A00 = f;
        this.A02 = f2;
    }

    public C5XM() {
        this(400.0f, 400.0f);
    }
}
