package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4cL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99014cL {
    public C9B0 A00;
    public final List A01;
    public final C99004cK A02;

    public C99014cL(C99004cK c99004cK) {
        C14360o3.A0B(c99004cK, 2);
        this.A02 = c99004cK;
        this.A01 = new ArrayList();
    }

    private final C9B0 A00(C9B0 c9b0) {
        if (c9b0 == null) {
            return null;
        }
        long j = c9b0.A01;
        long j2 = c9b0.A03;
        if (j - j2 >= 1) {
            return new C9B0(1, c9b0.A04, c9b0.A02, j2, j);
        }
        return null;
    }

    public final synchronized List A01() {
        ArrayList A0U;
        A0U = AbstractC001800i.A0U(this.A01);
        C9B0 A00 = A00(this.A00);
        if (A00 != null) {
            A0U.add(A00);
        }
        return AbstractC001800i.A0a(A0U);
    }

    public final synchronized void A02(boolean z, boolean z2) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long uptimeMillis = SystemClock.uptimeMillis() / 1000;
        try {
            if (z) {
                C9B0 c9b0 = this.A00;
                C9B0 c9b02 = new C9B0(0, currentTimeMillis, uptimeMillis, currentTimeMillis, uptimeMillis);
                if (c9b0 != null) {
                    if (uptimeMillis - c9b0.A01 <= 15) {
                        c9b02 = new C9B0(0, c9b0.A04, c9b0.A03, currentTimeMillis, uptimeMillis);
                    } else {
                        C9B0 A00 = A00(c9b0);
                        if (A00 != null) {
                            this.A01.add(A00);
                        }
                    }
                }
                this.A00 = c9b02;
            } else {
                C9B0 c9b03 = this.A00;
                this.A00 = null;
                if (c9b03 != null) {
                    if (z2) {
                        c9b03 = new C9B0(0, c9b03.A04, c9b03.A03, currentTimeMillis, uptimeMillis);
                    }
                    C9B0 A002 = A00(c9b03);
                    if (A002 != null) {
                        this.A01.add(A002);
                    }
                }
            }
        } finally {
        }
    }
}
