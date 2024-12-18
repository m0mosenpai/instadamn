package X;

import android.content.Context;
import android.util.Size;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.ATa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23265ATa implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C153506vL A00;

    public ViewTreeObserverOnGlobalLayoutListenerC23265ATa(C153506vL c153506vL) {
        this.A00 = c153506vL;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        C153506vL c153506vL = this.A00;
        Context context = c153506vL.getContext();
        if (context != null) {
            C153766vl c153766vl = c153506vL.A07;
            String str = "clipsGridAdapter";
            if (c153766vl != null) {
                Size A01 = AbstractC153796vo.A01(context, c153766vl.A0L.A00);
                c153766vl.A02 = A01;
                c153766vl.A01 = A01.getWidth();
                int height = c153766vl.A02.getHeight();
                c153766vl.A00 = height;
                C153836vs c153836vs = c153766vl.A06;
                if (c153836vs == null) {
                    str = "clipsGridItemDefinition";
                } else {
                    c153836vs.A01 = c153766vl.A01;
                    c153836vs.A00 = height;
                    C153766vl c153766vl2 = c153506vL.A07;
                    if (c153766vl2 != null) {
                        c153766vl2.A0I.notifyDataSetChanged();
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        RecyclerView recyclerView = c153506vL.A00;
        if (recyclerView != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
