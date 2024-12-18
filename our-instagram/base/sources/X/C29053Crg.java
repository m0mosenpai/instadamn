package X;

import android.view.View;

/* renamed from: X.Crg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29053Crg implements C2YT {
    public static final C29053Crg A00 = new Object();

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        View A0Q = AbstractC25228BEl.A0Q(c2yr, C26630BpR.A04);
        C86033sa c86033sa = (C86033sa) A0Q.getTag();
        if (c86033sa == null) {
            c86033sa = new C86033sa(A0Q);
            A0Q.setTag(c86033sa);
        }
        AbstractC166987dD.A0d(c86033sa.A05).setVisibility(0);
        AbstractC166987dD.A0d(c86033sa.A06).setVisibility(0);
        AbstractC25231BEo.A0z(A0Q, j);
        return AbstractC25232BEp.A19(A0Q.getMeasuredWidth(), Math.max(A0Q.getMinimumHeight(), A0Q.getMeasuredHeight()));
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
