package X;

import android.os.SystemClock;

/* renamed from: X.Gq5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38138Gq5 implements InterfaceC12870lZ {
    public long A00;
    public final /* synthetic */ C38137Gq4 A01;

    public C38138Gq5(C38137Gq4 c38137Gq4) {
        this.A01 = c38137Gq4;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1660027797);
        this.A00 = SystemClock.elapsedRealtime();
        C0f9.A0A(-1837348114, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-506824253);
        C38137Gq4 c38137Gq4 = this.A01;
        if (AbstractC25231BEo.A1b(c38137Gq4.A09) && SystemClock.elapsedRealtime() - this.A00 >= 1200000) {
            c38137Gq4.A08.invoke();
        }
        C0f9.A0A(95900757, A03);
    }
}
