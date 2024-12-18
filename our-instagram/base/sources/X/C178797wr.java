package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.7wr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178797wr extends AbstractC178807ws implements InterfaceC178817wt, InterfaceC178827wu {
    public static final LinkedHashMap A0B = new LinkedHashMap();
    public int A00;
    public final Handler A01;
    public final InterfaceC178837wv A02;
    public final C178747wm A03;
    public final InterfaceC178407wE A04;
    public final C178867wy A05;
    public final C178987xA A06;
    public final C179067xI A07;
    public volatile C80F A08;
    public volatile InterfaceC178977x9 A09;
    public volatile CountDownLatch A0A;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ca, code lost:
    
        if (A02(105) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00df, code lost:
    
        if (A02(107) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C178797wr(X.InterfaceC178207vu r8) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178797wr.<init>(X.7vu):void");
    }

    @Override // X.InterfaceC178827wu
    public final String B0u() {
        return "MediaGraphControllerImpl";
    }

    @Override // X.InterfaceC178817wt
    public final void EGn(Long l) {
        C179067xI.A00(this.A07, null);
    }

    public static final void A00(C178797wr c178797wr, C212369b5 c212369b5) {
        String str;
        InterfaceC178407wE interfaceC178407wE = c178797wr.A04;
        if (interfaceC178407wE != null) {
            Throwable cause = c212369b5.getCause();
            if (!(cause instanceof Error) && !(cause instanceof RuntimeException)) {
                str = "medium";
            } else {
                str = "high";
            }
            interfaceC178407wE.CkW(c212369b5, "media_pipeline_error", "MediaGraphControllerImpl", str, "MediaGraphControllerImpl", null, c178797wr.hashCode());
        }
    }

    public static final void A01(C178797wr c178797wr, InterfaceC179077xJ interfaceC179077xJ) {
        if ((interfaceC179077xJ instanceof C179107xM) && ((Boolean) c178797wr.A09(InterfaceC178107vj.A06, false)).booleanValue()) {
            interfaceC179077xJ = new C208849Ls((C179107xM) interfaceC179077xJ);
        }
        C178987xA c178987xA = c178797wr.A06;
        Handler handler = c178987xA.A01;
        if (handler.getLooper() != Looper.myLooper()) {
            handler.sendMessage(Message.obtain(c178987xA.A04.A00, 4, interfaceC179077xJ));
        } else {
            C178987xA.A00(interfaceC179077xJ, c178987xA);
        }
    }

    private final boolean A02(int i) {
        C178307w4 c178307w4 = InterfaceC178337w7.A00;
        InterfaceC178207vu interfaceC178207vu = super.A00;
        interfaceC178207vu.getClass();
        if (interfaceC178207vu.CRZ(c178307w4)) {
            InterfaceC178207vu interfaceC178207vu2 = super.A00;
            interfaceC178207vu2.getClass();
            InterfaceC178287w2 Aq1 = interfaceC178207vu2.Aq1(c178307w4);
            C14360o3.A07(Aq1);
            return ((InterfaceC178337w7) Aq1).CUZ(i);
        }
        return false;
    }

    @Override // X.InterfaceC178817wt
    public final C179067xI AMz() {
        C178747wm c178747wm = this.A03;
        C178987xA c178987xA = this.A06;
        return new C179067xI(new C179027xE(c178747wm, this.A04, c178987xA.A04), c178987xA);
    }

    @Override // X.InterfaceC178817wt
    public final int AZ1() {
        return this.A06.A04.A03.BZA();
    }

    @Override // X.InterfaceC178817wt
    public final C178747wm Ac3() {
        return this.A03;
    }

    @Override // X.InterfaceC178817wt
    public final C179067xI AwL() {
        return this.A07;
    }

    @Override // X.InterfaceC178817wt
    public final C178847ww B9v() {
        C178867wy c178867wy = this.A05;
        if (c178867wy != null) {
            return c178867wy.A01;
        }
        return null;
    }

    @Override // X.InterfaceC178817wt
    public final C178907x2 B9w() {
        C178907x2 c178907x2 = this.A06.A04;
        C14360o3.A07(c178907x2);
        return c178907x2;
    }

    @Override // X.InterfaceC178817wt
    public final C178867wy B9x() {
        return this.A05;
    }

    @Override // X.InterfaceC178817wt
    public final InterfaceC179037xF BQq() {
        InterfaceC179037xF interfaceC179037xF = this.A07.A00;
        C14360o3.A07(interfaceC179037xF);
        return interfaceC179037xF;
    }

    @Override // X.InterfaceC178817wt
    public final InterfaceC179077xJ BQr() {
        return this.A06.A00;
    }

    @Override // X.InterfaceC178817wt
    public final boolean CLu() {
        InterfaceC179077xJ interfaceC179077xJ = this.A06.A00;
        if (interfaceC179077xJ != null) {
            return interfaceC179077xJ.CLu();
        }
        return false;
    }

    @Override // X.InterfaceC178817wt
    public final void E3h() {
        C178947x6 c178947x6 = this.A06.A04.A06;
        C14360o3.A07(c178947x6);
        c178947x6.A00(this);
        Handler handler = c178947x6.A01;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    @Override // X.InterfaceC178817wt
    public final void EGZ(Long l) {
        this.A07.A02(l, false);
    }

    @Override // X.InterfaceC178817wt
    public final void EGa(Long l, boolean z) {
        this.A07.A02(l, z);
    }

    @Override // X.InterfaceC178817wt
    public final void EYp(InterfaceC179077xJ interfaceC179077xJ) {
        Handler handler = this.A01;
        if (!C14360o3.A0K(handler.getLooper(), Looper.myLooper())) {
            handler.post(new RunnableC24539Atw(this, interfaceC179077xJ));
        } else {
            A01(this, interfaceC179077xJ);
        }
    }

    @Override // X.InterfaceC178817wt
    public final void FBm(int i, int i2, int i3, boolean z, int i4, int i5) {
        this.A07.A01(i, i2, i3, z, i4, i5);
    }

    @Override // X.InterfaceC178817wt
    public final Handler getHandler() {
        return this.A01;
    }

    @Override // X.InterfaceC178817wt
    public final void Eca(C80F c80f) {
        this.A08 = c80f;
    }
}
