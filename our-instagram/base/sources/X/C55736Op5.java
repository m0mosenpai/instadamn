package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Op5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55736Op5 implements InterfaceC57797PkP, InterfaceC57798PkQ {
    public InterfaceC58273PsR A00;
    public volatile boolean A04 = true;
    public final C20030yX A03 = new C20030yX();
    public final C20030yX A02 = new C20030yX();
    public final C20030yX A01 = new C20030yX();

    public final void A01(C55132Obw c55132Obw) {
        C14360o3.A0B(c55132Obw, 0);
        if (this.A04) {
            Iterator it = this.A01.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(it);
                Class cls = (Class) A1K.getKey();
                Object value = A1K.getValue();
                C14360o3.A07(value);
                for (InterfaceC16660sJ interfaceC16660sJ : (Iterable) value) {
                    C14360o3.A0A(cls);
                    AbstractC167007dF.A1K(cls, interfaceC16660sJ);
                    if (c55132Obw.A03) {
                        synchronized (c55132Obw) {
                            C55132Obw.A02(this, cls, c55132Obw.A01, interfaceC16660sJ);
                        }
                    } else {
                        C55132Obw.A02(this, cls, c55132Obw.A01, interfaceC16660sJ);
                    }
                }
            }
            Iterator it2 = this.A02.entrySet().iterator();
            while (it2.hasNext()) {
                Object A0m = MSZ.A0m(it2);
                C14360o3.A07(A0m);
                Class cls2 = (Class) A0m;
                C14360o3.A0B(cls2, 0);
                if (c55132Obw.A03) {
                    synchronized (c55132Obw) {
                        C55132Obw.A01(this, cls2, c55132Obw.A00);
                    }
                } else {
                    C55132Obw.A01(this, cls2, c55132Obw.A00);
                }
            }
        }
    }

    public final void A02(C51732MtD c51732MtD) {
        Object invoke;
        C14360o3.A0B(c51732MtD, 0);
        Iterator it = this.A02.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(it);
            Object key = A1K.getKey();
            C14360o3.A07(key);
            Class cls = (Class) key;
            InterfaceC57797PkP interfaceC57797PkP = (InterfaceC57797PkP) A1K.getValue();
            if (interfaceC57797PkP != null) {
                A00(interfaceC57797PkP, c51732MtD, c51732MtD.A00(cls));
            }
        }
        Iterator it2 = this.A01.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(it2);
            Object key2 = A1K2.getKey();
            C14360o3.A07(key2);
            List<InterfaceC16660sJ> A19 = MSW.A19(A1K2);
            Object A00 = c51732MtD.A00((Class) key2);
            C14360o3.A0A(A19);
            for (InterfaceC16660sJ interfaceC16660sJ : A19) {
                InterfaceC57797PkP interfaceC57797PkP2 = (InterfaceC57797PkP) this.A03.get(interfaceC16660sJ);
                if (interfaceC57797PkP2 != null) {
                    if (A00 == null) {
                        invoke = null;
                    } else {
                        invoke = interfaceC16660sJ.invoke(A00);
                    }
                    A00(interfaceC57797PkP2, c51732MtD, invoke);
                }
            }
        }
        InterfaceC58273PsR interfaceC58273PsR = this.A00;
        if (interfaceC58273PsR != null) {
            interfaceC58273PsR.CP3(c51732MtD);
        }
    }

    public static final void A00(InterfaceC57797PkP interfaceC57797PkP, C51732MtD c51732MtD, Object obj) {
        if (!(interfaceC57797PkP instanceof C55736Op5)) {
            if (interfaceC57797PkP instanceof InterfaceC58272PsQ) {
                ((InterfaceC58272PsQ) interfaceC57797PkP).CP4(c51732MtD, obj);
                return;
            }
            if (interfaceC57797PkP instanceof C48220LVu) {
                InterfaceC16610sE interfaceC16610sE = ((C48220LVu) interfaceC57797PkP).A00;
                if (!(obj instanceof Integer)) {
                    obj = null;
                }
                interfaceC16610sE.invoke(c51732MtD, null, obj);
                return;
            }
            if (interfaceC57797PkP instanceof InterfaceC58273PsR) {
                ((InterfaceC58273PsR) interfaceC57797PkP).CP3(c51732MtD);
                return;
            }
            throw B4Z.A00();
        }
        throw AbstractC166987dD.A14("nested GranularSubscribers not supported");
    }

    public C55736Op5(InterfaceC58273PsR interfaceC58273PsR) {
        this.A00 = interfaceC58273PsR;
    }
}
