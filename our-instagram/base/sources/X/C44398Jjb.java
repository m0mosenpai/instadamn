package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.avatars.pokes.PokeReceiverView;

/* renamed from: X.Jjb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44398Jjb extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ PokeReceiverView A00;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C44398Jjb(PokeReceiverView pokeReceiverView) {
        this.A00 = pokeReceiverView;
    }
}
