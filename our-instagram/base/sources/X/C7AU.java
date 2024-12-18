package X;

/* renamed from: X.7AU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AU extends C7AV {
    public final C7IN A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7AU) && C14360o3.A0K(this.A00, ((C7AU) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Single(videoPlayer=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C7AU(C7IN c7in) {
        this.A00 = c7in;
    }
}
