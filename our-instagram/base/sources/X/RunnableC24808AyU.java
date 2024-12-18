package X;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.AyU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24808AyU implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ C144346fG A02;

    public RunnableC24808AyU(C84823qW c84823qW, C144346fG c144346fG, float f) {
        this.A02 = c144346fG;
        this.A01 = c84823qW;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144346fG c144346fG = this.A02;
        C84823qW c84823qW = this.A01;
        float f = this.A00;
        FrameLayout frameLayout = c144346fG.A00;
        if (frameLayout != null) {
            Object parent = frameLayout.getParent();
            if (parent != null) {
                View view = (View) parent;
                C138436Oz.A04(frameLayout, c84823qW, f, view.getWidth(), view.getHeight(), false);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
