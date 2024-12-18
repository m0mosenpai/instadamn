package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JiD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44321JiD {
    public RecyclerView A00;
    public int A01 = -1;
    public int A02 = -1;
    public final C44220JgP A03 = new C44220JgP(this, 3);
    public final MOR A04;

    public static final void A00(C44321JiD c44321JiD) {
        C3OO A0V;
        View view;
        C3OO A0V2;
        View view2;
        AbstractC70663Fe abstractC70663Fe = c44321JiD.A00.A0D;
        C14360o3.A0C(abstractC70663Fe, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        int A1c = linearLayoutManager.A1c();
        int A1d = linearLayoutManager.A1d();
        if (A1a == A1c || (A0V2 = c44321JiD.A00.A0V(A1a)) == null || (view2 = A0V2.itemView) == null || !c44321JiD.A01(view2)) {
            A1a = A1c;
        }
        if (A1b == A1d || (A0V = c44321JiD.A00.A0V(A1b)) == null || (view = A0V.itemView) == null || !c44321JiD.A01(view)) {
            A1b = A1d;
        }
        int i = new int[]{A1a, A1b}[0];
        if (i != -1 && A1b != -1) {
            if (i < 0) {
                i = 0;
            }
            if (A1b < 0) {
                A1b = 0;
            }
            if (i == c44321JiD.A01 && A1b == c44321JiD.A02) {
                return;
            }
            C2UU c2uu = c44321JiD.A00.A0A;
            C14360o3.A0C(c2uu, "null cannot be cast to non-null type com.instagram.creation.capture.gallery.albumpicker.BaseAdapter<*, T of com.instagram.creation.capture.gallery.albumpicker.AlbumImpressionTracker>");
            JnX jnX = (JnX) c2uu;
            int i2 = i;
            if (c44321JiD.A01 == -1) {
                while (i2 <= A1b) {
                    c44321JiD.A04.DLn(jnX.A00(i2), i2);
                    i2++;
                }
            } else {
                while (i2 < c44321JiD.A01) {
                    c44321JiD.A04.DLn(jnX.A00(i2), i2);
                    i2++;
                }
                for (int i3 = A1b; i3 > c44321JiD.A02; i3--) {
                    c44321JiD.A04.DLn(jnX.A00(i3), i3);
                }
            }
            c44321JiD.A01 = i;
            c44321JiD.A02 = A1b;
        }
    }

    private final boolean A01(View view) {
        Rect rect = new Rect();
        if (!view.isShown() || view.getVisibility() != 0 || view.getParent() == null || !view.getGlobalVisibleRect(rect)) {
            return false;
        }
        float width = rect.width() * rect.height();
        int width2 = view.getWidth() * view.getHeight();
        if (width2 <= 0 || width / width2 <= 0.6f) {
            return false;
        }
        return true;
    }

    public C44321JiD(RecyclerView recyclerView, MOR mor) {
        this.A00 = recyclerView;
        this.A04 = mor;
        ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            JXP.A00(viewTreeObserver, this, 1);
        }
        this.A00.A14(this.A03);
    }
}
