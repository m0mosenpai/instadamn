package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.V4l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnKeyListenerC67971V4l extends AbstractC60592pi implements InterfaceC11380iw, View.OnKeyListener {
    public static final String __redex_internal_original_name = "CanvasVideoModule";
    public RecyclerView A00;
    public boolean A01;
    public final Rect A02;
    public final Handler A03;
    public final LinearLayoutManager A04;
    public final C66425UGy A05;
    public final ViewOnKeyListenerC98854c5 A06;
    public final InterfaceC11380iw A07;
    public final C1I4 A08;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        this.A01 = true;
        this.A03.sendEmptyMessage(0);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A14(this.A08);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07.getModuleName();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A03.removeCallbacksAndMessages(null);
        this.A00 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A03.removeCallbacksAndMessages(null);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A15(this.A08);
        }
        ViewOnKeyListenerC98854c5 viewOnKeyListenerC98854c5 = this.A06;
        viewOnKeyListenerC98854c5.A03 = null;
        C4QW c4qw = viewOnKeyListenerC98854c5.A02;
        if (c4qw != null) {
            viewOnKeyListenerC98854c5.A02();
            c4qw.EE4("fragment_paused");
            viewOnKeyListenerC98854c5.A02 = null;
        }
        this.A01 = false;
    }

    public ViewOnKeyListenerC67971V4l(Context context, RecyclerView recyclerView, C66425UGy c66425UGy, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC70663Fe abstractC70663Fe;
        AbstractC25234BEr.A1P(context, c66425UGy, userSession);
        this.A05 = c66425UGy;
        this.A00 = recyclerView;
        this.A07 = interfaceC11380iw;
        this.A02 = new Rect();
        ViewOnKeyListenerC98854c5 viewOnKeyListenerC98854c5 = new ViewOnKeyListenerC98854c5(context, userSession);
        viewOnKeyListenerC98854c5.A00 = this;
        this.A06 = viewOnKeyListenerC98854c5;
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null && (abstractC70663Fe = recyclerView2.A0D) != null) {
            this.A04 = (LinearLayoutManager) abstractC70663Fe;
            this.A03 = new HandlerC65967TxK(Looper.getMainLooper(), this, 3);
            this.A08 = new C65986Txf(this, 5);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        AbstractC167017dG.A1O(view, keyEvent);
        return this.A06.onKey(view, i, keyEvent);
    }
}
