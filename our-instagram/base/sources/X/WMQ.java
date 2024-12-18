package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WMQ implements View.OnClickListener {
    public final /* synthetic */ C65958TxA A00;
    public final /* synthetic */ C38011Gnx A01;

    public WMQ(C65958TxA c65958TxA, C38011Gnx c38011Gnx) {
        this.A00 = c65958TxA;
        this.A01 = c38011Gnx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1916166201);
        C65958TxA c65958TxA = this.A00;
        c65958TxA.A00.D5T(c65958TxA.A01, this.A01.getBindingAdapterPosition());
        C0f9.A0C(-1566708108, A05);
    }
}
