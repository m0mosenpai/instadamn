package X;

import android.content.DialogInterface;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.PNa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56907PNa implements Runnable {
    public final /* synthetic */ NA3 A00;

    public RunnableC56907PNa(NA3 na3) {
        this.A00 = na3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NA3 na3 = this.A00;
        C145176gc c145176gc = na3.A02.A00;
        InterfaceC147266kB interfaceC147266kB = ((ReelViewerFragment) c145176gc.A18).mViewPager;
        if (interfaceC147266kB != null) {
            interfaceC147266kB.ELH(new C30180DRl(c145176gc, 48));
        }
        DialogInterface.OnDismissListener onDismissListener = na3.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
        na3.A01.A07();
    }
}
