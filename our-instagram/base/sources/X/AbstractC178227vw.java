package X;

import android.os.Handler;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.facebook.onecamera.outputcontrollers.touchgesture.basic.BasicTouchGestureOutputController;
import java.util.Iterator;
import java.util.List;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.7vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC178227vw implements InterfaceC178077vg {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    public static C180147z4 A02(C23385AYj c23385AYj, C178087vh c178087vh, boolean z) {
        c23385AYj.A01(new C178727wk(c23385AYj, false, z), c178087vh);
        c23385AYj.A01(new C9X3(c23385AYj), InterfaceC179867yc.A00);
        c23385AYj.A01(new C178797wr(c23385AYj), InterfaceC178817wt.A01);
        return new C180147z4(c23385AYj, false);
    }

    public void A09() {
    }

    public final void A05() {
        InterfaceC175597rZ interfaceC175597rZ;
        InterfaceC175577rX interfaceC175577rX;
        if (this instanceof C180107z0) {
            C180107z0 c180107z0 = (C180107z0) this;
            InterfaceC177237uJ interfaceC177237uJ = (InterfaceC177237uJ) ((AbstractC179807yU) c180107z0).A00.AqF(InterfaceC180117z1.A00);
            if (interfaceC177237uJ != null) {
                c180107z0.A00 = interfaceC177237uJ;
                return;
            }
            return;
        }
        if (this instanceof C178217vv) {
            Iterator it = ((C178217vv) this).A00.iterator();
            while (it.hasNext()) {
                ((InterfaceC178077vg) it.next()).connect();
            }
            return;
        }
        if (this instanceof C178727wk) {
            C178727wk.A01((C178727wk) this);
            return;
        }
        if (this instanceof C178647wc) {
            C178647wc c178647wc = (C178647wc) this;
            if (c178647wc.A00) {
                return;
            }
            c178647wc.A00 = true;
            C175007qa c175007qa = c178647wc.A02;
            InterfaceC174967qW interfaceC174967qW = c178647wc.A04;
            interfaceC174967qW.hashCode();
            c175007qa.A0M.A01(interfaceC174967qW);
            C177257uL c177257uL = AbstractC174897qP.A00;
            InterfaceC178207vu interfaceC178207vu = ((AbstractC178657wd) c178647wc).A00;
            Number number = (Number) interfaceC178207vu.AqF(c177257uL);
            if (number != null) {
                c175007qa.A08(number.intValue());
            }
            InterfaceC174637px interfaceC174637px = (InterfaceC174637px) interfaceC178207vu.AqF(AbstractC174897qP.A02);
            if (interfaceC174637px != null) {
                c175007qa.A0C(interfaceC174637px);
            }
            InterfaceC174657pz interfaceC174657pz = (InterfaceC174657pz) interfaceC178207vu.AqF(AbstractC174897qP.A01);
            if (interfaceC174657pz == null) {
                interfaceC174657pz = C178647wc.A00(interfaceC174637px);
            }
            c175007qa.A06 = interfaceC174657pz;
            InterfaceC174927qS interfaceC174927qS = c175007qa.A0O;
            interfaceC174927qS.EgA(!interfaceC178207vu.CRY(InterfaceC178737wl.A00));
            Boolean bool = (Boolean) interfaceC178207vu.AqF(AbstractC174897qP.A03);
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                c175007qa.A0F = booleanValue;
                c175007qa.A0N.EYx(booleanValue);
            }
            C174797qF c174797qF = (C174797qF) interfaceC178207vu.AqF(AbstractC174897qP.A04);
            if (c174797qF != null) {
                interfaceC174927qS.Ea1(c174797qF);
            }
            c175007qa.A0F(true);
            return;
        }
        if (this instanceof C179587y8) {
            A08();
            return;
        }
        if (this instanceof C179557y5) {
            C179557y5.A00((C179557y5) this);
            return;
        }
        if (this instanceof C180127z2) {
            C180127z2 c180127z2 = (C180127z2) this;
            c180127z2.A00 = 2;
            List list = c180127z2.A02.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C197368o7) list.get(i)).A0K = true;
            }
            return;
        }
        if (this instanceof C180147z4) {
            C180147z4 c180147z4 = (C180147z4) this;
            if (!c180147z4.A02) {
                return;
            }
            c180147z4.A03 = (InterfaceC178817wt) c180147z4.A0A(InterfaceC178817wt.A01);
            interfaceC175597rZ = c180147z4.A01;
            interfaceC175577rX = c180147z4.A00;
        } else {
            if (this instanceof C180157z5) {
                C176507t8 c176507t8 = ((C180157z5) this).A08;
                if (c176507t8 == null) {
                    return;
                }
                c176507t8.A0D = true;
                return;
            }
            if (this instanceof C180177z7) {
                C180177z7 c180177z7 = (C180177z7) this;
                ((InterfaceC179867yc) c180177z7.A0A(InterfaceC179867yc.A00)).A9y(c180177z7);
                interfaceC175597rZ = c180177z7.A0J;
                if (interfaceC175597rZ == null) {
                    return;
                } else {
                    interfaceC175577rX = c180177z7.A0C;
                }
            } else {
                if (!(this instanceof C180197z9)) {
                    return;
                }
                C180197z9 c180197z9 = (C180197z9) this;
                C180197z9.A03(c180197z9, new C57243PbR(c180197z9, 6));
                return;
            }
        }
        interfaceC175597rZ.Emi(interfaceC175577rX);
    }

    public final void A06() {
        if (this instanceof C178217vv) {
            Iterator it = ((C178217vv) this).A00.iterator();
            while (it.hasNext()) {
                ((InterfaceC178077vg) it.next()).disconnect();
            }
            return;
        }
        if (this instanceof C178727wk) {
            C178727wk.A00((C178727wk) this);
            return;
        }
        if (this instanceof C178647wc) {
            C178647wc c178647wc = (C178647wc) this;
            if (!c178647wc.A00) {
                return;
            }
            c178647wc.A00 = false;
            C175007qa c175007qa = c178647wc.A02;
            InterfaceC174967qW interfaceC174967qW = c178647wc.A04;
            interfaceC174967qW.hashCode();
            c175007qa.A0M.A02(interfaceC174967qW);
            c175007qa.A04();
            return;
        }
        if (this instanceof C179587y8) {
            A07();
            return;
        }
        if (this instanceof C179557y5) {
            C179557y5 c179557y5 = (C179557y5) this;
            c179557y5.A04 = false;
            c179557y5.A03 = false;
            c179557y5.A02 = false;
            return;
        }
        if (this instanceof C180127z2) {
            C180127z2 c180127z2 = (C180127z2) this;
            c180127z2.A00 = 1;
            List list = c180127z2.A02.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C197368o7) list.get(i)).A0K = false;
            }
            return;
        }
        if (this instanceof C180147z4) {
            C180147z4 c180147z4 = (C180147z4) this;
            if (!c180147z4.A02) {
                return;
            }
            c180147z4.A03 = null;
            c180147z4.A01.stop();
            return;
        }
        if (this instanceof C180157z5) {
            C176507t8 c176507t8 = ((C180157z5) this).A08;
            if (c176507t8 == null) {
                return;
            }
            c176507t8.A0D = false;
            return;
        }
        if (this instanceof C180177z7) {
            C180177z7 c180177z7 = (C180177z7) this;
            ((InterfaceC179867yc) c180177z7.A0A(InterfaceC179867yc.A00)).EG8(c180177z7);
            InterfaceC175597rZ interfaceC175597rZ = c180177z7.A0J;
            if (interfaceC175597rZ != null) {
                interfaceC175597rZ.stop();
            }
            c180177z7.A0B.post(new RunnableC24274Apf(c180177z7));
            return;
        }
        if (!(this instanceof C180197z9)) {
            return;
        }
        C180197z9 c180197z9 = (C180197z9) this;
        C180197z9.A03(c180197z9, new C57243PbR(c180197z9, 7));
    }

    public final void A07() {
        C176507t8 c176507t8;
        if (this instanceof C179587y8) {
            C175887s2 c175887s2 = ((C179587y8) this).A02;
            if (c175887s2 != null) {
                c175887s2.A05();
                return;
            }
            return;
        }
        if (this instanceof C178217vv) {
            Iterator it = ((C178217vv) this).A00.iterator();
            while (it.hasNext()) {
                ((InterfaceC178077vg) it.next()).pause();
            }
            return;
        }
        if (this instanceof C178727wk) {
            C178727wk.A00((C178727wk) this);
            return;
        }
        if (this instanceof C175607ra) {
            C179267xc c179267xc = ((C175607ra) this).A00.A0L;
            if (c179267xc == null) {
                return;
            }
            C179287xe c179287xe = c179267xc.A04;
            c179287xe.A0G = false;
            c179287xe.A08.post(c179287xe.A0A);
            return;
        }
        if (this instanceof C178647wc) {
            ((C178647wc) this).A02.A04();
            return;
        }
        if (this instanceof C179557y5) {
            C179557y5 c179557y5 = (C179557y5) this;
            c179557y5.A04 = false;
            c179557y5.A03 = false;
            c179557y5.A02 = false;
            return;
        }
        if (this instanceof C180147z4) {
            C180147z4 c180147z4 = (C180147z4) this;
            if (!c180147z4.A02) {
                return;
            }
            c180147z4.A03 = null;
            c180147z4.A01.stop();
            return;
        }
        if (this instanceof C180127z2) {
            C180127z2 c180127z2 = (C180127z2) this;
            c180127z2.A00 = 1;
            List list = c180127z2.A02.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C197368o7) list.get(i)).A0K = false;
            }
            return;
        }
        if (!(this instanceof C180157z5) || (c176507t8 = ((C180157z5) this).A08) == null) {
            return;
        }
        c176507t8.A0D = false;
    }

    public final void A08() {
        C176507t8 c176507t8;
        if (this instanceof C179587y8) {
            C177487ui c177487ui = ((C179587y8) this).A00;
            if (c177487ui != null) {
                c177487ui.A00 = 0L;
                return;
            }
            return;
        }
        if (this instanceof C178217vv) {
            Iterator it = ((C178217vv) this).A00.iterator();
            while (it.hasNext()) {
                ((InterfaceC178077vg) it.next()).EKd();
            }
            return;
        }
        if (this instanceof C178647wc) {
            C178647wc c178647wc = (C178647wc) this;
            C175007qa c175007qa = c178647wc.A02;
            InterfaceC174967qW interfaceC174967qW = c178647wc.A04;
            interfaceC174967qW.hashCode();
            c175007qa.A0M.A01(interfaceC174967qW);
            c175007qa.A0F(true);
            return;
        }
        if (this instanceof C178727wk) {
            C178727wk.A01((C178727wk) this);
            return;
        }
        if (this instanceof C179557y5) {
            C179557y5.A00((C179557y5) this);
            return;
        }
        if (this instanceof C180147z4) {
            C180147z4 c180147z4 = (C180147z4) this;
            if (!c180147z4.A02) {
                return;
            }
            c180147z4.A03 = (InterfaceC178817wt) c180147z4.A0A(InterfaceC178817wt.A01);
            c180147z4.A01.Emi(c180147z4.A00);
            return;
        }
        if (this instanceof C180127z2) {
            C180127z2 c180127z2 = (C180127z2) this;
            c180127z2.A00 = 2;
            List list = c180127z2.A02.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C197368o7) list.get(i)).A0K = true;
            }
            return;
        }
        if (!(this instanceof C180157z5) || (c176507t8 = ((C180157z5) this).A08) == null) {
            return;
        }
        c176507t8.A0D = true;
    }

    @Override // X.InterfaceC178077vg
    public final void APM() {
        C02R.A07(this.A00, "Observer cannot disable, not initialized.");
        if (this.A03) {
            this.A03 = false;
            if (this instanceof C178647wc) {
                A06();
            }
        }
    }

    @Override // X.InterfaceC178077vg
    public final void ARQ() {
        C02R.A07(this.A00, "Observer cannot enable, not initialized.");
        if (!this.A03) {
            this.A03 = true;
            if (this instanceof C178647wc) {
                A05();
            }
            if (this.A02 && !this.A01) {
                A05();
                this.A01 = true;
            }
        }
    }

    @Override // X.InterfaceC178077vg
    public final void CNZ() {
        if (!this.A00) {
            this.A00 = true;
            this.A03 = true;
            this.A01 = false;
            A09();
        }
    }

    @Override // X.InterfaceC178077vg
    public final void CNu() {
        String str;
        boolean z;
        C02R.A07(this.A00, "Observer not initialized.");
        if (this instanceof C178217vv) {
            Iterator it = ((C178217vv) this).A00.iterator();
            while (it.hasNext()) {
                ((InterfaceC178077vg) it.next()).CNu();
            }
            return;
        }
        if (this instanceof C179557y5) {
            C179557y5 c179557y5 = (C179557y5) this;
            C178087vh c178087vh = InterfaceC179927yi.A00;
            InterfaceC178207vu interfaceC178207vu = ((AbstractC178657wd) c179557y5).A00;
            if (interfaceC178207vu.CRY(c178087vh)) {
                InterfaceC179927yi interfaceC179927yi = (InterfaceC179927yi) c179557y5.A0A(c178087vh);
                c179557y5.A0D = interfaceC179927yi.Ak3();
                z = interfaceC179927yi.CfL();
            } else {
                C175007qa c175007qa = ((C178647wc) ((InterfaceC178667we) c179557y5.A0A(InterfaceC178667we.A00))).A02;
                c179557y5.A0D = c175007qa.A0N;
                z = false;
                if (c175007qa.A0L == EnumC177227uI.CAMERA2) {
                    z = true;
                }
            }
            c179557y5.A05 = z;
            if (c179557y5.A0D != null) {
                c179557y5.A0D.A8v(c179557y5.A06);
            }
            C178087vh c178087vh2 = InterfaceC179497xz.A01;
            c179557y5.A0C = (InterfaceC179497xz) c179557y5.A0A(c178087vh2);
            c179557y5.A00 = AbstractC176357ss.A00(interfaceC178207vu.getContext(), c179557y5.A09);
            ((InterfaceC178737wl) c179557y5.A0A(InterfaceC178737wl.A00)).EaB(InterfaceC176367st.A00, c179557y5.A00);
            C179487xy c179487xy = (C179487xy) ((InterfaceC179497xz) c179557y5.A0A(c178087vh2));
            C179487xy.A00(c179487xy);
            C179107xM c179107xM = c179487xy.A03.A02;
            if (c179107xM != null) {
                c179107xM.A0K.EDH(c179557y5.A07, EnumC179217xX.A09);
                C179487xy c179487xy2 = (C179487xy) ((InterfaceC179497xz) c179557y5.A0A(c178087vh2));
                C179487xy.A00(c179487xy2);
                C179107xM c179107xM2 = c179487xy2.A03.A02;
                if (c179107xM2 != null) {
                    C179177xT c179177xT = c179107xM2.A0K;
                    InterfaceC179227xY interfaceC179227xY = c179557y5.A08;
                    C179207xW c179207xW = c179177xT.A01;
                    c179207xW.A01[interfaceC179227xY.Bmo().ordinal()] = interfaceC179227xY;
                    C179207xW.A00(c179207xW);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (!(this instanceof C180037yt)) {
            return;
        }
        C180037yt c180037yt = (C180037yt) this;
        Object obj = c180037yt.A05;
        Integer num = c180037yt.A07;
        InterfaceC176037sM interfaceC176037sM = c180037yt.A0F;
        Handler handler = c180037yt.A09;
        AbstractC178807ws abstractC178807ws = (AbstractC178807ws) obj;
        C14360o3.A0B(num, 0);
        C14360o3.A0B(interfaceC176037sM, 1);
        C14360o3.A0B(handler, 2);
        int intValue = num.intValue();
        if (intValue == 0) {
            C178307w4 c178307w4 = InterfaceC178337w7.A00;
            InterfaceC178207vu interfaceC178207vu2 = abstractC178807ws.A00;
            interfaceC178207vu2.getClass();
            InterfaceC178287w2 Aq1 = interfaceC178207vu2.Aq1(c178307w4);
            C14360o3.A07(Aq1);
            C178087vh c178087vh3 = InterfaceC179497xz.A01;
            InterfaceC178207vu interfaceC178207vu3 = abstractC178807ws.A00;
            interfaceC178207vu3.getClass();
            InterfaceC178067vf Aq0 = interfaceC178207vu3.Aq0(c178087vh3);
            C14360o3.A07(Aq0);
            C179537y3 c179537y3 = ((C179487xy) ((InterfaceC179497xz) Aq0)).A03.A07;
            C14360o3.A07(c179537y3);
            C178087vh c178087vh4 = InterfaceC179947yk.A00;
            InterfaceC178207vu interfaceC178207vu4 = abstractC178807ws.A00;
            interfaceC178207vu4.getClass();
            InterfaceC178067vf Aq02 = interfaceC178207vu4.Aq0(c178087vh4);
            C14360o3.A0C(Aq02, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.videocapture.internal.VideoCaptureControllerImpl");
            InterfaceC176007sJ interfaceC176007sJ = ((C180037yt) Aq02).A0A;
            C14360o3.A07(interfaceC176007sJ);
            C176117sU A00 = AbstractC225019wQ.A00(handler, interfaceC176007sJ, c179537y3, (InterfaceC178337w7) Aq1, interfaceC176037sM);
            C23467Aae c23467Aae = c180037yt.A0B;
            InterfaceC178337w7 interfaceC178337w7 = c180037yt.A0D;
            if (interfaceC178337w7 == null) {
                interfaceC178337w7 = (InterfaceC178337w7) ((AbstractC178657wd) c180037yt).A00.Aq1(c178307w4);
            }
            AGu aGu = c180037yt.A0E;
            c23467Aae.A00 = interfaceC178337w7;
            c23467Aae.A01 = aGu;
            C176117sU c176117sU = c23467Aae.A02;
            if (c176117sU != null) {
                Handler handler2 = c176117sU.A00;
                handler2.sendMessage(handler2.obtainMessage(5, new Object[0]));
            }
            c23467Aae.A02 = A00;
            return;
        }
        if (1 - intValue != 0) {
            str = "NORMAL";
        } else {
            str = "BOOMERANG";
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R("RecordingController type not supported: ", str));
    }

    @Override // X.InterfaceC178077vg
    public final void E50() {
        C02R.A07(this.A00, "Observer not initialized.");
        if (this instanceof C178217vv) {
            Iterator it = ((C178217vv) this).A00.iterator();
            while (it.hasNext()) {
                ((InterfaceC178077vg) it.next()).E50();
            }
        } else if (this instanceof C179767yQ) {
            C179767yQ c179767yQ = (C179767yQ) this;
            Object AqF = ((AbstractC179777yR) c179767yQ).A00.AqF(InterfaceC178617wZ.A00);
            if (AqF != null) {
                c179767yQ.A01.A01(AqF);
            }
        }
    }

    @Override // X.InterfaceC178077vg
    public final void ECK() {
        C02R.A07(this.A00, "Observer cannot reconfigure, not initialized.");
        if (this.A02) {
            if (this instanceof C178217vv) {
                Iterator it = ((C178217vv) this).A00.iterator();
                while (it.hasNext()) {
                    ((InterfaceC178077vg) it.next()).ECK();
                }
                return;
            }
            if (this instanceof C178647wc) {
                C178647wc c178647wc = (C178647wc) this;
                if (c178647wc.A00) {
                    C177257uL c177257uL = AbstractC174897qP.A00;
                    InterfaceC178207vu interfaceC178207vu = ((AbstractC178657wd) c178647wc).A00;
                    Number number = (Number) interfaceC178207vu.AqF(c177257uL);
                    if (number != null) {
                        c178647wc.A02.A08(number.intValue());
                    }
                    InterfaceC174637px interfaceC174637px = (InterfaceC174637px) interfaceC178207vu.AqF(AbstractC174897qP.A02);
                    if (interfaceC174637px != null) {
                        c178647wc.A02.A0C(interfaceC174637px);
                    }
                    InterfaceC174657pz interfaceC174657pz = (InterfaceC174657pz) interfaceC178207vu.AqF(AbstractC174897qP.A01);
                    if (interfaceC174657pz != null) {
                        c178647wc.A02.A06 = interfaceC174657pz;
                    } else {
                        c178647wc.A02.A06 = C178647wc.A00(interfaceC174637px);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC178077vg
    public final void EKd() {
        C02R.A07(this.A00, "Observer cannot resume, not initialized.");
        if (this.A02) {
            A08();
        }
    }

    @Override // X.InterfaceC178077vg
    public final void connect() {
        C02R.A07(this.A00, "Observer not initialized.");
        if (!this.A02) {
            this.A02 = true;
            if (this.A03) {
                A05();
                this.A01 = true;
            }
        }
    }

    @Override // X.InterfaceC178077vg
    public final void disconnect() {
        C02R.A07(this.A00, "Observer not initialized.");
        if (this.A02) {
            if (this.A01) {
                A06();
                this.A01 = false;
            }
            this.A02 = false;
        }
    }

    @Override // X.InterfaceC178077vg
    public final void pause() {
        C02R.A07(this.A00, "Observer cannot pause, not initialized.");
        if (this.A02) {
            A07();
        }
    }

    @Override // X.InterfaceC178077vg
    public final void release() {
        InterfaceC179867yc interfaceC179867yc;
        InterfaceC178677wf interfaceC178677wf;
        if (this.A00) {
            if (this instanceof C180107z0) {
                ((InterfaceC178817wt) ((AbstractC179807yU) this).A00.Aq0(InterfaceC178817wt.A01)).Eca(null);
            } else if (this instanceof C178217vv) {
                Iterator it = ((C178217vv) this).A00.iterator();
                while (it.hasNext()) {
                    ((InterfaceC178077vg) it.next()).release();
                }
            } else if (this instanceof C179797yT) {
                C179797yT c179797yT = (C179797yT) this;
                c179797yT.A00 = null;
                c179797yT.A01 = null;
            } else if (this instanceof BasicTouchGestureOutputController) {
                ((BasicTouchGestureOutputController) this).A01 = null;
            } else if (this instanceof BasicCameraOutputController) {
                BasicCameraOutputController basicCameraOutputController = (BasicCameraOutputController) this;
                C175007qa c175007qa = basicCameraOutputController.A04;
                if (c175007qa != null) {
                    c175007qa.A0N.EUe(null);
                }
                basicCameraOutputController.A04 = null;
            } else if (this instanceof C179767yQ) {
                C179767yQ c179767yQ = (C179767yQ) this;
                C175007qa c175007qa2 = c179767yQ.A00;
                if (c175007qa2 != null) {
                    InterfaceC174967qW interfaceC174967qW = c179767yQ.A02;
                    interfaceC174967qW.hashCode();
                    c175007qa2.A0M.A02(interfaceC174967qW);
                    interfaceC174967qW.DAc(c179767yQ.A00);
                    c179767yQ.A00 = null;
                }
                C178087vh c178087vh = InterfaceC178737wl.A00;
                InterfaceC178207vu interfaceC178207vu = ((AbstractC179777yR) c179767yQ).A00;
                if (interfaceC178207vu.CRY(c178087vh)) {
                    ((InterfaceC178737wl) interfaceC178207vu.Aq0(c178087vh)).EbX(null);
                }
                c179767yQ.A01.A00();
            } else if (this instanceof C179617yB) {
                C179617yB c179617yB = (C179617yB) this;
                c179617yB.A01 = null;
                c179617yB.A00 = null;
            } else if (this instanceof C178727wk) {
                C178727wk c178727wk = (C178727wk) this;
                c178727wk.A0O.A00();
                c178727wk.A0S = null;
            } else if (this instanceof C178687wg) {
                C178687wg c178687wg = (C178687wg) this;
                c178687wg.A05 = null;
                c178687wg.A04 = null;
                c178687wg.A06 = null;
            } else if (this instanceof C178647wc) {
                C178647wc c178647wc = (C178647wc) this;
                C178087vh c178087vh2 = InterfaceC179867yc.A00;
                if (((AbstractC178657wd) c178647wc).A00.CRY(c178087vh2)) {
                    ((InterfaceC179867yc) c178647wc.A0A(c178087vh2)).EG8(c178647wc.A01);
                }
                C175007qa c175007qa3 = c178647wc.A02;
                C174997qZ c174997qZ = c175007qa3.A0R;
                if (c175007qa3.A0S) {
                    c174997qZ.A01 = null;
                } else {
                    c174997qZ.A02 = null;
                }
                c178647wc.A03.release();
            } else if (this instanceof C178707wi) {
                ((C178707wi) this).A03 = null;
            } else if (this instanceof C179587y8) {
                C179587y8 c179587y8 = (C179587y8) this;
                C175887s2 c175887s2 = c179587y8.A02;
                if (c175887s2 != null) {
                    c175887s2.A05();
                    c175887s2.A04();
                }
                c179587y8.A03 = null;
                c179587y8.A02 = null;
            } else if (this instanceof C179557y5) {
                C179557y5 c179557y5 = (C179557y5) this;
                if (c179557y5.A0D != null) {
                    c179557y5.A0D.EFU(c179557y5.A06);
                }
                c179557y5.A0D = null;
                c179557y5.A0C = null;
            } else if (this instanceof C179737yN) {
                C179737yN c179737yN = (C179737yN) this;
                c179737yN.A0B.append("rel,");
                c179737yN.A0F = false;
                c179737yN.A04 = C05F.A15;
                if (c179737yN.A02 != null) {
                    if (c179737yN.A0C.get()) {
                        c179737yN.A09.ClA(new AbstractC223559ty(HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Component released while recording"), "recording_controller_error", "ArVideoCaptureCoordinator", "", "high", "release", c179737yN.hashCode());
                    }
                    c179737yN.A02.A01();
                    Handler handler = c179737yN.A02.A00;
                    handler.sendMessage(handler.obtainMessage(5, new Object[0]));
                }
                c179737yN.A07.release();
                c179737yN.A08.release();
                c179737yN.A02 = null;
                c179737yN.A03 = null;
                c179737yN.A04 = C05F.A1F;
            } else if (this instanceof C179717yL) {
                C179717yL c179717yL = (C179717yL) this;
                c179717yL.A04 = null;
                c179717yL.A02 = null;
                c179717yL.A03 = null;
            } else if (this instanceof C179697yJ) {
                ((C179697yJ) this).A00 = null;
            } else if (this instanceof C180127z2) {
                C180127z2 c180127z2 = (C180127z2) this;
                c180127z2.A00 = 0;
                List list = c180127z2.A02.A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C197368o7) list.get(i)).A03();
                }
            } else if (this instanceof C9NM) {
                C9NM c9nm = (C9NM) this;
                c9nm.A00 = null;
                c9nm.A02 = null;
            } else if (this instanceof C180157z5) {
                C180157z5.A00((C180157z5) this);
            } else if (this instanceof C212519bK) {
                ((C212519bK) this).A00 = null;
            } else if (this instanceof C210019Qo) {
                ((C210019Qo) this).A01 = null;
            } else if (this instanceof C180177z7) {
                C180177z7 c180177z7 = (C180177z7) this;
                c180177z7.A0J = null;
                c180177z7.A0E.A00();
                c180177z7.A0D.A00();
                c180177z7.A0B.post(new RunnableC24275Apg(c180177z7));
            } else if (this instanceof C212359b4) {
                C212359b4 c212359b4 = (C212359b4) this;
                C178087vh c178087vh3 = InterfaceC179867yc.A00;
                if (((AbstractC178657wd) c212359b4).A00.CRY(c178087vh3)) {
                    interfaceC179867yc = (InterfaceC179867yc) c212359b4.A0A(c178087vh3);
                    interfaceC178677wf = c212359b4.A02;
                    interfaceC179867yc.EG8(interfaceC178677wf);
                }
            } else if (this instanceof C180037yt) {
                C180037yt c180037yt = (C180037yt) this;
                InterfaceC178737wl interfaceC178737wl = c180037yt.A06;
                if (interfaceC178737wl != null) {
                    interfaceC178737wl.EGM(c180037yt.A0C);
                }
                C23467Aae c23467Aae = c180037yt.A0B;
                C176117sU c176117sU = c23467Aae.A02;
                if (c176117sU != null) {
                    Handler handler2 = c176117sU.A00;
                    handler2.sendMessage(handler2.obtainMessage(5, new Object[0]));
                }
                c23467Aae.A02 = null;
            } else if (this instanceof C180197z9) {
                C180197z9 c180197z9 = (C180197z9) this;
                InterfaceC178067vf A0A = c180197z9.A0A(InterfaceC179867yc.A00);
                C14360o3.A07(A0A);
                interfaceC179867yc = (InterfaceC179867yc) A0A;
                interfaceC178677wf = (InterfaceC178677wf) c180197z9.A05.getValue();
                interfaceC179867yc.EG8(interfaceC178677wf);
            }
            this.A03 = false;
            this.A00 = false;
            this.A01 = false;
        }
    }
}
