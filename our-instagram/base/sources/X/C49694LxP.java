package X;

import android.view.View;

/* renamed from: X.LxP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49694LxP implements InterfaceC37144GYf {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C5qT A01;
    public final /* synthetic */ C127915qK A02;
    public final /* synthetic */ C47732L5t A03;
    public final /* synthetic */ Object A04;

    public C49694LxP(View view, C5qT c5qT, C127915qK c127915qK, C47732L5t c47732L5t, Object obj) {
        this.A03 = c47732L5t;
        this.A00 = view;
        this.A04 = obj;
        this.A02 = c127915qK;
        this.A01 = c5qT;
    }

    @Override // X.InterfaceC37144GYf
    public final void CyV() {
        C47732L5t c47732L5t = this.A03;
        View view = this.A00;
        Object obj = this.A04;
        C127915qK c127915qK = this.A02;
        C5qT c5qT = this.A01;
        if (obj instanceof C38321qM) {
            c47732L5t.A00(view, c5qT, c127915qK, (C38321qM) obj);
        }
    }
}
