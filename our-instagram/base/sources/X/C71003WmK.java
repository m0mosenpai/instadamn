package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.WmK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71003WmK implements GZP {
    public final int A00;
    public final Object A01;

    public C71003WmK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GZP
    public final void DGh(boolean z) {
        SpinnerImageView spinnerImageView;
        int i;
        C67901V1p c67901V1p;
        String str;
        if (this.A00 != 0) {
            if (z) {
                V1Q v1q = (V1Q) this.A01;
                GFJ gfj = v1q.A07;
                if (gfj == null) {
                    str = "savedCollectionsFetcher";
                } else if (!gfj.A03()) {
                    RecyclerView recyclerView = v1q.A04;
                    if (recyclerView == null) {
                        str = "recyclerView";
                    } else {
                        recyclerView.setVisibility(8);
                        SpinnerImageView spinnerImageView2 = v1q.A09;
                        str = "loadingSpinner";
                        if (spinnerImageView2 != null) {
                            spinnerImageView2.setLoadingStatus(C3T1.FAILED);
                            spinnerImageView = v1q.A09;
                            if (spinnerImageView != null) {
                                i = 66;
                                c67901V1p = v1q;
                            }
                        }
                    }
                } else {
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            return;
        }
        if (z) {
            C67901V1p c67901V1p2 = (C67901V1p) this.A01;
            if (!c67901V1p2.A05.A03()) {
                SpinnerImageView spinnerImageView3 = c67901V1p2.A08;
                spinnerImageView3.getClass();
                spinnerImageView3.setLoadingStatus(C3T1.FAILED);
                RecyclerView recyclerView2 = c67901V1p2.A01;
                recyclerView2.getClass();
                recyclerView2.setVisibility(8);
                spinnerImageView = c67901V1p2.A08;
                i = 64;
                c67901V1p = c67901V1p2;
            } else {
                return;
            }
        } else {
            return;
        }
        WNU.A00(spinnerImageView, i, c67901V1p);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    @Override // X.GZP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DGr(java.util.List r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71003WmK.DGr(java.util.List, boolean):void");
    }
}
