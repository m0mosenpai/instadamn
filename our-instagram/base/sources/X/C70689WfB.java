package X;

import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.WfB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70689WfB implements C6W2 {
    public RefreshableNestedScrollingParent A00;
    public boolean A01;

    @Override // X.C6W2
    public final boolean EPu(C6FG c6fg, Object obj, int i) {
        if (i == 38) {
            boolean A01 = C6DZ.A01(obj);
            this.A01 = A01;
            RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
            if (refreshableNestedScrollingParent != null) {
                refreshableNestedScrollingParent.setRefreshing(A01);
                return true;
            }
            return true;
        }
        return false;
    }
}
