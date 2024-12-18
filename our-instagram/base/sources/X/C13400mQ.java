package X;

import android.os.Handler;

/* renamed from: X.0mQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13400mQ {
    public InterfaceC13360mM A00;
    public Object A01;
    public boolean A02;
    public final long A04;
    public final Handler A05;
    public final InterfaceC13380mO A06;
    public final Runnable A07 = new Runnable() { // from class: X.0mP
        @Override // java.lang.Runnable
        public final void run() {
            C13400mQ c13400mQ = C13400mQ.this;
            c13400mQ.A02 = false;
            Object obj = c13400mQ.A01;
            if (obj != null) {
                c13400mQ.A06.onDebouncedValue(obj);
            }
        }
    };
    public boolean A03 = true;

    public C13400mQ(Handler handler, InterfaceC13380mO interfaceC13380mO, long j) {
        this.A05 = handler;
        this.A06 = interfaceC13380mO;
        this.A04 = j;
    }

    public final void A00() {
        this.A05.removeCallbacks(this.A07);
        this.A02 = false;
        InterfaceC13360mM interfaceC13360mM = this.A00;
        if (interfaceC13360mM != null) {
            interfaceC13360mM.onCancel();
        }
    }

    public boolean A01(Object obj) {
        if (this.A03 && C14360o3.A0K(obj, this.A01)) {
            return false;
        }
        Handler handler = this.A05;
        Runnable runnable = this.A07;
        handler.removeCallbacks(runnable);
        this.A01 = obj;
        long j = this.A04;
        if (j == 0) {
            handler.post(runnable);
        } else {
            handler.postDelayed(runnable, j);
        }
        this.A02 = true;
        return true;
    }
}
