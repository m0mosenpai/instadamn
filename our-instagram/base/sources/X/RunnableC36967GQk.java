package X;

import android.view.View;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.GQk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36967GQk implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ IgSimpleImageView A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ InterfaceC16820sZ A04;

    public RunnableC36967GQk(View view, IgSimpleImageView igSimpleImageView, Runnable runnable, InterfaceC16820sZ interfaceC16820sZ, float f) {
        this.A01 = view;
        this.A02 = igSimpleImageView;
        this.A00 = f;
        this.A03 = runnable;
        this.A04 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        this.A01.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        IgSimpleImageView igSimpleImageView = this.A02;
        igSimpleImageView.getLocationInWindow(iArr2);
        float f = iArr[0] - iArr2[0];
        float f2 = this.A00;
        igSimpleImageView.animate().scaleX(0.0f).scaleY(0.0f).translationXBy(f - f2).translationYBy((iArr[1] - iArr2[1]) - f2).setDuration(250L).withEndAction(new GPQ(igSimpleImageView, this.A03, this.A04)).start();
    }
}
