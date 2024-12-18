package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.7KS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7KS extends AbstractC70653Fc {
    public int A00;
    public final InterfaceC163567Tt A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Drawable A05;
    public final Drawable A06;
    public final Drawable A07;
    public final Drawable A08;
    public final InterfaceC163607Tx A09;
    public final boolean A0A;

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        Boolean bool;
        C14360o3.A0B(rect, 0);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(recyclerView, 2);
        int A02 = RecyclerView.A02(view);
        C3OO A0Y = recyclerView.A0Y(view);
        if ((A0Y instanceof C161747Mj) && A0Y.itemView.getHeight() == 0) {
            return;
        }
        if ((A0Y instanceof C9US) && A0Y.itemView.getHeight() == 0) {
            rect.set(0, 1, 0, 0);
            return;
        }
        C2UU c2uu = recyclerView.A0A;
        if (A02 == -1 && (A0Y instanceof KS2)) {
            bool = Boolean.valueOf(((C44697Jqg) ((AbstractC161677Mc) A0Y).A00).A00);
        } else {
            if ((A0Y instanceof C161767Ml) || (A0Y instanceof C161777Mm) || ((A0Y instanceof InterfaceC161797Mo) && c2uu != null && A02 + 1 == c2uu.getItemCount())) {
                i = 0;
                rect.set(0, i, 0, A00(A02));
            }
            bool = null;
        }
        i = A01(bool, A02);
        rect.set(0, i, 0, A00(A02));
    }

    @Override // X.AbstractC70653Fc
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        Drawable drawable;
        Drawable drawable2;
        C14360o3.A0B(canvas, 0);
        C14360o3.A0B(recyclerView, 1);
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        InterfaceC163567Tt interfaceC163567Tt = this.A01;
        if (interfaceC163567Tt.CeP()) {
            drawable = this.A06;
            drawable2 = this.A05;
        } else {
            drawable = this.A08;
            drawable2 = this.A07;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int A02 = RecyclerView.A02(childAt);
            if (interfaceC163567Tt.CWu(A02)) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int translationY = (int) childAt.getTranslationY();
                int bottom = childAt.getBottom() + marginLayoutParams.bottomMargin + translationY;
                int A00 = A00(A02) + bottom;
                if (A02 == 0 && interfaceC163567Tt.CWu(A02)) {
                    A00 -= this.A02;
                }
                drawable.setBounds(paddingLeft, bottom, width, A00);
                drawable.draw(canvas);
                int top = (childAt.getTop() - marginLayoutParams.topMargin) + translationY;
                int A01 = top - A01(null, A02);
                drawable.setBounds(paddingLeft, A01, width, top);
                drawable.draw(canvas);
                if (interfaceC163567Tt.CWx(A02)) {
                    drawable2.setBounds(paddingLeft, A01 - this.A04, width, A01);
                    drawable2.draw(canvas);
                }
                if (A02(A02)) {
                    drawable2.setBounds(paddingLeft, A00, width, this.A04 + A00);
                    drawable2.draw(canvas);
                }
            }
        }
    }

    private final int A00(int i) {
        if (i == 0 && this.A01.CWu(i)) {
            return this.A02 * 2;
        }
        InterfaceC163567Tt interfaceC163567Tt = this.A01;
        if (interfaceC163567Tt.CWu(i) != interfaceC163567Tt.CYT(i)) {
            return this.A02;
        }
        if (i != -1 && this.A09.CVd(i)) {
            return this.A00;
        }
        return this.A03;
    }

    private final int A01(Boolean bool, int i) {
        boolean CVc;
        int i2;
        InterfaceC163567Tt interfaceC163567Tt = this.A01;
        if (interfaceC163567Tt.CWu(i) != interfaceC163567Tt.CYR(i)) {
            i2 = this.A02;
        } else {
            if (i == -1) {
                if (bool != null) {
                    CVc = bool.booleanValue();
                }
                i2 = this.A03;
            } else {
                CVc = this.A09.CVc(i);
            }
            if (CVc) {
                i2 = this.A00;
            }
            i2 = this.A03;
        }
        if (interfaceC163567Tt.CWx(i)) {
            i2 += this.A04;
        }
        if (A02(i)) {
            return i2 + this.A04;
        }
        return i2;
    }

    private final boolean A02(int i) {
        boolean CYT;
        boolean z = this.A0A;
        InterfaceC163567Tt interfaceC163567Tt = this.A01;
        if (z) {
            if (!interfaceC163567Tt.CWw(i)) {
                if (interfaceC163567Tt.CWu(i) && !interfaceC163567Tt.CYT(i)) {
                    CYT = interfaceC163567Tt.CWv(i);
                } else {
                    return false;
                }
            }
            return true;
        }
        if (interfaceC163567Tt.CWu(i)) {
            CYT = interfaceC163567Tt.CYT(i);
        } else {
            return false;
        }
        if (!CYT) {
            return true;
        }
        return false;
    }

    public C7KS(Context context, InterfaceC163607Tx interfaceC163607Tx, InterfaceC163567Tt interfaceC163567Tt, C7IH c7ih, boolean z) {
        this.A09 = interfaceC163607Tx;
        this.A01 = interfaceC163567Tt;
        this.A0A = z;
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) / 2;
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        int i = c7ih.A0A;
        this.A08 = new ColorDrawable(i);
        this.A07 = new ColorDrawable(context.getColor(R.color.interleaved_shh_messages_border_color));
        this.A06 = new ColorDrawable(i);
        this.A05 = new ColorDrawable(context.getColor(R.color.grey_6));
        this.A00 = context.getResources().getDimensionPixelOffset(R.dimen.abc_control_corner_material) / 2;
    }
}
