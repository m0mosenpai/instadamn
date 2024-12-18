package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class ATR implements View.OnTouchListener {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ InterfaceC145516hA A01;
    public final /* synthetic */ C6TT A02;

    public ATR(C41181vS c41181vS, InterfaceC145516hA interfaceC145516hA, C6TT c6tt) {
        this.A02 = c6tt;
        this.A01 = interfaceC145516hA;
        this.A00 = c41181vS;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float[] fArr = new float[2];
        C6TT c6tt = this.A02;
        TextView A01 = c6tt.A01();
        C14360o3.A0A(motionEvent);
        if (C6UZ.A02(motionEvent, A01, fArr, (int[]) c6tt.A09.getValue())) {
            this.A01.EIJ(this.A00, fArr);
            return false;
        }
        return false;
    }
}
