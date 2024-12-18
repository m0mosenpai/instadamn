package X;

import X.AbstractC61588RqC;
import X.C0f9;
import X.C58411Pup;
import X.C64257T6g;
import X.InterfaceC65264Tgu;
import X.RGW;
import X.S2N;
import X.T5T;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.location.zzac;
import com.google.android.gms.internal.location.zzah;
import com.google.android.gms.internal.location.zzal;
import com.google.android.gms.internal.location.zzas;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RGW extends C61Q {
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, X.SIP] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.internal.location.zzbc, java.lang.Object] */
    public final C5KS A00(Looper looper, final AbstractC61588RqC abstractC61588RqC, LocationRequest locationRequest) {
        List list = zzbc.A0B;
        final ?? obj = new Object();
        obj.A01 = locationRequest;
        obj.A05 = list;
        obj.A02 = null;
        obj.A06 = false;
        obj.A07 = false;
        obj.A08 = false;
        obj.A03 = null;
        obj.A09 = false;
        obj.A0A = false;
        obj.A04 = null;
        obj.A00 = Long.MAX_VALUE;
        if (looper == null) {
            C3U5.A09(AbstractC167007dF.A1W(Looper.myLooper()), "Can't create handler inside thread that has not called Looper.prepare()");
            looper = Looper.myLooper();
        }
        C3U5.A03(abstractC61588RqC, "Listener must not be null");
        C3U5.A03(looper, "Looper must not be null");
        final SGK sgk = new SGK(looper, abstractC61588RqC);
        final T5T t5t = new T5T(sgk, this);
        InterfaceC65406Tjd interfaceC65406Tjd = new InterfaceC65406Tjd(sgk, obj, this, abstractC61588RqC, t5t) { // from class: X.T5R
            public final SGK A00;
            public final zzbc A01;
            public final RGW A02;
            public final AbstractC61588RqC A03;
            public final T5T A04;

            {
                this.A02 = this;
                this.A04 = t5t;
                this.A03 = abstractC61588RqC;
                this.A01 = obj;
                this.A00 = sgk;
            }

            @Override // X.InterfaceC65406Tjd
            public final void accept(Object obj2, Object obj3) {
                zzas zzasVar;
                RGW rgw = this.A02;
                T5T t5t2 = this.A04;
                AbstractC61588RqC abstractC61588RqC2 = this.A03;
                zzbc zzbcVar = this.A01;
                SGK sgk2 = this.A00;
                final C58411Pup c58411Pup = (C58411Pup) obj3;
                final C64257T6g c64257T6g = new C64257T6g(rgw, abstractC61588RqC2, t5t2);
                zzah zzahVar = new zzah(c64257T6g, c58411Pup) { // from class: com.google.android.gms.location.FusedLocationProviderClient$zzb
                    public final C58411Pup A00;
                    public final InterfaceC65264Tgu A01;

                    {
                        int A03 = C0f9.A03(1744802708);
                        this.A00 = c58411Pup;
                        C0f9.A0A(1560599061, A03);
                        int A032 = C0f9.A03(1020269424);
                        this.A01 = c64257T6g;
                        C0f9.A0A(904708280, A032);
                    }

                    @Override // com.google.android.gms.internal.location.zzai
                    public final void A71() {
                        int A03 = C0f9.A03(-1559989382);
                        C64257T6g c64257T6g2 = (C64257T6g) this.A01;
                        RGW rgw2 = c64257T6g2.A00;
                        T5T t5t3 = c64257T6g2.A02;
                        AbstractC61588RqC abstractC61588RqC3 = c64257T6g2.A01;
                        t5t3.A00 = false;
                        rgw2.A01(abstractC61588RqC3);
                        C0f9.A0A(252527792, A03);
                    }

                    @Override // com.google.android.gms.internal.location.zzai
                    public final void FFf(zzac zzacVar) {
                        int A03 = C0f9.A03(2113736705);
                        S2N.A00(zzacVar.A00, this.A00, null);
                        C0f9.A0A(1153961194, A03);
                    }
                };
                zzbcVar.A04 = rgw.A08;
                SIR sir = ((RHG) obj2).A00;
                synchronized (sir) {
                    RHG rhg = ((T67) sir.A00).A00;
                    rhg.A07();
                    SNO sno = sgk2.A01;
                    if (sno != null) {
                        Map map = sir.A03;
                        synchronized (map) {
                            zzasVar = (zzas) map.get(sno);
                            if (zzasVar == null) {
                                zzasVar = new zzas(sgk2);
                            }
                            map.put(sno, zzasVar);
                        }
                        ((zzal) rhg.A03()).FFg(new zzbe(null, null, zzasVar.asBinder(), zzahVar.asBinder(), zzbcVar, 1));
                    }
                }
            }
        };
        ?? obj2 = new Object();
        obj2.A03 = RunnableC64719TRa.A00;
        obj2.A04 = true;
        obj2.A01 = interfaceC65406Tjd;
        obj2.A02 = t5t;
        obj2.A00 = sgk;
        SNO sno = sgk.A01;
        C3U5.A03(sno, "Key must not be null");
        SGN sgn = new SGN(obj2.A00, obj2, obj2.A04);
        SEQ seq = new SEQ(sno, obj2);
        Runnable runnable = obj2.A03;
        C3U5.A03(sgn.A00.A01, "Listener has already been released.");
        C3U5.A03(seq.A00, "Listener has already been released.");
        C1335961f c1335961f = this.A07;
        C58411Pup c58411Pup = new C58411Pup();
        C1335961f.A05(this, c1335961f, c58411Pup, 0);
        AbstractC166997dE.A1H(c1335961f.A06, new SGL(this, new C60667RGv(new SGM(sgn, seq, runnable), c58411Pup), c1335961f.A0C.get()), 8);
        return c58411Pup.A00;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.61b] */
    public RGW(Context context) {
        super(context, (C61X) null, LocationServices.A00, new C61Z(Looper.getMainLooper(), new Object()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.Tju, java.lang.Object] */
    public final void A01(AbstractC61588RqC abstractC61588RqC) {
        C3U5.A03(abstractC61588RqC, "Listener must not be null");
        C3U5.A06("LocationCallback", "Listener type must not be empty");
        SNO sno = new SNO(abstractC61588RqC);
        C1335961f c1335961f = this.A07;
        C58411Pup c58411Pup = new C58411Pup();
        AbstractC166997dE.A1H(c1335961f.A06, new SGL(this, new C60668RGw(sno, c58411Pup), c1335961f.A0C.get()), 13);
        c58411Pup.A00.A02(new Object(), AbstractC58437PvG.A00);
    }
}
