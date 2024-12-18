package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70773Fp extends AbstractC70763Fo {
    @Override // X.AbstractC70763Fo
    public final int A02() {
        return this.A02.A03;
    }

    @Override // X.AbstractC70763Fo
    public final int A03() {
        AbstractC70663Fe abstractC70663Fe = this.A02;
        return abstractC70663Fe.A03 - abstractC70663Fe.Baw();
    }

    @Override // X.AbstractC70763Fo
    public final int A04() {
        return this.A02.Baw();
    }

    @Override // X.AbstractC70763Fo
    public final int A05() {
        return this.A02.A04;
    }

    @Override // X.AbstractC70763Fo
    public final int A06() {
        return this.A02.Bau();
    }

    @Override // X.AbstractC70763Fo
    public final int A07() {
        AbstractC70663Fe abstractC70663Fe = this.A02;
        return (abstractC70663Fe.A03 - abstractC70663Fe.Bau()) - abstractC70663Fe.Baw();
    }

    @Override // X.AbstractC70763Fo
    public final void A0E(int i) {
        this.A02.A1A(i);
    }

    @Override // X.AbstractC70763Fo
    public final int A08(View view) {
        return view.getRight() + AbstractC70663Fe.A0D(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
    }

    @Override // X.AbstractC70763Fo
    public final int A0B(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = ((C3OP) view.getLayoutParams()).A02;
        return view.getMeasuredWidth() + rect.left + rect.right + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    @Override // X.AbstractC70763Fo
    public final int A0C(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = ((C3OP) view.getLayoutParams()).A02;
        return view.getMeasuredHeight() + rect.top + rect.bottom + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // X.AbstractC70763Fo
    public final int A0D(View view) {
        return (view.getLeft() - AbstractC70663Fe.A0B(view)) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
    }

    public C70773Fp(AbstractC70663Fe abstractC70663Fe) {
        super(abstractC70663Fe);
    }
}
