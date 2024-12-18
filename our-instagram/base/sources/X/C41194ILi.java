package X;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.ILi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41194ILi {
    public final /* synthetic */ View A00;
    public final /* synthetic */ SwipeRefreshLayout A01;
    public final /* synthetic */ C59952od A02;

    public C41194ILi(View view, SwipeRefreshLayout swipeRefreshLayout, C59952od c59952od) {
        this.A02 = c59952od;
        this.A00 = view;
        this.A01 = swipeRefreshLayout;
    }

    public final void A00() {
        C59952od c59952od = this.A02;
        C120985dq A00 = C37624GhJ.A00(c59952od);
        if (A00 != null && A00.A02 != null) {
            C37540Gfw c37540Gfw = c59952od.A09;
            String str = "clipsViewerFragmentViewModel";
            if (c37540Gfw != null) {
                if (c37540Gfw.A0B == null) {
                    C37851Gl5 A0C = c37540Gfw.A0C();
                    SwipeRefreshLayout swipeRefreshLayout = this.A01;
                    View view = this.A00;
                    A0C.A04 = c59952od;
                    C37556GgC c37556GgC = c59952od.A0N;
                    if (c37556GgC == null) {
                        str = "clipsViewerViewPager";
                    } else {
                        IN9 in9 = c59952od.A0J;
                        if (in9 == null) {
                            str = "overlayFragmentController";
                        } else {
                            C37540Gfw c37540Gfw2 = c59952od.A09;
                            if (c37540Gfw2 != null) {
                                A0C.A08(swipeRefreshLayout, c37540Gfw2.A13, in9, c37556GgC);
                                A0C.onViewCreated(view, null);
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
