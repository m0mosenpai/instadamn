package X;

import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.CrL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29032CrL implements C2YT {
    public final C3T1 A00;

    public C29032CrL(C3T1 c3t1) {
        C14360o3.A0B(c3t1, 1);
        this.A00 = c3t1;
    }

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        SpinnerImageView spinnerImageView = (SpinnerImageView) AbstractC25228BEl.A0Q(c2yr, AbstractC27774CMp.A00);
        spinnerImageView.setLoadingStatus(this.A00);
        return AbstractC25234BEr.A0Q(spinnerImageView, j);
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
