package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.IhN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41885IhN implements View.OnClickListener {
    public final /* synthetic */ C42663IuK A00;

    public ViewOnClickListenerC41885IhN(C42663IuK c42663IuK) {
        this.A00 = c42663IuK;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1253475160);
        C42663IuK c42663IuK = this.A00;
        boolean z = c42663IuK.A01;
        boolean z2 = !z;
        if (z != z2) {
            c42663IuK.A01 = z2;
            WeakReference weakReference = c42663IuK.A00;
            if (weakReference != null && weakReference.get() != null) {
                VVP.A00((C69304VlC) weakReference.get(), z2);
            }
        }
        IGC igc = IGC.A02;
        if (igc == null) {
            igc = new IGC();
            IGC.A02 = igc;
        }
        int hashCode = c42663IuK.hashCode();
        HashMap hashMap = igc.A01;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) hashMap.get(valueOf);
        if (runnable != null) {
            igc.A00.removeCallbacks(runnable);
            hashMap.remove(valueOf);
        }
        C0f9.A0C(1080229391, A05);
    }
}
