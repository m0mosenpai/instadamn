package X;

import android.content.Context;

/* renamed from: X.AYi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23384AYi implements InterfaceC178207vu, InterfaceC25218BDs {
    public final C174887qO A00 = new C174887qO();
    public final InterfaceC178197vt A01;

    @Override // X.InterfaceC178207vu
    public final InterfaceC178067vf Aq0(C178087vh c178087vh) {
        C14360o3.A0B(c178087vh, 0);
        return this.A01.Aq0(c178087vh);
    }

    @Override // X.InterfaceC178207vu
    public final InterfaceC178287w2 Aq1(C178307w4 c178307w4) {
        C14360o3.A0B(c178307w4, 0);
        return this.A01.Aq1(c178307w4);
    }

    @Override // X.InterfaceC178207vu
    public final Object AqG(C178037vc c178037vc) {
        C14360o3.A0B(c178037vc, 0);
        return this.A01.AqG(c178037vc);
    }

    @Override // X.InterfaceC178207vu
    public final boolean CRY(C178087vh c178087vh) {
        C14360o3.A0B(c178087vh, 0);
        return this.A01.CRY(c178087vh);
    }

    @Override // X.InterfaceC178207vu
    public final boolean CRZ(C178307w4 c178307w4) {
        C14360o3.A0B(c178307w4, 0);
        return this.A01.CRZ(c178307w4);
    }

    @Override // X.InterfaceC25218BDs
    public final synchronized void EKd() {
        this.A01.AJP(new C177267uM(this.A00));
    }

    @Override // X.InterfaceC25218BDs
    public final void ERx(C177257uL c177257uL, Object obj) {
        C14360o3.A0B(c177257uL, 0);
        this.A00.A00.put(c177257uL, obj);
    }

    @Override // X.InterfaceC25218BDs
    public final synchronized void destroy() {
        this.A01.release();
    }

    @Override // X.InterfaceC25218BDs
    public final synchronized void pause() {
        this.A01.disconnect();
    }

    @Override // X.InterfaceC25218BDs
    public final void ACs(String str) {
        if (((C178187vs) this.A01).A07 != 0) {
        } else {
            throw AbstractC166987dD.A14(str);
        }
    }

    @Override // X.InterfaceC178207vu
    public final Object AqF(C177257uL c177257uL) {
        throw AbstractC166987dD.A14("ConnectConfigurationKey not supported!");
    }

    @Override // X.InterfaceC178207vu
    public final Context getContext() {
        Context context = this.A01.getContext();
        C14360o3.A07(context);
        return context;
    }

    public C23384AYi(InterfaceC178197vt interfaceC178197vt) {
        this.A01 = interfaceC178197vt;
    }
}
