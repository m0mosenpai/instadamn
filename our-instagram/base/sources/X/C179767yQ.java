package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7yQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179767yQ extends AbstractC179777yR implements InterfaceC178617wZ {
    public C175007qa A00;
    public final C1814082s A01;
    public final InterfaceC174967qW A02;
    public final AtomicBoolean A03;

    @Override // X.AbstractC178227vw
    public final void A09() {
        C178087vh c178087vh = InterfaceC178667we.A00;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC179777yR) this).A00;
        C175007qa c175007qa = ((C178647wc) ((InterfaceC178667we) interfaceC178207vu.Aq0(c178087vh))).A02;
        this.A00 = c175007qa;
        InterfaceC174967qW interfaceC174967qW = this.A02;
        interfaceC174967qW.hashCode();
        c175007qa.A0M.A01(interfaceC174967qW);
        C178087vh c178087vh2 = InterfaceC178737wl.A00;
        if (interfaceC178207vu.CRY(c178087vh2)) {
            ((InterfaceC178737wl) interfaceC178207vu.Aq0(c178087vh2)).EbX(new C176307sn(this));
        }
    }

    @Override // X.InterfaceC178627wa
    public final C174907qQ BKY() {
        return InterfaceC178617wZ.A01;
    }

    public C179767yQ(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A01 = new C1814082s();
        this.A02 = new InterfaceC174967qW() { // from class: X.7rv
            @Override // X.InterfaceC174967qW
            public final /* synthetic */ void D7E(C175007qa c175007qa, String str, String str2) {
            }

            @Override // X.InterfaceC174967qW
            public final void D6q(C177447ue c177447ue, C175007qa c175007qa) {
                C179767yQ c179767yQ = C179767yQ.this;
                if (c179767yQ.A03.get()) {
                    List list = c179767yQ.A01.A00;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C174757qB c174757qB = ((C174777qD) list.get(i)).A00;
                        c174757qB.A02 = c177447ue;
                        if (c174757qB.A01 != null) {
                            Object A02 = c177447ue.A03.A02(AbstractC176797tb.A0q);
                            AbstractC184688Hj abstractC184688Hj = c174757qB.A01;
                            if (A02 == null) {
                                A02 = new C176877tj(0, 0);
                            }
                            abstractC184688Hj.A02(A02);
                            c174757qB.A01 = null;
                        }
                        InterfaceC1814282u interfaceC1814282u = c174757qB.A03;
                        if (interfaceC1814282u != null) {
                            interfaceC1814282u.DM7(c177447ue);
                        }
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC174967qW
            public final void D76(C177447ue c177447ue, C175007qa c175007qa) {
                C179767yQ c179767yQ = C179767yQ.this;
                if (c179767yQ.A03.compareAndSet(false, true)) {
                    List list = c179767yQ.A01.A00;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C174757qB c174757qB = ((C174777qD) list.get(i)).A00;
                        c174757qB.A02 = c177447ue;
                        if (c174757qB.A09) {
                            C178577wV c178577wV = c174757qB.A0G;
                            C174907qQ c174907qQ = C175847ry.A00;
                            C178187vs c178187vs = (C178187vs) c178577wV.A00;
                            C178187vs.A01(c178187vs);
                            ((InterfaceC178407wE) ((AbstractC179777yR) ((InterfaceC175837rx) ((InterfaceC178627wa) c178187vs.A02.A00(c174907qQ)))).A00.Aq1(InterfaceC178407wE.A00)).Cia(r7.hashCode(), "camera_swipe_to_open_finished", "BasicLoggingNotifier", null);
                            c174757qB.A09 = false;
                        }
                        if (c174757qB.A08) {
                            c174757qB.A08 = false;
                            ((InterfaceC179827yW) c174757qB.A0G.A02(InterfaceC179827yW.A00)).DIe();
                        }
                        if (c174757qB.A01 != null) {
                            Object A02 = c177447ue.A03.A02(AbstractC176797tb.A0q);
                            AbstractC184688Hj abstractC184688Hj = c174757qB.A01;
                            if (A02 == null) {
                                A02 = new C176877tj(0, 0);
                            }
                            abstractC184688Hj.A02(A02);
                            c174757qB.A01 = null;
                        }
                        InterfaceC1814282u interfaceC1814282u = c174757qB.A03;
                        if (interfaceC1814282u != null) {
                            interfaceC1814282u.DM7(c177447ue);
                        }
                        C174757qB.A04(c174757qB);
                        C17280tP A00 = C17280tP.A00();
                        AbstractC177717v5.A00 = ((Boolean) A00.A0F.CES(A00, C17280tP.A4G[111])).booleanValue() ? 1 : 0;
                    }
                }
            }

            @Override // X.InterfaceC174967qW
            public final void D7C(C175007qa c175007qa, Exception exc) {
                List list = C179767yQ.this.A01.A00;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C174777qD c174777qD = (C174777qD) list.get(i);
                    C0K8.A0F("OneCameraController", "mConnectionListener - onConnectionException: ", exc);
                    AbstractC12120kG.A07("OneCameraController", "onConnectionException()", exc);
                    C174757qB c174757qB = c174777qD.A00;
                    c174757qB.A09 = false;
                    AbstractC184688Hj abstractC184688Hj = c174757qB.A01;
                    if (abstractC184688Hj != null) {
                        abstractC184688Hj.A01(exc);
                        c174757qB.A01 = null;
                    }
                    InterfaceC1814282u interfaceC1814282u = c174757qB.A03;
                    if (interfaceC1814282u != null) {
                        interfaceC1814282u.DEf(exc);
                    }
                    C43822JZk A00 = AbstractC208269Jl.A00(c174757qB.A0J);
                    C14360o3.A0B(exc, 0);
                    C0J8.A01();
                    C0K8.A0F("ExtendedCreationSessionLogger", "oneCameraConnectionFailed", exc);
                    C24Q c24q = A00.A04;
                    if (c24q.A0E(585177486, A00.A00)) {
                        c24q.A0B(A00.A00, "camera_destination", String.valueOf(AnonymousClass229.A01(A00.A05).A0J()), false);
                        long j = A00.A00;
                        String message = exc.getMessage();
                        if (message == null) {
                            message = "one_camera_connection_failed";
                        }
                        A00.A00 = c24q.A07(message, "", 585177486, j);
                    }
                }
            }

            @Override // X.InterfaceC174967qW
            public final void DAc(C175007qa c175007qa) {
                C179767yQ c179767yQ = C179767yQ.this;
                if (c179767yQ.A03.compareAndSet(true, false)) {
                    List list = c179767yQ.A01.A00;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C174757qB c174757qB = ((C174777qD) list.get(i)).A00;
                        c174757qB.A09 = false;
                        C183348Bh A00 = AbstractC183338Bg.A00(c174757qB.A0J);
                        long j = A00.A06;
                        if (j != 838604519) {
                            A00.A06 = A00.A0K.A02(838604519, j);
                        }
                    }
                }
            }

            @Override // X.InterfaceC174967qW
            public final void DAd(C175007qa c175007qa, Exception exc) {
                C179767yQ c179767yQ = C179767yQ.this;
                if (c179767yQ.A03.compareAndSet(true, false)) {
                    List list = c179767yQ.A01.A00;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C174777qD c174777qD = (C174777qD) list.get(i);
                        AbstractC12120kG.A07("OneCameraController", "#onDisconnectionException()", exc);
                        c174777qD.A00.A09 = false;
                    }
                }
            }
        };
        this.A03 = new AtomicBoolean();
    }
}
