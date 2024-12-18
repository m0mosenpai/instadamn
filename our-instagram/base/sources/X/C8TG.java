package X;

/* renamed from: X.8TG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TG extends AbstractC187378Sf {
    public final int A00;

    public C8TG(int i) {
        this.A00 = -1;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C8TG) && this.A00 == ((C8TG) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0I("StackedState(selectedIndex=", ')', this.A00);
    }

    public C8TG() {
        this(-1);
    }
}
