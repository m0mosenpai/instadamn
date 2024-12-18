package X;

import android.os.Handler;

/* renamed from: X.7xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179487xy extends AbstractC178807ws implements InterfaceC179497xz {
    public C179107xM A00;
    public C178987xA A01;
    public boolean A02;
    public final C179527y2 A03;
    public final C179507y0 A04;
    public final C179517y1 A05;
    public final InterfaceC178407wE A06;
    public final InterfaceC178297w3 A07;
    public final InterfaceC178337w7 A08;

    @Override // X.InterfaceC179497xz
    public final void DfO(InterfaceC179247xa interfaceC179247xa) {
        C179107xM c179107xM;
        Handler handler;
        if (!this.A02 && interfaceC179247xa.CBM() == EnumC179217xX.A0Y && ((Boolean) A09(InterfaceC179497xz.A00, false)).booleanValue()) {
            C179527y2 c179527y2 = this.A03;
            if (((C177797vD) interfaceC179247xa).A00 == null && (c179107xM = c179527y2.A02) != null && (handler = c179107xM.A02) != null) {
                handler.post(new RunnableC24538Atv(c179527y2, interfaceC179247xa));
                return;
            }
            return;
        }
        if (!this.A02) {
            return;
        }
        C179107xM c179107xM2 = this.A03.A02;
        if (c179107xM2 != null) {
            C179107xM.A05(c179107xM2, interfaceC179247xa, null);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A00(C179487xy c179487xy) {
        if (c179487xy.A03.A02 == null) {
            C178087vh c178087vh = InterfaceC178057ve.A01;
            InterfaceC178207vu interfaceC178207vu = ((AbstractC178807ws) c179487xy).A00;
            interfaceC178207vu.getClass();
            if (interfaceC178207vu.CRY(c178087vh)) {
                InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178807ws) c179487xy).A00;
                interfaceC178207vu2.getClass();
                InterfaceC179077xJ BQo = ((InterfaceC178057ve) interfaceC178207vu2.Aq0(c178087vh)).BQo();
                C14360o3.A07(BQo);
                if ((BQo.AlT() & 1) != 0) {
                    BQo.FDL(1, new C177307uQ(c179487xy));
                }
            }
        }
    }

    public C179487xy(InterfaceC178207vu interfaceC178207vu) {
        InterfaceC178407wE interfaceC178407wE;
        super.A00 = interfaceC178207vu;
        C178307w4 c178307w4 = InterfaceC178407wE.A00;
        if (interfaceC178207vu.CRZ(c178307w4)) {
            interfaceC178407wE = (InterfaceC178407wE) interfaceC178207vu.Aq1(c178307w4);
        } else {
            interfaceC178407wE = null;
        }
        this.A06 = interfaceC178407wE;
        C178307w4 c178307w42 = InterfaceC178337w7.A00;
        this.A08 = interfaceC178207vu.CRZ(c178307w42) ? (InterfaceC178337w7) interfaceC178207vu.Aq1(c178307w42) : null;
        InterfaceC178297w3 interfaceC178297w3 = (InterfaceC178297w3) interfaceC178207vu.Aq1(InterfaceC178297w3.A00);
        this.A07 = interfaceC178297w3;
        C179507y0 c179507y0 = new C179507y0(this);
        this.A04 = c179507y0;
        C179517y1 c179517y1 = C179517y1.A00;
        this.A05 = c179517y1;
        if (((Boolean) A09(InterfaceC178107vj.A06, false)).booleanValue()) {
            C178087vh c178087vh = InterfaceC178817wt.A01;
            InterfaceC178207vu interfaceC178207vu2 = super.A00;
            interfaceC178207vu2.getClass();
            InterfaceC178067vf Aq0 = interfaceC178207vu2.Aq0(c178087vh);
            C14360o3.A07(Aq0);
            C178867wy B9x = ((InterfaceC178817wt) Aq0).B9x();
            if (B9x != null) {
                C178267w0.A01().A00("ArEngineRenderThread", 0);
                this.A01 = new C178987xA((C178747wm) A09(InterfaceC178107vj.A00, new C178747wm()), B9x.A00(interfaceC178297w3.BAu("ArEngineRenderThread").getLooper()), new InterfaceC178977x9() { // from class: X.8ws
                    @Override // X.InterfaceC178977x9
                    public final void DRh(C178987xA c178987xA) {
                    }

                    @Override // X.InterfaceC178977x9
                    public final void DRj(C178987xA c178987xA) {
                    }

                    @Override // X.InterfaceC178977x9
                    public final void DRk(C178987xA c178987xA) {
                    }

                    @Override // X.InterfaceC178977x9
                    public final void DRl(C178987xA c178987xA) {
                    }

                    @Override // X.InterfaceC178977x9
                    public final void DRm(C178987xA c178987xA, Exception exc) {
                    }

                    @Override // X.InterfaceC178977x9
                    public final void DRn(C178987xA c178987xA, Long l) {
                    }

                    @Override // X.InterfaceC178977x9
                    public final void DRo(C178987xA c178987xA) {
                    }

                    @Override // X.InterfaceC178977x9
                    public final void DRp(C178987xA c178987xA, Long l) {
                    }

                    @Override // X.InterfaceC178977x9
                    public final void DRq(C178987xA c178987xA, Long l) {
                    }

                    @Override // X.InterfaceC178977x9
                    public final void DRs(C178987xA c178987xA) {
                    }
                }, ((Boolean) A09(InterfaceC178147vn.A00, false)).booleanValue());
            }
        }
        C179527y2 c179527y2 = new C179527y2(this.A01, ((Number) A09(InterfaceC178107vj.A0L, 0)).intValue());
        this.A03 = c179527y2;
        C178037vc c178037vc = InterfaceC178137vm.A00;
        InterfaceC178207vu interfaceC178207vu3 = super.A00;
        interfaceC178207vu3.getClass();
        C179107xM c179107xM = (C179107xM) interfaceC178207vu3.AqG(c178037vc);
        this.A00 = c179107xM;
        if (c179107xM != null) {
            if (interfaceC178407wE != null) {
                c179107xM.A05 = interfaceC178407wE;
            }
            c179527y2.A01(c179507y0, c179517y1, c179107xM);
        }
    }
}
