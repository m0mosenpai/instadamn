package X;

import android.view.View;

/* renamed from: X.Cri, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29055Cri implements C2YT {
    public static final C29055Cri A00 = new Object();

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        View A0Q = AbstractC25228BEl.A0Q(c2yr, C26632BpT.A04);
        A0Q.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return AbstractC25232BEp.A19(Math.max(C78613fT.A03(j), A0Q.getMeasuredWidth()), Math.max(C78613fT.A02(j), A0Q.getMeasuredHeight()));
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
