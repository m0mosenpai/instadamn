package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.5Qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116785Qh implements InterfaceC116795Qi {
    public ViewGroup A00;
    public final View A01;
    public final int[] A02;
    public final Matrix A03;
    public final RectF A04;
    public final int[] A05;

    public C116785Qh(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A04 = new RectF();
        this.A03 = new Matrix();
        this.A02 = new int[2];
        this.A05 = new int[2];
    }

    @Override // X.InterfaceC116795Qi
    public final void Ahp(Rect rect) {
        float rotation;
        C14360o3.A0B(rect, 0);
        View view = this.A01;
        if (view.getRotation() == 0.0f) {
            rotation = 0.0f;
        } else {
            rotation = view.getRotation();
            view.setRotation(0.0f);
        }
        int[] iArr = this.A05;
        view.getLocationInWindow(iArr);
        int A01 = C1H4.A01(view.getWidth() * view.getScaleX());
        int A012 = C1H4.A01(view.getHeight() * view.getScaleY());
        int i = iArr[0];
        int i2 = iArr[1];
        rect.set(i, i2, A01 + i, A012 + i2);
        if (rotation != 0.0f) {
            RectF rectF = this.A04;
            rectF.set(rect);
            Matrix matrix = this.A03;
            matrix.reset();
            matrix.setRotate(rotation, rectF.centerX(), rectF.centerY());
            matrix.mapRect(rectF);
            rectF.round(rect);
            view.setRotation(rotation);
        }
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            viewGroup.getLocationInWindow(this.A02);
        }
        int[] iArr2 = this.A02;
        rect.offset(-iArr2[0], -iArr2[1]);
    }

    @Override // X.InterfaceC116795Qi
    public final boolean CGi(Rect rect, boolean z, boolean z2) {
        C14360o3.A0B(rect, 0);
        View view = this.A01;
        boolean z3 = true;
        if (!view.isShown() || ((z2 && !view.getGlobalVisibleRect(rect)) || (z && view.getVisibility() != 0))) {
            z3 = false;
        }
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            viewGroup.getLocationInWindow(this.A02);
        }
        int[] iArr = this.A02;
        rect.offset(-iArr[0], -iArr[1]);
        return z3;
    }

    @Override // X.InterfaceC116795Qi
    public final View Ad7() {
        return this.A01;
    }

    @Override // X.InterfaceC116795Qi
    public final void EaY(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }
}
