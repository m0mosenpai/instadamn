package X;

/* renamed from: X.550, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass550 extends AbstractC1122454w {
    public final boolean A00;
    public static final AnonymousClass550 A02 = new AnonymousClass550(true);
    public static final AnonymousClass550 A01 = new AnonymousClass550(false);

    @Override // X.AbstractC911344p
    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj != null && (obj instanceof AnonymousClass550) && this.A00 == ((AnonymousClass550) obj).A00;
        }
        return true;
    }

    @Override // X.AbstractC911344p
    public final String A07() {
        if (this.A00) {
            return "true";
        }
        return "false";
    }

    @Override // X.C54u
    public final int hashCode() {
        if (!this.A00) {
            return 1;
        }
        return 3;
    }

    public AnonymousClass550(boolean z) {
        this.A00 = z;
    }

    @Override // X.AbstractC911344p
    public final int A03(int i) {
        return this.A00 ? 1 : 0;
    }
}
