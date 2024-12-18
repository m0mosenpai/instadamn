package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Jgv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44251Jgv extends BaseAdapter {
    public static boolean A06;
    public C41551w4 A00;
    public final int A01;
    public final int A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final ReelDashboardFragment A05;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C44251Jgv(InterfaceC11380iw interfaceC11380iw, UserSession userSession, ReelDashboardFragment reelDashboardFragment, int i) {
        this.A04 = userSession;
        this.A02 = i;
        this.A01 = (int) (i / 0.5625f);
        this.A03 = interfaceC11380iw;
        this.A05 = reelDashboardFragment;
        A06 = AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36322465407838464L).booleanValue();
    }

    public static void A00(L0V l0v, int i, int i2) {
        if (!A06) {
            Drawable drawable = l0v.A01.getContext().getDrawable(R.drawable.filter_shadow);
            Rect A0U = AbstractC166987dD.A0U();
            drawable.getPadding(A0U);
            View view = l0v.A00;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i3 = A0U.left;
            ((ViewGroup.LayoutParams) marginLayoutParams).width = i + i3 + A0U.right;
            int i4 = A0U.top;
            ((ViewGroup.LayoutParams) marginLayoutParams).height = i2 + i4 + A0U.bottom;
            marginLayoutParams.topMargin = (int) ((r0 - i4) / 2.0f);
            marginLayoutParams.setMarginStart(Math.round((r2 - i3) / 2.0f));
            view.setLayoutParams(marginLayoutParams);
            view.setBackground(drawable);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size;
        C41551w4 c41551w4 = this.A00;
        if (c41551w4 == null) {
            size = 0;
        } else {
            UserSession userSession = this.A04;
            C14360o3.A0B(userSession, 0);
            size = C41551w4.A00(userSession, c41551w4).size();
        }
        return size + (AbstractC38260Gs3.A04(this.A04, this.A00) ? 1 : 0);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int size;
        C41551w4 c41551w4 = this.A00;
        if (c41551w4 == null) {
            size = 0;
        } else {
            UserSession userSession = this.A04;
            C14360o3.A0B(userSession, 0);
            size = C41551w4.A00(userSession, c41551w4).size();
        }
        if (i < size) {
            C41551w4 c41551w42 = this.A00;
            c41551w42.getClass();
            UserSession userSession2 = this.A04;
            C14360o3.A0B(userSession2, 0);
            return C41551w4.A00(userSession2, c41551w42).get(i);
        }
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        int size;
        C41551w4 c41551w4 = this.A00;
        if (c41551w4 == null) {
            size = 0;
        } else {
            UserSession userSession = this.A04;
            C14360o3.A0B(userSession, 0);
            size = C41551w4.A00(userSession, c41551w4).size();
        }
        if (i >= size) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44251Jgv.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
