package X;

import android.view.View;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.AyV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24809AyV implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ C144356fH A02;

    public RunnableC24809AyV(C84823qW c84823qW, C144356fH c144356fH, float f) {
        this.A02 = c144356fH;
        this.A01 = c84823qW;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144356fH c144356fH = this.A02;
        C84823qW c84823qW = this.A01;
        float f = this.A00;
        IgSimpleImageView igSimpleImageView = c144356fH.A00;
        if (igSimpleImageView != null) {
            Object parent = igSimpleImageView.getParent();
            if (parent != null) {
                View view = (View) parent;
                C138436Oz.A04(igSimpleImageView, c84823qW, f, view.getWidth(), view.getHeight(), true);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
