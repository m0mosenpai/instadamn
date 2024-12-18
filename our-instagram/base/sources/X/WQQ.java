package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class WQQ implements C03L {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WQQ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.C03L
    public final C011504d Cx7(View view, C011504d c011504d) {
        WeakReference weakReference;
        View view2;
        if (this.A00 != 0) {
            C14360o3.A0B(c011504d, 1);
            if (((C14510oO) this.A02).A00) {
                ((C69554VrJ) this.A01).A00(new C66640URe(c011504d));
                return C011504d.A01;
            }
            return c011504d;
        }
        X84 x84 = (X84) this.A02;
        VJP vjp = (VJP) this.A01;
        int i = vjp.A02;
        int i2 = vjp.A01;
        int i3 = vjp.A00;
        WcS wcS = (WcS) x84;
        BottomSheetBehavior bottomSheetBehavior = wcS.A00;
        bottomSheetBehavior.A0A = c011504d.A03();
        boolean A1a = AbstractC65703TsZ.A1a(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z = bottomSheetBehavior.A0R;
        if (z) {
            int A02 = c011504d.A02();
            bottomSheetBehavior.A09 = A02;
            paddingBottom = i3 + A02;
        }
        if (bottomSheetBehavior.A0S) {
            int i4 = i;
            if (A1a) {
                i4 = i2;
            }
            paddingLeft = i4 + c011504d.A00.A03().A01;
        }
        if (bottomSheetBehavior.A0T) {
            if (A1a) {
                i2 = i;
            }
            paddingRight = i2 + c011504d.A00.A03().A02;
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z2 = wcS.A01;
        if (z2) {
            bottomSheetBehavior.A07 = c011504d.A00.A00().A00;
        }
        if ((!z && !z2) || (weakReference = bottomSheetBehavior.A0M) == null) {
            return c011504d;
        }
        BottomSheetBehavior.A04(bottomSheetBehavior);
        if (bottomSheetBehavior.A0G != 4 || (view2 = (View) weakReference.get()) == null) {
            return c011504d;
        }
        view2.requestLayout();
        return c011504d;
    }
}
