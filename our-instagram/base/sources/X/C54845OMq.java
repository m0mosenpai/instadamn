package X;

import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.OMq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54845OMq {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Surface A06;
    public InterfaceC57802PkU A07;
    public InterfaceC58164PqU A08;
    public AbstractC55198Oe5 A09;
    public InterfaceC58137Pq2 A0A;
    public InterfaceC58276PsU A0B;
    public InterfaceC58107PpW A0C;
    public InterfaceC58107PpW A0D;
    public InterfaceC58107PpW A0E;
    public InterfaceC57912PmI A0F;
    public LIV A0G;
    public ByteBuffer A0H;
    public ByteBuffer A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r5.A0B.isStreaming() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C54845OMq r5) {
        /*
            X.8ln r4 = X.AbstractC195978lm.A02
            java.lang.String r3 = "EventRepository.isPostingEnabled = isLive:"
            boolean r2 = r5.A0J
            java.lang.String r1 = " && isActive:"
            X.PsU r0 = r5.A0B
            boolean r0 = r0.isStreaming()
            java.lang.String r1 = X.AnonymousClass001.A1C(r3, r1, r2, r0)
            java.lang.String r0 = "sup:LiveMediaStreamController"
            r4.A01(r0, r1)
            X.LIV r0 = r5.A0G
            if (r0 == 0) goto L2b
            boolean r0 = r5.A0J
            if (r0 == 0) goto L28
            X.PsU r0 = r5.A0B
            boolean r1 = r0.isStreaming()
            r0 = 1
            if (r1 != 0) goto L29
        L28:
            r0 = 0
        L29:
            X.LIV.A04 = r0
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54845OMq.A00(X.OMq):void");
    }

    public final void A01() {
        InterfaceC58276PsU interfaceC58276PsU = this.A0B;
        if (interfaceC58276PsU.CWa()) {
            AbstractC195978lm.A02.A01("sup:LiveMediaStreamController", "Already initialized, returning");
            return;
        }
        interfaceC58276PsU.Egr(this.A0E);
        interfaceC58276PsU.EPz(this.A0C);
        interfaceC58276PsU.Een(this.A0F);
        interfaceC58276PsU.Eaf(this.A0A);
        interfaceC58276PsU.ETw(this.A0G);
        interfaceC58276PsU.Eem(this.A07);
        interfaceC58276PsU.CNZ();
        A04(new N1N(this, 0), "sup:LiveMediaStreamController_UPDATE_EVENT_REPOSITORY_ID");
    }

    public final void A02(int i) {
        int i2 = this.A00;
        if (i2 != i) {
            this.A00 = i;
            A00(this);
            this.A0B.DbL(i2, i);
        }
    }

    public final void A03(Surface surface) {
        this.A06 = surface;
        AbstractC195978lm.A02.A01("sup:LiveMediaStreamController", "Configuring new surface");
        this.A0B.AJI(surface);
    }

    public final void A04(AbstractC54847OMw abstractC54847OMw, String str) {
        InterfaceC58276PsU interfaceC58276PsU = this.A0B;
        interfaceC58276PsU.BRc().put(str, abstractC54847OMw);
        if (interfaceC58276PsU.AxG().get()) {
            abstractC54847OMw.A05();
        }
    }

    public final void A05(EnumC223469td enumC223469td) {
        InterfaceC58276PsU interfaceC58276PsU = this.A0B;
        if (interfaceC58276PsU.CWa()) {
            interfaceC58276PsU.CJw(enumC223469td);
        }
    }

    public final void A06(String str) {
        this.A0B.BRc().remove(str);
    }

    public final void A07(boolean z) {
        this.A0J = z;
        A00(this);
        InterfaceC58276PsU interfaceC58276PsU = this.A0B;
        if (z) {
            interfaceC58276PsU.DDm();
        } else {
            interfaceC58276PsU.DEp();
            interfaceC58276PsU.stop(true);
        }
    }
}
