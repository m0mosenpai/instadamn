package X;

/* renamed from: X.400, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass400 extends AnonymousClass401 {
    public TID A00;

    public String A07() {
        return null;
    }

    @Override // X.AnonymousClass401
    public final String A06() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        TID tid = this.A00;
        String A07 = A07();
        if (tid != null || A07 != null) {
            StringBuilder sb = new StringBuilder(100);
            sb.append(message);
            if (A07 != null) {
                sb.append(A07);
            }
            if (tid != null) {
                sb.append('\n');
                sb.append(" at ");
                sb.append(tid.toString());
            }
            return sb.toString();
        }
        return message;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AnonymousClass001.A0g(getClass().getName(), ": ", getMessage());
    }
}
