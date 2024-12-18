package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.litho.ComponentHost;

/* renamed from: X.CTc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27943CTc {
    public View A00;

    public final void A00(View view) {
        ViewGroup viewGroup;
        View rootView = view.getRootView();
        if ((rootView instanceof ViewGroup) && (viewGroup = (ViewGroup) rootView) != null && !(viewGroup instanceof ComponentHost) && viewGroup.isAttachedToWindow()) {
            BYB byb = new BYB();
            Context context = viewGroup.getContext();
            View view2 = new View(context);
            this.A00 = view2;
            byb.A00.setColor(context.getColor(R.color.black_50_transparent));
            view2.setBackground(byb);
            viewGroup.addView(view2, -1, -1);
        }
    }
}
