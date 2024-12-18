package X;

import android.os.Handler;

/* renamed from: X.Tsd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65705Tsd implements C07X {
    public static final C65705Tsd A08 = new C65705Tsd();
    public int A00;
    public int A01;
    public Handler A02;
    public boolean A03 = true;
    public boolean A04 = true;
    public final C0eR A05 = new C0eR(this);
    public final Runnable A07 = new Runnable() { // from class: X.Tse
        @Override // java.lang.Runnable
        public final void run() {
            C65705Tsd c65705Tsd = C65705Tsd.this;
            C65705Tsd c65705Tsd2 = C65705Tsd.A08;
            if (c65705Tsd.A00 == 0) {
                c65705Tsd.A03 = true;
                c65705Tsd.A05.A0B(C07R.ON_PAUSE);
            }
            if (c65705Tsd.A01 == 0 && c65705Tsd.A03) {
                c65705Tsd.A05.A0B(C07R.ON_STOP);
                c65705Tsd.A04 = true;
            }
        }
    };
    public final InterfaceC71835X6s A06 = new C65707Tsf(this);

    public static final C65705Tsd A00() {
        return A08;
    }

    public final void A01() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 1) {
            if (this.A03) {
                this.A05.A0B(C07R.ON_RESUME);
                this.A03 = false;
            } else {
                Handler handler = this.A02;
                C14360o3.A0A(handler);
                handler.removeCallbacks(this.A07);
            }
        }
    }

    public final void A02() {
        int i = this.A01 + 1;
        this.A01 = i;
        if (i == 1 && this.A04) {
            this.A05.A0B(C07R.ON_START);
            this.A04 = false;
        }
    }

    @Override // X.C07X
    public final C07T getLifecycle() {
        return this.A05;
    }
}
