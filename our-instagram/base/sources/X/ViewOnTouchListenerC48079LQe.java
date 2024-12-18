package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.LQe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnTouchListenerC48079LQe implements View.OnTouchListener {
    public LinearLayout A00;
    public View A01;
    public final int A02;
    public final C7OC A03;
    public final C51622Yk A04;
    public final int[] A05 = new int[2];

    public ViewOnTouchListenerC48079LQe(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ConstrainedImageView constrainedImageView, C148336m3 c148336m3, C7OC c7oc, int i, boolean z) {
        this.A02 = i;
        this.A03 = c7oc;
        Context context = constrainedImageView.getContext();
        ViewParent parent = constrainedImageView.getParent();
        parent.getClass();
        parent.requestDisallowInterceptTouchEvent(true);
        View rootView = constrainedImageView.getRootView();
        Integer num = C05F.A01;
        L5J l5j = new L5J(rootView, userSession, num, num);
        l5j.A03 = Integer.valueOf(AbstractC53242c7.A04(context));
        l5j.A04 = Integer.valueOf(AbstractC53242c7.A04(context));
        l5j.A02 = EnumC46122KbM.A02;
        l5j.A00 = this;
        LinearLayout linearLayout = new LinearLayout(context);
        this.A00 = linearLayout;
        AbstractC43592JPx.A1H(linearLayout, -1, -2);
        int i2 = 0;
        this.A00.setOrientation(0);
        C148336m3[] A02 = AbstractC170297ii.A02(c148336m3.A02, z);
        while (true) {
            int length = A02.length;
            if (i2 < length) {
                ConstrainedImageView constrainedImageView2 = new ConstrainedImageView(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A02, -2);
                if (i2 < length - 1) {
                    layoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material));
                }
                constrainedImageView2.setLayoutParams(layoutParams);
                C148336m3 c148336m32 = A02[i2];
                constrainedImageView2.setUrl(C168157fA.A00(c148336m32.A01, c148336m32.A02), interfaceC11380iw);
                constrainedImageView2.setTag(A02[i2]);
                constrainedImageView2.setFocusableInTouchMode(true);
                constrainedImageView2.setFocusable(true);
                constrainedImageView2.setContentDescription(A02[i2].A02);
                AbstractC56952jT.A04(constrainedImageView2, num);
                this.A00.addView(constrainedImageView2);
                i2++;
            } else {
                this.A00.requestFocusFromTouch();
                this.A00.requestFocus();
                l5j.A01 = this.A00;
                l5j.A05 = !AbstractC56862jK.A01(context, true);
                C51622Yk c51622Yk = new C51622Yk(l5j);
                this.A04 = c51622Yk;
                c51622Yk.A02(constrainedImageView, 0, (-constrainedImageView.getHeight()) / 2, false);
                return;
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int i;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int[] iArr = this.A05;
        view.getLocationInWindow(iArr);
        int i2 = x + iArr[0];
        int i3 = y + iArr[1];
        LinearLayout linearLayout = this.A00;
        int childCount = linearLayout.getChildCount();
        View view2 = this.A01;
        this.A01 = null;
        View childAt = linearLayout.getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        childAt.getLocationInWindow(iArr);
        int width = childAt.getWidth() + marginLayoutParams.rightMargin;
        int i4 = iArr[0];
        if (i2 >= i4 && i2 <= i4 + (childCount * width) && i3 > (i = iArr[1]) && i3 < i + childAt.getHeight()) {
            this.A01 = linearLayout.getChildAt((i2 - iArr[0]) / width);
            z = true;
        } else {
            z = false;
        }
        if (view2 != null && view2 != this.A01) {
            view2.setPressed(false);
        }
        View view3 = this.A01;
        if (motionEvent.getAction() == 1 && view3 != null) {
            ImageView imageView = (ImageView) view3;
            C148336m3 c148336m3 = (C148336m3) imageView.getTag();
            Drawable drawable = imageView.getDrawable();
            drawable.getClass();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(imageView.getResources(), ((BitmapDrawable) drawable).getBitmap());
            if (c148336m3 != null) {
                this.A03.DDL(bitmapDrawable, imageView, c148336m3);
            }
            this.A04.A03(true);
            return true;
        }
        if (z || motionEvent.getAction() != 0) {
            return z;
        }
        this.A04.A03(true);
        return true;
    }
}
