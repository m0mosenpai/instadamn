package X;

/* renamed from: X.5WQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5WQ {
    public final boolean A00;

    public final boolean equals(Object obj) {
        boolean z = this.A00;
        if (!(obj instanceof C5WQ) || z != ((C5WQ) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public final String toString() {
        return AnonymousClass001.A0L("AppTheme(isDark=", ')', this.A00);
    }
}
