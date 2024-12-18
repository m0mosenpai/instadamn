package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Aq1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24296Aq1 implements Runnable {
    public final /* synthetic */ View A00;

    public RunnableC24296Aq1(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final View view = this.A00;
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: X.9TU
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view2, Outline outline) {
                if (view2 != null && outline != null) {
                    outline.setPath(AMo.A02(view.getWidth()));
                }
            }
        });
        view.setClipToOutline(true);
    }
}
