package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.R;

@Deprecated
/* renamed from: X.QBd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58820QBd extends AbstractC63879SvD {
    public final View A00;
    public final SWT A01;

    @Override // X.InterfaceC65634Tpv
    public final InterfaceC65582TnL Bnz() {
        Object tag = this.A00.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof InterfaceC65582TnL) {
                return (InterfaceC65582TnL) tag;
            }
            throw AbstractC166987dD.A12("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // X.InterfaceC65634Tpv
    public final void Bxb(C63876SvA c63876SvA) {
        int i;
        int i2;
        SWT swt = this.A01;
        View view = swt.A01;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        int A00 = SWT.A00(swt, view.getWidth(), i, paddingLeft);
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            i2 = layoutParams2.height;
        } else {
            i2 = 0;
        }
        int A002 = SWT.A00(swt, view.getHeight(), i2, paddingTop);
        if ((A00 > 0 || A00 == Integer.MIN_VALUE) && (A002 > 0 || A002 == Integer.MIN_VALUE)) {
            c63876SvA.A03(A00, A002);
            return;
        }
        AbstractC43594JPz.A1Q(c63876SvA, swt.A02);
        if (swt.A00 != null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC63517Sok viewTreeObserverOnPreDrawListenerC63517Sok = new ViewTreeObserverOnPreDrawListenerC63517Sok(swt);
        swt.A00 = viewTreeObserverOnPreDrawListenerC63517Sok;
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC63517Sok);
    }

    @Override // X.InterfaceC65634Tpv
    public void DPb(Drawable drawable) {
        SWT swt = this.A01;
        ViewTreeObserver viewTreeObserver = swt.A01.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(swt.A00);
        }
        swt.A00 = null;
        swt.A02.clear();
    }

    @Override // X.InterfaceC65634Tpv
    public final void EF5(C63876SvA c63876SvA) {
        this.A01.A02.remove(c63876SvA);
    }

    @Override // X.InterfaceC65634Tpv
    public final void Ecl(InterfaceC65582TnL interfaceC65582TnL) {
        this.A00.setTag(R.id.glide_custom_view_target_tag, interfaceC65582TnL);
    }

    public AbstractC58820QBd(View view) {
        Rs8.A00(view);
        this.A00 = view;
        this.A01 = new SWT(view);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Target for: ");
        return AbstractC166997dE.A0v(this.A00, A1C);
    }
}
