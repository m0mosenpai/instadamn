package X;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes11.dex */
public final class UB9 extends BaseAdapter {
    public int A00;
    public C69286Vku A01;
    public final int A02 = R.layout.promote_title_body_bottom_sheet_view;
    public final UserSession A03;
    public final List A04;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UB9.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A04.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A04.get(i);
    }

    public UB9(ViewGroup viewGroup, UserSession userSession, List list) {
        int i;
        this.A04 = list;
        this.A03 = userSession;
        DisplayMetrics A0K = AbstractC167007dF.A0K(viewGroup.getContext());
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            View view = getView(i2, null, viewGroup);
            if (view.requireViewById(R.id.placeholder).getVisibility() == 0) {
                this.A00 = -1;
                break;
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(A0K.widthPixels, Integer.MIN_VALUE), 0);
            if (this.A00 < view.getMeasuredHeight()) {
                i = view.getMeasuredHeight();
            } else {
                i = this.A00;
            }
            this.A00 = i;
            i2++;
        }
        AbstractC43592JPx.A1H(viewGroup, -1, this.A00);
    }
}
