package X;

/* renamed from: X.9Ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211709Ze extends C0T6 {
    public static final C211709Ze A02 = new C211709Ze(true, false);
    public static final C211709Ze A03 = new C211709Ze(true, true);
    public static final C211709Ze A04 = new C211709Ze(false, false);
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211709Ze) {
                C211709Ze c211709Ze = (C211709Ze) obj;
                if (this.A00 != c211709Ze.A00 || this.A01 != c211709Ze.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return AbstractC166987dD.A0K(this.A01, i * 31);
    }

    public C211709Ze(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
