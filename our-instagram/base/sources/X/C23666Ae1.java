package X;

import android.os.Handler;

/* renamed from: X.Ae1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23666Ae1 implements InterfaceC25177BCa {
    public final /* synthetic */ C218069ke A00;
    public final /* synthetic */ String A01;

    @Override // X.InterfaceC25177BCa
    public final void DZL() {
    }

    public C23666Ae1(C218069ke c218069ke, String str) {
        this.A00 = c218069ke;
        this.A01 = str;
    }

    @Override // X.InterfaceC25177BCa
    public final void DQ0() {
        C218069ke c218069ke = this.A00;
        String str = this.A01;
        if (c218069ke.A04 && c218069ke.A02.equals(str)) {
            Handler handler = c218069ke.A0B;
            Runnable runnable = c218069ke.A0I;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 200L);
        }
    }
}
