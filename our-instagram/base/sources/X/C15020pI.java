package X;

/* renamed from: X.0pI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15020pI implements C10H {
    public final long A00;

    @Override // X.C10H
    public final InterfaceC19390xP AIW(C0UO c0uo) {
        return C0ST.A01(new C16300rb(new C06120Uc(null), AnonymousClass111.A02(new C06140Ue(null, this), c0uo)));
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.util.AbstractCollection, X.04D, X.01L] */
    public final String toString() {
        ?? c04d = new C04D();
        c04d.A02 = new Object[2];
        long j = this.A00;
        if (j > 0) {
            c04d.add(AnonymousClass001.A0e("stopTimeout=", "ms", j));
        }
        return AnonymousClass001.A0S("SharingStarted.WhileSubscribed(", AbstractC001800i.A0P(", ", "", "", C0eM.A1J(c04d), null), ')');
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C15020pI) && this.A00 == ((C15020pI) obj).A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.A00;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (Long.MAX_VALUE ^ (Long.MAX_VALUE >>> 32)));
    }

    public C15020pI(long j) {
        this.A00 = j;
        if (j >= 0) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0e("stopTimeout(", " ms) cannot be negative", j));
        }
    }
}
