package X;

/* renamed from: X.5gK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122245gK {
    public final C4SS A00;
    public final Integer A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((C122245gK) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C122245gK(C4SS c4ss, Integer num, boolean z, boolean z2) {
        this.A00 = c4ss;
        this.A03 = z;
        this.A01 = num;
        this.A02 = z2;
    }
}
