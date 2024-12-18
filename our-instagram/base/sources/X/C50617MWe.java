package X;

/* renamed from: X.MWe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50617MWe extends C0T6 implements AnonymousClass501 {
    public final String A00;

    public C50617MWe(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C50617MWe) && C14360o3.A0K(this.A00, ((C50617MWe) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("UserName(name=", this.A00);
    }
}
