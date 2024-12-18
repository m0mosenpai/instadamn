package X;

/* renamed from: X.9VE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VE extends AbstractC72459Xe5 {
    public final String A00;

    public C9VE(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9VE) && C14360o3.A0K(this.A00, ((C9VE) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0S("AiInputString(string=", this.A00, ')');
    }
}
