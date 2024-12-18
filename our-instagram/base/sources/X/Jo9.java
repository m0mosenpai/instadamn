package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class Jo9 extends AbstractC70653Fc {
    public final /* synthetic */ JoS A00;

    @Override // X.AbstractC70653Fc
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        View view;
        Integer num;
        AbstractC167017dG.A1N(canvas, recyclerView);
        C14360o3.A0B(c3f5, 2);
        JoS joS = this.A00;
        View view2 = (View) AbstractC001800i.A0J(joS.A0A);
        C3OO c3oo = joS.A02;
        if (c3oo != null) {
            view = c3oo.itemView;
        } else {
            view = null;
        }
        if (Math.abs(joS.A01) > 0.0f && view2 != null && view != null) {
            float top = view.getTop() + view2.getTop() + (view2.getHeight() / 2);
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            float f = iArr[0];
            float abs = Math.abs(joS.A01);
            float f2 = f - abs;
            C7SS c7ss = joS.A08;
            float right = view2.getRight();
            if (joS.A0B) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            c7ss.A01(canvas, num, C05F.A00, abs, top, f2, right);
        }
    }

    public Jo9(JoS joS) {
        this.A00 = joS;
    }
}
