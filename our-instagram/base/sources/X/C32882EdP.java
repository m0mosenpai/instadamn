package X;

/* renamed from: X.EdP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32882EdP extends AbstractC33547EsL {
    public final String A00;

    public C32882EdP(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32882EdP) && C14360o3.A0K(this.A00, ((C32882EdP) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
