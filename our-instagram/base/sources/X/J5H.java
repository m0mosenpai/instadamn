package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgFrameLayout;

/* loaded from: classes7.dex */
public final class J5H implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C38214GrJ A02;

    public J5H(C38214GrJ c38214GrJ, int i, int i2) {
        this.A02 = c38214GrJ;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C38214GrJ c38214GrJ = this.A02;
        ViewGroup viewGroup = c38214GrJ.A07;
        if (viewGroup != null) {
            int i = this.A00;
            int i2 = this.A01;
            View view = c38214GrJ.A06;
            c38214GrJ.A00 = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i;
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = i2;
                }
                view.requestLayout();
            }
            IgFrameLayout igFrameLayout = c38214GrJ.A01;
            if (igFrameLayout != null) {
                igFrameLayout.addView(view, 0);
            }
            IgFrameLayout igFrameLayout2 = c38214GrJ.A01;
            if (igFrameLayout2 != null) {
                igFrameLayout2.requestLayout();
            }
            IgFrameLayout igFrameLayout3 = c38214GrJ.A01;
            if (igFrameLayout3 != null) {
                igFrameLayout3.setVisibility(0);
            }
            InterfaceC16620sF interfaceC16620sF = c38214GrJ.A00().A00.A0E;
            IgFrameLayout igFrameLayout4 = c38214GrJ.A01;
            C14360o3.A0C(igFrameLayout4, "null cannot be cast to non-null type android.view.ViewGroup");
            interfaceC16620sF.invoke(48, igFrameLayout4);
        }
    }
}
