package X;

import android.os.Handler;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.7ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC178807ws implements InterfaceC178067vf {
    public InterfaceC178207vu A00;

    @Override // X.InterfaceC178077vg
    public final void CNZ() {
        InterfaceC180207zA interfaceC180207zA;
        BBS bbs;
        AML aml;
        if (this instanceof C179887ye) {
            C179887ye c179887ye = (C179887ye) this;
            C178087vh c178087vh = InterfaceC179867yc.A00;
            InterfaceC178207vu interfaceC178207vu = ((AbstractC178807ws) c179887ye).A00;
            interfaceC178207vu.getClass();
            InterfaceC178067vf Aq0 = interfaceC178207vu.Aq0(c178087vh);
            C14360o3.A07(Aq0);
            InterfaceC179867yc interfaceC179867yc = (InterfaceC179867yc) Aq0;
            InterfaceC178677wf interfaceC178677wf = c179887ye.A02;
            if (interfaceC178677wf == null) {
                interfaceC178677wf = new AZW(c179887ye);
                c179887ye.A02 = interfaceC178677wf;
            }
            interfaceC179867yc.A9y(interfaceC178677wf);
            if (((Boolean) c179887ye.A09(InterfaceC179897yf.A00, false)).booleanValue()) {
                C178087vh c178087vh2 = InterfaceC180207zA.A00;
                InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178807ws) c179887ye).A00;
                interfaceC178207vu2.getClass();
                if (interfaceC178207vu2.CRY(c178087vh2)) {
                    InterfaceC178207vu interfaceC178207vu3 = ((AbstractC178807ws) c179887ye).A00;
                    interfaceC178207vu3.getClass();
                    InterfaceC178067vf Aq02 = interfaceC178207vu3.Aq0(c178087vh2);
                    C14360o3.A07(Aq02);
                    interfaceC180207zA = (InterfaceC180207zA) Aq02;
                    bbs = c179887ye.A01;
                    if (bbs == null) {
                        bbs = new AWE(c179887ye);
                        c179887ye.A01 = bbs;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (this instanceof C179907yg) {
                C179907yg c179907yg = (C179907yg) this;
                C178087vh c178087vh3 = InterfaceC178667we.A00;
                InterfaceC178207vu interfaceC178207vu4 = ((AbstractC178807ws) c179907yg).A00;
                interfaceC178207vu4.getClass();
                C175007qa c175007qa = ((C178647wc) ((InterfaceC178667we) interfaceC178207vu4.Aq0(c178087vh3))).A02;
                c179907yg.A02 = c175007qa;
                InterfaceC174967qW interfaceC174967qW = c179907yg.A04;
                interfaceC174967qW.hashCode();
                c175007qa.A0M.A01(interfaceC174967qW);
                InterfaceC175067qg interfaceC175067qg = c179907yg.A02.A0N;
                c179907yg.A01 = interfaceC175067qg;
                c179907yg.A00 = new C54655OCh(interfaceC175067qg);
                ((AbstractC179917yh) c179907yg).A00 = !interfaceC175067qg.CKn(0) ? 1 : 0;
                C178087vh c178087vh4 = InterfaceC180067yw.A04;
                InterfaceC178207vu interfaceC178207vu5 = ((AbstractC178807ws) c179907yg).A00;
                interfaceC178207vu5.getClass();
                if (!interfaceC178207vu5.CRY(c178087vh4)) {
                    return;
                }
                InterfaceC178207vu interfaceC178207vu6 = ((AbstractC178807ws) c179907yg).A00;
                interfaceC178207vu6.getClass();
                ((C9X1) ((InterfaceC180067yw) interfaceC178207vu6.Aq0(c178087vh4))).A04 = c179907yg.A00;
                return;
            }
            if (this instanceof C179937yj) {
                C179937yj c179937yj = (C179937yj) this;
                C178087vh c178087vh5 = InterfaceC178737wl.A00;
                InterfaceC178207vu interfaceC178207vu7 = ((AbstractC178807ws) c179937yj).A00;
                interfaceC178207vu7.getClass();
                InterfaceC178737wl interfaceC178737wl = (InterfaceC178737wl) interfaceC178207vu7.Aq0(c178087vh5);
                c179937yj.A04 = interfaceC178737wl;
                interfaceC178737wl.AAS(c179937yj.A05);
                c179937yj.A04.Egy(new C73406YBs(c179937yj));
                return;
            }
            if (this instanceof C179957yl) {
                aml = ((C179957yl) this).A00;
            } else if (this instanceof C179977yn) {
                C179977yn c179977yn = (C179977yn) this;
                C178087vh c178087vh6 = InterfaceC179867yc.A00;
                InterfaceC178207vu interfaceC178207vu8 = ((AbstractC178807ws) c179977yn).A00;
                interfaceC178207vu8.getClass();
                if (interfaceC178207vu8.CRY(c178087vh6)) {
                    InterfaceC178207vu interfaceC178207vu9 = ((AbstractC178807ws) c179977yn).A00;
                    interfaceC178207vu9.getClass();
                    c179977yn.A01 = (InterfaceC179867yc) interfaceC178207vu9.Aq0(c178087vh6);
                }
                aml = c179977yn.A00;
            } else {
                if (this instanceof C179987yo) {
                    C179987yo c179987yo = (C179987yo) this;
                    C178087vh c178087vh7 = InterfaceC179927yi.A00;
                    InterfaceC178207vu interfaceC178207vu10 = ((AbstractC178807ws) c179987yo).A00;
                    interfaceC178207vu10.getClass();
                    c179987yo.A01 = (InterfaceC179927yi) interfaceC178207vu10.Aq0(c178087vh7);
                    C178087vh c178087vh8 = InterfaceC179867yc.A00;
                    InterfaceC178207vu interfaceC178207vu11 = ((AbstractC178807ws) c179987yo).A00;
                    interfaceC178207vu11.getClass();
                    c179987yo.A02 = (InterfaceC179867yc) interfaceC178207vu11.Aq0(c178087vh8);
                    C178087vh c178087vh9 = InterfaceC178737wl.A00;
                    InterfaceC178207vu interfaceC178207vu12 = ((AbstractC178807ws) c179987yo).A00;
                    interfaceC178207vu12.getClass();
                    if (!interfaceC178207vu12.CRY(c178087vh9)) {
                        return;
                    }
                    InterfaceC178207vu interfaceC178207vu13 = ((AbstractC178807ws) c179987yo).A00;
                    interfaceC178207vu13.getClass();
                    InterfaceC178737wl interfaceC178737wl2 = (InterfaceC178737wl) interfaceC178207vu13.Aq0(c178087vh9);
                    c179987yo.A03 = interfaceC178737wl2;
                    interfaceC178737wl2.AAS(c179987yo.A05);
                    return;
                }
                if (this instanceof C180007yq) {
                    C180007yq c180007yq = (C180007yq) this;
                    C178087vh c178087vh10 = InterfaceC179927yi.A00;
                    InterfaceC178207vu interfaceC178207vu14 = ((AbstractC178807ws) c180007yq).A00;
                    interfaceC178207vu14.getClass();
                    InterfaceC179927yi interfaceC179927yi = (InterfaceC179927yi) interfaceC178207vu14.Aq0(c178087vh10);
                    c180007yq.A00 = interfaceC179927yi.Ak3();
                    interfaceC179927yi.A9f(c180007yq.A01);
                    return;
                }
                if (!(this instanceof C180027ys)) {
                    return;
                }
                C180027ys c180027ys = (C180027ys) this;
                C178087vh c178087vh11 = InterfaceC180067yw.A04;
                InterfaceC178207vu interfaceC178207vu15 = ((AbstractC178807ws) c180027ys).A00;
                interfaceC178207vu15.getClass();
                if (interfaceC178207vu15.CRY(c178087vh11)) {
                    InterfaceC178207vu interfaceC178207vu16 = ((AbstractC178807ws) c180027ys).A00;
                    interfaceC178207vu16.getClass();
                    InterfaceC180067yw interfaceC180067yw = (InterfaceC180067yw) interfaceC178207vu16.Aq0(c178087vh11);
                    C22808A4b c22808A4b = c180027ys.A09;
                    if (c22808A4b == null) {
                        c22808A4b = new C22808A4b(c180027ys);
                        c180027ys.A09 = c22808A4b;
                    }
                    C9X1 c9x1 = (C9X1) interfaceC180067yw;
                    c9x1.A05 = c22808A4b;
                    C22809A4c c22809A4c = c180027ys.A0A;
                    if (c22809A4c == null) {
                        c22809A4c = new C22809A4c(c180027ys);
                        c180027ys.A0A = c22809A4c;
                    }
                    c9x1.A06 = c22809A4c;
                    C54655OCh c54655OCh = c180027ys.A08;
                    if (c54655OCh == null) {
                        c54655OCh = new C54655OCh(c180027ys.A0e);
                        c180027ys.A08 = c54655OCh;
                    }
                    c9x1.A04 = c54655OCh;
                }
                C178087vh c178087vh12 = InterfaceC180207zA.A00;
                InterfaceC178207vu interfaceC178207vu17 = ((AbstractC178807ws) c180027ys).A00;
                interfaceC178207vu17.getClass();
                if (!interfaceC178207vu17.CRY(c178087vh12)) {
                    return;
                }
                InterfaceC178207vu interfaceC178207vu18 = ((AbstractC178807ws) c180027ys).A00;
                interfaceC178207vu18.getClass();
                interfaceC180207zA = (InterfaceC180207zA) interfaceC178207vu18.Aq0(c178087vh12);
                bbs = c180027ys.A0C;
                if (bbs == null) {
                    bbs = new AWD(c180027ys);
                    c180027ys.A0C = bbs;
                }
            }
            InterfaceC178207vu interfaceC178207vu19 = aml.A0A;
            InterfaceC178067vf Aq03 = interfaceC178207vu19.Aq0(InterfaceC178817wt.A01);
            Aq03.getClass();
            aml.A02 = (InterfaceC178817wt) Aq03;
            interfaceC178207vu19.AqG(BDx.A00);
            return;
        }
        C180197z9 c180197z9 = (C180197z9) interfaceC180207zA;
        c180197z9.A04.A01(bbs);
        bbs.DX1(c180197z9.A01, c180197z9.A00);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.7yv, java.lang.Object] */
    @Override // X.InterfaceC178077vg
    public final void CNu() {
        if (this instanceof C178797wr) {
            C178797wr c178797wr = (C178797wr) this;
            C178087vh c178087vh = InterfaceC178057ve.A01;
            InterfaceC178207vu interfaceC178207vu = ((AbstractC178807ws) c178797wr).A00;
            interfaceC178207vu.getClass();
            if (interfaceC178207vu.CRY(c178087vh)) {
                InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178807ws) c178797wr).A00;
                interfaceC178207vu2.getClass();
                InterfaceC179077xJ BQo = ((InterfaceC178057ve) interfaceC178207vu2.Aq0(c178087vh)).BQo();
                C14360o3.A07(BQo);
                C178797wr.A01(c178797wr, BQo);
                return;
            }
            return;
        }
        if (!(this instanceof C179487xy)) {
            return;
        }
        C179487xy c179487xy = (C179487xy) this;
        C179487xy.A00(c179487xy);
        C179527y2 c179527y2 = c179487xy.A03;
        InterfaceC178207vu interfaceC178207vu3 = ((AbstractC178807ws) c179487xy).A00;
        interfaceC178207vu3.getClass();
        c179527y2.A00 = new Object();
        C178087vh c178087vh2 = InterfaceC179867yc.A00;
        if (interfaceC178207vu3.CRY(c178087vh2)) {
            InterfaceC179867yc interfaceC179867yc = (InterfaceC179867yc) interfaceC178207vu3.Aq0(c178087vh2);
            c179527y2.A04 = interfaceC179867yc;
            if (interfaceC179867yc != null) {
                interfaceC179867yc.A9y(c179527y2.A08);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C178087vh c178087vh3 = InterfaceC180067yw.A04;
        if (interfaceC178207vu3.CRY(c178087vh3)) {
            InterfaceC180067yw interfaceC180067yw = (InterfaceC180067yw) interfaceC178207vu3.Aq0(c178087vh3);
            c179527y2.A01 = interfaceC180067yw;
            if (interfaceC180067yw != null) {
                ((C9X1) interfaceC180067yw).A02 = c179527y2.A00;
                c179527y2.A00();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C178087vh c178087vh4 = InterfaceC180087yy.A00;
        if (!interfaceC178207vu3.CRY(c178087vh4)) {
            return;
        }
        InterfaceC178067vf Aq0 = interfaceC178207vu3.Aq0(c178087vh4);
        C14360o3.A07(Aq0);
        c179527y2.A02(new ArrayList(((InterfaceC180087yy) Aq0).Bmt()));
    }

    @Override // X.InterfaceC178077vg
    public final void connect() {
        if (this instanceof C178797wr) {
            C178797wr c178797wr = (C178797wr) this;
            if (c178797wr.A05 != null) {
                c178797wr.A06.A01.sendEmptyMessage(1);
                return;
            }
            return;
        }
        if (this instanceof C179487xy) {
            C179487xy c179487xy = (C179487xy) this;
            c179487xy.A02 = true;
            C178987xA c178987xA = c179487xy.A01;
            if (c178987xA == null) {
                return;
            }
            c178987xA.A01.sendEmptyMessage(1);
            return;
        }
        if (this instanceof C9X1) {
            C9X1 c9x1 = (C9X1) this;
            C178087vh c178087vh = InterfaceC179867yc.A00;
            InterfaceC178207vu interfaceC178207vu = ((AbstractC178807ws) c9x1).A00;
            interfaceC178207vu.getClass();
            InterfaceC179867yc interfaceC179867yc = (InterfaceC179867yc) interfaceC178207vu.Aq0(c178087vh);
            InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178807ws) c9x1).A00;
            interfaceC178207vu2.getClass();
            if (!((InterfaceC179867yc) interfaceC178207vu2.Aq0(c178087vh)).CLY()) {
                return;
            }
            View Bfy = interfaceC179867yc.Bfy();
            c9x1.A03 = Bfy;
            Bfy.setOnTouchListener(c9x1.A09);
            return;
        }
        if (this instanceof C9X3) {
            C176507t8 c176507t8 = ((C9X3) this).A06;
            if (c176507t8 == null) {
                return;
            }
            c176507t8.A0D = true;
            return;
        }
        if (this instanceof C179977yn) {
            C179977yn c179977yn = (C179977yn) this;
            InterfaceC179867yc interfaceC179867yc2 = c179977yn.A01;
            if (interfaceC179867yc2 != null) {
                interfaceC179867yc2.A9y(c179977yn.A09);
            }
            InterfaceC175597rZ interfaceC175597rZ = c179977yn.A0A;
            if (interfaceC175597rZ == null) {
                return;
            }
            interfaceC175597rZ.Emi(new C23401AZa(c179977yn));
            return;
        }
        if (this instanceof C179987yo) {
            ((C179987yo) this).A09 = false;
            return;
        }
        if (this instanceof C180007yq) {
            synchronized (((C180007yq) this).A03) {
            }
            return;
        }
        if (!(this instanceof C180027ys)) {
            return;
        }
        C180027ys c180027ys = (C180027ys) this;
        if (!c180027ys.A0Q) {
            return;
        }
        c180027ys.A0Q = false;
        C178087vh c178087vh2 = InterfaceC179867yc.A00;
        InterfaceC178207vu interfaceC178207vu3 = ((AbstractC178807ws) c180027ys).A00;
        interfaceC178207vu3.getClass();
        InterfaceC179867yc interfaceC179867yc3 = (InterfaceC179867yc) interfaceC178207vu3.Aq0(c178087vh2);
        InterfaceC178677wf interfaceC178677wf = c180027ys.A0D;
        if (interfaceC178677wf == null) {
            interfaceC178677wf = new AZV(c180027ys);
            c180027ys.A0D = interfaceC178677wf;
        }
        interfaceC179867yc3.A9y(interfaceC178677wf);
        if (!c180027ys.A0P) {
            return;
        }
        C180027ys.A02(c180027ys);
    }

    @Override // X.InterfaceC178077vg
    public final void disconnect() {
        C178987xA c178987xA;
        if (this instanceof C178797wr) {
            C178797wr c178797wr = (C178797wr) this;
            if (c178797wr.A05 != null) {
                c178987xA = c178797wr.A06;
            } else {
                return;
            }
        } else if (this instanceof C179487xy) {
            C179487xy c179487xy = (C179487xy) this;
            c179487xy.A02 = false;
            c178987xA = c179487xy.A01;
            if (c178987xA == null) {
                return;
            }
            C179107xM c179107xM = c179487xy.A00;
            if (c179107xM != null) {
                c179107xM.A0d = false;
                Handler handler = c179107xM.A02;
                if (handler != null) {
                    handler.removeMessages(3);
                }
            }
        } else {
            if (this instanceof C9X1) {
                C9X1 c9x1 = (C9X1) this;
                View view = c9x1.A03;
                if (view == null) {
                    return;
                }
                view.setOnTouchListener(null);
                c9x1.A03 = null;
                return;
            }
            if (this instanceof C9X3) {
                C176507t8 c176507t8 = ((C9X3) this).A06;
                if (c176507t8 == null) {
                    return;
                }
                c176507t8.A0D = false;
                return;
            }
            if (this instanceof C179977yn) {
                C179977yn c179977yn = (C179977yn) this;
                InterfaceC175597rZ interfaceC175597rZ = c179977yn.A0A;
                if (interfaceC175597rZ != null) {
                    interfaceC175597rZ.stop();
                }
                InterfaceC179867yc interfaceC179867yc = c179977yn.A01;
                if (interfaceC179867yc != null) {
                    interfaceC179867yc.EG8(c179977yn.A09);
                }
                C176507t8 c176507t82 = c179977yn.A02;
                if (c176507t82 == null) {
                    return;
                }
                c179977yn.EG3(c176507t82);
                c179977yn.A02 = null;
                return;
            }
            if (this instanceof C179987yo) {
                C179987yo c179987yo = (C179987yo) this;
                synchronized (c179987yo.A07) {
                    if (c179987yo.A08 != null) {
                        BCQ bcq = c179987yo.A08.A01;
                        bcq.getClass();
                        RuntimeException runtimeException = new RuntimeException("Photo capture already in progress: cancel request");
                        if (APL.A0A()) {
                            bcq.D2G();
                        } else {
                            AbstractC166997dE.A1H(APL.A00(), new Object[]{bcq, runtimeException}, 8);
                        }
                        C179987yo.A01(c179987yo);
                    }
                }
                c179987yo.A09 = true;
                return;
            }
            if (this instanceof C180007yq) {
                C180007yq c180007yq = (C180007yq) this;
                synchronized (c180007yq.A03) {
                    Integer num = c180007yq.A05;
                    Integer num2 = C05F.A01;
                    if (num == num2) {
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        if (c180007yq.A05 == num2) {
                            c180007yq.A00.Eop(new C212649bX(c180007yq, countDownLatch), false);
                        }
                        c180007yq.A05 = C05F.A00;
                        C180007yq.A00(c180007yq);
                        BD8 bd8 = c180007yq.A04;
                        c180007yq.A04 = null;
                        if (bd8 != null) {
                            APL.A04(bd8, new RuntimeException("Camera is backgrounded during recording"));
                        }
                    }
                }
                return;
            }
            if (!(this instanceof C180027ys)) {
                return;
            }
            C180027ys c180027ys = (C180027ys) this;
            if (c180027ys.A0Q) {
                return;
            }
            C178087vh c178087vh = InterfaceC179867yc.A00;
            InterfaceC178207vu interfaceC178207vu = ((AbstractC178807ws) c180027ys).A00;
            interfaceC178207vu.getClass();
            InterfaceC179867yc interfaceC179867yc2 = (InterfaceC179867yc) interfaceC178207vu.Aq0(c178087vh);
            InterfaceC178677wf interfaceC178677wf = c180027ys.A0D;
            if (interfaceC178677wf == null) {
                interfaceC178677wf = new AZV(c180027ys);
                c180027ys.A0D = interfaceC178677wf;
            }
            interfaceC179867yc2.EG8(interfaceC178677wf);
            c180027ys.A06 = null;
            c180027ys.A05 = null;
            C180027ys.A05(c180027ys);
            c180027ys.A0Q = true;
            List list = c180027ys.A0d.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C180007yq c180007yq2 = ((C22810A4d) list.get(i)).A00;
                synchronized (c180007yq2.A03) {
                    if (c180007yq2.A05 == C05F.A01) {
                        c180007yq2.Eon(false);
                    }
                }
            }
            C180027ys.A04(c180027ys);
            return;
        }
        boolean z = c178987xA.A06;
        C178907x2 c178907x2 = c178987xA.A04;
        if (z) {
            if (c178907x2.A0A) {
                c178907x2.A0F = true;
            }
        } else {
            c178907x2.A02();
        }
        c178987xA.A01.sendEmptyMessage(2);
    }

    @Override // X.InterfaceC178077vg
    public final void release() {
        AML aml;
        if (this instanceof C178797wr) {
            C178797wr c178797wr = (C178797wr) this;
            C178867wy c178867wy = c178797wr.A05;
            if (c178867wy != null) {
                c178797wr.A0A = new CountDownLatch(1);
                c178797wr.A06.A01.sendEmptyMessage(3);
                InterfaceC178897x1 interfaceC178897x1 = c178867wy.A00;
                if (interfaceC178897x1 != null) {
                    interfaceC178897x1.release();
                    c178867wy.A00 = null;
                }
                C178847ww c178847ww = c178867wy.A01;
                C178857wx c178857wx = C178847ww.A05;
                Object obj = false;
                Map map = c178847ww.A00;
                Object obj2 = map.get(c178857wx);
                if (obj2 != null) {
                    obj = obj2;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                InterfaceC178897x1 interfaceC178897x12 = (InterfaceC178897x1) map.remove(C178847ww.A0B);
                if (booleanValue && interfaceC178897x12 != null) {
                    interfaceC178897x12.release();
                    return;
                }
                return;
            }
            return;
        }
        if (this instanceof C179487xy) {
            C179487xy c179487xy = (C179487xy) this;
            c179487xy.A02 = false;
            C178987xA c178987xA = c179487xy.A01;
            if (c178987xA == null) {
                return;
            }
            c178987xA.A01.sendEmptyMessage(3);
            return;
        }
        if (this instanceof C179887ye) {
            C179887ye c179887ye = (C179887ye) this;
            C178087vh c178087vh = InterfaceC179867yc.A00;
            InterfaceC178207vu interfaceC178207vu = ((AbstractC178807ws) c179887ye).A00;
            interfaceC178207vu.getClass();
            InterfaceC178067vf Aq0 = interfaceC178207vu.Aq0(c178087vh);
            C14360o3.A07(Aq0);
            InterfaceC179867yc interfaceC179867yc = (InterfaceC179867yc) Aq0;
            InterfaceC178677wf interfaceC178677wf = c179887ye.A02;
            if (interfaceC178677wf == null) {
                interfaceC178677wf = new AZW(c179887ye);
                c179887ye.A02 = interfaceC178677wf;
            }
            interfaceC179867yc.EG8(interfaceC178677wf);
            return;
        }
        if (this instanceof C179937yj) {
            C179937yj c179937yj = (C179937yj) this;
            c179937yj.A04.EGM(c179937yj.A05);
            return;
        }
        if (this instanceof C9X3) {
            C9X3 c9x3 = (C9X3) this;
            synchronized (c9x3) {
                TextureView textureView = c9x3.A05;
                c9x3.A05 = null;
                Iterator it = c9x3.A00.A00.iterator();
                while (it.hasNext()) {
                    ((InterfaceC178677wf) it.next()).Dan(c9x3.A05);
                }
                if (textureView != null) {
                    textureView.setSurfaceTextureListener(null);
                }
                C176507t8 c176507t8 = c9x3.A06;
                c9x3.A06 = null;
                if (c176507t8 != null) {
                    c176507t8.A01();
                }
            }
            return;
        }
        if (this instanceof C179957yl) {
            aml = ((C179957yl) this).A00;
        } else if (this instanceof C179977yn) {
            C179977yn c179977yn = (C179977yn) this;
            c179977yn.A02 = null;
            c179977yn.A0B.A00();
            aml = c179977yn.A00;
        } else {
            if (!(this instanceof C180027ys)) {
                return;
            }
            C180027ys c180027ys = (C180027ys) this;
            C180027ys.A05(c180027ys);
            C178087vh c178087vh2 = InterfaceC180067yw.A04;
            InterfaceC178207vu interfaceC178207vu2 = ((AbstractC178807ws) c180027ys).A00;
            interfaceC178207vu2.getClass();
            if (interfaceC178207vu2.CRY(c178087vh2)) {
                InterfaceC178207vu interfaceC178207vu3 = ((AbstractC178807ws) c180027ys).A00;
                interfaceC178207vu3.getClass();
                C9X1 c9x1 = (C9X1) ((InterfaceC180067yw) interfaceC178207vu3.Aq0(c178087vh2));
                c9x1.A05 = null;
                c9x1.A06 = null;
                c9x1.A04 = null;
            }
            C178087vh c178087vh3 = InterfaceC180207zA.A00;
            InterfaceC178207vu interfaceC178207vu4 = ((AbstractC178807ws) c180027ys).A00;
            interfaceC178207vu4.getClass();
            if (!interfaceC178207vu4.CRY(c178087vh3)) {
                return;
            }
            InterfaceC178207vu interfaceC178207vu5 = ((AbstractC178807ws) c180027ys).A00;
            interfaceC178207vu5.getClass();
            InterfaceC180207zA interfaceC180207zA = (InterfaceC180207zA) interfaceC178207vu5.Aq0(c178087vh3);
            BBS bbs = c180027ys.A0C;
            if (bbs == null) {
                bbs = new AWD(c180027ys);
                c180027ys.A0C = bbs;
            }
            ((C180197z9) interfaceC180207zA).A04.A02(bbs);
            return;
        }
        if (AML.A03(aml)) {
            aml.A0C.clear();
            aml.A0D.clear();
            aml.A08.clear();
            aml.A07.clear();
            aml.A09.clear();
            return;
        }
        aml.A06.post(new RunnableC24254ApL(aml));
    }

    public final Object A09(C178037vc c178037vc, Object obj) {
        InterfaceC178207vu interfaceC178207vu = this.A00;
        interfaceC178207vu.getClass();
        Object AqG = interfaceC178207vu.AqG(c178037vc);
        if (AqG != null) {
            return AqG;
        }
        return obj;
    }

    @Override // X.InterfaceC178077vg
    public final void APM() {
    }

    @Override // X.InterfaceC178077vg
    public final void ARQ() {
    }

    @Override // X.InterfaceC178067vf
    public C178087vh BKV() {
        if (this instanceof C178797wr) {
            return InterfaceC178817wt.A01;
        }
        if (this instanceof C179487xy) {
            C178087vh c178087vh = InterfaceC179497xz.A01;
            C14360o3.A08(c178087vh);
            return c178087vh;
        }
        if (this instanceof C179887ye) {
            C178087vh c178087vh2 = InterfaceC179897yf.A01;
            C14360o3.A08(c178087vh2);
            return c178087vh2;
        }
        if (this instanceof C9X1) {
            return InterfaceC180067yw.A04;
        }
        if (!(this instanceof C9X0)) {
            if (this instanceof C211499Wy) {
                return BEQ.A01;
            }
            if (this instanceof C179937yj) {
                return InterfaceC179947yk.A00;
            }
            if (this instanceof C9X2) {
                C178087vh c178087vh3 = BEL.A00;
                C14360o3.A08(c178087vh3);
                return c178087vh3;
            }
            if (this instanceof C9X3) {
                C178087vh c178087vh4 = InterfaceC179867yc.A00;
                C14360o3.A08(c178087vh4);
                return c178087vh4;
            }
            if (this instanceof C179987yo) {
                return InterfaceC179997yp.A00;
            }
            if (this instanceof C180007yq) {
                return InterfaceC180017yr.A00;
            }
            if (!(this instanceof C211509Wz)) {
                throw new UnsupportedOperationException("getKey() not supported");
            }
        }
        C178087vh c178087vh5 = InterfaceC180087yy.A00;
        C14360o3.A08(c178087vh5);
        return c178087vh5;
    }

    @Override // X.InterfaceC178077vg
    public final void E50() {
    }

    @Override // X.InterfaceC178077vg
    public final void ECK() {
    }

    @Override // X.InterfaceC178077vg
    public final void EKd() {
        C176507t8 c176507t8;
        if (this instanceof C179487xy) {
            C179487xy c179487xy = (C179487xy) this;
            c179487xy.A02 = true;
            C178987xA c178987xA = c179487xy.A01;
            if (c178987xA != null) {
                c178987xA.A01.sendEmptyMessage(1);
                return;
            }
            return;
        }
        if (this instanceof C178797wr) {
            C178797wr c178797wr = (C178797wr) this;
            if (c178797wr.A05 == null) {
                return;
            }
            c178797wr.A06.A01.sendEmptyMessage(1);
            return;
        }
        if (!(this instanceof C9X3) || (c176507t8 = ((C9X3) this).A06) == null) {
            return;
        }
        c176507t8.A0D = true;
    }

    @Override // X.InterfaceC178077vg
    public final void pause() {
        C176507t8 c176507t8;
        C178987xA c178987xA;
        if (this instanceof C179487xy) {
            C179487xy c179487xy = (C179487xy) this;
            c179487xy.A02 = false;
            c178987xA = c179487xy.A01;
            if (c178987xA != null) {
                C179107xM c179107xM = c179487xy.A00;
                if (c179107xM != null) {
                    c179107xM.A0d = false;
                    Handler handler = c179107xM.A02;
                    if (handler != null) {
                        handler.removeMessages(3);
                    }
                }
            } else {
                return;
            }
        } else if (this instanceof C178797wr) {
            C178797wr c178797wr = (C178797wr) this;
            if (c178797wr.A05 == null) {
                return;
            } else {
                c178987xA = c178797wr.A06;
            }
        } else {
            if (!(this instanceof C9X3) || (c176507t8 = ((C9X3) this).A06) == null) {
                return;
            }
            c176507t8.A0D = false;
            return;
        }
        boolean z = c178987xA.A06;
        C178907x2 c178907x2 = c178987xA.A04;
        if (z) {
            if (c178907x2.A0A) {
                c178907x2.A0F = true;
            }
        } else {
            c178907x2.A02();
        }
        c178987xA.A01.sendEmptyMessage(2);
    }

    public static void A03(C23385AYj c23385AYj, C178087vh c178087vh, Object obj, int i) {
        C179527y2 c179527y2 = ((C179487xy) ((InterfaceC179497xz) c23385AYj.Aq0(c178087vh))).A03;
        ArrayList arrayList = new ArrayList(i);
        arrayList.add(obj);
        c179527y2.A02(arrayList);
    }
}
