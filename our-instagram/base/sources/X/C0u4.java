package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.0u4, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0u4 extends AbstractC011704f {
    public final Window A00;
    public final C03U A01;

    @Override // X.AbstractC011704f
    public final int A00() {
        return 0;
    }

    @Override // X.AbstractC011704f
    public final void A01(int i) {
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                int i3 = 4;
                if (i2 != 1) {
                    i3 = 2;
                    if (i2 != 2) {
                        if (i2 == 8) {
                            this.A01.A00.A01();
                        }
                    }
                }
                A08(i3);
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }

    @Override // X.AbstractC011704f
    public final void A03(int i) {
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 8) {
                            this.A01.A00.A02();
                        }
                    } else {
                        A09(2);
                    }
                } else {
                    A09(4);
                    this.A00.clearFlags(1024);
                }
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }

    @Override // X.AbstractC011704f
    public final void A02(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    A09(C3OO.FLAG_MOVED);
                    A08(4096);
                    return;
                }
                return;
            }
            A09(4096);
            A08(C3OO.FLAG_MOVED);
            return;
        }
        A09(6144);
    }

    public final void A08(int i) {
        View decorView = this.A00.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void A09(int i) {
        View decorView = this.A00.getDecorView();
        decorView.setSystemUiVisibility((i ^ (-1)) & decorView.getSystemUiVisibility());
    }

    public C0u4(Window window, C03U c03u) {
        this.A00 = window;
        this.A01 = c03u;
    }
}
