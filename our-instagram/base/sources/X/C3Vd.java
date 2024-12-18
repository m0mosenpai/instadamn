package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.forker.Process;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.3Vd, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3Vd implements InterfaceC74243Ve {
    public final Rect A00 = new Rect();

    @Override // X.InterfaceC74243Ve
    public void E4r(View view, ReboundViewPager reboundViewPager, float f, int i) {
        C14360o3.A0B(reboundViewPager, 0);
        C14360o3.A0B(view, 1);
        float pageSize = (reboundViewPager.getPageSize() * f) + (f * reboundViewPager.A00);
        if (reboundViewPager.A0M == EnumC74233Vc.A03) {
            view.setTranslationY(pageSize);
        } else {
            view.setTranslationX(pageSize);
        }
    }

    @Override // X.InterfaceC74243Ve
    public boolean F83(ReboundViewPager reboundViewPager, float f, float f2) {
        int childCount = reboundViewPager.getChildCount();
        if (childCount == 0) {
            return false;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Process.WAIT_RESULT_STOPPED;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = reboundViewPager.getChildAt(i3);
            Rect rect = this.A00;
            childAt.getHitRect(rect);
            if (rect.contains(Math.round(f), Math.round(f2))) {
                return true;
            }
            i = Math.min(i, rect.left);
            i2 = Math.max(i2, rect.right);
        }
        if (f < i || f > i2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC74243Ve
    public int AVv(ReboundViewPager reboundViewPager, float f) {
        double floor;
        double d = f;
        if (reboundViewPager.A0S()) {
            floor = Math.ceil(d);
        } else {
            floor = Math.floor(d);
        }
        return (int) floor;
    }

    @Override // X.InterfaceC74243Ve
    public int Cgd(ReboundViewPager reboundViewPager, float f) {
        double ceil;
        double d = f;
        if (reboundViewPager.A0S()) {
            ceil = Math.floor(d);
        } else {
            ceil = Math.ceil(d);
        }
        return (int) ceil;
    }
}
