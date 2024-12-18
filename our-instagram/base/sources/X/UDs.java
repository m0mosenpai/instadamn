package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UDs extends WPW implements InterfaceC71999XEn {
    public int A00;
    public ListAdapter A01;
    public CharSequence A02;
    public final Rect A03;
    public final /* synthetic */ UCx A04;

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r9 = this;
            android.widget.PopupWindow r2 = r9.A09
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            r3 = 0
            X.UCx r4 = r9.A04
            android.graphics.Rect r7 = r4.A05
            if (r0 == 0) goto L79
            r0.getPadding(r7)
            int r1 = r4.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L75
            int r3 = r7.right
        L19:
            int r8 = r4.getPaddingLeft()
            int r6 = r4.getPaddingRight()
            int r5 = r4.getWidth()
            int r1 = r4.A00
            r0 = -2
            if (r1 != r0) goto L6a
            android.widget.ListAdapter r1 = r9.A01
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            int r2 = r4.A00(r0, r1)
            android.content.Context r0 = r4.getContext()
            android.util.DisplayMetrics r0 = X.AbstractC167007dF.A0K(r0)
            int r1 = r0.widthPixels
            int r0 = r7.left
            int r1 = r1 - r0
            int r0 = r7.right
            int r1 = r1 - r0
            if (r2 <= r1) goto L49
            r2 = r1
        L49:
            int r0 = r5 - r8
            int r0 = r0 - r6
            int r0 = java.lang.Math.max(r2, r0)
        L50:
            r9.A00(r0)
        L53:
            int r1 = r4.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L65
            int r5 = r5 - r6
            int r0 = r9.A03
            int r5 = r5 - r0
            int r0 = r9.A00
            int r5 = r5 - r0
        L61:
            int r3 = r3 + r5
            r9.A01 = r3
            return
        L65:
            int r0 = r9.A00
            int r5 = r8 + r0
            goto L61
        L6a:
            r0 = -1
            if (r1 != r0) goto L71
            int r0 = r5 - r8
            int r0 = r0 - r6
            goto L50
        L71:
            r9.A00(r1)
            goto L53
        L75:
            int r0 = r7.left
            int r3 = -r0
            goto L19
        L79:
            r7.right = r3
            r7.left = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UDs.A01():void");
    }

    @Override // X.InterfaceC71999XEn
    public final CharSequence BED() {
        return this.A02;
    }

    @Override // X.InterfaceC71999XEn
    public final void Ek9(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.A09;
        boolean isShowing = popupWindow.isShowing();
        A01();
        popupWindow.setInputMethodMode(2);
        show();
        C66360UCh c66360UCh = this.A0A;
        c66360UCh.setChoiceMode(1);
        c66360UCh.setTextDirection(i);
        c66360UCh.setTextAlignment(i2);
        UCx uCx = this.A04;
        int selectedItemPosition = uCx.getSelectedItemPosition();
        C66360UCh c66360UCh2 = this.A0A;
        if (popupWindow.isShowing() && c66360UCh2 != null) {
            c66360UCh2.A07 = false;
            c66360UCh2.setSelection(selectedItemPosition);
            if (c66360UCh2.getChoiceMode() != 0) {
                c66360UCh2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = uCx.getViewTreeObserver()) != null) {
            WOE woe = new WOE(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(woe);
            popupWindow.setOnDismissListener(new C55524OlI(0, woe, this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDs(Context context, AttributeSet attributeSet, UCx uCx) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.A04 = uCx;
        this.A03 = new Rect();
        this.A06 = uCx;
        this.A0D = true;
        this.A09.setFocusable(true);
        this.A07 = new C70258WOd(1, this, uCx);
    }

    @Override // X.WPW, X.InterfaceC71999XEn
    public final void EPH(ListAdapter listAdapter) {
        super.EPH(listAdapter);
        this.A01 = listAdapter;
    }

    @Override // X.InterfaceC71999XEn
    public final void EVq(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC71999XEn
    public final void Ebn(CharSequence charSequence) {
        this.A02 = charSequence;
    }
}
