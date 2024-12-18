package X;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

/* renamed from: X.WOa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70255WOa implements AbsListView.OnScrollListener {
    public final /* synthetic */ WPW A00;

    public C70255WOa(WPW wpw) {
        this.A00 = wpw;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C0f9.A0A(814672774, C0f9.A03(986079129));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = C0f9.A03(-1726867918);
        if (i == 1) {
            WPW wpw = this.A00;
            PopupWindow popupWindow = wpw.A09;
            if (popupWindow.getInputMethodMode() != 2 && popupWindow.getContentView() != null) {
                Handler handler = wpw.A0I;
                RunnableC71213Wq4 runnableC71213Wq4 = wpw.A0K;
                handler.removeCallbacks(runnableC71213Wq4);
                runnableC71213Wq4.run();
            }
        }
        C0f9.A0A(-2093652853, A03);
    }
}
