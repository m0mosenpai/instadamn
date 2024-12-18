package X;

import android.os.Handler;

/* renamed from: X.YBi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73396YBi implements InterfaceC176157sY {
    public final Handler A00;
    public final AbstractC223559ty A01;
    public final InterfaceC176157sY A02;
    public final Runnable A03;

    @Override // X.InterfaceC176157sY
    public final void DE8(AbstractC223559ty abstractC223559ty) {
        Handler handler = this.A00;
        Runnable runnable = this.A03;
        if (handler.hasCallbacks(runnable)) {
            handler.removeCallbacks(runnable);
            AD8.A00(handler, abstractC223559ty, this.A02);
        }
    }

    @Override // X.InterfaceC176157sY
    public final void onSuccess() {
        Handler handler = this.A00;
        Runnable runnable = this.A03;
        if (handler.hasCallbacks(runnable)) {
            handler.removeCallbacks(runnable);
            AD8.A01(this.A02, handler);
        }
    }

    public C73396YBi(Handler handler, AbstractC223559ty abstractC223559ty, InterfaceC176157sY interfaceC176157sY, int i) {
        YGN ygn = new YGN(this);
        this.A03 = ygn;
        this.A02 = interfaceC176157sY;
        this.A00 = handler;
        this.A01 = abstractC223559ty;
        handler.postDelayed(ygn, i);
    }

    public final Handler A00() {
        return this.A00;
    }
}
