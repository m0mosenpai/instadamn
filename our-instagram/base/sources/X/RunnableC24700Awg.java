package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Awg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24700Awg implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C189988bH A01;

    public RunnableC24700Awg(View view, C189988bH c189988bH) {
        this.A00 = view;
        this.A01 = c189988bH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        Rect A0U = AbstractC166987dD.A0U();
        view.getHitRect(A0U);
        int i = -dimensionPixelSize;
        A0U.inset(i, i);
        ViewGroup viewGroup = this.A01.A09;
        if (viewGroup != null) {
            viewGroup.setTouchDelegate(new TouchDelegate(A0U, view));
        }
    }
}
