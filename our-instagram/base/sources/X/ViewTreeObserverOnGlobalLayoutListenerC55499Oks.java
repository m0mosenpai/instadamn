package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.List;
import java.util.Map;

/* renamed from: X.Oks, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC55499Oks implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public ViewTreeObserverOnGlobalLayoutListenerC55499Oks(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver CFv;
        InterfaceC58195Pr1 interfaceC58195Pr1;
        C50782Mbq c50782Mbq;
        int A00;
        List list;
        RecyclerView A0B;
        switch (this.A00) {
            case 0:
                C50815Mcp c50815Mcp = (C50815Mcp) this.A03;
                AbstractC166997dE.A1K(c50815Mcp, this);
                C53641Nnm c53641Nnm = ((C54575O9c) this.A02).A02;
                if (c53641Nnm != null && (list = c53641Nnm.A04) != null) {
                    c50815Mcp.A03(list);
                }
                Drawable progressDrawable = c50815Mcp.getProgressDrawable();
                int i = c50815Mcp.getProgressDrawable().getBounds().left;
                int i2 = c50815Mcp.getProgressDrawable().getBounds().left;
                Context A0L = AbstractC166997dE.A0L(c50815Mcp);
                int A002 = i2 + C50815Mcp.A00(A0L, 4);
                int i3 = c50815Mcp.getProgressDrawable().getBounds().right;
                int i4 = this.A01;
                if (i4 == 0) {
                    A00 = c50815Mcp.getProgressDrawable().getBounds().bottom;
                } else {
                    A00 = i4 - C50815Mcp.A00(A0L, 4);
                }
                progressDrawable.setBounds(i, A002, i3, A00);
                return;
            case 1:
                View view = (View) this.A03;
                AbstractC166997dE.A1K(view, this);
                Rect A0U = AbstractC166987dD.A0U();
                View view2 = (View) this.A02;
                View view3 = view2;
                view2.getHitRect(A0U);
                while (true) {
                    Object parent = view3.getParent();
                    if (!C14360o3.A0K(parent, view) && (parent instanceof View)) {
                        view3 = (View) parent;
                        A0U.offset(view3.getLeft(), view3.getTop());
                    }
                }
                int i5 = A0U.left;
                int i6 = this.A01;
                A0U.left = i5 - i6;
                A0U.top -= i6;
                A0U.right += i6;
                A0U.bottom += i6;
                TouchDelegate touchDelegate = new TouchDelegate(A0U, view2);
                TouchDelegate touchDelegate2 = view.getTouchDelegate();
                if (!(touchDelegate2 instanceof C50782Mbq) || (c50782Mbq = (C50782Mbq) touchDelegate2) == null) {
                    c50782Mbq = new C50782Mbq(view);
                }
                Map map = c50782Mbq.A00;
                if (!map.containsKey(Integer.valueOf(view2.getId()))) {
                    AbstractC25227BEk.A1O(touchDelegate, map, view2.getId());
                }
                view.setTouchDelegate(c50782Mbq);
                return;
            case 2:
                ((C8J9) this.A03).A01.A08(this.A01);
                CFv = ((View) this.A02).getViewTreeObserver();
                break;
            case 3:
                C56206OxF c56206OxF = (C56206OxF) this.A03;
                RecyclerView recyclerView = c56206OxF.A04;
                int i7 = this.A01;
                C3OO A0V = recyclerView.A0V(i7);
                if ((A0V instanceof C51224Mk9) && (interfaceC58195Pr1 = ((C51224Mk9) A0V).A00) != null) {
                    if (!C2J9.A02(c56206OxF.A05)) {
                        interfaceC58195Pr1.CoV();
                    }
                    interfaceC58195Pr1.E48(new C56212OxL((C54393O1z) this.A02, c56206OxF, i7));
                } else {
                    C52254NAu c52254NAu = ((C54393O1z) this.A02).A00;
                    c52254NAu.A0U.A0O();
                    c52254NAu.A0R.setVisibility(0);
                }
                CFv = c56206OxF.CFv();
                break;
            default:
                C156136zh c156136zh = (C156136zh) this.A03;
                View view4 = c156136zh.A0C.mView;
                if (view4 != null && (A0B = AbstractC43592JPx.A0B(view4, R.id.highlights_reel_tray_recycler_view)) != null && A0B.getHeight() != 0 && !c156136zh.A07.A0A()) {
                    List list2 = c156136zh.A03;
                    if (list2 != null) {
                        list2.remove(this);
                    }
                    int i8 = this.A01;
                    A0B.A0o(i8);
                    if (A0B.A0V(i8) != null) {
                        AbstractC166997dE.A1K(view4, this);
                        ((ABP) this.A02).A00(A0B);
                        return;
                    }
                    return;
                }
                return;
        }
        CFv.removeOnGlobalLayoutListener(this);
    }
}
