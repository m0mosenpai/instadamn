package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.4sL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107154sL extends CancellationException {
    public final transient AnonymousClass195 A00;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C107154sL) {
                C107154sL c107154sL = (C107154sL) obj;
                if (C14360o3.A0K(c107154sL.getMessage(), getMessage()) && C14360o3.A0K(c107154sL.A00, this.A00) && C14360o3.A0K(c107154sL.getCause(), getCause())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.A00);
        return sb.toString();
    }

    public C107154sL(String str, Throwable th, AnonymousClass195 anonymousClass195) {
        super(str);
        this.A00 = anonymousClass195;
        if (th != null) {
            initCause(th);
        }
    }

    public final int hashCode() {
        int i;
        String message = getMessage();
        C14360o3.A0A(message);
        int hashCode = ((message.hashCode() * 31) + this.A00.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
