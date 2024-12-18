package X;

import android.view.View;
import java.util.List;

/* renamed from: X.3Lt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72203Lt {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A07;
    public int A08;
    public boolean A0A;
    public boolean A0B = true;
    public int A02 = 0;
    public int A06 = 0;
    public List A09 = null;

    public final View A00(C70593Ew c70593Ew) {
        List list = this.A09;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((C3OO) this.A09.get(i)).itemView;
                C3OO c3oo = ((C3OP) view.getLayoutParams()).mViewHolder;
                if (!c3oo.isRemoved() && this.A01 == c3oo.getLayoutPosition()) {
                    A01(view);
                    return view;
                }
            }
            return null;
        }
        View A04 = c70593Ew.A04(this.A01);
        this.A01 += this.A03;
        return A04;
    }

    public final void A01(View view) {
        int i;
        int layoutPosition;
        int size = this.A09.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                View view3 = ((C3OO) this.A09.get(i3)).itemView;
                C3OP c3op = (C3OP) view3.getLayoutParams();
                if (view3 != view) {
                    C3OO c3oo = c3op.mViewHolder;
                    if (!c3oo.isRemoved() && (layoutPosition = (c3oo.getLayoutPosition() - this.A01) * this.A03) >= 0 && layoutPosition < i2) {
                        view2 = view3;
                        if (layoutPosition == 0) {
                            break;
                        } else {
                            i2 = layoutPosition;
                        }
                    }
                }
                i3++;
            } else if (view2 == null) {
                i = -1;
            }
        }
        i = ((C3OP) view2.getLayoutParams()).mViewHolder.getLayoutPosition();
        this.A01 = i;
    }
}
