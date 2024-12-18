package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class LQT implements View.OnTouchListener {
    public final GestureDetector A00;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        return this.A00.onTouchEvent(motionEvent);
    }

    public LQT(Context context, C6C9 c6c9, IgImageView igImageView, C70H c70h) {
        this.A00 = new GestureDetector(context, new C44403Jjg(2, igImageView, c6c9, c70h));
    }
}
