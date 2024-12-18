package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AZn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23414AZn implements InterfaceC25203BDb {
    public final /* synthetic */ InterfaceC25203BDb A00;
    public final /* synthetic */ C176117sU A01;
    public final /* synthetic */ String A02;

    public C23414AZn(InterfaceC25203BDb interfaceC25203BDb, C176117sU c176117sU, String str) {
        this.A01 = c176117sU;
        this.A02 = str;
        this.A00 = interfaceC25203BDb;
    }

    @Override // X.InterfaceC25203BDb
    public final void D2K(C212409b9 c212409b9) {
        C176117sU c176117sU = this.A01;
        InterfaceC178407wE B4Z = c176117sU.A03.B4Z();
        long A0M = AbstractC166987dD.A0M(this);
        String str = this.A02;
        AbstractC167007dF.A1F(str, 3, c212409b9);
        String str2 = c212409b9.A00;
        if (str2 == null) {
            str2 = "medium";
        }
        B4Z.ClA(c212409b9, "recording_failed", "RecordingControllerImpl", str, str2, "RecordingControllerImpl", A0M);
        B4Z.DEV(19);
        c176117sU.A01();
        c176117sU.A05.set(false);
        this.A00.D2K(c212409b9);
    }

    @Override // X.InterfaceC25203BDb
    public final void D2M() {
        C176117sU c176117sU = this.A01;
        InterfaceC178407wE B4Z = c176117sU.A03.B4Z();
        long A0M = AbstractC166987dD.A0M(this);
        String str = this.A02;
        C176097sS c176097sS = c176117sU.A04;
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator A16 = AbstractC166997dE.A16(c176097sS.A05);
        while (A16.hasNext()) {
            Map BjN = ((InterfaceC176187sb) A16.next()).BjN();
            if (BjN != null) {
                A1G.putAll(BjN);
            }
        }
        C14360o3.A0B(str, 3);
        B4Z.ClB("recording_finished", "RecordingControllerImpl", str, A1G, A0M);
        B4Z.DEW(19);
        c176117sU.A05.set(false);
        this.A00.D2M();
    }

    @Override // X.InterfaceC25203BDb
    public final void D2S(long j) {
        C176117sU c176117sU = this.A01;
        InterfaceC178407wE B4Z = c176117sU.A03.B4Z();
        long A0M = AbstractC166987dD.A0M(this);
        String str = this.A02;
        C176097sS c176097sS = c176117sU.A04;
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator A16 = AbstractC166997dE.A16(c176097sS.A05);
        while (A16.hasNext()) {
            Map AqD = ((InterfaceC176187sb) A16.next()).AqD();
            if (AqD != null) {
                A1G.putAll(AqD);
            }
        }
        C14360o3.A0B(str, 3);
        B4Z.ClB("recording_started", "RecordingControllerImpl", str, A1G, A0M);
        this.A00.D2S(j);
    }

    @Override // X.InterfaceC25203BDb
    public final long now() {
        return this.A00.now();
    }
}
