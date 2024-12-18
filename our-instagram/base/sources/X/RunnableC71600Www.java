package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Www, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71600Www implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ InterfaceC72028XFq A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public RunnableC71600Www(Fragment fragment, InterfaceC72028XFq interfaceC72028XFq, boolean z, boolean z2) {
        this.A01 = interfaceC72028XFq;
        this.A00 = fragment;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.ES3(this.A00, this.A02, this.A03);
    }
}
