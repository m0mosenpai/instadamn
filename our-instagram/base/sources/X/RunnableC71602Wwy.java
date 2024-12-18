package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Wwy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71602Wwy implements Runnable {
    public int A00;
    public boolean A01;
    public final View A02;
    public final /* synthetic */ BottomSheetBehavior A03;

    public RunnableC71602Wwy(View view, BottomSheetBehavior bottomSheetBehavior, int i) {
        this.A03 = bottomSheetBehavior;
        this.A02 = view;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BottomSheetBehavior bottomSheetBehavior = this.A03;
        C70198WGk c70198WGk = bottomSheetBehavior.A0J;
        if (c70198WGk != null && c70198WGk.A0H()) {
            this.A02.postOnAnimation(this);
        } else {
            bottomSheetBehavior.A0X(this.A00);
        }
        this.A01 = false;
    }
}
