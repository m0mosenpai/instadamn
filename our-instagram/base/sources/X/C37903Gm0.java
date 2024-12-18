package X;

import android.view.View;
import com.instagram.actionbar.ActionBarTitleViewSwitcher;

/* renamed from: X.Gm0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37903Gm0 extends C1I2 implements InterfaceC65626Tpm {
    public int A00 = -1;
    public int A01 = -1;
    public final ActionBarTitleViewSwitcher A02;

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    private final void A00() {
        int i = this.A00;
        if (i != -1 && this.A01 >= i) {
            A01(this);
            return;
        }
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher = this.A02;
        if (actionBarTitleViewSwitcher.getDisplayedChild() == 0) {
            return;
        }
        actionBarTitleViewSwitcher.A03(null, null, false, false);
    }

    public static final void A01(C37903Gm0 c37903Gm0) {
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher = c37903Gm0.A02;
        if (actionBarTitleViewSwitcher.getDisplayedChild() != actionBarTitleViewSwitcher.A0H) {
            actionBarTitleViewSwitcher.A04(false, false, null);
        }
    }

    public C37903Gm0(ActionBarTitleViewSwitcher actionBarTitleViewSwitcher) {
        this.A02 = actionBarTitleViewSwitcher;
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int A0N = AbstractC167017dG.A0N(c3fq, -870744704);
        View AnW = c3fq.AnW(i);
        if (AnW != null && AnW.getTop() < 0 && Math.abs(AnW.getTop()) > AnW.getBottom()) {
            i++;
        }
        int i7 = this.A01;
        if (i == i7) {
            i6 = -242732352;
        } else {
            this.A01 = i;
            if (i7 != -1 && i7 <= i) {
                if (i == this.A00) {
                    A01(this);
                } else {
                    ActionBarTitleViewSwitcher actionBarTitleViewSwitcher = this.A02;
                    int displayedChild = actionBarTitleViewSwitcher.getDisplayedChild();
                    int i8 = actionBarTitleViewSwitcher.A0G;
                    if (displayedChild != i8) {
                        actionBarTitleViewSwitcher.setDisplayedChild(i8);
                    }
                }
            } else {
                A00();
            }
            i6 = -1121639809;
        }
        C0f9.A0A(i6, A0N);
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        A00();
    }
}
