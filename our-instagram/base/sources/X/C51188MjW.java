package X;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* renamed from: X.MjW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51188MjW extends AbstractC70653Fc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ N7y A03;

    public C51188MjW(N7y n7y, int i, int i2, int i3) {
        this.A03 = n7y;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        int bindingAdapterPosition;
        EnumC39586Hdw enumC39586Hdw;
        int i;
        AbstractC167027dH.A12(rect, view, recyclerView);
        C3OO A0Y = recyclerView.A0Y(view);
        if (A0Y != null && (bindingAdapterPosition = A0Y.getBindingAdapterPosition()) != -1) {
            if (this.A03.isModelClass(bindingAdapterPosition, C56092OvC.class)) {
                enumC39586Hdw = EnumC39586Hdw.A0M;
            } else {
                enumC39586Hdw = EnumC39586Hdw.A0N;
            }
            if (EnumC39586Hdw.A0M != enumC39586Hdw && EnumC39586Hdw.A07 != enumC39586Hdw) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = A0Y.itemView.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            int i2 = ((C154496wz) layoutParams).A00;
            int i3 = this.A01;
            if (i2 % i3 == 0) {
                i = this.A00;
            } else {
                i = this.A02 / i3;
            }
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
                rect.left = i;
            } else {
                rect.right = i;
            }
        }
    }
}
