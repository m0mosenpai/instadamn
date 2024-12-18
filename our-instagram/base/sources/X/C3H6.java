package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3H6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3H6 extends AbstractC70763Fo {
    @Override // X.AbstractC70763Fo
    public final int A02() {
        return this.A02.A00;
    }

    @Override // X.AbstractC70763Fo
    public final int A03() {
        AbstractC70663Fe abstractC70663Fe = this.A02;
        return abstractC70663Fe.A00 - abstractC70663Fe.Bat();
    }

    @Override // X.AbstractC70763Fo
    public final int A04() {
        return this.A02.Bat();
    }

    @Override // X.AbstractC70763Fo
    public final int A05() {
        return this.A02.A01;
    }

    @Override // X.AbstractC70763Fo
    public final int A06() {
        return this.A02.Bax();
    }

    @Override // X.AbstractC70763Fo
    public final int A07() {
        AbstractC70663Fe abstractC70663Fe = this.A02;
        return (abstractC70663Fe.A00 - abstractC70663Fe.Bax()) - abstractC70663Fe.Bat();
    }

    @Override // X.AbstractC70763Fo
    public final void A0E(int i) {
        this.A02.A1B(i);
    }

    @Override // X.AbstractC70763Fo
    public final int A0B(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = ((C3OP) view.getLayoutParams()).A02;
        return view.getMeasuredHeight() + rect.top + rect.bottom + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // X.AbstractC70763Fo
    public final int A0C(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        Rect rect = ((C3OP) view.getLayoutParams()).A02;
        return view.getMeasuredWidth() + rect.left + rect.right + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    @Override // X.AbstractC70763Fo
    public final int A0D(View view) {
        return this.A02.A0W(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    public C3H6(AbstractC70663Fe abstractC70663Fe) {
        super(abstractC70663Fe);
    }
}
