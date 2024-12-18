package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes7.dex */
public abstract class I0O {
    public static final C37905Gm2 A00(MotionEvent motionEvent, View view) {
        AbstractC167017dG.A1N(view, motionEvent);
        return new C37905Gm2(view.getWidth(), view.getHeight(), motionEvent.getX(), motionEvent.getY());
    }
}
