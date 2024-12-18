package X;

import android.view.Choreographer;
import android.view.View;
import com.instagram.react.views.inbox.ReactInboxManager;

/* renamed from: X.CjW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ChoreographerFrameCallbackC28591CjW implements Choreographer.FrameCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ChoreographerFrameCallbackC28591CjW(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object c09540e5;
        if (this.A00 != 0) {
            ReactInboxManager reactInboxManager = (ReactInboxManager) this.A02;
            View view = (View) this.A01;
            ReactInboxManager.access$manuallyLayoutChildren(reactInboxManager, view);
            view.getViewTreeObserver().dispatchOnGlobalLayout();
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
        C28790CnM c28790CnM = C28790CnM.A01;
        try {
            c09540e5 = ((InterfaceC16660sJ) this.A02).invoke(Long.valueOf(j));
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        interfaceC23621Ds.resumeWith(c09540e5);
    }
}
