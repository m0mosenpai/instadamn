package X;

/* renamed from: X.7iX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170187iX implements InterfaceC75873as {
    public final Class A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C170187iX) && C14360o3.A0K(this.A00, ((C170187iX) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClassBasedTreeProp(clazz=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.InterfaceC75873as
    public final Object AwR() {
        return null;
    }

    public C170187iX(Class cls) {
        this.A00 = cls;
    }
}
