package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9zA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226529zA {
    public static final int A00(RecyclerView recyclerView) {
        C2UU c2uu = recyclerView.A0A;
        if (c2uu == null) {
            return 0;
        }
        int itemCount = c2uu.getItemCount();
        return AbstractC166987dD.A0A(itemCount - 1, recyclerView.computeHorizontalScrollOffset() / (recyclerView.computeHorizontalScrollRange() - recyclerView.computeHorizontalScrollExtent()));
    }
}
