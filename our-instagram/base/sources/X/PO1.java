package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes9.dex */
public final class PO1 implements Runnable {
    public final /* synthetic */ PCI A00;

    public PO1(PCI pci) {
        this.A00 = pci;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PCI pci = this.A00;
        CircularImageView circularImageView = pci.A0C;
        C14360o3.A07(circularImageView);
        OHM ohm = pci.A01;
        View view = pci.A05;
        Context context = view.getContext();
        C149686oL c149686oL = new C149686oL(AbstractC166997dE.A0p(context, 2131956904));
        AbstractC43592JPx.A1T(view);
        C5SU c5su = new C5SU(context, (ViewGroup) view, c149686oL);
        c5su.A03(circularImageView);
        c5su.A0F = false;
        c5su.A04 = new NMC(ohm, 7);
        c5su.A01();
        C5SW A00 = c5su.A00();
        pci.A00 = A00;
        A00.A07(pci.A0B);
    }
}
