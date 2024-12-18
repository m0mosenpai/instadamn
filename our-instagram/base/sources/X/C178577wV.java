package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import java.util.Map;

/* renamed from: X.7wV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178577wV {
    public final InterfaceC178197vt A00;

    public final void A03() {
        this.A00.AJP(null);
    }

    public static void A00(FilterModel filterModel, C178577wV c178577wV) {
        InterfaceC199408rh interfaceC199408rh;
        C9NM c9nm = (C9NM) ((C9PE) c178577wV.A02(C9PE.A00));
        if (c9nm.A01 != filterModel && (interfaceC199408rh = c9nm.A02) != null) {
            c9nm.A01 = filterModel;
            c9nm.A03.A00 = interfaceC199408rh.B6U().A00(filterModel);
        }
    }

    public final InterfaceC179607yA A01(C175767rq c175767rq) {
        C178187vs c178187vs = (C178187vs) this.A00;
        C178187vs.A01(c178187vs);
        return (InterfaceC179607yA) c178187vs.A02.A00(c175767rq);
    }

    public final InterfaceC179817yV A02(C179837yX c179837yX) {
        C178187vs c178187vs = (C178187vs) this.A00;
        C178187vs.A01(c178187vs);
        return (InterfaceC179817yV) c178187vs.A02.A00(c179837yX);
    }

    public final void A04() {
        this.A00.disconnect();
    }

    public final boolean A08() {
        C178187vs c178187vs = (C178187vs) this.A00;
        if (c178187vs.A07 != 3 && c178187vs.A07 != 4) {
            return false;
        }
        return true;
    }

    public C178577wV(InterfaceC178197vt interfaceC178197vt) {
        this.A00 = interfaceC178197vt;
    }

    public final void A05() {
        if (A08()) {
            C178187vs c178187vs = (C178187vs) this.A00;
            synchronized (c178187vs) {
                if (c178187vs.A07 == 3) {
                    c178187vs.A07 = 4;
                    c178187vs.A01.pause();
                }
            }
            return;
        }
        throw new IllegalStateException("Cannot pause in a disconnected state");
    }

    public final void A06() {
        if (A08()) {
            C178187vs c178187vs = (C178187vs) this.A00;
            if (c178187vs.A07 == 4) {
                synchronized (c178187vs) {
                    if (c178187vs.A07 == 4) {
                        c178187vs.A01.EKd();
                        c178187vs.A07 = 3;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot resume in a disconnected state");
    }

    public final void A07(C177267uM c177267uM) {
        if (A08()) {
            C178187vs c178187vs = (C178187vs) this.A00;
            synchronized (c178187vs) {
                C178257vz c178257vz = c178187vs.A03;
                C178307w4 c178307w4 = InterfaceC178407wE.A00;
                ((InterfaceC178407wE) c178257vz.A00(c178307w4)).DEb(28);
                ((InterfaceC178407wE) c178257vz.A00(c178307w4)).Cwo(28, "action", "reconfigure");
                if (c178187vs.A07 == 3 || c178187vs.A07 == 4) {
                    c178187vs.A00 = c177267uM;
                    C177257uL c177257uL = C177267uM.A03;
                    Map map = c177267uM.A00;
                    c178257vz.A01((String) map.remove(c177257uL), (String) map.remove(C177267uM.A04), (String) map.remove(C177267uM.A01));
                    c178187vs.A01.ECK();
                }
                ((InterfaceC178407wE) c178257vz.A00(c178307w4)).DEW(28);
            }
            return;
        }
        throw new IllegalStateException("Cannot reconfigure in a disconnected state");
    }
}
