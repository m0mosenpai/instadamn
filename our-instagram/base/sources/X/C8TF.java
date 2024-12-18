package X;

/* renamed from: X.8TF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TF extends AbstractC187378Sf {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8TF) && this.A00 == ((C8TF) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0I("ClipSelectedState(selectedIndex=", ')', this.A00);
    }

    public C8TF(int i) {
        this.A00 = i;
    }

    public C8TF() {
        this(-1);
    }
}
