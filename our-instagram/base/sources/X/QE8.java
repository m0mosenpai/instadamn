package X;

import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class QE8 extends QE9 {
    public ViewGroup A00;
    public boolean A01;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a0, code lost:
    
        if (X.AbstractC61724Rsf.A00(r1, false) != false) goto L18;
     */
    @Override // X.C0SG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Dialog A0F(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QE8.A0F(android.os.Bundle):android.app.Dialog");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1337546517);
        super.onResume();
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            ViewOnTouchListenerC63511Soe.A00(viewGroup.requireViewById(R.id.autofill_bottomsheet_drag_handle), 4, this);
        }
        C0f9.A09(-1662867360, A02);
    }
}
