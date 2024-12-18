package X;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.KaU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46073KaU extends AbstractC87373uv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C46073KaU(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        IgFrameLayout igFrameLayout;
        String str;
        switch (this.A00) {
            case 0:
                igFrameLayout = ((C48624Lf0) this.A02).A01;
                if (igFrameLayout == null) {
                    str = "animationContainer";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                igFrameLayout.removeView((View) this.A01);
                return;
            case 1:
            default:
                super.onAnimationCancel(animator);
                return;
            case 2:
                igFrameLayout = ((C144226f4) this.A02).A05;
                if (igFrameLayout == null) {
                    str = "containerView";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                igFrameLayout.removeView((View) this.A01);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        IgFrameLayout igFrameLayout;
        String str;
        switch (this.A00) {
            case 0:
                igFrameLayout = ((C48624Lf0) this.A02).A01;
                if (igFrameLayout == null) {
                    str = "animationContainer";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                igFrameLayout.removeView((View) this.A01);
                return;
            case 1:
                C37841Gkv.A00((C37841Gkv) this.A02, (Integer) this.A01);
                return;
            case 2:
                igFrameLayout = ((C144226f4) this.A02).A05;
                if (igFrameLayout == null) {
                    str = "containerView";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                igFrameLayout.removeView((View) this.A01);
                return;
            default:
                ((View) this.A02).setBackground((Drawable) this.A01);
                return;
        }
    }
}
