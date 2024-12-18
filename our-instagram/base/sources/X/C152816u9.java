package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.6u9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152816u9 {
    public C2UU A00;
    public boolean A01;
    public boolean A02;
    public final ViewGroup A04;
    public final InterfaceC156076zb A06;
    public int A03 = 1;
    public final AbstractC65392xb A05 = new C25900Bd3(this);

    public C152816u9(ViewGroup viewGroup, InterfaceC156076zb interfaceC156076zb) {
        this.A04 = viewGroup;
        this.A06 = interfaceC156076zb;
    }

    public static final void A03(C152816u9 c152816u9, int i, int i2) {
        C3OO c3oo;
        int i3 = i2 + i;
        while (i < i3) {
            View childAt = c152816u9.A04.getChildAt(i);
            if (childAt == null) {
                c3oo = null;
            } else {
                c3oo = (C3OO) childAt.getTag(R.id.adapterlayout_tag_view_holder);
            }
            if (c3oo != null) {
                C2UU c2uu = c152816u9.A00;
                if (c2uu != null) {
                    c2uu.onBindViewHolder(c3oo, i);
                    i++;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public static final void A00(C152816u9 c152816u9) {
        C2UU c2uu = c152816u9.A00;
        if (c2uu == null) {
            c152816u9.A04.removeAllViews();
            return;
        }
        int i = 0;
        while (i < c2uu.getItemCount()) {
            int itemViewType = c2uu.getItemViewType(i);
            ViewGroup viewGroup = c152816u9.A04;
            if (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                Number number = (Number) childAt.getTag(R.id.adapterlayout_tag_view_type);
                C3OO c3oo = (C3OO) childAt.getTag(R.id.adapterlayout_tag_view_holder);
                if (number != null && number.intValue() == itemViewType && c3oo != null) {
                    c2uu.onBindViewHolder(c3oo, i);
                } else {
                    A02(c152816u9, itemViewType, i);
                    viewGroup.removeView(childAt);
                }
            } else {
                A02(c152816u9, itemViewType, i);
            }
            i++;
        }
        ViewGroup viewGroup2 = c152816u9.A04;
        if (i >= viewGroup2.getChildCount()) {
            return;
        }
        viewGroup2.removeViews(i, viewGroup2.getChildCount() - i);
    }

    public static final void A01(C152816u9 c152816u9) {
        C2UU c2uu = c152816u9.A00;
        if (c2uu != null) {
            int itemCount = c2uu.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                View childAt = c152816u9.A04.getChildAt(i);
                if (childAt != null) {
                    childAt.setTag(R.id.adapterlayout_tag_view_position, Integer.valueOf(i));
                }
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A02(C152816u9 c152816u9, int i, int i2) {
        C2UU c2uu = c152816u9.A00;
        if (c2uu != null) {
            ViewGroup viewGroup = c152816u9.A04;
            C3OO onCreateViewHolder = c2uu.onCreateViewHolder(viewGroup, i);
            onCreateViewHolder.itemView.setTag(R.id.adapterlayout_tag_view_holder, onCreateViewHolder);
            onCreateViewHolder.itemView.setTag(R.id.adapterlayout_tag_view_type, Integer.valueOf(i));
            onCreateViewHolder.itemView.setTag(R.id.adapterlayout_tag_view_position, Integer.valueOf(i2));
            viewGroup.addView(onCreateViewHolder.itemView, i2);
            c2uu.onBindViewHolder(onCreateViewHolder, i2);
        }
    }

    public static final void A04(C152816u9 c152816u9, String str, InterfaceC16820sZ interfaceC16820sZ) {
        if (c152816u9.A02) {
            c152816u9.A01 = true;
            return;
        }
        InterfaceC156076zb interfaceC156076zb = c152816u9.A06;
        if (interfaceC156076zb != null) {
            interfaceC156076zb.DxC(c152816u9.A03, str);
        }
        c152816u9.A03++;
        interfaceC16820sZ.invoke();
        if (interfaceC156076zb == null) {
            return;
        }
        C14360o3.A0B(((C156066za) interfaceC156076zb).A00.A0L, 0);
        C006802i.A0p.markerEnd(18290511, (short) 2);
    }
}
