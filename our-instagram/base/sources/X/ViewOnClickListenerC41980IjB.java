package X;

import android.view.View;

/* renamed from: X.IjB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41980IjB implements View.OnClickListener {
    public final /* synthetic */ C905641r A00;
    public final /* synthetic */ AnonymousClass421 A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C75113Zb A03;
    public final /* synthetic */ boolean A04;

    public ViewOnClickListenerC41980IjB(C905641r c905641r, AnonymousClass421 anonymousClass421, C38321qM c38321qM, C75113Zb c75113Zb, boolean z) {
        this.A01 = anonymousClass421;
        this.A02 = c38321qM;
        this.A03 = c75113Zb;
        this.A04 = z;
        this.A00 = c905641r;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1331395186);
        this.A01.Cvi(this.A02, this.A03, C05F.A01, null, this.A04, false);
        AbstractC167007dF.A0L(this.A00.A03).setVisibility(8);
        C0f9.A0C(1077693498, A05);
    }
}
