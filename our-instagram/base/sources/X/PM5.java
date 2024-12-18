package X;

import com.instagram.creation.capture.quickcapture.sundial.edit.stacked.audio.StackedAdjustHorizontalScrollView;

/* loaded from: classes9.dex */
public final class PM5 implements Runnable {
    public final /* synthetic */ StackedAdjustHorizontalScrollView A00;

    public PM5(StackedAdjustHorizontalScrollView stackedAdjustHorizontalScrollView) {
        this.A00 = stackedAdjustHorizontalScrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StackedAdjustHorizontalScrollView stackedAdjustHorizontalScrollView = this.A00;
        if (stackedAdjustHorizontalScrollView.A00 - stackedAdjustHorizontalScrollView.getScrollX() == 0) {
            stackedAdjustHorizontalScrollView.A05 = false;
        }
        if (!stackedAdjustHorizontalScrollView.A04 && !stackedAdjustHorizontalScrollView.A05) {
            InterfaceC57818Pkk interfaceC57818Pkk = stackedAdjustHorizontalScrollView.A01;
            if (interfaceC57818Pkk == null) {
                C14360o3.A0F("onScrollStoppedListener");
                throw C00O.createAndThrow();
            }
            OJs oJs = ((C56301OzM) interfaceC57818Pkk).A00;
            if (oJs.A04.getVisibility() == 0) {
                O23 o23 = oJs.A06;
                NI7.A03(o23.A00, oJs.A00());
                return;
            }
            return;
        }
        stackedAdjustHorizontalScrollView.A00 = stackedAdjustHorizontalScrollView.getScrollX();
        stackedAdjustHorizontalScrollView.postDelayed(stackedAdjustHorizontalScrollView.A02, stackedAdjustHorizontalScrollView.A06);
    }
}
