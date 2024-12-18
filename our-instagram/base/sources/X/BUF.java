package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes5.dex */
public final class BUF extends C1I4 {
    public static final ViewGroup.MarginLayoutParams A01;
    public C27953CTr A00;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A01 = marginLayoutParams;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C0f9.A0A(-1288031156, C0f9.A03(-200646024));
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View A0d;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int height;
        int top;
        int i3;
        float f;
        int A03 = C0f9.A03(692404252);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
        int A1a = linearLayoutManager.A1a();
        if (A1a != -1 && (A0d = linearLayoutManager.A0d(A1a)) != null) {
            if (A0d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) A0d.getLayoutParams();
            } else {
                marginLayoutParams = A01;
            }
            if (linearLayoutManager.A01 == 0) {
                height = A0d.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                if (((AbstractC70663Fe) linearLayoutManager).A07.getLayoutDirection() == 0) {
                    top = A0d.getLeft();
                    i3 = marginLayoutParams.leftMargin;
                } else {
                    top = height - A0d.getRight();
                    i3 = marginLayoutParams.rightMargin;
                }
            } else {
                height = marginLayoutParams.bottomMargin + A0d.getHeight() + marginLayoutParams.topMargin;
                top = A0d.getTop();
                i3 = marginLayoutParams.topMargin;
            }
            int i4 = -(top - i3);
            if (height == 0) {
                f = 0.0f;
            } else {
                f = i4 / height;
            }
            C27953CTr c27953CTr = this.A00;
            C6FX A0s = AbstractC25225BEi.A0s();
            C6FG c6fg = c27953CTr.A00;
            A0s.A01(c6fg);
            A0s.A02(Integer.valueOf(A1a));
            A0s.A03(C6DZ.A00(f), 2);
            C6FP.A03(c6fg, c27953CTr.A01, AbstractC25227BEk.A0f(A0s, Integer.valueOf(i4), 3), c27953CTr.A02);
        }
        C0f9.A0A(-1546697251, A03);
    }
}
