package X;

/* renamed from: X.3zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89973zd extends C2QW {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        if ((obj instanceof C89973zd) && C14360o3.A0K(this.A00, ((C89973zd) obj).A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.A00;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // X.C2QW
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Closed(");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C89973zd(Throwable th) {
        this.A00 = th;
    }
}
