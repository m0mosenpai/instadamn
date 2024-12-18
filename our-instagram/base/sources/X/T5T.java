package X;

import com.google.android.gms.internal.location.zzal;
import com.google.android.gms.internal.location.zzas;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.zzaf;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T5T implements InterfaceC65406Tjd {
    public boolean A00;
    public final /* synthetic */ SGK A01;
    public final /* synthetic */ RGW A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public T5T(SGK sgk, RGW rgw) {
        this();
        this.A02 = rgw;
        this.A01 = sgk;
    }

    @Override // X.InterfaceC65406Tjd
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        RHG rhg = (RHG) obj;
        C58411Pup c58411Pup = (C58411Pup) obj2;
        if (this.A00) {
            zzaf zzafVar = new zzaf(c58411Pup);
            try {
                SNO sno = this.A01.A01;
                SIR sir = rhg.A00;
                RHG rhg2 = ((T67) sir.A00).A00;
                rhg2.A07();
                C3U5.A03(sno, "Invalid null listener key");
                Map map = sir.A03;
                synchronized (map) {
                    zzas zzasVar = (zzas) map.remove(sno);
                    if (zzasVar != null) {
                        synchronized (zzasVar) {
                            int A03 = C0f9.A03(-800739121);
                            SGK sgk = zzasVar.A00;
                            sgk.A02 = null;
                            sgk.A01 = null;
                            C0f9.A0A(1651640789, A03);
                        }
                        ((zzal) rhg2.A03()).FFg(new zzbe(null, null, zzasVar.asBinder(), zzafVar.asBinder(), null, 2));
                    }
                }
            } catch (RuntimeException e) {
                c58411Pup.A02(e);
            }
        }
    }

    public T5T() {
        this.A00 = true;
    }
}
