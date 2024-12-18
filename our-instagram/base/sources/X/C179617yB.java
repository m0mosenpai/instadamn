package X;

import android.media.MediaCodec;
import android.os.Handler;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7yB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C179617yB extends AbstractC178657wd implements InterfaceC179627yC {
    public C175997sI A00;
    public C176117sU A01;

    public AGI AMa(InterfaceC176157sY interfaceC176157sY, AGu aGu, File file) {
        Integer num;
        if (aGu == null || (num = aGu.A07) == null) {
            num = C05F.A0C;
        }
        return new AGI(null, file, null, num, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.7s1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.7s1, java.lang.Object] */
    @Override // X.AbstractC178227vw
    public final void A09() {
        C175887s2 c175887s2;
        C176117sU c176117sU;
        C176117sU c176117sU2;
        C176247sh c176247sh;
        C178307w4 c178307w4 = InterfaceC178297w3.A00;
        InterfaceC178207vu interfaceC178207vu = ((AbstractC178657wd) this).A00;
        Handler BAu = ((InterfaceC178297w3) interfaceC178207vu.Aq1(c178307w4)).BAu("Lite-Controller-Thread");
        C14360o3.A07(BAu);
        InterfaceC178287w2 Aq1 = interfaceC178207vu.Aq1(InterfaceC178407wE.A00);
        C14360o3.A07(Aq1);
        InterfaceC178407wE interfaceC178407wE = (InterfaceC178407wE) Aq1;
        InterfaceC178287w2 Aq12 = interfaceC178207vu.Aq1(InterfaceC178337w7.A00);
        C14360o3.A07(Aq12);
        final InterfaceC178337w7 interfaceC178337w7 = (InterfaceC178337w7) Aq12;
        InterfaceC178067vf A0A = A0A(InterfaceC179497xz.A01);
        C14360o3.A07(A0A);
        InterfaceC179497xz interfaceC179497xz = (InterfaceC179497xz) A0A;
        InterfaceC178067vf A0A2 = A0A(InterfaceC178737wl.A00);
        C14360o3.A07(A0A2);
        InterfaceC178737wl interfaceC178737wl = (InterfaceC178737wl) A0A2;
        C175997sI c175997sI = new C175997sI(interfaceC179497xz, interfaceC178737wl);
        interfaceC178737wl.AAS(c175997sI);
        C179537y3 c179537y3 = ((C179487xy) interfaceC179497xz).A03.A07;
        C14360o3.A07(c179537y3);
        C178087vh c178087vh = InterfaceC179597y9.A00;
        if (interfaceC178207vu.CRY(c178087vh)) {
            c175887s2 = ((C179587y8) ((InterfaceC179597y9) A0A(c178087vh))).A02;
        } else {
            c175887s2 = null;
        }
        if (this instanceof C176017sK) {
            C176017sK c176017sK = (C176017sK) this;
            C14360o3.A0B(interfaceC178407wE, 1);
            C14360o3.A0B(interfaceC178337w7, 2);
            if (c175887s2 != null) {
                C23416AZp c23416AZp = new C23416AZp();
                c176017sK.A00 = c23416AZp;
                final C176027sL c176027sL = new C176027sL(interfaceC178407wE);
                C176047sN c176047sN = new C176047sN(c175887s2.A0E, c175887s2, c179537y3, c175887s2.A0L, c175887s2.A0N);
                ?? obj = new Object();
                C176117sU c176117sU3 = new C176117sU(obj, c176027sL, new C176097sS(BAu, interfaceC178337w7, c176027sL));
                final Handler handler = c176117sU3.A01;
                c176117sU3.A04.A03 = new C176137sW(handler, interfaceC178337w7, c176027sL) { // from class: X.9bJ
                    public final AtomicInteger A00 = new AtomicInteger(4);

                    @Override // X.C176137sW
                    public final void A03(MediaCodec.BufferInfo bufferInfo, EnumC176237sg enumC176237sg, ByteBuffer byteBuffer) {
                        AtomicInteger atomicInteger;
                        EnumC176237sg enumC176237sg2;
                        if (this.A07.A05) {
                            int i = bufferInfo.flags;
                            if ((1048576 & i) != 0) {
                                atomicInteger = this.A00;
                                enumC176237sg2 = EnumC176237sg.SUPERNOVA_AUDIO;
                            } else if ((i & 2097152) != 0) {
                                atomicInteger = this.A00;
                                enumC176237sg2 = EnumC176237sg.AUDIO;
                            } else {
                                if (enumC176237sg.ordinal() == this.A00.get()) {
                                    return;
                                }
                                if (enumC176237sg == EnumC176237sg.SUPERNOVA_AUDIO) {
                                    enumC176237sg = EnumC176237sg.AUDIO;
                                }
                            }
                            atomicInteger.set(enumC176237sg2.ordinal());
                            return;
                        }
                        super.A03(bufferInfo, enumC176237sg, byteBuffer);
                    }

                    @Override // X.C176137sW
                    public final void A05(InterfaceC176157sY interfaceC176157sY, AGI agi, C22862A6i c22862A6i) {
                        EnumC176237sg enumC176237sg;
                        Integer num = agi.A03;
                        if (num != null) {
                            AtomicInteger atomicInteger = this.A00;
                            if (num == C05F.A00) {
                                enumC176237sg = EnumC176237sg.SUPERNOVA_AUDIO;
                            } else {
                                enumC176237sg = EnumC176237sg.AUDIO;
                            }
                            atomicInteger.set(enumC176237sg.ordinal());
                        }
                        super.A05(interfaceC176157sY, agi, c22862A6i);
                    }
                };
                c176117sU3.A03(new C176177sa(handler, c176047sN, interfaceC178337w7, obj, c176027sL));
                c176117sU3.A03(new C176247sh(handler, c175997sI, interfaceC178337w7, obj, c176027sL));
                c176247sh = c23416AZp;
                c176117sU2 = c176117sU3;
                c176117sU2.A03(c176247sh);
                c176117sU = c176117sU2;
            }
            c176117sU = AbstractC225019wQ.A00(BAu, c175997sI, c179537y3, interfaceC178337w7, new C176027sL(interfaceC178407wE));
        } else {
            C14360o3.A0B(interfaceC178407wE, 1);
            C14360o3.A0B(interfaceC178337w7, 2);
            if (c175887s2 != null) {
                C176027sL c176027sL2 = new C176027sL(interfaceC178407wE);
                C176047sN c176047sN2 = new C176047sN(c175887s2.A0E, c175887s2, c179537y3, c175887s2.A0L, c175887s2.A0N);
                ?? obj2 = new Object();
                C176117sU c176117sU4 = new C176117sU(obj2, c176027sL2, new C176097sS(BAu, interfaceC178337w7, c176027sL2));
                Handler handler2 = c176117sU4.A01;
                c176117sU4.A04.A03 = new C176137sW(handler2, interfaceC178337w7, c176027sL2);
                c176117sU4.A03(new C176177sa(handler2, c176047sN2, interfaceC178337w7, obj2, c176027sL2));
                c176247sh = new C176247sh(handler2, c175997sI, interfaceC178337w7, obj2, c176027sL2);
                c176117sU2 = c176117sU4;
                c176117sU2.A03(c176247sh);
                c176117sU = c176117sU2;
            }
            c176117sU = AbstractC225019wQ.A00(BAu, c175997sI, c179537y3, interfaceC178337w7, new C176027sL(interfaceC178407wE));
        }
        this.A01 = c176117sU;
        this.A00 = c175997sI;
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        C178087vh c178087vh = InterfaceC179627yC.A00;
        C14360o3.A08(c178087vh);
        return c178087vh;
    }
}
