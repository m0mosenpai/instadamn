package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class ATT implements View.OnTouchListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C141596ac A02;
    public final /* synthetic */ C140436Wx A03;
    public final /* synthetic */ InterfaceC145576hG A04;
    public final /* synthetic */ C6TY A05;

    public ATT(TextView textView, C41181vS c41181vS, C141596ac c141596ac, C140436Wx c140436Wx, InterfaceC145576hG interfaceC145576hG, C6TY c6ty) {
        this.A00 = textView;
        this.A03 = c140436Wx;
        this.A04 = interfaceC145576hG;
        this.A01 = c41181vS;
        this.A02 = c141596ac;
        this.A05 = c6ty;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float[] fArr = new float[2];
        TextView textView = this.A00;
        C14360o3.A0A(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0 && action == 1) {
            textView.getLocationOnScreen(new int[2]);
            float rawX = motionEvent.getRawX() - r1[0];
            float rawY = motionEvent.getRawY() - r1[1];
            if (0.0f <= rawX && rawX <= AbstractC166987dD.A07(textView) && 0.0f <= rawY && rawY <= AbstractC166987dD.A08(textView)) {
                fArr[0] = motionEvent.getRawX();
                fArr[1] = motionEvent.getRawY();
                this.A03.A02();
                this.A04.DF4(this.A01, this.A02, fArr);
                this.A05.A04.setVisibility(8);
                return true;
            }
            return false;
        }
        return false;
    }
}
