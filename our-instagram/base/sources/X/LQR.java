package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class LQR implements View.OnTouchListener {
    public final GestureDetector A00;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        return this.A00.onTouchEvent(motionEvent);
    }

    public LQR(IgImageView igImageView, C158797Aq c158797Aq, C158677Ad c158677Ad, C129535tI c129535tI, C158697Af c158697Af) {
        this.A00 = new GestureDetector(c158677Ad.A00, new C44405Jji(1, c158797Aq, igImageView, c158697Af, c129535tI, c158677Ad));
    }
}
