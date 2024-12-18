package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.List;

/* renamed from: X.7wk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178727wk extends AbstractC178657wd implements InterfaceC178737wl {
    public static final String A0V = C175487rO.class.getSimpleName();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public InterfaceC178817wt A08;
    public InterfaceC179447xu A09;
    public InterfaceC1809180t A0A;
    public InterfaceC1809280u A0B;
    public InterfaceC178677wf A0C;
    public InterfaceC175577rX A0D;
    public InterfaceC178337w7 A0E;
    public InterfaceC178297w3 A0F;
    public C176307sn A0G;
    public InterfaceC176297sm A0H;
    public boolean A0I;
    public boolean A0J;
    public final Handler A0K;
    public final Handler A0L;
    public final C178747wm A0M;
    public final InterfaceC178407wE A0N;
    public final C1814082s A0O;
    public final InterfaceC175547rU A0P;
    public final boolean A0Q;
    public final C175487rO A0R;
    public volatile InterfaceC175597rZ A0S;
    public volatile boolean A0T;
    public volatile C176507t8 A0U;

    public static void A00(C178727wk c178727wk) {
        A04(c178727wk, null);
        C178087vh c178087vh = InterfaceC179867yc.A00;
        if (((AbstractC178657wd) c178727wk).A00.CRY(c178087vh)) {
            InterfaceC179867yc interfaceC179867yc = (InterfaceC179867yc) c178727wk.A0A(c178087vh);
            InterfaceC178677wf interfaceC178677wf = c178727wk.A0C;
            if (interfaceC178677wf == null) {
                interfaceC178677wf = new AZY(c178727wk);
                c178727wk.A0C = interfaceC178677wf;
            }
            interfaceC179867yc.EG8(interfaceC178677wf);
        }
        InterfaceC175597rZ interfaceC175597rZ = c178727wk.A0S;
        if (interfaceC175597rZ != null) {
            interfaceC175597rZ.stop();
        }
    }

    @Override // X.InterfaceC178737wl
    public final boolean ECL() {
        return false;
    }

    public static void A01(final C178727wk c178727wk) {
        C178087vh c178087vh = InterfaceC179867yc.A00;
        if (((AbstractC178657wd) c178727wk).A00.CRY(c178087vh)) {
            InterfaceC179867yc interfaceC179867yc = (InterfaceC179867yc) c178727wk.A0A(c178087vh);
            InterfaceC178677wf interfaceC178677wf = c178727wk.A0C;
            if (interfaceC178677wf == null) {
                interfaceC178677wf = new AZY(c178727wk);
                c178727wk.A0C = interfaceC178677wf;
            }
            interfaceC179867yc.A9y(interfaceC178677wf);
        }
        InterfaceC175597rZ interfaceC175597rZ = c178727wk.A0S;
        if (interfaceC175597rZ != null) {
            InterfaceC175577rX interfaceC175577rX = c178727wk.A0D;
            if (interfaceC175577rX == null) {
                interfaceC175577rX = new InterfaceC175577rX() { // from class: X.7sx
                    @Override // X.InterfaceC175577rX
                    public final void EGZ(Long l) {
                        C178727wk c178727wk2 = C178727wk.this;
                        c178727wk2.A08.EGZ(null);
                        InterfaceC175597rZ interfaceC175597rZ2 = c178727wk2.A0S;
                        if (interfaceC175597rZ2 != null) {
                            interfaceC175597rZ2.DII();
                        }
                    }
                };
                c178727wk.A0D = interfaceC175577rX;
            }
            interfaceC175597rZ.Emi(interfaceC175577rX);
        }
    }

    public static void A03(C178727wk c178727wk) {
        int i;
        int i2;
        int i3;
        InterfaceC1809180t interfaceC1809180t;
        int i4;
        int i5 = c178727wk.A03;
        if (i5 != 0 && (i = c178727wk.A02) != 0 && (i2 = c178727wk.A05) != 0 && (i3 = c178727wk.A04) != 0 && (interfaceC1809180t = c178727wk.A0A) != null) {
            int i6 = i5;
            if (c178727wk.A07 % 180 != 0) {
                i6 = i;
                i = i5;
            }
            int i7 = c178727wk.A06;
            int i8 = i2;
            int i9 = i3;
            if (i7 % 180 != 0) {
                i8 = i3;
                i9 = i2;
            }
            if (c178727wk.A0I) {
                i4 = c178727wk.A01;
            } else {
                i4 = 0;
            }
            C179407xq FBE = interfaceC1809180t.FBE(i6, i, i8, i9, i7, i4, c178727wk.A00, c178727wk.A0J);
            C176507t8 c176507t8 = c178727wk.A0U;
            if (c176507t8 != null) {
                c176507t8.A06 = c178727wk.A06;
            }
            int i10 = 0;
            c178727wk.A08.FBm(0, FBE.A01, FBE.A00, c178727wk.A0J, i2, i3);
            int i11 = c178727wk.A05;
            int i12 = c178727wk.A04;
            int i13 = c178727wk.A06;
            if (c178727wk.A0I) {
                i10 = c178727wk.A01;
            }
            boolean z = c178727wk.A0J;
            if (i11 != 0 && i12 != 0) {
                List list = c178727wk.A0O.A00;
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((InterfaceC175477rN) list.get(i14)).DX9(i11, i12, i13, i10, z);
                }
            }
        }
    }

    public static void A04(C178727wk c178727wk, C176507t8 c176507t8) {
        C176527tA c176527tA;
        C176507t8 c176507t82 = c178727wk.A0U;
        if (c176507t82 != null && c176507t82 != c176507t8) {
            c178727wk.EG3(c176507t82);
        }
        c178727wk.A0U = c176507t8;
        if (c176507t8 != null) {
            boolean z = false;
            InterfaceC178337w7 interfaceC178337w7 = c178727wk.A0E;
            if (interfaceC178337w7 != null) {
                z = interfaceC178337w7.CUZ(132);
            }
            AwakeTimeSinceBootClock awakeTimeSinceBootClock = null;
            if (z) {
                c176527tA = new C176527tA(c178727wk);
            } else {
                c176527tA = null;
            }
            C178747wm c178747wm = c178727wk.A0M;
            boolean z2 = false;
            InterfaceC178337w7 interfaceC178337w72 = c178727wk.A0E;
            if (interfaceC178337w72 != null) {
                z2 = interfaceC178337w72.CUZ(133);
            }
            InterfaceC178407wE interfaceC178407wE = c178727wk.A0N;
            if (interfaceC178407wE != null) {
                awakeTimeSinceBootClock = interfaceC178407wE.BUp();
            }
            C176517t9 c176517t9 = new C176517t9(awakeTimeSinceBootClock, c178747wm, c176527tA, c176507t8, z2);
            if (c178727wk.A0T) {
                c176517t9.A01 = 3;
            }
            c176517t9.A09 = true;
            c178727wk.A08.BQq().A8h(c176517t9, 0);
        }
    }

    @Override // X.AbstractC178227vw
    public final void A09() {
        InterfaceC178337w7 interfaceC178337w7;
        C178307w4 c178307w4 = InterfaceC178337w7.A00;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC178657wd) this).A00;
        if (interfaceC178207vu.CRZ(c178307w4)) {
            interfaceC178337w7 = (InterfaceC178337w7) interfaceC178207vu.Aq1(c178307w4);
        } else {
            interfaceC178337w7 = null;
        }
        this.A0E = interfaceC178337w7;
        this.A0F = (InterfaceC178297w3) interfaceC178207vu.Aq1(InterfaceC178297w3.A00);
        this.A08 = (InterfaceC178817wt) A0A(InterfaceC178817wt.A01);
        this.A0S = ((InterfaceC178787wq) A0A(InterfaceC178787wq.A00)).Bma();
    }

    public final void A0C(InterfaceC175517rR interfaceC175517rR) {
        C177107u6 c177107u6 = new C177107u6(interfaceC175517rR, new C179387xo());
        if (this.A0L.getLooper() == Looper.myLooper()) {
            this.A09 = c177107u6;
            InterfaceC1809280u interfaceC1809280u = this.A0B;
            if (interfaceC1809280u == null) {
                interfaceC1809280u = new InterfaceC1809280u() { // from class: X.7u7
                    @Override // X.InterfaceC1809280u
                    public final void DIE() {
                        InterfaceC175597rZ interfaceC175597rZ = C178727wk.this.A0S;
                        if (interfaceC175597rZ != null) {
                            interfaceC175597rZ.DIE();
                        }
                    }
                };
                this.A0B = interfaceC1809280u;
            }
            c177107u6.EZr(interfaceC1809280u);
            this.A0A = c177107u6;
            this.A08.BQq().EWA(new C1809380v(this.A0M, this.A09, false), 0);
            return;
        }
        throw new IllegalStateException("getInputTextureId() must be called at SurfacePipe thread.");
    }

    @Override // X.InterfaceC178737wl
    public final void A9p(C176507t8 c176507t8) {
        C178747wm c178747wm = this.A0M;
        boolean z = false;
        InterfaceC178337w7 interfaceC178337w7 = this.A0E;
        if (interfaceC178337w7 != null) {
            z = interfaceC178337w7.CUZ(133);
        }
        C176517t9 c176517t9 = new C176517t9(null, c178747wm, null, c176507t8, z);
        if (this.A0T) {
            c176517t9.A00 = 7;
            c176517t9.A01 = 7;
        }
        c176517t9.A09 = true;
        this.A08.BQq().A8h(c176517t9, 0);
    }

    @Override // X.InterfaceC178737wl
    public final void AAS(InterfaceC175477rN interfaceC175477rN) {
        int i;
        if (this.A0O.A01(interfaceC175477rN)) {
            int i2 = this.A05;
            int i3 = this.A04;
            int i4 = this.A06;
            if (this.A0I) {
                i = this.A01;
            } else {
                i = 0;
            }
            boolean z = this.A0J;
            if (i2 > 0 && i3 > 0) {
                interfaceC175477rN.DX9(i2, i3, i4, i, z);
            }
        }
    }

    @Override // X.InterfaceC178737wl
    public final void AQb(Runnable runnable) {
        C179057xH c179057xH = ((C179027xE) this.A08.BQq()).A07;
        C179377xn c179377xn = (C179377xn) c179057xH.A00.get(0);
        if (c179377xn == null) {
            c179057xH.A01.A00(EnumC200658u8.A0B);
            return;
        }
        c179377xn.A07 = true;
        synchronized (C179377xn.A08) {
            c179377xn.A03 = runnable;
        }
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return InterfaceC178737wl.A00;
    }

    @Override // X.InterfaceC178737wl
    public final InterfaceC175497rP C4Q() {
        return this.A0R;
    }

    @Override // X.InterfaceC178737wl
    public final boolean CLt() {
        return this.A08.CLu();
    }

    @Override // X.InterfaceC178737wl
    public final void EG3(C176507t8 c176507t8) {
        this.A08.BQq().EFO(0, c176507t8);
    }

    @Override // X.InterfaceC178737wl
    public final void EGM(InterfaceC175477rN interfaceC175477rN) {
        this.A0O.A02(interfaceC175477rN);
    }

    @Override // X.InterfaceC178737wl
    public final void EaB(C176377su c176377su, Object obj) {
        C175487rO c175487rO = this.A0R;
        if (c176377su == InterfaceC176367st.A00) {
            c175487rO.A07.A01 = (InterfaceC176367st) obj;
        }
    }

    @Override // X.InterfaceC178737wl
    public final void EbN(boolean z) {
        C176507t8 c176507t8 = this.A0U;
        if (c176507t8 != null) {
            c176507t8.A0D = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.7rU] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    public C178727wk(InterfaceC178207vu interfaceC178207vu, boolean z, boolean z2) {
        super(interfaceC178207vu);
        Handler handler;
        ?? r0;
        this.A0O = new C1814082s();
        this.A00 = 0;
        C178037vc c178037vc = InterfaceC178107vj.A00;
        C178747wm c178747wm = new C178747wm();
        InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178657wd) this).A00;
        ?? AqG = interfaceC178207vu2.AqG(c178037vc);
        this.A0M = AqG != 0 ? AqG : c178747wm;
        this.A0L = AbstractC178767wo.A00(interfaceC178207vu);
        C178307w4 c178307w4 = InterfaceC178297w3.A00;
        if (interfaceC178207vu2.CRZ(c178307w4)) {
            handler = ((InterfaceC178297w3) interfaceC178207vu2.Aq1(c178307w4)).BAu("Lite-Controller-Thread");
        } else {
            handler = null;
        }
        this.A0K = handler;
        C178307w4 c178307w42 = InterfaceC178407wE.A00;
        this.A0N = interfaceC178207vu2.CRZ(c178307w42) ? (InterfaceC178407wE) interfaceC178207vu2.Aq1(c178307w42) : null;
        this.A0R = new C175487rO(this);
        this.A0Q = z;
        this.A0I = z2;
        Object AqG2 = interfaceC178207vu2.AqG(InterfaceC178147vn.A01);
        if (((Boolean) (AqG2 != null ? AqG2 : false)).booleanValue()) {
            r0 = new C23453AaQ();
        } else {
            r0 = new Object();
        }
        this.A0P = r0;
    }

    @Override // X.InterfaceC178737wl
    public final void EbX(C176307sn c176307sn) {
        this.A0G = c176307sn;
    }

    @Override // X.InterfaceC178737wl
    public final void Egy(InterfaceC176297sm interfaceC176297sm) {
        this.A0H = interfaceC176297sm;
    }
}
