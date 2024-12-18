package X;

import com.facebook.common.draggableview.DraggableViewContainer;

/* renamed from: X.PKr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56847PKr implements Runnable {
    public final /* synthetic */ DraggableViewContainer A00;

    public RunnableC56847PKr(DraggableViewContainer draggableViewContainer) {
        this.A00 = draggableViewContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DraggableViewContainer draggableViewContainer = this.A00;
        if (draggableViewContainer.A0B) {
            draggableViewContainer.A0B = false;
            DraggableViewContainer.A07(draggableViewContainer, true);
        }
    }
}
