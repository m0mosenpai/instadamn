package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.MjN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51179MjN extends AbstractC70653Fc {
    public final int A00;

    public C51179MjN(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int i;
        int A03;
        int i2;
        Resources resources;
        int i3;
        int i4;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(rect, 0);
                AbstractC167027dH.A13(view, recyclerView, c3f5);
                super.getItemOffsets(rect, view, recyclerView, c3f5);
                A03 = MSW.A03(recyclerView);
                int A02 = RecyclerView.A02(view);
                if (A02 == 0) {
                    rect.top = A03;
                    return;
                }
                if (A02 != c3f5.A00() - 1) {
                    return;
                }
                rect.bottom = A03;
                return;
            case 1:
                i2 = 0;
                C14360o3.A0B(rect, 0);
                AbstractC167027dH.A13(view, recyclerView, c3f5);
                super.getItemOffsets(rect, view, recyclerView, c3f5);
                int A0C = AbstractC166987dD.A0C(AbstractC166997dE.A0L(recyclerView), 4);
                rect.left = A0C;
                rect.right = A0C;
                int A022 = RecyclerView.A02(view);
                if (A022 == 0) {
                    rect.left = 0;
                    return;
                }
                if (A022 != c3f5.A00() - 1) {
                    return;
                }
                rect.right = i2;
                return;
            case 2:
                AbstractC167017dG.A1N(rect, view);
                resources = view.getResources();
                i3 = R.dimen.afi_margin_top;
                i2 = resources.getDimensionPixelSize(i3);
                rect.right = i2;
                return;
            case 3:
                boolean A1b = AbstractC25233BEq.A1b(rect, view, recyclerView);
                int A023 = RecyclerView.A02(view);
                rect.left = 20;
                rect.right = 20;
                if (A023 == A1b) {
                    i = 32;
                    rect.left = i;
                    return;
                }
                return;
            case 4:
                C14360o3.A0B(rect, 0);
                AbstractC167027dH.A13(view, recyclerView, c3f5);
                super.getItemOffsets(rect, view, recyclerView, c3f5);
                resources = view.getResources();
                i3 = R.dimen.abc_button_padding_horizontal_material;
                i2 = resources.getDimensionPixelSize(i3);
                rect.right = i2;
                return;
            case 5:
                C14360o3.A0B(rect, 0);
                AbstractC167027dH.A13(view, recyclerView, c3f5);
                super.getItemOffsets(rect, view, recyclerView, c3f5);
                try {
                    A03 = AbstractC167017dG.A03(view.getContext());
                } catch (Resources.NotFoundException unused) {
                    A03 = 0;
                }
                rect.bottom = A03;
                return;
            default:
                C14360o3.A0B(rect, 0);
                AbstractC167027dH.A13(view, recyclerView, c3f5);
                super.getItemOffsets(rect, view, recyclerView, c3f5);
                try {
                    i4 = AbstractC167017dG.A06(view.getContext());
                } catch (Resources.NotFoundException unused2) {
                    i4 = 0;
                }
                int A024 = RecyclerView.A02(view);
                rect.right = i4;
                if (A024 == 0) {
                    i = AbstractC167017dG.A03(view.getContext());
                    rect.left = i;
                    return;
                }
                return;
        }
    }
}
