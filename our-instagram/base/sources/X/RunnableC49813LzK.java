package X;

import com.facebook.smartcapture.components.ContourView;
import com.facebook.smartcapture.components.DottedAlignmentView;

/* renamed from: X.LzK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49813LzK implements Runnable {
    public final /* synthetic */ ContourView A00;

    public RunnableC49813LzK(ContourView contourView) {
        this.A00 = contourView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DottedAlignmentView dottedAlignmentView = this.A00.A0C;
        dottedAlignmentView.post(new RunnableC49815LzM(dottedAlignmentView));
        dottedAlignmentView.setVisibility(8);
    }
}
