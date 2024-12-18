package X;

/* renamed from: X.5UG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5UG {
    public final C18590vm A00;

    public final boolean equals(Object obj) {
        C18590vm c18590vm = this.A00;
        if (!(obj instanceof C5UG) || !C14360o3.A0K(c18590vm, ((C5UG) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        C18590vm c18590vm = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("MutableScatterMultiMap(map=");
        sb.append(c18590vm);
        sb.append(')');
        return sb.toString();
    }
}
