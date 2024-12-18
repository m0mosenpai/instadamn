package X;

import android.view.View;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.IjD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41982IjD implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C38681GzM A01;
    public final /* synthetic */ InterfaceC75453aC A02;
    public final /* synthetic */ C75113Zb A03;
    public final /* synthetic */ Hashtag A04;

    public ViewOnClickListenerC41982IjD(C38681GzM c38681GzM, InterfaceC75453aC interfaceC75453aC, C75113Zb c75113Zb, Hashtag hashtag, int i) {
        this.A01 = c38681GzM;
        this.A02 = interfaceC75453aC;
        this.A04 = hashtag;
        this.A03 = c75113Zb;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1490480367);
        C38321qM A00 = ((C76733cL) this.A01.A03).A00();
        this.A02.D41(A00, this.A03, this.A04, this.A00);
        C0f9.A0C(1409038478, A05);
    }
}
