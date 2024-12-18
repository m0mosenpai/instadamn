package X;

import android.view.View;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.AvD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24617AvD implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ TargetViewSizeProvider A01;

    public RunnableC24617AvD(View view, TargetViewSizeProvider targetViewSizeProvider) {
        this.A00 = view;
        this.A01 = targetViewSizeProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        int height = view.getHeight();
        int i = ((NineSixteenLayoutConfigImpl) this.A01).A0A;
        if (i >= height) {
            AbstractC13880nE.A0U(view, (i - height) / 2);
        }
    }
}
