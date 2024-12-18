package X;

import android.view.View;
import android.view.WindowManager;

/* renamed from: X.AVe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23319AVe implements BBN {
    public final /* synthetic */ C210719Tt A00;

    public C23319AVe(C210719Tt c210719Tt) {
        this.A00 = c210719Tt;
    }

    @Override // X.BBN
    public final void onPreviewFrame(C72816Xnf c72816Xnf) {
        C63962Swn c63962Swn;
        C210719Tt c210719Tt = this.A00;
        int i = c72816Xnf.A02;
        c210719Tt.A00 = i;
        if (!c210719Tt.A08 && (c63962Swn = (C63962Swn) c210719Tt.A05.get()) != null) {
            View view = c210719Tt.A03;
            if (view == null) {
                C14360o3.A0F("cameraView");
                throw C00O.createAndThrow();
            }
            Object systemService = view.getContext().getSystemService("window");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getRotation();
            C23432Aa5.A00(c210719Tt.A00());
            C23432Aa5.A00(c210719Tt.A00());
            c63962Swn.A02 = i;
            c210719Tt.A08 = true;
        }
        int i2 = c210719Tt.A02;
        int i3 = c72816Xnf.A03;
        if (i2 != i3 || c210719Tt.A01 != c72816Xnf.A00) {
            c210719Tt.A02 = i3;
            c210719Tt.A01 = c72816Xnf.A00;
            c210719Tt.A09 = false;
        }
        if (!c210719Tt.A09) {
            c210719Tt.requireActivity().runOnUiThread(new RunnableC24572AuT(c72816Xnf, c210719Tt));
        }
        BBN bbn = (BBN) c210719Tt.A07.get();
        if (bbn != null) {
            bbn.onPreviewFrame(c72816Xnf);
        }
    }
}
