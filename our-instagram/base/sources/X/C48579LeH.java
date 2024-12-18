package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.LeH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48579LeH implements XEM {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;

    @Override // X.XEM
    public final void Dmp(float f, float f2, float f3, float f4) {
    }

    @Override // X.XEM
    public final void Du1(boolean z) {
    }

    public C48579LeH(View.OnClickListener onClickListener, View view, View view2) {
        this.A01 = view;
        this.A00 = onClickListener;
        this.A02 = view2;
    }

    @Override // X.XEM
    public final void DJE(float f, float f2) {
        AbstractC43593JPy.A1A(this.A01);
    }

    @Override // X.XEM
    public final void DJI() {
        ViewParent parent = this.A01.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XEM
    public final void DU9(float f, float f2, float f3, float f4, float f5, float f6) {
        if (f5 > 1.0f) {
            View view = this.A01;
            view.setPivotX(f);
            view.setPivotY(f2);
            view.setScaleX(view.getScaleX() * f5);
            view.setScaleY(view.getScaleY() * f5);
        }
    }

    @Override // X.XEM
    public final void Dma(float f, float f2) {
        View view;
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null && (view = this.A02) != null) {
            onClickListener.onClick(view);
        }
    }
}
