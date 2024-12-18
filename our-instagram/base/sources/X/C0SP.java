package X;

import android.view.Window;

/* renamed from: X.0SP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SP extends C0u4 {
    @Override // X.AbstractC011704f
    public final void A04(boolean z) {
        if (z) {
            Window window = this.A00;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            A08(16);
            return;
        }
        A09(16);
    }

    @Override // X.AbstractC011704f
    public final void A05(boolean z) {
        if (z) {
            Window window = this.A00;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            A08(8192);
            return;
        }
        A09(8192);
    }

    @Override // X.AbstractC011704f
    public final boolean A06() {
        if ((this.A00.getDecorView().getSystemUiVisibility() & 16) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC011704f
    public final boolean A07() {
        if ((this.A00.getDecorView().getSystemUiVisibility() & 8192) == 0) {
            return false;
        }
        return true;
    }
}
