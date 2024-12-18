package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* loaded from: classes10.dex */
public final class Q4I extends OrientationEventListener {
    public final /* synthetic */ C64094SzB A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4I(Context context, C64094SzB c64094SzB) {
        super(context, 2);
        this.A00 = c64094SzB;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        this.A00.A00 = i;
    }
}
