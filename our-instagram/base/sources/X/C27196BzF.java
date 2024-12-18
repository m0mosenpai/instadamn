package X;

/* renamed from: X.BzF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27196BzF extends AbstractC27434C9c {
    public final String A00;

    public C27196BzF(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27196BzF) && C14360o3.A0K(this.A00, ((C27196BzF) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
