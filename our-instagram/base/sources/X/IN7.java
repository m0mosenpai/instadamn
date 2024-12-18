package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IN7 {
    public InterfaceC16820sZ A00;
    public InterfaceC16620sF A01;
    public final GestureDetector A02;
    public final ArrayList A03 = AbstractC166987dD.A1E();
    public final View.OnTouchListener A04;
    public final View.OnTouchListener A05;

    public final void A00(View view) {
        View.OnTouchListener onTouchListener;
        C14360o3.A0B(view, 0);
        if (view instanceof TextView) {
            onTouchListener = this.A04;
        } else {
            onTouchListener = this.A05;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public final void A01(View view) {
        C14360o3.A0B(view, 0);
        this.A03.add(view);
    }

    public IN7(Context context) {
        this.A02 = new GestureDetector(context, new C44406Jjj(this, 9));
        ViewOnTouchListenerC42050IkJ viewOnTouchListenerC42050IkJ = new ViewOnTouchListenerC42050IkJ(this, 5);
        this.A05 = viewOnTouchListenerC42050IkJ;
        this.A04 = new ViewOnTouchListenerC28682ClU(viewOnTouchListenerC42050IkJ);
    }
}
