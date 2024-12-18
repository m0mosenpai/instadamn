package X;

import android.content.DialogInterface;

/* renamed from: X.7d6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166927d6 extends C0T6 implements InterfaceC166427cB {
    public final DialogInterface.OnDismissListener A00;
    public final DialogInterface.OnShowListener A01;
    public final C22P A02;
    public final C167607eG A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166927d6) {
                C166927d6 c166927d6 = (C166927d6) obj;
                if (!C14360o3.A0K(this.A03, c166927d6.A03) || this.A02 != c166927d6.A02 || !C14360o3.A0K(this.A01, c166927d6.A01) || !C14360o3.A0K(this.A00, c166927d6.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C167607eG c167607eG = this.A03;
        return ((((((c167607eG == null ? 0 : c167607eG.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }

    public C166927d6(DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, C22P c22p, C167607eG c167607eG) {
        this.A03 = c167607eG;
        this.A02 = c22p;
        this.A01 = onShowListener;
        this.A00 = onDismissListener;
    }
}
