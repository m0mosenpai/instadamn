package X;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.PQu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57004PQu implements Runnable {
    public final /* synthetic */ C52111N4j A00;
    public final /* synthetic */ String A01;

    public RunnableC57004PQu(C52111N4j c52111N4j, String str) {
        this.A00 = c52111N4j;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        KeyEvent.Callback callback;
        C52111N4j c52111N4j = this.A00;
        IgLinearLayout igLinearLayout = c52111N4j.A02;
        ViewGroup viewGroup = null;
        if (igLinearLayout != null) {
            view = igLinearLayout.findViewWithTag(this.A01);
        } else {
            view = null;
        }
        NestedScrollView nestedScrollView = c52111N4j.A01;
        if (nestedScrollView != null) {
            callback = AnonymousClass040.A00(nestedScrollView, 0);
        } else {
            callback = null;
        }
        if (callback instanceof ViewGroup) {
            viewGroup = (ViewGroup) callback;
        }
        if (view != null && viewGroup != null) {
            Rect rect = c52111N4j.A04;
            viewGroup.getLocalVisibleRect(rect);
            int i = rect.bottom;
            view.getDrawingRect(rect);
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            int i2 = rect.bottom;
            NestedScrollView nestedScrollView2 = c52111N4j.A01;
            if (nestedScrollView2 != null) {
                nestedScrollView2.A0D(i2 - i);
            }
        }
    }
}
