package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public final class Wx7 implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C70569Wd3 A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public Wx7(Fragment fragment, C70569Wd3 c70569Wd3, boolean z, boolean z2) {
        this.A01 = c70569Wd3;
        this.A00 = fragment;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C70569Wd3 c70569Wd3 = this.A01;
        if (C18U.A06(C06090Tz.A06, c70569Wd3.A0F, 36327237116967336L)) {
            c70569Wd3.A01();
        }
        c70569Wd3.A04(this.A00, this.A02, this.A03);
    }
}
