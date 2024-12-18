package X;

import android.content.Context;
import com.instagram.actionbar.ActionBarTitleViewSwitcher;

/* renamed from: X.3I6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3I6 extends C1I2 implements InterfaceC65626Tpm {
    public ActionBarTitleViewSwitcher A00;
    public final float A01;
    public final Context A02;
    public final C3FQ A03;

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
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher;
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher2 = this.A00;
        if (actionBarTitleViewSwitcher2 != null && actionBarTitleViewSwitcher2.getDisplayedChild() == 0 && AbstractC60622pl.A02(this.A03, this.A01) && (actionBarTitleViewSwitcher = this.A00) != null) {
            actionBarTitleViewSwitcher.A04(false, true, this.A02.getString(2131962482));
        }
    }

    private final boolean A01() {
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher = this.A00;
        if (actionBarTitleViewSwitcher == null || actionBarTitleViewSwitcher.getDisplayedChild() == 0 || AbstractC60622pl.A02(this.A03, this.A01)) {
            return false;
        }
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher2 = this.A00;
        if (actionBarTitleViewSwitcher2 != null) {
            actionBarTitleViewSwitcher2.A03(null, null, false, false);
        }
        return true;
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        if (this.A00 != null) {
            A00();
        }
    }

    public C3I6(Context context, C3FQ c3fq, float f) {
        this.A02 = context;
        this.A01 = f;
        this.A03 = c3fq;
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int A03 = C0f9.A03(1740453935);
        if (this.A00 == null) {
            i6 = 2135639924;
        } else {
            if (i5 < 0) {
                A01();
            } else if (i5 != 0 || !A01()) {
                A00();
            }
            i6 = 944900827;
        }
        C0f9.A0A(i6, A03);
    }
}
