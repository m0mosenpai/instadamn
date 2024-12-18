package X;

import android.view.View;

/* renamed from: X.Iuv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42700Iuv implements InterfaceC58152PqH {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C75113Zb A01;
    public final /* synthetic */ C37675GiC A02;
    public final /* synthetic */ C15370ps A03;
    public final /* synthetic */ boolean A04;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C42700Iuv(C38321qM c38321qM, C75113Zb c75113Zb, C37675GiC c37675GiC, C15370ps c15370ps, boolean z) {
        this.A02 = c37675GiC;
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
        this.A03 = c15370ps;
        this.A04 = z;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        this.A02.A0b.Dm3(this.A00, this.A01, (String) this.A03.A00, true, this.A04);
    }
}
