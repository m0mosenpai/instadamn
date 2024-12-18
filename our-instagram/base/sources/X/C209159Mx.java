package X;

import android.os.Looper;

/* renamed from: X.9Mx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209159Mx extends AbstractC178657wd implements C9P6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public C176517t9 A06;
    public InterfaceC175517rR A07;
    public C22822A4r A08;
    public boolean A09;
    public boolean A0A;
    public InterfaceC178817wt A0B;
    public final C178747wm A0C;
    public final Runnable A0D;
    public final InterfaceC1809280u A0E;
    public volatile InterfaceC175597rZ A0F;
    public volatile C176507t8 A0G;

    public static InterfaceC178817wt A00(C209159Mx c209159Mx) {
        InterfaceC178817wt interfaceC178817wt = c209159Mx.A0B;
        if (interfaceC178817wt == null) {
            InterfaceC178817wt interfaceC178817wt2 = (InterfaceC178817wt) c209159Mx.A0A(InterfaceC178817wt.A01);
            c209159Mx.A0B = interfaceC178817wt2;
            return interfaceC178817wt2;
        }
        return interfaceC178817wt;
    }

    public static void A01(C209159Mx c209159Mx) {
        C179387xo c179387xo = new C179387xo();
        InterfaceC175517rR interfaceC175517rR = c209159Mx.A07;
        if (interfaceC175517rR == null) {
            Object obj = false;
            Object AqG = ((AbstractC178657wd) c209159Mx).A00.AqG(InterfaceC178107vj.A08);
            if (AqG != null) {
                obj = AqG;
            }
            interfaceC175517rR = new C9MM(!AbstractC166987dD.A1a(obj));
            c209159Mx.A07 = interfaceC175517rR;
        }
        c209159Mx.A08 = new C22822A4r(interfaceC175517rR, c209159Mx.A0E, c179387xo);
        InterfaceC179037xF BQq = A00(c209159Mx).BQq();
        C178747wm c178747wm = c209159Mx.A0C;
        C177107u6 c177107u6 = c209159Mx.A08.A00;
        c177107u6.getClass();
        BQq.EWA(new C1809380v(c178747wm, c177107u6, false), 0);
    }

    public static void A03(C209159Mx c209159Mx) {
        int i;
        int i2;
        if (c209159Mx.A02 % 180 != 0) {
            i = c209159Mx.A01;
            i2 = c209159Mx.A03;
        } else {
            i = c209159Mx.A03;
            i2 = c209159Mx.A01;
        }
        int i3 = c209159Mx.A05;
        int i4 = c209159Mx.A04;
        InterfaceC175517rR interfaceC175517rR = c209159Mx.A07;
        if (interfaceC175517rR != null) {
            interfaceC175517rR.ET4(i, i2);
        }
        C22822A4r c22822A4r = c209159Mx.A08;
        if (c22822A4r != null) {
            c22822A4r.A00.FBE(i, i2, i, i2, 0, 0, c209159Mx.A00, false);
        }
        C176507t8 c176507t8 = c209159Mx.A0G;
        if (c176507t8 != null) {
            c176507t8.A06 = 0;
        }
        A00(c209159Mx).FBm(0, i, i2, false, i3, i4);
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        return C9P6.A00;
    }

    public C209159Mx(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A0C = new C178747wm();
        this.A0A = false;
        this.A0D = new Runnable() { // from class: X.9Nq
            @Override // java.lang.Runnable
            public final void run() {
                C209159Mx c209159Mx = C209159Mx.this;
                if (C209159Mx.A00(c209159Mx).getHandler().getLooper() == Looper.myLooper()) {
                    InterfaceC179037xF BQq = C209159Mx.A00(c209159Mx).BQq();
                    boolean CWg = BQq.CWg(0);
                    boolean z = !BQq.B9z(0).isEmpty();
                    if (CWg && z) {
                        C209159Mx.A00(c209159Mx).EGZ(null);
                        return;
                    } else {
                        if (c209159Mx.A0A) {
                            return;
                        }
                        c209159Mx.A0A = true;
                        ((InterfaceC178407wE) ((AbstractC178657wd) c209159Mx).A00.Aq1(InterfaceC178407wE.A00)).EmV(AnonymousClass001.A1C("BasicVideoProcessorComponent OnFrameAvailableListener IO invalid, isInputSet:", ", isOutputSet: ", CWg, z), new Throwable(), false);
                        return;
                    }
                }
                throw AbstractC166987dD.A14("handleFrameAvailable must be called at SurfacePipe thread.");
            }
        };
        this.A0E = new AZK(this, 1);
    }
}
