package X;

import androidx.paging.PagingSource;

/* renamed from: X.MhZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51078MhZ extends PagingSource {
    public int A00;
    public final O1D A01;
    public final C12W A02;

    public C51078MhZ(O1D o1d, C12W c12w) {
        C14360o3.A0B(c12w, 1);
        this.A02 = c12w;
        this.A01 = o1d;
        this.A00 = Integer.MIN_VALUE;
        o1d.A00.A00(new C57102PUr(this));
        super.A00.A00(new C57514Pfo(this, 20));
    }
}
