package X;

import com.facebookpay.common.models.ErrorDialogContent;

/* loaded from: classes11.dex */
public final class X1q extends RuntimeException {
    public final ErrorDialogContent A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof X1q) && C14360o3.A0K(this.A00, ((X1q) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ECPErrorDialogException(errorDialogContent=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }

    public X1q(ErrorDialogContent errorDialogContent) {
        this.A00 = errorDialogContent;
    }
}
