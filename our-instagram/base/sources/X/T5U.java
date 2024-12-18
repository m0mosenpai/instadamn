package X;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes10.dex */
public final class T5U implements InterfaceC65586TnQ {
    public final C64225T5a A00;

    public T5U(C64225T5a c64225T5a) {
        this.A00 = c64225T5a;
    }

    @Override // X.InterfaceC65586TnQ
    public final void FF2() {
    }

    @Override // X.InterfaceC65586TnQ
    public final void FF8(Bundle bundle) {
    }

    @Override // X.InterfaceC65586TnQ
    public final void FF9(ConnectionResult connectionResult, C61W c61w, boolean z) {
    }

    @Override // X.InterfaceC65586TnQ
    public final AbstractC60658RGk FEy(AbstractC60658RGk abstractC60658RGk) {
        try {
            C64225T5a c64225T5a = this.A00;
            C60650RGb c60650RGb = c64225T5a.A05;
            SWF swf = c60650RGb.A09;
            swf.A01.add(abstractC60658RGk);
            abstractC60658RGk.A0B.set(swf.A00);
            C61S c61s = abstractC60658RGk.A00;
            InterfaceC1340663q interfaceC1340663q = (InterfaceC1340663q) c60650RGb.A0D.get(c61s);
            C3U5.A03(interfaceC1340663q, "Appropriate Api was not requested.");
            if (!interfaceC1340663q.isConnected() && c64225T5a.A0A.containsKey(c61s)) {
                abstractC60658RGk.A0A(new Status(17, null));
                return abstractC60658RGk;
            }
            abstractC60658RGk.A09(interfaceC1340663q);
            return abstractC60658RGk;
        } catch (DeadObjectException unused) {
            C64225T5a c64225T5a2 = this.A00;
            AbstractC166997dE.A1H(c64225T5a2.A06, new C60661RGp(this, this), 1);
            return abstractC60658RGk;
        }
    }

    @Override // X.InterfaceC65586TnQ
    public final void FF5() {
    }

    @Override // X.InterfaceC65586TnQ
    public final void FFA(int i) {
        C64225T5a c64225T5a = this.A00;
        c64225T5a.A00(null);
        c64225T5a.A07.FF1(i, false);
    }

    @Override // X.InterfaceC65586TnQ
    public final boolean FFB() {
        this.A00.A00(null);
        return true;
    }

    @Override // X.InterfaceC65586TnQ
    public final AbstractC60658RGk FEv(AbstractC60658RGk abstractC60658RGk) {
        FEy(abstractC60658RGk);
        return abstractC60658RGk;
    }
}
