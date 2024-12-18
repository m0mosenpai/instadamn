package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes11.dex */
public final class WQT implements AnonymousClass054 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BottomSheetBehavior A01;

    public WQT(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.A01 = bottomSheetBehavior;
        this.A00 = i;
    }

    @Override // X.AnonymousClass054
    public final boolean E44(View view, AnonymousClass053 anonymousClass053) {
        this.A01.A0W(this.A00);
        return true;
    }
}
