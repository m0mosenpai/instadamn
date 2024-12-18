package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.9Ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210839Ug extends C3OO {
    public final C215229fy A00;
    public final View A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C210839Ug(View view, InterfaceC168087f3 interfaceC168087f3, InterfaceC11380iw interfaceC11380iw) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = view;
        C215229fy c215229fy = new C215229fy(interfaceC168087f3, interfaceC11380iw);
        this.A00 = c215229fy;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        Context context = recyclerView.getContext();
        int A06 = AbstractC167017dG.A06(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setPadding(recyclerView.getPaddingLeft(), A06, recyclerView.getPaddingRight(), A06);
        recyclerView.setAdapter(c215229fy);
        final int A04 = AbstractC167017dG.A04(context);
        recyclerView.A10(new AbstractC70653Fc(A04) { // from class: X.9UO
            public final int A00;

            @Override // X.AbstractC70653Fc
            public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView2, C3F5 c3f5) {
                C14360o3.A0B(rect, 0);
                AbstractC167027dH.A13(view2, recyclerView2, c3f5);
                super.getItemOffsets(rect, view2, recyclerView2, c3f5);
                if (recyclerView2.A0A != null) {
                    int A02 = RecyclerView.A02(view2);
                    int i = this.A00;
                    if (A02 == 0) {
                        i *= 2;
                    }
                    rect.left = i;
                    int i2 = 0;
                    if (A02 == c3f5.A00() - 1) {
                        i2 = i * 2;
                    }
                    rect.right = i2;
                }
            }

            {
                this.A00 = A04;
            }
        });
    }
}
