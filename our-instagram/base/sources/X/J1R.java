package X;

import android.view.View;

/* loaded from: classes7.dex */
public final class J1R implements InterfaceC147206jw {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ C148536mO A02;

    @Override // X.InterfaceC147206jw
    public final void DZf() {
    }

    public J1R(View view, C84823qW c84823qW, C148536mO c148536mO) {
        this.A02 = c148536mO;
        this.A01 = c84823qW;
        this.A00 = view;
    }

    @Override // X.InterfaceC147206jw
    public final void DZe() {
        this.A02.A08.Ddn(this.A01);
    }

    @Override // X.InterfaceC147206jw
    public final void onClick() {
        this.A02.A08.DZg(this.A00, this.A01);
    }
}
