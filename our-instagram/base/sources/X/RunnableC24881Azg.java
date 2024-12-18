package X;

import android.graphics.Bitmap;

/* renamed from: X.Azg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24881Azg implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C8MV A02;
    public final /* synthetic */ A5Y A03;
    public final /* synthetic */ ACA A04;
    public final /* synthetic */ Integer A05;

    public RunnableC24881Azg(Bitmap bitmap, InterfaceC11380iw interfaceC11380iw, C8MV c8mv, A5Y a5y, ACA aca, Integer num) {
        this.A02 = c8mv;
        this.A03 = a5y;
        this.A04 = aca;
        this.A01 = interfaceC11380iw;
        this.A05 = num;
        this.A00 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8MV c8mv = this.A02;
        A5Y a5y = this.A03;
        AH3 A00 = AH3.A00(this.A04);
        c8mv.A05(this.A00, this.A01, null, a5y, A00, this.A05, true);
    }
}
