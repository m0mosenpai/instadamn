package X;

import com.facebook.smartcapture.components.ContourView;

/* loaded from: classes10.dex */
public final class TOA implements Runnable {
    public final /* synthetic */ K5D A00;
    public final /* synthetic */ CharSequence A01;

    public TOA(K5D k5d, CharSequence charSequence) {
        this.A00 = k5d;
        this.A01 = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContourView contourView = this.A00.A0A;
        if (contourView != null) {
            contourView.setTextTip(this.A01);
        }
    }
}
