package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WQS implements C04G {
    public final /* synthetic */ UD8 A00;

    public WQS(UD8 ud8) {
        this.A00 = ud8;
    }

    @Override // X.C04G
    public final void Cwi(View view) {
        ((View) this.A00.A08.getParent()).invalidate();
    }
}
