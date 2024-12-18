package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7xE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179027xE implements InterfaceC179037xF {
    public C179027xE A00;
    public C179027xE A01;
    public final Handler A02;
    public final C178747wm A03;
    public final InterfaceC178407wE A04;
    public final C178907x2 A05;
    public final C179047xG A06;
    public final C179057xH A07;

    public C179027xE(C178747wm c178747wm, C178907x2 c178907x2, C179047xG c179047xG, C179057xH c179057xH) {
        this.A03 = c178747wm;
        this.A05 = c178907x2;
        this.A02 = c178907x2.A00;
        this.A06 = c179047xG;
        this.A07 = c179057xH;
        this.A04 = null;
    }

    @Override // X.InterfaceC179037xF
    public final int B9y(int i) {
        C179377xn c179377xn = (C179377xn) this.A07.A00.get(0);
        if (c179377xn != null) {
            return c179377xn.A06.A00.size();
        }
        return 0;
    }

    @Override // X.InterfaceC179037xF
    public final List B9z(int i) {
        C179377xn c179377xn = (C179377xn) this.A07.A00.get(0);
        if (c179377xn != null) {
            return c179377xn.A06.A00;
        }
        throw new RuntimeException(AnonymousClass001.A0O("GlOutput not set ", 0));
    }

    @Override // X.InterfaceC179037xF
    public final void A8h(InterfaceC179437xt interfaceC179437xt, int i) {
        C179057xH c179057xH = this.A07;
        C178907x2 c178907x2 = this.A05;
        C179057xH.A00(c178907x2, c179057xH, i).A02(c178907x2, interfaceC179437xt);
        InterfaceC178407wE interfaceC178407wE = this.A04;
        if (interfaceC178407wE != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("output_index", String.valueOf(i));
            hashMap.put("output_class", interfaceC179437xt.getClass().getSimpleName());
            interfaceC178407wE.CkX(hashCode(), "media_pipeline_add_output", "MediaGraphIOImpl", hashMap);
        }
    }

    @Override // X.InterfaceC179037xF
    public final /* bridge */ /* synthetic */ C179027xE BET() {
        C179027xE c179027xE = this.A00;
        if (c179027xE == null) {
            C178747wm c178747wm = this.A03;
            C179027xE c179027xE2 = new C179027xE(c178747wm, this.A05, this.A06, new C179057xH(c178747wm));
            this.A00 = c179027xE2;
            return c179027xE2;
        }
        return c179027xE;
    }

    @Override // X.InterfaceC179037xF
    public final /* bridge */ /* synthetic */ C179027xE BEU() {
        C179027xE c179027xE = this.A01;
        if (c179027xE == null) {
            C179027xE c179027xE2 = new C179027xE(this.A03, this.A05, new C179047xG(), this.A07);
            this.A01 = c179027xE2;
            return c179027xE2;
        }
        return c179027xE;
    }

    @Override // X.InterfaceC179037xF
    public final InterfaceC1809480w BHv(int i) {
        InterfaceC1809480w interfaceC1809480w = (InterfaceC1809480w) this.A06.A00.get(i);
        if (interfaceC1809480w != null) {
            return interfaceC1809480w;
        }
        throw new RuntimeException(AnonymousClass001.A0O("input not set ", i));
    }

    @Override // X.InterfaceC179037xF
    public final Object BHy(int i) {
        InterfaceC1809480w interfaceC1809480w = (InterfaceC1809480w) this.A06.A00.get(i);
        if (interfaceC1809480w != null) {
            return interfaceC1809480w.BHx();
        }
        throw new RuntimeException(AnonymousClass001.A0O("input not set ", i));
    }

    @Override // X.InterfaceC179037xF
    public final boolean CWg(int i) {
        if (this.A06.A00.get(i) == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC179037xF
    public final void EFO(int i, Object obj) {
        C179377xn c179377xn = (C179377xn) this.A07.A00.get(i);
        if (c179377xn != null) {
            c179377xn.A04(obj);
        }
        InterfaceC178407wE interfaceC178407wE = this.A04;
        if (interfaceC178407wE != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("output_index", String.valueOf(i));
            interfaceC178407wE.CkX(hashCode(), "media_pipeline_remove_output", "MediaGraphIOImpl", hashMap);
        }
    }

    @Override // X.InterfaceC179037xF
    public final void EWA(final InterfaceC1809480w interfaceC1809480w, final int i) {
        final C179047xG c179047xG = this.A06;
        final C178907x2 c178907x2 = this.A05;
        Handler handler = this.A02;
        if (c179047xG.A00.get(i) != interfaceC1809480w) {
            if (handler.getLooper() == Looper.myLooper()) {
                C179047xG.A00(c178907x2, interfaceC1809480w, c179047xG, i);
            } else {
                handler.post(new Runnable() { // from class: X.8rp
                    @Override // java.lang.Runnable
                    public final void run() {
                        C179047xG c179047xG2 = c179047xG;
                        C179047xG.A00(c178907x2, interfaceC1809480w, c179047xG2, i);
                    }
                });
            }
        }
        InterfaceC178407wE interfaceC178407wE = this.A04;
        if (interfaceC178407wE != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("input_index", String.valueOf(i));
            interfaceC178407wE.CkX(hashCode(), "media_pipeline_add_input", "MediaGraphIOImpl", hashMap);
        }
    }

    public C179027xE(C178747wm c178747wm, InterfaceC178407wE interfaceC178407wE, C178907x2 c178907x2) {
        C179047xG c179047xG = new C179047xG();
        C179057xH c179057xH = new C179057xH(c178747wm);
        this.A03 = c178747wm;
        this.A05 = c178907x2;
        this.A02 = c178907x2.A00;
        this.A06 = c179047xG;
        this.A07 = c179057xH;
        this.A04 = interfaceC178407wE;
    }
}
