package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.facebook.R;
import com.instagram.creation.base.ui.degreelabel.PillDegreeLabelManager;
import com.instagram.ui.text.ConstrainedEditText;

/* loaded from: classes8.dex */
public final class LQ9 implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;

    public LQ9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        switch (this.A00) {
            case 0:
                SearchView searchView = (SearchView) this.A01;
                View view2 = searchView.A0X;
                if (view2.getWidth() <= 1) {
                    return;
                }
                Resources A0M = AbstractC25228BEl.A0M(searchView);
                int paddingLeft = searchView.A0Y.getPaddingLeft();
                Rect A0U = AbstractC166987dD.A0U();
                boolean z = true;
                if (searchView.getLayoutDirection() != 1) {
                    z = false;
                }
                if (searchView.A09) {
                    i9 = A0M.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + AbstractC166997dE.A08(A0M);
                } else {
                    i9 = 0;
                }
                SearchView.SearchAutoComplete searchAutoComplete = searchView.A0d;
                searchAutoComplete.getDropDownBackground().getPadding(A0U);
                int i10 = A0U.left;
                int i11 = -i10;
                if (!z) {
                    i11 = paddingLeft - (i10 + i9);
                }
                searchAutoComplete.setDropDownHorizontalOffset(i11);
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + A0U.left) + A0U.right) + i9) - paddingLeft);
                return;
            case 1:
                LYZ.A01((LYZ) this.A01);
                return;
            case 2:
                PillDegreeLabelManager pillDegreeLabelManager = (PillDegreeLabelManager) this.A01;
                pillDegreeLabelManager.A02 = true;
                PillDegreeLabelManager.A04(pillDegreeLabelManager);
                float f = pillDegreeLabelManager.A00;
                if (Float.isNaN(f)) {
                    return;
                }
                pillDegreeLabelManager.setDegree(f);
                pillDegreeLabelManager.A00 = Float.NaN;
                return;
            case 3:
                view.removeOnLayoutChangeListener(this);
                KCE.A00((KCE) this.A01).A10(new Jo8((int) (KCE.A00(r3).getMeasuredHeight() * 0.5625f)));
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                KCE.A03((KCE) this.A01);
                return;
            case 5:
                C8LD c8ld = ((ViewOnFocusChangeListenerC23252ASn) this.A01).A00;
                ConstrainedEditText constrainedEditText = c8ld.A0D;
                constrainedEditText.getClass();
                constrainedEditText.removeOnLayoutChangeListener(this);
                C8LD.A04(c8ld);
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                C48733Lh1 c48733Lh1 = (C48733Lh1) this.A01;
                c48733Lh1.A0E.A10((AbstractC110824yu) c48733Lh1.A0V.getValue());
                return;
        }
    }
}
