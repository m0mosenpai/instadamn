package X;

import android.view.View;
import com.instagram.api.schemas.OriginalAudioSubtype;

/* renamed from: X.Igz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnAttachStateChangeListenerC41861Igz implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C38307Gst A01;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C14360o3.A0B(view, 0);
        this.A01.A00.A04(OriginalAudioSubtype.A06, this.A00, true);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC41861Igz(C38307Gst c38307Gst, int i) {
        this.A01 = c38307Gst;
        this.A00 = i;
    }
}
